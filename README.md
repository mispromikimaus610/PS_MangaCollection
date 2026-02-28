# PS_MangaCollection 📚

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)
![Swing](https://img.shields.io/badge/Swing-GUI-blue?style=for-the-badge)
![MVC](https://img.shields.io/badge/Pattern-MVC-green?style=for-the-badge)

A robust Java-based desktop application designed for comic book enthusiasts to efficiently track and manage their manga collections.

## ✨ Features

* **Authentication:** Secure login system with user validation (`User` model).
* **Manga Management:** Complete CRUD functionality (Create, Read, Update, Delete) for manga entries.
* **Author Database:** Integrated tracking of authors, including biographical data.
* **Smart Filtering:** Built-in logic for filtering collection by genre, author, and specific publication formats (Manhwa, Manfra).
* **Dynamic UI:** Custom `AbstractTableModel` (`ModelTabeleMange`) for efficient, real-time data display in `JTable`.
* **Database Safety:** Manual transaction management (`commit`/`rollback`) to ensure data integrity.

## 🏗️ Architecture & Technologies

This project demonstrates core software engineering principles and modern Java development:

* **Java Swing:** Utilized for building the Graphical User Interface (GUI).
* **MVC Pattern:** Strict separation of concerns between:
    * **Models:** `Manga`, `Author`, and `Zanr` (Data structures).
    * **Views:** `GlavnaForma` and `FormaManga` (UI components).
    * **Controller:** `Controller` class (Business logic).
* **Singleton Design Pattern:** The `Controller` uses a private constructor and a static instance to ensure centralized data management across the entire application.
* **Broker Pattern:** `DBBroker` centralizes all JDBC logic, isolating SQL queries from the business logic.
* **External Configuration:** Uses a properties file to manage sensitive database connection strings.
* **Custom Table Models:** Enhanced `JTable` functionality via `ModelTabeleMange.java`.

## ⚙️ Setup & Installation

### 1. Database Setup 🗄️
The application requires a MySQL database.
1.  Open your database manager (XAMPP/SQLyog).
2.  Import the provided script: `DB_Projecting_Software_1.sql`.
3.  This will create the database `projecting_software_1` and tables: `manga`, `autor`, and `user`.

### 2. Configuration (`DB_Properties.txt`) 🔐
To connect the app to your local database:
1.  Create a file named `DB_Properties.txt` in the **root** folder of the project.
2.  Use the following format (adjust your port and credentials):
    ```properties
    db.url = jdbc:mysql://localhost:****YOUR PORT FOR MySQL****/****NAME OF YOUR BASE****
    db.user=****YOUR USER ****
    db.password=****YOUR PASSWORD****
    ```
*(Note: This file is ignored by Git for security).*

### 3. Run the App
1.  Open the project in **NetBeans**.
2.  Ensure **MySQL JDBC Driver** is in the project libraries.
3.  Run `LoginForma.java` to start the application.

---

## 📁 Project Structure

```text
src/
├── baza/
│   ├── Konekcija.java      # Database connection Singleton
│   └── DBBroker.java       # SQL execution layer
├── controller/
│   └── Controller.java     # App logic & Data bridge
├── model/
│   ├── Manga.java          # Entity classes
│   ├── Autor.java
│   ├── User.java
│   └── Zanr.java (Enum)
└── forme/
    ├── LoginForma.java     # Entry point
    ├── GlavnaForma.java    # Main dashboard
    └── FormaManga.java     # Add/Edit Dialog
---

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

Developed by **Miloš** - Feel free to contact me for any questions regarding this project.
