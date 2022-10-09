public class MathMethodsCalcEPIAbs
{
    public static void main(String[] args)
    {
        System.out.println("The value of e is "+Math.E);
        System.out.println("The value of PI is "+Math.PI);

        double d1= Math.abs(6.7);

        System.out.println("The absolute value of 6.7 is "+d1);
        System.out.println("The absolute value of -6.7 is "+Math.abs(-6.7));//another version of previous line combining the two lines previous from this line.

        double d2= Math.log(5);

        System.out.println("The log of 5 is "+d2);
        System.out.println("The square root of 9 is "+Math.sqrt(9));

        double d3=Math.pow(4,3);

        System.out.println("4 to the 3rd power is "+d3);
        System.out.println("23.49 rounded is "+Math.round(23.49));//rounded to the nearest int
        System.out.println("23.55 rounded is "+Math.round(23.55));

        int smaller=Math.min(8,2);

        int larger=Math.max(8,2);

        System.out.println("The two numbers are 8 and 2");
        System.out.println("The min of the 2 is "+smaller);
        System.out.println("The larger of the 2 is "+larger);

    }
}
