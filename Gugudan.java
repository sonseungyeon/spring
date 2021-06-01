package spring03.aop.ex;

public class Gugudan {
	public String gugudanPrint() {
		for(int i=1;i<=9;i++) {
			System.out.println("5 X " + i + "=" + i*5);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			int num = (int)(Math.random()*4);
			if(num == 0) {
				throw new ArithmeticException();
			}
		}
		return "success";
	}
}
