package Command;

public class ReleaseSlot implements Command {

    private Slot slot;

    public ReleaseSlot(Slot slot) {
        this.slot = slot;
    }

    @Override
    public void execute() {
        this.slot.release();
        System.out.println("Release Slot Success");
    }
}
