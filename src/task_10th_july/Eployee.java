package task_10th_july;

import org.w3c.dom.ls.LSOutput;

public class Eployee {
    public void role() {
        System.out.println("general eployee");
    }

    public static class Manager extends Eployee {
        public void role() {
            System.out.println("manager");
        }

        public static class Tester extends Eployee {
            public void role() {
                System.out.println("tester");
            }

            public static void main(String[] args) {


                Eployee e = new Eployee();
                e.role();
                Manager m = new Manager();
                m.role();
                Tester t = new Tester();
                t.role();
            }
        }
    }
}

