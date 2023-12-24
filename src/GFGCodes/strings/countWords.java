package GFGCodes.strings;

public class countWords {
    public static int printWordCount(String str){
        int count = 1;
        for (int i = 0; i < str.length() -1;i++){
            if ((str.charAt(i) == ' ') && (str.charAt(i+1) != ' ')){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "My name is Prabhat";
        System.out.println("No. of words in the given string is:"+printWordCount(str));
    }
}
