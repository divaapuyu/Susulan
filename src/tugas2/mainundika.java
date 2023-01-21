
package tugas2;
import java.io.*;

public class mainundika {
 public static void main(String[] args) {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int pilih = 0;
        undika merr = new undika();
        mahasiswa mhs = new mahasiswa();
        karyawan krywn = new karyawan();

        try {
            do {
                System.out.println("\n----------MENU----------");
                System.out.println("1. Cek SPP Mahasiswa");
                System.out.println("2. Cek Gaji Karyawan");
                System.out.println("3. Keluar Aplikasi");
                System.out.print("Pilih menu: ");
                pilih = Integer.parseInt(rd.readLine());
                System.out.println("---------------------------\n");
                switch (pilih) {
                    case 1:
                        System.out.println("========Cek SPP Mahasiswa=======");
                        System.out.print("Nama\t\t: ");
                        merr.setnama(rd.readLine());
                        System.out.print("Alamat\t\t: ");
                        merr.setalamat(rd.readLine());
                        System.out.print("NIM\t\t: ");
                        mhs.setnim(rd.readLine());
                        System.out.print("Prodi\t\t: ");
                        mhs.setprodi(rd.readLine());
                        System.out.print("Angkatan\t: ");
                        mhs.setangkatan(Integer.parseInt(rd.readLine()));
                        mhs.setspp();
                        System.out.print("Semester\t: ");
                        mhs.setsemester(Integer.parseInt(rd.readLine()));

                        
                        System.out.println("---SPP Mahasiswa---");
                        System.out.println("Nama\t\t: " + merr.getnama());
                        System.out.println("Alamat\t\t: " + merr.getalamat());
                        System.out.println("NIM\t\t: " + mhs.getnim());
                        System.out.println("Prodi\t\t: " + mhs.getprodi());
                        System.out.println("Angkatan\t: " + mhs.getangkatan());
                        System.out.println("Semester\t: " + mhs.getsemester());
                        System.out.println("SPP\t\t: Rp " + mhs.getspp());
                        System.out.println("################");
                        break;

                    case 2:
                        System.out.println("####### INPUT DATA #######");
                        System.out.print("Nama\t\t: ");
                        merr.setnama(rd.readLine());
                        System.out.print("Alamat\t\t: ");
                        merr.setalamat(rd.readLine());
                        System.out.print("NIK\t\t: ");
                        krywn.setnik(rd.readLine());
                        System.out.print("Bagian\t\t: ");
                        krywn.setbagian(rd.readLine());
                        System.out.print("Kehadiran\t: ");
                        krywn.setkehadiran(Integer.parseInt(rd.readLine()));
                        System.out.print("Gaji per hari\t: ");
                        krywn.setgaji(Integer.parseInt(rd.readLine()));

                        // Cetak spasi
                        for (int i = 0; i < 2; i++) {
                            System.out.println();
                        }
                        System.out.println("####### Gaji Karyawan #######");
                        System.out.println("Nama\t\t: " + merr.getnama());
                        System.out.println("Alamat\t\t: " + merr.getalamat());
                        System.out.println("NIK\t\t: " + krywn.getnik());
                        System.out.println("Bagian\t\t: " + krywn.getbagian());
                        System.out.println("Kehadiran\t: " + krywn.getkehadiran());
                        System.out.println("Gaji per hari\t: " + krywn.getgph());
                        System.out.println("Total gaji\t: " + krywn.getgaji());
                        System.out.println("################");
                        break;

                    case 3:
                        System.exit(0);
                        break;

                    default:
                        break;
                }
            } while (true);
        } catch (Exception e) {
            System.out.println("Ups ada yang salah");
        }
    }
}