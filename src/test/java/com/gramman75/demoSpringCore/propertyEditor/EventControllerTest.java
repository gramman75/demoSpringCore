package com.gramman75.demoSpringCore.propertyEditor;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

@RunWith(SpringRunner.class)
@WebMvcTest
public class EventControllerTest {
	
	/**
	 * Controller에서 사용할 DataBinding을 등록함.
	 * @param webDataBinder
	 */
//@InitBinder
//	public void init(WebDataBinder webDataBinder) {
//		webDataBinder.registerCustomEditor(Event.class, new EventEditor());
//	}
//	
	@Autowired 
	MockMvc mockMvc;
	
	@Test
	public void getTest() throws Exception {
		mockMvc.perform(get("/event/1"))
		    .andExpect(status().isOk())
		    .andExpect(content().string("1"));
		
	}

}
