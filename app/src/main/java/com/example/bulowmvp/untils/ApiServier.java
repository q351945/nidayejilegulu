package com.example.bulowmvp.untils;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by mwt on 2017/12/27.
 */

public interface ApiServier {
    @GET("mobile/index.php?app=mobile&type=mobile&controller=content&action=index&page=0&time=0&catid=11&page=0")
    public Call<ResponseBody> getData();

}
