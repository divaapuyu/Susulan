
package tugas3;
import java.io.*;
public class mainakun {
//private String newpass;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        
        //object (intance of class)
        //karena ada 2 costructor, maka dibuat 2 object
        //1. admin
        //2. akun baru
        akun admin = new akun();
        akun akunbaru = new akun("","");
        
        
        String username,password = null, password2,newpass;
        
        //menu
        do{
            System.out.println("---LOGIN---");
            System.out.println("1. Login Admin");
            System.out.println("2. Buat akun baru");
            System.out.println("3. Lihat akun");
            System.out.println("4. Ubah password");
            System.out.println("5. Keluar");
            System.out.println("Pilih menu : ");
            int pilih = Integer.parseInt(br.readLine());
            switch(pilih){
                case 1 :
                    System.out.println("--Login Admin--");
                    System.out.println("Masukkan username: ");
                    username = br.readLine();
                    System.out.println("Masukkan password: ");
                    password = br.readLine();
                
                //mencocokan username dan password
                if (username.equalsIgnoreCase(admin.getUsername())&& password.equals(admin.getPassword())){
                    System.out.println("Sukses!!");
                }else{
                    System.err.println("Gagal!");
                }
                    break;

                case 2:
                    System.out.println("--Buat Akun--");
                    System.out.println("Masukkan username: ");
                    username = br.readLine();
                    System.out.println("Masukkan password: ");
                    password = br.readLine();
                    
                    // masukkan variabel ke dalam constructor
                    akunbaru = new akun(username, password);
                    break;
                    
                case 3:
                    System.out.println("--Lihat akun--");
                    System.out.println("1. Admin");
                    System.out.println("Username : "+admin.getUsername());
                    System.out.println("Password : "+admin.getPassword());
                    System.out.println("\n2. Akun Baru");
                    System.out.println("Username : "+akunbaru.getUsername());
                    System.out.println("Password : "+akunbaru.getPassword());
                    System.out.println("");
                    break;
                    
                case 4:
                    System.out.println("--Ubah password--");
                    //masukkan password lama
                    System.out.println("Masukkan password lama");
                    password2 = br.readLine();
                    //masukkan password baru
                   
                    System.out.println("Masukkan password baru");
                    newpass = br.readLine();
                    //cocokan pass lama dengan data yang sudah ada
                    if (password.equals(password2)){
                    password = newpass;
                    akunbaru.setPassword(newpass);
                    }
                    break;
                    
                case 5:
                    System.exit(0);
            }
            
        }while(true);
            
        }
    
}