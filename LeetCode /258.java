class Solution {
    public int addDigits(int num) {
        if(num == 0){
            return 0;
        }
        else{
            while(num>=10){
                int div = num/10;
                int out = num - div*10;
                num = div + out;
            }
        }
    return num;   
    }
}