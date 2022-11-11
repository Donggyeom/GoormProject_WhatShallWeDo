package pe.gameplans.tag;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.gameplans.tag.entity.Tag;
import pe.gameplans.tag.entity.TagRepository;

@SpringBootTest
public class TagTests {
	
	@Autowired
	TagRepository tagRepository;
	
	@Test
	void save() {
		
		Tag params = Tag.builder()
				.name("tag test")
				.build();
		
		tagRepository.save(params);
		
		Tag entity = tagRepository.findById((long) 1).get();
		assertThat(entity.getName()).isEqualTo("tag test");
	}
	
	@Test
	void findAll() {
		List<Tag> list = tagRepository.findAll();
	}

}
