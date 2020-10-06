package com.kgc.service;

import com.kgc.pojo.Bills;
import com.kgc.pojo.Btype;

import java.util.Date;
import java.util.List;

public interface BillsService {
List<Bills> getlist(Integer typeid, Date btime);
List<Btype> getlistbt();
int add(Bills bills);
}

