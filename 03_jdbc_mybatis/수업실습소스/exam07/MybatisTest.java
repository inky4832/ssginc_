package exam07;

import java.util.List;

public class MybatisTest {


	
	public static void main(String[] args) {

		DeptMybatisService service = new DeptMybatisServiceImpl();
		List<DeptDTO> list = service.findAll();
		System.out.println(list);
	}

}
