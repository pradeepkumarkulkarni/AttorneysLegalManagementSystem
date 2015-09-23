package mock.servicemock;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.procasi.alms.core.bean.Document;
import com.procasi.alms.core.service.DocumentService;

/**
 * The Document service mock for test purposes.
 * 
 * @author EdgarOlvera
 */
@Service
public class DocumentServiceMockImplementation implements DocumentService {

	@Override
	public Document getDocument() {
		System.out.println("Get Document service mock implementation.");
		Document doc = new Document();
		doc.setDocumentId("DOCUMENT FAKE");
		doc.setDocumentString("xj23jo23mldpfjju23skofj98frgyd6dju7d9d000dhuhdevhbnswbdhedbhewf65656565655");
		return doc;
	}

	@Override
	public List<Document> getAllDocuments() {
		System.out.println("Get All Documents service mock implementation.");
		List<Document> documentsList = new ArrayList<Document>();
 		Document doc = new Document();
		doc.setDocumentId("DOCUMENT 1");
		doc.setDocumentString("xj23jo23mldpfjju23skofj98frgyd6dju7d9d000dhuhdevhbnswbdhedbhewfweblabla9292");
		documentsList.add(doc);
		
		doc = new Document();
		doc.setDocumentId("DOCUMENT 2");
		doc.setDocumentString("mmmnsn3mldpfjju23skofj98frgyd6dju7d9d000dhuhdevhbnswbdhedbhewfweblabla88888");
		documentsList.add(doc);
		
		doc = new Document();
		doc.setDocumentId("DOCUMENT 3");
		doc.setDocumentString("eerkmkkdpfjju23skofj98frgyd6dju7d9d000dhuhdevhbnswbdhedbhewfweblabla7272727");
		documentsList.add(doc);
		
		doc = new Document();
		doc.setDocumentId("DOCUMENT 4");
		doc.setDocumentString("uyeoeoeolsoedcdscdju7d9d000dhuhdevhbnswbdhesededcwjdbhewfweblabla0000011111");
		documentsList.add(doc);
		return documentsList;
	}
}
