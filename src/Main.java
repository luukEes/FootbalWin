public class Main {
    public static String footballWin(int AFA, int BFA, int ASB, int BSB) {
        int multi = BFA + 0.1;
        int multi2 = ASB + 0.1;
        String none = "x";
        String winA = "1";
        String winB = "2";
        if (AFA + ASB > BFA + BSB ){
            return winA;
        }
        else if (AFA + ASB < BFA + BSB )  {
            return winB;
        }
        else {
            return none;
        }
    }
    public static void main(String[] args) {
        String result = footballWin(1,2,1,1)
    }
}
