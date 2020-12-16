package com.insurance.user.models;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.insurance.user.models.FamilyDetails.FamilyDetails;
import com.insurance.user.models.financialGoals.FinancePlanning;
import com.insurance.user.models.indianFatca.*;
import com.insurance.user.models.indianFatca.retirementPlan.IndoRetirementPlan;
import com.insurance.user.models.usaFatca.UsaFatca;

@Document(collection = "userData")
public class UserDetails {

	@Id
	private int id;
	private String address;
	private String needs;
	private String notes;
	private IndianFatca indianFatca;
	private UsaFatca usaFatca;
	private FinancePlanning financePlanning;
	private FamilyDetails familyDetails;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNeeds() {
		return needs;
	}
	public void setNeeds(String needs) {
		this.needs = needs;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public IndianFatca getIndianFatca() {
		return indianFatca;
	}
	public void setIndianFatca(IndianFatca indianFatca) {
		this.indianFatca = indianFatca;
	}
	public UsaFatca getUsaFatca() {
		return usaFatca;
	}
	public void setUsaFatca(UsaFatca usaFatca) {
		this.usaFatca = usaFatca;
	}
	public FinancePlanning getFinancePlanning() {
		return financePlanning;
	}
	public void setFinancePlanning(FinancePlanning financePlanning) {
		this.financePlanning = financePlanning;
	}
	public FamilyDetails getFamilyDetails() {
		return familyDetails;
	}
	public void setFamilyDetails(FamilyDetails familyDetails) {
		this.familyDetails = familyDetails;
	}
	
	
	
}
