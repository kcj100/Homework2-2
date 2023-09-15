package letsgo;

public class TasteTester {
    public static void main(String[] args) {
        BirthdayCake birthdayCake = new BirthdayCake("chocolate");
        WeddingCake weddingCake = new WeddingCake("strawberry");
        birthdayCake.setPrice(30.50);
        weddingCake.setPrice(40.50);

        System.out.println("Birthday Cake: flavor = " + birthdayCake.getFlavor()
        + ", price = " + birthdayCake.getPrice());

        System.out.println("Wedding Cake: flavor = " + weddingCake.getFlavor()
                + ", price = " + weddingCake.getPrice());
    }


}
