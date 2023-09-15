package core.chap3;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor // 기본 생성자
@AllArgsConstructor // 생성자
public class WesternRestaurant implements Restaurant {

	private Chef chef;
	
	// 요리 코스
	private Course course;
	
	
	
	// 요리를 주문하는 기능
	public void order() {
		System.out.println("서양 요리를 주문합니다.");
		course.combineMenu();
		chef.cook();
	}
	
}
