package com.myapp.marvel;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

public class Marvel {
	private int marvelId;
	private String title;
	private String titleEng;
	private LocalDate releaseDate;
	private long worldBoxOffice;
	private LocalDateTime writeDate;
	private LocalDateTime updateDate;
	
	public Marvel() {
		super();
	}

	public Marvel(int marvelId, String title, String titleEng, LocalDate releaseDate, long worldBoxOffice,
			LocalDateTime writeDate, LocalDateTime updateDate) {
		super();
		this.marvelId = marvelId;
		this.title = title;
		this.titleEng = titleEng;
		this.releaseDate = releaseDate;
		this.worldBoxOffice = worldBoxOffice;
		this.writeDate = writeDate;
		this.updateDate = updateDate;
	}

	public int getMarvelId() {
		return marvelId;
	}

	public void setMarvelId(int marvelId) {
		this.marvelId = marvelId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitleEng() {
		return titleEng;
	}

	public void setTitleEng(String titleEng) {
		this.titleEng = titleEng;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public long getWorldBoxOffice() {
		return worldBoxOffice;
	}

	public void setWorldBoxOffice(long worldBoxOffice) {
		this.worldBoxOffice = worldBoxOffice;
	}

	public LocalDateTime getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(LocalDateTime writeDate) {
		this.writeDate = writeDate;
	}

	public LocalDateTime getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "MarvelMovie [marvelId=" + marvelId + ", title=" + title + ", titleEng=" + titleEng + ", releaseDate="
				+ releaseDate + ", worldBoxOffice=" + worldBoxOffice + ", writeDate=" + writeDate + ", updateDate="
				+ updateDate + "]";
	}
	
}
