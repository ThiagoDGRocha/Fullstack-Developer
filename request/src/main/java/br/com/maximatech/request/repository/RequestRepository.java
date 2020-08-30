package br.com.maximatech.request.repository;

import br.com.maximatech.request.model.RequestModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestRepository extends JpaRepository<RequestModel, Long> {

    Page<RequestModel> findAll(Pageable pageable);
}
