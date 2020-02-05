import java.util.Scanner;
/**
 * This program is used to unit test the Pool class.
 * The format of the dollar amount is not important.
 * You should not be concerned that there are no 
 * dollar signs or there are more than two decimal
 * places.
 * 
 * @author 
 * @version Spring 2019
 */
public class DriverPoolStudent
{
    public static void main(String args[])
    {
        //1.  Create a Pool object.
        Pool p = new Pool();

        //2.  Test bounds of the range for pool days
        //2A. day - lower bound test 
        p.addEntry(0,1,"1",2.3);
        //2B. day - mid-range test
        p.addEntry(3,1,"2",2.3);
        //2C. day - upper bound test
        p.addEntry(7,1,"3",2.3);
        //3.  Test the bounds of the range for pool hours
        //3A. hour - lower bound test
        p.addEntry(1,0,"4",2.3);
        //3B. hour - mid-range test
        p.addEntry(1,12,"5",2.3);
        //3C. hour - upper bound test
        p.addEntry(1,24,"6",2.3);
        //4A.  Test pool total; total is based on the pool entries above
        System.out.println(p.poolTotal());
        //4B.  Test pool total with a new pool and no entries.
        Pool b = new Pool();
        System.out.println(b.poolTotal());
        //5A.  Test getWinner - winner exists
        System.out.println(p.getWinner(1,1));
        //5B.  Test getWinner - no winner
        System.out.println(p.getWinner(1,5));
        //6.   print the complete matrix
        System.out.println("\n" + p);

        /*
         * 7. 
         * Use the Pool object, p, you created above.  If there are entries 
         * still available (there should be lots!), ask the user to pick a day 
         * and time.  Keep asking until they have picked one that is not 
         * already used (is null).  Then, add the user to the pool.  You 
         * will need their name and the amount they would like to enter.
         * You only need to enter one user in the pool.
         */
        boolean isTaken = true;
        Scanner in = new Scanner(System.in);
        //while(isTaken==true){
            System.out.println("Please select a Day");
            int day = in.nextInt();
            System.out.println("Please select an Hour");
            int hour = in.nextInt();
            System.out.println("Please enter your name");
            String name = in.next();
            System.out.println("Please enter an amount");
            double amount = in.nextDouble();
            //if(Entry[hour][day] != null){
                //isTaken = false;
           // }
        //}   
    }
}
