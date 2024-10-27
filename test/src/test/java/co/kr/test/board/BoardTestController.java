package co.kr.test.board;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc //mock?로 보내는 mvc
public class BoardTestController {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("모든데이터 조회")
    public void testGetBoards() throws Exception {
        mockMvc.perform(get("/api/board"))
                .andExpect(status().is4xxClientError());
//                .andExpect(jsonPath("$.length()").value(0));
    }
}
//insert
