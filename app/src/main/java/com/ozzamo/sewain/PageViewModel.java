package com.ozzamo.sewain;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PageViewModel extends ViewModel {

    private MutableLiveData<String> mName = new MutableLiveData<>();

    public void setName(String name){
        mName.setValue(name);
    }

    public LiveData<String> getName(){
        return mName;
    }


    private MutableLiveData<String> mNotelp = new MutableLiveData<>();

    public void setNotelp(String notelp){
        mNotelp.setValue(notelp);
    }

    public LiveData<String> getNotelp(){
        return mNotelp;
    }


    private MutableLiveData<String> mAlamat = new MutableLiveData<>();

    public void setAlamat(String alamat){
        mAlamat.setValue(alamat);
    }

    public LiveData<String> getAlamat(){
        return mAlamat;
    }

    private MutableLiveData<String> mRent = new MutableLiveData<>();

    public void setRent(String rent){
        mRent.setValue(rent);
    }

    public LiveData<String> getRent(){
        return mRent;
    }
}
