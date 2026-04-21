# Disease Surveillance & Outbreak Reporter System

An advanced, production-ready enterprise application designed for monitoring public health and managing disease outbreaks. Built to align with the UN Sustainable Development Goals: **SDG 3 (Good Health and Well-being)** and **SDG 17 (Partnerships for the Goals)**.

## 🚀 Key Features

*   **Real-time Sensor Integration:** Utilizes a raw Java `ServerSocket` engine to ingest real-time data from various health monitoring sensors.
*   **High-Performance Data Processing:** Employs native JDBC batch operations to handle massive volumes of vaccination records efficiently.
*   **Advanced Analytics:** Implements a multithreaded analytical scheduling system using `ThreadPoolExecutor` to process data without blocking the main application flow.
*   **Performance Metrics:** Tracks "Alert-to-Action Latency" to measure system responsiveness and response times during critical events.
*   **Secure Access Management:** Robust Role-Based Access Control (RBAC) via Spring Security, supporting granular permissions for `Admin` and `Editor` roles.
*   **Premium User Interface:** A fully responsive, modern dashboard built with Tailwind CSS for an optimal user experience.

## 🛠️ Technology Stack

*   **Backend:** Java, Spring Boot, Spring Security, Spring Web
*   **Database Integration:** JDBC (Native Batch Processing)
*   **Multithreading:** Java Concurrency (`ThreadPoolExecutor`, `ServerSocket`)
*   **Frontend:** HTML5, CSS3, Tailwind CSS (via CDN or Build Tool), Thymeleaf
*   **Build Tool:** Maven

## ⚙️ Prerequisites

Before you begin, ensure you have met the following requirements:
*   **Java Development Kit (JDK):** Version 17 or higher
*   **Maven:** (Included via Maven Wrapper `mvnw`)
*   **Database:** (Configuration details defined in `application.properties`)

## 🚀 Getting Started

Follow these steps to set up the project locally:

1.  **Clone the repository:**
    ```bash
    git clone https://github.com/your-username/disease-surveillance-system.git
    cd disease-surveillance-system
    ```

2.  **Configure the Database:**
    Open `src/main/resources/application.properties` and update your database credentials:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
    spring.datasource.username=your_username
    spring.datasource.password=your_password
    ```

3.  **Build and Run the Application:**
    Use the included Maven wrapper to run the application:
    
    *   **Windows:**
        ```cmd
        mvnw.cmd spring-boot:run
        ```
    *   **macOS/Linux:**
        ```bash
        ./mvnw spring-boot:run
        ```

4.  **Access the Application:**
    Open your web browser and navigate to:
    ```
    http://localhost:8080
    ```

## 🤝 Contributing

Contributions, issues, and feature requests are welcome! Feel free to check the [issues page](https://github.com/your-username/disease-surveillance-system/issues).

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
