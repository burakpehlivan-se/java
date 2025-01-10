class FakulteSekreteri extends Idari {
    FakulteSekreteri(String adSoyad, double maas) {
        super(adSoyad, maas);
    }

    void printFS() {
        System.out.println("Fakülte Sekreteri: " + adSoyad);
    }

    void addMaas() {
        maas += 500;
    }
}
