// Example of Instanceof - 2 

class vehicle
{
}

class  car extends vehicle{
	public static void main(String[] args) {
		vehicle A = new car();
		boolean res = A instanceof car;
		System.out.println(res);
	}
}