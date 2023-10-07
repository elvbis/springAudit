package pe.chambitape.document.service.adapter;

import pe.chambitape.document.domain.DocumentOut;
import pe.chambitape.document.domain.DocumentPostRequest;
import pe.chambitape.document.repository.entity.DocumentEntity;

import java.util.List;

public interface DocumentAdapter {

    List<DocumentOut> toListDocumentOut (List<DocumentEntity>  documentEntity);

    DocumentEntity toEntityDocument(DocumentPostRequest documentInt);
}
