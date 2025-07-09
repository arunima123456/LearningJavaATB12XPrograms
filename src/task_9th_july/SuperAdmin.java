package task_9th_july;

public class SuperAdmin extends AdminUser

{
    public void shutdownSystem()
    {
        System.out.println("user can shutdown");
    }

    public static void main(String[] args) {
        SuperAdmin ad=new SuperAdmin();
        ad.accessAdminPanel();
        ad.shutdownSystem();
        ad.login();
    }
}
