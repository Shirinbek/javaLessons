package lessons;

import java.io.FileNotFoundException;

public class Exception {
    public static String name;
    public static void main(String[] args) {
        try {
            readFile(null);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void readFile(String path) throws FileNotFoundException{
        if (path == null){
            throw new FileNotFoundException();
        }
    }
}
