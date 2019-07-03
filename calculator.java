java.util.Scanner;

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


		Scanner scan = new Scanner(System.in);
		double a;
		dobule b;
		a = scan.nextDouble();
		b = scan.nextDouble();

		while(1){
			System.out.println("======MENU=======");
			System.out.println("1. 더하기");
			System.out.println("2. 빼기");
			System.out.println("3. 곱하기");
			System.out.println("4. 나누기");
			System.out.println("5. 제곱");
			System.out.println("0. 시스템 종료");
			System.out.println("=================");
			int menu;
			double a, b;
			switch (menu) {
				case 1:
					addCal(a,b);
					break;
				case 2:
					System.out.printf("%lf - %lf = %lf\n", a, b, a-b);
					break;
				case 3:
					
					break;
				case 4:
					div(a,b);
					break;
				case 5:
          Scanner scan = new Scanner(System.in);

          System.out.println(">>> 제곱 계산기 <<<");
          System.out.println("밑을 입력하세요.");

          double numberBottom = scan.nextInt();
          scan.nextLine();

          System.out.println("지수를 입력하세요.");
          double numberIndex = scan.nextInt();
          scan.nextLine();

          double numberResult = Math.pow(numberBottom,numberIndex);
          System.out.println("계산 결과 : " + numberResult);
					
					break;
				case 6:
					System.out.println("시스템을 종료합니다.");
					return;
				default:
					System.out.println("잘못된 입력입니다.");
					break;
			}
		}
    
	public double addCal(double a, double b){

		return a+b;

	}
}
