package kr.co.demo.db;


import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class ConnectionTest {
	
	@Inject
	private DataSource ds;
	
	@Before
	public void Main() {
		System.out.println("Connection Test");
	}

	@Test
	public void test() {
		try(Connection con = ds.getConnection()){
			System.out.println("Connection >>>>>>>>>>>>>> " + con);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
