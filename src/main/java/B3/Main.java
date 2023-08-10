package B3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Realizar un menu con 3 opciones, 1 va ha realizar un login  y ese login debe pedir usuario y pass.
        // si lo pone 3 veces mal la informacion debe decir usuario bloqueado
        System.out.println("Bienvenido al menu por favor eliga alguna de la siguientes opciones");
        System.out.println("1.Crear usuario");
        System.out.println("2.Olvide mi usuario");
        System.out.println("3.login");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número entero: ");
        int num = sc.nextInt();
        int fail = 0;
        String u="user";
        String p="123";
        while (fail < 3) {
            switch (num) {
                case 1:
                    System.out.print("Será redirigido al sitio ");
                    break;
                case 2:
                    System.out.print("Será redirigido al sitio ");
                    break;
                case 3:
                    System.out.print("Ingresa su nombre de usuario: ");
                    String user = sc.next();
                    System.out.print("Ingresa su contraseña: ");
                    String pass = sc.next();

                    if (user.equals(u)  && pass.equals(p) ) {
                        System.out.print("Bienvenido");
                    }
                    else {
                        fail = fail + 1;

                    }
                    break;
                default:
                    System.out.print("Opción no valida");
            }
            if (fail == 3) {
                System.out.print("Usuario bloqueado");
            }
        }
    }
}
