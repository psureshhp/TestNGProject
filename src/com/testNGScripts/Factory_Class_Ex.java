package com.testNGScripts;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;


class SimpleTest
{
	
	
   private int param;
   public SimpleTest (int param)
   {
      this.param=param;
   }
	
   @Test
   public void simpleTest1() 
   {
      System.out.println("Simple Test Method1:"+param);
   }
   @Test
   public void simpleTest2() 
   {
	   System.out.println("Simple Test Method2:"+param);
   }
   @Test
   public void simpleTest3() 
   {
	   System.out.println("Simple Test Method3:"+param);
   }
   @Test
   public void simpleTest4() 
   {
	   System.out.println("Simple Test Method4:"+param);
   }
   @Test
   public void simpleTest5() 
   {
	   System.out.println("Simple Test Method5:"+param);
   }
}

public class Factory_Class_Ex {

	   @Factory
	   public Object[] factoryMethod() 
	   {
	      Object [] data=new Object[5];
	      data[0]= new SimpleTest(10);
	      data[1]= new SimpleTest(20);
	      data[2]= new SimpleTest(30);
	      data[3]= new SimpleTest(40);
	      data[4]= new SimpleTest(50);
	      return data;
	   }
	
}
