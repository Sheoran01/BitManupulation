public class Quotient {
    public static int divide(int divisor , int dividend){

        int sign = ((dividend<0)^divisor<0)? -1 : 1;

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        int quotient = 0;

        while(dividend >= divisor){
            dividend -= divisor;
            ++quotient;

        }
        if(sign == -1){
            quotient = - quotient;
        }
        return quotient;
    }
    public static void main(String[] args){
        int a = 5;
        int b = 5;
        System.out.println(divide(a,b));
    }
}
