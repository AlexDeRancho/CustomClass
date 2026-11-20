public class SoccerCampWorkout {
   private String name; 
   private String catagory;
   private int numberOfPlayers;
   private double monthlyPaymentFree;
   private double paymentAvailable;
   private double meetingCost;
   //constructors
   public SoccerCampWorkout() {
   catagory = "training";
   numberOfPlayers = 50;
   monthlyPaymentFree = 0.0;
   paymentAvailable = 100.000;
   meetingCost = 100.000;
   }
   public SoccerCampWorkout(String name, String catagory, int numberOfPlayers, double monthlyPaymentFree, double paymentAvailable, double meetingCost) {
   this.name = name;
   this.catagory = catagory;
   this.numberOfPlayers = numberOfPlayers;
   this.monthlyPaymentFree = monthlyPaymentFree;
   this.paymentAvailable = paymentAvailable;
   this.meetingCost = meetingCost;
   }
   //methods
   public void meet() {
      paymentAvailable -= meetingCost;
       System.out.println("Subtracted" + meetingCost + "from paymentAvailable. payment Avialable: " + paymentAvailable);
   }
}