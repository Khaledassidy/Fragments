package com.example.fragments.IntroFragment;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fragments.R;

public class IntroFragments extends AppCompatActivity {

    /*

    Fragments:heye 3ebara 3an sha8le btwafer 3leek wa2t w sho8l lama badak deef eshya 3a mashro3ak 2aw t3adel eshya w kamen btwafer 3leek sho8l w johd eno ma tkarer l eshya ya3ne badel ma enta kont tkarer eshya mo3yane btseer enta tbatel tkarera

    Fragmnets:ma3nta 3anaser jez2eye 2aw jez2 mn she m3yan

    Fragments:fekreta eno enta mara 3leek eno enta 3andak application metl l wattsap teb3at 3lee msg application byeb3at msg law enta kont msha8el heda l application 3al portrait la7 ten3ered 3andak l message bshakl vertical ta7t ba3doun w mojarad ma tet8at 3ala wa7de meno lal messages la7 y7awlak 3ala activity tenye ye3redlak feha details l 5asa bel resele hay l messages le feha l messages baynak w been heda sha5s bas law enta sha8l l application 3ala jehez tablet ipad la7 ye3redlak yeh bshakl eno raseyel 3al shmeel w bnafs shshe fe 3al yamen section bto3oroud details bas tokbous 3al wa7de mn l messages ma byon2oalk 3ala activity la2 byefta7 details 3ala l yamen b nafs l activity metl l watsap byo3rdalk l mo7adaset 3ala jeha l yasar w 3al jeha l fayde 3al yamen byo3drlak details taba3 l message be mojarad ma enta tetd8at 3ala wa7de men l message


    tyeb houne lesh 3mlo l 7arake hay:l 7arake hay 7akolak  enta lama ykouno telephonak land scape 2aw tablet fe mase7a kbere btkoun day3a mn shshe ya3ne fe mase7a fadye ya3ne ana list l message be2dar 2o3rouda b mase7a l 3al sheml w 7a yeb2a mase7a 3al yamen fadye lesh ma besta8ela fa 3aradou jez2 l motaba2e mn shshe le 3al yamen details ta3el l message

    enta btl7ez ba3d l application btest3mel navigation drawer le heye l ka2eme le btetla3 bas tekbous 3ala eshara 3al shmel bel menue feha about,setting...etc fa enta bas tetla3 hay l ka2eme feha button 2olna setting,about..etc enta mojarad ma tekbous 3ala wa7de mn haw l button btla7ez eno 8ayralk l mo7tawa le b shshe


    so2al:hal enta lama te5tar 3onour mn navigation drawer byefta7lk activity jdede wala b8ayer mo7tawa mo3yan mn sheshe le heye l manta2a ra2eseye ta3et shshe l main kola ?
    fe3leyan howe ma byefta7lk activity jdede b8yerlak l mo7tawa shshe l main kola w b5ale l manta2a ta3et l action bar bel icon le feha metl ma houne b8ayer bas l main le ta7t l action bar

    application l watsap:hal enta bas tokbous 3ala kel wa7de mn l message byefta7lk activity jdede la kel wa7de wala b8ayer l mo7tawa ta3et shshe bas ya3ne kel ma kabas 3ala wa7de b8ayer l mo7tawa 7asab le mawjoud mesh kel wa7de ela activity m7adade


    3ana application b2alba tab layout:tabs seeting,home,about..etc mojarad ma enta t8ayer tab mn setting la about masln ma byefta7lk activity jdede esma about la2 b8ayerlak l content ta3et setting bas la tseer about b8ayerlak mo7tawa le mawjoude b loun l abyad bas be2e l eshya medal metl ma heye w hay sha8le btmna3 tekrar ya3ne ftered 3ana 10 tabs hal bade 2a3el 10 activity la2 ba3mel activity wa7de w b8ayer l mo7tawa ta3ela 7asab kel tab bewafer wa2t byemna3 tekrar ya3ne howe b5ale l menue masln w l floating action button w b8ayer jez2 mn shshe
    l fragments 3ebra 3an  joz2 mn l activity le mawjoude 3andak btet8ayar 7asab ma bade ya3ne l fragmnet heye 3ebra 3al shshe jowa shshe ela tasmema l 5as ela lifecycle 5as feha ela code java 5as feha ya3ne 3tebera metla metl l activity ela code java w ela code tasmem bte2dar tenshe2a la7al w testad33ha bel manta2a le enta badak yeha


    tyeb houne lesh 3mlolna yeha sho l hadaf mn eno nesta3mela:7akelak shof tatbe2 l watsap le 3andak 3ana activity A lama ykoun l mobile portrait fe3layn enta badak te5tar msg w y7awlak 3ala activity jdede feha details ya3ne b activity A la7 ta3mel  recycle view w bel activity B le heye l details la7 to3roud tafasel hay resele
    bas lama ykoun l mobile land scape bnafs l activity l A la7 to3roud code l recycle view w la7 ta3mel code details 3al yamen
    7akelak badal ma enta trou7 bel shshe ta3et l portrait A ta3mel code  recycel view w trou7 b nafs l activity ta3et l land scape toktoub l code ta3el l recycel view ya3ne tkarero kamen mara ma enta bel land scape badak recycel view 7eda details fa 7a ye5telef tasmem la7 tettar teraja3 tektbo tkarero kamen mara alak badel ma ta3mel heek enta momken ta3melo b fragment w t7oto b maken wa7ad w tseer testa5dmo bel portrait w bel lanscape ya3ne enta bta3mel code fragment la7alo w badak yeh bel portrait bhay l ma7al t7oto w bel landscape t7oto b ma7al tene ya3ne metl l function enta btoktoba m baken m3yan w bseer enta wa2t badak yeha btestad3eha ween ma badak
    fa l fekra b fragments ana bade jahez sho8le be maken mo3ayan w bseer bst5dmo mara 3ala l portrait mara 3ala landscape w nafs she b application l msg ana bjahez code recyle b fragment la7al ween bade esta3mela ba3mela injection b7ota ma7al ma badenesta3mela
    w kamen b exmple l tab layout ana ba3mel shshe ta3eta ka fragment sho ya3ne fragment ya3ne ana bseer b8ayer l mo7tawa bel maken l abyad l main 7asab kel tab ya3ne lama ed8at 3ala tab m3ayan bestd3e l fragmnet le bade yeha w b8ayer l mo7tawa le bel abyad  mn 8eer ma 8ayer l mneue,w floating action button ya3ne bseer bestd3e l fragment le bade yaha teje ba7al l abyad mn 8eer ma 8ayer l menue,floatingaction button ...etc



    fa l fragments:heye ta8yer jez2 mn shshe w wad3 shshe jowa sheshe ya3ne 7ot she b2alb she bkemel tafasela b file l xml ta3ela bel code java b kel details l 5asa feha  lesh l kalem heda ne5tesr heda l kalem 3ashen emna3 tekrar mtl application l msg code recyele 3ashen ma karero marten ba3mlo mara w besta5dmo marten 2awl sha8le bemna3 tekrar tene sha8le eno a7yena fe sha8let b shshe ma lezm tet8ayar mtl toool bar metl tablayout toolbar ma byelazm tet8ayar kel ma 8ayer tab  byelzm yet8ayar bas jez2 m3ayan mn shshe ya3ne byelaz 8ayer joz2 mn shshe mesh kel shshe mnshof ba3den arya7 elna b 3mlyet ta3del,tatwer 3ala l application btwafer eshya more7a l fragments























    */













    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_fragments);


    }
}