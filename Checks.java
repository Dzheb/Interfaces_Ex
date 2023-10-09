package org.example.task4;

public abstract class Checks {
    static void speciality(Developer developer) {
        if (developer instanceof Frontender) {
            ((Frontender) developer).developGUI();
        } else {
            System.out.println("This Developer does not make GUI");
        }

    }
}
