class Student
{
   String name;
   long  reg_no;
   String sub1;
   String sub2;
   String sub3;
   String sub4;
   String sub5;
   double marks1;
   double marks2;
   double marks3;
   double marks4;
   double marks5;
   Student(
String name,long reg_no,String sub1,String sub2,
String sub3,String sub4,String sub5,double marks1,double marks2,
double marks3,double marks4,double marks5)
   {
	  this.name=name;
	  this.reg_no=reg_no;
	  this.sub1=sub1;
	  this.sub2=sub2;
	  this.sub3=sub3;
	  this.sub4=sub4;
	  this.sub5=sub5;
	  this.marks1=marks1;
	  this.marks2=marks2;
	  this.marks3=marks3;
	  this.marks4=marks4;
	  this.marks5=marks5;
   }
   String calculate()
   {
	   double total =marks1+marks2+marks3+marks4+marks5;
	   double percentage=(total/500.0)*100;
	   String grade;
	   if(percentage>=95)
		   grade = "O";
	   else if (percentage>=85)
		   grade = "A";
	   else if (percentage>=75)
		   grade = "B";
	   else if (percentage>=60)
		   grade = "C";
	   else if (percentage>=40)
		   grade = "D";
	   else {
		   grade="Fail";}
	   return grade;
	   
	   
		   
		   
	   
   }
   void putData()
   {   System.out.println(".......................................");
	   System.out.println(".        SHIKSHA  'O'  ANUSANDHAN     .");
	   System.out.println("---------------------------------------");
	   System.out.println(".              MARKSHEET              .");
	   System.out.println(".......................................");
	   System.out.println(". Name                :"+name+".");
	   System.out.println(". Registration Number :"+reg_no+"     .");
	   System.out.println(".......................................");
	   System.out.println(". subject :  Marks                    .");
	   System.out.println(".......................................");
	   System.out.println(". "+sub1+" : "+marks1+"                      .");
	   System.out.println(". "+sub2+" : "+marks2+"                          .");
	   System.out.println(". "+sub3+" : "+marks3+"                         .");
	   System.out.println(". "+sub4+" : "+marks4+"                          .");
	   System.out.println(". "+sub5+" : "+marks5+"                          .");
	   System.out.println(".......................................");
	   System.out.println(". Total :"+(marks1+marks2+marks3+marks4+marks5)+" out of 500             .");
	   System.out.println(". Grade : "+calculate()+"                           .");
       System.out.println(".......................................");
	}}
   public class Alpha
   {
	   public static void main(String [] args)
	   {
	Student S1=new Student("Priyanshu Gupta",2241007053L,"Calulas","DSA","UPEM","IGT","PME",75,45,76,98,76);
	    S1.putData();
	   }
	   
   }
   
   
   
