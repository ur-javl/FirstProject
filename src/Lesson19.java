public class Lesson19 {
    public static void main(String[] args){
        Human human1 = new Human();
        Human human2 = new Human();
        human1.getName("Эдараст");
        human1.getAge(18);
        human2.getName("Dima");
        human2.getAge(48);
        human1.getInfo();
        human2.getInfo();
    }
}
class Human{
    String name;
    int age;

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
