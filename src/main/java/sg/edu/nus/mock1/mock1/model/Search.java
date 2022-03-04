package sg.edu.nus.mock1.mock1.model;


import java.io.Serializable;

public class Search implements Serializable {
        private String authorName;
        private String bookName;
        private int bookId;

    public String getAuthorName() {
        return this.authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBookName() {
        return this.bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookId() {
        return this.bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }


    public Search(String authorName, String bookName, int bookId) {
        this.authorName = authorName;
        this.bookName = bookName;
        this.bookId = bookId;
    }

    public Search(int bookId) {
        this.bookId = bookId;
    }

    public Search(String authorName, String bookName) {
        this.authorName = authorName;
        this.bookName = bookName;
    }

    public Search() {
    }


    
}
