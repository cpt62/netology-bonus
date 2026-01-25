package bonus.algo.hashtable;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        String source = "CACABABABCCCAABAC";

        System.out.println(hasRepeats(source, 4)); // true, тк ABAB встречается два раза, хоть эти куски и пересекаются
        System.out.println(hasRepeats(source, 5)); // false
    }

    /*
    // Решил самостоятельно написать наивный вариант решения задачи.
    public static boolean hasRepeats(String source, int size) {

        List<String> slices = new ArrayList<>(); // список для подстрок

        // Наполняем список подстроками
        for (int i = 0; i <= source.length() - size; i++) {
            slices.add(i, source.substring(i, i + size));
        }

        // проверяем каждую подстроку списка до второго совпадения.

        for (int i = 0; i < slices.size(); i++) {
            String slice1 = slices.get(i);
            for (int j = i + 1; j < slices.size(); j++) {
                if (slice1.equals(slices.get(j))) {
                    return true;
                }
            }
        }
        return false;
    }
     */

    public static boolean hasRepeats(String source, int size) {
        //...
    }

}
