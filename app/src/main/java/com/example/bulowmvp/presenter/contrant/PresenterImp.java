package com.example.bulowmvp.presenter.contrant;


import com.example.bulowmvp.model.ModelInf;
import com.example.bulowmvp.model.htt.Model;

/**
 * Created by mwt on 2017/12/27.
 */

public class PresenterImp implements Contrant.PresenterInf {

    private ModelInf modelInf;
    private Contrant.ViewInf viewInf;

    public PresenterImp(Contrant.ViewInf viewInf) {
        this.modelInf = new Model();
        this.viewInf = viewInf;
    }

    @Override
    public void getData(String[] strings) {
        modelInf.getDataFromWhere(strings,new ModelInf.CallBackLister(){
            @Override
            public void sendMessage(String message) {
                viewInf.updateUI(message);
            }
        });
    }
}
