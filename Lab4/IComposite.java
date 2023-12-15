public interface IComposite extends Movable
{
    public void gas(float amount);
    public void brake(float amount);
    public void startEngine();
    public void stopEngine();
}
