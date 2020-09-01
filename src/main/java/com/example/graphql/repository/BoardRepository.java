package com.example.graphql.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.graphql.model.Board;


@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {
}
