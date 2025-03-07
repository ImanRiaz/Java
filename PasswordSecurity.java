class password{
    private String password;
    password(String p){
        password=p;
    }
    void changepassword(String oldpass,String newpass){
    if(oldpass==password){
        System.out.println("Enter new password");
    }
    }

}
public class PasswordSecurity {
    public static void main(String[] args){
     password p=new password(null);
          
    }
}
