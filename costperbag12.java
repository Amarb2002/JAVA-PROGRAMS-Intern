public class costperbag12 {

    public static void main(String[] args) {
        int totalBags = 100;
        int totalPrice = 1000;
        int damagedBags = 12;

        int usableBags = totalBags - damagedBags;
        double costPerBag = (double) totalPrice / usableBags;
        System.out.println("The cost of 1 bag is: " + costPerBag);
    }
}
