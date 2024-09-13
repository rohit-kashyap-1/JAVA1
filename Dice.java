public class Dice {
    public static void main(String[] args) {
        int random = (int)(Math.random()*10);
        while(random<8){
            System.out.println(random);
            random++;
        }
    }
}
