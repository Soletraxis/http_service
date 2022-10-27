package com.example.http_service.db;

import com.example.http_service.domain.DomainItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DomainItemRepository extends JpaRepository<DomainItem, Integer> {
}
