package com.bfm.db.bean;

// Generated 2015-12-8 13:28:50 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;

/**
 * TbinstitutioncreditId generated by hbm2java
 */
public class TbinstitutioncreditId implements java.io.Serializable {

	private BigDecimal pubDate;
	private String institutionNo;
	private String rateInstitutionNo;
	private String creditType;

	public TbinstitutioncreditId() {
	}

	public TbinstitutioncreditId(BigDecimal pubDate, String institutionNo,
			String rateInstitutionNo, String creditType) {
		this.pubDate = pubDate;
		this.institutionNo = institutionNo;
		this.rateInstitutionNo = rateInstitutionNo;
		this.creditType = creditType;
	}

	public BigDecimal getPubDate() {
		return this.pubDate;
	}

	public void setPubDate(BigDecimal pubDate) {
		this.pubDate = pubDate;
	}

	public String getInstitutionNo() {
		return this.institutionNo;
	}

	public void setInstitutionNo(String institutionNo) {
		this.institutionNo = institutionNo;
	}

	public String getRateInstitutionNo() {
		return this.rateInstitutionNo;
	}

	public void setRateInstitutionNo(String rateInstitutionNo) {
		this.rateInstitutionNo = rateInstitutionNo;
	}

	public String getCreditType() {
		return this.creditType;
	}

	public void setCreditType(String creditType) {
		this.creditType = creditType;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TbinstitutioncreditId))
			return false;
		TbinstitutioncreditId castOther = (TbinstitutioncreditId) other;

		return ((this.getPubDate() == castOther.getPubDate()) || (this
				.getPubDate() != null && castOther.getPubDate() != null && this
				.getPubDate().equals(castOther.getPubDate())))
				&& ((this.getInstitutionNo() == castOther.getInstitutionNo()) || (this
						.getInstitutionNo() != null
						&& castOther.getInstitutionNo() != null && this
						.getInstitutionNo()
						.equals(castOther.getInstitutionNo())))
				&& ((this.getRateInstitutionNo() == castOther
						.getRateInstitutionNo()) || (this
						.getRateInstitutionNo() != null
						&& castOther.getRateInstitutionNo() != null && this
						.getRateInstitutionNo().equals(
								castOther.getRateInstitutionNo())))
				&& ((this.getCreditType() == castOther.getCreditType()) || (this
						.getCreditType() != null
						&& castOther.getCreditType() != null && this
						.getCreditType().equals(castOther.getCreditType())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPubDate() == null ? 0 : this.getPubDate().hashCode());
		result = 37
				* result
				+ (getInstitutionNo() == null ? 0 : this.getInstitutionNo()
						.hashCode());
		result = 37
				* result
				+ (getRateInstitutionNo() == null ? 0 : this
						.getRateInstitutionNo().hashCode());
		result = 37
				* result
				+ (getCreditType() == null ? 0 : this.getCreditType()
						.hashCode());
		return result;
	}

}
