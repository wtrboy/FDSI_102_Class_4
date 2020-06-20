public class Animal {
    public String name;
    public String type;

   // constructor //
    
    public Animal(String name, String type){
        this.name=name;
        this.type=type;
    }

  // create the print animal method //

    public void printAnimal(){
        System.out.println("--New Animal--");
        System.out.print(this.name+ " " + this.type);
        System.out.println("");
      }

  // create attack method //    

    public void attacks(User obj){
        System.out.println(this.name + " "+ this.type + " attacks " + obj.name);

    }

}