package com.example.bulowmvp.model.htt;


import com.example.bulowmvp.model.ModelInf;
import com.example.bulowmvp.untils.HttpUntils;

/**
 * Created by mwt on 2017/12/27.
 */

public class Model implements ModelInf {
    @Override
    public void getDataFromWhere(String[] strings, CallBackLister callBackLister) {
        HttpUntils.getDataByRe(callBackLister);
    }
}
