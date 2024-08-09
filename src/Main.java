import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
 //se declaran las variables
        int a,b,c;

 // se solicitan los numeros
        System.out.println("Ingrese un numero (A)");
        Scanner scanerNumeroA = new Scanner(System.in);
        a = scanerNumeroA.nextInt();

        System.out.println("Ingrese un numero (B)");
        Scanner scanerNumeroB = new Scanner(System.in);
        b = scanerNumeroB.nextInt();

        System.out.println("Ingrese un numero (C)");
        Scanner scanerNumeroC = new Scanner(System.in);
        c = scanerNumeroC.nextInt();

   // se valida que los numeros no sean iguales
   if (a==b | b==c | a==c) {
       System.out.println("No puede haber numeros repetidos, por favor vuelve a ingresar numeros diferentes");
        }
    else {
        if (a>b | a>c ){
            System.out.println( a + "es el número mayor");
        }
        else if (a<b |a<c) {
            System.out.println( a + "es el número menor");
        }
       if (b>a | b>c ){
           System.out.println( b + "es el número mayor");
       }
       else if (b<a |b<c) {
           System.out.println( b + "es el número menor");
       }
       if (c>a | c>b ){
           System.out.println( c + "es el número mayor");
       }
       else if (c<a |c<b) {
           System.out.println( c + "es el número menor");
       }
        }
    }
}