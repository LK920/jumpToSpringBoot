package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.example.sbb.answer.Answer;
import com.example.sbb.question.Question;
import com.example.sbb.question.QuestionRepository;

@SpringBootTest
class SbbApplicationTests {
	
	@Autowired
	private QuestionRepository questionRepository;
	
	@Transactional
	@Test
	void testJpa() {

/*
  	Transactional 어노테이션이 없을 시 
  	테스트 코드에선 DB세션 연결이 lazy 방식이라서 q.getAnswerList()부분에서 에러 발생
  	findById로 db 연결 후 종료 -> q.getAnswerList()에선 연결 종료 된 상태라서 다시 불러오지 못함
  	
 */		
		Optional<Question> oq = this.questionRepository.findById(1);
		assertTrue(oq.isPresent());
		Question q = oq.get();
		
		List<Answer> answerList = q.getAnswerList();
		
		assertEquals(1, answerList.size());
        assertEquals("네 자동으로 생성됩니다.", answerList.get(0).getContent());
	}

}
