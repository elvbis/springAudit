package pe.chambitape.document.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.chambitape.document.repository.entity.DocumentEntity;

public interface DocumentRepository extends JpaRepository<DocumentEntity, String>{

}
