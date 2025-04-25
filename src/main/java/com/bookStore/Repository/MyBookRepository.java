package com.bookStore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookStore.Entity.MyBookList;

@Repository
public interface MyBookRepository extends JpaRepository<MyBookList,Integer> {

}
