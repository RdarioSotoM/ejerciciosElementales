import java.lang.Math;

public class Capricua {
    public static void main(String[] args) {
        
       /* 
        int N = 1221;
        int tam = 4;
        int tmp = N;
        //int cifra;
        int[] cifras = new int[tam];
        
        for(int i = 0; i < tam; i++){
        cifras[i] = tmp % 10;
            //System.out.println(cifras[i]);
            tmp = tmp/10;
        }
        
        double x = 0;
        for (int i = 0; i < tam; i++){
        x = x + cifras[i]*Math.pow(10,tam-(i+1));
        }
        
        if((int)x == N){
            System.out.println("Es capicua");
        }
        else{
            System.out.println("No es capicua");
        }
        */
       
       int N = 1221;
       int temp = N;
       int reverso = 0;
       int cifra;
       
       while(temp !=0 ){
        
        cifra = temp % 10;
        reverso = reverso*10 + cifra;
        temp = temp / 10;
        }
        
       if (reverso == N){
           System.out.println("Capicua");
       }
       else{
           System.out.println("No es capicua");
       }
        
       
        
    }
}
