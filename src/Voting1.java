import java.util.Scanner;

public class Voting1 {
    int count1=0;
    int count2=0;
    void run()
    {
        for(int i=0;i<100;i++)
        {
            System.out.println("Cast your vote");
        Scanner sc = new Scanner(System.in);
        char c1 = sc.next().charAt(0);
        String s1 = String.valueOf(c1);
        if(s1.equalsIgnoreCase("q"))
        break;
      
       else if((c1!='q' || c1!='Q'))
        {
        if(s1.equalsIgnoreCase("a"))
            count1++;
        else if(s1.equalsIgnoreCase("b"))
        count2++;
        else 
        System.out.println("invalid statement please enter either a or b");
        }
        }
        System.out.println("the value of 'a' is : " +count1);
        System.out.println("the value of 'b' is : "+ count2);   
            if(count1>count2){
                System.out.println("The winner is A");
            }
            else if(count2>count1)
            {
                System.out.println("The winner is B");
            }
            else {
                System.out.println("Draw");
            }
    }
    
}
