package com.bfm.db.bean;

// Generated 2015-12-8 13:28:50 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;

/**
 * TbinstpaydatelistId generated by hbm2java
 */
public class TbinstpaydatelistId implements java.io.Serializable {

	private String businNo;
	private BigDecimal legNo;
	private BigDecimal listNo;
	private BigDecimal versionNo;

	public TbinstpaydatelistId() {
	}

	public TbinstpaydatelistId(String businNo, BigDecimal legNo,
			BigDecimal listNo, BigDecimal versionNo) {
		this.businNo = businNo;
		this.legNo = legNo;
		this.listNo = listNo;
		this.versionNo = versionNo;
	}

	public String getBusinNo() {
		return this.businNo;
	}

	public void setBusinNo(String businNo) {
		this.businNo = businNo;
	}

	public BigDecimal getLegNo() {
		return this.legNo;
	}

	public void setLegNo(BigDecimal legNo) {
		this.legNo = legNo;
	}

	public BigDecimal getListNo() {
		return this.listNo;
	}

	public void setListNo(BigDecimal listNo) {
		this.listNo = listNo;
	}

	public BigDecimal getVersionNo() {
		return this.versionNo;
	}

	public void setVersionNo(BigDecimal versionNo) {
		this.versionNo = versionNo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TbinstpaydatelistId))
			return false;
		TbinstpaydatelistId castOther = (TbinstpaydatelistId) other;

		return ((this.getBusinNo() == castOther.getBusinNo()) || (this
				.getBusinNo() != null && castOther.getBusinNo() != null && this
				.getBusinNo().equals(castOther.getBusinNo())))
				&& ((this.getLegNo() == castOther.getLegNo()) || (this
						.getLegNo() != null && castOther.getLegNo() != null && this
						.getLegNo().equals(castOther.getLegNo())))
				&& ((this.getListNo() == castOther.getListNo()) || (this
						.getListNo() != null && castOther.getListNo() != null && this
						.getListNo().equals(castOther.getListNo())))
				&& ((this.getVersionNo() == castOther.getVersionNo()) || (this
						.getVersionNo() != null
						&& castOther.getVersionNo() != null && this
						.getVersionNo().equals(castOther.getVersionNo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getBusinNo() == null ? 0 : this.getBusinNo().hashCode());
		result = 37 * result
				+ (getLegNo() == null ? 0 : this.getLegNo().hashCode());
		result = 37 * result
				+ (getListNo() == null ? 0 : this.getListNo().hashCode());
		result = 37 * result
				+ (getVersionNo() == null ? 0 : this.getVersionNo().hashCode());
		return result;
	}

}
