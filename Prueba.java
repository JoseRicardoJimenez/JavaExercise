import java.util.Scanner;

public class Prueba {

    public int diagonalsuma(String corner) {
        int aux = 0;
        int suma = 0;
        int matriz[][] = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};

        switch (corner) {
            case "a":
                for (int x = 0; x < matriz.length; x++) {
                    for (int y = 0; y < matriz[x].length; y++) {
                        if (matriz[x] == matriz[y]) {
                            aux = matriz[x][y];
                            System.out.println("dato: "+aux);
                        }
                    }
                    suma = suma + aux; /*Tengo un error Aqui wey!*/
                }
                break;
            case "b":
                for (int x = 0; x < matriz.length; x++) {
                    for (int y = 0; y < matriz[x].length; y++) {
                        if (x + y == matriz.length - 1) {
                            aux = matriz[x][y];
                            System.out.println("dato: "+aux);
                        }
                    }
                    suma = suma + aux;
                }
                break;
            case "c":
                for (int x = 2; x > -1; x--) {
                    for (int y = 0; y < matriz[x].length; y++) {
                        if (x + y == matriz.length - 1) {
                            aux = matriz[x][y];
                            System.out.println("dato: "+aux);
                        }
                    }
                    suma = suma + aux;
                }
                break;
            case "d":
                for (int x = 2; x > -1; x--) {
                    for (int y = 2; y > -1; y--) {
                        if (matriz[x] == matriz[y]) {
                            aux = matriz[x][y];
                            System.out.println("dato: "+aux);
                        }
                    }
                    suma = suma + aux;
                }
                break;
        }
        return suma;
    }

    public static void main(String[] args) {
        /*int matriz [][] = {{1,2,3},{1,2,3},{1,2,3}};
        int impresion, suma=0,aux=0;
        for( int x = 0; x<matriz.length;x++){
                    for(int y = 0; y<matriz[x].length;y++){
                        if(matriz[x]==matriz[y]){
                            aux=matriz[x][y];
                        }
                    }
                    suma=suma+aux;
                    System.out.println(suma);
                }*/

        Scanner ing = new Scanner(System.in);
        Prueba obj = new Prueba();
        String corner = null;
        int opc = 0;

        do {
            System.out.println("Presione '1' para continuar ó '2' para salir");
            opc = ing.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Write the corner a/b/c/d: ");
                    corner = ing.next();
                    int suma = obj.diagonalsuma(corner);
                    System.out.println("suma total de la diagonal: "+suma);
                    break;
                case 2:
                    System.out.println("SELECCIONO SALIR");
            }
        } while (opc != 2);

    }

}