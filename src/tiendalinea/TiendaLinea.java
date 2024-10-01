package TiendaLinea;
//Importamos la clase Scanner para poder recibir la entrada del usuario desde la consola.
import java.util.Scanner;
//Declaramos una clase llamada TiendaRopa. Esta clase contendrá el método que Permitirá generar una boleta de venta basada en las selecciones del usuario.
public class TiendaLinea {
    public static void main (String [] args){
      new TiendaLinea().imprimirBoleta();
    }
    // El método imprimirBoleta es donde se desarrolla toda la lógica para mostrar el menú, recibir las opciones del usuario y calcular el total de la compra.
    // Se crea una instancia de Scanner llamada sc para poder recibir las entradas del usuario.
    public void imprimirBoleta() {
        Scanner sc = new Scanner(System.in);
    //Se imprime el menú de opciones para que el usuario elija qué prenda desea comprar.
    //Cada opción tiene un número asociado (1-5) y un precio correspondiente a cada producto.    
        System.out.println("***** TIENDA DE ROPA ONLINE *****");
        System.out.println("Elegir una opcion para comprar:");
        System.out.println("1. Camiseta - $20");
        System.out.println("2. Pantalon - $40");
        System.out.println("3. Chaqueta - $60");
        System.out.println("4. Zapatos - $50");
        System.out.println("5. Salir sin comprar");
     //opcion: Variable que almacenará la opción seleccionada por el usuario.
     //total: Variable que acumulará el costo total de la compra.
     //detalleCompra: Variable que guarda una cadena con el detalle de los productos comprados.
        int opcion;
        double total = 0;
        String detalleCompra = "";
     //Se inicia un ciclo do-while que continuará hasta que el usuario seleccione la opción 5 para salir.
     //El programa pide una opción y la guarda en la variable opcion.
        do {
            System.out.println("Selecciona una opcion (5 para finalizar):");
            opcion = sc.nextInt();
     //Dependiendo de la opción ingresada, se ejecuta el caso correspondiente:
     //Camiseta (1): Se suma $20 al total y se añade al detalle de la compra.
     //Pantalón (2): Se suma $40 al total y se añade al detalle de la compra.
     //Chaqueta (3): Se suma $60 al total y se añade al detalle de la compra.
     //Zapatos (4): Se suma $50 al total y se añade al detalle de la compra.
     //Salir (5): Termina el ciclo al salir de la tienda.
     //Si el usuario ingresa una opción inválida, se muestra un mensaje indicándolo.
            switch(opcion) {
                case 1:
                    System.out.println("Has seleccionado Camiseta");
                    total += 20;
                    detalleCompra += "Camiseta - $20\n";
                    break;
                case 2:
                    System.out.println("Has seleccionado Pantalón");
                    total += 40;
                    detalleCompra += "Pantalón - $40\n";
                    break;
                case 3:
                    System.out.println("Has seleccionado Chaqueta");
                    total += 60;
                    detalleCompra += "Chaqueta - $60\n";
                    break;
                case 4:
                    System.out.println("Has seleccionado Zapatos");
                    total += 50;
                    detalleCompra += "Zapatos - $50\n";
                    break;
                case 5:
                    System.out.println("Finalizando la compra...");
                    break;
                default:
                    System.out.println("Opcion no valida, intenta nuevamente.");
            }
     //do: Inicia el bloque de código que se va a ejecutar al menos una vez, sin evaluar inicialmente la condición.
     //opcion != 5: Esta es la condición que mantiene el ciclo activo. El ciclo continuará ejecutándose mientras la 
     //opción seleccionada por el usuario sea diferente de 5.    
        } while(opcion != 5);
         //Al finalizar el ciclo, si el total es mayor a 0 (es decir, si se realizó alguna compra), 
         //se imprime la boleta con el detalle de los productos comprados y el total a pagar.
         //Si el usuario no seleccionó ningún producto y eligió salir, se muestra el mensaje "No se realizó ninguna compra  
        if (total > 0) {
            System.out.println("\n***** BOLETA DE VENTA *****");
            System.out.println(detalleCompra);
            System.out.println("Total a pagar: $" + total);
            System.out.println("Gracias por su compra.");
        } else {
            System.out.println("No se realizó ninguna compra.");
        }
    }
}
//El método imprimirBoleta termina, y así también la clase TiendaRopa. La boleta está 
//diseñada para ser sencilla y eficaz en su propósito de simular una compra en una tienda de ropa.
