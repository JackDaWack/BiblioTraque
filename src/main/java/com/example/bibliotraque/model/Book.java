package com.example.bibliotraque.model;

public class Book {
    private String title;
    private String author;
    private boolean isfinished;
    private int totalPages;
    private int currentPage;

    public Book(String title, String author, boolean isfinished, int totalPages, int currentPage) {
        this.title = title;
        this.author = author;
        this.isfinished = isfinished;
        this.totalPages = totalPages;
        this.currentPage = currentPage;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isFinished() {
        return isfinished;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public double getProgress() {
        if (totalPages == 0) {
            return 0.0;
        }
        return (double) currentPage / totalPages * 100;
    }
}
