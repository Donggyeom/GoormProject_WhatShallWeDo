package pe.gameplans.tag.model;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import pe.gameplans.tag.dto.TagRequestDto;
import pe.gameplans.tag.dto.TagResponseDto;
import pe.gameplans.tag.entity.Tag;
import pe.gameplans.tag.entity.TagRepository;

@Service
@RequiredArgsConstructor
public class TagService {
	
	private final TagRepository tagRepository;
	
	// 추가
	@Transactional
	public Long save(final TagRequestDto params) {
		Tag entity = tagRepository.save(params.toEntity());
		return entity.getTid();
	}
	
	// 전체 조회
	public List<TagResponseDto> findAll() {
		Sort sort = Sort.by(Direction.ASC, "tid", "name");
		List<Tag> list = tagRepository.findAll(sort);
		return list.stream().map(TagResponseDto::new).collect(Collectors.toList());
	}
	
	public List<TagResponseDto> findAllByDeleteYn(final char deleteYn) {
		Sort sort = Sort.by(Direction.ASC, "tid", "name");
		List<Tag> list = tagRepository.findAllByDeleteYn(deleteYn, sort);
		return list.stream().map(TagResponseDto::new).collect(Collectors.toList());
	}
	
	// 삭제
	@Transactional
	public Long delete(final Long tid) {
		
		Tag entity = tagRepository.findById(tid).orElseThrow( () -> new RuntimeException("대상을 찾을 수 없습니다.") );
		entity.delete();
		return tid;
	}
}	
