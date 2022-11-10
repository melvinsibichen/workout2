import java.util.*;
public class Faculty{
    int facultyid;
    float salary;
}
class FulltimeFaculty extends Faculty{
  float basic;
  float allowence;
  
  FulltimeFaculty(float basic,float allowence){
      this.basic=basic;
      this.allowence=allowence;
  }
   
    float salaryF(){
        float salary1;
        salary1=(basic+allowence);
        return salary1;
    }
    
    void dispaly1(){
        System.out.println(""+salaryF());
    }
}
class ParttimeFaculty extends Faculty{
   int hour;
   float rate;
   ParttimeFaculty(int hour,float rate){
       this.hour=hour;
       this.rate=rate;
   }
    
    float salaryP(){
        float salary2;
        salary2=(hour*rate);
        return salary2;
    }
    void display2(){
        System.out.println(""+salaryP());
    }
}

class FacultyData{
    
    public static void main (String[] args){
       Scanner scn1 = new Scanner(System.in);
       FulltimeFaculty S1 = new FulltimeFaculty(scn1.nextFloat(),scn1.nextFloat());
       ParttimeFaculty S2 = new ParttimeFaculty(scn1.nextInt(),scn1.nextFloat());
       S1.dispaly1();
       S2.display2();
      
    }
}