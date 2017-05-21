package net.topflow.service;

import net.topflow.dao.inter.TmCaseMapper;
import net.topflow.dao.model.TmCase;
import net.topflow.dao.model.TmCaseExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2017/5/21.
 */
@Component
public class MyService {

    @Autowired
    private TmCaseMapper tmCaseMapper;

    public List<TmCase> queryAllCases(){
        return tmCaseMapper.selectByExample(new TmCaseExample());
    }
}
