package pe.gameplans.tag.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import pe.gameplans.tag.entity.Tag;

@Getter
@NoArgsConstructor
public class TagRequestDto {
	private String name;
	
	public Tag toEntity() {
		return Tag.builder()
				.name(name)
				.deleteYn('N')
				.build();
	}
}	
