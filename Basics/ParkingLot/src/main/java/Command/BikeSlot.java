package Command;

public class BikeSlot implements Slot {
    @Override
    public void allocate() {
        System.out.println("Bike Allocation");
    }

    @Override
    public void release() {
        System.out.println("Bike Allocation Release");
    }
}
