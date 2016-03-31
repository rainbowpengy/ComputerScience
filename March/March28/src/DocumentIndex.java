import java.util.ArrayList;

/**
 * Created by s27205053 on 3/31/2016.
 */
public class DocumentIndex extends ArrayList {
    public DocumentIndex() {
        super();
    }

    public DocumentIndex(int x) {
        super(x);
    }
//Add all words - for each word in str call add word to add the word to the index
    public void addAllWords(String str, int line){
        String[] words = str.split("\\W+");
        for(String word : words) {
            if(word.length() > 0) {
                addWord(word, line);
            }
        }
    }
}
