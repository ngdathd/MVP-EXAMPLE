package com.example.nadat.mvp;

public class MainPresenter implements IContract.IPresenter {
    private IContract.IView mIView;
    private IContract.IModel mMainModel;

    public MainPresenter(IContract.IView iView) {
        mIView = iView;
        mMainModel = new MainModel();
    }

    @Override
    public void checkTrueOrFalse() {
        if (mMainModel.isTrue()) {
            mIView.showToastTrue();
        } else {
            mIView.showToastFalse();
        }
    }
}
