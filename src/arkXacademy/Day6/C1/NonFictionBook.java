package arkXacademy.Day6.C1;


import arkXacademy.Day6.C1.Book;

class NonFictionBook extends Book {
    private String topic;

    public NonFictionBook(String title, String author, String isbn, String topic) {
        super(title, author, isbn);
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("topic " + getTopic());
    }
}
