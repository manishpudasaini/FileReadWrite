package javaPractice;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileWrite {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\welcome\\Desktop\\git code\\git.txt");

        //FileReader fileReader = new FileReader(file);

        ArrayList list = new ArrayList<>();

        Scanner sc = new Scanner(file);
        String gitCode;

        while (sc.hasNext()){
            gitCode = sc.nextLine();
            list.add(gitCode);
        }
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }


        //to write the file

        File file1 = new File("C:\\Users\\welcome\\Desktop\\git code\\git_copy.txt");
        file1.createNewFile();
        FileWriter fileWrite = new FileWriter(file1,true);

        fileWrite.write(String.valueOf(list));
        fileWrite.flush();
        fileWrite.close();

        System.out.println("FIle write sucessfully");






    }
}
