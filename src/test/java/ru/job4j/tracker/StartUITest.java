package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class StartUITest {

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Exit Program" + System.lineSeparator()
        ));
    }

    @Test
    public void whenShowEmpty() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", "1"}
        );
        Tracker tracker = new Tracker();
//        tracker.add(new Item("Name1"));
        UserAction[] actions = {
                new ShowAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator()
                        + "0. Show all items" + System.lineSeparator()
                        + "1. Exit Program" + System.lineSeparator()
                        + "=== Show all items ====" + System.lineSeparator()
                        + "Хранилище еще не содержит заявок" + System.lineSeparator()
                        + "Menu." + System.lineSeparator()
                        + "0. Show all items" + System.lineSeparator()
                        + "1. Exit Program" + System.lineSeparator()

        ));
    }

    @Test
    public void whenShowItem() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", "1"}
        );
        Tracker tracker = new Tracker();
        tracker.add(new Item("Name1"));
        Item item = tracker.findAll()[0];
        UserAction[] actions = {
                new ShowAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator()
                        + "0. Show all items" + System.lineSeparator()
                        + "1. Exit Program" + System.lineSeparator()
                        + "=== Show all items ====" + System.lineSeparator()
                        + item + System.lineSeparator()
                        + "Menu." + System.lineSeparator()
                        + "0. Show all items" + System.lineSeparator()
                        + "1. Exit Program" + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindByName() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", "Name1", "1"}
        );
        Tracker tracker = new Tracker();
        tracker.add(new Item("Name1"));
        Item item = tracker.findByName("Name1")[0];
        UserAction[] actions = {
                new FindByNameAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator()
                        + "0. Find items by name" + System.lineSeparator()
                        + "1. Exit Program" + System.lineSeparator()
                        + "=== Find items by name ====" + System.lineSeparator()
                        + item + System.lineSeparator()
                        + "Menu." + System.lineSeparator()
                        + "0. Find items by name" + System.lineSeparator()
                        + "1. Exit Program" + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindById() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", "1", "1"}
        );
        Tracker tracker = new Tracker();
        tracker.add(new Item("Name1"));
        Item item = tracker.findById(1);
        UserAction[] actions = {
                new FindByIdAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator()
                        + "0. Find item by id" + System.lineSeparator()
                        + "1. Exit Program" + System.lineSeparator()
                        + "=== Find item by id ====" + System.lineSeparator()
                        + item + System.lineSeparator()
                        + "Menu." + System.lineSeparator()
                        + "0. Find item by id" + System.lineSeparator()
                        + "1. Exit Program" + System.lineSeparator()
        ));
    }
}
