//```java
//public class OfflineTraning extends Training {
//
//    private String venueDetails;
//
//    public OfflineTraning() {
//        super();
//    }
//
//    public OfflineTraning(String moduleName, int duration, String venueDetails) {
//        super(moduleName, duration);
//        this.venueDetails = venueDetails;
//    }
//
//    public String getVenueDetails() {
//        return venueDetails;
//    }
//
//    public void setVenueDetails(String venueDetails) {
//       
//
//    @Override
//    public void conductTraining() {
//
//        System.out.println("Conduct the training on " + this.getModuleName());
//        System.out.println("for " + getDuration() + " Days");
//        System.out.println("at " + venueDetails);
//   
//
////
////@Override
////public void conductTraining()
////```
////
////`@Override` tells Java that this method is **overriding the `conductTraining()` method of the parent `Training` class**.
////
////Make sure your parent class has:
////
////```java
////public void conductTraining() {
////    // parent implementation
////
