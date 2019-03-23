package com.example.nadat.mvp;

public interface IContract {
    interface IPresenter {
        void showToast();
    }

    interface IView {
        void onTrue();

        void onFalse();
    }
}
