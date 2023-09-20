public class Person {

    //instance veriable
    String firstName;
    String lastName;
    int age;
    String adress;
    boolean isMarried;
    double salary;
    String[] hobbies;


    //Constructor
    public Person(String firstName, String lastName , int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    //Constructor overloading
    public Person(String firstName, String lastName,int age,double salary,boolean isMarried,String[] hobbies){
        this(firstName,lastName,age);
        this.salary =salary;
        this.isMarried = isMarried;
        this.hobbies =hobbies;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public boolean isTeen(){
        return age>=13 && age<=19;
    }

}
