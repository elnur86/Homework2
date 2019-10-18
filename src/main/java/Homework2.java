

public class Homework2
{
    public static void main(String[] args)
    {
        int i, j, z, Array[][];

        Array= new int[5][5];

        for (i=0;i<5;i++)
        {
            for(j=0;j<5;j++)
            {
                Array[i][j]=1;
            }
        }
        for (i=0;i<5;i++)
        {
            for(j=0;j<5;j++)
            {
                System.out.print(Array[i][j]);
            }
            System.out.println();
        }
    }
}
