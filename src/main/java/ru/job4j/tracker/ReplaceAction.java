package ru.job4j.tracker;

public record ReplaceAction(Output out) implements UserAction {

    @Override
    public String name() {
        return "Edit item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter id: ");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            this.out.println("Заявка изменена успешно.");
        } else {
            this.out.println("Ошибка замены заявки.");
        }
        return true;
    }
}
