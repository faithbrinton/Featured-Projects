// Program: ICA 1 (Library Management System)
// Programmer: Faith Cameron
// LMD: 2026-02-05

// ========= Part 2 =========

public class Main {
    public static void main(String[] args) {

        // 1. Create Objects
        Book bookOne = new Book("Good Book", "John Doe", 165);
        Book bookTwo = new Book("Really Good Book", "Jane Doe", 1200, true);

        // 2. Print information
        System.out.println("Book 1 Title: " + bookOne.getTitle());
        System.out.println("Book 2 Title: " + bookTwo.getTitle());

         // 3. Using Setters and Methods
        bookOne.setIsCheckedOut(true);

        bookOne.printDetails();
        bookTwo.printDetails();

        System.out.println("The book" + bookOne.getTitle() + " is a " + bookOne.getLengthCategory() + " book.");
        System.out.println("The book" + bookTwo.getTitle() + " is a " + bookTwo.getLengthCategory() + " book.");

    }
}

// ========= Part 1 =========

class Book {

    // 1. Fields
    private String title;
    private String author;
    private int pageCount;
    private boolean isCheckedOut;

    // 2. Partial Constructor
    public Book(String title, String author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    // 2. Full Constructor
    public Book(String title, String author, int pageCount, boolean isCheckedOut) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.isCheckedOut = isCheckedOut;
    }

    // 3. Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public boolean getIsCheckedOut() {
        return isCheckedOut;
    }

    // 3. Setters
    public void setPageCount(int pageCount) {
        if (pageCount > 1000) {
            System.out.println("Error: Page Count cannot be more than 1000. Defaulting value to 999.");
            this.pageCount = 999;
        } else {
            this.pageCount = pageCount;
        } 
    }

    public void setIsCheckedOut(boolean isCheckedOut) {
        this.isCheckedOut = isCheckedOut;
    }

    // 4. Methods
    public void printDetails() {
        System.out.println();
        System.out.println("==== Book Details ====\n");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pageCount);
        System.out.println("Checked Out: " + isCheckedOut);
        System.out.println("Length Category: " + getLengthCategory());
        System.out.println();
        System.out.println("======================\n");
    }

    public String getLengthCategory() {
        int category;

        if (pageCount < 100) {
            category = 1;
        } else if (pageCount <= 300) {
            category = 2;
        } else {
            category = 3;
        }

        switch (category) {
            case 1:
                return "Short";
            case 2:
                return "Medium";
            case 3:
                return "Long";
            default:
                return "Unknown";
        }
    }
}