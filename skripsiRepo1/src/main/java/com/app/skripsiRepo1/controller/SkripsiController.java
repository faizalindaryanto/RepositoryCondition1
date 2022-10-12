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
	
	@GetMapping("/get1")
	public List<SkripsiModel> get1(@RequestBody SkripsiModel skripsiModel){
		var result = skripsiService.skripsiLebihDariTahun(skripsiModel);
		return result;
	}
	@GetMapping("/get2")
	public List<SkripsiModel> get2(@RequestBody SkripsiModel skripsiModel){
		var result = skripsiService.skripsiMengandungKata(skripsiModel);
		return result;
	}
	@GetMapping("/get3")
	public List<SkripsiModel> get3(@RequestBody SkripsiModel skripsiModel){
		var result = skripsiService.skripsiTahunDanNilai(skripsiModel);
		return result;
	}
	@GetMapping("/get4")
	public List<SkripsiModel> get4(@RequestBody SkripsiModel skripsiModel){
		var result = skripsiService.skripsiKecualiTahun(skripsiModel);
		return result;
	}
	@GetMapping("/get5")
	public List<SkripsiModel> get5(@RequestBody SkripsiModel skripsiModel){
		var result = skripsiService.skripsiSelain(skripsiModel);
		return result;
	}
}
