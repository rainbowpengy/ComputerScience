import java.util.ArrayList;

/**
 * Created by s27205053 on 3/31/2016.
 */
public class DocumentIndex extends ArrayList<IndexEntry> {
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

    public void addWord(String word, int line) {
        IndexEntry entry = get(findOrInsert(word));
        entry.add(line);
    }
    private int findOrInsert(String word) {
        int i;
        for(i = 0; i < size(); i++) {
            int x = word.compareToIgnoreCase(get(i).getWord());
            if (x == 0) {
                return i;
            }
            if (x < 0) {
                break;
            }
        }
        add(i, new IndexEntry(word));
        return i;
    }
}
