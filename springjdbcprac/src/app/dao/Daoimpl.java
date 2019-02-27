package app.dao;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import app.pojos.Rregister;

@Repository
public class Daoimpl implements Daointer {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void insert(Rregister r) {
		// TODO Auto-generated method stub
 System.out.println("in insert dao");
 jdbcTemplate.update("insert into rrregister values(?,?,?)",r.getName(),r.getEmail(),r.getPassword());
 System.out.println("executed");
	}


	@Override
	public void retrival(Rregister r) {
		// TODO Auto-generated method stub
		System.out.println("in dao retrival");
		String sql="select * from rrregister where name=?";
		List<Map<String, Object>> ll=jdbcTemplate.queryForList(sql, r.getName());
		for (Map<String, Object> map : ll) {
			System.out.println("data=="+map.values());
			System.out.println("keys were=="+map.keySet());
			Set<Entry<String, Object>> e=map.entrySet();
			System.out.println("entry data was=="+e);
		}
		System.out.println("data was retrieved");
	}

}
