public class Solution {
    public IList<string> GenerateParenthesis(int n) {
        List<string> ansList= new List<string>();            
        generatePossibleStrs(ansList, "", 0, 0, 0, n);
        return ansList;        
    }
    
    public void generatePossibleStrs(List<string> ansList, string totString, int dex, int opens, int closes, int n){
        if(dex==n*2){
            ansList.Add(totString);
            return;
        }
        dex++;
        if(opens<n){
            generatePossibleStrs(ansList, totString+"(", dex, opens+1, closes, n);
        }
        if(closes<opens){
           generatePossibleStrs(ansList, totString+")", dex, opens, closes+1, n);
        }
    }
}

/*
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

 

Example 1:

Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
Example 2:

Input: n = 1
Output: ["()"]
 

Constraints:

1 <= n <= 8
*/
