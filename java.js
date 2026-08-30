// script.js

// Wait until page loads
document.addEventListener("DOMContentLoaded", function() {
  
  const form = document.querySelector("form");
  
  form.addEventListener("submit", function(event) {
    event.preventDefault(); // stop default form submission
    
    const username = document.getElementById("username").value.trim();
    const password = document.getElementById("password").value.trim();
    
    // Basic validation
    if (username === "" || password === "") {
      alert("⚠️ Please fill in all fields!");
      return;
    }
    
    // Demo login check (replace with backend later)
    if (username === "farmer" && password === "1234") {
      alert("✅ Login successful! Redirecting to dashboard...");
      window.location.href = "dashboard.html"; // redirect to farmer dashboard
    } else {
      alert("❌ Invalid credentials. Try again!");
    }
  });
});