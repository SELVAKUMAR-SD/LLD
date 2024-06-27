package Command;

public class AllocateSlot implements Command {
    private Slot slot;

    public AllocateSlot(Slot slot) {
        this.slot = slot;
    }

    @Override
    public void execute() {
        this.slot.allocate();
        System.out.println("Allocate Slot Success");
    }
}
