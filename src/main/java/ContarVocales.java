
public class ContarVocales {
    public static void main(String[] args){
        String str = "asdfeuhju";
        int counter = 0;
        
        for(char c: str.toCharArray()){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' ||c == 'u' ){
                counter++;
            }
        }
        
        System.out.println(counter);
    }
}
