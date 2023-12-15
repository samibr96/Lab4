import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CarButtonListeners {

    private CarController carController;
    public CarButtonListeners(CarController carController) {
        this.carController = carController;
    }

    public void Listeners() {
        carController.frame.startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (Vehicle car : carController.cars) {
                    car.startEngine();
                }
            }
        });

        carController.frame.stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (Vehicle car : carController.cars) {
                    car.stopEngine();
                }
            }
        });

        carController.frame.gasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                carController.gas(carController.frame.gasAmount);
            }
        });

        carController.frame.brakeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                carController.brake(carController.frame.gasAmount);
            }
        });

        carController.frame.turboOnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                carController.turboOn();
            }
        });

        carController.frame.turboOffButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                carController.turboOff();
            }
        });

        carController.frame.liftBedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                carController.liftBed();
            }
        });

        carController.frame.lowerBedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                carController.lowerBed();
            }
        });
    }
}
