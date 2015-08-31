import java.util.Random;

public class DieSimulator
{
    public static void main(String[] args)
    {
       Random generator = new Random();
       generator = generator.nextInt(1, 7);
       
       System.out.println(generator);
    }
}