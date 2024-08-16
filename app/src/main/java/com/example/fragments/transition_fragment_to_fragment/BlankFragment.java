package com.example.fragments.transition_fragment_to_fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragments.R;
import com.example.fragments.transition.activityToFragment.Name;
import com.example.fragments.transition.activityToFragment.NameAddapter;
import com.example.fragments.transition.activityToFragment.onitemclick;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 *
 *
 *
 */

//hala2 mafroud hay l fragemnt bada tersel data la tene fragemnt le feha textview
//l morsel hay l fragemnt     l most2bel fragemnt2 le feha textview
//fa bet3emal ma3a la hay l fragemnt metl ma t3emlt ma3 l fragemnt ta3et recyecle view le 2abla
//ya3ne bade ersel hala2 data mn fragemnt hay lal activity
public class BlankFragment extends Fragment {
    private  String name;
    private OnFragmentClickListner listner;


    public BlankFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if(context instanceof OnFragmentClickListner){
            listner=(OnFragmentClickListner) context;

        }else{
            throw new ClassCastException("the activity not immplemnt onfragemntclicklistner");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listner=null;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_blank, container, false);

        RecyclerView recyclerView=view.findViewById(R.id.fragment1_recyele);
        ArrayList<Name> arrayList=new ArrayList<>();
        arrayList.add(new Name("Ahmad"));
        arrayList.add(new Name("Ayman"));
        arrayList.add(new Name("khaled"));
        arrayList.add(new Name("ali"));
        arrayList.add(new Name("wael"));
        NameAddapter nameAddapter=new NameAddapter(arrayList, new onitemclick() {
            @Override
            public void onitemclick(Name name) {
                listner.onFragmentInteraction(name);

            }
        });
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(nameAddapter);

        return view;
    }

    public interface OnFragmentClickListner{
        void onFragmentInteraction(Name name);
    }
}