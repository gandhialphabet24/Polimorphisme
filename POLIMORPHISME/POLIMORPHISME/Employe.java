package POLIMORPHISME;

public class Employe extends person{
    
    String name = "saya";
    int age = 100;
    float salary = 4000f;

    public Employe(String a, int b, float c){
    }

        
        public void showInfo(){
            System.out.println("Name : " + this.name);
            System.out.println("Age  : " + this.age);
            System.out.println("salary : $" + salary);
    }
}
