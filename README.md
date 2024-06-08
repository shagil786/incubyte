# String Calculator TDD Kata

This project is a simple string calculator implemented using Test-Driven Development (TDD) principles. The calculator can sum up numbers provided in a string format, supporting different delimiters, handling new lines, and throwing exceptions for negative numbers.

## Requirements

- Java 1.8+
- Maven 3.6.0+
- JUnit 4.13.2

## Setup

1. **Clone the repository**:

   ```bash
   git clone https://github.com/shagil786/incubyte.git
   cd incubyte

   mvn clean install```

### Supported Features

The `StringCalculator` class supports the following features:

- **Empty strings**: Returns `0`.
- **Single numbers**: Returns the number itself.
- **Two or more numbers, separated by commas**: Returns the sum of all numbers.
- **Newline characters as separators**: Allows using newline characters as well as commas for separating numbers.
- **Custom delimiters**: Supports custom delimiters defined in the format `//[delimiter]\n[numbers...]`.
- **Exception Handling**: Throws an exception if negative numbers are present in the input.
