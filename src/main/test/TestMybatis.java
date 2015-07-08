import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.youyou.model.User;
import com.youyou.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
// ��ʾ�̳���SpringJUnit4ClassRunner��
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class TestMybatis {

	@Resource
	private IUserService userService = null;

	@Test
	public void test1() {
		User user = userService.getUserById(1);
		System.out.println(user.getUsername());
	}
}
