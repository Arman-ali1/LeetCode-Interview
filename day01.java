// Day01
// 2390. Removing Stars From a String 😃
// DSA with JAVA
// code:= ===========
  public String removeStars(String s) {
    StringBuilder res = new StringBuilder();
    for (char c : s.toCharArray())
      if (c == '*')
        res.setLength(res.length() - 1);
      else
        res.append(c);
    return res.toString();
  }
// ============
// #daily challenge
// 01/100;