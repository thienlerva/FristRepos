package com.revature.pojos;

public class AccountType {
	
	private int typeId;
	private String accounType;
	
	public AccountType() {}

	public AccountType(int typeId, String accounType) {
		super();
		this.typeId = typeId;
		this.accounType = accounType;
	}

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public String getAccounType() {
		return accounType;
	}

	public void setAccounType(String accounType) {
		this.accounType = accounType;
	}

	@Override
	public String toString() {
		return "AccountType [typeId=" + typeId + ", accounType=" + accounType + "]";
	}
	
	

}
