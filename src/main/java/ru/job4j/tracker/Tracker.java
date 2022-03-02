package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Objects;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean isReplace = index < 0;
        if (isReplace) {
            isReplace = false;
        } else {
            items[index].setName(item.getName());
            isReplace = true;
        }
        return isReplace;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        int start = index + 1;
        boolean isDelete = index < 0;
        if (isDelete) {
            isDelete = false;
        } else {
            System.arraycopy(this.items, start, this.items, index, this.size - index - 1);
            items[size - 1] = null;
            this.size--;
            isDelete = true;
        }
        return isDelete;
    }

    public Item[] findAll() {
        Item[] rsl = new Item[this.size];
        for (int i = 0; i < this.size; i++) {
            Item item = items[i];
            if (item.getName() != null) {
                rsl[i] = item;
            }
        }
        return rsl;
    }

    public Item[] findByName(String name) {
        Item[] rsl = new Item[this.size];
        for (int i = 0; i < this.size; i++) {
            Item item = items[i];
            if (Objects.equals(item.getName(), name)) {
                rsl[i] = item;
                this.size--;
            }
        }
        rsl = Arrays.copyOf(rsl, this.size);
        return rsl;
    }

}