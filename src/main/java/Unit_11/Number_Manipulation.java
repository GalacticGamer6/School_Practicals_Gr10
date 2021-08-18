package Unit_11;


public class Number_Manipulation {
    public static int HCF = 0;
    
    
    public static void main(String[] args) {
        HCF(2,4);
    }
   
    public static int HCF(int num1, int num2){
            for(int i = 1; i < num2*num1  ; i++){
                if((num1%i==0) & (num2%i==0)){
                    HCF=i;
                }
            }
            
        System.out.println(HCF);

        return HCF;
    }
}
