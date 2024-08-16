package com.example.fragments.transition_fragment_to_fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.fragments.R;
import com.example.fragments.transition.activityToFragment.Name;

/**
 * A simple {@link Fragment} subclass.

 */
public class BlankFragment2 extends Fragment {
    private Name name;
    private static  final String ARGS_NAME="name";


   public BlankFragment2(){

   }

   public static BlankFragment2 newinstace(Name name){
       Bundle bundle=new Bundle();
       bundle.putSerializable(ARGS_NAME,name);
       BlankFragment2 fragment2=new BlankFragment2();
       fragment2.setArguments(bundle);
       return fragment2;
   }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle=getArguments();
        if(bundle!=null){
            name=(Name) bundle.getSerializable(ARGS_NAME);

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_blank2, container, false);
        TextView textView=view.findViewById(R.id.fragemnt2_textview);
        textView.setText(name.getName());
        return view;
    }
}