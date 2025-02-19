package controller.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/* 패키지: 기능폴더.도메인폴더 - 모두 소문자
 * 파일 : 지금같은 폴더명의 규칙
 */
@RestController
public class UserController {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello, World!";
	}
}
