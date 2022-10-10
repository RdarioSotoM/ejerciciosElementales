
public class N2 {
   public static void main(String[] args) {
       /* 
        int N = 10;
        int[] fibo = new int[3];
        fibo[0] = 1;
        fibo[1] = 1;
        fibo[2] = 0;
        
        for(int i = 3; i <= N; i++){
            fibo[2] = fibo[0] + fibo[1];
            fibo[0] = fibo[1];
            fibo[1] = fibo[2];
            System.out.println(fibo[2]);
        }
        */
       
        //Declarar y guardar todos los términos de Fibonacci hasta N
        int A = 3;
        int N = 10;
        int[] fibo = new int[N];
        fibo[0] = 1;
        fibo[1] = 1;
        fibo[2] = 0;
        
        for(int i = 0; i <= N; i++){
            
            fibo[A] = fibo[2];
            fibo[2] = fibo[0] + fibo[1];
            fibo[0] = fibo[1];
            fibo[1] = fibo[2];
            System.out.println(fibo[A]);
            A = A++;
            
        }
        
    }
}
  
