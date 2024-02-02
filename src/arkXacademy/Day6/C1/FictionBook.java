package arkXacademy.Day6.C1;

import arkXacademy.Day6.C1.Book;

class FictionBook extends Book {
    private String genre;

    public FictionBook(String title, String author, String isbn, String genre) {
        super(title, author, isbn);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("genre " + getGenre());
    }

}
