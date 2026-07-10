import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        EmpresaMensajeria empresaMensajeria = new EmpresaMensajeria();

        int  opcion;

        boolean seguir = true;

        while (seguir){
            System.out.println();
            System.out.println("======== MENU PRINCIPAL ============");
            System.out.println("1. Nuevo envio ");
            System.out.println("2. Reporte");
            System.out.println("0. SALIR.");
            System.out.println("--------------------------------");
            System.out.print("Seleccione una Opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion){
                case 0 :
                    seguir =false;
                    break;

                case 1:
                    System.out.println("===== NUEVO ENVIO ========");
                    System.out.println();
                    System.out.print("Destinatario: ");
                    String destino = sc.nextLine();
                    System.out.print("Peso: ");
                    double peso = sc.nextInt();
                    System.out.print("(1. express / 2. Estandar / 3. Internacional) - Tipo de Envio : ");
                    int tipo = sc.nextInt();

                    switch (tipo){
                        case 1:
                            empresaMensajeria.RegistrarPaquete(new PaqueteEnvio(destino,peso,new EnvioExpress()));
                            break;

                        case 2:
                            empresaMensajeria.RegistrarPaquete(new PaqueteEnvio(destino, peso, new EnvioEstandar()));
                            break;

                        case 3:
                            empresaMensajeria.RegistrarPaquete(new PaqueteEnvio(destino, peso, new EnvioInternacional()));
                            break;

                        default:
                            System.out.println("- Opcion Invalida - Intente De Nuevo -");
                    }
                    break;

                case 2:
                    empresaMensajeria.reporte();
                    break;

                default:
                    System.out.println("- Opcion Invalida - Intente De Nuevo -");
            }
        }


    }
}