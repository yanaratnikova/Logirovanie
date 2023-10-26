package Task4;

import java.io.File;
import java.io.FileWriter;

public class WR {
        public static void main(String[] args) {
        System.out.println("Start read and write");
        String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        try {
            File file = new File("test1.txt");
            FileWriter writer = new FileWriter(file);
            writer.write(str);
            writer.flush();
            writer.close();
        }catch (Exception e){
            e.printStackTrace();
        }



    }
    
}
