package org.example;

//A.
abstract class LibraryItem {
    private String title;
    private String author;

    public LibraryItem (String title, String author){
        this.title = title;
        this.author = author;
    }
    public abstract String getDescription();

    public String getTitle(){
        return title;
    }

    public String getAuthor() {
        return author;
    }




//B
    class Book extends LibraryItem{
        private String ISBN;

        public Book(String title, String author, String ISBN) {
            super(title, author);
            this.ISBN = ISBN;
        }
@Override
        public String getDescription() {
            return "Book: " + getTitle() + "by" + getAuthor() + "ISBN" + ISBN;
            }
    }

    class Magazine extends LibraryItem{
        private int issueNumber;

        public Magazine (String title, String author, int issueNumber){
            super (title, author);
            this.issueNumber = issueNumber;
        }

        @Override
        public String getDescription() {
            return "Magazine: " + getTitle() + " by " + getAuthor() + " - Issue Number: " + issueNumber;
        }
    }

}
