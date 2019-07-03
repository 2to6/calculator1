public class calculator
{
	public static void main(String argv[])
	{
		public double div(double a, double b){
			double result;

			try{
				result = a/b;
			}
			catch(Exception e){
				System.err.println("You can't divide by zero");
				result = 0;
			}

			return result;
		}
	}

}