public class Main {
    public static void main(String[] args) {

        Akademik akademik = new Akademik("Ahmet Yılmaz", "Docent", 5000);
        akademik.displayPersonel();


        Yonetici yonetici = new Yonetici("Mehmet Demir", 7000, "Profesör", "Dekan");
        yonetici.printYonetici();
        yonetici.addMaas();
        System.out.println("Yeni maaş: " + yonetici.maas);


        FakulteSekreteri sekreter = new FakulteSekreteri("Ayşe Kaya", 4000);
        sekreter.printFS();
        sekreter.addMaas();
        System.out.println("Yeni maaş: " + sekreter.maas);
    }
}