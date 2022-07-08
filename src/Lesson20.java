public class Lesson20 {
    public static void main(String[] args){
    Human1 humanoid = new Human1();
    }
}
class Human1{
    private String name;
    private int age;
    public Human1(){
        this.name = "Имя по умолчанию";
        this.age = 0;
        System.out.println(name + " " + age);
    }

    public Human1(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println(name + " " + age);
    }
    public Human1(String name){
        this.name = name;
        System.out.println(name);
    }
    public Human1(int age){
        this.age = age;
        System.out.println(age);
    }

    public void getName(String name){
        this.name = name;
    }
    public void getAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void getInfo(){
        System.out.println("Меня зовут " + name + " и мне " +age + " лет!");
    }
}
