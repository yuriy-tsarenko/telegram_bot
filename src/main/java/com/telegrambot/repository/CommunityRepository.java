package com.telegrambot.repository;

import com.telegrambot.entity.CommunityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommunityRepository extends JpaRepository<CommunityEntity,Long> {

}
