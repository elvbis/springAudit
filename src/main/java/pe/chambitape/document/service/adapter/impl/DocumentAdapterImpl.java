package pe.chambitape.document.service.adapter.impl;

import org.springframework.stereotype.Component;
import pe.chambitape.document.domain.DocumentOut;
import pe.chambitape.document.domain.DocumentPostRequest;
import pe.chambitape.document.repository.entity.DocumentEntity;
import pe.chambitape.document.service.adapter.DocumentAdapter;

import java.util.ArrayList;
import java.util.List;

@Component
public class DocumentAdapterImpl implements DocumentAdapter {
    @Override
    public List<DocumentOut> toListDocumentOut(List<DocumentEntity>  list) {

        List<DocumentOut> listReturn = new ArrayList<>();
        for(DocumentEntity en : list){
            DocumentOut out = new DocumentOut();
            out.setId(en.getTipoDocumento());
            out.setDescription(en.getDescripcion());
            listReturn.add(out);
        }
        return listReturn;
    }

    @Override
    public DocumentEntity toEntityDocument(DocumentPostRequest documentInt) {
        DocumentEntity entity = new DocumentEntity();
        entity.setDescripcion(documentInt.getDescription());
        return entity;
    }
}
