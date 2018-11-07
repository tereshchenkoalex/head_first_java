package io.github.tereshchenkoalex.chapter2;

public class DtumKitTestDrive {
    public static void main (String[] args){
        DrumKit d = new DrumKit();
        d.snare = false;

        if (d.snare == true) {
            d.playSnare();
        }

        d.playSnare();
        d.playTopHat();
    }
}
