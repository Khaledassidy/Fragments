package com.example.fragments.First_Fragment_static_dynamic;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.fragments.R;

/*

la nezt3mel l fragments:
1-2awl she lezm nenshe2 l fragment fa lezm ykoun 3ande fragmnets mawjoude 3ala janab feha kel sh8l le bade yeh w ba3d heek bshof keef bade esta5dema w sho toro2 le bade et3emal feha ma3 l fragment
bet3mela metl ma bet3mela ma3 l activity brou7 2awl she ba3mel rightclickonpackage-->new->fragment
tab3an fe anwa3 mn l fragmnet fe fragmnet jehze feha tasmem 2aw feha method jehze w fe fragmnets blank le heye metl l empty activity la7 net3emal ma3a ma bd2eyan la nefham keef betkoun l fragment bada tet3emal ma3 l activity sho afdal tare2a 3ashen tersel w testa2bel data mn l activity ba3d heek bseer fena bkol sohole net3emal ma3 fragmnet l be2ye
ba3d ma na3mel blank fragment heye metla metl ta3mloun ma3 l activity ela file 5as feha bel code java w ela file 5as feha bel xml

fe 3ande kabsten wa7de esma haw sha8lten bel8e ta7dedoun l2no bade efham logic step by step :
include fragmnet factory methods:
include interface callbacks:













 */







public class Fragments1 extends AppCompatActivity {

    Button one,two;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragments1);
        one=findViewById(R.id.btn_frag_1);
        two=findViewById(R.id.btn_frag_2);


        one.setOnClickListener(v->{
            FragmentManager fm=getSupportFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();
            SecondFragment secondFragment=new SecondFragment();
            //ft.add(R.id.container_Fragmnet,secondFragment);
            ft.replace(R.id.container_Fragmnet,secondFragment);
            ft.addToBackStack(null);
            ft.commit();
        });


        two.setOnClickListener(v->{
            FragmentManager fm=getSupportFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();
            ThirdFragment thirdFragment=new ThirdFragment();
            //ft.add(R.id.container_Fragmnet,thirdFragment);
            ft.replace(R.id.container_Fragmnet,thirdFragment);
            ft.addToBackStack(null);
            ft.commit();
        });

    }
}