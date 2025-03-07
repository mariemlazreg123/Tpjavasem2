import java.util.Scanner;
public class TpN7{
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nl;
        do {
            System.out.print("Entrez le nombre de lignes (nl < 50) : ");
            nl = sc.nextInt();
        } while (nl <= 0 || nl >= 50);
        int nc;
        do {
            System.out.print("Entrez le nombre de colonnes (nc < 50) : ");
            nc = sc.nextInt();
        } while (nc <= 0 || nc >= 50);
        int[][]M = new int [nl][nc];
        System.out.println("entrer les elements de tableau :");
        for (int i=0 ; i < nl ;i++){
            for (int j=0 ; j < nc ; j++){
                Systeme.out.println("M[" + i + "][" + j + "] = ");
                M[i][j]=sc.nextInt();
            }
        }
        int X;
            do{
                System.out.print("entrez un entier paire X : ");
                X=sc.nextInt();
            } 
            while (X % 2 != 0);
        boolean existe = false;
        for (int i = 0 ; i<nl ; i++){
            for (int j = 0 ; j<nc ; j++){
                if (M[i][j]==X){
                    existe = true ; 
                     break;
                }
            }
            if ( existe ) break ;
        }
        if ( existe ) {
            System.out.println("X n existe pas dans le tableau.")
        }
       sc.close()
    }
}