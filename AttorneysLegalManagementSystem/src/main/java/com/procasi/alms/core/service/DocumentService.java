package com.procasi.alms.core.service;

import java.util.List;

import com.procasi.alms.core.bean.Document;

/**
 * The Document services.
 * 
 * @author EdgarOlvera
 */
public interface DocumentService {

	/**
	 * Gets an Document object.
	 * 
	 * @param documentId
	 * 			The document identifier.
	 * @return a Document.
	 */
	Document getDocument();
	
	/**
	 * Gets all existing documents.
	 * 
	 * @return the documents list.
	 */
	List<Document> getAllDocuments();
}
