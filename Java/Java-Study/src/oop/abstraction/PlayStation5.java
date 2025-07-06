package oop.abstraction;

class PlayStation5 extends VideoGame{

    public PlayStation5() {
        super(16, "AMD Zen 2 8 cores | 3.5 Ghz", "10.28 TFLOPs - 36 CUs | 2.23 GHz");
    }

    public static void main(String[] args) {

        PlayStation5 playStation5 = new PlayStation5();

        playStation5.powerOn();
        playStation5.powerOff();

        // We can change ->
        playStation5.ramSize = 8;
        System.out.println("Ram size: " + playStation5.ramSize);

        playStation5.productCode = "PS5SY63FG";

    }

}
