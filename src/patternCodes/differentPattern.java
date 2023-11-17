package patternCodes;

public class differentPattern {
    public static void starPatternOne(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
                System.out.println();
        }
    }

    public static void starPatternTwo(int n){
        for (int i = n; i >= 1; i--){
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
                System.out.println();
        }
    }

    public static void starPatternThree(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--){
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void starPatternFour(int n){
        for (int i = 1;  i <= n; i++){
            for (int j = n-1; j >= i; j--){
                System.out.print(" ");
            }
            for (int k = 1; k <= i;k++){
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void starPatternFifth(int n){
        for (int i = 1;i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            for (int k = n; k >= i;k--){
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        System.out.println("First Pattern");
        starPatternOne(6);
        System.out.println("Second Pattern");
        starPatternTwo(6);
        System.out.println("Third Patttern");
        starPatternThree(6);
        System.out.println("Fourth Pattern");
        starPatternFour(6);
        System.out.println("Fifth Pattern");
        starPatternFifth(6);
    }
}
