// Day03

// 1768. Merge Strings Alternately 😃

// DSA with JAVA

// code:= ===========

class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0, j = 0, k = 0;
        StringBuffer sb = new StringBuffer();
        while (i < word1.length() && j < word2.length())
            if (k++ % 2 == 0)
                sb.append(word1.charAt(i++));
            else
                sb.append(word2.charAt(j++));
        while (i < word1.length())
            sb.append(word1.charAt(i++));
        while (j < word2.length())
            sb.append(word2.charAt(j++));
        return sb.toString();
    }
}

// ============

// daily challenge

// 03/100;