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
        System.out.println("¿Qué quieres hacer?");

        String accion = scanner.nextLine();
        System.out.println("Has elegido: " + accion);

        if (accion.equals("Mirar puerta")) {
            System.out.println("La puerta se ve desgastada y vieja.");
            System.out.println("Tiene una cerradura.");
            System.out.println("Parece que necesitas una llave...");
        } else if (accion.equals("Recoger llave")) {
            System.out.println("Te acercas y recoges la llave.");
            System.out.println("Está oxidada.");
            System.out.println("Parece que podría ir en algún sitio...");
        } else {
            System.out.println("No sabes cómo hacer eso.");
        }
    }
}

