public class Task {
    public int index;
    public String message;

    public Task(String message, int index) {
        this.index = index;
        this.message = message;
    }

    public int getIndex() {
     return index;
    }

    public String getMessage() {
        if (this.index % 3 == 0 && this.index % 5 == 0) {
            return this.message ="FizzBuzz";
        }
        if (this.index % 3 == 0) {
            return this.message = "Fizz";
        }
        if (this.index % 5 == 0) {
            return this.message = "Buzz";
        }
        return "200";
    }
    public static void toControl() {
        for (int i = 1; i <= 100; i++) {
            Task task = new Task("", i);
            if (!task.getMessage().equals("200")) {
                System.out.println(task.getMessage());
            } else {
                System.out.println(task.getIndex());
            }
        }

    }
}

