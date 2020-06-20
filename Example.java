public class Example {
    public static void main(String args[]){

        //create user class and student class//
        
        User Lane = new User( "Lane", 44);
        Lane.printUser();
    
        //add another object of type user//

        User Anastasia = new User( "Anastasia", 39 );
        Anastasia.printUser();

        Student Lionel = new Student("Lionel", 28, 10);
        Lionel.printStudent();

        //add another object of type student//
    
        Student Lenny = new Student("Lenny",33,10);
        Lenny.printStudent();

        Animal baby = new Animal("Baby", "Dolphin");
        baby.printAnimal();
        
        //add another object of the type animal//

        Animal adult = new Animal("Adult", "Lion");
        adult.printAnimal();
        
        //add attack functions//

        baby.attacks(Lionel);

        //add another attack//

        adult.attacks(Anastasia);

        }
}
