package com.procasi.alms.core.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author EdgarOlvera
 */
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The user's identifier.
	 */
	private long idUser;
	
	/**
	 * The user's password.
	 */
	private String pass;
	
	/**
	 * The user's name.
	 */
	private String name;
	
	/**
	 * The user's profile.
	 */
	private String profile;
	
	/**
	 * Last time user login into application.
	 */
	private Date lastLoginDate;
	
	/**
	 * The user status to indicate if the user is allowed to sign in.
	 */
	private String status;

	/**
	 * Gets the idUser.
	 *
	 * @return the idUser value.
	 */
	public long getIdUser() {
		return this.idUser;
	}

	/**
	 * @param pIdUser
	 * The idUser to set.
	 */
	public void setIdUser(long pIdUser) {
		this.idUser = pIdUser;
	}

	/**
	 * Gets the pass.
	 *
	 * @return the pass value.
	 */
	public String getPass() {
		return this.pass;
	}

	/**
	 * @param pPass
	 * The pass to set.
	 */
	public void setPass(String pPass) {
		this.pass = pPass;
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
	 * The name to set.
	 */
	public void setName(String pName) {
		this.name = pName;
	}

	/**
	 * Gets the profile.
	 *
	 * @return the profile value.
	 */
	public String getProfile() {
		return this.profile;
	}

	/**
	 * @param pProfile
	 * The profile to set.
	 */
	public void setProfile(String pProfile) {
		this.profile = pProfile;
	}

	/**
	 * Gets the lastLoginDate.
	 *
	 * @return the lastLoginDate value.
	 */
	public Date getLastLoginDate() {
		return this.lastLoginDate;
	}

	/**
	 * @param pLastLoginDate
	 * The lastLoginDate to set.
	 */
	public void setLastLoginDate(Date pLastLoginDate) {
		this.lastLoginDate = pLastLoginDate;
	}

	/**
	 * Gets the status.
	 *
	 * @return the status value.
	 */
	public String getStatus() {
		return this.status;
	}

	/**
	 * @param pStatus
	 * The status to set.
	 */
	public void setStatus(String pStatus) {
		this.status = pStatus;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", name=" + name + ", profile="
				+ profile + ", lastLoginDate=" + lastLoginDate + ", status="
				+ status + "]";
	}	
}
