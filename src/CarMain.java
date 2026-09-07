//public class CarMain {
//
//    public static void main(String[] args) {
//
//        // Simple car
//        Car simpleCar = new Car();
//
//        System.out.println("SIMPLE CAR");
//        System.out.println(simpleCar.getDescription());
//        System.out.println(simpleCar.getPrice());
//        System.out.println(simpleCar.getEngineData().getPower());
//
//        System.out.println("Music System: " + simpleCar.getMusicSystemData());
//
//        System.out.println("==================================================");
//
//        // Premium car
//        Engine premiumEngine = new Engine("Diesel", "3600cc");
//
//        MusicSystem premiumMusicSystem =
//                new MusicSystem("Sony", "Dolby with 3D");
//
//        Car premiumCar = new Car(
//                "Toyota Fortuner",
//                342523,
//                premiumEngine,
//                premiumMusicSystem
//        );
//
//        System.out.println("PREMIUM CAR");
//        System.out.println(premiumCar.getDescription());
//        System.out.println(premiumCar.getPrice());
//        System.out.println(premiumCar.getEngineData().getPower());
//
//        System.out.println(premiumCar.getMusicSystemData().getMake());
//        System.out.println(premiumCar.getMusicSystemData().getSoundEffect());
//    }
//}
