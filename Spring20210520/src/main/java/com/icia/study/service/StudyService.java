package com.icia.study.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.icia.study.dao.StudyDAO;


@Service
public class StudyService {

	@Autowired
	private StudyDAO sdao;
	
	private ModelAndView mav;
	
	public void insertDB(String param1) {
		sdao.insertDB(param1);
	}
	
	public ModelAndView selectDB() {
		System.out.println("Service시작");
		mav = new ModelAndView();
		//DB조회한 내용을 ArrayList에 담음
		//우변
		List<String> dbList = sdao.selectDB();
		//dbList에 담긴 값을 가지고 select.jsp로 이동해야함.
		//어떤 데이터를 어떤 페이지를 가지고 가기 위해 mav 객체로 이용 
		
		//DBLIST 변수값 확인용..
		for(int i=0; i<dbList.size(); i++) {
			System.out.println(dbList.get(i));
		}
		System.out.println("Service끝");
		
		//데이터를 담는 내용
		mav.addObject("dbList1", dbList);
		
		//목적지를 지정하는 내용(jsp 파일 이름)
		mav.setViewName("select");
		return mav;
	}
}
