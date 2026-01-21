package bonus.algo.stack;

import java.lang.reflect.Array;

public class LinkedStack {
    private Node tail; // ссылка на последний добавленный узел (обёртку)
    private int size; // размер стека, т.е. количество элементов в нём

    public void push(int value) {
        Node node = new Node(value); // создаём новый узел
        if (tail != null) { // если в стеке уже есть элементы
            node.setPrev(tail); // связываем новый узел с последним
        }
        tail = node; // назначаем новый узел последним узлом
        size++; // увеличиваем счётчик элементов
    }

    public int pop() {
        // ваш код
        // возьмите value из последнего узла
        // назначьте предыдущий к последнему узлу последним узлом
        int value = tail.getValue();

        if (size > 1) {
            tail = tail.getPrev();
        } else {
            tail = null;
        }

        size--;

        return value;
    }

    public int getSize() {
        // ваш код
        // верните размер стека
        return size;
    }

    public boolean isEmpty() {
        // ваш код
        // верните ответ на вопрос, не пустой ли стек
        return size == 0;
    }

    public String toString() {
        // если есть элементы, пройдитесь по связному списку,
        // выводя элементы.
        // вывод должен быть в точности как в комментариях к main
        // при этом этот метод не должен менять стек!

        int[] arr = new int[size];
        StringBuilder sb = new StringBuilder();

        if (size > 1) {
            Node currentNode = tail;

            for (int i = 0; i < arr.length - 1; i++) {
                sb.append(String.format("%d -> ", currentNode.getValue()));
                currentNode = currentNode.getPrev();
            }
            sb.append(currentNode.getValue());

        } else if (size == 1) {
            return String.valueOf(tail.getValue());
        } else {
            return "EMPTY";
        }
        return sb.toString();
    }
}

