package pe.gameplans.tag.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class Tag {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long tid;
	
	private char deleteYn;
	
	private String name;
	
	@Builder
	public Tag(String name, char deleteYn) {
		this.name = name;
		this.deleteYn = deleteYn;
	}
	
	// 게시글 삭제
	public void delete() {
		this.deleteYn = 'Y';
	}
}
