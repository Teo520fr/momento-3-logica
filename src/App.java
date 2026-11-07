
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

            switch (opcion) {}
            
} while (true);
    

    }
}
