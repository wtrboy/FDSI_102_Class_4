public class User {
    //atributes: name and age
    //need constructor, setter and getter//

    public String name;
    private int age;

    //methods

    //Constructor
    public User(String name, int age){
        this.name=name;
        setAge(age);
    }
    //setter//
    public void setAge(int age){
        if(age<100){
            this.age=age;
            System.out.println("The age was assigned correctly");
        }
        else{
            System.out.println("Error *** the age is not correct");
        }
    }
//method to print the user://

    public void printUser(){
        System.out.println("---New User---");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " +this.age);
    }
}