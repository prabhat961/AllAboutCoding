package importantCodesForQA;

public class stringCompressionwithNoOrder {
    public static void stringCompression(String str){
        for(char c= 'a'; c <= 'z'; c++){
            int count = 0;
            for (int i = 0; i <= str.length() - 1;i++){
                if (str.charAt(i) == c){
                    count++;
                }
            }
            if (count != 0)
                System.out.print(c+""+count);
        }
    }

    public static void main(String[] args) {
        String str = "banana";
        stringCompression(str);
    }
}
