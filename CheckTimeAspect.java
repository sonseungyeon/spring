package spring03.aop.ex02.ex;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class CheckTimeAspect {
	@Around("execution(String *.printGugu())")
	public String timeCheck(ProceedingJoinPoint jp) {
		long startTime = System.currentTimeMillis();
		
		String result = null;
		try {
			result = (String)jp.proceed();
			
		} catch (Throwable e) {
			//예외발생 시 파일을 만들고 예외 시간을 출력
			File file = new File("src/spring03/aop/ex02/ex","errorLog");
			try(BufferedWriter bw = 
					new BufferedWriter(
							new OutputStreamWriter(
									new FileOutputStream(file, true), "utf-8"))){
				String msg = e.toString()+"-"+LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss SSS"))+"\n";
				bw.write(msg);
				bw.flush();
			} catch (UnsupportedEncodingException e1) {
				System.out.println("인코딩익셉션");
				e1.printStackTrace();
			} catch (FileNotFoundException e1) {
				System.out.println("파일 낫파운드 익셉션");
				e1.printStackTrace();
			} catch (IOException e1) {
				System.out.println("아이오 익셉션");
				e1.printStackTrace();
			}
		}
		
		long endTime = System.currentTimeMillis();
		long time = endTime - startTime;
		System.out.println("걸린시간 : " + time/1000+"초");
		return result;
	}
}
