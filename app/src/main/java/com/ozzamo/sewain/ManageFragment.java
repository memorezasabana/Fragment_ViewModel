package com.ozzamo.sewain;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.textfield.TextInputEditText;


public class ManageFragment extends Fragment {

    private PageViewModel pageViewModel;

    public ManageFragment(){

    }

    public static ManageFragment newInstance(){
        ManageFragment fragment = new ManageFragment();
        return new ManageFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // init ViewModel
        pageViewModel = ViewModelProviders.of(requireActivity()).get(PageViewModel.class);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_manage,container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);

        TextInputEditText nameEditText = view.findViewById(R.id.textInputTextName);
        nameEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence,  int i, int i1, int i2) {
                pageViewModel.setName(charSequence.toString());

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        TextInputEditText nameEditText2 = view.findViewById(R.id.textInputTextName2);
        nameEditText2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence,  int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence,  int i, int i1, int i2) {
                pageViewModel.setNotelp(charSequence.toString());

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        TextInputEditText nameEditText3 = view.findViewById(R.id.textInputTextName3);
        nameEditText3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence,  int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence,  int i, int i1, int i2) {
                pageViewModel.setAlamat(charSequence.toString());

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        TextInputEditText nameEditText4 = view.findViewById(R.id.textInputTextName4);
        nameEditText4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence,  int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                pageViewModel.setRent(charSequence.toString());

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }
}