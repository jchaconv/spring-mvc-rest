package expert.springframework.springmvcrest.mapper;

import expert.springframework.springmvcrest.domain.Category;
import expert.springframework.springmvcrest.model.CategoryDTO;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-02-13T10:33:36-0500",
    comments = "version: 1.2.0.CR2, compiler: javac, environment: Java 1.8.0_121 (Oracle Corporation)"
)
@Component
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public CategoryDTO categoryToCategoryDTO(Category category) {
        if ( category == null ) {
            return null;
        }

        CategoryDTO categoryDTO = new CategoryDTO();

        categoryDTO.setId( category.getId() );
        categoryDTO.setName( category.getName() );

        return categoryDTO;
    }
}
