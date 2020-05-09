package com.yiran.blog.service;

import com.yiran.blog.po.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TypeService {

    Type saveType(Type type);

    Type getType(Long id);

    Type getTypeByName(String name);

    Page<Type> ListType(Pageable pageable);

    Type updateType(Long id, Type type);

    void deleteType(Long id);
}
