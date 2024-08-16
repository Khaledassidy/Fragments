package com.example.fragments.Transition_Fragment_to_Activity;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.fragments.R;
import com.example.fragments.transition.activityToFragment.Name;

public class MainActivity extends AppCompatActivity implements Fragment_to_Activity.OnFragmentClickListner {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView=findViewById(R.id.tv_name_activity);

        //tare2a tenye taswasoul men l fragment to activity ya3ne hala2 l morsel howe l fragment wel most2bel howe Activity bede5lo textview badna n7ot recycel badel ma howe bel activity bel fragemnt w l textview badel ma howe bel fragemnt mn7oto bel activity mobasharatan
        //hala2 l code le keen de5el l activity bade shelo kolo w 7oto metl ma howe de5el l fragmnt w baade defo bel maken le fe acces lal 3anaser le 5asa bel views   le fena nosal lal view heye bde5el function l oncreate
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        Fragment_to_Activity fragment=new Fragment_to_Activity();
        ft.replace(R.id.frame_rc,fragment);
        ft.commit();
    }

    @Override
    public void onFragmentInteraction(Name name) {
        //hala2 houn ana 2dert 2on2ol l esm mn mn l fragemnt lal activity
        textView.setText(name.getName());
    }
}