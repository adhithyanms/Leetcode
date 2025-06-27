class Solution {
    Map<Character,String> digitToLetters=new HashMap<>();
        
    public List<String> letterCombinations(String digits) {
        digitToLetters.put('2', "abc");
        digitToLetters.put('3', "def");
        digitToLetters.put('4', "ghi");
        digitToLetters.put('5', "jkl");
        digitToLetters.put('6', "mno");
        digitToLetters.put('7', "pqrs");
        digitToLetters.put('8', "tuv");
        digitToLetters.put('9', "wxyz");

        List<String> ans=new ArrayList<>();
        if(digits==null|| digits.length()==0) return ans;
        combination(digits,ans,0,new StringBuilder());
        return ans;
    }
    public void combination(String digits,List<String> ans,int index,StringBuilder tem)
    {
          if(index==digits.length()){
            ans.add(tem.toString());
            return;
            }

         String letter=digitToLetters.get(digits.charAt(index));
         for(char c:letter.toCharArray())
         {
            tem.append(c);
            combination(digits,ans,index+1,tem);
            tem.deleteCharAt(tem.length()-1);
         }
    }
}