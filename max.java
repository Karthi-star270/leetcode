class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(String s : sentences)
        {
        String[] words = s.split(" ");
        int currentword = words.length;
        if(currentword > max){
            max=currentword;
        }
        }
        return max;
      }
}
