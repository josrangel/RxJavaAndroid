package com.josrangel.rxjavaandroid;

import androidx.annotation.NonNull;

import com.josrangel.rxjavaandroid.interfaces.MainInteractor;
import com.josrangel.rxjavaandroid.interfaces.MainPresenter;
import com.josrangel.rxjavaandroid.interfaces.MainView;

import java.util.ArrayList;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class MainPresenterImpl implements MainPresenter {

    private MainInteractor interactor;
    private MainView view;

    public MainPresenterImpl(MainView mainView){
        view = mainView;
        interactor = new MainInteractorImpl();
    }

    public void getListAnimals() {
        Observable.just(interactor.getAnimals())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new Observer<ArrayList>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull ArrayList arrayList) {
                        view.showData(arrayList.toString());
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        //error handling made simple
                    }

                    @Override
                    public void onComplete() {
                        //cleaning up tasks
                    }
                });
    }
}
