public class Calc {
    public static void main(String[] args){
        float capital = 45000;
        float roi = 14.1f;
        float time = 2.5f;

        double result = (capital/100)*roi*time;
        System.out.println(result);
    }
}
