public class RemoveCarCommand implements Command {
    private CarController carController;

    public RemoveCarCommand(CarController carController) {
        this.carController = carController;
    }

    @Override
    public void execute() {

    }
}
