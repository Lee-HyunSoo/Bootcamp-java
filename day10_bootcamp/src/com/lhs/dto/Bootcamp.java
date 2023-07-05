package com.lhs.dto;

public class Bootcamp {
	private String cName = ""; // 이름
	private String cRating = ""; // 멤버 등급
	private String cJoinDate = ""; // 가입일
	private String cLastDate = ""; // 최종 방문일
	private int cVisitNo = 0 ; // 방문 수
	private int cPostNo = 0; // 게시글 수
	private int cCommentNo = 0; // 댓글 수
	private String cGenger = ""; // 성별
	private String cAge = ""; // 연령대
	
	public Bootcamp() {
	}

	public Bootcamp(String cName, String cRating, String cJoinDate, String cLastDate, int cVisitNo, int cPostNo,
			int cCommentNo, String cGenger, String cAge) {
		super();
		this.cName = cName;
		this.cRating = cRating;
		this.cJoinDate = cJoinDate;
		this.cLastDate = cLastDate;
		this.cVisitNo = cVisitNo;
		this.cPostNo = cPostNo;
		this.cCommentNo = cCommentNo;
		this.cGenger = cGenger;
		this.cAge = cAge;
	}

	public String getcName() {
		return cName;
	}

	public String getcRating() {
		return cRating;
	}

	public String getcJoinDate() {
		return cJoinDate;
	}

	public String getcLastDate() {
		return cLastDate;
	}

	public int getcVistiNo() {
		return cVisitNo;
	}

	public int getcPostNo() {
		return cPostNo;
	}

	public int getcCommentNo() {
		return cCommentNo;
	}

	public String getcGenger() {
		return cGenger;
	}

	public String getcAge() {
		return cAge;
	}

	@Override
	public String toString() {
		return "Bootcamp [cName=" + cName + ", cRating=" + cRating + ", cJoinDate=" + cJoinDate + ", cLastDate="
				+ cLastDate + ", cVisitNo=" + cVisitNo + ", cPostNo=" + cPostNo + ", cCommentNo=" + cCommentNo
				+ ", cGenger=" + cGenger + ", cAge=" + cAge + "]";
	}
	
}
