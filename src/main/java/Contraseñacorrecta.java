
public class Contraseñacorrecta {
     public static void main(String[] args){
         String passwd = "asdfghjk12";
         boolean passwd_ok = true;
         
         //Longitud
         
         if(passwd.length() < 10){
             passwd_ok = false;
         }
         
         //Caracteres
         
         if(!passwd.matches("[a-zA-Z0-9]*")){
             passwd_ok = false;
         }
         
         // contador
         
         int counter = 0;
         
         for(char c: passwd.toCharArray()){
             if(Character.isDigit(c)){
                 counter++;
             }
         }
         
         if (counter < 2){
             passwd_ok = false;
         }
         
         
         //Lectura del boolean
         
         if(passwd_ok){
             System.out.println("Contraseña aceptable");
         }
         else{
             System.out.println("Contraseña inaceptable");
         }
    }
}
