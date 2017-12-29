package com.example.bulowmvp.untils;



import com.example.bulowmvp.model.ModelInf;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Created by mwt on 2017/12/27.
 */

public class HttpUntils {

    private static final HttpUntils ourInstance = new HttpUntils();

    public static HttpUntils getInstance() {
        return ourInstance;
    }

    private HttpUntils() {
    }

    public static void getDataByRe(final ModelInf.CallBackLister callBackLister){
        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://mapi.univs.cn/").build();
        ApiServier apiServier = retrofit.create(ApiServier.class);
        Call<ResponseBody> data = apiServier.getData();
        data.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    callBackLister.sendMessage(response.body().string());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {

            }
        });
    }
}
