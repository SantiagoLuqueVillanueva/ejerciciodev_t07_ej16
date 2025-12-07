public class App {
    public static void main(String[] args) throws Exception {
        int[] main = new int[20];

        for (int i = 0; i < main.length; i++) {
            main[i] = (int)(Math.random()*401);
            System.out.print(main[i] + " ");
        }

        System.out.println("¿Que números quiere resaltar?");
        System.out.println("1) los múltiplos de 5");
        System.out.println("2) los múltiplos de 7");
        int opcion = Integer.parseInt(System.console().readLine("Elije una opción: "));

        switch (opcion) {
            case 1:
                for (int i = 0; i < main.length; i++) {
                    if (main[i] % 5 == 0) {
                        System.out.print("[" + main[i] + "] ");
                    } else {
                        System.out.print(main[i] + " ");
                    }
                }
                break;

            case 2:
                for (int i = 0; i < main.length; i++) {
                    if (main[i] % 7 == 0) {
                        System.out.print("[" + main[i] + "] ");
                    } else {
                        System.out.print(main[i] + " ");
                    }
                }
                break;
        
            default:
                break;
        }
    }
}
