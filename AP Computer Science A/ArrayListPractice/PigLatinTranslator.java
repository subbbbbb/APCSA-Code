public class PigLatinTranslator {

    public static String StringReverser(String str)
    {
        String str2 = "";
        
        for(int i = str.length(); i>0; i--)
        {
            
            str2 += str.substring(i-1,i);
        }
        
        return str2;
    }
    public static String pigLatin(String str) // does not use consonant rules
    {
        String str2 = "";
        for (int i = 1; i < str.length(); i++) {
            str2+= str.substring(i, i+1);
        }
        str2+= str.charAt(0);
        str2+= "ay";
        return str2;
    }
    public static void main(String[]args)
    {
        // System.out.println(StringReverser("Hello"));
        System.out.println(pigLatin("food"));

    }
}
