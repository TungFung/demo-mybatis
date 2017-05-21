import net.topflow.dao.inter.TmCaseMapper;
import net.topflow.dao.model.TmCase;
import net.topflow.dao.model.TmCaseExample;
import net.topflow.service.MyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:applicationContext.xml")
public class MyServiceTest {

    @Autowired
    private MyService myService;

    @Autowired
    private TmCaseMapper tmCaseMapper;

    @Test
    public void test(){
        List<TmCase> tmCaseList = myService.queryAllCases();
        System.out.println(tmCaseList.size());
    }

    @Test
    public void test2(){
        List<TmCase> tmCaseList = tmCaseMapper.selectByExample(new TmCaseExample());
        System.out.println(tmCaseList.size());
    }

}
