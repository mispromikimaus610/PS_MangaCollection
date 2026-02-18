# PS_MangaCollection

# Manga Manager Application 📚

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Swing](https://img.shields.io/badge/Swing-GUI-blue?style=for-the-badge)
![MVC](https://img.shields.io/badge/Pattern-MVC-green?style=for-the-badge)

A robust Java-based desktop application designed for comic book enthusiasts to efficiently track and manage their manga collections.

## ✨ Features

* **Full CRUD Support:** Seamlessly Create, Read, Update, and Delete manga entries.
* **Author Management:** Integrated database of authors including their biographical information.
* **Data Validation:** Built-in checks for ISBN formats, publication years, and volume tracking.
* **Dynamic UI:** Implements a custom `AbstractTableModel` to ensure the data table updates instantly without manual refreshing.
* **Genre Categorization:** Standardized categories using Java Enums for better data consistency.

## 🏗️ Architecture & Technologies

This project demonstrates core software engineering principles and modern Java development:

* **Java Swing:** Utilized for building the Graphical User Interface (GUI).
* **MVC Pattern:** Strict separation of concerns between:
    * **Models:** `Manga`, `Author`, and `Zanr` (Data structures).
    * **Views:** `GlavnaForma` and `FormaManga` (UI components).
    * **Controller:** `Controller` class (Business logic).
* **Singleton Design Pattern:** The `Controller` uses a private constructor and a static instance to ensure centralized data management across the entire application.
* **Custom Table Models:** Enhanced `JTable` functionality via `ModelTabeleMange.java`.

## 📁 Project Structure

```text
src/
├── controller/
│   └── Controller.java          # Singleton Logic & Data Management
├── model/
│   ├── Manga.java               # Manga Entity
│   ├── Autor.java               # Author Entity
│   └── Zanr.java                # Genre Enum
└── forme/
    ├── GlavnaForma.java         # Main Dashboard View
    ├── FormaManga.java          # Add/Edit Dialog View
    └── ModelTabeleMange.java    # Custom Table Logic
```

## 🚀 Getting Started

### Prerequisites
* **JDK 11** or higher.
* **IDE:** [NetBeans](https://netbeans.apache.org/download/index.html) (Recommended for `.form` file editing) or [IntelliJ IDEA](https://www.jetbrains.com/idea/).

### Installation & Run
1. **Clone the repository:**
   ```bash
   git clone [https://github.com/mispromikimaus610/PS_MangaCollection.git](https://github.com/mispromikimaus610/PS_MangaCollection.git)
   ```
2. Open the project in your preferred IDE.
3. Locate `forme/GlavnaForma.java`.
4. Run the file (**Ctrl + F11** in NetBeans) to launch the application.

---

## 📸 Screenshots
<img width="500" height="729" alt="image" src="https://github.com/user-attachments/assets/ab71464f-1933-418f-9514-e4cae7c615ba" />
<img width="500" height="729" alt="image" src="https://github.com/user-attachments/assets/71eef242-cd92-45ac-89d2-07a811187901" />
<img width="500" height="729" alt="image" src="https://github.com/user-attachments/assets/f6802585-3ac0-46a3-a167-c31dd1375901" />

Main menu, Add menu and Change menu.


---

## 🤝 Contributing
Contributions are welcome! If you have suggestions for new features or find any bugs, feel free to:

1. **Fork** the Project.
2. Create your **Feature Branch** (`git checkout -b feature/AmazingFeature`).
3. **Commit** your Changes (`git commit -m 'Add some AmazingFeature'`).
4. **Push** to the Branch (`git push origin feature/AmazingFeature`).
5. Open a **Pull Request**.

---

Developed by **Miloš** - Feel free to contact me for any questions regarding this project.
