package spring03.aop.ex;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GugudanAspect {
	int hour = LocalDateTime.now().getHour();
	int minute = LocalDateTime.now().getMinute();
	int second = LocalDateTime.now().getSecond();
	int nano = LocalDateTime.now().getNano();
	
	public void beforeTime() {
		System.out.println("메서드 성공" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH시 mm분 ss초 : SSS")));
	}
	public void afterTime() {
		System.out.println("메서드 성공" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH시 mm분 ss초 : SSS")));
	}
	
	public void afterTimeReturn(String msg) {
		System.out.println("메서드 성공" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH시 mm분 ss초 : SSS")));
		System.out.println(msg);
		
	}
	
	public void afterTimeThrowing(Throwable th) {
		//파일로 기록하도록 구현.
		//FileWriter는 파일이 없으면 자동으로 생성해줌 write하기 위해서 BufferedWriter를 사용함.
		File file = new File("error.txt");
		//true는 계속 밑에 내용을 써나가겠다는 것임. 없애면 쓴내용을 지우고 씀.
		try(BufferedWriter bf = new BufferedWriter(new FileWriter(file,true))){
			
			System.out.println("에러발생!!");
			bf.write(th + "Error : "
			+ LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH시 mm분 ss초 : SSS")));
			bf.newLine();
			bf.flush();
			
		}catch(Exception e) {
			//기록 내용 (예외 명 - 발생시간)
			
			
		}	
		
	}
}
