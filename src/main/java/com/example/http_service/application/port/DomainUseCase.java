package com.example.http_service.application.port;

import com.example.http_service.domain.DomainItem;
import com.example.http_service.domain.DomainItemAssociations;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.Value;

import java.util.List;

public interface DomainUseCase {
    DomainItem addDomainItem(AddDomainItemCommand addDomainItemCommand);

    @Builder
    @Value
    @Data
    @AllArgsConstructor
    class AddDomainItemCommand {
        @Singular
        List<DomainItemAssociations> items;
    }
}
