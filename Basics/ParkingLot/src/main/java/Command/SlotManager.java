package Command;

public class SlotManager {
    private Command cmd;

    public void setCmd(Command cmd) {
        this.cmd = cmd;
    }

    public void Execute() {
        this.cmd.execute();
    }
}
