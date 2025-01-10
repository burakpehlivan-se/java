public class Akademik implements Personel{

    String adSoyad;
    String unvan;
    double maas;


    public Akademik(String adSoyad, String unvan, double maas) {
        this.adSoyad = adSoyad;
        this.unvan = unvan;
        this.maas = maas;
    }

    @Override
    public void displayPersonel() {
        System.out.println("Akademik Personel: " + this.unvan + adSoyad);
    }

}
