package com.task.MakerSharks.Repository;

import com.task.MakerSharks.Entity.SupplierEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Repo extends JpaRepository<SupplierEntity, Long> {
    List<SupplierEntity> findByLocationAndNatureOfBusinessAndManufacturingProcesses(
            String location,
            String natureOfBusiness,
            String manufacturingProcesses
    );
}
