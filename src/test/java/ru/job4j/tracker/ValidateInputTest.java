package ru.job4j.tracker;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ValidateInputTest {

    @Test
    public void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"one", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(1));
    }

    @Test
    public void whenValidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"3"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(3));
    }

    @Test
    public void whenOutputIsMinus1() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"error", "-1"}
        );
        ValidateInput validateInput = new ValidateInput(out, in);
        validateInput.askInt("Enter menu:");
        assertThat(out.toString(), is("Please enter validate data again."
                + System.lineSeparator()));
    }

    @Test
    public void whenMultipleValidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"1", "2", "3"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selectedOne = input.askInt("Enter menu:");
        assertThat(selectedOne, is(1));
        int selectedTwo = input.askInt("Enter menu:");
        assertThat(selectedTwo, is(2));
        int selectedThree = input.askInt("Enter menu:");
        assertThat(selectedThree, is(3));
    }

}