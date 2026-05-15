package Observator;

public interface ISubiect {
    void addObservator(IObservator observator);
    void removeObservator(IObservator observator);
    void notifyAll(String mesaj);
}
