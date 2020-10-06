package com.kgc.service.impl;

import com.kgc.mapper.BillsMapper;
import com.kgc.mapper.BtypeMapper;
import com.kgc.pojo.Bills;
import com.kgc.pojo.BillsExample;
import com.kgc.pojo.Btype;
import com.kgc.service.BillsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
@Service("billsService")
public class BillsServiceImpl implements BillsService{
    @Resource
    BillsMapper billsMapper;
    @Resource
    BtypeMapper btypeMapper;
    @Override
    public List<Bills> getlist(Integer typeid, Date btime) {
        BillsExample example=new BillsExample();
        BillsExample.Criteria criteria=example.createCriteria();
        if(typeid!=null&&btime!=null){
            criteria.andTypeidEqualTo(typeid);
            criteria.andBtimeEqualTo(btime);
        }
        List<Bills> list=billsMapper.selectByExample(example);
        return list;
    }

    @Override
    public List<Btype> getlistbt() {
        List<Btype> btypeList=btypeMapper.selectByExample(null);
        return btypeList;
    }

    @Override
    public int add(Bills bills) {
        int i=billsMapper.insertSelective(bills);
        return i;
    }
}
