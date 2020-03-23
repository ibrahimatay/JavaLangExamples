package interfaces;

public interface Vehicle {
    String getBrand();
    String speedUp();
    String slowDown();

    static int getHorsePower(int rpm, int torque){
        return (rpm * torque) / 5252;
    }
}
