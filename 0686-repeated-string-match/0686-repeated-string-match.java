class Solution {
    public int repeatedStringMatch(String a, String b) {
        int count = 1;
        StringBuilder asub = new StringBuilder(a);
        while(asub.length()<b.length()){
           asub.append(a);
           count++;
        }
        if(asub.toString().contains(b)){
            return count;
        }
        asub.append(a);
        if(asub.toString().contains(b)){
            return count+1;
        }
        return -1;
    }
}