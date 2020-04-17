package com.dialog.demo;

import android.app.FragmentManager;

import com.loading.dialog.AndroidLoadingDialog;

/**
 * Author: Jett
 * Date: 2020-04-17 15:17
 * Email: hydznsq@163.com
 * Des:
 */
public class GlobalDialogManager {

    private AndroidLoadingDialog mLoadingDialog;
    private boolean mIsShow;//是否显示

    private GlobalDialogManager() {
        init();
    }

    public static GlobalDialogManager getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static GlobalDialogManager INSTANCE = new GlobalDialogManager();
    }

    public void init() {
        if (mLoadingDialog == null) {
            mLoadingDialog = new AndroidLoadingDialog();
        }
    }

    /**
     * 展示加载框
     */
    public synchronized void show(FragmentManager manager) {
        if (manager != null && mLoadingDialog != null && !mIsShow) {
            mLoadingDialog.showAllowingStateLoss(manager, "loadingDialog");
            mIsShow = true;
        }
    }

    /**
     * 隐藏加载框
     */
    public synchronized void dismiss() {
        if (mLoadingDialog != null && mIsShow) {
            mLoadingDialog.dismissAllowingStateLoss();
            mIsShow = false;
        }

    }
}
