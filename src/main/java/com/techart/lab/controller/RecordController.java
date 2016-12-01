package com.techart.lab.controller;

import com.techart.lab.dto.RecordDTO;
import com.techart.lab.service.record.IRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by alexander on 11/21/16.
 */
@RestController
@RequestMapping("/record")
public class RecordController {

    @Autowired
    private IRecordService recordService;

    @RequestMapping(method = RequestMethod.GET)
    public List<RecordDTO> getAll() {
        return recordService.get();
    }
}
