import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        EmpresaMensajeria empresaMensajeria = new EmpresaMensajeria();

        empresaMensajeria.RegistrarPaquete(new PaqueteEnvio("123",32,new EnvioEstandar()));

        empresaMensajeria.reporte();
        int  opcion;
        do{
            System.out.println("1. ");
            System.out.println("2. ");
            System.out.println("3. ");
            System.out.println("4. ");
            opcion = sc.nextInt();
        }while(opcion!=4);
        sc.close();


    }
}