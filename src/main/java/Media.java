
public class Media {
    public static void main(String[] args){
        double numeros[] = { 1, 2, 3, 4 };
        for(int N = 0; N < numeros.length - 1; N++){
            numeros[N+1] = (numeros[N] + numeros[N+1]);
        }
        numeros[numeros.length - 1] = numeros[numeros.length - 1] / numeros.length ;
        System.out.println(numeros[numeros.length - 1]);
    }
}
