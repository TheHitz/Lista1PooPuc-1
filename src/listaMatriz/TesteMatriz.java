import java.util.Scanner;

public class TesteMatriz
{
    public static void main(String[] args) {
        int M[][] = new int[6][6];
        int i;
        int j;
        int x = 36;
        int C[][] = new int[6][6];
        int v[] = new int[36];
        
        Scanner input = new Scanner(System.in);
        
                
        //Fazer Matriz M
        for(i = 0; i < 6; i++){
            for(j = 0; j < 6; j++){
                M[i][j] = (int)(Math.random()* 10);
                
            }
        }
        
        //Mostrar Matriz M
        System.out.println("Matriz M:");
        for(i = 0; i < 6; i++){
            for(j = 0; j < 6; j++){
                System.out.printf(M[i][j] + "\t");
                
            }
            System.out.println("\n");
        }
        
         System.out.println("Digite o valor de A:");
         int A = input.nextInt();
         
         //Fazer Martriz C(Matriz M * A)
         for(i = 0; i < 6; i++){
            for(j = 0; j < 6; j++){
                
                C[i][j] = M[i][j] * A;
                System.out.printf(C[i][j] + "\t");
         
            }
             System.out.println("\n");
             
        }   
         
         //Mostrar Matriz C como vetor[36]
         System.out.println("Matriz[6][6] em vetor[36]:");
         System.out.println("Vetor[36]");
          for(i = 0; i < 6; i++){
            for(j = 0; j < 6; j++){
               System.out.print(M[j][i] + " ");
         
            }
             
     }
     
     }

}
