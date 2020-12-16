package com.insurance.user.models.financialGoals;

import com.insurance.user.models.financialGoals.collegePlanning.CollegePlanning;
import com.insurance.user.models.financialGoals.legacyPlan.FinancialLegacyPlan;
import com.insurance.user.models.financialGoals.lifeGoal.FinancialLifeGoal;
import com.insurance.user.models.financialGoals.longTermMedical.FinancialLongTermCare;
import com.insurance.user.models.financialGoals.marriagePlan.KidsMarriage;
import com.insurance.user.models.financialGoals.retirementPlan.FinanceRetirementPlan;

public class FinancePlanning {

	private CollegePlanning collegePlanning;
	private KidsMarriage kidsMarriage;
	private FinanceRetirementPlan financeRetirementPlan;
	private FinancialLongTermCare financialLongTermCare;
	private FinancialLifeGoal financialLifeGoal;
	private FinancialLegacyPlan financialLegacyPlan;
	
	
	public CollegePlanning getCollegePlanning() {
		return collegePlanning;
	}
	public void setCollegePlanning(CollegePlanning collegePlanning) {
		this.collegePlanning = collegePlanning;
	}
	public KidsMarriage getKidsMarriage() {
		return kidsMarriage;
	}
	public void setKidsMarriage(KidsMarriage kidsMarriage) {
		this.kidsMarriage = kidsMarriage;
	}
	public FinanceRetirementPlan getFinanceRetirementPlan() {
		return financeRetirementPlan;
	}
	public void setFinanceRetirementPlan(FinanceRetirementPlan financeRetirementPlan) {
		this.financeRetirementPlan = financeRetirementPlan;
	}
	public FinancialLongTermCare getFinancialLongTermCare() {
		return financialLongTermCare;
	}
	public void setFinancialLongTermCare(FinancialLongTermCare financialLongTermCare) {
		this.financialLongTermCare = financialLongTermCare;
	}
	public FinancialLifeGoal getFinancialLifeGoal() {
		return financialLifeGoal;
	}
	public void setFinancialLifeGoal(FinancialLifeGoal financialLifeGoal) {
		this.financialLifeGoal = financialLifeGoal;
	}
	public FinancialLegacyPlan getFinancialLegacyPlan() {
		return financialLegacyPlan;
	}
	public void setFinancialLegacyPlan(FinancialLegacyPlan financialLegacyPlan) {
		this.financialLegacyPlan = financialLegacyPlan;
	}
	
	
}
