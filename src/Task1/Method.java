package Task1;

import java.io.File;
import java.io.IOException;

public class Method {

        public static void createFile(String Path, String Name){
            java.io.File file = new java.io.File(Path + Name);
            try{
                boolean createdFile = file.createNewFile();
                if (file.exists()) {
                    System.out.println("File created");
                }
            } catch (IOException ex) {
                System.out.println("File not created");
            }

        }

    public static void renameFile(String Path, String Name, String newName){
        java.io.File file1 = new java.io.File(Path + Name);
        java.io.File file2 = new java.io.File(Path + newName);
        if (file1.renameTo(file2)){
            System.out.println("File renamed");
        } else {
            System.out.println("File not renamed");
        }
    }


    public static void deleteFile(String Path, String Name){
        java.io.File file = new java.io.File(Path +  Name);
        boolean deletedFile = file.delete();
        if (deletedFile) {
            System.out.println("File deleted");
        } else {
            System.out.println("File not deleted");
        }
    }


        public static void copyFile(String Path, String Name, String Path2){
                java.io.File file = new java.io.File(Path +  Name);
                java.io.File newFile = new java.io.File(Path2  + Name);
                if (file.renameTo(newFile)){
                    System.out.println("File copied");
                } else {
                    System.out.println("File not copied");
                }
            }
        }


