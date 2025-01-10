class Yonetici extends Akademik {
    String yoneticiDurum;

    Yonetici(String adSoyad, double maas, String unvan, String yoneticiDurum) {
        super(adSoyad, unvan, maas);
        this.yoneticiDurum = yoneticiDurum;
    }

    void printYonetici() {
        System.out.println(yoneticiDurum + " - " + unvan + ": " + adSoyad);
    }

    void addMaas() {
        if (yoneticiDurum.equals("Dekan")) {
            maas += 800;
        } else if (yoneticiDurum.equals("Dekan Yardımcısı")) {
            maas += 600;
        } else if (yoneticiDurum.equals("Bölüm Başkanı")) {
            maas += 400;
        }
    }
}