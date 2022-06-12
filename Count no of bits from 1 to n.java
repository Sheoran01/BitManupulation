public class CountBit {
    public static int countBit(int n){
        int bitCounter = 0;
        for(int i = 1; i<=n ; i++){
            bitCounter += countBitMain(i);
        }
        return bitCounter;
    }
    public static int countBitMain(int x){
        if(x <= 0){
            return 0;
        }else{
            return (x % 2) + countBitMain(x/2);
        }
    }
    public static void main(String[] args){
        int n = 17;
        System.out.println(countBit(n));
    }
}
