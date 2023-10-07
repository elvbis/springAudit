package pe.chambitape.document.service;

import pe.chambitape.document.domain.DocumentOut;
import pe.chambitape.document.domain.DocumentPostRequest;

import java.util.List;

public interface DocumentService {
	List<DocumentOut> getAllDocuments();
	void validateDocumentNumber(String type, String document) throws Exception;

    void saveNewDocument(DocumentPostRequest documentInt) throws Exception;
}
