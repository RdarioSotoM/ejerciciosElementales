
public class SumarDigitos {
    public static void main(String[] args){
       int N = 11111;
       int temp = N;
       int suma = 0;
       int cifra;
       
       while(temp !=0 ){
        
        cifra = temp % 10;
        suma = suma + cifra;
        temp = temp / 10;
        }
       
        System.out.println(suma);
    }
}
