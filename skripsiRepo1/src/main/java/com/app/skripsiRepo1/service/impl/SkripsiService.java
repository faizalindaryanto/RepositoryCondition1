package com.app.skripsiRepo1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.skripsiRepo1.model.SkripsiModel;
import com.app.skripsiRepo1.repository.ISkripsiRepository;
import com.app.skripsiRepo1.service.ISkripsiService;

@Service
public class SkripsiService implements ISkripsiService {
	
	@Autowired
	ISkripsiRepository skripsiRepository;
	
	@Override
	public List<SkripsiModel> skripsiLebihDariTahun(SkripsiModel skripsiModel) {
		// TODO Auto-generated method stub
		var result = skripsiRepository.skripsiLebihDariTahun(skripsiModel);
		return result;
	}

}
