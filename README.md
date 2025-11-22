# Jenkins–GitHub CI/CD Pipeline Integration

This project demonstrates end-to-end CI/CD automation using **GitHub**, **Jenkins**, and **Maven**.  
The pipeline is configured to automatically build the project whenever new code is pushed.

---

## 🚀 Features Implemented
- GitHub repository integrated with Jenkins.
- Automated Build Stage implemented using Maven.
- Pipeline triggers on every commit or pull request.
- Generated build artifacts are passed to further Test/Docker stages.
- Ensures stable, consistent builds across all executions.

---

## 🛠️ Tech Stack
- **Jenkins**
- **GitHub Webhooks**
- **Maven**
- **Java**
- **Pipeline-as-Code (Jenkinsfile)**

---

## 📂 Project Structure
Project/
│── src/
│── Jenkinsfile
│── pom.xml
└── README.md

---

## 🔗 GitHub to Jenkins Integration Steps
1. Created a repository on GitHub.  
2. Configured Jenkins job using "Pipeline" mode.  
3. Connected GitHub repo via "Repository URL".  
4. Added GitHub Webhook for automated triggers.  
5. Added Jenkinsfile for Build Stage automation.  

---

## 🧱 Build Stage (My Contribution)
- Developed and implemented the **Build Stage** in Jenkinsfile.  
- Automated **code compilation** and **dependency download** using Maven.  
- Ensured only successfully compiled builds proceed to the next stages.  
- Maintained pipeline consistency with clean, repeatable builds.

---

## ▶️ How to Run Locally
1. Clone the repository:  
   ```bash
   git clone <your_repo_link>
2.Navigate to the project folder:

cd project-folder-name


3.Execute Maven build:

mvn clean install
🤝 Maintainer

Ambika Sony
Gandhi Engineering College

---

# ✅ **How to Give This to Sir (Step-by-Step)**

### **Step 1 — Open VS Code**
- Go to your project folder  
- Create a new file named **README.md**

### **Step 2 — Paste the Template**
The content above is already aligned, structured, and markdown-ready.

### **Step 3 — Save the File**
Press **Ctrl + S**.

### **Step 4 — Push to GitHub**
In VS Code terminal:

```bash
git add README.md
git commit -m "Added project README"
git push origin main
