package com.pecas.pecas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pecas.PecasRepository.PecasRepository;
import com.pecas.models.Produto;

@Controller
public class produtoController {
	
	@Autowired
	private PecasRepository er;
	
	@RequestMapping(value="/cadastrarProduto", method=RequestMethod.GET)
	public String form(){
		return"formProduto";
	}
	
	@RequestMapping(value="/cadastrarProduto", method=RequestMethod.POST)
	public String form(Produto produto){
		
		er.save(produto);
		
		return"redirect:/castrarProduto";
	}


}
