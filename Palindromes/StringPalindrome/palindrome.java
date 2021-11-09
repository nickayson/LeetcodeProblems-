public class palindrome{
//everything has to be in lowercase no spaces and no punctuations
//loop through to each element in string
// print out if it is a palindrome
public static boolean pal(String arr){
    arr = arr.toLowerCase();
    arr = arr.replaceAll("\\s", "");
    arr = arr.replaceAll("\\p{Punct}","");
    for(int i = 0; i < arr.length(); i++){
        if(arr.charAt(i) != arr.charAt(arr.length() - i -1) )
        {
            System.out.println("it is not a palindrome");
            return false;
        }
    }
    System.out.println("it is a palindrome");
    return true;
    }
    public static void main(String[] args){
        String arr = "race a car";
        pal(arr);
    }   
}
