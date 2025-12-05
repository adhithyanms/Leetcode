class Solution {
    public int numUniqueEmails(String[] emails) {
       HashSet<String>set=new HashSet<>();
       for(String email:emails)
       {
        int atPos=email.indexOf('@');
        String localName=email.substring(0,atPos);
        String domainName=email.substring(atPos);
        localName=localName.replaceAll("\\.","");
        if(localName.contains("+"))
        {
            int plsPos=localName.indexOf("+");
            localName=localName.substring(0,plsPos);
        }
        String newEmail=localName+domainName;
        set.add(newEmail);
       }
       return set.size();
    }
}