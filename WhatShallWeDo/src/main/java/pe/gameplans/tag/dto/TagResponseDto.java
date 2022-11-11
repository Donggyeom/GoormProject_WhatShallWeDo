package pe.gameplans.tag.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import pe.gameplans.tag.entity.Tag;

@Getter
@NoArgsConstructor
public class TagResponseDto {
	private long tid;
	private String name;
	
	public TagResponseDto(Tag entity) {
		this.tid = entity.getTid();
		this.name = entity.getName();
	}
}	
