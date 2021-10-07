package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobTest {

    @Test
    public void whenCompatorByNameAndPrority() {
        Comparator<Job> cmpNamePriority = new SortJobNameDec().thenComparing(new SortJobPriorityDec());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByNameIncAndProrityInc() {
        Comparator<Job> cmpNameIncPriorityDec = new SortJobNameInc().thenComparing(new SortJobPriorityInc());
        int rsl = cmpNameIncPriorityDec.compare(
                new Job("Impl task0", 5),
                new Job("Impl task1", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByNameIncAndProrityDec() {
        Comparator<Job> cmpNameIncPriorityDec = new SortJobNameInc().thenComparing(new SortJobPriorityDec());
        int rsl = cmpNameIncPriorityDec.compare(
                new Job("Impl task0", 0),
                new Job("Impl task1", 1)
        );
        assertThat(rsl, lessThan(0));
    }
}
