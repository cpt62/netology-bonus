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

        /* Ну, поехали! ...Теперь с рекурсией */
        /* Объявляем ArrayDeque для проверки узлов на соответствие target */
        ArrayDeque<Vertex> deque = new ArrayDeque<>(); // Компилятор ругается на raw type, дженерик хочет!
        /*Добавляем смежные узлы в deque*/
        deque.addAll(v.getAdjacent());
        /*Поочередно достаем узел из deque и проверяем на target*/
        while (!deque.isEmpty()) {
            Vertex checkVertex = deque.removeFirst();
            /*если есть в посещенных узлах, достаем следующий узел для проверки*/
            if (visited.contains(checkVertex)) continue;
            // для проверки рекурсивно вызываем метод
            if (dfsFind(checkVertex, target, visited)) return true;
        }
        return false;
    }

}

