class Solution {
    public boolean isValid(String word) {
        boolean vowel=false,consonant=false;
        int count=0;
        String test="aAeEiIoOuU";
        for(char c :word.toCharArray())
        {
            if(Character.isLetter(c))
            {    count++;
                if(test.indexOf(c)!=-1)
                {
                    vowel=true;
                }
                else
                {
                    consonant=true;
                }
           }
           else if(Character.isDigit(c))
           {
            count++;
           
           }
           else{
            return false;
           }
        }
        return vowel && consonant && count>=3; 
}
}