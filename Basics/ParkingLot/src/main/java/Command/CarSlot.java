package Command;

public class CarSlot implements Slot {
    @Override
    public void allocate() {
        System.out.println("Car Slot Allocation");
    }

    @Override
    public void release() {
        System.out.println("Car Slot Release");
    }
}
