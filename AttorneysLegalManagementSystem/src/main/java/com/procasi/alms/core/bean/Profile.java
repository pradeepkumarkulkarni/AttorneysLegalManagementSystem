package com.procasi.alms.core.bean;

/**
 * The profile POJO.
 * 
 * @author EdgarOlvera
 */
public class Profile {

	/**
	 * The profile identifier.
	 */
	private int idProfile;
	
	/**
	 * The profile name.
	 */
	private String name;
	
	/**
	 * The profile description.
	 */
	private String description;

	/**
	 * Gets the idProfile.
	 * 
	 * @return the idProfile value.
	 */
	public int getIdProfile() {
		return this.idProfile;
	}

	/**
	 * @param pIdProfile
	 *            The idProfile to set.
	 */
	public void setIdProfile(int pIdProfile) {
		this.idProfile = pIdProfile;
	}

	/**
	 * Gets the name.
	 * 
	 * @return the name value.
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @param pName
	 *            The name to set.
	 */
	public void setName(String pName) {
		this.name = pName;
	}

	/**
	 * Gets the description.
	 * 
	 * @return the description value.
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * @param pDescription
	 *            The description to set.
	 */
	public void setDescription(String pDescription) {
		this.description = pDescription;
	}

}
