class Rev{
    public static void main(String[] args) {
        String y ="Samradh";//
        String st="";
        for(int i=y.length()-1;i>=0;i--){
            st=st+y.charAt(i);
        }
        System.out.println(st);
    }
}