package com.task.MakerSharks.Controller;

import com.task.MakerSharks.DTO.DtoSupplier;
import com.task.MakerSharks.Entity.SupplierEntity;
import com.task.MakerSharks.Service.MakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/supplier")
public class Controller {
    @Autowired
    private MakerService service;

    @PostMapping("/query")
    public List<SupplierEntity> querySuppliers( @RequestBody DtoSupplier query) {
        List<SupplierEntity> suppliers = service.searchQuery(query.getLocation(), query.getNatureOfBusiness(), query.getManufacturingProcesses());
        return suppliers;
    }

}
