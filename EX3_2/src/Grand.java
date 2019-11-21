import java.util.Scanner;

public class Grand {
   public double unpass,pass,average;
  public Grand()
   {
       unpass =0.0;
       pass =0.0;
       average =0.0;
   }
    public void inGrand() throws GrandException
    {
        double grand;
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        Scanner endif = new Scanner(line);

        while(endif.hasNextLine())
        {
        grand = endif.nextDouble();
        if(grand<0||grand>100)
        {
            throw new GrandException(grand);
        }
        else if(grand>=0&&grand<=60)
        {
            unpass ++;
            average += grand;
        }
        else if(grand>60&&grand<=100)
        {
            pass++;
            average += grand;
        }
        }
    }
    public double gerAverage()
    {
        return average/(unpass+pass);
    }



}
