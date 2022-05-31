package com.example.demo.api;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@WebMvcTest(DemoApiController.class)
@Import(DemoApiDelegateImpl.class)
class DemoApiControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void helloWorld_shouldReturnHelloWorld_Always() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders
                        .get("/v1/hello-world")
                        .accept(MediaType.APPLICATION_JSON)
                        .header("accessKey", "ABC"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.message").value("Hello World"));
    }
}
