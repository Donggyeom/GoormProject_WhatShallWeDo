package pe.gameplans.tag.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import pe.gameplans.tag.dto.TagRequestDto;
import pe.gameplans.tag.dto.TagResponseDto;
import pe.gameplans.tag.model.TagService;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class TagApiController {
	
	private final TagService tagService;
	
	@PostMapping("/tags")
	public Long save(@RequestBody final TagRequestDto params) {
		return tagService.save(params);
	}

	@GetMapping("/tags")
	public List<TagResponseDto> findAll() {
		return tagService.findAllByDeleteYn('N');
	}
	
	@DeleteMapping("/tags/{tid}")
	public Long delete(@PathVariable final Long tid) {
		return tagService.delete(tid);
	}
}
