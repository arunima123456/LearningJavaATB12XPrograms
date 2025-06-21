package abstarct_task;
interface Printable {
    void print();
}

// Define the Showable interface
interface Showable {
    void show();
}

class documents implements Printable,Showable
{
    @Override
    public void print() {
        System.out.println("printing ");

    }

    @Override
    public void show() {
        System.out.println("Showing the document content...");
    }
    public class Main {
        public static void main(String[] args) {
            // Create a Document object
            documents myDocument = new documents();

            // Call the methods from both interfaces
            myDocument.print();
            myDocument.show();
        }
    }
    }
