package com.tourism.common;

import com.show.api.ShowApiRequest;

public class ApiData {

    public String getApiData(String keyword){
        String res = new ShowApiRequest("http://route.showapi.com/268-1","117090","b84170b632b445dc862cbef277f27ec5")
                .addTextPara("keyword",keyword)
                .addTextPara("proId","")
                .addTextPara("cityId","")
                .addTextPara("areaId","")
                .addTextPara("page","")
                .post();

        return res;
    }

}
