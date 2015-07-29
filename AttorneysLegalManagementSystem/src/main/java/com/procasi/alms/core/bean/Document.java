package com.procasi.alms.core.bean;

/**
 * The document POJO that contains the information related to a doc.
 * 
 * @author EdgarOlvera
 */
public class Document {
	
	/**
	 * The document identifier.
	 */
	private String documentId;
	
	/**
	 * The document string bytes.
	 */
	private String documentString;

	/**
	 * Gets the documentId.
	 *
	 * @return the documentId value.
	 */
	public String getDocumentId() {
		return this.documentId;
	}

	/**
	 * @param pDocumentId
	 * The documentId to set.
	 */
	public void setDocumentId(String pDocumentId) {
		this.documentId = pDocumentId;
	}

	/**
	 * Gets the documentString.
	 *
	 * @return the documentString value.
	 */
	public String getDocumentString() {
		return this.documentString;
	}

	/**
	 * @param pDocumentString
	 * The documentString to set.
	 */
	public void setDocumentString(String pDocumentString) {
		this.documentString = pDocumentString;
	}

	
	
}
