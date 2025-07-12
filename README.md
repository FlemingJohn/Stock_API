# Stock_API

This repository contains the basic working of a stock API (static) implemented in Java.

## Features

- Provides basic stock information via an API
- Static data implementation for demonstration or prototyping
- Written entirely in Java

## Getting Started

### Prerequisites

- Java (JDK 8 or higher)
- [Optional] Maven or Gradle for dependency management and building

### Setup

1. Clone the repository:
    ```bash
    git clone https://github.com/FlemingJohn/Stock_API.git
    cd Stock_API
    ```
2. Compile and run the project:
    ```bash
    javac <YourMainClass>.java
    java <YourMainClass>
    ```
    Replace `<YourMainClass>` with your actual main class name.

## Usage

The API exposes endpoints to fetch static stock data.

### Example Endpoint

Fetch details for a specific stock symbol (e.g., INFY):

```
GET http://localhost:8080/api/stocks/INFY
```

#### Example Response

```json
{
  "symbol": "INFY",
  "currentPrice": 925.235620807763,
  "previousPrice": 926.40876762527,
  "trend": "Downward"
}
```

- **symbol**: The stock symbol (e.g., INFY)
- **currentPrice**: The current stock price
- **previousPrice**: The previous closing price
- **trend**: Indicates price movement ("Upward", "Downward", etc.)

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss your proposed changes.

