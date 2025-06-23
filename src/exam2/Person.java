package exam2;

public class Person
{
    String  name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Person p1=new Person("dona",31);
        Person p2=new Person("biplab",30);
        System.out.println(p1.age);
        System.out.println(p2.age);
    }
}
