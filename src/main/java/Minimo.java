
public class Minimo {
    public static void main(String[] args){
        // Haya el número menor -> { 1, -7'2, 4'5, -21, 3'14, 0 }
         //Mi código
        
        double numero[] = { 1, -7.2, 4.5, -21, 3.14, 0 };
        for(int N = 0; N < numero.length - 1; N++){
            if(numero[N] < numero[N+1]){
                numero[N+1] = numero[N];
            }
        }
        System.out.println(numero[5]);
    }
}
