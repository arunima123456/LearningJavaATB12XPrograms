package Methodoverriding;

public class AB
{
    public static void main(String[] args) {
        TC_Chrome t = new TC_Chrome();
        t.openBrowser();
    }
}

class CommonToAllTC{
    void openBrowser(){
        System.out.println("Open the browser!");
    }
}

class TC_Chrome extends CommonToAllTC{
    @Override
    void openBrowser(){
        System.out.println("Starting a chrome");
        //new ChromeDriver();
    }
}
