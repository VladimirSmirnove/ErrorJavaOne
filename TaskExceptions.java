
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TaskExceptions {

    public static void main(String[] args) {
    ReadFile();
    Arithmetic();
    ArrayFind();
    }
    public static void ReadFile() {
        File file = new File ("fgh");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        }   
    }
    public static void Arithmetic() {
        int a = 5;
        int b = 0;
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println(e.toString());
        }
    }
    public static void ArrayFind () {
        try {
            int a[] = new int[2];
            System.out.println("Access element three :" + a[3]);
         } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }
    }
}
