package com.example.nadat.mvp;

public interface IContract {
    interface IPresenter {
        void checkTrueOrFalse();
    }

    interface IView {
        void showToastTrue();

        void showToastFalse();
    }
}
