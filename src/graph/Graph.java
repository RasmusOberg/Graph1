package graph;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Graph {
    private static ArrayList<String> words;
    static Digraph digraph;
    static BreadthFirstDirectedPaths bfs;

    public static void main(String[] args) {
        Graph graph = new Graph();
        try {
            graph.getWords();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        digraph = new Digraph(words);
        bfs = new BreadthFirstDirectedPaths(digraph, 0);
    }

    public void getWords() throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(new FileInputStream("\\Users\\rasmu\\OneDrive\\Desktop\\words-13-data.txt")));
        words = new ArrayList<String>();
        while (true) {
            String word = r.readLine();
            if (word == null) { break; }
            assert word.length() == 5;  // indatakoll, om man kör med assertions på
            words.add(word);
        }
    }

}