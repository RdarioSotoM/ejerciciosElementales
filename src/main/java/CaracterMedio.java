
public class CaracterMedio {
    public static void main(String[] args){
        int numeros[] = { 1, 2, 3, 4, 6};
        int X ;
        int Y ;
        
        if(numeros.length % 2 == 0){
            X = numeros[numeros.length / 2];
            Y = numeros[numeros.length / 2 - 1];
            System.out.println(Y);
            System.out.println(X);
        }
        else{
            X = numeros[numeros.length / 2];
            System.out.println(X);
        }
        
        //Con String
        
        String str = "abcdefg";
        int A ;
        int B ;
        
        if( str.length() % 2 == 0){
            A = str.length() / 2;
            B = str.length() / 2 - 1;
            
            System.out.println(str.charAt(B));
            System.out.println(str.charAt(A));
            
        }
        else{
            A = str.length() / 2;
            System.out.println(str.charAt(A));
        }   
    }
}
