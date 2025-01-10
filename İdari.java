class Idari implements Personel {
    String adSoyad;
    double maas;

    Idari(String adSoyad, double maas) {
        this.adSoyad = adSoyad;
        this.maas = maas;
    }

    @Override
    public void displayPersonel() {
        System.out.println("İdari Personel: " + adSoyad);
    }
}
