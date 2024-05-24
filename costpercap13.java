public class costpercap13 {

    public static void main(String[] args) {
        int totalCaps = 100;
        int totalPrice = 1000;
        int damagedCaps = 10;
        int foodExpense = 200;
        int travelExpense = 300;

        int usableCaps = totalCaps - damagedCaps;  //90
        double totalExpenses = foodExpense + travelExpense;  //500
        double totalCost = totalPrice + totalExpenses;   //1500
        double costPerCap = totalCost / usableCaps;  //1500/90
        System.out.println("The cost of 1 cap is: " + costPerCap);
    }
}
