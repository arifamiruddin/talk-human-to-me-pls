package com.talkhumantome.talk_human_api.repository;

import com.talkhumantome.talk_human_api.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
