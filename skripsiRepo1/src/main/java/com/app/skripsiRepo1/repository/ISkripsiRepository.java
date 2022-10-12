package com.app.skripsiRepo1.repository;

import com.app.skripsiRepo1.model.SkripsiModel;

public interface ISkripsiRepository {
	public SkripsiModel skripsiLebihDariTahun(SkripsiModel skripsiModel);
	public SkripsiModel skripsiMengandungKata(SkripsiModel skripsiModel);
	public SkripsiModel skripsiTahunDanNilai(SkripsiModel skripsiModel);
	public SkripsiModel skripsiKecualiTahun(SkripsiModel skripsiModel);
	public SkripsiModel skripsiSelain(SkripsiModel skripsiModel);
	
}
