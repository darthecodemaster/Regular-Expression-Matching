/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package regularexpressionmatchingwithdotandstar;

/**
 *
 * @author ASUS
 */
public class RegularExpressionMatchingWithDotAndStar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        System.out.println("s = \"aa\", p = \"a\" -> " + solution.isMatch("aa", "a"));      // false
        System.out.println("s = \"aa\", p = \"a*\" -> " + solution.isMatch("aa", "a*"));    // true
        System.out.println("s = \"ab\", p = \".*\" -> " + solution.isMatch("ab", ".*"));    // true
        System.out.println("s = \"mississippi\", p = \"mis*is*p*.\" -> " 
                           + solution.isMatch("mississippi", "mis*is*p*.")); // false
    }
    
}
