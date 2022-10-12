package com.app.skripsiRepo1.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.app.skripsiRepo1.model.SkripsiModel;
import com.app.skripsiRepo1.repository.ISkripsiRepository;

@Repository
public class SkripsiRepository implements ISkripsiRepository {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	@Override
	public List<SkripsiModel> skripsiLebihDariTahun(SkripsiModel skripsiModel) {
		// TODO Auto-generated method stub
		
		String query = "Select * from skripsi_model where tahun <= ?";
		var result = jdbcTemplate.query(query, new BeanPropertyRowMapper<>(SkripsiModel.class),new Object[] {skripsiModel.getTahun()});
		return result;
	}

	@Override
	public SkripsiModel skripsiMengandungKata(SkripsiModel skripsiModel) {
		// TODO Auto-generated method stub
		String query = "Select judul from SkripsiModel where judul like '%?%'";
		
		var result = jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<>(SkripsiModel.class),new Object[] {skripsiModel.getJudul()});
		return result;
	}

	@Override
	public SkripsiModel skripsiTahunDanNilai(SkripsiModel skripsiModel) {
		// TODO Auto-generated method stub
		String query = "Select judul from SkripsiModel where tahun == ? and nilai == ?";
		
		var result = jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<>(SkripsiModel.class),new Object[] {skripsiModel.getTahun(), skripsiModel.getNilai()});
		return result;
	}

	@Override
	public SkripsiModel skripsiKecualiTahun(SkripsiModel skripsiModel) {
		// TODO Auto-generated method stub
		String query = "Select judul from SkripsiModel where tahun != ?";
		var result = jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<>(SkripsiModel.class),new Object[] {skripsiModel.getTahun()});
		return result;
	}

	@Override
	public SkripsiModel skripsiSelain(SkripsiModel skripsiModel) {
		// TODO Auto-generated method stub
		String query = "Select judul from SkripsiModel where judul not like '?%' order by tahun desc";
		var result = jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<>(SkripsiModel.class),new Object[] {skripsiModel.getJudul()});
		return result;
	}

}
