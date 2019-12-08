package com.pecas.pecas;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class produtoController {
	
	@RequestMapping("/cadastrarProduto")
	public String form(){
		return"formProduto";
	}

}
