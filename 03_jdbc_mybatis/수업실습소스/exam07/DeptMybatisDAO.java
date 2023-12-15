package exam07;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class DeptMybatisDAO {

	public List<DeptDTO> findAll(SqlSession session){
		return session.selectList("exam07.DeptMapper.findAll");
	}
}
