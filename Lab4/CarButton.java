public class CarButton {
    private Command command;

    public CarButton(Command command) {
        this.command = command;
    }

    public void click() {
        command.execute();
    }
}
