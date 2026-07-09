import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean SEGUIR = true;

        while (SEGUIR){
            System.out.println("=========== MENU PRINCIPAL ==============");
            System.out.println("1. Nuevo Paquete.");
            System.out.println("2. Nuevo Envio.");
            System.out.println("3. Reporte.");
            System.out.println("0. SALIR.");
            System.out.println("-----------------------------------------");
            System.out.print("Seleccione una Opcion: ");
            int opc = sc.nextInt();
            sc.nextLine();

            System.out.println();

            switch (opc){
                case 0:
                    SEGUIR = false;
                    break;

                case 3:
                    System.out.println("============= REPORTE ================");

            }
        }


    }
}