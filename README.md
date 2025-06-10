# Java Collections Framework Exercises

👨‍💻 Author: Lucy Castro  
🧠 Learning Focus: Java Collections Framework  
🛠️ IDE: IntelliJ IDEA  
💡 Java SDK: 21  

## 📄 Description
This repository contains structured Java exercises focused on:

- **List Operations** - Working with ArrayList, HashSet, HashMaps, ListIterator and hashCode()  
- **Set Implementations** - Understanding HashSet and its uniqueness properties  
- **Map Collections** - Practicing with HashMap for key-value pairs  
- **Sorting & Ordering** - Implementing Comparable and Comparator interfaces  
- **File I/O** - Reading from and writing to files  

## 💻 Technologies Used
☕ Java 21  
🧠 IntelliJ IDEA  
🗃️ Git & GitHub  

## 📋 Requirements
✅ Java JDK 21  
✅ IntelliJ IDEA  
✅ Git  
✅ Internet connection  

## 🛠️ Installation
git clone https://github.com/Lucy-SD/S1T3_JavaCollections.git

Open in IntelliJ: File > Open > [select folder]

Set SDK: File > Project Structure > Project SDK > JDK 21

## ▶️ Execution
Navigate to the desired exercise package
Open the corresponding Main class
Right-click → Run

## 🌐 Deployment
For educational purposes only.

## 🤝 Contributions
⭐ Star the repo
🪄 Fork it
🛠️ Submit issues

## 🎯 Learning Goals
Collection Framework Mastery

List and Set Operations

Map Implementations

Sorting Algorithms

File Handling

Thanks for visiting! 🚀

 🚀

## 📚 Exercise Catalog
### 📂 Level 1: Basic Collections Operations
<details> <summary><b>Exercise 1: Month List and Set Operations</b></summary>
Create Month class with name attribute

Add 11 months (excluding August) to ArrayList

Insert August in correct position

Convert to HashSet and verify no duplicates

Demonstrate iteration with for-loop and Iterator

</details><details> <summary><b>Exercise 2: List Reversal with ListIterator</b></summary>
Create and populate List<Integer>

Create second List<Integer> with reversed order

Use ListIterator for element transfer

Demonstrate both forward and backward traversal

</details><details> <summary><b>Exercise 3: Country Capital Quiz</b></summary>
Read countries.txt file into HashMap<String, String>

Implement quiz with 10 random country questions

Track user score

Save results to classificacio.txt

Format: "Username: Score"

</details>

### 📂 Level 2: Advanced Collections Concepts
<details> <summary><b>Exercise 1: Restaurant HashSet Uniqueness</b></summary>
Create Restaurant class (name, score)

Override equals() and hashCode()

Ensure HashSet rejects same name+score restaurants

Allow same name with different scores

Demonstrate with test cases

</details><details> <summary><b>Exercise 2: Restaurant Sorting</b></summary>
Extend Restaurant class

Implement sorting by name (ascending)

Then by score (descending)

Example:

restaurant1: 8

restaurant1: 7

restaurant2: 9

Demonstrate with Collections.sort()

</details>
