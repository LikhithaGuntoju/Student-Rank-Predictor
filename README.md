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

