
package tugas3;

/**
 *
 * @author DIVA
 */
public class akun {
    private String username, password;
    
    public akun(){
    username = "admin";
    password = "admin";
    }
    
    public akun(String u, String p){
    username = u;
    password = p;
    }

    //public akun(String p){
    //    password = p;
    //}
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
      
    
}
