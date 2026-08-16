package File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        File f =new File("C:\\practice java\\file");
        f.mkdir();
        File f1 =new File("C:\\practice java\\file\\file1\\file2");
        f1.mkdirs();
        File f2=new File("C:\\practice java\\file\\fail.text");
        f2.createNewFile();
        File f3=new File("C:\\practice java\\file\\fail.pdf");
        f3.createNewFile();
        File f4=new File("C:\\practice java\\file\\fail.doc");
        f4.createNewFile();

        FileWriter fw=new FileWriter(f2);
//        FileWriter fw=new FileWriter("C:\\practice java\\file\\fail.text");
        fw.write("java program run " +
                "hello welcome to all" +
                "\n how are you " +
                "\t i am fine");
        fw.close();

        FileReader fr=new FileReader(f2);
        int a;
        while((a=fr.read())!=-1){
            char b=(char)a;
            System.out.println(b);
        }

        Scanner sc=new Scanner(f2);
        while (sc.hasNext()){
            System.out.println(sc.next());
        }

        System.out.println(f2.exists());
        System.out.println(f2.getName());
        System.out.println(f2.getAbsolutePath());
        System.out.println(f2.canExecute());
        System.out.println(f2.canRead());
        System.out.println(f2.canWrite());

//        f2.delete();
    }
}
