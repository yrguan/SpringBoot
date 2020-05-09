package com.yiran.blog.dao;

import com.yiran.blog.po.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface TypeReponsitory extends JpaRepository<Type, Long> {

    Type findByName(String name);

}
