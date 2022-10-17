
public class Matrices {
    public static void main(String[] args){
        
        /*
        String[][] string_matrix = {
                {"12343", "sda"},
                {"ssassa", "prueba", "casa"},
                {"arbol",},
        };
        
        String[][] posta = new String[2][1];
        
        System.out.println(string_matrix[0][0]);
        */
        
        int N = 5;
        int[][] matriz = new int[N][N];
         

         
         //doble for 
        for (int x = 0; x < matriz.length; x++) {
          System.out.print("|");
          for (int y = 0; y < matriz[x].length; y++) {
               matriz[x][y] = (int) (Math.random()*2);
            System.out.print (matriz[x][y]);
            if (y!=matriz[x].length-1) System.out.print("\t");
          }
          System.out.println("|");
        }
    }
}
