package com.example.bulowmvp.presenter.contrant;


import com.example.bulowmvp.base.BasePresenter;
import com.example.bulowmvp.base.BaseView;

/**
 * Created by mwt on 2017/12/27.
 *
 * P V 接口
 *
 */

public interface Contrant {

    public interface PresenterInf extends BasePresenter {
        public void getData(String[] strings);
    }
    public interface ViewInf extends BaseView {
        public void updateUI(String string);
    }

}
