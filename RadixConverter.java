public class RadixConverter {

    /*
     
 retourner le code ascii du caractere en parametre
     
 @param c 
     
 @return le code ascii du caractere en parametre
     
*/

    public static int asciiOf(char c) {
        int nb = (int) c;
        return nb;
    }

    /*

     
 retourner le char du code ascii en parametre 
     
 @param ascii
     
 @return le caractere du code ascii en parametre
     
*/

    public static char charOf(int ascii) {
        char c = (char) ascii;
        return c;
    }

    /*

     
 convertir du base 2 vers la base 10
     
 @param bin la chaine a changer 
     
 @return la valeur de la chaine bin en base 10
     
*/

    public static int binToDec(String bin) {
        int nb = Integer.parseInt(bin, 2);
        return nb;
    }

    /*

     
 convertir du base 16 vers la base 10
     
 @param hex la chaine en base 16
     
 @return la valeur de la chaine hex en base 10
     
*/

    public static int hexToDec(String hex) {
        int ch=Integer.parseInt(hex, 16);
        return ch;
    }

    /*

     
 convertir du base 8 vers la base 10
     
 @param oct la chaine en base octal
     
 @return la valeur de la chaine oct en base 10
     
*/

    public static int octToDec(String oct) {
        return Integer.parseInt(oct, 8);
    }

    /*

     
 convertir du base 16 vers la base 2
     
 @param hex la chaine en base hexadecimale
     
 @return la chaine de la chaine hex en base 2
     
*/

    public static String hexToBin(String hex) {
        int nb = Integer.parseInt(hex, 16);
        return decToBin(nb);
    }

    /*

     
 convertir du base 10 vers la base 2
     
 @param nb l'entier en base 10
     
 @return la chaine binaire associée a ce nombre
     
*/

    public static String decToBin(int nb) {
        String str = Integer.toBinaryString(nb);
        return str;
    }

    /*

     
 convertir du base 8 vers la base 2
     
 @param oct la chaine octal a convertir
     
 @return la valeur de la chaine oct en base 2
     
*/

    public static String octToBin(String oct){
        int nb=Integer.parseInt(oct, 8);
        return decToBin(nb);
    }
    
    /*

     
 convertir du base 2 vers la base 16
     
 @param bin la chaine en base 2
     
 @return la chaine de la chaine bin en base 16
     
*/

    public static String binToHex(String bin) {
        int nb = binToDec(bin);
        return Integer.toHexString(nb).toUpperCase();
    }

    /*

     
 convertir du base 10 vers la base 16
     
 @param dec la chaine en base 10 a convertir
     
 @return la chaine associée a l'entier dec en base 16
     
*/

    public static String decToHex(int dec) {
        return Integer.toHexString(dec).toUpperCase();
    }
    
    /*

     
 convertir la chaine octale en chaine hexadecimale
     
 @param oct la chaine octal a convertir
     
 @return la chaine hexadecimal de la chaine octal
     
*/

    public static String octToHex(String oct){
        int nb=octToDec(oct);
        return decToHex(nb).toUpperCase();
    }
    
    /*

     
 convertir du base 10 vers la base 8
     
 @param dec le nombre a convertir
     
 @return le chaine octal du nombre dec en parametre
     
*/

    public static String decToOct(int dec){
        return Integer.toOctalString(dec);
    }
    
    /*

     
 convertir un chaine octale en chaine binaire
     
 @param bin la chaine binaire a convertir
     
 @return la chaine octale de la chaine binaire
     
*/

    public static String binToOct(String bin){
        int nb=binToDec(bin);
        return decToOct(nb);
    }
    
    /**

     
 convertir une chaine hexadecimale en chaine octale
     
 @param hex la chaine hexadecimale a convertir
     
 @return la chaine octale de la chaine hexadecimale
     
*/

    public static String hexToOct(String hex){
        int nb=hexToDec(hex);
        return decToOct(nb);
    }
    
    /*

     
 convertir une chaine en code binaire
     
 @param ch la chaine a convertir
     
 @return la chaine converti en code binaire (base 2)
     
*/

    public static String intoBinary(String ch){
        String result="";
        int i=0;
        while(i<ch.length()){
            char c=ch.charAt(i++);
            result+=Integer.toBinaryString((int)c);
        }
        return result;
    }
}