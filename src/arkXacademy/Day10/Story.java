package arkXacademy.Day10;

import com.sun.source.tree.TryTree;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
/*class Story implements Serializable {
    private List<Sentence> sentences;
    private int orderCounter;

    public Story() {
        this.sentences = new ArrayList<>();
        this.orderCounter = 1;
    }
    public void addSentence(String content, Player author) {
        Sentence sentence = new Sentence(content, author, orderCounter++);
        sentences.add(sentence);
    }
    public void printStory() {
        for (Sentence sentence : sentences) {
            System.out.println(sentence);
        }
    }
    public void saveProgress(String fileName){
        try (PrintWriter f = new PrintWriter("cc")) {
            f.write(sentences.toString()+"\n");

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void loadProgress(String fileName){
        try(FileReader fileReader = new FileReader("cc")) {
            StringBuilder content =new StringBuilder();

            sentences= fileReader.read();


        }catch (IOException|ClassNotFoundException e){
            e.printStackTrace();
        }
}


}*/
class Story implements Serializable {
    private StringBuilder story;
    private int orderCounter;

    public Story() {
        this.story = new StringBuilder();
        this.orderCounter = 1;
    }

    public void addSentence(String content, Player author) {
        Sentence sentence = new Sentence(content, author, orderCounter++);
        story.append(sentence.toString()).append("\n");
    }

    public void printStory() {
        System.out.println(story.toString());
    }

    public void saveProgress(String fileName) {
        try (PrintWriter f = new PrintWriter(fileName)) {
            f.write(story.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadProgress(String fileName) {

        /*try (FileReader fileReader = new FileReader(fileName)) {
            StringBuilder content = new StringBuilder();
            int ch = 0;
            while ((ch = fileReader.read()) != -1) {

                System.out.println((char) ch);
            }

*/
        try{
            String line;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);

               /* ::using object
               String[] arrays = line.split(",");
                int order=Integer.parseInt(arrays[0]);
                String name=arrays[1];
                String message=arrays[2];
                Sentence sentence = new Sentence(message,new Player(name),order);
                System.out.println(sentence.getContent());*/

            }

        } catch (IOException  e) {
            e.printStackTrace();
        }
    }

}
