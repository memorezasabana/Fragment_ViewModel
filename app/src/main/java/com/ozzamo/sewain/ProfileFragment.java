package com.ozzamo.sewain;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class ProfileFragment extends Fragment {

    private PageViewModel pageViewModel;
    private TextView txtName, txtNotelp, txtAlamat, txtRent;

    public ProfileFragment() {

    }

    public static ProfileFragment newInstance() {
        return new ProfileFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        // init ViewModel
        pageViewModel = ViewModelProviders.of(requireActivity()).get(PageViewModel.class);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        txtName = view.findViewById(R.id.textViewName);
        pageViewModel.getName().observe(requireActivity(), new Observer<String>() {

            @Override
            public void onChanged(@Nullable String s) {
                txtName.setText(s);
            }
        });

        txtNotelp = view.findViewById(R.id.textViewName2);
        pageViewModel.getNotelp().observe(requireActivity(), new Observer<String>() {

            @Override
            public void onChanged(@Nullable String s) {
                txtNotelp.setText(s);
            }
        });

        txtAlamat = view.findViewById(R.id.textViewName3);
        pageViewModel.getAlamat().observe(requireActivity(), new Observer<String>() {

            @Override
            public void onChanged(@Nullable String s) {
                txtAlamat.setText(s);
            }
        });

        txtRent = view.findViewById(R.id.textViewName4);
        pageViewModel.getRent().observe(requireActivity(), new Observer<String>() {

            @Override
            public void onChanged(@Nullable String s) {
                txtRent.setText(s);
            }
        });
    }
}