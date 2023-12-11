import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
public class App {
    private final int delay = 50;
    private Timer timer;
    private CarController carController;


    public static void main(String[] args) {
        App app = new App();
        app.start();
    }

    public App() {
        carController = new CarController();
        timer = new Timer(delay, new TimerListener());
    }

    public void start() {
        carController.cars.add(CarAssembler.assembleSaab(0, 100));
        carController.cars.add(CarAssembler.assembleVolvo(0, 0));
        carController.cars.add(CarAssembler.assembleScania(0, 200));

        carController.frame = new CarView("CarSim 1.0", carController);
        carController.buttonListeners = new CarButtonListeners(carController);
        carController.buttonListeners.Listeners();

        timer.start();
    }

    private class TimerListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            for (Vehicle car : carController.cars) {
                car.move();
                carController.frame.drawPanel.moveIt(car.getX(), car.getY(), car.getModelName());            }
        }
    }
}
