public class MethodOverloading {

    static void joke(String name){
        System.out.println(String.format("Hehe, %s, tera to joke bn gya bhai!",name));
    }
    static void joke(int yoyo){
        System.out.println("Are you serious?");
    }
    public static void main(String[] args) {
        joke("Shivam chaudhary");
        joke(25);
    }
}
