package com.example.fragments.transition_fragment_to_fragment;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.fragments.R;
import com.example.fragments.Transition_Fragment_to_Activity.Fragment_to_Activity;
import com.example.fragments.transition.activityToFragment.Name;

public class MainActivity extends AppCompatActivity implements BlankFragment.OnFragmentClickListner {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        //hala2 e5er tare2a heye tawasoul been fragemnt w fragemnt 3ande akatr mn fragemnt bel activity w talab l amr eno 2arsel data mn fragemnt la fragemnt keef momken 2a3mel l 2adeye hay
        //nafs l mawdo3 le 7keyne bel toro2 le abl
        //tare2a telet btedmej been tar2ten le mara2o l2no tawasoul been fragemnt w fragemnt ma byenfe3 ersel monbasharatan lezm ersel mn fragemnt lal activity w ba3den ersel mn l activity lal fragemnt tenye ya3ne 7ala2et l waslt 3an tare2 l activity
        //howe neje lal 7a2e2a byenfa3 eno tersel data mn fragemnt la fragemnt mobasharatan bas l afdal 5ale tawasoul fe selet waslt ma3 l activity lesh l2no t5ayal bel onclick taba3 l fragemnt l 2ola tektob mobasharatan code tash8el l fragemnt teneye hay l harake bt5lek k2no rabt l fragemnt l 2ola b tenye ya3ne law badak tensa5 hay l fragemnt la 7ala 3ala mashro3 mesh 7a te2dar tens5ha ela law tenye ma3a bas mabda2 l fragment eno bade et3emal ma3 shseh ka ajze2 mesh bade e5od l ajze2 tkoun mortabata ma3 ba3da la2 kel jez2 lezm ykoun monfasel 3an tene fa afdal tare2a heye:
        //5ale l fragemnt1 tersel data lal activity w l activity tersel data lal fragment2 so bhay tare2a ka2no arslt data mn fragment la fragment

        //fa 5alena na3mel tnen fragemnt 2 na3mel tasmem fragemnt 1 feha recyele view fragemnt 2 feha textview
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        BlankFragment fragment=new BlankFragment();
        ft.replace(R.id.fragmnet_recycle,fragment);
        ft.commit();


    }


    @Override
    public void onFragmentInteraction(Name name) {
        //hala2 data weselet la 3andak la houn
        //ya3ne 2awl 5otwe 3mlta 2arslt data mn l fragemnt lal activity
        //hala2 mojarad ma ed8at 3ala button bel recyele view la7 tosal data la houn le heye name
        //hala2 bel la7za hay le bada tosale l data mn fragemnt la activity badak tssha8el l fragemnt tenye w eb3tla l data
        //brou7 best5dem nafs l tare2a le sta3mlta mel exmple l 2awal ya3ne ka2no sort mn activity la fragment lesh l2no ana fe3lyan houn mawjoud bel activity fa sert ka2ne bade eb3at data mn activity la fragment
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        BlankFragment2 fragment2=BlankFragment2.newinstace(name);
        ft.replace(R.id.fragemnt_textview,fragment2);
        ft.commit();

    }
}