import java.util.*;

public class Homework2
{
    public static void main(String[] args)
    {
        int i, j, x, y, z, RandomX, RandomY, PlayerX, PlayerY, Array[][];

        Array= new int[5][5];
        Random number= new Random();
        RandomX=number.nextInt(5);
        RandomY=number.nextInt(5);
        System.out.println(RandomX);
        System.out.println(RandomY);
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

        Scanner MyObj= new Scanner(System.in);
        do
        {
            System.out.print("Please enter line for fire [1-5]:");
            PlayerX=MyObj.nextInt();

            if (PlayerX<1 || PlayerX>5) {
                System.out.println("pirt");
                do {
                    System.out.print("Please enter correct line number [1-5]:");
                    PlayerX = MyObj.nextInt();
                }while (PlayerX<1 || PlayerX>5);
            }

            System.out.print("Please enter bar for fire [1-5]:");
            PlayerY=MyObj.nextInt();

            if (PlayerY<1 || PlayerY>5) {
                do {
                    System.out.print("Please enter correct bar number [1-5]:");
                    PlayerY = MyObj.nextInt();
                }while (PlayerY<1 || PlayerY>5);
            }

        }
        while (PlayerX!=RandomX || PlayerY!=RandomY);
    }
}
