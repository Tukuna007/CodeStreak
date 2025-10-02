package Tukuna;

public class ClimbingStairs {
    public int climbStairs(int n) {

        if(n==0||n==1){
            return 1;
        }
        else{
            return climbStairs(n-1)+climbStairs(n-2);
        }
        
        
    }

    
}
