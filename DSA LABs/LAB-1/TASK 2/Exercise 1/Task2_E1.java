public class Task2_E1 {
    public static void main(String args[]) {

        int[] num = new int[5];
        
            num[0]= 12;
            num[1]= 24;
            num[2]= 36;
            num[3]= 48;
            num[4]= 60;

        for(int i = num.length-1; i>0; i--){
  
            num[i] = num[i-1];
        }
            num[0] = 6;
            
            for(int i = 0; i<num.length; i++){
            
                System.out.println(num[i]);
    }
}
}
