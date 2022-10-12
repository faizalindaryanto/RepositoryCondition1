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

	@Override
	public List<SkripsiModel> skripsiMengandungKata(SkripsiModel skripsiModel) {
		// TODO Auto-generated method stub
		var result = skripsiRepository.skripsiMengandungKata(skripsiModel);
		return result;
	}

	@Override
	public List<SkripsiModel> skripsiTahunDanNilai(SkripsiModel skripsiModel) {
		// TODO Auto-generated method stub
		var result = skripsiRepository.skripsiTahunDanNilai(skripsiModel);
		return result;
	}

	@Override
	public List<SkripsiModel> skripsiKecualiTahun(SkripsiModel skripsiModel) {
		// TODO Auto-generated method stub
		var result = skripsiRepository.skripsiKecualiTahun(skripsiModel);
		return result;
	}

	@Override
	public List<SkripsiModel> skripsiSelain(SkripsiModel skripsiModel) {
		// TODO Auto-generated method stub
		var result = skripsiRepository.skripsiSelain(skripsiModel);
		return result;
	}

}
