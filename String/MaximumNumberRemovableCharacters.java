/*You are given two strings s and p where p is a subsequence of s. You are also given a distinct 0-indexed integer array removable containing a subset of indices of s (s is also 0-indexed).

You want to choose an integer k (0 <= k <= removable.length) such that, after removing k characters from s using the first k indices in removable, p is still a subsequence of s. More formally, you will mark the character at s[removable[i]] for each 0 <= i < k, then remove all marked characters and check if p is still a subsequence.

Return the maximum k you can choose such that p is still a subsequence of s after the removals.

A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters. */
public class MaximumNumberRemovableCharacters {
    public static void main(String[] args) {
       String s = "abcacb", p = "ab";
       int[] removable = {3,1,0};
       System.out.println(maximumRemovals(s,p,removable));
    }
public static int maximumRemovals(String s, String p, int[] removable) {
        //This question took me 3 wrong attempts before I realized that binary search works the best.
  // What do I binary search then? I find the number of elements I can remove!
  // The left boundary represents the lower limit (0 at first) while the right boundary represents the upper limit (the length of the removable array)
  // Each time, I find the middle number (which is an attempt to remove that number of letters from the string)
  // I also use an array of characters and replace those letters removed with the '/' symbol (can choose anything as long as it's a non-letter)
  // This should be faster and more convenient to work with as compared to removing letters directly from a string (high time complexity from string concatenation)
  
  //Firstly, I express the letters into an array of characters
  char[] letters = s.toCharArray();
  //Set up my boundaries.
  int l = 0, r = removable.length;
  while (l <= r) {
      //'mid' represents how many letters I remove this round.
      int mid = (l+r)/2;
      //'Remove' those letters! 
      for (int i=0;i<mid;i++) letters[removable[i]] = '/';
      
      //I perform a simple check to see if p is still a subsequence of it. If it is, change the lower boundary.
      if (check(letters,p)) l = mid+1;
      
      //Otherwise, I replace back all the letters that I had removed.
      //Then, I change the upper boundary.
      else {
          for (int i=0;i<mid;i++) letters[removable[i]] = s.charAt(removable[i]);
          r = mid-1;
      }
  }
  return r;
}
static boolean check(char[] letters, String p) {
  int i1 = 0, i2 = 0;
  while (i1 < letters.length && i2 < p.length()) {
      char curr = letters[i1], curr2 = p.charAt(i2);
      if (curr != '/' && curr == curr2) i2++;
      i1++;
  }
  
  //If i2 == p.length(), it means that I had managed to match all of the characters in String p!
  if (i2 == p.length()) return true;
  return false;
}
}
