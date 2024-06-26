# Kata-Fizzbuzz---JAVA
## Description
The `Task` class implements message processing logic for a given index. It determines whether to output "Fizz," "Buzz," or "FizzBuzz" based on the specified index and also returns the index itself if none of the conditions apply.

## Properties
- `index`: An integer representing the index.
- `message`: A string containing the message for the given index.

## Methods
- `public Task(String message, int index)`: Constructor that takes a message and an index, creating a `Task` object.
- `public int getIndex()`: Returns the index.
- `public String getMessage()`: Determines the message for the given index according to the problem conditions.

## Tests
The following aspects are tested:
- **Constructor**: We verify that the `Task` object is correctly initialized.
- **`getIndex()` method**: We check if the `getIndex()` method returns the task index.
- **`getMessage()` method**: We ensure that the `getMessage()` method returns the task message.