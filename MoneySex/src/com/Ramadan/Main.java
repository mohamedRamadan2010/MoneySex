package com.Ramadan;

public class Main {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        /* this code for calculate money repeated */

        int rate=10;
        int  repeatOfMoney=2;
        int time=0;
        int myMoney=5000;

        if(rate>4 && rate<20)
        {
            time = calculateTime(repeatOfMoney, time, rate);
            System.out.println("time to duplicate this money :- " + time);
        }else
        {
            System.out.println("we can not calculate this time rate should be less than 20 and more than 4 ");
        }

        for (int i=time ;i<46;i=i+time)
        {
            myMoney*=2;

            System.out.println("in day :-  " + i +" we have money :- " +myMoney);


        }
    }

    public static int calculateTime(int repeatOfMoney, int time, int rate)
    {
        for(int i=0;i<repeatOfMoney-1;i++)
        {

            time+=Math.round(72/rate);
        }
        return time;
    }
}
