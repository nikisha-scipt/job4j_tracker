package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    private String surgicalInstrument;

    public Surgeon(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public String getSurgicalInstrument() {
        return surgicalInstrument;
    }

    public void setSurgicalInstrument(String surgicalInstrument) {
        this.surgicalInstrument = surgicalInstrument;
    }
}
