package Command;

public class Client {
    public static void main(String[] args) {
        Slot carSlot = new CarSlot();
        SlotManager manageSlot = new SlotManager();
        // Allocate new slot
        Command allocateCmd = new AllocateSlot(carSlot);
        manageSlot.setCmd(allocateCmd);
        manageSlot.Execute();

        // Release Occupied Slot
        Command releaseCmd = new ReleaseSlot(carSlot);
        manageSlot.setCmd(releaseCmd);
        manageSlot.Execute();
    }
}
