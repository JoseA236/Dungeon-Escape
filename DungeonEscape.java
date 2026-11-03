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
        System.out.println();

        System.out.println();
        Boolean haRecogidoLaLlave = false;
        while (haRecogidoLaLlave == false) {
            intentos ++;

            System.out.println("¿Qué quieres hacer?");

            if (intentos > 1) {
                System.out.println("Frente a ti hay una puerta de hierro y una llave oxidada.");
            }
            
            accion = scanner.nextLine();
            System.out.println("Has elegido: " + accion);
            accion = accion.strip();

            if (accion.equalsIgnoreCase("Mirar puerta") || accion.equalsIgnoreCase("Inspeccionar puerta")) {
                System.out.println("La puerta se ve desgastada y vieja.");
                System.out.println("Tiene una cerradura.");
                System.out.println("Parece que necesitas una llave...");
            } else if (accion.equalsIgnoreCase("Recoger llave") || accion.equalsIgnoreCase("Agarrar llave")) {
                System.out.println("Te acercas y recoges la llave.");
                System.out.println("Está oxidada.");
                System.out.println("Parece que podría ir en algún sitio...");
                haRecogidoLaLlave = true;
            } else {
                System.out.println("No sabes cómo hacer eso.");
            }

        }

    }
}
