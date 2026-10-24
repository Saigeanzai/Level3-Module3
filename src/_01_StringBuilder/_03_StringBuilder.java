package _01_StringBuilder;


public class _03_StringBuilder {
    
    public static String append(String str, char[] characters) {
    	  StringBuilder builder = new StringBuilder();
    	String string = builder.append("I like").toString() + " " + new String(characters);
        return string;
    }
    
    public static String reverse(String str) {
    	  StringBuilder builder = new StringBuilder(str);
    	  String string = builder.reverse().toString();
        return string;
    }
    
    public static String insert(String str, int index, char newChar) {
    	 StringBuilder builder = new StringBuilder(str);
    	 String string = builder.insert(index, newChar).toString();
        return string;
    }
    
    public static String delete(String str, int startIndex, int endIndex) {
    	 StringBuilder builder = new StringBuilder(str);
    	String string =  builder.delete(startIndex, endIndex).toString();
        return string;
    }
}