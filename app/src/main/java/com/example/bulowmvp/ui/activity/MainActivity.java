package com.example.bulowmvp.ui.activity;

import android.widget.ListView;
import android.widget.Toast;

import com.example.bulowmvp.R;
import com.example.bulowmvp.base.BaseActivity;
import com.example.bulowmvp.presenter.contrant.Contrant;
import com.example.bulowmvp.presenter.contrant.PresenterImp;


public class MainActivity extends BaseActivity implements Contrant.ViewInf {

    Contrant.PresenterInf presenterInf;

    @Override
    protected void initData() {
        presenterInf = new PresenterImp(this);
        presenterInf.getData(new String[]{});
    }
    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }
    @Override
    public void updateUI(String string) {
        ListView listView = new ListView(this);
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
    }
}
