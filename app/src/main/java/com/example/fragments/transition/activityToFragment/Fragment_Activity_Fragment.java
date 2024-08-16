package com.example.fragments.transition.activityToFragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_Activity_Fragment extends Fragment {

    private String name;
    private static final String AGR_NAME="name";


    public Fragment_Activity_Fragment() {
        // Required empty public constructor
    }

    public static Fragment_Activity_Fragment newinstance(String name){
        Bundle bundle=new Bundle();
        bundle.putString(AGR_NAME,name);
        Fragment_Activity_Fragment fragment=new Fragment_Activity_Fragment();
        fragment.setArguments(bundle);
        return fragment;
        //wasefeta hay l method kola eno badel ma enta bel main activity kont te5od l bundle w tenshe2a w bedef 3lyha l nous w btenshe2 instance mn bundle w bdeef 3lyha l bundle houn 2a5doun w jama3oun b matra7 wa7ad w 5alak b method wa7de testd3eha b esm l class
    }



    //beje b method esma l oncreate w ba3mel joweta l code le byejleb l data mn l bundle w be5zenoun b mot8ayerat
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //enta bel main activity ro7t 3mlt instance mn l fragemnt w arsalt fe l bundle le feha data name w ro7t sha8lt l fragemnt l fragemnt houn 2awl ma shata8alet  l mafroud te3roud textview w textview le bado yen3ered bado yen3ered b2albo l name le enta 2arsalto mn 5elel l bundle fa lezm enta mn de5el l fragemnt te5od l bundle w tejeb mena l name w te3rdo b textview
        //beje m method l oncreate ba3ml code 3mlyet jalb l bundle lesh men jowa l oncreate mesh b oncreate view 2aw constructor
        //l on create heye 3ebara 3an 2awal method btem ested3a2a sa7 wala la2 la2 hay l method btem ested3e2a lama yenshe2 l fragemnt fa ana fe3leyan lama estd3e l oncreate bkoun met2aked eno l fragemnt tam enshe2a fa btele l fragemnt wesela l bundle fa betele be2dar e5od l baynet mena keef bade 2a3ml heek hkeef keen 3ande getintent 3ande method isma getargument btraj3le l baynet l bundle kemle
        Bundle bundle=getArguments();
        if(bundle!=null){
            //iza l bundle ma btsewe null rou7 5aznle le ejene mena b variable
            //b3ref l variable global 3ashn heda l variable bade est3mlo bel oncreate w l oncreateview 3ashen 7oto b textview
            name=bundle.getString(AGR_NAME);

            //hala2 l method l oncrearte 5alaset ba3da byestd3e l method le esma oncreateview
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //l oncreate view bta3ml inflate la tasmem w betrou7 bta3mel kel she8l le badak ta3mlo joweta nafs l method le keen esma getview listview heye bta3ml inflate la tasmem 2awl she b2alb l conatiner le mna3te yeh bel add,delete,replace w bt3tene class layout inflater wl container
        //b3ref view w b7eta equll la inflater heye btrj3le view ta3el tasmem
        View view=inflater.inflate(R.layout.fragment__activity_, container, false);
        //fa bjeeb textview
        TextView textView=view.findViewById(R.id.tv_name);
        //ba3den b7ot data ta3et le ejtne le heye name
        textView.setText(name);

        //fa le sar ba3d ma ensha2 l fragemnt b2olo heda tasmem 5odo w rou7 3mlo inflate 3ala l container le 3atytak yeh w ba3den 3aten meno textview w 7otele b2albo name
        //ba3den 3meel return view w rakeb tasmem 3al shshe ma3 l data le 3atytak yeha le b2alb l textview

        return view;
    }
}