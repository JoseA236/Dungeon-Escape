import java.util.Scanner;

public class DungeonEscape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=============================");
        System.out.println("    DUNGEON ESCAPE");
        System.out.println("=============================");

        System.out.println();
        System.out.println("Despiertas en una celda abandonada. No recuerdas cómo llegaste ahí...");
        System.out.println("Frente a ti hay una puerta de hierro cerrada y una pequeña llave oxidada en el suelo.");
        System.out.println();

        String accion;
        int intentos = 0;

        Boolean haRecogidoLaLlave = false;

        while (haRecogidoLaLlave == false) {
            intentos ++;

            System.out.println();
            if (intentos > 1) {
                System.out.println("Frente a ti hay una puerta de hierro y una llave oxidada.");
            }

            System.out.println("¿Qué quieres hacer?");
            accion = scanner.nextLine();

            
            System.out.println("Has elegido: " + accion);
            accion = accion.strip();

            if (accion.equalsIgnoreCase("Mirar puerta") || accion.equalsIgnoreCase("Inspeccionar puerta") || accion.equalsIgnoreCase("Observar") || accion.equalsIgnoreCase("Observar puerta")) {
                System.out.println();
                System.out.println("La puerta se ve desgastada y vieja.");
                System.out.println("Tiene una cerradura.");
                System.out.println("Parece que necesitas una llave...");
            } else if (accion.equalsIgnoreCase("Recoger llave") || accion.equalsIgnoreCase("Agarrar llave") || accion.equalsIgnoreCase("Recoger la llave") || accion.equalsIgnoreCase("Agarrar la llave")) {
                System.out.println();
                System.out.println("Te acercas y recoges la llave.");
                System.out.println("Está oxidada.");
                System.out.println("Parece que podría ir en algún sitio...");
                haRecogidoLaLlave = true;
            } else if (accion.equalsIgnoreCase("Abrir puerta") || accion.equalsIgnoreCase("Abrir la puerta") || accion.equalsIgnoreCase("Salir") || accion.equalsIgnoreCase("Meter la llave") || accion.equalsIgnoreCase("Meter la llave en la puerta") || accion.equalsIgnoreCase("Poner la llave en la puerta") ) {
                System.out.println();
                System.out.println("Todavía no puedes hacer eso.");
                System.out.println("La puerta está cerrada con llave.");
            }else {
                System.out.println();
                System.out.println("No sabes cómo hacer eso.");
                System.out.println();
            }
            
        }

        Boolean haAbiertoLaPuerta = false;
        if (haRecogidoLaLlave = true){
            while (haAbiertoLaPuerta == false) {
                System.out.println("¿Qué quieres hacer?");
                accion = scanner.nextLine();
                accion = accion.strip();

                if (accion.equalsIgnoreCase("Observar") || accion.equalsIgnoreCase("Observar la puerta") || accion.equalsIgnoreCase("Observar puerta")) {
                    System.out.println("La puerta se ve oxidada.");
                    System.out.println("Te acercas y ves una ranura en la cerradura.");
                } else if (accion.equalsIgnoreCase("Abrir puerta") || accion.equalsIgnoreCase("Quitar llave a la puerta") || accion.equalsIgnoreCase("Abrir la puerta")) {
                    System.out.println();
                    System.out.println("Te acercas a la puerta e insertas la llave en la cerradura.");
                    System.out.println("Escuchas un clic...");
                    System.out.println("¡La puerta se abre!");
                    System.out.println();
                    System.out.println("¡HAS ESCAPADO DE LA CELDA!");
                    System.out.println("No será tan fácil la próxima vez...");
                    haAbiertoLaPuerta = true;
                }

                }
            }

        


    }
}
