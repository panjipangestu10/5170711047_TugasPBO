package tugaspengganti;

public class manusia {

    private String wajah;
    private String tubuh;
    private int pendidikan;
    private String orang;

    public String getOrang() {
        return orang;
    }

    public void setOrang(String orang) {
        this.orang = orang;
    }

    public int getPendidikan() {
        return pendidikan;
    }

    public void setPendidikan(int pendidikan) {
        this.pendidikan = pendidikan;
    }

    public String getWajah() {
        return wajah;
    }

    public void setWajah(String wajah) {
        this.wajah = wajah;
    }

    public String getTubuh() {
        return tubuh;
    }

    public void setTubuh(String tubuh) {
        this.tubuh = tubuh;
    }

    public void tampilkandata() {
        System.out.println("tingkat wajah :" + getWajah());
        System.out.println("postur tubuh :" + getTubuh());
        System.out.println("tingkat pendidikan :" + getPendidikan() + "semester");
        System.out.println("tipe orangnya :" + getOrang());

    }

    public void inputData(String m, String w, String j, int jp) {
        setWajah(m);
        setTubuh(w);
        setOrang(j);
        setPendidikan(jp);

    }
}
