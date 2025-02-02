# Student Rank Predictor
## Project Overview
This project predicts a student's rank based on their quiz scores. It uses historical quiz data and the most recent quiz data to estimate the student's rank. The application consists of a Spring Boot backend that fetches quiz data from external APIs and performs calculations to predict the rank. The frontend is a simple web page where the user can input their ID to get a predicted rank.
## Approach
1. Backend (Spring Boot):
    - The backend is built using Spring Boot and contains two key services:
        - HistoricalDataService: Fetches historical quiz data for a given user.
        - QuizDataService: Fetches the most recent quiz data for the user.
    - The backend exposes an API (/api/predict-rank) which takes a user ID as input and returns the predicted rank based on an improvement factor calculated using past quiz scores.
2. Frontend (HTML, CSS, JavaScript):
   - The frontend consists of a simple HTML form where users can input their ID and click a button to fetch their predicted rank.
    - The results are displayed dynamically using JavaScript after fetching data from the backend API.
## Setup Instructions
Prerequisites
- Java 17 or later (for Spring Boot)
- Maven (for building the project)
- Node.js and npm (for frontend, if needed)
## Steps for Backend Setup
1. Clone the repository:
    ```bash
    git clone <repository-url>
    cd <project-directory>
2. Navigate to the project directory and build the backend using Maven:
    ```bash
    mvn clean install
3. Run the Spring Boot application:
   ```bash
   mvn spring-boot:run
4. The application will be running on http://localhost:8080. You can access the rank prediction API by making a GET request to /api/predict-rank?userId=<userId>.
## Steps for Frontend Setup
1. Open the index.html file in a browser. If you're using any build tools for the frontend (like Webpack or a simple local server), follow their setup instructions to serve the HTML.

2. When you input a User ID and click "Predict My Rank," the frontend will call the backend API to get the predicted rank and display it on the page.
## Key Visualizations
    - Predicted Rank Display: After entering a valid User ID, the predicted rank will be shown in an <h2> element.
