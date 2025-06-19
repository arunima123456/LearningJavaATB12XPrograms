package encapsulation;

public class ecap
{
public static void main(String args[])
{
    VWOlogin login=new VWOlogin("admin","pass123");
    System.out.println(login.password);
    login.password="pass345";
    System.out.println(login.password);
    goodVWOlogin login2=new goodVWOlogin("admin1","pass567");
   //  now not accesable password as it private

}
}
class VWOlogin
{
    public String username;
    public String password;
    VWOlogin(String username,String password)
    {
        this.password=password;
        this.username=username;
    }
}
class goodVWOlogin
{
    private String username2;
    private String password2;
    public String getUsername2() {
        return username2;
    }

    public void setUsername2(String username2) {
        this.username2 = username2;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }


    public goodVWOlogin(String username2,String password2)
    {
        this.username2=username2;
        this.password2=password2;
    }
}