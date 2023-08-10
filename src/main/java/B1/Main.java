package B1;
import java.util.Scanner;
//Deben desarrolla un software que calcule el menor de 2 numero declarados anteriormente.
//Deben desarrolla un software que calcule su edad a partir del anio de nacimiento
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número entero: ");
        int num = sc.nextInt();
        System.out.print("Ingresa un número entero: ");
        int num2 = sc.nextInt();
        if(num<num2){
            System.out.println(num+" Es menor que "+num2);
        }
        else if (num>num2){
            System.out.println(num2+" Es menor que "+num);
        }else{
            System.out.println(num2+" Es igual a "+num);        }

        System.out.println("Ingrese su año de nacimiento: ");
        int year = sc.nextInt();
        System.out.println("Ingrese el año actual: ");
        int actual=sc.nextInt();
        int total=0;
        total=actual-year;
        System.out.println("Su edad en el año "+actual+" es:"+total);
    }
}
