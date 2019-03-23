package com.example.nadat.mvp;

public class MainPresenter implements IContract.IPresenter {
    private IContract.IView mIView;
    private MainModel mMainModel;

    public MainPresenter(IContract.IView iView) {
        mIView = iView;
        mMainModel = new MainModel();
    }

    @Override
    public void showToast() {
        if (mMainModel.isTrue()) {
            mIView.onTrue();
        } else {
            mIView.onFalse();
        }
    }
}
