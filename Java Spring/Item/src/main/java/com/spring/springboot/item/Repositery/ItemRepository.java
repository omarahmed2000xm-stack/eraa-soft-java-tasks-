package com.spring.springboot.item.Repositery;

import com.spring.springboot.item.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
