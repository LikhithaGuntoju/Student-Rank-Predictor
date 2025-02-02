# Student Rank Predictor
## Project Overview
This project predicts a student's rank based on their quiz scores. It uses historical quiz data and the most recent quiz data to estimate the student's rank. The application consists of a Spring Boot backend that fetches quiz data from external APIs and performs calculations to predict the rank. The frontend is a simple web page where the user can input their ID to get a predicted rank.

## Features
- Fetch and analyze quiz performance data (latest and historical quizzes)
- Identify weak areas and improvement trends
- Predict student NEET rank based on performance patterns
- User-friendly interface for rank prediction
- Fetch and analyze quiz performance data (latest and historical quizzes)
- Identify weak areas and improvement trends
- Predict student NEET rank based on performance patterns
- User-friendly interface for rank prediction
- Backend: Spring Boot (Java), REST API, Spring REST Template
- Frontend: HTML, CSS, JavaScript
- Database/API Sources: External APIs for fetching quiz data
- Tools & Libraries: Maven, Lombok, Eclipse/IntelliJ
   
## Setup Instructions
Prerequisites
- Java 17 or later (for Spring Boot)
- Maven
- An IDE (Eclipse, IntelliJ, or VS Code)
  
## Steps to Run the Project
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

## API Endpoints
- Fetch Current Quiz Data: GET /api/quiz?userId={userId}
- Fetch Historical Quiz Data: GET /api/history?userId={userId}
- Predict Student Rank: GET /api/predict-rank?userId={userId}
  
## Approach Description
1. Data Collection & Processing
    - The system fetches current and historical quiz data using external APIs.
    - The current quiz contains the user's most recent quiz submission.
    - The historical data includes the last five quiz scores for each student.
2. Data Analysis & Insights Generation
   - The rank prediction is based on an improvement factor, calculated by comparing the user's most recent quiz score with their average historical quiz score. A higher improvement factor generally leads to a better rank prediction.
    - The predicted rank is returned as an integer, where the lower the number, the better the rank (e.g., 1 is the best).
3. Rank Prediction Algorithm
    - Calculates an average score from past quizzes.
    - Compares it with the latest quiz performance.
    - Uses a probabilistic model to estimate the NEET rank, based on score improvements and past exam data.

## UI Overview & Screenshots
Homepage:
    - Users enter their User ID and click "Predict My Rank".
Predicted Rank Display:
    -Displays the calculated rank after processing the data.
Sample Screenshot:
![image](https://github.com/user-attachments/assets/379cbe25-ad54-4830-8395-9ddbf1613d8f)


## Future Enhancements
- Integrate Machine Learning models for more accurate rank predictions.
- Improve UI/UX with advanced data visualization.
- Add user authentication for personalized dashboards.

## Contributors
- Likhitha Sri Guntoju

## License
This project is licensed under the MIT License.



