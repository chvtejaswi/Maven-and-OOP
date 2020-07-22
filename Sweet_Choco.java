package com.code;
import java.util.Arrays;
import java.util.Scanner;
	public class choco_sweet{
	       public void sort(String[] choc) {
	      int len=choc.length,min;
	           for(int i=0;i<len-1;i++) {
	        	   min=i
	          for(int j=i+1;j<choc.length;j++) {
	        	  if(choc[min]>choc[j])
	        		  min=j
	          }
	          String temp=choc[i];
	          choc[i]=choc[j];
	          choc[j]=temp;
	          }
	           }
	       
	      for(int i=0;i<len-1;i++)
	      System.out.println(choc[i]);
	       }
	}
	public class  Candies{    
	    public void candies(String[] candy) {
	    System.out.println("No.of candies present are :",candy.length);
	   
	    }
	}
	public class Weeiht_of_sweets{
	    public void sweets(String [] choc, String[] candy) {
	    System.out.println("Weight of strings:",(choc.length+candy.length));
	    }
	}
	public class Sweet_Choco{
	public static void main(String args[]) {
	Scanner s = new Scanner(System.in);
	int n, nc, i;
	   String choc[] = new String[5];
	   String candy[] = new String[5];
	   nc=s.nextInt();
	   for(i=0;i<nc;i++) {
	    System.out.print("Enter name of chocolate:");
	    choc[i]=s.next();
	   }  
	   System.out.print("enter chocolate count:");
	nc=s.nextInt();
	for(i=0;i<nc;i++) {
	   System.out.print("Enter Candy name:");
	   candy[i]=s.next();
	   }
	choco_sweet c=new choco_sweet();
	c.sort(choc[5]);
	Candies cd=new Candies;
	cd.candies(candy[5]);
	Sweet_Choco sc=new Sweet_Choco();
	sc.sweets(choc[5], candy[5]);
	}
	}

	      
}