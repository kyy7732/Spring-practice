package core.main;

import org.springframework.context.support.GenericXmlApplicationContext;

import core.chap2.Hotel;

public class Main {

	public static void main(String[] args) {
		
//		Hotel hotel = new Hotel();
//		hotel.inform();
		
		// 빈 등록에 사용된 xml의 설정을 가져오는 객체를 생성. (classpath == src/main/resources)
		GenericXmlApplicationContext ct = 
				new GenericXmlApplicationContext("classpath:hotel-config.xml"); 
		
		Hotel hotel1 = ct.getBean("hotel1", Hotel.class);
		hotel1.inform();
		// ct.getBean을 한다고 해도 새로운 객체가 생기는게 아니다.
		
		System.out.println("===================================");
		
		Hotel hotel2 = ct.getBean("hotel2", Hotel.class);
		hotel2.inform();
		
	}
}




































