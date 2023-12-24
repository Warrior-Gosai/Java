// Arithmetic Operations With Command Line Arguments 

class Arithmetic2 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		System.out.println("\nAddition : "+ num1+ " + "+num2+" = "+(num1+num2)) ;
		System.out.println("Subtraction : "+ num1+ " - "+num2+" = "+(num1-num2)) ;
		System.out.println("Multiplication : "+ num1+ " * "+num2+" = "+(num1*num2)) ;
		System.out.println("Division : "+ num1+ " / "+num2+" = "+(num1/num2)) ;
	}
}