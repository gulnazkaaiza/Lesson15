package Task1;

public class Main {
        public static void main(String[] args) {
            Method.createFile("/Users/gulnaz/IdeaProjects/Lesson15/", "Test1.txt");
            Method.renameFile("Users/gulnaz/IdeaProjects/Lesson15/", "Test2.txt", "Test3.txt");
            Method.deleteFile("Users/gulnaz/IdeaProjects/Lesson15/", "Test1.txt");
            Method.copyFile("Users/gulnaz/IdeaProjects/Lesson15/","Test3.txt", "Users/gulnaz/IdeaProjects/Less13/");

        }
    }

