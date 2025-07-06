package oop.abstraction;


abstract class VideoGame {

    protected long ramSize;
    protected String cpuModel;
    protected String gpuModel;

    public String productCode;

    public VideoGame(long ramSize, String cpuModel, String gpuModel) {
        this.ramSize = ramSize;
        this.cpuModel = cpuModel;
        this.gpuModel = gpuModel;
    }

    void powerOn() {
        System.out.println("Turn on the Video Game!");
    }

    void powerOff() {
        System.out.println("Torn off the Video game!");
    }

}
