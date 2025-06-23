package exam2;

public class Student {
    int rollno;
    String name;
    String sec;

    public Student(int rollno, String name, String sec) {
        this.rollno = rollno;
        this.name = name;
        this.sec = sec;
    }


    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSec() {
        return sec;
    }

    public void setSec(String sec) {
        this.sec = sec;
    }

    public void printDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollno);
        System.out.println("Section: " + sec);
    }

    public static void main(String[] args) {
        Student s1 = new Student(12, "anu", "A");
        s1.printDetails();

    }
}

