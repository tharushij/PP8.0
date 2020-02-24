import java.util.Random;
public class alienLang
{
    /*NOTE: blurb = whoozit + whatzit
            whoozit = x + 1 or more y's
            whatzit = q + z OR d + whoozit
    */

    public static void main(String[]args)
    {
        Random ran = new Random();
        int ranNum = ran.nextInt(5);
        makeBlurb(ranNum);
    } //end method main

    public static void makeBlurb(int num)
    {
        if(num > 0)
        {
            makeBlurb(num-1);
        }

        switch(num)
        {
            case 1:
                System.out.println(whoozit() + whatzit());

            case 2:
                System.out.println(whoozit() + whatzit() + whoozit() + whatzit());

            case 3:
                System.out.println(whoozit() + whatzit() + whoozit() + whatzit() + whoozit() + whatzit());

            case 4:
                System.out.println(whoozit() + whatzit() + whoozit() + whatzit() + whoozit() + whatzit() + whoozit() + whatzit());

            case 5:
                System.out.println(whoozit() + whatzit() + whoozit() + whatzit() + whoozit() + whatzit() + whoozit() + whatzit() + whoozit() + whatzit());
        } //end switch
    } //end makeBlurb

    public static String whoozit()
    {
        String whoozit = "x";
        String tempY = "";
        Random ran = new Random();
        int numY = ran.nextInt(10);
        for(int i = 0; i < numY; i++)
        {
            tempY += "y";
        }
        return whoozit+tempY;
    } //end method whoozit

    public static String whatzit()
    {
        String whatzit = "q";
        Random ran = new Random();
        int pick1 = ran.nextInt(1);
        if(pick1 == 0)
            return whatzit + "z" + whoozit();
        return whatzit + "d" + whoozit();
    } //end method whatzit

} //end class alienLang