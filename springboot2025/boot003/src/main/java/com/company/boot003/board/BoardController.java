package com.company.boot003.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class BoardController {
	
	// ver-1 @Autowired BoardService service;
	private final BoardService service;
	
	@GetMapping("/board/list")
	public String list(Model model){
		model.addAttribute("list", service.findAll()); //##전체리스트뽑고
		return "board/list";  // board 폴더안에 / list파일
	} // http://localhost:8080/board/list
	
	@GetMapping("/board/detail/{id}")
	public String detail(@PathVariable Long id, Model model){
		model.addAttribute("dto", service.find(id)); // ##조회수올리고 / 상세보기기능
		return "board/detail";  // board 폴더안에 / list파일
	} // http://localhost:8080/board/detail/1 (있는번호)
	
	
	@GetMapping("/board/insert")
	public String insert_get(){ return "board/write"; } 
	// http://localhost:8080/board/insert  (글쓰기 폼)
	
	@PostMapping("/board/insert")
	public String insert_post(Board board , @RequestParam Long member_id){
		System.out.println("...." + board);
		System.out.println("...." + member_id);
		service.insert(board, member_id);  //## 글쓰기기능 
		return "redirect:/board/list";
	} // form 테스트  (글쓰기 기능 - 갱신된리스트)
	
	
	@GetMapping("/board/update/{id}")
	public String update_get(@PathVariable Long id, Model model){
		model.addAttribute("dto", service.update_view(id));  //## 수정할글 가져오기
		return "board/edit";
	} // http://localhost:8080/board/update/1  (글수정 폼)
	
	@PostMapping("/board/update")
	public String update_post(Board baord){
		service.update(baord);  //## 글수정 기능 
		return "redirect:/board/list";
	} // form 테스트  (글수정 기능 - 갱신된리스트)
	
	
	@GetMapping("/board/delete")
	public String delete_get(){ return "board/delete"; }
	// http://localhost:8080/board/delete (글삭제 폼)
	
	@PostMapping("/board/delete")
	public String delete_post(Board baord){
		service.delete(baord);  //## 글삭제 기능 
		return "redirect:/board/list";
	} // form 테스트  (글삭제 기능 - 갱신된리스트)
	
}
/* Restful Api
 기존게시판     : localhost:8080/board/list/detail?bno=10 쿼리스트링
 Restful Api : localhost:8080/board/list/detail/bno/10 쿼리스트링
	1) resultful - http url 기반으로 자원에 접근해서 서비스를 제공하는 애플리케이션
	2) api
	3) method ( GET : 검색 / POST : 생성 / PATCH(부분업데이트), PUT(전체업데이트) / DELETE : 삭제 )
	4) DATA - json, xml
*/