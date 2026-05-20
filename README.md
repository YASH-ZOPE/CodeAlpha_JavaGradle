# ☕ Java Application using Gradle — CodeAlpha DevOps Internship Task 3

A Java application with automated build management using Gradle and CI/CD via GitHub Actions.

---

## 📁 Project Structure

```
CodeAlpha_JavaGradle/
├── .github/
│   └── workflows/
│       └── ci.yml          ← CI/CD pipeline
├── src/
│   ├── main/java/com/codealpha/
│   │   └── App.java        ← Main Java app
│   └── test/java/com/codealpha/
│       └── AppTest.java    ← Unit tests
├── build.gradle            ← Gradle build config
├── settings.gradle
└── README.md
```

---

## ✅ Prerequisites

- [JDK 11+](https://adoptium.net/)
- [Gradle](https://gradle.org/install/) (or use gradlew wrapper)

---

## 🚀 How to Run

### Build the project
```bash
gradle build
```

### Run the application
```bash
gradle run
```

### Run tests
```bash
gradle test
```

---

## 🔄 CI/CD Pipeline

Every push to `main` branch automatically:
1. ✅ Checks out the code
2. ✅ Sets up Java 11
3. ✅ Builds with Gradle
4. ✅ Runs unit tests
5. ✅ Runs the application

---

## 📌 What I Learned

- Automating Java builds with Gradle
- Managing dependencies via `build.gradle`
- Writing unit tests with JUnit 5
- Setting up CI/CD with GitHub Actions
- Understanding DevOps principles in Java development

---

## 👤 Author

CodeAlpha DevOps Intern  
Task 3 — Java Application using Gradle
