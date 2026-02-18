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
