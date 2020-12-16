package com.insurance.user.models.indianFatca.retirementPlan;

import com.insurance.user.models.indianFatca.retirementPlan.Business;
import com.insurance.user.models.indianFatca.retirementPlan.InheritanceProperty;
import com.insurance.user.models.indianFatca.retirementPlan.Pension;
import com.insurance.user.models.indianFatca.retirementPlan.Pf;
import com.insurance.user.models.indianFatca.retirementPlan.Ppf;
import com.insurance.user.models.indianFatca.retirementPlan.RealEstate;
import com.insurance.user.models.indianFatca.retirementPlan.RentealEstate;

public class IndoRetirementPlan {
		
	private Pf pf;
	private Ppf ppf;
	private Pension pension;
	private RealEstate realEstate;
	private	RentealEstate rentealEstate;
	private Business business;
	private InheritanceProperty inheritanceProperty;
	
	public Pf getPf() {
		return pf;
	}
	public void setPf(Pf pf) {
		this.pf = pf;
	}
	public Ppf getPpf() {
		return ppf;
	}
	public void setPpf(Ppf ppf) {
		this.ppf = ppf;
	}
	public Pension getPension() {
		return pension;
	}
	public void setPension(Pension pension) {
		this.pension = pension;
	}
	public RealEstate getRealEstate() {
		return realEstate;
	}
	public void setRealEstate(RealEstate realEstate) {
		this.realEstate = realEstate;
	}
	public RentealEstate getRentealEstate() {
		return rentealEstate;
	}
	public void setRentealEstate(RentealEstate rentealEstate) {
		this.rentealEstate = rentealEstate;
	}
	public Business getBusiness() {
		return business;
	}
	public void setBusiness(Business business) {
		this.business = business;
	}
	public InheritanceProperty getInheritanceProperty() {
		return inheritanceProperty;
	}
	public void setInheritanceProperty(InheritanceProperty inheritanceProperty) {
		this.inheritanceProperty = inheritanceProperty;
	}
	
	
	
	
	
}
