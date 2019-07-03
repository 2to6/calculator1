public class calculator
{
	public static void main(String argv[])
	{
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
					
					break;
				case 2:
					System.out.printf("%lf - %lf = %lf\n", a, b, a-b);
					break;
				case 3:
					
					break;
				case 4:
					
					break;
				case 5:
					
					break;
				case 6:
					System.out.println("시스템을 종료합니다.");
					return;
				default:
					System.out.println("잘못된 입력입니다.");
					break;
			}
		}
	}
}