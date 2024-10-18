package org.example.books.repositories;

import org.example.books.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriesRepository extends JpaRepository<Category, Long> {

    Category findCategoryByName(String name);
}
