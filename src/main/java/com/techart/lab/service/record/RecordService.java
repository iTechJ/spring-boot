package com.techart.lab.service.record;

import com.techart.lab.dto.RecordDTO;
import com.techart.lab.entity.Record;
import com.techart.lab.repository.RecordRepository;
import com.techart.lab.service.record.IRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexander on 11/21/16.
 */
@Service
public class RecordService implements IRecordService {

    @Autowired
    private RecordRepository recordRepository;

    public List<RecordDTO> get() {
        List<Record> records = recordRepository.findAll();
        List<RecordDTO> recordDTOs = new ArrayList<>();
        records.stream().forEach(r -> recordDTOs.add(new RecordDTO(r.getId(), r.getText())));
        return recordDTOs;
    }
}
