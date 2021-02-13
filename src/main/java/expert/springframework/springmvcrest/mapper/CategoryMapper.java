package expert.springframework.springmvcrest.mapper;

import expert.springframework.springmvcrest.domain.Category;
import expert.springframework.springmvcrest.model.CategoryDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    CategoryDTO categoryToCategoryDTO(Category category);

}
