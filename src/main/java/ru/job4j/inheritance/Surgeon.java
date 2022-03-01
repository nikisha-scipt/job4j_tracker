package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    private String surgicalInstrument;

    public Surgeon(String name, String surname, String education, String birthday, String surgicalInstrument) {
        super(name, surname, education, birthday);
        this.surgicalInstrument = surgicalInstrument;
    }

    public String getSurgicalInstrument() {
        return surgicalInstrument;
    }

    public void setSurgicalInstrument(String surgicalInstrument) {
        this.surgicalInstrument = surgicalInstrument;
    }
}
