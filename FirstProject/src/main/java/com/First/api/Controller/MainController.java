package com.First.api.Controller;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.First.api.Dao.VoitureDAO;
import com.First.api.model.VoitureInfo;

public class MainController {
private VoitureDAO voitureDAO;
	
	@RequestMapping(value="/" , method = RequestMethod.GET)
	public String showVoiture(Model model) {
		List<VoitureInfo> list = voitureDAO.listVoitureInfo();
		model.addAttribute("voitureinfo", list);
		
		return "home";

}
}