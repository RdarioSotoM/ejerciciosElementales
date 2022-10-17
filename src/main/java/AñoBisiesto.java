
public class AñoBisiesto {
    public static void main(String[] args) {
        int Año = 1989;
        
        //Modo cutre
        if(Año % 4 == 0){
            if(Año % 100 == 0){
                if(Año % 400 == 0){
                    System.out.println("Este año es bisiesto");
                }
                else{
                    System.out.println("Este año no es bisiesto");
                }
            }
            else{
                System.out.println("Este año es bisiesto");
            }
        }
        else{
            System.out.println("Este año no es bisiesto");
        }
        
        
       //Modo pro
        if((Año % 4 == 0) && (Año % 100 != 0) || (Año % 4 ==0) && (Año % 100 == 0) && (Año % 400 == 0)){
            System.out.println("Este año es bisiesto");
        }
        else{
            System.out.println("Este año no es bisiesto");
        }
    }
}
