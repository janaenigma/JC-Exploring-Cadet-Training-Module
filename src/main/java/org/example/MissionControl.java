package org.example;

public class MissionControl {
    public static void main(String[] args) {
        System.out.println("--- Deploying QuadCopter Unit ---");
        QuadCopter bravo_1 = new QuadCopter("Bravo-1");

        bravo_1.takeOff();
        bravo_1.fly();

        System.out.println("\n--- Engaging Recon Capabilities ---");

        bravo_1.takePicture();
        bravo_1.record4kVideo();

        System.out.println("Standard Lens Type: " + VisualRecon.getStandardLensType());

        bravo_1.land();
    }
}