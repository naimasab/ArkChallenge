package arkXacademy.Day10;

import java.io.Serializable;

class Sentence implements Serializable {
    private String content;
    private Player author;
    private int order;
    public Sentence(String content, Player author, int order) {
        this.content = content;
        this.author = author;
        this.order = order;
    }
    public String getContent() {
        return content;
    }
    public Player getAuthor() {
        return author;
    }

    /* public int getOrder() {
         return order;
     }

     //public String ss() {
       //  return "(" + order + ") " + author.getName() + ": " + content;

 */
    @Override
    public String toString() {
        return  order + "," + author.getPlayerName() + "," + content;
    }
}
