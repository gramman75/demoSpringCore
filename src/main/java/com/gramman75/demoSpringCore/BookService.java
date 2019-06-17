package com.gramman75.demoSpringCore;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	
	// BookRepository가 inteface이기 때문에 해당 Interface를 구현한 어떤 class를 주입해야 할지 알 수 없음.
	// 주입시 Type뿐만 아니라 이름도 보기 때문에 아래와 같이 주입을 하면 KimRepository가 주입이 됨.
	@Autowired
	BookRepository kimRepository;
	
	
	@PostConstruct
	public void setup() {
		System.out.println(kimRepository.getClass());
	}
	

}
