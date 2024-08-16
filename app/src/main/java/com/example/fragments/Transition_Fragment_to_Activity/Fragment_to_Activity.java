package com.example.fragments.Transition_Fragment_to_Activity;

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
 */
public class Fragment_to_Activity extends Fragment {
        private String name;
        public static final String AGR_NAME="name" ;
        private OnFragmentClickListner listner;


    public Fragment_to_Activity() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if(context instanceof OnFragmentClickListner){
            listner=(OnFragmentClickListner) context;

        }else{
            throw new ClassCastException("Your activity does not implements OnFragmentClickListner ");
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
        View view=inflater.inflate(R.layout.fragment_to__activity, container, false);

        RecyclerView recyclerView=view.findViewById(R.id.rv_fragmnet);
        ArrayList<Name> arrayList=new ArrayList<>();
        arrayList.add(new Name("Ahmad"));
        arrayList.add(new Name("Ayman"));
        arrayList.add(new Name("khaled"));
        arrayList.add(new Name("ali"));
        arrayList.add(new Name("wael"));
        NameAddapter nameAddapter=new NameAddapter(arrayList, new onitemclick() {
            @Override
            public void onitemclick(Name name) {
                //bas houn ma b2olo bas 3aref fragmnet manager getsupportfragmentmanager()
                //l2no l getsupportfragemnt manager bekoun m3araf 3ala mostawa l activity fa ma feek tosala la hay l method fa  lezm ykoun 3andak acces lal activity hay ela tafasel mne7ke feha ba3den
                //bas bel7ale hay ma byelzmne bas ed8at 3ala 3onsour bel recleview eno deef fragemnt tenye l2no 7asab ma 7kena eno ana bas bade ed8at 3ala 3onsour bel recyelview bade 2o3rodu nous b textview bel activity ana ma bade sha8el fragemnt tenye
                //hay l method ma 7a ytem ested3e2a ela lama ted8at 3ala 3osnour bel recyele view bde5el fragemnt

                //hala2 bade 2a3ml da8ta 3ala 3onsour ersel l nous la lal textview le b2alb l activity

                //hala2 feek badna na3mel l 3amaleye hay?
                //hala2 fekret ersel data mn object la object sho fneha abl heek bel adapter nafs l fekra l adpter bas 7atyne bel mainactivity keen 3ebra 3an object monfasel 3an l mainactivity feek ne7na 2arsln l object le ne7na da8tna 3lee 2aw l esm le ne7na da8tna 3lee lal mainactivity arsalne 3an tare2 listner ne7na mna3ref eno lisner 3ebra 3an interface bede5ela method betkoun jehze lal tanfez lama l 3onsour lama le ben3osnour tene yestad3eha  bma3na l interface le mawjoud bel fragemnt le onitemclick hay l method 7a dal mo3ala2a ma 7a tetnafaz ela lama l most5dem yestd3eha mn jowa l addpater
                //byestd3eha aytma lama yestd3e listner.onitemclick() le mawjoud bel adapter fa ested3e2 hay listenr.onitemclick() howe 3ebra ested3e2 mn listenr l object le weslne le howe 2asesan weslne mn l addapter lama 3mltelo intilize mn l constructor

                //ya3ne b 2e5tesar hay l method l onitemclcik le ana hal2 mawjoud feha btestad3a lama l 3onsour mn jowa l adapter yestd3eha le howe lama ed8at 3lee lal 3osnour
                //nafs l fekra bel addapter l 3osnour le esmo name 3ande mawjoud houn Name name ka parameter heda l 3osnour mawjoud bde5el fragment

                //fa ana l mafroud lzm eza bade ersel data lal activity 3an tare2 listner

                //nafs ma 3mlt listner lal adpter lezm a3mel listner lal fragemnt w 2ersel mn 5elelo data 3al activity 3ashen l activity testa2bela l2no ana 3ande activity lezm data tosal b manta2a mo3yane bel activity keef bade ersel l data mn l fragemnt lal activity bade ersela 3an tare2 listner  lesh l2no l activity already tam enshe2a fa ma byenfa3 trou7 t2olo eno new activity bel click listner metl ma kent ta3mel bel fragment new fragemnt bel activity w hal 7ake  ma byenfa3 terja3 t2olo sha8ele activity l2no heye already sha8ale ne7an badna neb3atoun heye w sha8ale


                //fa hala2 b3aref 2awl she lisnter bel fragemnt btem bel 3ade enshe2o bde5el l fragemnt 3ashen lama ensa5 l fragemnt 3ala aye project bade ydalo sha8al ma erja3 3adel fe

                //fa ba3mel 3a janab public interface onfragemntclicklistner{
                //void onfragemntinteraction(String name);
                //}
                //heek ana ansha2t interface ka2no ansha2ta b file la7lo tyeb byenfa3 ta3mlo b file la7alo byenfa3 kamen

                //hala2 l interaface heda keef bade est5dema mn l activity ?
                //l activity ma feha wala aye she metl l addapter 3ashn 7ot feha listner ma fe 3ande constructor lal fragmnet metl ma kent 2a3ml bel addapter be2dar 2a3mela b aktar mn tare2a:
                //1-5ale l activity nafsa immplemnet lal listner heda mesh listner 3ebra 3an interface b5ale l activity ta3mel immplimnt la heda l clicklistner bas 3mlt immplimnt la heda l listner 2ajbarne eno 2a3ml overide la heda l click listner l2no 2ale hay l activity le esma mainactivity bada tosta5dam ka listner men heda nou3 ya3ne lezm ykoun joweta l method l onfragemntinteraction() k2no ba3ata jowa l constructor tare2ten nafs she bas 3ashen ma 3ana constructor lezm ykoun fade 3mlneha bel tare2a hay hala2 keef bade erslo mn houn la name le 3ande lal activity 2awl she bade eje 3aref listner 3ande bel fragemnt metl ma 3arfto bel adapter         private OnFragmentClickListner listner; tyeb heda listner ana me7tej metl ma 3mlt bel adapter 5ale yestd3e l method le mawjoud bel mainactivity  metl ma 3mlt bel addapter ya3ne bade 5ale mn 5elel l activity yestd3e l method l onfragemntinteraction method l onfragemnetintearction mawjoude bel main activity ya3ne law 2dert be manta2a mo3yane mn l fragemnt estd3e l mainactivity w 2estd3e mn joweta l method ersela l name ana bkoun fe3leyan wselt lal bade yeh  keef bade 2a3mlha momken enta metl ma shofna 2abl shway na3mel getActivity w testd3eha mobasharatn bas ne7na badna nest3mel tare2a afdal
                //alak fe method moheme mawjoude bel fragemnt ma ntbhtela esma onattach hay l method 2awl method btem ested3e2a 3end enshe2 l fragment l method hay byeb3tlk ma3a l context le sha8alak l fragemnt keef ya3ne l fragemnt mesh mawjoude 3a activity sa7 so 2awl ma yenshe2 l fragemnt 3ala hay l activity byerselak mo2sher 3ala hay l activity fa be2mkenak mobashartn mn 5elel l mo2sher heed le howe b2asher 3ala l activity ta3et le ma7tot feha l fragemnt w bte2dar testd3e l method le mawjoude de5el l activity mn 5elelo feeek ba3mela beje ba3mel heek:
                //beje listner le mawjoud 3ande le m3araf ka global b2olo l listner heda equll lal context dot sho ma byenfa3 estd3eha de8re l2no heda l context class l context mesh class interface fa lezm rou7 7awlo ba3melo casting 2awl ma t2olo listner equll context be2olak ta3a cast to listner 7awele yeh la listner   7awale yeh la listner tyeb byenfa3 7aawel l context la listner l context howe bel ases l activity l main wl activity hay ma3mole implement lal listner heda so already be2dar ana et3emal ma3o ka listner fa ana 3mltela casting la listner ne7na bel 3ade mna3mel shart baset 3ashen net2akad eno yemken wa7ad ana ma bade 2a3mel immpliment lal listner heda bel activity w bade estad3e l fragemnt fa be7ewel yseer y7awel l context le heye l activity la listner mno3 heda fa b ma eno mesh 3emel immplement lal activity la listner fa 7a ya3tek expetion fa beje bef7as eno iza keen l context instance of ya3ne mn no3 l listner heda 7awele yeh l context la heda nou3  ya3ne l instance of ya3ne hal heda l object heda l context mno3 onfragemntintearction  ya3ne hal l context be2dar 7awlo la onfragemntclicklistner ya3ne hal context heda mno3 onfragemntclicklistner 2aw a7ad abne2o  wala law keen mn nafs nou3 instance of 7awlo wala law ma ken mn nafs nou3 ba3mlo expecion b5ale l program ytal3lo kelo a7mar throw ya3ne atlek ya3ne tale3le expetion throw new ClassCastExpetion wa7ad mn anwa3 l expetion enta btl3o b2edak esmo ClassCastExpetion() w bt2olo masln "your activity does not immplement interafce le esma onfragemnt click listner" law aye 7ada 7ewal yest5dem l fragemnt taba3tak w ma keen 3mel lal mainactvity immplement  la heda l clicklistner la7 ya3tek expetion bel loun l a7amar w y2olo eno heda l activity mana ma3mloe implement
                //hala2 bel onatttach jebt listner bel ondettach 5ale listner besewe null lesh 3ashen lama yetla3 mn l fragemnt lama ydamerha y5alele listner null yel8e listner le mawjoud 3a2ases eno yest5demo l user w batal elo aye lozoum

                //hala2 ana sert met2aked eno listner heda 2awl ma yenshe2 l fragemnt b2alb l activity la7n y5azno b mot8ayer esmo listner  ya3ne 2awl ma yenshe2 l fragemnt bel activity 7a y5azen l activity l context b2alb l listner ya3ne 7a y5azen l mainactivity le feha l method onfragmentInteraction  jowa l mot8ayer le esmo listner fa hala2 b aye ma7al bade yeh be2dar estd3e
                //fa beje bel onitemclicklistner b2olo listner.onfragemntintearction stad3e l method w b3tlha l name
                //l method le esma listner.onfragemntintearction(name) sho ma3neta hay l method le 7a yestd3eha 3ebara 3an l method l mawjoude b listner listner howe 3ebara 3an l activity le sha8alet l fragemnt le heye l main activity le heye l method l heye estd3e2 la method le mawjoude bel mainactivity ya3ne 7a yestd3e l code le mawjoud bel mainactivity w yeb3tla name mn l fragemnt
                //so heek ba3at data mn l fragemnt lal activity

                listner.onFragmentInteraction(name);
            }

        });
        //houn 3ashen est3mel l context b2olo getactivity() method btjeblk l activity le enta mawjoud  feha l fragemnet mawjoud feha aye fragemnt enta dayefa 3al shshe btjebalk l activity le enta defta feha
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(nameAddapter);

        return view;
    }

    public interface OnFragmentClickListner{
        void onFragmentInteraction(Name name);
    }
}