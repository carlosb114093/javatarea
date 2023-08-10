package B2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                System.out.print("Ingresa un número entero: ");
        int num = sc.nextInt();
        List<Integer> par = new ArrayList<>();
        List<Integer> impar = new ArrayList<>();

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0){
                par.add(i);
            }else{
                impar.add(i);
            }
    }
        System.out.println("Los numeros pares son: ");
        for (int pp : par) {
            System.out.println(pp);
        }
        System.out.println("Los numeros impares son: ");
        for (int p : impar) {
            System.out.println(p);
        }
    }
}
