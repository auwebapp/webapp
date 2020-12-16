package com.insurance.user.models.usaFatca;

import com.insurance.user.models.usaFatca.collegePlanning.UsaCollegePlanning;
import com.insurance.user.models.usaFatca.emergencyFund.UsaEmergencyFund;
import com.insurance.user.models.usaFatca.estatePlanning.UsaEstatePlan;
import com.insurance.user.models.usaFatca.familyProtection.UsaFamilyProtection;
import com.insurance.user.models.usaFatca.retirementPlan.UsaRequirementPlan;
import com.insurance.user.models.usaFatca.stockMarket.UsaStockMarket;

public class UsaFatca {

	private String name;
	private String totalAmount;
	private UsaRequirementPlan usaRequirementPlan;
	private UsaStockMarket usaStockMarket;
	private UsaFamilyProtection usaFamilyProtection;
	private UsaCollegePlanning usaCollegePlanning;
	private UsaEstatePlan usaEstatePlan;
	private UsaEmergencyFund usaEmergencyFund;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public UsaRequirementPlan getUsaRequirementPlan() {
		return usaRequirementPlan;
	}
	public void setUsaRequirementPlan(UsaRequirementPlan usaRequirementPlan) {
		this.usaRequirementPlan = usaRequirementPlan;
	}
	public UsaStockMarket getUsaStockMarket() {
		return usaStockMarket;
	}
	public void setUsaStockMarket(UsaStockMarket usaStockMarket) {
		this.usaStockMarket = usaStockMarket;
	}
	public UsaFamilyProtection getUsaFamilyProtection() {
		return usaFamilyProtection;
	}
	public void setUsaFamilyProtection(UsaFamilyProtection usaFamilyProtection) {
		this.usaFamilyProtection = usaFamilyProtection;
	}
	public UsaCollegePlanning getUsaCollegePlanning() {
		return usaCollegePlanning;
	}
	public void setUsaCollegePlanning(UsaCollegePlanning usaCollegePlanning) {
		this.usaCollegePlanning = usaCollegePlanning;
	}
	public UsaEstatePlan getUsaEstatePlan() {
		return usaEstatePlan;
	}
	public void setUsaEstatePlan(UsaEstatePlan usaEstatePlan) {
		this.usaEstatePlan = usaEstatePlan;
	}
	public UsaEmergencyFund getUsaEmergencyFund() {
		return usaEmergencyFund;
	}
	public void setUsaEmergencyFund(UsaEmergencyFund usaEmergencyFund) {
		this.usaEmergencyFund = usaEmergencyFund;
	}
	
	
}
