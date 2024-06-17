import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest1 {
    int index;
    String message;

    @Test
    public void should_receive_2_arguments() {
        Task task = new Task(message, index);
        assertNotNull(task);
    }

    @Test
    public void should_receive_the_index_property_as_its_1st_argument() {
        Task task = new Task(message, 3);
        assertNotNull(task.index);
    }

    @Test
    public void should_receive_the_message_property_as_its_2st_argument() {
        Task task = new Task("", index);
        assertNotNull(task.message);
    }

    @Test
    public void should_return_the_index() {
        Task task = new Task(message, index);
        assertEquals(index, task.getIndex());
    }

    @Test
    public void should_return_the_FizzBuzz() {
        Task task = new Task(message, 15);
        String result = task.getMessage();
        assertEquals("FizzBuzz", result);
    }

    @Test
    public void should_return_the_Fizz() {
        Task task = new Task(message, 3);
        String result = task.getMessage();
        assertEquals("Fizz",result);
    }

    @Test
    public void should_return_the_Buzz() {
        Task task = new Task(message, 5);
        String result = task.getMessage();
        assertEquals("Buzz", result);
    }

    @Test
    public void should_return_the_200() {
        Task task = new Task(message, 101);
        String result = task.getMessage();
        assertEquals("200", result);
    }
}