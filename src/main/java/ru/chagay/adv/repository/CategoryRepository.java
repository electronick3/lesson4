package ru.chagay.adv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.chagay.adv.models.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}