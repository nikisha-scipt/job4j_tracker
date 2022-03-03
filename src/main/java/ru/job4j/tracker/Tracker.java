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
        boolean result = index != -1;
        if (result) {
            item.setId(id);
            items[index] = item;
        }
        return result;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        int start = index + 1;
        int length = this.size - index - 1;
        boolean rsl = index != -1;
        if (rsl) {
            System.arraycopy(this.items, start, this.items, index, length);
            items[size - 1] = null;
            this.size--;
        }
        return rsl;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String name) {
        Item[] rsl = new Item[this.size];
        int count = 0;
        for (int i = 0; i < this.size; i++) {
            Item item = items[i];
            if (Objects.equals(item.getName(), name)) {
                rsl[count++] = item;
            }
        }
        rsl = Arrays.copyOf(rsl, count);
        return rsl;
    }

}