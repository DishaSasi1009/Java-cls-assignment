import java.util.ArrayList;
import java.util.List;
public class Index{
    public static void main(String[] args) {
        String[] words = {"abc", "bcd", "aaaa", "cbc"};
        char x = 'a';
        int[] indices = findWordsContainingChar(words, x);
        System.out.print("Output: ");
        for (int index : indices) {
            System.out.print(index + " ");} }
    public static int[] findWordsContainingChar(String[] words, char x) {
        List<Integer> indicesList = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) {
                indicesList.add(i);  } }
        int[] indices = new int[indicesList.size()];
        for (int i = 0; i < indicesList.size(); i++) {
            indices[i] = indicesList.get(i); }
        return indices; }
}
