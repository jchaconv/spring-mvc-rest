package expert.springframework.springmvcrest.repositories;

import expert.springframework.springmvcrest.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findByName(String name);

}
