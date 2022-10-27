package com.example.http_service.web;

import com.example.http_service.application.port.DomainUseCase;
import com.example.http_service.application.port.DomainUseCase.AddDomainItemCommand;
import com.example.http_service.domain.DomainItem;
import com.example.http_service.domain.DomainItemAssociations;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/domain_items")
public class DomainItemController {
    private final DomainUseCase domainUseCase;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    private DomainItem saveDomainItem(@RequestBody CreateDomainItemCommand createDomainItemCommand) {
        AddDomainItemCommand addDomainItemCommand = AddDomainItemCommand.builder().items(createDomainItemCommand.getItems()).build();
        return domainUseCase.addDomainItem(addDomainItemCommand);
    }


    @Data
    static class CreateDomainItemCommand {
        List<DomainItemAssociations> items;
    }
}
