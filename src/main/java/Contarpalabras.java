
public class Contarpalabras {
    public static void main(String[] args){
        String str = "Salimos  a  las  20 ";
        String[] palabras = str.split("\\s+");
        System.out.println(palabras.length);
    }
}
