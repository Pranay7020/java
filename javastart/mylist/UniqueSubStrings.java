package mylist;

public class UniqueSubStrings {
    public static void main(String[] args) {
        char[] s = {'n','i','t','n'};
        
        for(int i =0; i<s.length;i++) {
            boolean[] visited = new boolean[256];
            String sub ="";
            
            for(int j =i;j < s.length;j++) {
                char c = Character.toLowerCase(s[j]);
                if(visited[c]) {
                    break;
                }
                visited[c] = true;
                sub = sub + s[j];

            }
            System.out.print(sub + " ");
        }

    }
    
}
