package com.app.skripsiRepo1.service;

import java.util.List;

import com.app.skripsiRepo1.dto.SubSkripsiModel;
import com.app.skripsiRepo1.model.SkripsiModel;

public interface ISkripsiService {
	
	public List<SkripsiModel> skripsiLebihDariTahun(SkripsiModel skripsiModel);
	public List<SkripsiModel> skripsiMengandungKata(String judul);
	public List<SkripsiModel> skripsiTahunDanNilai(SkripsiModel skripsiModel);
	public List<SkripsiModel> skripsiKecualiTahun(SkripsiModel skripsiModel);
	public List<SkripsiModel> skripsiSelain(SkripsiModel skripsiModel);
}
