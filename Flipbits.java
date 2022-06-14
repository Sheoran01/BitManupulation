public class ConvertBits {
    public static int countBits(int n){
        int count = 0;
        while(n!= 0){
            count += n & 1;
            n >>= 1;

        }
        return count;
    }
    public static int flipBit(int a , int b){
        return countBits(a^b);
    }
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        System.out.println(flipBit(a, b));
    }
}
