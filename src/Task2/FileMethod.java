package Task2;

import java.io.File;

public class FileMethod {

    public static void recursion(File file, int depth) {

        for (int i = 0; i < depth; i++)
            System.out.print("-");
        System.out.println(file.getName());

        depth++;

        if (file.isDirectory()) {
            for (File file1 : file.listFiles()) {
                recursion(file1, depth);
            }
        }
    }
}

