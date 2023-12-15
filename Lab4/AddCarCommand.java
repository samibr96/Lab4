public class AddCarCommand implements Command {
    private CarController carController;

    public AddCarCommand(CarController carController) {
        this.carController = carController;
    }

    @Override
    public void execute() {

    }
}
