package com.insurance.user.models.indianFatca;

import java.util.Date;

import com.insurance.user.models.indianFatca.emergencyFund.IndoEmergencyFund;
import com.insurance.user.models.indianFatca.estatePlanning.IndoEstatePlanning;
import com.insurance.user.models.indianFatca.familyProtechtion.IndoFamilyProtection;
import com.insurance.user.models.indianFatca.retirementPlan.IndoRetirementPlan;
import com.insurance.user.models.indianFatca.stockMarket.IndoStockMarket;

public class IndianFatca {

	private String name;
	private String date;
	private IndoRetirementPlan indoRequirementPlan;
	private IndoStockMarket indoStockMarket;
	private IndoFamilyProtection indoFamilyProtection;
	private IndoEstatePlanning indoEstatePlanning;
	private IndoEmergencyFund indoEmergencyFund;
	private String totalAmount;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public IndoRetirementPlan getIndoRequirementPlan() {
		return indoRequirementPlan;
	}
	public void setIndoRequirementPlan(IndoRetirementPlan indoRequirementPlan) {
		this.indoRequirementPlan = indoRequirementPlan;
	}
	public IndoStockMarket getIndoStockMarket() {
		return indoStockMarket;
	}
	public void setIndoStockMarket(IndoStockMarket indoStockMarket) {
		this.indoStockMarket = indoStockMarket;
	}
	public IndoFamilyProtection getIndoFamilyProtection() {
		return indoFamilyProtection;
	}
	public void setIndoFamilyProtection(IndoFamilyProtection indoFamilyProtection) {
		this.indoFamilyProtection = indoFamilyProtection;
	}
	public IndoEstatePlanning getIndoEstatePlanning() {
		return indoEstatePlanning;
	}
	public void setIndoEstatePlanning(IndoEstatePlanning indoEstatePlanning) {
		this.indoEstatePlanning = indoEstatePlanning;
	}
	public IndoEmergencyFund getIndoEmergencyFund() {
		return indoEmergencyFund;
	}
	public void setIndoEmergencyFund(IndoEmergencyFund indoEmergencyFund) {
		this.indoEmergencyFund = indoEmergencyFund;
	}
	public String getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	
	
}
