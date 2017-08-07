package common;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Hashtable;
import java.util.Map;

/**
 * Created by Administrator on 2017/5/3.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public abstract class AbstractControllerTest {

    @Autowired
    public MockMvc mockMvc;

    protected MockHttpServletRequest request;

    protected MockHttpServletResponse response;

    protected MockHttpSession httpSession;

    protected Map<Object, Object> session;

    @Before
    public void setUp() throws Exception {
        session = new Hashtable<Object, Object>();
        request = new MockHttpServletRequest();
        response = new MockHttpServletResponse();
        httpSession = new MockHttpSession();
        request.setSession(httpSession);
        request.setCookies();
    }

    @After
    public void tearDown() throws Exception {
    }


}
