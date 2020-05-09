package com.yiran.blog.service;

import com.yiran.blog.NotFoundException;
import com.yiran.blog.dao.TypeReponsitory;
import com.yiran.blog.po.Type;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TypeServiceImpl implements TypeService {

    @Autowired
    private TypeReponsitory typeReponsitory;

    @Transactional
    @Override
    public Type saveType(Type type) {
        return typeReponsitory.save(type);
    }

    @Transactional
    @Override
    public Type getType(Long id) {
        Type t =  typeReponsitory.findById(id).orElseThrow(() -> new NotFoundException());
        return t;
    }

    @Transactional
    @Override
    public Page<Type> ListType(Pageable pageable) {
        return typeReponsitory.findAll(pageable);
    }

    @Transactional
    @Override
    public Type updateType(Long id, Type type) {
        Type t = typeReponsitory.findById(id).orElseThrow(() -> new NotFoundException("entity not found"));
        BeanUtils.copyProperties(type, t);
        return typeReponsitory.save(t);
    }

    @Override
    public void deleteType(Long id) {
        typeReponsitory.deleteById(id);
    }

    @Override
    public Type getTypeByName(String name) {
        return typeReponsitory.findByName(name);
    }
}
