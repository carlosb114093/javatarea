package B4;
import java.util.Scanner;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        // Realizar un programa que divida 2 numeros, si la divicion tiene indeterminacion capturar el error.
        //Si el usuario ingresa algo que no sea un numero, capturar el error, si el usuario envia un valor vacio,
        //capturar el error, el programa no debe terminar hasta que el usuario lo decida.
        Scanner sc = new Scanner(System.in);
        Float div= (float) 0;
        int siguiente=0;
        do{
        try {
        String num = JOptionPane.showInputDialog("Ingresa un número entero: ");
        String num2 = JOptionPane.showInputDialog("Ingresa un número entero: ");
        Float num3= Float.parseFloat(num);
        Float num4= Float.parseFloat(num2);
        div=num3/num4;
        if(num4>0.0){
        System.out.println("El resultado es: "+div);
            siguiente = 1;
        }else{
            System.out.println("Error aritmético.\n"+ "Pulse  0 par continuar,1 para salir");
            siguiente = sc.nextInt();
        }

        } catch (ArithmeticException e) {
            System.out.println("Error aritmético.\n"+ "Pulse  0 par continuar,1 para salir");
            siguiente = sc.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Debe ingresar un número.\n"+ "Pulse  0 par continuar,1 para salir");
            siguiente = sc.nextInt();
               }
        catch (NumberFormatException pex) {
            System.out.println("El valor de la variable no es válido intente nuevamente.\n"+ "Pulse  0 par continuar,1 para salir");
            siguiente = sc.nextInt();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        }while(siguiente ==0);
    }
}
