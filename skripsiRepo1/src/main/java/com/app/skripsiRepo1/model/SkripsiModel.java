package com.app.skripsiRepo1.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class SkripsiModel {
	@Id
	private int id;
	private String judul;
	private int nilai;
	private int tahun;
}
