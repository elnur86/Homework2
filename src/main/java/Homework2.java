import java.util.*;

public class Homework2
{
    public static void main(String[] args)
    {
        int i, j, x, y, z, RandomX, RandomY, Array[][];

        Array= new int[5][5];
        Random number= new Random();
        RandomX=number.nextInt(5);
        RandomY=number.nextInt(5);
        //System.out.println(RandomX);
        //System.out.println(RandomY);
        for (x=0;x<5;x++)
        {
            for(y=0;y<5;y++)
            {
                if (x==RandomX && y==RandomY)
                {
                    Array[x][y]=1;
                }
                else
                {
                    Array[x][y] = 0;
                }
            }
        }
        for (x=0;x<5;x++)
        {
            for(y=0;y<5;y++)
            {
                System.out.print(Array[x][y]);
            }
            System.out.println();
        }
    }
}
