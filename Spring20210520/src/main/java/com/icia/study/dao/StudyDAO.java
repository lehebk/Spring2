package com.icia.study.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudyDAO {

	@Autowired
	private SqlSessionTemplate sql;
	
	public void insertDB(String param1) {
		sql.insert("study.insertDB", param1);
	}
	
	public List<String> selectDB() {
		System.out.println("DB시작");
		//select *from을 쓸때는 selectList 메소드 사용
		return sql.selectList("study.selectDB");
	}
}
