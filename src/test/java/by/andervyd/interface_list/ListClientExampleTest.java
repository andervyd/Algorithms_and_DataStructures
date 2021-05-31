package by.andervyd.interface_list;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class ListClientExampleTest {

    @Test
    public void testListClientExample() {
        ListClientExample listClient = new ListClientExample();
        List list = listClient.getList();

        assertThat(list, instanceOf(LinkedList.class));
    }
}