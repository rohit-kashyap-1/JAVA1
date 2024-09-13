public class Recursion {
    static int sum(int x){
        if(x>0){
            x = x + sum(x-1);
            return x;
        }else{
            return 0;
        }
        
    }

    static int fact(int x){
        if(x>1){
            x = x * fact(x-1);
            return x;
        }else{
            return 1;
        }
    }
    public static void main(String[] args) {
        int sum = sum(5);
        int fact = fact(5);
        //System.out.println(sum);
        System.out.println(fact);
    }   
}
