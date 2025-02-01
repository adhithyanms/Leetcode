bool isPalindrome(char* str) {
   char tem[strlen(str)];
   int n=0;
    for(int i=0;i<strlen(str);i++)
    {
        if((str[i]>='A' && str[i]<='Z') || str[i]>='a' && str[i]<='z' || str[i]>='0' && str[i]<='9')
        {
            tem[n]=tolower(str[i]);
            n++;
        }
    }
    int start =0; 
    int end=n-1;
    while(start<end)
    {

        if(tem[start]!=tem[end])
        return 0;
        else start++;end--;
    }
    return 1;
}
