package com.app.skripsiRepo1.service;

import java.util.List;

import com.app.skripsiRepo1.model.SkripsiModel;

public interface ISkripsiService {
	
	public List<SkripsiModel> skripsiLebihDariTahun(SkripsiModel skripsiModel);
	public List<SkripsiModel> skripsiMengandungKata(SkripsiModel skripsiModel);
	public List<SkripsiModel> skripsiTahunDanNilai(SkripsiModel skripsiModel);
	public List<SkripsiModel> skripsiKecualiTahun(SkripsiModel skripsiModel);
	public List<SkripsiModel> skripsiSelain(SkripsiModel skripsiModel);
}
