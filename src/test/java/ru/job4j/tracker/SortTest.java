package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class SortTest {

    @Test
    public void whenSortItemByNameAcs() {
        Item itemOne = new Item(1, "One");
        Item itemTwo = new Item(3, "Two");
        Item itemThree = new Item(2, "Three");
        Item itemFour = new Item(5, "Four");
        List<Item> itemList = Arrays.asList(itemOne, itemTwo, itemThree, itemFour);
        Collections.sort(itemList, new ItemAscByName());
        List<Item> expected = Arrays.asList(
                itemFour,
                itemOne,
                itemThree,
                itemTwo
        );
        assertThat(expected, is(itemList));
    }

    @Test
    public void whenSortItemByNameDesc() {
        Item itemOne = new Item(1, "One");
        Item itemTwo = new Item(3, "Two");
        Item itemThree = new Item(2, "Three");
        Item itemFour = new Item(5, "Four");
        List<Item> itemList = Arrays.asList(itemOne, itemTwo, itemThree, itemFour);
        Collections.sort(itemList, new ItemDescByName());
        List<Item> expected = Arrays.asList(
                itemTwo,
                itemThree,
                itemOne,
                itemFour
        );
        assertThat(expected, is(itemList));
    }

}