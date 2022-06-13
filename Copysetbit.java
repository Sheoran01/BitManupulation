public class CopySetBit {
    public static int copySetBits(int x , int y , int l , int r){
        if(l<1 || r>32){
            return x;
        }
        for (int i = 1; i<=r; i++){
            int mask = 1 <<( i - 1);

            if((y & mask) !=0){
                x = x|mask;
            }
        }
        return x;
    }
    public static void main(String [] args){
        int x = 10, y = 13 ,  l = 1 , r = 32;
        x = copySetBits(x , y , l , r);
        System.out.println(x);
    }
}
