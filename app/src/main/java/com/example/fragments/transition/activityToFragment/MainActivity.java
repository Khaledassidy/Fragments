package com.example.fragments.transition.activityToFragment;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.fragments.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    NameAddapter nameAddapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.rc_view);
        ArrayList<Name> arrayList=new ArrayList<>();
        nameAddapter=new NameAddapter(arrayList, new onitemclick() {
            @Override
            public void onitemclick(Name name) {
                //kel ma ed8at 3ala esm bade sha8el l fragment
                FragmentManager fm=getSupportFragmentManager();
                //Fragment_Activity_Fragment fragment=new Fragment_Activity_Fragment();
                Fragment_Activity_Fragment fragment=Fragment_Activity_Fragment.newinstance(name.getName());
                FragmentTransaction ft=fm.beginTransaction();
                //lahoun ana bas zedt l fragemnt 3ala l activitity bas lesa ma ba3tela data keef beb3tla data 3an tare2 l bundle
                //Bundle bundle=new Bundle();
                //bundle.putString("name",name.getName());
                //hala2 saret jehze l bundle 3ande bade eb3ata lal fragemnt mn 5elel method esma fragmnet.setargumnets kel bundel ela metthod esma setargumnets

                //enta heek ba3at l bundle 3ala l fragemnt fa hal2 mafroud l fragemnt test2bel hay l bundle w te3reda b textview
                //fragment.setArguments(bundle);
                ft.replace(R.id.container_frag,fragment);

                ft.commit();

                //bas lezm ka este5dem afdal l moftarad eno ka object orianted eno le byet3emal ma3 l fragemnt ma elo 3ele2a bel mo7tawa le mawjoud feha ya3ne howe bas bya3mel instace mena ya3ne ana l mafroud best5dem l activity ma ele 3ela2a bel fragment ta3etak ya3ne t5ayal 7alak enta mas2ol 3ala l activity w rfe2ak howe mas2ol 3an l fragment ento badkoun ta3mlo l app ma3 ba3d fa enta mesh fahemn l fragemnt sho feha w howe mesh fahemen l activity sho feha mesh matlob tefhamo 3a ba3d fa enta mohmtak ka activity meshmafroud ta3mel bundle w t3abe feha l data enta bas mohmtak  tet3emal ma3 object l fragment w tersela l data le badak yeha tyeb keef bade ersel l data bala bandle keef ana bel array list 3mlt arraylist.add(new name("khaled ")
                //nafs she enta b 2emkenak tersel l esm lal fragemnt w heye joweta te5od l esm w defo 3ala l bundle w ba3d heek tseer testa5dmo  fa hala2 heek bade 2a3ml badel ma 2a3m l bundle bara bade ensa5 code l bundle 3ala l fragemnt 7a t2ol heet la ersel name bel constructor ta3el l fragemnt w hounek est2blo bel constructor iza 3mlt heek akbar 8alat w de8re bya3ml crsuh lee l2no l constructor required empty public constructor ya3ne ma byenfa3 te5od parmetr w constructor b2alab lezm empty
                //fa l 7al 3meel method bel fragemnt 5aleha traje3 object mn nafs class l namefragemnt w sameha newinstance w hay l method bada te5odlak l parameter le badak tefa 3ala l fragemnt ya3ne String name joweta bjame3 l code le enta 7ato bara  ba3mel bundle w b7ot bandle.put(name) le 87a yejene w ba3den b2olo enshe2 fragemnt namefragemnt ft=new namefragemnt() w rou7 7kelo fragemnt.setargumnet(w 3ateha l bundle le badak yeh) w 3mlo return namefragemnt w 5ale l method static 3ashen te2dar testad3eha b esm l class
                //w houn bara kel l matlob menak:                Fragment_Activity_Fragment fragment=Fragment_Activity_Fragment.newinstance(name.getName());

            }
        });
        arrayList.add(new Name("Ahmad"));
        arrayList.add(new Name("Ayman"));
        arrayList.add(new Name("khaled"));
        arrayList.add(new Name("ali"));
        arrayList.add(new Name("wael"));
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getApplicationContext(),RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(nameAddapter);


    }
}