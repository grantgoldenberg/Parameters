
/**
 * class Paramaters is a study of paramaters and .
 * 
 * 1. Write method display choice that displays a menu for maximum or average.
 * 2. Write method getChoice that returns a string that the user enters for the choice.
 * 3. Write method doOption that makes a desicion based on its parameter option (type String) and
 *    calls maximum or average with any numbers you want.
 * @author (Grant Goldenberg) 
 * @version (December 1, 2014
 */
public class Paramaters
{
    public void displayWelcome(){
        System.out.println("/ / / / / / / / / / / / / / / / / /");
        System.out.println("/  Welcome to Average or maximum  /");
        System.out.println("/   Written by Grant Goldenberg   /");
        System.out.println("/ / / / / / / / / / / / / / / / / /");
        System.out.println("");
        System.out.println("You have two options:");
        System.out.println("/ 1. Average /");
        System.out.println("/ 2. Maximum /");
        System.out.println("/ Please choose your option. /");
        System.out.println("");
    }
    
    public void run(){
        int answer = maximum (4, 6);
        int answer2 = maximum (22, -22);
        int superAnswer = maximum (answer, answer2);
        double avgAnswer = average(answer, answer2, superAnswer);
    }

    /**
     * @return the average of x, y, and z
     */
    public double average (int x, int y, int z)
    {
        double result = (x + y + z)/3.0;
        return result;
    }

    /**
     * @return the maximum of x and y
     */
    public int maximum (int x, int y)
    {
        int max = y;
        if (x > y)
            max = x;
        return max;
    }
}
