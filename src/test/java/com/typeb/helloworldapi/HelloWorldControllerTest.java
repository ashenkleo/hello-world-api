package com.typeb.helloworldapi;

import com.typeb.helloworldapi.controller.HelloWorldController;
import com.typeb.helloworldapi.service.HelloWorldService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.mockito.Mockito.when;

@WebMvcTest(HelloWorldController.class)
public class HelloWorldControllerTest   {
    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private HelloWorldService service;

    @Test
    void isValidName_whenTheNameisValid_shouldReturn200() throws Exception {
        when(service.isValidName("alice")).thenReturn(true);
        when(service.formatName("alice")).thenReturn("Alice");

        mockMvc.perform(get("/hello-world?name=alice"))
                .andExpect(status().isOk());
    }
}
