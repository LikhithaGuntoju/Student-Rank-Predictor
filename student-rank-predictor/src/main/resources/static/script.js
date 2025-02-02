function fetchRank() {
    let userId = document.getElementById('userId').value;
    let rankResult = document.getElementById('rankResult');
    
   // Validate if the user ID is valid (numeric)
    if (!userId || !/^\d+$/.test(userId)) {
        alert("Invalid User ID. Please enter a valid numeric User ID.");
        rankResult.innerText = "";// Clear previous rank result
        return;
    }

    fetch(`/api/predict-rank?userId=${userId}`)
        .then(response => {
            // Check if the response is OK
            if (!response.ok) {
                throw new Error('Error fetching rank');
            }
            return response.json();
        })
        .then(data => {
            rankResult.innerText = "Predicted Rank: " + data;
        })
        .catch(error => {
            console.error("Error:", error);
            alert("An error occurred. Please try again.");
        });
}