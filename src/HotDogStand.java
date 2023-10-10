public class HotDogStand {
    private int idNumber;
    private int hotDogSoldToday;
    private static int totalHotDogsSold = 0; // static variable to track total hot dogs sold by all stands

    // constructor to initialize both values

    public HotDogStand(int idNumber, int initialHotDogsSold) {
        this.idNumber = idNumber;
        this.hotDogSoldToday = initialHotDogsSold;
        totalHotDogsSold += initialHotDogsSold; // update total when a new stand is created

    }

    // method incrementing number of hot dogs sold

    public void justSold() {
        hotDogSoldToday++;
        totalHotDogsSold++; // update total hot dogs sold across all stands
    }

    // method to get number of hot dogs sold by this specific stand

    public int getHotDogsSold() {
        return hotDogSoldToday;
    }

    // static method to get total number of hot dogs sold by every stand
    public static int getTotalHotDogsSold() {
        return   totalHotDogsSold;
    }

    public static void main(String[] args) {
        // test the HotDogStand class

        // create three hot dog stands with different initial hot dogs sold
        HotDogStand stand1 = new HotDogStand(1, 50);
        HotDogStand stand2 = new HotDogStand(2, 70);
        HotDogStand stand3 = new HotDogStand(3, 60);

        // simulate selling hot dogs at each stand
        stand1.justSold();
        stand2.justSold();
        stand3.justSold();
        stand1.justSold();
        stand2.justSold();
        stand3.justSold();
        stand1.justSold();
        stand2.justSold();

        // display the number of hot dogs sold by each stand
        System.out.println("Stand 1 Hots Dogs Sold: " + stand1.getHotDogsSold());
        System.out.println("Stand 2 Hot Dogs Sold: " + stand2.getHotDogsSold());
        System.out.println("Stand 3 Hot Dogs Sold: " + stand3.getHotDogsSold());

        // display all hot dogs sold by all stands
        System.out.println("Hot Dogs Sold Total: " + HotDogStand.getTotalHotDogsSold());




    }
}
