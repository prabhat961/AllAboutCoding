package DSA.strings;

public class stringRotationVerification {
    public static boolean isRotation(String s1, String s2){
        if (s1.length() != s2.length())
            return false;
        String s3 = s1+s1;
        if (s3.indexOf(s2)!= -1)
            return true;

        return false;
    }

    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "CDAB";
        System.out.println("is there any rotation:"+isRotation(str1,str2));
    }
}
