package com.example.graphql.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.graphql.model.Notice;


@Repository
public interface NoticeRepository extends JpaRepository<Notice, Long> {
}
