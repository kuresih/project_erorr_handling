/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HandlingException;

/**
 *
 */
public class HandlerException {
     public void AritmethicExeption(){
    try{
         int nilai1=10, nilai2=0;
         int Hasil=nilai1/nilai2;
         System.out.println ("Result: "+Hasil);
      }
      catch(ArithmeticException e){
         System.out.println ("You Shouldn't divide a number by zero");
      }
}

    public void IO(){
        try{
	 int num=Integer.parseInt ("ABC") ;
	 System.out.println(num);
      }catch(NumberFormatException e){
	  System.out.println("Harus sesuai type data int");
       }
   }
    public void Array(){
        try{
        int a[]=new int[10];
        //Array has only 10 elements
        a[15] = 9;
      }
      catch(ArrayIndexOutOfBoundsException e){
         System.out.println ("data array melebihi index");
      }
    }
    public void String(){
     try{
	 String str="Kuresih";
	 System.out.println(str.length());;
	 char c = str.charAt(0);
	 c = str.charAt(40);
	 System.out.println(c);
      }catch(StringIndexOutOfBoundsException e){
	  System.out.println("data yang diminta melebihi index!!");
       }   
       
}
}
