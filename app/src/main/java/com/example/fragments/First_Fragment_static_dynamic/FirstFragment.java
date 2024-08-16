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
/*
2awl she byetla3 3ana public class FirstFragment extents mn class Fragment
l ab ta3elo esmo fragment hounek bel activity keen esm l ab AppCompatActivity houn fragment

w 3ande constructor esmo fristFragrment():w fe mola7aza moheme lama tet3emal ma3 l constructor enop required empty public constructor ya3ne enta ka fragment lezm ykoun feek  fere8 w public constructor  ya3ne lezm ykoun public constructor fade mawjoud tyeb lesh?
l2no l fragment manager 2aw system byet3emal ma3aha be23tebar eno fe constructor efterade lezm ykoun fe 3ande constructor efterade 3ashen ya3mel menha instance w yet3emal ma3ha fa enta ma trou7 t8ayer fe bade 7ot parameter string bade eb3at string name  w integer medre sho w tektob she b2albo btetrko metl ma howe
w ta3mel getter w setter la2

3ande method tenye esma onCreateView

tab3an l fragmnet l mawjoude 3ande elo file esmo fragment_first xml  3ebara 3an malaf tasmem ta3el fragment 3ebra 3an layout 3adeye b2alba:
Frame layout w b2albo textview ma bd2ayen 5alena netrko metl ma howe w nerja3 la code java


Fragments ela Life cycle 5asa feha keef l activity ela life cycle lal fragment fe life cycle mn 2awl ma l fragmnet tendaf 3ala shshe la7ed ma l fragment tetdamar mn shshe btmour b majmo3a mn l call backs w btnafez  mawjmo3a mn l function 3ala system sho houn l function l call backs:
-OnAttach():2awl function kama teje testa5dem l fragment w te3redha 3ala l activity tab3an l fragmnet mesh momken tkoun mawjoude ela jowa 2awl ma yebda2 ye7der l fragment 3ala shshe abl ma yenshe2a b7ewel ye7dera byestd3e method emsa   activity esma OnAttach() attach ma3neta yo7der 2aw yejleb 2awal function btestd3a lama l activity yejleb l fragmnet 3lyha abl ma yen3amal create la ftagment bjeba 3ala l activity
-OnCreate():tene method esma Oncreate() le heye fe3lyan enshe2 l fragment lama yenshe2 l fragment byestd3e l oncreate() lama yenshe2 l fragment 3ala l activity howe byenshe2a fadye ma feha layout byenshe2 l fragment feha layout fadye
-OnCreateView():telet method byestd3eha esma OnCreateView() l Oncreate byenshe2 l fragment ok tamem l onCreateView() haye wazefeta 3ashen yenshe2 layout l 5asa bel fragment 2aw l view l 5asa bel fragment ne7na 7kena eno kel fragment ela file code w file tasmem xml malf tasmem l oncreateview() heye  fe3leyan l wzefeta eno tenshe2o w te3rdo 3ala l fragment ya3ne wzefet method l oncreate view tenshe2 heda l file l xml le 5aso bel fragment w t3ordo 3ala l fragment ma howe bel oncreate byensha2 l fragment b2albo layout fadye w bel oncreate view byensha2a heda l file xml l 5aso bel fragment w byen7at 3ala layout l fadye ta3et l fragment
-OnActivityCreated():btem ested3e2a mn esma lama t5ales l activity 3mleyet l creation tab3aha
-OnStart():ba3den byeje l onstart()
-OnResume():ba3d l onstart byeje l onresume()

ba3d l onresume btseer l fragment activite b ma3na law l fragment shata8alet w visible la 2elak w sha8ale tamem tamem 3ref 3al akeed tam ested3e2 l function koloun l onattach,oncreate,oncreateview,onactivitycreated,onstart,onresume ya3ne haw 6 function 3al akeed tam ested3e2oun madem l fragment bayanet 3andak

hala2 metl zamen lama 7ekena bel activity w tfasaln tafsel bel life cycel houn kamen fe actions byet3emal ma3a l user ma3 l  fragment bt2ade eno yestd3e be2e l function l mawjoude bel life cycle:

User navigates backward or fragment removed or replaced:ya3ne law l fragment tab3tak tbadalet 2aw n7azafet mn sheshe 2aw law l fragment ta3elak t8ayar la shshe tenye l fekra eno 3ande kamen:
The fragment is added to back stack then remover or replaced:
OnPause():keef bel activity btestd3e l onpause lama yeje 3onsour tene 3ala l activity w ykoun l focus 3lee w l activity tkoun mbyen bel 5alfeye bas l focus mesh 3lyha tab3an heda l kalem 7kene zamen bel activity byenteb2 tameman 3ala l fragment ya3ne l onpause lama yeje she 3ala fragment w tseer l fragment mana on focus
OnStop():l on stop nafs l fekra lama l fragment tbatel zahra 3andak
OnDestroyView():lama yrou7 ydamer l view 2aw layout le de5el l fragment le b2alb l activity
OnDestroy():lama ydamer kel l fragment mn l activity
OnDetach():bshel l fragment mn l activity w b l fragmnet btbatel mbyne bel activity

fe sehm reje3 rjo3 mn 3and l ondestroyview la 3end l oncreateview

fe she 3ande esmo the fragment return to layout from back stack:sho ya3ne back stack iza mnzkour lama 2olna bteshbah b 3olbet l pringles le heye e5er 2ot3a btod5ol bel 3olbe heye 2awl 2ot3a bekolha hay l stack fe3lyan l back stack heye 3ebara 3al l stack le 5asa bel rojo3 ya3ne enta kel ma deef fragments 2aw activity ya3ne activity warah activity wraha activity mafroud lama ta3mel rojo3 shshe l 2a5era traj3ak 3al shshe l 2ablha ma tal3ak mn l application w l 2abla traj3ak 3ale abla heek la7 nekteshef ba3d heek lama deef l fragment 3ala l back stack w ta3mel rojo3 :
bya3mel destroyView() w bay3mel create lal view mara tenye


hala2 badna na3mel Log.d 3ala kel function bel life cycle:
Onattach:heye l wa7ede mnla7ez byeje b2alba context ka parameter
law badak context ya3ne b7aje la test3mel context badak l activity fe method esma getActivity() btjeblak l activity 2aw l context lal activity le mawjoud feha 2aw mo2sher 3al activity le mawjoud feha

3ande wa7de esma onviewCreated():hayde byestd3eha ba3d ma y5les mn enshe2 l view w bta3etk l view ka mod5al parameter l oncreated view ba3d ma t5les tenshe2 l views b2alb l fragment btrje3 view fa btestd3a l onviewcreated btest2bela l onviewcreated w byeb3tlk yeha ka parameter




hala2 iza enta fata7t l fragmnet bta3mel:
-OnAttach():2awl function kama teje testa5dem l fragment w te3redha 3ala l activity tab3an l fragmnet mesh momken tkoun mawjoude ela jowa 2awl ma yebda2 ye7der l fragment 3ala shshe abl ma yenshe2a b7ewel ye7dera byestd3e method emsa   activity esma OnAttach() attach ma3neta yo7der 2aw yejleb 2awal function btestd3a lama l activity yejleb l fragmnet 3lyha abl ma yen3amal create la ftagment bjeba 3ala l activity
-OnCreate():tene method esma Oncreate() le heye fe3lyan enshe2 l fragment lama yenshe2 l fragment byestd3e l oncreate() lama yenshe2 l fragment 3ala l activity howe byenshe2a fadye ma feha layout byenshe2 l fragment feha layout fadye
-OnCreateView():telet method byestd3eha esma OnCreateView() l Oncreate byenshe2 l fragment ok tamem l onCreateView() haye wazefeta 3ashen yenshe2 layout l 5asa bel fragment 2aw l view l 5asa bel fragment ne7na 7kena eno kel fragment ela file code w file tasmem xml malf tasmem l oncreateview() heye  fe3leyan l wzefeta eno tenshe2o w te3rdo 3ala l fragment ya3ne wzefet method l oncreate view tenshe2 heda l file l xml le 5aso bel fragment w t3ordo 3ala l fragment ma howe bel oncreate byensha2 l fragment b2albo layout fadye w bel oncreate view byensha2a heda l file xml l 5aso bel fragment w byen7at 3ala layout l fadye ta3et l fragment
-OnActivityCreated():btem ested3e2a mn esma lama t5ales l activity 3mleyet l creation tab3aha
-OnStart():ba3den byeje l onstart()
-OnResume():ba3d l onstart byeje l onresume()

ba3den za tle3t mn shshe 2aw 3mlt portrait la shshe byestd3e:
onPause():keef bel activity btestd3e l onpause lama yeje 3onsour tene 3ala l activity w ykoun l focus 3lee w l activity tkoun mbyen bel 5alfeye bas l focus mesh 3lyha tab3an heda l kalem 7kene zamen bel activity byenteb2 tameman 3ala l fragment ya3ne l onpause lama yeje she 3ala fragment w tseer l fragment mana on focus
OnStop():l on stop nafs l fekra lama l fragment tbatel zahra 3andak
OnDestroyView():lama yrou7 ydamer l view 2aw layout le de5el l fragment le b2alb l activity
OnDestroy():lama ydamer kel l fragment mn l activity
OnDetach():bshel l fragment mn l activity w b l fragmnet btbatel mbyne bel activity

iza 3mlna intent mn fragmnet A to Fragmnet B:
Fragment A 7atneha bel back stack :
onPause():keef bel activity btestd3e l onpause lama yeje 3onsour tene 3ala l activity w ykoun l focus 3lee w l activity tkoun mbyen bel 5alfeye bas l focus mesh 3lyha tab3an heda l kalem 7kene zamen bel activity byenteb2 tameman 3ala l fragment ya3ne l onpause lama yeje she 3ala fragment w tseer l fragment mana on focus
OnStop():l on stop nafs l fekra lama l fragment tbatel zahra 3andak
OnDestroyView():lama yrou7 ydamer l view 2aw layout le de5el l fragment le b2alb l activity
7a yen3aml on pause l2no l activity batalet in foregnground ba3den on stop l2no 7a tbatel l fragmnet mbyne ba3den 7a ta3mek on destroy view 7a ytel fe view bel fragmnet bas l fragmnet 7a dala 3eyshe w btne7t bel back stack

iza  fragmnet A ma n7atet bel baack stack 2aw replaced 2aw removed:
onPause():keef bel activity btestd3e l onpause lama yeje 3onsour tene 3ala l activity w ykoun l focus 3lee w l activity tkoun mbyen bel 5alfeye bas l focus mesh 3lyha tab3an heda l kalem 7kene zamen bel activity byenteb2 tameman 3ala l fragment ya3ne l onpause lama yeje she 3ala fragment w tseer l fragment mana on focus
OnStop():l on stop nafs l fekra lama l fragment tbatel zahra 3andak
OnDestroyView():lama yrou7 ydamer l view 2aw layout le de5el l fragment le b2alb l activity
OnDestroy():lama ydamer kel l fragment mn l activity
OnDetach():bshel l fragment mn l activity w b l fragmnet btbatel mbyne bel activity

Fragment B:
-OnAttach():2awl function kama teje testa5dem l fragment w te3redha 3ala l activity tab3an l fragmnet mesh momken tkoun mawjoude ela jowa 2awl ma yebda2 ye7der l fragment 3ala shshe abl ma yenshe2a b7ewel ye7dera byestd3e method emsa   activity esma OnAttach() attach ma3neta yo7der 2aw yejleb 2awal function btestd3a lama l activity yejleb l fragmnet 3lyha abl ma yen3amal create la ftagment bjeba 3ala l activity
-OnCreate():tene method esma Oncreate() le heye fe3lyan enshe2 l fragment lama yenshe2 l fragment byestd3e l oncreate() lama yenshe2 l fragment 3ala l activity howe byenshe2a fadye ma feha layout byenshe2 l fragment feha layout fadye
-OnCreateView():telet method byestd3eha esma OnCreateView() l Oncreate byenshe2 l fragment ok tamem l onCreateView() haye wazefeta 3ashen yenshe2 layout l 5asa bel fragment 2aw l view l 5asa bel fragment ne7na 7kena eno kel fragment ela file code w file tasmem xml malf tasmem l oncreateview() heye  fe3leyan l wzefeta eno tenshe2o w te3rdo 3ala l fragment ya3ne wzefet method l oncreate view tenshe2 heda l file l xml le 5aso bel fragment w t3ordo 3ala l fragment ma howe bel oncreate byensha2 l fragment b2albo layout fadye w bel oncreate view byensha2a heda l file xml l 5aso bel fragment w byen7at 3ala layout l fadye ta3et l fragment
-OnActivityCreated():btem ested3e2a mn esma lama t5ales l activity 3mleyet l creation tab3aha
-OnStart():ba3den byeje l onstart()
-OnResume():ba3d l onstart byeje l onresume()


hala2 iza ne7na fat7na kteer eshya w 3abyna l memory ram 3al 2e5er fa 7a yetar system la7lo ya3mel la fragmnet A destroy l2no 7tej la memory 2aw iza l fragment n3amal replaced 2aw removed:
OnDestroy():lama ydamer kel l fragment mn l activity
OnDetach():bshel l fragment mn l activity w b l fragmnet btbatel mbyne bel activity


iza la2 dalet 3eyshe 2aw kenet fragment A belack stack  w 3mlna navigate back ward mn fragmnet B la fragmnet A fa fragment A 7a testd3a mn l back stack w terja3 w yestd3a:
Fragment A:
-OnCreateView():telet method byestd3eha esma OnCreateView() l Oncreate byenshe2 l fragment ok tamem l onCreateView() haye wazefeta 3ashen yenshe2 layout l 5asa bel fragment 2aw l view l 5asa bel fragment ne7na 7kena eno kel fragment ela file code w file tasmem xml malf tasmem l oncreateview() heye  fe3leyan l wzefeta eno tenshe2o w te3rdo 3ala l fragment ya3ne wzefet method l oncreate view tenshe2 heda l file l xml le 5aso bel fragment w t3ordo 3ala l fragment ma howe bel oncreate byensha2 l fragment b2albo layout fadye w bel oncreate view byensha2a heda l file xml l 5aso bel fragment w byen7at 3ala layout l fadye ta3et l fragment
-OnActivityCreated():btem ested3e2a mn esma lama t5ales l activity 3mleyet l creation tab3aha
-OnStart():ba3den byeje l onstart()
-OnResume():ba3d l onstart byeje l onresume()

iza la2 n3mala delete 2aw replaced 2aw ma n7atet bel back stack:
-OnAttach():2awl function kama teje testa5dem l fragment w te3redha 3ala l activity tab3an l fragmnet mesh momken tkoun mawjoude ela jowa 2awl ma yebda2 ye7der l fragment 3ala shshe abl ma yenshe2a b7ewel ye7dera byestd3e method emsa   activity esma OnAttach() attach ma3neta yo7der 2aw yejleb 2awal function btestd3a lama l activity yejleb l fragmnet 3lyha abl ma yen3amal create la ftagment bjeba 3ala l activity
-OnCreate():tene method esma Oncreate() le heye fe3lyan enshe2 l fragment lama yenshe2 l fragment byestd3e l oncreate() lama yenshe2 l fragment 3ala l activity howe byenshe2a fadye ma feha layout byenshe2 l fragment feha layout fadye
-OnCreateView():telet method byestd3eha esma OnCreateView() l Oncreate byenshe2 l fragment ok tamem l onCreateView() haye wazefeta 3ashen yenshe2 layout l 5asa bel fragment 2aw l view l 5asa bel fragment ne7na 7kena eno kel fragment ela file code w file tasmem xml malf tasmem l oncreateview() heye  fe3leyan l wzefeta eno tenshe2o w te3rdo 3ala l fragment ya3ne wzefet method l oncreate view tenshe2 heda l file l xml le 5aso bel fragment w t3ordo 3ala l fragment ma howe bel oncreate byensha2 l fragment b2albo layout fadye w bel oncreate view byensha2a heda l file xml l 5aso bel fragment w byen7at 3ala layout l fadye ta3et l fragment
-OnActivityCreated():btem ested3e2a mn esma lama t5ales l activity 3mleyet l creation tab3aha
-OnStart():ba3den byeje l onstart()
-OnResume():ba3d l onstart byeje l onresume()


Fragment B:
iza 7atyna l fragment b bel back stack 7a tfout l fragment bel back stack w 7a testd3a:
onPause():keef bel activity btestd3e l onpause lama yeje 3onsour tene 3ala l activity w ykoun l focus 3lee w l activity tkoun mbyen bel 5alfeye bas l focus mesh 3lyha tab3an heda l kalem 7kene zamen bel activity byenteb2 tameman 3ala l fragment ya3ne l onpause lama yeje she 3ala fragment w tseer l fragment mana on focus
OnStop():l on stop nafs l fekra lama l fragment tbatel zahra 3andak
OnDestroyView():lama yrou7 ydamer l view 2aw layout le de5el l fragment le b2alb l activity
7a yen3aml on pause l2no l activity batalet in foregnground ba3den on stop l2no 7a tbatel l fragmnet mbyne ba3den 7a ta3mek on destroy view 7a ytel fe view bel fragmnet bas l fragmnet 7a dala 3eyshe w btne7t bel back stack

iza la2 l fragment Bma n7atet bel back stack 2aw replaced 2aw removed:
onPause():keef bel activity btestd3e l onpause lama yeje 3onsour tene 3ala l activity w ykoun l focus 3lee w l activity tkoun mbyen bel 5alfeye bas l focus mesh 3lyha tab3an heda l kalem 7kene zamen bel activity byenteb2 tameman 3ala l fragment ya3ne l onpause lama yeje she 3ala fragment w tseer l fragment mana on focus
OnStop():l on stop nafs l fekra lama l fragment tbatel zahra 3andak
OnDestroyView():lama yrou7 ydamer l view 2aw layout le de5el l fragment le b2alb l activity
OnDestroy():lama ydamer kel l fragment mn l activity
OnDetach():bshel l fragment mn l activity w b l fragmnet btbatel mbyne bel activity



hala2 l mafroud hay l fragment anshe2neha feha function l lifecycle tyeb ween malaf l xml tasmem taba3a mawjoud bel oncreate view 5alena nfout 3lee w n8ayer l back ground 3ashen 2a3ref eno bayne eno defta


Fragment 3ashen defa 3ala shshe 3ande tare2ten :
2awl tare2a mn 5elel l barmaje code:eno 2a3mel code barmaje defa 3ala shshe
tene tare2a mn 5elel l xml :3ande tag 2aw item 2aw view esma fragment mn 5elela enta momken deef l fragment 3ala sheshe

ba3d mn application l fragment:
-navigation drawer
-dialog
-tab layout
-list
-preferances

static method:
mnfout 3ala l activity le bade 2o3roud feha l fragment w beje 3ala l containers fe she esmo fragment bes7aba w bermeha 3ala shshe fa mndef attribute sma fragment w lezm darore bas deef l fragment t7adedlo attribute esma name of fragment hay tare2a esma static fragment tare2a sebte bas defa mn l xml tare2a sebte 7adedtela l name enata ya3ne 7adatela meen l fragment le bado ykoun joweta le howe l class l fragment ta3ele name howe ma7al l class le ana 3mlto esm l package ba3den esm l fragment bhay tare2a:
 <androidx.fragment.app.FragmentContainerView
        android:id="@+id/fragmentContainerView"
        android:name="com.example.fragments.First_Fragment_static.FirstFragment"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />
 w ana zedt faw2o button 3ashn ybayen ma3na edfet l fragment 3ala jez2 mn shshe mesh 3ala kol shshe
 fa hala2 mafroud bas sha8el tbyen l fragment bel manta2a le ta7t l button




 hala2 tare2a tenye wl aktar most3amale heye defa lal fragment bel code dynamic heye aktar tare2a most3mla b7es eno ana bade deef fragmnet 5elel action mo3yane bel run time ya3ne 5elel ma l application byen3mlo run l user byest3mlo ne7na mnzeed l fragmenet mesh static 2awl ma tblesh shshe :

 tab3an barmajeyan bel code lezm ytem edafet l fragment jowa viewGroup ya3ne aye item aye view mno3 viewgroup momken deef fe fragment ma  byenfa3 defo jowa button 2aw aye view 3ade

 hala2 3mlna ne7na fragment container w 3atyne id fragmentcontainer tab3an mostla7 container mna3te la aye she bye7tewe 3ala she b2albo bel 3ade l make le mnzeed fe l fragment 3ala shshe mnsame l maken le mndeef fe l fragment 3ala shshe container 2aw l 7ewye le badna nzeed fe l fragment   l2no mant2yan enta btet3ml bel code fa l code ma bya3ref ween bado yzeed l fragment lezm enta ta3te l 7aweye 2aw l maken le badak tzeed 2aw te72en fe l fragment w defna 2 button w7de esma fragment 2 3al sheml wa7de fragment 3 3al yamen lama ed8at 3ala l button l 2awl button 2 la7 zeed fragmnet mo3yane esma fragmnet 2 3ala shshe w lama ekbous 3ala fragment 3 btbyne fragmnet 3 3ala shshe

 3mlna 2 fragment 2,3
 hala2 bel xml ba3d ma 7atyna container fragmnet ma 7atyna name la 2elo l2no mesh static bas 7atyna id conatiner fragmnet
 hala2 ne7na 3mlna 2 button inflate bas

 hala2 bas ed8at 3ala l button 1:bade deef l fragmnet 1 bel container
 w bas ed8at 3ala button 2 :bade deef l fragmnet 2 bel container


 keef bade zeed fragmnet 3al container:
 2awl sha8le lezm tefhama 3an l fragmnet eno aye ta3amoul ma3 l fragmnet lezm tet3emal ma3 l manger taba3 l fragmnet fe 3ande class esmo Fragmnet manager
 FragamentManager:howe 3ebara 3an class l 2asese 2aw l moder taba3 ta3amoul ma3 l fragment bshakl 3am fe mola7aza moheme eno fe kaza class mn fragmnet manager btest3mel class le mawjoud bel androidx support library l2no fe kaza class fe wa7ad mawjoud bel android.app wa7ad mawjoud bel android x mnest3mel bel androidx l2no le mawjoud bel android.app heda depricated batalo yesta5domo ama l fragmetmanager bel androidx hala2 le bado yet3emal ma3 l fragmnet byet3emal ma3o l2no bel suuport library l2no mad3ome bshakl akbar w kel l applications le most3mal feha fragment tab layout navigationdrawer kola btet3emal ma3 supportlibrary  l androidx 7aleyan
 mna3mel object mn fragment manager: FragmentManager fm=
 fe 3ande method esma getsupportFragmentManager():w hay l method btjeblak l fragmnet manager le mawjoud bel maken le enta sha8al fe 2aw bel activity le enta sha8al feha :
 FragmentManager fm=getSupportFragmentManager():fa bhay l 7ale sar l variable les esmo fm bye7tewe 3ala l fragmnetmanager

 fe 3ande l 3amlyet le bade 2a3mlha 3ala l fragment btkoun demn she mnsameh transaction
 transaction:ma3neta 7arake 2aw 3mlye 2aw majmo3a mn l 3amlyet btseer ka patch ma3 ba3dha 2aw ka dof3a wa7de
 bel databse bshakl  3am fe 3ana mostala7 esmo transaction lama koun ana bade nafez majmo3a mn l 3amlyet ka dof3a wa7de ma3 ba3d bsameha transaction metl sho ya3ne  ana ma bade zeed maln row ela ba3d ma e7zef l 2adem fa ana ba3eml query bel databse masln eno ana bade e7zef l 3onsour le esmo x ba3da bade deef l 3onsour le esmo y fa ana bade l tnen yetnafazo ma3 ba3d ma bade wa7de tetnafaz w wa7de  la2 fa hawde bsamehoun transaction
 l fekra bta3amoul ma3 l fragment naf l fekra le 2olneha kont badak tnafez 3amlye wa7de 2aw majmo3a mn l 3amlyet bt7otoun demn transaction
 fa best3mel calsss esmo FragmentTransaction w heda mawjoud heda l class bel support library bsmae ft equll bel fragmentmanager fe method 3ande esma begintransaction  w hay btraj3le mo2sher 3ala l transaction le mawjoud bel getsupportFragammentmanager le ana bet3emal ma3o
 hala2 aye ta3amoul ma3 l 3amleyet sho bo2soud bel 3amleyet:3amleyet edafet fragmnet 3ala shshe ,3amlyet 7azf fragmnet mn shshe 3mlyet estebdel fragmnet b fragmnet tenye mn shshe fa l 3amlyet kola hay ba3mel mn l fragmenttransaction
 fa hala2 iza beje b2olo:
 fragmnettransaction .fe 3ande method:
 add():deef fragmnet
 repalce():estebdel fragment b fragmnnet tenye
 remove():be7zef fragmnet


 fahal2 bade deef fragmnet:
 ft.add():btest2bel 2awl sha8le l container le bade 7ot fe l fragmnet le esmo fragmnet container fa ba3te resource id R.id.container_fragment,parameter tene howe l fragmnet le enta badak tzeda 3ala heda l container ya fragmen2 ya fragmnet3 fa ba3mel mena object w bet3emal ma3a ya3ne fragment1 fragmnet=new fragmnet1(); w berslo ka tene parameter lal fragment

 hala2 enta fe3lyan iza kabst 3ala zer l fragmnet1 ma 7aydeef l fragmnet l2no enta sa7e7 7adadt l 3amlye eno add fragment w feek ta3mel ba3da kaza 3mlye metl ma badak bas lesa ma 2oltelo ynafeza la t2olo bt2olo fragmenttransaction.commit(); l commit bteshbah bele mawjoude bel sharedprefferance bel shared preferance lama kona badna nzeed aktar mn keme kona nz3mel nzeed l key w l value  w ba3d ma nzeed le badna yeh integer ,boolean..etc na3mel commit fa yrou7 koloun ynafezoun w houn nafs she jomlet l commit ft.commit() 7a trou7 tnazef l 3amlyet le heye 3amlye wa7ede l add fragmnet 1 3ala l container fragmnet

 bas hala2 yemken yeje belak eno mazel enta mnafez 3amlye wa7de mesh ajmo3et 3amlyet la sho l transaction howe fe3lyna l transaction mohaya2 yest2bel menak kaza 3amlye bas law badak ta3mel 3amlye wa7de mesh 2adeye ya3ne exmple law enta 3andak shshe 2awl she badak ta3melo badak tshel l fragmnet l ademe fa 2awl sha8le bta3mel ft.remove,berja3 ba3mel ft.add hawde l tnen fe3lyan bade yehoun yetnafazo ka 3amlye wa7de mesh eno ye7zef w ba3den yzeed sa7e7 houne 3amlyten laken bade yehoun ana lal user yezharo 3amleye wa7de 2aw bem3na tene  law l user kabas 3ala kabset l back yerja3 lal fragmnet l 2ademe be3tebara 3amlyey wa7de  ya3ne metl shshe le 3ande feha zeren bas ekbous 3ala l fragmnet1 bade e7zef l fragmnet l ademe w deef l fragment l jdede fe3lyan law rje3t da8t 3ala l zer l back le btetla3 mn l app hal mante2e yerja3 bas yfout 3al app yshel l edafet l fragmnet ba3den yraje3 l 7azf  la2 lezm 2awl ma erja3 mobasharatn yo3redlak l ademe fa badak yeh yet3emal mobsharatan ma3 haw l 3amlyten ka2no 3amlye wa7de 3ashen heek t3mlna ma3oun b mosama transaction ba3d shway la7 yetde7 heda she bas nest3ml she esmo addtobackstack

             FragmentManager fm=getSupportFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();
            SecondFragment secondFragment=new SecondFragment();
            ft.add(R.id.container_Fragmnet,secondFragment);
            ft.commit();

bade 7ot nafs l code lal btn 2 fragmnet 3
bade est3ml nafs l code bas l far2 hala2 na3ml objet mn fragmnet3:
            FragmentManager fm=getSupportFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();
            ThirdFragment thirdFragment=new ThirdFragment();
            ft.add(R.id.container_Fragmnet,thirdFragment);
            ft.commit();


hala2 bas 3mlnna run le sar:
bas kabsna fragmnet2 ejet l fragmnet bas rje3na 3mna dragmnet 3 ejet l fragment 3 faw2a lal 2 bas 2 ma n7azafet bas ana a7yenan ma bade 2a3ml l 3amlye hay ana bade rou7 shel l fragmnet l ademe w deef badela fragmnet jdeede bas eja alak l fragmnet le enta bdefa mn l xml ka static ma btet8ayar mn l code keef ya3ne lama teje ta3mel replace 2aw add ma byeje be8erlak l fragmnet l 2ademe le heye static ma be8yerlak l fragmnet l static l mawjoude bas bedef faw2a lal mawjoude hay l fekra mn ta3ref l xml fa 3ashen heek 7ekan abl shway eno la7 nshof ween l meshkle le 7a tezhar ma3na lama est3ml l fragment mn l  xml fa fe3lyan enta iza sta3mlt l fragmnet mn l xml ma bte2dar lama teje ta3mel replace mn l code ma bebadela bedal metl ma heye w b7ot l fragmnet l jdede faw2a
ya3ne hala2 enta 3andak wa7de static w 3ana tnen fragmnet wa7de feha button wa7de feha tezxt w sta3mlna replace
2awl mara bas kabsna 3ala fragment1 jeeb l button fa2 l static fragmnet hala2 bas kabsna fragmnet 2 badal l button bel text fa mnefham mn hal she eno fe3lyan 2awl sha8le l fragmnet le mawjoude by deffult ma 7ada bye2dar y8ayera
laken l fara2 ma3e lama 3mlt fragmnt2 bas add mesh replace daf l text faw2 l button ama lama 3mlna replace badal l button bel text ya3ne badal fragmnet 2 b fragmnet 1 ya3ne nefham  l fragmnet le maa3mole bel code mana static bte2dar ta3mela replace bas ma bte2dar ta3mel replace lal static fragmnet

bas iza sta3mlna <fragmnet> bel xml ma bt5lek ta3mel replace 2aw add bas bt5lek ta3mel delete te7zefa bel code ela lal fragmnet dynamic b fragmnet dynamic  ama iza sta3mlt fragmnet coantainer bel xml bt5lek tbadel l static fragmnet b fragmnet dynamic w bt5lek tbdel fragmnet dynamic b daynmic


bas l 7al tene heye tsat3ml framelayout ne7na 2olna lezm aye viewgroup mesh darore fragmnet mnesta3ml frame layout l2no heye bte7tewe bas 3ala 3onsour wa7ad w aye 3anser tene btzeda faw2a btetla3 stacked faw2 ba3d fa eza 7atna frame layout w mnshel name ma ela lezme batal fe fragmnet mawjoude by deffult sar kel ta3molna mn l code fa hala2 ia kabsna fragmnet x bteje le fragmnet 2 l2no ma fe fragmnet by deffult rja3 kbous fragmnet 3 bebdel l button be text

bas a7san wa7de ta3moul ma3a heye l fragment container


hala2 life cycle le saret :
ana kabst fragmnet1:
attach
create
createview
start
resume

rje3t kabst fragmnet 2
fragmnet 1:
on puase
on stop
on destroy view
on destroy
dettach

bterja3 l fragmnet 2
attach
create
createview
start
resume

sabab eno lesh fragmnet 1 destroy eno ma 7atyna bel back stack


iza btekbous 3ala l fragmnet 1 bterja3 fragmnet 2 bta3mel back byetla3 mn l application lesh l2no

sho sabab:
sabab eno fe method bel fragmnettransaction esma addtobackstack hay l method btesm7lk deef l 3amaleye ta3etak 2aw l transaction ta3etak kola sawe2 wa7de 2aw aktr 3mlye 2aw aktar tesma7lk defa 3ala l back stack
sho l back stack   : howe 3ebara 3an stack lal back ya3ne lama tetd8at 3ala zer taba3 l rojo3 l back l heye bdeef feha lal back stack 3anaser 2awl 3onour byod5ol e5er 3onsour byetla3 nafs fekret l activity kona nshof iza sha8lna activity w ro7na 3ala activity tenye w rj3na 3mlna back byerja3 3al activity le abla keef bya3ref l 7arake hay 5elel ma ydef l activity 3ala l stack nafs l fekra l fragmnet ela stack 5asa feha esma back stack bdeefa 3ala l 3amlyet feha fa addtobackstack() ma3neta defle l transaction kolo le enta 3mlto 3ala l back stack byotlob menak esm feek t7oto null 3ashen 3mlyet l edafe 3ando y5azena 3ashn bas 2a3ml back yerja3 la 2ela


heye fe3lyan btfout b stack ya3ne iza kabt fragmnet 2 ba3den fragment 3 fa badak tetla3 marten la tetla3 mn l application tetla3 mn stack
iza kabt fragmnet 2 ba3den fragmnet 3 ba3den fragmnet 2 ba3den fragmnt 3 fa badak tetla3 4 marat la tetla3 mn l application

w le bseer senario 1 (fragmnet 2 fragmnt 3):
fragmnt 1:
onattach
oncreate
onviewcreate
onstart
onresume

ba3den fragmnt 2:
fragmnet1:
onpause
onstop
ondestroyview

fragmnet2:
onattach
oncreate
onviewcreate
onstart
onresume

bas na3ml back:
fragmnet 2:
onpause
onstop
ondestroyview
on destroyfragmnt
ondetach

fraghmnt 1:
oncreateview
onstart
onresume

kabt mara tenye back

fragmnt1:
onpause
onstop
ondestroyview
on destroyfragmnt
ondetach


senario 2 (fragmnet1,fragmnt2,fragemnt1,fragmnt2):

fragmnt 1:
onattach
oncreate
onviewcreate
onstart
onresume

ba3den fragmnt 2:
fragmnet1:
onpause
onstop
ondestroyview

fragmnet2:
onattach
oncreate
onviewcreate
onstart
onresume

ba3den fragment1:
fragmnet2:
onpause
onstop
ondestroyview

fragmnt1:
onviewcreate
onstart
onresume

ba3den fragmnt2:
fragmnet1:
onpause
onstop
ondestroyview

fragmnt2:
onviewcreate
onstart
onresume

2awl mara ba3ml back ana b fragmnt2:
fragmnt2:
onpause
onstop
ondestroyview

fragmnt1:
onviewcreate
onstart
onresume

ana hala2 b fragmnt1:
fragment1:
onpause
onstop
ondestroyview

fragmnet2:
onviewcreate
onstart
onresume

ana hala2 b fragmnt2:
fragmnet2:
onpause
onstop
ondestroyview
ondestroy
ondeatch

fragmnet1:
onviewcreate
onstart
onresume

ana hala2 b fragmnet1:
fragmnet1:
onpause
onstop
ondestroyview
ondestroy
ondeatch

w tel3o kel l fragmnet mn l stack

w e5er she ba3ml back w betla3 mn l application



hala2 3ande kamen metl method btzeeed l fragmnt 3al shshe 3ande method betla3 l fragmnet mn shshe esma pop() bta3ml pop lal fragmnet mn l backstack howe berja3ak mn 3mleye kemle mn transaction kemle ya3ne law transaction keen feha add,removed replace fa howe bas ta3mel back berja3 mn hay l transaction le 3mlna feha removed,add,replace bhya tare2a transaction kemle


note :fragment momken tkoun jowa fragment



7a ne7ke 3a no2ta moheme bel fragmnet w heye l 2ases be fehm l fragmnet howe tawasoul been l 3anaser:

Fragment:heye 3onsour bekoun mawjoud bel activity
l activity be ba3d l a7yen bte7tej tetwasal ma3 l fragment ya3ne b 2e5er exmple ne7na shofne keen 3ana zeren bed8at 3ala zer bedef l fragmnet 3ala shshe hal l fragmnet hayde enta 2arsalt ela baynet mn l activity la2 ne7na bas defneha edafe  3ala shshe laken be 8aleb l applications enta bte7tej ta3mel tawasoul been l 3anaser keef ya3ne ya3ne beb3ad la7yen enta be7aje tersel data mn l activity 3ala l fragmnet keef bade erseloun ma houne b shshe wa7de ok houne b shshe wa7de
laken heda file most2el 3an heda l activity most2ele 3an l fragment heda 3onspur most2el 3an heda sa7 l fragmnet modafe 3a shshe bas heda bas 3onsour most2el 3an l activity barmajeyan bma3na tene l Activity object w l fragmnet object lezm terslo baynet lal fragmnet 2aw test2bel meno baynet fa byelzamak a7yenan 3amlyet tawasoul momken tkounn 3amlyet tawasoul wa7de mn haw l 3:
Activity--->Fragmnet:ema enak tersel data mn l activity lal fragmnet
Fragment--->Activity:ema tersel data mn l fragmnet lal Activity
Fragmnet--->Fragment:ema enak tersel data mn fragmnet la fragmnet le hye asln bel neheye mn activity la fragmnet 2aw mn fragmnet la activity


la7ed hala2 lisa ma fhemna eno keef ya3ne nersel data :
fe 3ande 3 Activity 3 shshet:

2awl shshe 2awl activity:

fe activity lawna asra2 w joweta fe recycle view majmo3a mn data majmo3a mn l asme2 t5ayal 3andak:

Activity feha mobashratan recyelview w ta7t l recyel view fe fragment mesh l fragmnt btendaf b2alb l activity l fragmnet hay feha textview ya3ne:
Activity{Recyelview lista feha asme2,Fragment{textview}}

Activity--->Fragment:hla2 lama ed8at 3ala aye 3onour bel recyeleview bade ersel l esm le mawjoud b recyel view 3ala l fragmnt w l fragmnt te3rdo b textview asln heek tatbe2 l rase2l byeshte8l enak btetd8at 3ala 3onour bas bel 3ard betkoun shshe btetd8at 3ala 3onsour berou7 byo3rdlak l nous l 5as bheda l 3onsour bel recyeler fe 3anser lama bade ed8at 3ala 3onsour bado yo3redle l nous le ana da8t 3lee b2alb textview mawjoud b fragmnet  fa hayde 3amlyet tawasoul 7a tem mn ween la ween faker feha bhay tare2a recycel view ween mawjoude mobashara jowa l activity w l 3onsour le badak terselo l data ween mawjoud mawjoud jowa fragmnet textview de5el fragmnet  ana bade ersel l data mn l activity hay l2no recycle view mawjoud de5el l activity la l fragmnet hay tare2t tawasoul l 2ola  heda le mn2osdo lama n2ol nersel data mn l activity lal fragmnet
Fragment--->Activity:nafs l fekra bas hala2 bel 3aks hala2 fe 3ande Activity joweta fragmnet jowa l fragmnet fe recycle view w ta7t hay l fragmnet le b2alba recyele view fe textview mawjoude de5el l activity mobasharatan fa ana hala2 lama bade ed8at 3ala 3osnour bel recyele view le mawjoud bel fragmnet bade e3rdo b textview mawjoud bel activity fa le sar ana recyeleview bel fragmnet ana b fragemnt lezm ersel l esm le mawjoud b recyel view la textview le howe mawjoud bel activity fa tare2t tawasoul heye mn fragmnet la activity
Fragment--->Fragment:fe 3ande activity b2alba 2 fragmnet ta7t ba3doun 2awl fragmnet feha recyel view feha asme2 w tene fragmnt le ta7ta fe b2alba textview fa ana bas ed8at 3ala 3onsour b recyele view mawjoud de5el fragemnt bade e3rdo b textview de5el fragemnt tene lama bade ed8at 3ala wa7de bade e3rdo b textview w recyel view mawjoud b fragemnt w textview mawjoud de5el fragemnt tene fa bade ersel data mn fragemnt l 2ola la fragemnt tenye fa 3mlyet tawasoul saret mn fragemnt la fragment tenye 7a nla7ez ba3d shway eno 3mlyet tawasoul mn fragmnet la fragmnet heye ma btem mobsharatan ka object orianted 8alat la7en btem l 3amlye eno arsel l baynet mn fragemnt lal activity wl activity terja3 terselha lal fragmnet feek terbota b databse metl 3eleat one to many w l many to many




la7 nblesh shar7 haw 3 toro2 w tatbe2oun:

fa badna ntabe2 2awal she Activity to Fragment
na3mel tasmem activity b2alba recycleview w fragment b2alba textview

*/










public class FirstFragment extends Fragment {



    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d("Fragment Life Cycle","OnAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Fragment Life Cycle","OnCreate");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d("Fragment Life Cycle","OnCreateView");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d("Fragment Life Cycle","OnViewCreated");


    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("Fragment Life Cycle","OnCreateCreated");


    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("Fragment Life Cycle","OnStartFragment");

    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("Fragment Life Cycle","OnResumeFragment");

    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("Fragment Life Cycle","OnPauseFragment");

    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("Fragment Life Cycle","OnStopFragment");

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("Fragment Life Cycle","OnDestroyView");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("Fragment Life Cycle","OnDestroyFragment");

    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("Fragment Life Cycle","OnDetachFragment");


    }


}