package week3;

public class factorial {
	
	public static void main(String[] args) {
	
		int number = 5; 
        int tmp = 1;

        for (int i = number; i >= 1; i--) {
            tmp = tmp * i;
            
        }

        System.out.println("Factorial of :"+ tmp);
    }
}

