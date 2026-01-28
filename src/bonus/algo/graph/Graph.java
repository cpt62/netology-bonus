package bonus.algo.graph;

import java.util.*;

public class Graph<T> {
    private List<Vertex<T>> vertices = new ArrayList<>();

    public Vertex<T> createVertex(T value) {
        Vertex<T> v = new Vertex<>(value);
        vertices.add(v);
        return v;
    }

    public void createEdge(Vertex<T> a, Vertex<T> b) {
        // добавляем их друг друга в их списки смежности
        // ВАШ КОД
        // Филипп, извиняюсь, если я тут схалтурил конткретно! Иного пути не увидел.
        a.addAdjacent(b);
        b.addAdjacent(a);
    }

    public boolean isConnected(Vertex<T> a, Vertex<T> b) {
        return dfsFind(a, b, new HashSet<>()); // рекурсивный обход в глубину
    }

    // метод отвечает на вопрос, нашли ли мы обходом из v вершину target с учётом
    // посещённых вершин, которые записаны в visited
    private boolean dfsFind(Vertex<T> v, Vertex<T> target, Set<Vertex<T>> visited) {
        // если вершина в которую зашли (v) это та которую мы искали (target), то поиск закончен
        if (v.equals(target)) {
            return true; // нашли
        }
        visited.add(v); // запоминаем вершину которую посетили

        // ВАШ КОД
        // перебираем все смежные вершины у v
        // если такую вершину ещё не посещали, заходим рекурсивно в неё
        // если такой заход завершился нахождением target-а - выходим из метода с true

        /* Ну, поехали! */
        /* Вершина v - добавляем ее сразу в множество посещенных, а её соседей в очередь? Попробую со Stack */

        ArrayDeque<Vertex> deque = new ArrayDeque<>(); // Компилятор ругается на raw type, дженерик хочет !
        if (v.getAdjacent().contains(target)) return true; // Если в списке соседних узлов значится target -> нашли
        deque.addAll(v.getAdjacent());       // Добавляем в Stack список связностей
        /* Пока стек не пустой - loop */
        while (!deque.isEmpty()) {
            Vertex checkVertex = deque.removeFirst(); // удаляем из стека, возвращая значения с целью дальнейшей проверки.
            if (checkVertex.getAdjacent().size() == 1 && target == checkVertex.getAdjacent().get(0)) { // если в списке соседних узлов значится один элемент, проверим его наличие во множестве
                return true;
            }
            List<Vertex> list = checkVertex.getAdjacent();  // инициализируем список для дальнейшей проверки
            /*Тут стрим направшивается, но я слабо их помню*/
            for (Vertex vertex : list) {                    // проверяем каждый элемент списка соседних узлов
                if (vertex.equals(target)) return true;     // нашли
                visited.add(vertex);                        // иначе - в стек
            }
        }

        return false; // ничего не нашли
    }

}

