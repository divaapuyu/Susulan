package tugas2;

public class mahasiswa{
    private String nim, prodi;
    private int spp, angkatan, semester, bayar_spp_semester;
    
    //setter
    public void setnim(String nim){
        this.nim=nim;
    }
    
    public void setprodi(String prodi){
        this.prodi=prodi;
    }
    
    public void setspp(){
       if (getangkatan()>17) {
            spp=15000000;
        }else{
            spp=12000000;
        }
    }

    public void setangkatan(int angkatan) {
        this.angkatan=angkatan;
    }

    public void setsemester(int semester) {
        this.semester=semester;
    }

    // getter
    public String getnim() {
        return this.nim;
    }

    public String getprodi() {
        return this.prodi;
    }

    public int getangkatan() {
        return this.angkatan;
    }

    public int getsemester() {
        return this.semester;
    }

    // custom
    public int getspp() {
        this.bayar_spp_semester = this.spp*getsemester();
        return this.bayar_spp_semester;
    }
}
