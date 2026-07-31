# Android Grade Calculator App

## Project Overview
A native Android application built with Java and XML that allows teachers to input student names and subject scores (Mathematics, Science, English) to automatically calculate average scores and assign letter grades.

Developed and submitted as part of the Mobile Application Development and Big Data module (ITMBA2-33) at Eduvos.

## Features
- Input fields for Student Name, Mathematics Score, Science Score, and English Score.
- Calculate button that triggers the grade logic.
- Displays the student's name, calculated average, and final grade.
- Comprehensive error handling:
  - Validates that all fields are filled before calculating.
  - Handles invalid or non-numeric inputs with user-friendly Toast messages.
- Clean, intuitive user interface built with LinearLayout.

## Grade Scale
| Average Score | Grade |
| :--- | :--- |
| 90% and above | A |
| 80% - 89% | B |
| 70% - 79% | C |
| Below 70% | F |

## Screenshots
<img width="563" height="563" alt="image" src="https://github.com/user-attachments/assets/0974efda-b886-44f6-965c-f274564118d3" />

*Figure 1:Screenshot shows that the program is validated to make sure that you insert value in the fields, the message is unobstructive but clearly alerts the user.*

<img width="541" height="563" alt="image" src="https://github.com/user-attachments/assets/ff5388ec-d344-4e3b-b633-7a79f48792c9" />

*Figure 2: Sample screenshot of the program calculating and displaying the appropraite output*

## How to Run
This is an Android application.
1. Open the project in **Android Studio**.
2. Connect an Android device or start an emulator.
3. Click **Run** (the green play button).
4. Enter student details and press "Calculate" to see the result.

## Code Structure
```text
app/
├── src/
│   └── main/
│       ├── java/com/obtech/gradecalculatorapp/
│       │   └── MainActivity.java
│       └── res/layout/
│           └── activity_main.xml
├── build.gradle
└── .gitignore
```
## Author
Kamogelo Phale
