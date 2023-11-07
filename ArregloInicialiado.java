package arregloinicialiado;

public class ArregloInicialiado {

    public static void main(String[] args) {
        String[][] nombres = {
            {"Messi", "Ronaldo", "Renegul"},
            {"AnuelBrr", "Reniza", "TumbadosCt"},
            {"Nata", "Gabito", "JIJIJA"}

        };
        //Leer
        for (int i = 0; i < nombres.length; i++) { // Filas
            for (int j = 0; j < nombres[i].length; j++) { // Columnas
                System.out.print(nombres[i][j] + " $ ");
            }
            System.out.println();
        }
    }

}
