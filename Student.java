public class Student extends User {
    // not needed with extends User -> public String name;
    // not needed with extends User -> public int age;
    public int cohortNumber;
 
     //constructor
 
     public Student(String name, int age, int cohortNumber){
        super(name,age);
        this.cohortNumber=cohortNumber;
     } 
     
     //method printStudent

   public void printStudent(){
      printUser();
     System.out.println("Cohort Number: "+this.cohortNumber);
   }  
 }
 