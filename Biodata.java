package LatihanClass3a;

public class Biodata {
    private String nama;
    private String nim;
    private int umur;
    private String JK;

    public String getJK() {
        String JK = "Perempuan";
        if (this.JK == "L") {
            JK = "LELAKI SEJATI + GANTENG + TAMPAN";
        }
        return JK;
    }

    public void setJK(String JK) {
        this.JK = JK;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public static void main(String[] args) {
        Biodata biodata = new Biodata();
        biodata.setNim("2021071016");
        biodata.setNama("Muhammad Daffa Stokhorst");
        biodata.setUmur(20);
        biodata.setJK("L");

        System.out.println("NIM : " + biodata.getNim());
        System.out.println("Nama : " + biodata.getNama());
        System.out.println("Umur : " + biodata.getUmur() + "thn");
        System.out.println("Jenis Kelamin : " + biodata.getJK());
    }
}

