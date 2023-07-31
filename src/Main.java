import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
       int[][] matris = {
               {1, 2, 3},
               {4, 5, 6}
       };

       int[][] transpoze = transpozunuAl(matris);

        System.out.println("Matris : ");
        matrisiYazdir(matris);

        System.out.println("\nTranspoze : ");
        matrisiYazdir(transpoze);
    }

    public static int[][] transpozunuAl(int[][] matris) {
        int satirSayisi = matris.length;
        int sutunSayisi = matris[0].length;

        int[][] transpoze = new int[sutunSayisi][satirSayisi];

        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                transpoze[j][i] = matris[i][j];
            }
        }

        return transpoze;
    }

    public static void matrisiYazdir(int[][] matris) {
        for (int i = 0; i < matris.length; i++) {
            System.out.println(Arrays.toString(matris[i]));
        }
    }
}