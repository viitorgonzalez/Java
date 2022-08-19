class StrComp{

    public static boolean strComp(String str){
        boolean isFim = true;
        String FIM = "FIM";
        
        for(int i = 0; i < 3; i++){
            if(FIM.charAt(i) != str.charAt(i){
                isFim = false;
                i = 3;
            }
        }
    }
}