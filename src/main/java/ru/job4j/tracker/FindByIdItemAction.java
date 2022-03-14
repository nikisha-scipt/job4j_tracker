package ru.job4j.tracker;

import java.util.Objects;

public record FindByIdItemAction(Output out) implements UserAction {

    @Override
    public String name() {
        return "Find item by id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find item by id ===");
        int id = input.askInt("Enter id: ");
        Item item = tracker.findById(id);
        out.println(Objects.requireNonNullElseGet(item, () -> "Заявка с введенным id: " + id + " не найдена."));
        return true;
    }
}
