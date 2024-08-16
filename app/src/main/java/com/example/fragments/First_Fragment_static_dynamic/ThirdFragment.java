package com.example.fragments.First_Fragment_static_dynamic;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ThirdFragment extends Fragment {



    public ThirdFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d("Fragment Life Cycle","OnAttach third Fragment");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Fragment Life Cycle","OnCreate third Fragment");

    }






    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d("Fragment Life Cycle","OnCreateView third Fragment");

        return inflater.inflate(R.layout.fragment_third, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d("Fragment Life Cycle","OnViewCreated third Fragment");


    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("Fragment Life Cycle","OnCreateCreated third Fragment");


    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("Fragment Life Cycle","OnStartFragment third Fragment");

    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("Fragment Life Cycle","OnResumeFragment third Fragment");

    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("Fragment Life Cycle","OnPauseFragment third Fragment");

    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("Fragment Life Cycle","OnStopFragment third Fragment");

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("Fragment Life Cycle","OnDestroyView third Fragment");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("Fragment Life Cycle","OnDestroyFragment third Fragment");

    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("Fragment Life Cycle","OnDetachFragment third Fragment");


    }
}