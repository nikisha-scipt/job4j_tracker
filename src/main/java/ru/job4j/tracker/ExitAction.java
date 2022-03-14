package ru.job4j.tracker;

public record ExitAction(Output out) implements UserAction {

    @Override
    public String name() {
        return "Exit Program";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        return false;
    }
}
