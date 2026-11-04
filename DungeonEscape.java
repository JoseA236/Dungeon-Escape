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
            intentos++;

            System.out.println();
            if (intentos > 1) {
                System.out.println("Frente a ti hay una puerta de hierro y una llave oxidada.");
            }

            System.out.println("¿Qué quieres hacer?");
            accion = scanner.nextLine();

            System.out.println("Has elegido: " + accion);
            accion = accion.strip();

            if (accion.equalsIgnoreCase("Mirar puerta") || accion.equalsIgnoreCase("Inspeccionar puerta")
                    || accion.equalsIgnoreCase("Observar") || accion.equalsIgnoreCase("Observar puerta")) {
                System.out.println();
                System.out.println("La puerta se ve desgastada y vieja.");
                System.out.println("Tiene una cerradura.");
                System.out.println("Parece que necesitas una llave...");
            } else if (accion.equalsIgnoreCase("Recoger llave") || accion.equalsIgnoreCase("Agarrar llave")
                    || accion.equalsIgnoreCase("Recoger la llave") || accion.equalsIgnoreCase("Agarrar la llave")) {
                System.out.println();
                System.out.println("Te acercas y recoges la llave.");
                System.out.println("Está oxidada.");
                System.out.println("Parece que podría ir en algún sitio...");
                haRecogidoLaLlave = true;
            } else if (accion.equalsIgnoreCase("Abrir puerta") || accion.equalsIgnoreCase("Abrir la puerta")
                    || accion.equalsIgnoreCase("Salir") || accion.equalsIgnoreCase("Meter la llave")
                    || accion.equalsIgnoreCase("Meter la llave en la puerta")
                    || accion.equalsIgnoreCase("Poner la llave en la puerta")) {
                System.out.println();
                System.out.println("Todavía no puedes hacer eso.");
                System.out.println("La puerta está cerrada con llave.");
            } else {
                System.out.println();
                System.out.println("No sabes cómo hacer eso.");
                System.out.println();
            }

        }

        Boolean haAbiertoLaPuerta = false;

        while (haAbiertoLaPuerta == false) {
            System.out.println("¿Qué quieres hacer?");
            accion = scanner.nextLine();
            accion = accion.strip();

            if (accion.equalsIgnoreCase("Observar") || accion.equalsIgnoreCase("Observar la puerta")
                    || accion.equalsIgnoreCase("Observar puerta")) {
                System.out.println("La puerta se ve oxidada.");
                System.out.println("Te acercas y ves una ranura en la cerradura.");
            } else if (accion.equalsIgnoreCase("Abrir puerta") || accion.equalsIgnoreCase("Quitar llave a la puerta")
                    || accion.equalsIgnoreCase("Abrir la puerta")) {
                System.out.println();
                System.out.println("Te acercas a la puerta e insertas la llave en la cerradura.");
                System.out.println("Escuchas un clic...");
                System.out.println("¡La puerta se abre!");
                System.out.println();
                System.out.println("¡HAS ESCAPADO DE LA CELDA!");
                System.out.println("No será tan fácil la próxima vez...");
                System.out.println();
                haAbiertoLaPuerta = true;
            }

        }

        Boolean haElegidoCamino = false;
        intentos = 0;
        String caminoElejido = "";
        while (haElegidoCamino == false) { 
    
            if (intentos == 0) {
                
                System.out.println("Avanzas y observas que frente a ti hay dos caminos.");
                System.out.println("A tu izquierda hay un pasillo, por el que entra una corriente de aire.");
                System.out.println("A tu derecha hay unas escaleras, que descienden hacia la oscuridad.");
            } else if (intentos >= 1) {
                System.out.println("A tu izquierda hay un pasillo por donde se siente una ligera brisa.");
                System.out.println("A tu derecha hay unas escaleras oscuras, y no alcanzas a ver donde terminan.");
            }
            intentos ++;

            System.out.println("¿Hacia adonde quiers ir?");
            accion = scanner.nextLine();
            System.out.println("Has elegido: " + accion);
            accion = accion.strip();

            if (accion.equalsIgnoreCase("Ir a la derecha") || accion.equalsIgnoreCase("Bajar las escaleras") || accion.equalsIgnoreCase("Derecha") || accion.equalsIgnoreCase("Bajar") || accion.equalsIgnoreCase("A la derecha")) {

                haElegidoCamino = true;
                caminoElejido = "Bajar las escaleras.";
            } else if (accion.equalsIgnoreCase("Ir a la izquierda") || accion.equalsIgnoreCase("Entrar al pasillo") || accion.equalsIgnoreCase("Ir al pasillo") || accion.equalsIgnoreCase("Izquierda") || accion.equalsIgnoreCase("A la izquierda")) {

                haElegidoCamino = true;
                caminoElejido = "Entrar al pasillo.";
            } else {
                System.out.println("No puedes hacer eso. Debes de ir por uno de los caminos.");
            }

            if (caminoElejido.equals("Bajar las escaleras.")) {

                System.out.println("Bajas las escaleras oscuras con mucho cuidado.");
                System.out.println("A medida que bajas, ves más y más oscuro.");
                System.out.println("Ya no ves nada. Te detienes.");
                System.out.println("Sigues quieto hasta que escuchas un leve quejido a la distancia.");
                System.out.println("¿Continúas?");
                
                accion = scanner.nextLine();
                accion = accion.strip();

                if (accion.equalsIgnoreCase("Si") || accion.equalsIgnoreCase("Sí") || accion.equalsIgnoreCase("Continúo") || accion.equalsIgnoreCase("Continuo")) {
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

            
            } else if (caminoElejido.equalsIgnoreCase("Entrar al pasillo.")) {

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
