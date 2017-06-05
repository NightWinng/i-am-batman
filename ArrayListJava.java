import java.util.*;
public class ArrayListJava
{
   public static void main(String[] args)
   {
      Arr();
   }
   
   public static void Arr()
   {
      ArrayList<Integer> aryNum = new ArrayList<Integer>();
      for (int i = 0; i <= 100; i++)
      {
         Random rand = new Random();
         aryNum.add(rand.nextInt(4000) + 1);
      }
      System.out.println(aryNum);
      sumSubEigthy(aryNum);
      largestInt(aryNum);      
      }
      
   public static void sumSubEigthy(ArrayList arr)
   {
      int i = 0;
      for(i = 0 ; i < arr.size() ; i++)
      {
         int arrayNum1 = (int)arr.get(i);
         for(int j = i; j < arr.size(); j++)
         {
            int arrayNum2 = (int)arr.get(j);
            if(arrayNum1 + arrayNum2 == 80)
            {
               System.out.println(arrayNum1 + " + " + arrayNum2);
            }
            else if( arrayNum2 - arrayNum1 == 80)
            {
               System.out.println(arrayNum2 + " - " + arrayNum1);
            }
         }
      }  
   }
   
   public static void largestInt(ArrayList arr)
   {
      int Num1 = (int)arr.get(0);
      for(int j = 0; j < arr.size(); j++){
         int Num2 = (int)arr.get(j);
         if(Num2 >= Num1)
         {
            Num1 = Num2;
         }
      }
      System.out.println("Largest Int is " + Num1);
   }
}