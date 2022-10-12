package com.app.skripsiRepo1.repository;

import java.util.List;

import com.app.skripsiRepo1.model.SkripsiModel;

public interface ISkripsiRepository {
	public List<SkripsiModel> skripsiLebihDariTahun(SkripsiModel skripsiModel);
	public SkripsiModel skripsiMengandungKata(SkripsiModel skripsiModel);
	public SkripsiModel skripsiTahunDanNilai(SkripsiModel skripsiModel);
	public SkripsiModel skripsiKecualiTahun(SkripsiModel skripsiModel);
	public SkripsiModel skripsiSelain(SkripsiModel skripsiModel);
}
