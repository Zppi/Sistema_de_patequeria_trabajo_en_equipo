import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        EmpresaMensajeria empresaMensajeria = new EmpresaMensajeria();

        empresaMensajeria.RegistrarPaquete(new PaqueteEnvio("123",32,new EnvioEstandar()));

        empresaMensajeria.reporte();

    }
}