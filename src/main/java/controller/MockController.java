package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import dao.MockDao;
import dto.MockDto;

@Controller
public class MockController {

	// @Autowired
	// MockDao mockDao;
	//
	// @Autowired
	// MockDto mockDto;

	MockDao mockDao = new MockDao();
	MockDto mockDto = new MockDto();

	@RequestMapping("/signup")
	public ModelAndView SignUp() {
		ModelAndView andView = new ModelAndView("signup.jsp");
		andView.addObject("signObj", mockDto);
		return andView;
	}

	@ResponseBody
	@RequestMapping("/save")
	public void Save(MockDto dto) {
		mockDao.insert(dto);
	}

	@RequestMapping("delete1")
	public ModelAndView delete() {
		ModelAndView andView = new ModelAndView("Delete.jsp");
		andView.addObject("deleteObj", mockDto);
		return andView;
	}
	@ResponseBody
	@RequestMapping("/delete2")
	public String delete2(MockDto dto){
		MockDto dto2=mockDao.findbyId(dto.getEmail());
		mockDao.delete(dto2);
		return "Deleted";
		
	}
	
	@RequestMapping("/fetch1")
	public ModelAndView fetch(){
		List<MockDto> list=mockDao.findAll();
		ModelAndView andView=new ModelAndView("Fetch2.jsp");
		andView.addObject("data",list);
		return andView;
	}
	
}
