package com.example.http_service.application;

import com.example.http_service.application.port.DomainUseCase;
import com.example.http_service.db.DomainItemRepository;
import com.example.http_service.domain.DomainItem;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DomainService implements DomainUseCase {
    private final DomainItemRepository domainItemRepository;

    @Override
    public DomainItem addDomainItem(AddDomainItemCommand addDomainItemCommand) {
        DomainItem domainItem = DomainItem.builder()
                .items(addDomainItemCommand.getItems())
                .build();
        return domainItemRepository.save(domainItem);
    }
}
