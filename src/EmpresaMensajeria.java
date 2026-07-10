import java.util.ArrayList;

public class EmpresaMensajeria {
    ArrayList<Paquete>paquetes = new ArrayList<>();

    public void RegistrarPaquete(Paquete paquete){
        paquetes.add(paquete);
    }

    public void reporte (){
        double total =0;
        if (paquetes.isEmpty()){
            System.out.println();
            System.out.println("- SIN REGISTROS -");

            return;
        }

        for (Paquete paquete : paquetes){

            paquete.infoPaquete();
            total += paquete.costoEnvio();

        }
        System.out.println("...................................");
        System.out.println("TOTAL RECAURADO: $"+total);
    }
}
