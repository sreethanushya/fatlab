package com.example;
import java.util.Scanner;
public class App
  {
    public static int calculateFine(int days)
    {
      int daysAllowed=7;
      int fineperday=5;
      if(days>daysAllowed)
      {
        return fineperday*(days-daysAllowed);
      }
      else
      {
        return 0;
      }
    }
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter user name");
      String name = sc.nextLine();
      System.out.println("enter user id");
      String id=sc.nextLine();
      System.out.println("Enter number of books issued");
      int books=sc.nextInt();
      String[]booknames=new String[books];
      sc.nextLine();
      for (int i=0;i<books;i++)
        {
          System.out.println("Enter book" + (i+1)+ "Name:");
          bookname[i]=sc.nextLine();

        }
      System.out.println("Enter number of books borrowed");
      int days=sc.nextInt();
      int fine= calculateFine(days);
      System.out.println("\n ---user details");
      System.out.println("Name"+ name);
      System.out.println("Id"+id);
      System.out.println("\n books issues");
      for (int i=0;i<books;i++)
        {
          System.out.println(booknames[i]);
        }
      System.out.println("Total fine"+fine);
      sc.close();
    }
  }
