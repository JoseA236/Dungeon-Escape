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

        String action;
        int attempts = 0;

        Boolean hasPickedUpKey = false;

        while (hasPickedUpKey == false) {
            attempts++;

            System.out.println();
            if (attempts > 1) {
                System.out.println("Frente a ti hay una puerta de hierro y una llave oxidada.");
            }

            System.out.println("¿Qué quieres hacer?");
            action = scanner.nextLine();

            System.out.println("Has elegido: " + action);
            action = action.strip();

            if (action.equalsIgnoreCase("Mirar puerta") || action.equalsIgnoreCase("Inspeccionar puerta")
                    || action.equalsIgnoreCase("Observar") || action.equalsIgnoreCase("Observar puerta")) {
                System.out.println();
                System.out.println("La puerta se ve desgastada y vieja.");
                System.out.println("Tiene una cerradura.");
                System.out.println("Parece que necesitas una llave...");
            } else if (action.equalsIgnoreCase("Recoger llave") || action.equalsIgnoreCase("Agarrar llave")
                    || action.equalsIgnoreCase("Recoger la llave") || action.equalsIgnoreCase("Agarrar la llave")) {
                System.out.println();
                System.out.println("Te acercas y recoges la llave.");
                System.out.println("Está oxidada.");
                System.out.println("Parece que podría ir en algún sitio...");
                hasPickedUpKey = true;
            } else if (action.equalsIgnoreCase("Abrir puerta") || action.equalsIgnoreCase("Abrir la puerta")
                    || action.equalsIgnoreCase("Salir") || action.equalsIgnoreCase("Meter la llave")
                    || action.equalsIgnoreCase("Meter la llave en la puerta")
                    || action.equalsIgnoreCase("Poner la llave en la puerta")) {
                System.out.println();
                System.out.println("Todavía no puedes hacer eso.");
                System.out.println("La puerta está cerrada con llave.");
            } else {
                System.out.println();
                System.out.println("No sabes cómo hacer eso.");
                System.out.println();
            }

        }

        Boolean hasOpenedDoor = false;

        while (hasOpenedDoor == false) {
            System.out.println("¿Qué quieres hacer?");
            action = scanner.nextLine();
            action = action.strip();

            if (action.equalsIgnoreCase("Observar") || action.equalsIgnoreCase("Observar la puerta")
                    || action.equalsIgnoreCase("Observar puerta")) {
                System.out.println("La puerta se ve oxidada.");
                System.out.println("Te acercas y ves una ranura en la cerradura.");
            } else if (action.equalsIgnoreCase("Abrir puerta") || action.equalsIgnoreCase("Quitar llave a la puerta")
                    || action.equalsIgnoreCase("Abrir la puerta")) {
                System.out.println();
                System.out.println("Te acercas a la puerta e insertas la llave en la cerradura.");
                System.out.println("Escuchas un clic...");
                System.out.println("¡La puerta se abre!");
                System.out.println();
                System.out.println("¡HAS ESCAPADO DE LA CELDA!");
                System.out.println("No será tan fácil la próxima vez...");
                System.out.println();
                hasOpenedDoor = true;
            }

        }

        Boolean hasChosenPath = false;
        attempts = 0;
        String chosenPath = "";
        while (hasChosenPath == false) { 
    
            if (attempts == 0) {
                
                System.out.println("Avanzas y observas que frente a ti hay dos caminos.");
                System.out.println("A tu izquierda hay un pasillo, por el que entra una corriente de aire.");
                System.out.println("A tu derecha hay unas escaleras, que descienden hacia la oscuridad.");
            } else if (attempts >= 1) {
                System.out.println("A tu izquierda hay un pasillo por donde se siente una ligera brisa.");
                System.out.println("A tu derecha hay unas escaleras oscuras, y no alcanzas a ver donde terminan.");
            }
            attempts ++;

            System.out.println("¿Hacia dónde quiers ir?");
            action = scanner.nextLine();
            System.out.println("Has elegido: " + action);
            action = action.strip();

            if (action.equalsIgnoreCase("Ir a la derecha") || action.equalsIgnoreCase("Bajar las escaleras") || action.equalsIgnoreCase("Derecha") || action.equalsIgnoreCase("Bajar") || action.equalsIgnoreCase("A la derecha")) {

                hasChosenPath = true;
                chosenPath = "stairs";
            } else if (action.equalsIgnoreCase("Ir a la izquierda") || action.equalsIgnoreCase("Entrar al pasillo") || action.equalsIgnoreCase("Ir al pasillo") || action.equalsIgnoreCase("Izquierda") || action.equalsIgnoreCase("A la izquierda")) {

                hasChosenPath = true;
                chosenPath = "hallway";
            } else {
                System.out.println("No puedes hacer eso. Debes de ir por uno de los caminos.");
            }

            if (chosenPath.equals("stairs")) {

                System.out.println("Bajas las escaleras oscuras con mucho cuidado.");
                System.out.println("A medida que bajas, ves más y más oscuro.");
                System.out.println("Ya no ves nada. Te detienes.");
                System.out.println("Sigues quieto hasta que escuchas un leve quejido a la distancia.");
                System.out.println("¿Continúas?");
                
                action = scanner.nextLine();
                action = action.strip();

                if (action.equalsIgnoreCase("Si") || action.equalsIgnoreCase("Sí") || action.equalsIgnoreCase("Continúo") || action.equalsIgnoreCase("Continuo")) {
                    System.out.println("Sigues bajando hasta llegar al fondo de las escaleras.");
                    System.out.println("Avanzas por el pasillo. Los quejidos se van haciendo más fuertes.");
                    System.out.println("De pronto ves una luz débil. Caminas hacia ella.");
                    System.out.println("Al acercarte reconoces que es una antorcha.");
                    System.out.println();
                    System.out.println("Estás por agarrarla cuando escuchas una voz.");
                    System.out.println("Está detrás de ti...");
                    System.out.println("¡Hey, tú!");
                    System.out.println("¿Qué haces?");


                }

            
            } else if (chosenPath.equalsIgnoreCase("hallway")) {

                System.out.println("Te adentras por el pasillo.");
                System.out.println("Su brisa es cada vez más fuerte.");
                System.out.println("Hay pequeñas antorchas iluminando el camino.");
                System.out.println("Al final del pasillo ves una puerta abierta.");
                System.out.println("Sigues y entras en el jardín.");
                System.out.println("¿Qué haces?");

            }




        }

        scanner.close();
    }
}
