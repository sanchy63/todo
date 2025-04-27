package Main.SystemDesign.LLD.BasicOops;

interface InputDevice {
   void input();
    
}

class KeyboardDevice implements InputDevice {
    public void input() {
        System.out.println("Typing with keyboard");
    }
}

class WirelessDevice implements InputDevice {
    public void input() {
        System.out.println("Typing with wireless device");
    }
}

class Computer {
    private InputDevice inputDevice;

    public Computer(InputDevice inputDevice) {
        this.inputDevice = inputDevice;
    }

    public void use() {
        inputDevice.input();
    }
}

public class DIP {
    public static void main(String[] args) {
        InputDevice device = new KeyboardDevice(); // You can switch devices easily
        Computer computer = new Computer(device);
        computer.use();
    }
}
