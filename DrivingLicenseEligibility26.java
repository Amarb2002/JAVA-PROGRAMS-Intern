public class DrivingLicenseEligibility26 {

  public static void main(String[] args) {
    int age = 15;

    if (age > 17) {
      System.out.println("Eligible for driving license");
    } else {
      System.out.println("Not eligible yet, wait for " + (17 - age) + " years");
    }
  }
}
