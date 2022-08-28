package Calculate;

public class Calculate {
    public static int findFactorial(int number) {
        if(number < 1 || number > 10) return -1;
        int i,fact=1;
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
        return fact;
    }

    public boolean checkArmstrong(int number) {
        int temp, digits=0, last=0, sum=0;
//assigning n into a temp variable
        temp=number;
//loop execute until the condition becomes false
        while(temp>0)
        {
            temp = temp/10;
            digits++;
        }
        temp = number;
        while(temp>0)
        {
//determines the last digit from the number
            last = temp % 10;
//calculates the power of a number up to digit times and add the resultant to the sum variable
            sum +=  (Math.pow(last, digits));
//removes the last digit
            temp = temp/10;
        }
//compares the sum with n
        if(number==sum)
//returns if sum and n are equal
            return true;
//returns false if sum and n are not equal
        else return false;
    }

    public static int[] intersectionPointInBothAxisForALinearEqn(int a, int b, int c){
        if(c == 0) return new int[]{0, 0};
        else if (a == 0 && b != 0) return new int[]{0, (-c / b)};
        else if(b == 0 && a != 0)  return new int[]{(-c/a), 0};
        else if (a == 0 && b == 0) return new int[]{-1, -1};
        else return new int[]{(-c/a),(-c/b)};
    }
}
