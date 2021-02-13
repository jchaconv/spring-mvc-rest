package expert.springframework.springmvcrest.services;

import expert.springframework.springmvcrest.model.CategoryDTO;

import java.util.List;

public interface CategoryService {

    List<CategoryDTO> getAllCategories();

    CategoryDTO getCategoryByName(String name);

}
