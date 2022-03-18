package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class FindByNameItemAction implements UserAction {

    private final Output out;

    public FindByNameItemAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find items by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find items by name ===");
        String name = input.askStr("Enter name: ");
        List<Item> result = tracker.findByName(name);
        for (Item item : result) {
            if (item.getName().equals(name)) {
                out.println(item);
            } else {
                out.println("Заявки с именем: " + name + " не найдены.");
            }
        }
        return true;
    }
}
