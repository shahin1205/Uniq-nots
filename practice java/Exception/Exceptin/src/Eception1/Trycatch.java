package Eception1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Trycatch {
    public static void main(String[] args) {

        try{
            Scanner sc=new Scanner(System.in);
            int b =sc.nextInt();
            int a= 10/b;
            System.out.println(a);
        }
        catch (ArithmeticException e){
            System.out.println(e);
            System.out.println("give numarical value");
        }
        catch (InputMismatchException e){
            System.out.println(e);
            System.out.println("give the valide input");
        }
        catch(Exception d){
            System.out.println("Exception handeled");
        }
        finally {
            System.out.println("closing....");
        }
    }
}
