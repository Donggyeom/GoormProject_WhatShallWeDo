package pe.gameplans.domain;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class SampleVo {
	
	@NonNull
	private String id;
	
	private String name;

}
