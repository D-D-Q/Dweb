package du.core.model;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import du.core.model.User;

public class UserTests {

	private SqlSessionFactory sqlSessionFactory;
	
	
	public void insert() {
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		User user = new User();
		user.setUser_name("我是用户名");
		user.setPassword("我是密码");
		
		sqlSession.insert("user.insert", user);
		
		sqlSession.commit();
	}
	
	
	public void select() {
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		User user = sqlSession.selectOne("user.findById", 1);
		
		System.out.println(user.getUser_name());
		
	}
	
	@Test
	public void delete() {
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		sqlSession.delete("user.delete");
		
		sqlSession.commit();
	}
	
	
	public void update() {
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		User user = new User();
		user.setId(2);
		user.setUser_name("我是用户名2");
		
		sqlSession.update("user.update", user);
		
		sqlSession.commit();
	}
}
