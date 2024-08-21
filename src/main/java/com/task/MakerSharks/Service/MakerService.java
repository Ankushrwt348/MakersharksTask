package com.task.MakerSharks.Service;

import com.task.MakerSharks.Entity.SupplierEntity;
import com.task.MakerSharks.Repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
public class MakerService {
    @Autowired
    private Repo repo;

    public List<SupplierEntity> searchQuery(String location, String natureOfBusiness, String manufacturingProcesses) {
        return repo.findByLocationAndNatureOfBusinessAndManufacturingProcesses(location, natureOfBusiness, manufacturingProcesses);
    }
}
