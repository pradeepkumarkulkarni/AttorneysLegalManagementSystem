package mock.servicemock;

import java.util.ArrayList;
import java.util.List;

import com.procasi.alms.core.bean.Document;

/**
 * The Document service mock for test purposes.
 * 
 * @author EdgarOlvera
 */
public class DocumentServiceMockImplementation {

	public Document getDocument() {
		System.out.println("Get Document service mock implementation.");
		Document doc = new Document();
		doc.setDocumentId("DOCUMENT FAKE");
		doc.setDocumentString("xj23jo23mldpfjju23skofj98frgyd6dju7d9d000dhuhdevhbnswbdhedbhewf65656565655");
		return doc;
	}

	public List<Document> getAllDocuments() {
		System.out.println("Get All Documents service mock implementation.");
		List<Document> documentsList = null;
		for(int i = 1;i < 9;i++) {
			documentsList = new ArrayList<Document>();
	 		Document doc = new Document();
			doc.setDocumentId("DOCUMENT " + i);
			doc.setDocumentString(i + " xj23jo23mldpfjju23skofj98frgyd6dju7d9d000dhuhdevhbnswbdhedbhewfweblabla9292");
			documentsList.add(doc);
		}
		return documentsList;
	}
}
