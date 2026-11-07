
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner lea = new Scanner(System.in);

        int opcion;

        String[] lote = {"Jeans AirFlex", "Graphic Tee", "Denim Jacket", null, null};

do { 
    System.out.println("bienvenido, por favor ingrese una opcion ");
            System.out.println("1. Listar colección en bodega");
            System.out.println("2. Buscar referencia en lote");
            System.out.println("3. Ingresar prenda al lote");
            System.out.println("4. Salir");
            opcion = lea.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Listado de prendas en bodega:");
                    for (int i = 0; i < lote.length; i++) {
                        if (lote[i] != null) {
                            System.out.println((i + 1) + ". " + lote[i]);
                        }
                    }
                    break;
                    case 2: 
                    System.out.println("Ingrese el nombre de la prenda a buscar:");
                    String buscar = lea.next();

                    boolean resultado = buscarReferencia(lote, buscar);
                    if ( resultado ==true){
                        System.out.println("la prenda se encuentra en el lote ");
                    } else {
                        System.out.println("la prenda no se encuentra en el lote");
                    }
                    break;
            }  case 3:
            
        
            

            
} while (true);
    

    }

        public static boolean buscarReferencia(String[] lote, String nombreBuscado) {
        boolean encontrada = false;

        for (int i = 0; i < lote.length; i++) {
            if (lote[i] != null) {
                if (lote[i].equals(nombreBuscado)) {
                    encontrada = true;
                }
            }
        }

        return encontrada;
    }
}
