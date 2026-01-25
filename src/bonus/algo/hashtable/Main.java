package bonus.algo.hashtable;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        String source = "CACABABABCCCAABAC";

        System.out.println(hasRepeats(source, 4)); // true, тк ABAB встречается два раза, хоть эти куски и пересекаются
        System.out.println(hasRepeats(source, 5)); // false
    }

    /*Непосредственно домашнее задание:*/
    public static boolean hasRepeats(String source, int size) {
        Set<LazyString> slices = new HashSet<>(); // множество всех подстрок длины size
        LazyString prev = null; // переменная для сохранения предыдущей подстроки
        for (int i = 0; i <= source.length() - size; i++) { // перебор всех мест старта подстроки
            LazyString slice; // вырезание подстроки
            if (prev == null) {
                // первую подстроку создаём конструктором за линейную асимптотику
                // ВАШ КОД
            } else {
                // все остальные через сдвиг вправо от предыдущей подстроки, за O(1)
                // ВАШ КОД
            }
            if (slices.contains(slice)) { // проверка на наличие повтора этой подстроки
                return true; // если уже встречали, значит повторы нет
            } else {
                slices.add(slice);  // иначе запоминаем подстроку и перебираем дальше
            }
            prev = slice; // не забываем обновить переменную для предыдущей подстроки для следующей итерации цикла
        }
        return false; // если бы нашли, то вышли бы по return true, а значит повторов нет
    }

    // Решил самостоятельно написать наивный вариант решения задачи.
//    public static boolean hasRepeats(String source, int size) {
//
//        List<String> slices = new ArrayList<>(); // список для подстрок
//
//        // Наполняем список подстроками
//        for (int i = 0; i <= source.length() - size; i++) {
//            slices.add(i, source.substring(i, i + size));
//        }
//
//        // проверяем каждую подстроку списка до второго совпадения.
//
//        for (int i = 0; i < slices.size(); i++) {
//            String slice1 = slices.get(i);
//            for (int j = i + 1; j < slices.size(); j++) {
//                if (slice1.equals(slices.get(j))) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//

    /* Реализация на hashSet */
//    public static boolean hasRepeats(String source, int size) {
//
//        Set<String> set = new HashSet<>();
//
//        for (int i = 0; i < source.length() - size; i++) {
//            String subString = source.substring(i, i + size);
//            if (set.contains(subString)) {
//                return true;
//            } else {
//                set.add(subString);
//            }
//        }
//        return false;
//    }


}
