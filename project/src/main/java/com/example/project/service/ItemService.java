package com.example.project.service;

import com.example.project.entity.Item;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ItemService {
    public void registerItem(Item item) throws Exception;

    public List<Item> list() throws Exception;

    public Item read(Integer itemNo) throws Exception;

    public void remove(Integer itemNo) throws Exception;
}