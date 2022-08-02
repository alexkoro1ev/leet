package easy.isomorphic_strings;
public class Main {
  public static void main(String[] args) {
    Solution solution = new Solution();

    System.out.println(solution.isIsomorphic("egg", "add"));      // true
    System.out.println(solution.isIsomorphic("foo", "bar"));      // false
    System.out.println(solution.isIsomorphic("paper", "title"));  // true
    System.out.println(solution.isIsomorphic("ab", "ca"));        // true
    System.out.println(solution.isIsomorphic("aa", "ab"));        // false
    System.out.println(solution.isIsomorphic("baa", "cfa"));      // false
  }
}
