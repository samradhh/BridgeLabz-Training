class Roman_To_Integer {
    public int check(char n){
        switch(n){
           case 'I':
           return 1; 
           case 'V':
           return 5;
           case 'X':
           return 10;
           case 'L':
           return 50;
           case 'C':
           return 100;
           case 'D':
           return 500;
           case 'M':
           return 1000;
        }
        return 0;
    }
    public int romanToInt(String s) {
       int r=0;
       for(int i=0;i<s.length();i++){
        int t=check(s.charAt(i));
        if(i+1<s.length()&&check(s.charAt(i+1))>t){
            r+=(check(s.charAt(i+1))-t);
            i+=1;
        }
        else{
            r+=t;
        }
       } 
       return r;
    }
}