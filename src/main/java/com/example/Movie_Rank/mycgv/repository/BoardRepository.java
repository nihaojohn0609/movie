package com.example.Movie_Rank.mycgv.repository;

import com.example.Movie_Rank.mycgv.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
}
