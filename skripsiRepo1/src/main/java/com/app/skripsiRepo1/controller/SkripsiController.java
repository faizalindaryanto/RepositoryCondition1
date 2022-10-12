package com.app.skripsiRepo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.skripsiRepo1.model.SkripsiModel;
import com.app.skripsiRepo1.service.ISkripsiService;
import com.app.skripsiRepo1.service.impl.SkripsiService;

@RestController
public class SkripsiController {
	
	@Autowired
	ISkripsiService skripsiService;
	
	@RequestMapping("/header")
	public String beranda() {
		return "/beranda";
	}
	
	@GetMapping("/getall")
	public List<SkripsiModel> getAll(@RequestBody SkripsiModel skripsiModel){
		var result = skripsiService.skripsiLebihDariTahun(skripsiModel);
		return result;
	}
}
