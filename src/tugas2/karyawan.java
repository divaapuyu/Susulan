package tugas2;

public class karyawan {
private String nik, bagian;
private int kehadiran, gaji_per_hari, totalgaji;

    // Setter
    public void setnik(String nik) {
        this.nik=nik;
    }

    public void setbagian(String bagian) {
        this.bagian=bagian;
    }

    public void setkehadiran(int kehadiran) {
        this.kehadiran=kehadiran;
    }

    public void setgaji(int gph) {
        gaji_per_hari=gph;
    }

    // Getter
    public String getnik() {
        return this.nik;
    }

    public String getbagian() {
        return this.bagian;
    }

    public int getkehadiran() {
        return this.kehadiran;
    }

    public int getgph() {
        return this.gaji_per_hari;
    }

    public int getgaji() {
        totalgaji = getgph() * getkehadiran();
        return this.totalgaji;
    }
}
