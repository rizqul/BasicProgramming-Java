import java.util.Scanner;
class TugasPakSup_5
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int input[][] = new int[n][n];
    for(int i = 0 ; i < n ; i++)
    {
      for(int j = 0 ; j <= i ; j++)
      {
        input[i][j] = sc.nextInt();
      }
    }
    int indexAwal = 0;
    int leftIndex = 0;
    int rightdex = 0;
    int leftsum = input[indexAwal][leftIndex] + input[indexAwal+1][leftIndex];
    int rightsum= input[indexAwal][rightdex] + input[indexAwal+1][rightdex+1];
    rightdex = 1;
    for(indexAwal = indexAwal + 1 ; indexAwal < n - 1 ; indexAwal++)
    {
      if(leftsum + input[indexAwal+1][leftIndex] >= leftsum + input[indexAwal+1][leftIndex+1])
      {
        leftsum += input[indexAwal+1][leftIndex];
        leftIndex = leftIndex;
      }
      else
      {
        leftsum += input[indexAwal+1][leftIndex+1];
        leftIndex = leftIndex + 1;
      }
      if(rightsum + input[indexAwal+1][rightdex] >= rightsum + input[indexAwal+1][rightdex+1])
      {
        rightsum += input[indexAwal+1][rightdex];
        rightdex = rightdex;
      }
      else
      {
        rightsum += input[indexAwal+1][rightdex+1];
        rightdex = rightdex + 1;
      }
    }
    if(rightsum > leftsum)
    {
      System.out.println(rightsum);
    }
    else
    {
      System.out.println(leftsum);
    }
  }
}