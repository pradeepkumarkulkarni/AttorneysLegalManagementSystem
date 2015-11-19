package com.procasi.alms.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.procasi.alms.core.bean.Document;
import com.procasi.alms.core.bean.User;
import com.procasi.alms.core.service.DocumentService;

/**
 * The Document controller.
 * 
 * @author EdgarOlvera
 */
@Controller
@RequestMapping(value="document")
public class DocumentController {
	
	@Autowired
	DocumentService documentService;
	
	/**
	 * Handle the getDocument request.
	 * 
	 * @param idDocument
	 * 			The document's identifier.
	 * @return a Document object.
	 */
	@RequestMapping(value="/getDocument", method=RequestMethod.GET)
	@ResponseBody
	public Document getUser(@RequestBody User user) {
		System.out.println("get Document controller service");
		return this.documentService.getDocument();
	}
	
	/**
	 * Handle the all documents request.
	 * 
	 * @return All the documents into a list.
	 */
	@RequestMapping(value="/getAllDocuments", method=RequestMethod.GET)
	@ResponseBody
	public List<Document> getAllDocuments() {
		System.out.println("get all Documents controller service");
		return this.documentService.getAllDocuments();
	}
}
