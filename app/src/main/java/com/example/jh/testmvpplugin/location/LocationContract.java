package com.example.jh.testmvpplugin.location;

import android.content.Context;

import com.example.jh.testmvpplugin.mvp.BasePresenter;
import com.example.jh.testmvpplugin.mvp.BaseView;

/**
 * MVPPlugin
 *  邮箱 784787081@qq.com
 */

public class LocationContract {
    interface View extends BaseView {
        
    }

    interface  Presenter extends BasePresenter<View> {
        
    }
}
