class Main {
    public static void main(String[] args) {
        //n lg n <= x
        //find n using binary search
        long second = 1000000;
        long hour = 3600000000L;
        long day = 86400000000L;
        long month = 2592000000000L;

        System.out.println("n lg n of 1,000,000 is " + nlgn(second));
        System.out.println("n lg n of 3.6*10^9 is " + nlgn(hour));
        System.out.println("n lg n of 8.64*10^10 is " + nlgn(day));
        System.out.println("n lg n of 2.592*10^12 is " + nlgn(month));
    }
    public static long nlgn(long target){
	    long lower = 0;
	    long upper = target;
	    while(lower <= upper){
	    	long test = (lower + upper)/2;
	   
	        if (calculate(test) < target){
	            lower=test+1;
	        } else {
	            upper=test-1;
	        }
	        if (calculate(test) < target && calculate(test+1) > target ) {
	        	return test;
	        }
	    } 
	    return -1;
	}
    public static long calculate(long test) {
		double calc = (test * (Math.log(test)/Math.log(2)));
		return (long)calc;
	}
}
