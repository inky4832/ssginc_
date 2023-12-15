package exam07;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DeptMybatisServiceImpl implements DeptMybatisService{

	static SqlSessionFactory sqlSessionFactory = null;
	static {
		String resource = "exam07/Configuration.xml";
		InputStream inputStream=null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sqlSessionFactory =
		        new SqlSessionFactoryBuilder().build(inputStream);
	}//end static 블럭
	
	
	//기능처리
	@Override
	public List<DeptDTO> findAll(){
		List<DeptDTO> list = null;
		SqlSession session = sqlSessionFactory.openSession();
		try {
			
			DeptMybatisDAO dao = new DeptMybatisDAO();
			list = dao.findAll(session);
			
		}finally {
			session.close();
		}
		return list;
	}
}








