// Last updated: 08/07/2026, 15:40:44
class Solution {
    class TrieNode {
        TrieNode[] children;
        String word;
        
        TrieNode() {
            children = new TrieNode[26]; // 26 letters in the alphabet
            word = null; // This will hold the word if it's found
        }
    }
    
    public List<String> findWords(char[][] board, String[] words) {
        // Step 1: Build the Trie
        TrieNode root = new TrieNode();
        for (String word : words) {
            TrieNode node = root;
            for (char c : word.toCharArray()) {
                if (node.children[c - 'a'] == null) {
                    node.children[c - 'a'] = new TrieNode();
                }
                node = node.children[c - 'a'];
            }
            node.word = word; // Mark the end of the word
        }
        
        // Step 2: Use backtracking to search for words
        Set<String> result = new HashSet<>();
        boolean[][] visited = new boolean[board.length][board[0].length];
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                backtrack(board, i, j, root, visited, result);
            }
        }
        
        return new ArrayList<>(result);
    }
    
    // Backtracking function
    private void backtrack(char[][] board, int i, int j, TrieNode node, boolean[][] visited, Set<String> result) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || visited[i][j]) {
            return; // Out of bounds or already visited
        }
        
        char c = board[i][j];
        if (node.children[c - 'a'] == null) {
            return; // No valid prefix, prune
        }
        
        node = node.children[c - 'a']; // Move to the next node in the Trie
        
        if (node.word != null) {
            result.add(node.word); // Found a word, add it to the result
            node.word = null; // To avoid duplicate words
        }
        
        visited[i][j] = true;
        
        // Explore all 4 possible directions
        backtrack(board, i + 1, j, node, visited, result);
        backtrack(board, i - 1, j, node, visited, result);
        backtrack(board, i, j + 1, node, visited, result);
        backtrack(board, i, j - 1, node, visited, result);
        
        visited[i][j] = false; // Unmark the current cell after exploring
    }
}
