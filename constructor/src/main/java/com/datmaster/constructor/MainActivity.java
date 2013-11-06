package com.datmaster.constructor;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Toast;

//import java.lang.reflect.Field;
import java.util.ArrayList;
//import java.util.Vector;
import android.widget.AdapterView.OnItemSelectedListener;

public class MainActivity extends Activity {

    public  ArrayList<SpinnerModel> CustomListViewValuesArr = new ArrayList<SpinnerModel>();
    TextView output = null;
    CustomAdapter adapter;
    MainActivity activity = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }

        activity  = this;

        Spinner  mSpinner = (Spinner)findViewById(R.id.spinner);
        Spinner  mSpinner1 = (Spinner)findViewById(R.id.spinner2);
        Spinner  mSpinner2 = (Spinner)findViewById(R.id.spinner3);
        Spinner  mSpinner3 = (Spinner)findViewById(R.id.spinner4);
        Spinner  mSpinner4 = (Spinner)findViewById(R.id.spinner5);
        Spinner  mSpinner5 = (Spinner)findViewById(R.id.spinner6);
        Spinner  mSpinner6 = (Spinner)findViewById(R.id.spinner7);
        Spinner  mSpinner7 = (Spinner)findViewById(R.id.spinner8);
        Spinner  mSpinner8 = (Spinner)findViewById(R.id.spinner9);
        Spinner  mSpinner9 = (Spinner)findViewById(R.id.spinner10);
        Spinner  mSpinner10 = (Spinner)findViewById(R.id.spinner11);
        Spinner  mSpinner11 = (Spinner)findViewById(R.id.spinner12);

        Spinner  mSpinner12 = (Spinner)findViewById(R.id.spinner13);
        Spinner  mSpinner13 = (Spinner)findViewById(R.id.spinner14);
        Spinner  mSpinner14 = (Spinner)findViewById(R.id.spinner15);
        Spinner  mSpinner15 = (Spinner)findViewById(R.id.spinner16);
        Spinner  mSpinner16 = (Spinner)findViewById(R.id.spinner17);
        Spinner  mSpinner17 = (Spinner)findViewById(R.id.spinner18);
        Spinner  mSpinner18 = (Spinner)findViewById(R.id.spinner19);
        Spinner  mSpinner19 = (Spinner)findViewById(R.id.spinner20);
        Spinner  mSpinner20 = (Spinner)findViewById(R.id.spinner21);
        Spinner  mSpinner21 = (Spinner)findViewById(R.id.spinner22);

        Spinner  mSpinner22 = (Spinner)findViewById(R.id.spinner23);
        Spinner  mSpinner23 = (Spinner)findViewById(R.id.spinner24);
        Spinner  mSpinner24 = (Spinner)findViewById(R.id.spinner25);
        Spinner  mSpinner25 = (Spinner)findViewById(R.id.spinner26);
        Spinner  mSpinner26 = (Spinner)findViewById(R.id.spinner27);
        Spinner  mSpinner27 = (Spinner)findViewById(R.id.spinner28);
        Spinner  mSpinner28 = (Spinner)findViewById(R.id.spinner29);
        Spinner  mSpinner29 = (Spinner)findViewById(R.id.spinner30);
        Spinner  mSpinner30 = (Spinner)findViewById(R.id.spinner31);

        Spinner  mSpinner31 = (Spinner)findViewById(R.id.spinner32);
        Spinner  mSpinner32 = (Spinner)findViewById(R.id.spinner33);
        Spinner  mSpinner33 = (Spinner)findViewById(R.id.spinner34);
        Spinner  mSpinner34 = (Spinner)findViewById(R.id.spinner35);
        Spinner  mSpinner35 = (Spinner)findViewById(R.id.spinner36);

        Spinner  mSpinner36 = (Spinner)findViewById(R.id.spinner37);
        Spinner  mSpinner37 = (Spinner)findViewById(R.id.spinner38);
        Spinner  mSpinner38 = (Spinner)findViewById(R.id.spinner39);
        Spinner  mSpinner39 = (Spinner)findViewById(R.id.spinner40);
        Spinner  mSpinner40 = (Spinner)findViewById(R.id.spinner41);
        Spinner  mSpinner41 = (Spinner)findViewById(R.id.spinner42);
        Spinner  mSpinner42 = (Spinner)findViewById(R.id.spinner43);
        Spinner  mSpinner43 = (Spinner)findViewById(R.id.spinner44);
        Spinner  mSpinner44 = (Spinner)findViewById(R.id.spinner45);
        Spinner  mSpinner45 = (Spinner)findViewById(R.id.spinner46);

        Spinner  mSpinner46 = (Spinner)findViewById(R.id.spinner47);
        Spinner  mSpinner47 = (Spinner)findViewById(R.id.spinner48);
        Spinner  mSpinner48 = (Spinner)findViewById(R.id.spinner49);
        Spinner  mSpinner49 = (Spinner)findViewById(R.id.spinner50);
        Spinner  mSpinner50 = (Spinner)findViewById(R.id.spinner51);
        Spinner  mSpinner51 = (Spinner)findViewById(R.id.spinner52);
        Spinner  mSpinner52 = (Spinner)findViewById(R.id.spinner53);
        Spinner  mSpinner53 = (Spinner)findViewById(R.id.spinner54);
        Spinner  mSpinner54 = (Spinner)findViewById(R.id.spinner55);

        Spinner  mSpinner55 = (Spinner)findViewById(R.id.spinner56);
        Spinner  mSpinner56 = (Spinner)findViewById(R.id.spinner57);
        Spinner  mSpinner57 = (Spinner)findViewById(R.id.spinner58);
        Spinner  mSpinner58 = (Spinner)findViewById(R.id.spinner59);
        Spinner  mSpinner59 = (Spinner)findViewById(R.id.spinner60);

        Spinner  mSpinner60 = (Spinner)findViewById(R.id.spinner61);
        Spinner  mSpinner61 = (Spinner)findViewById(R.id.spinner62);
        Spinner  mSpinner62 = (Spinner)findViewById(R.id.spinner63);
        Spinner  mSpinner63 = (Spinner)findViewById(R.id.spinner64);
        Spinner  mSpinner64 = (Spinner)findViewById(R.id.spinner65);
        Spinner  mSpinner65 = (Spinner)findViewById(R.id.spinner66);
        Spinner  mSpinner66 = (Spinner)findViewById(R.id.spinner67);
        Spinner  mSpinner67 = (Spinner)findViewById(R.id.spinner68);
        Spinner  mSpinner68 = (Spinner)findViewById(R.id.spinner69);
        Spinner  mSpinner69 = (Spinner)findViewById(R.id.spinner70);

        Spinner  mSpinner70 = (Spinner)findViewById(R.id.spinner71);
        Spinner  mSpinner71 = (Spinner)findViewById(R.id.spinner72);
        Spinner  mSpinner72 = (Spinner)findViewById(R.id.spinner73);
        Spinner  mSpinner73 = (Spinner)findViewById(R.id.spinner74);
        Spinner  mSpinner74 = (Spinner)findViewById(R.id.spinner75);
        Spinner  mSpinner75 = (Spinner)findViewById(R.id.spinner76);
        Spinner  mSpinner76 = (Spinner)findViewById(R.id.spinner77);
        Spinner  mSpinner77 = (Spinner)findViewById(R.id.spinner78);
        Spinner  mSpinner78 = (Spinner)findViewById(R.id.spinner79);

        Spinner  mSpinner79 = (Spinner)findViewById(R.id.spinner80);
        Spinner  mSpinner80 = (Spinner)findViewById(R.id.spinner81);
        Spinner  mSpinner81 = (Spinner)findViewById(R.id.spinner82);
        Spinner  mSpinner82 = (Spinner)findViewById(R.id.spinner83);
        Spinner  mSpinner83 = (Spinner)findViewById(R.id.spinner84);

        Spinner  mSpinner84 = (Spinner)findViewById(R.id.spinner85);
        Spinner  mSpinner85 = (Spinner)findViewById(R.id.spinner86);
        Spinner  mSpinner86 = (Spinner)findViewById(R.id.spinner87);
        Spinner  mSpinner87 = (Spinner)findViewById(R.id.spinner88);
        Spinner  mSpinner88 = (Spinner)findViewById(R.id.spinner89);
        Spinner  mSpinner89 = (Spinner)findViewById(R.id.spinner90);
        Spinner  mSpinner90 = (Spinner)findViewById(R.id.spinner91);
        Spinner  mSpinner91 = (Spinner)findViewById(R.id.spinner92);
        Spinner  mSpinner92 = (Spinner)findViewById(R.id.spinner93);
        Spinner  mSpinner93 = (Spinner)findViewById(R.id.spinner94);

        Spinner  mSpinner94 = (Spinner)findViewById(R.id.spinner95);

        Spinner  mSpinner95 = (Spinner)findViewById(R.id.spinner96);
        Spinner  mSpinner96 = (Spinner)findViewById(R.id.spinner97);
        Spinner  mSpinner97 = (Spinner)findViewById(R.id.spinner98);
        Spinner  mSpinner98 = (Spinner)findViewById(R.id.spinner99);
        Spinner  mSpinner99 = (Spinner)findViewById(R.id.spinner100);
        Spinner  mSpinner100 = (Spinner)findViewById(R.id.spinner101);
        Spinner  mSpinner101 = (Spinner)findViewById(R.id.spinner102);
        Spinner  mSpinner102 = (Spinner)findViewById(R.id.spinner103);
        Spinner  mSpinner103 = (Spinner)findViewById(R.id.spinner104);
        Spinner  mSpinner104 = (Spinner)findViewById(R.id.spinner105);
        Spinner  mSpinner105 = (Spinner)findViewById(R.id.spinner106);
        Spinner  mSpinner106 = (Spinner)findViewById(R.id.spinner107);
        Spinner  mSpinner107 = (Spinner)findViewById(R.id.spinner108);
        Spinner  mSpinner108 = (Spinner)findViewById(R.id.spinner109);
        Spinner  mSpinner109 = (Spinner)findViewById(R.id.spinner110);
        Spinner  mSpinner110 = (Spinner)findViewById(R.id.spinner111);
        Spinner  mSpinner111 = (Spinner)findViewById(R.id.spinner112);
        Spinner  mSpinner112 = (Spinner)findViewById(R.id.spinner113);
        Spinner  mSpinner113 = (Spinner)findViewById(R.id.spinner114);
        Spinner  mSpinner114 = (Spinner)findViewById(R.id.spinner115);
        Spinner  mSpinner115 = (Spinner)findViewById(R.id.spinner116);
        Spinner  mSpinner116 = (Spinner)findViewById(R.id.spinner117);
        Spinner  mSpinner117 = (Spinner)findViewById(R.id.spinner118);
        Spinner  mSpinner118 = (Spinner)findViewById(R.id.spinner119);
        Spinner  mSpinner119 = (Spinner)findViewById(R.id.spinner120);
        Spinner  mSpinner120 = (Spinner)findViewById(R.id.spinner121);
        Spinner  mSpinner121 = (Spinner)findViewById(R.id.spinner122);
        Spinner  mSpinner122 = (Spinner)findViewById(R.id.spinner123);
        Spinner  mSpinner123 = (Spinner)findViewById(R.id.spinner124);
        Spinner  mSpinner124 = (Spinner)findViewById(R.id.spinner125);
        Spinner  mSpinner125 = (Spinner)findViewById(R.id.spinner126);
        Spinner  mSpinner126 = (Spinner)findViewById(R.id.spinner127);
        Spinner  mSpinner127 = (Spinner)findViewById(R.id.spinner128);
        Spinner  mSpinner128 = (Spinner)findViewById(R.id.spinner129);
        Spinner  mSpinner129 = (Spinner)findViewById(R.id.spinner130);
        Spinner  mSpinner130 = (Spinner)findViewById(R.id.spinner131);
        Spinner  mSpinner131 = (Spinner)findViewById(R.id.spinner132);
        Spinner  mSpinner132 = (Spinner)findViewById(R.id.spinner133);
        Spinner  mSpinner133 = (Spinner)findViewById(R.id.spinner134);
        Spinner  mSpinner134 = (Spinner)findViewById(R.id.spinner135);
        Spinner  mSpinner135 = (Spinner)findViewById(R.id.spinner136);
        Spinner  mSpinner136 = (Spinner)findViewById(R.id.spinner137);
        Spinner  mSpinner137 = (Spinner)findViewById(R.id.spinner138);
        Spinner  mSpinner138 = (Spinner)findViewById(R.id.spinner139);
        Spinner  mSpinner139 = (Spinner)findViewById(R.id.spinner140);
        Spinner  mSpinner140 = (Spinner)findViewById(R.id.spinner141);
        Spinner  mSpinner141 = (Spinner)findViewById(R.id.spinner142);
        Spinner  mSpinner142 = (Spinner)findViewById(R.id.spinner143);
        Spinner  mSpinner143 = (Spinner)findViewById(R.id.spinner144);
        Spinner  mSpinner144 = (Spinner)findViewById(R.id.spinner145);
        Spinner  mSpinner145 = (Spinner)findViewById(R.id.spinner146);
        Spinner  mSpinner146 = (Spinner)findViewById(R.id.spinner147);
        Spinner  mSpinner147 = (Spinner)findViewById(R.id.spinner148);
        Spinner  mSpinner148 = (Spinner)findViewById(R.id.spinner149);
        Spinner  mSpinner149 = (Spinner)findViewById(R.id.spinner150);
        Spinner  mSpinner150 = (Spinner)findViewById(R.id.spinner151);
        Spinner  mSpinner151 = (Spinner)findViewById(R.id.spinner152);
        Spinner  mSpinner152 = (Spinner)findViewById(R.id.spinner153);
        Spinner  mSpinner153 = (Spinner)findViewById(R.id.spinner154);
        Spinner  mSpinner154 = (Spinner)findViewById(R.id.spinner155);
        Spinner  mSpinner155 = (Spinner)findViewById(R.id.spinner156);
        Spinner  mSpinner156 = (Spinner)findViewById(R.id.spinner157);
        Spinner  mSpinner157 = (Spinner)findViewById(R.id.spinner158);
        Spinner  mSpinner158 = (Spinner)findViewById(R.id.spinner159);
        Spinner  mSpinner159 = (Spinner)findViewById(R.id.spinner160);
        Spinner  mSpinner160 = (Spinner)findViewById(R.id.spinner161);
        Spinner  mSpinner161 = (Spinner)findViewById(R.id.spinner162);
        Spinner  mSpinner162 = (Spinner)findViewById(R.id.spinner163);
        Spinner  mSpinner163 = (Spinner)findViewById(R.id.spinner164);
        Spinner  mSpinner164 = (Spinner)findViewById(R.id.spinner165);
        Spinner  mSpinner165 = (Spinner)findViewById(R.id.spinner166);
        Spinner  mSpinner166 = (Spinner)findViewById(R.id.spinner167);
        Spinner  mSpinner167 = (Spinner)findViewById(R.id.spinner168);
        Spinner  mSpinner168 = (Spinner)findViewById(R.id.spinner169);
        Spinner  mSpinner169 = (Spinner)findViewById(R.id.spinner170);
        Spinner  mSpinner170 = (Spinner)findViewById(R.id.spinner171);
        Spinner  mSpinner171 = (Spinner)findViewById(R.id.spinner172);
        Spinner  mSpinner172 = (Spinner)findViewById(R.id.spinner173);
        Spinner  mSpinner173 = (Spinner)findViewById(R.id.spinner174);
        Spinner  mSpinner174 = (Spinner)findViewById(R.id.spinner175);
        Spinner  mSpinner175 = (Spinner)findViewById(R.id.spinner176);
        Spinner  mSpinner176 = (Spinner)findViewById(R.id.spinner177);
        Spinner  mSpinner177 = (Spinner)findViewById(R.id.spinner178);
        Spinner  mSpinner178 = (Spinner)findViewById(R.id.spinner179);
        Spinner  mSpinner179 = (Spinner)findViewById(R.id.spinner180);
        Spinner  mSpinner180 = (Spinner)findViewById(R.id.spinner181);
        Spinner  mSpinner181 = (Spinner)findViewById(R.id.spinner182);
        Spinner  mSpinner182 = (Spinner)findViewById(R.id.spinner183);
        Spinner  mSpinner183 = (Spinner)findViewById(R.id.spinner184);
        Spinner  mSpinner184 = (Spinner)findViewById(R.id.spinner185);
        Spinner  mSpinner185 = (Spinner)findViewById(R.id.spinner186);
        Spinner  mSpinner186 = (Spinner)findViewById(R.id.spinner187);
        Spinner  mSpinner187 = (Spinner)findViewById(R.id.spinner188);
        Spinner  mSpinner188 = (Spinner)findViewById(R.id.spinner189);
        Spinner  mSpinner189 = (Spinner)findViewById(R.id.spinner190);
        Spinner  mSpinner190 = (Spinner)findViewById(R.id.spinner191);
        Spinner  mSpinner191 = (Spinner)findViewById(R.id.spinner192);
        Spinner  mSpinner192 = (Spinner)findViewById(R.id.spinner193);
        Spinner  mSpinner193 = (Spinner)findViewById(R.id.spinner194);
        Spinner  mSpinner194 = (Spinner)findViewById(R.id.spinner195);
        Spinner  mSpinner195 = (Spinner)findViewById(R.id.spinner196);
        Spinner  mSpinner196 = (Spinner)findViewById(R.id.spinner197);
        Spinner  mSpinner197 = (Spinner)findViewById(R.id.spinner198);
        Spinner  mSpinner198 = (Spinner)findViewById(R.id.spinner199);
        Spinner  mSpinner199 = (Spinner)findViewById(R.id.spinner200);
        Spinner  mSpinner200 = (Spinner)findViewById(R.id.spinner201);
        Spinner  mSpinner201 = (Spinner)findViewById(R.id.spinner202);
        Spinner  mSpinner202 = (Spinner)findViewById(R.id.spinner203);
        Spinner  mSpinner203 = (Spinner)findViewById(R.id.spinner204);
        Spinner  mSpinner204 = (Spinner)findViewById(R.id.spinner205);
        Spinner  mSpinner205 = (Spinner)findViewById(R.id.spinner206);
        Spinner  mSpinner206 = (Spinner)findViewById(R.id.spinner207);
        Spinner  mSpinner207 = (Spinner)findViewById(R.id.spinner208);
        Spinner  mSpinner208 = (Spinner)findViewById(R.id.spinner209);
        Spinner  mSpinner209 = (Spinner)findViewById(R.id.spinner210);
        Spinner  mSpinner210 = (Spinner)findViewById(R.id.spinner211);
        Spinner  mSpinner211 = (Spinner)findViewById(R.id.spinner212);
        Spinner  mSpinner212 = (Spinner)findViewById(R.id.spinner213);
        Spinner  mSpinner213 = (Spinner)findViewById(R.id.spinner214);
        Spinner  mSpinner214 = (Spinner)findViewById(R.id.spinner215);
        Spinner  mSpinner215 = (Spinner)findViewById(R.id.spinner216);
        Spinner  mSpinner216 = (Spinner)findViewById(R.id.spinner217);
        Spinner  mSpinner217 = (Spinner)findViewById(R.id.spinner218);
        Spinner  mSpinner218 = (Spinner)findViewById(R.id.spinner219);
        Spinner  mSpinner219 = (Spinner)findViewById(R.id.spinner220);
        Spinner  mSpinner220 = (Spinner)findViewById(R.id.spinner221);
        Spinner  mSpinner221 = (Spinner)findViewById(R.id.spinner222);
        Spinner  mSpinner222 = (Spinner)findViewById(R.id.spinner223);
        Spinner  mSpinner223 = (Spinner)findViewById(R.id.spinner224);
        Spinner  mSpinner224 = (Spinner)findViewById(R.id.spinner225);
        Spinner  mSpinner225 = (Spinner)findViewById(R.id.spinner226);
        Spinner  mSpinner226 = (Spinner)findViewById(R.id.spinner227);
        Spinner  mSpinner227 = (Spinner)findViewById(R.id.spinner228);

//        output         = (TextView)findViewById(R.id.output);

        setListData();

        Resources res = getResources();
        adapter = new CustomAdapter(activity, R.layout.spinner_rows, CustomListViewValuesArr,res);
        mSpinner.setAdapter(adapter);
        mSpinner1.setAdapter(adapter);
        mSpinner2.setAdapter(adapter);
        mSpinner3.setAdapter(adapter);
        mSpinner4.setAdapter(adapter);
        mSpinner5.setAdapter(adapter);
        mSpinner6.setAdapter(adapter);
        mSpinner7.setAdapter(adapter);
        mSpinner8.setAdapter(adapter);
        mSpinner9.setAdapter(adapter);
        mSpinner10.setAdapter(adapter);
        mSpinner11.setAdapter(adapter);

        mSpinner12.setAdapter(adapter);
        mSpinner13.setAdapter(adapter);
        mSpinner14.setAdapter(adapter);
        mSpinner15.setAdapter(adapter);
        mSpinner16.setAdapter(adapter);
        mSpinner17.setAdapter(adapter);
        mSpinner18.setAdapter(adapter);
        mSpinner19.setAdapter(adapter);
        mSpinner20.setAdapter(adapter);

        mSpinner21.setAdapter(adapter);
        mSpinner22.setAdapter(adapter);
        mSpinner23.setAdapter(adapter);
        mSpinner24.setAdapter(adapter);
        mSpinner25.setAdapter(adapter);
        mSpinner26.setAdapter(adapter);
        mSpinner27.setAdapter(adapter);
        mSpinner28.setAdapter(adapter);
        mSpinner29.setAdapter(adapter);
        mSpinner30.setAdapter(adapter);

        mSpinner31.setAdapter(adapter);
        mSpinner32.setAdapter(adapter);
        mSpinner33.setAdapter(adapter);
        mSpinner34.setAdapter(adapter);
        mSpinner35.setAdapter(adapter);
        mSpinner36.setAdapter(adapter);
        mSpinner37.setAdapter(adapter);
        mSpinner38.setAdapter(adapter);
        mSpinner39.setAdapter(adapter);

        mSpinner40.setAdapter(adapter);
        mSpinner41.setAdapter(adapter);
        mSpinner42.setAdapter(adapter);
        mSpinner43.setAdapter(adapter);
        mSpinner44.setAdapter(adapter);
        mSpinner45.setAdapter(adapter);
        mSpinner46.setAdapter(adapter);
        mSpinner47.setAdapter(adapter);
        mSpinner48.setAdapter(adapter);
        mSpinner49.setAdapter(adapter);

        mSpinner50.setAdapter(adapter);
        mSpinner51.setAdapter(adapter);
        mSpinner52.setAdapter(adapter);
        mSpinner53.setAdapter(adapter);
        mSpinner54.setAdapter(adapter);
        mSpinner55.setAdapter(adapter);
        mSpinner56.setAdapter(adapter);
        mSpinner57.setAdapter(adapter);
        mSpinner58.setAdapter(adapter);
        mSpinner59.setAdapter(adapter);

        mSpinner60.setAdapter(adapter);
        mSpinner61.setAdapter(adapter);
        mSpinner62.setAdapter(adapter);
        mSpinner63.setAdapter(adapter);
        mSpinner64.setAdapter(adapter);
        mSpinner65.setAdapter(adapter);
        mSpinner66.setAdapter(adapter);
        mSpinner67.setAdapter(adapter);
        mSpinner68.setAdapter(adapter);
        mSpinner69.setAdapter(adapter);

        mSpinner70.setAdapter(adapter);
        mSpinner71.setAdapter(adapter);
        mSpinner72.setAdapter(adapter);
        mSpinner73.setAdapter(adapter);
        mSpinner74.setAdapter(adapter);
        mSpinner75.setAdapter(adapter);
        mSpinner76.setAdapter(adapter);
        mSpinner77.setAdapter(adapter);
        mSpinner78.setAdapter(adapter);
        mSpinner79.setAdapter(adapter);

        mSpinner80.setAdapter(adapter);
        mSpinner81.setAdapter(adapter);
        mSpinner82.setAdapter(adapter);
        mSpinner83.setAdapter(adapter);
        mSpinner84.setAdapter(adapter);
        mSpinner85.setAdapter(adapter);
        mSpinner86.setAdapter(adapter);
        mSpinner87.setAdapter(adapter);
        mSpinner88.setAdapter(adapter);
        mSpinner89.setAdapter(adapter);

        mSpinner90.setAdapter(adapter);
        mSpinner91.setAdapter(adapter);
        mSpinner92.setAdapter(adapter);
        mSpinner93.setAdapter(adapter);
        mSpinner94.setAdapter(adapter);
        mSpinner95.setAdapter(adapter);
        mSpinner96.setAdapter(adapter);
        mSpinner97.setAdapter(adapter);
        mSpinner98.setAdapter(adapter);
        mSpinner99.setAdapter(adapter);
        mSpinner100.setAdapter(adapter);
        mSpinner101.setAdapter(adapter);
        mSpinner102.setAdapter(adapter);
        mSpinner103.setAdapter(adapter);
        mSpinner104.setAdapter(adapter);
        mSpinner105.setAdapter(adapter);
        mSpinner106.setAdapter(adapter);
        mSpinner107.setAdapter(adapter);
        mSpinner108.setAdapter(adapter);
        mSpinner109.setAdapter(adapter);
        mSpinner110.setAdapter(adapter);
        mSpinner111.setAdapter(adapter);
        mSpinner112.setAdapter(adapter);
        mSpinner113.setAdapter(adapter);
        mSpinner114.setAdapter(adapter);
        mSpinner115.setAdapter(adapter);
        mSpinner116.setAdapter(adapter);
        mSpinner117.setAdapter(adapter);
        mSpinner118.setAdapter(adapter);
        mSpinner119.setAdapter(adapter);
        mSpinner120.setAdapter(adapter);
        mSpinner121.setAdapter(adapter);
        mSpinner122.setAdapter(adapter);
        mSpinner123.setAdapter(adapter);
        mSpinner124.setAdapter(adapter);
        mSpinner125.setAdapter(adapter);
        mSpinner126.setAdapter(adapter);
        mSpinner127.setAdapter(adapter);
        mSpinner128.setAdapter(adapter);
        mSpinner129.setAdapter(adapter);
        mSpinner130.setAdapter(adapter);
        mSpinner131.setAdapter(adapter);
        mSpinner132.setAdapter(adapter);
        mSpinner133.setAdapter(adapter);
        mSpinner134.setAdapter(adapter);
        mSpinner135.setAdapter(adapter);
        mSpinner136.setAdapter(adapter);
        mSpinner137.setAdapter(adapter);
        mSpinner138.setAdapter(adapter);
        mSpinner139.setAdapter(adapter);
        mSpinner140.setAdapter(adapter);
        mSpinner141.setAdapter(adapter);
        mSpinner142.setAdapter(adapter);
        mSpinner143.setAdapter(adapter);
        mSpinner144.setAdapter(adapter);
        mSpinner145.setAdapter(adapter);
        mSpinner146.setAdapter(adapter);
        mSpinner147.setAdapter(adapter);
        mSpinner148.setAdapter(adapter);
        mSpinner149.setAdapter(adapter);
        mSpinner150.setAdapter(adapter);
        mSpinner151.setAdapter(adapter);
        mSpinner152.setAdapter(adapter);
        mSpinner153.setAdapter(adapter);
        mSpinner154.setAdapter(adapter);
        mSpinner155.setAdapter(adapter);
        mSpinner156.setAdapter(adapter);
        mSpinner157.setAdapter(adapter);
        mSpinner158.setAdapter(adapter);
        mSpinner159.setAdapter(adapter);
        mSpinner160.setAdapter(adapter);
        mSpinner161.setAdapter(adapter);
        mSpinner162.setAdapter(adapter);
        mSpinner163.setAdapter(adapter);
        mSpinner164.setAdapter(adapter);
        mSpinner165.setAdapter(adapter);
        mSpinner166.setAdapter(adapter);
        mSpinner167.setAdapter(adapter);
        mSpinner168.setAdapter(adapter);
        mSpinner169.setAdapter(adapter);
        mSpinner170.setAdapter(adapter);
        mSpinner171.setAdapter(adapter);
        mSpinner172.setAdapter(adapter);
        mSpinner173.setAdapter(adapter);
        mSpinner174.setAdapter(adapter);
        mSpinner175.setAdapter(adapter);
        mSpinner176.setAdapter(adapter);
        mSpinner177.setAdapter(adapter);
        mSpinner178.setAdapter(adapter);
        mSpinner179.setAdapter(adapter);
        mSpinner180.setAdapter(adapter);
        mSpinner181.setAdapter(adapter);
        mSpinner182.setAdapter(adapter);
        mSpinner183.setAdapter(adapter);
        mSpinner184.setAdapter(adapter);
        mSpinner185.setAdapter(adapter);
        mSpinner186.setAdapter(adapter);
        mSpinner187.setAdapter(adapter);
        mSpinner188.setAdapter(adapter);
        mSpinner189.setAdapter(adapter);
        mSpinner190.setAdapter(adapter);
        mSpinner191.setAdapter(adapter);
        mSpinner192.setAdapter(adapter);
        mSpinner193.setAdapter(adapter);
        mSpinner194.setAdapter(adapter);
        mSpinner195.setAdapter(adapter);
        mSpinner196.setAdapter(adapter);
        mSpinner197.setAdapter(adapter);
        mSpinner198.setAdapter(adapter);
        mSpinner199.setAdapter(adapter);
        mSpinner200.setAdapter(adapter);
        mSpinner201.setAdapter(adapter);
        mSpinner202.setAdapter(adapter);
        mSpinner203.setAdapter(adapter);
        mSpinner204.setAdapter(adapter);
        mSpinner205.setAdapter(adapter);
        mSpinner206.setAdapter(adapter);
        mSpinner207.setAdapter(adapter);
        mSpinner208.setAdapter(adapter);
        mSpinner209.setAdapter(adapter);
        mSpinner210.setAdapter(adapter);
        mSpinner211.setAdapter(adapter);
        mSpinner212.setAdapter(adapter);
        mSpinner213.setAdapter(adapter);
        mSpinner214.setAdapter(adapter);
        mSpinner215.setAdapter(adapter);
        mSpinner216.setAdapter(adapter);
        mSpinner217.setAdapter(adapter);
        mSpinner218.setAdapter(adapter);
        mSpinner219.setAdapter(adapter);
        mSpinner220.setAdapter(adapter);
        mSpinner221.setAdapter(adapter);
        mSpinner222.setAdapter(adapter);
        mSpinner223.setAdapter(adapter);
        mSpinner224.setAdapter(adapter);
        mSpinner225.setAdapter(adapter);
        mSpinner226.setAdapter(adapter);
        mSpinner227.setAdapter(adapter);


        mSpinner.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View v, int position, long id) {
                // your code here

//                String Company = ((TextView) v.findViewById(R.id.company)).getText().toString();
//                String CompanyUrl = ((TextView) v.findViewById(R.id.sub)).getText().toString();

//                String OutputMsg = "Selected Company : ";//+Company+"\n"+CompanyUrl;
//                output.setText(OutputMsg);

//                Toast.makeText(
//                        getApplicationContext(), OutputMsg, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });

    }

    public void setListData()
    {
        for (int i = 0; i <= 18; i++) {

            final SpinnerModel sched = new SpinnerModel();

//            sched.setItemDescription("Елемент " + i);
            sched.setImage("im" + i);

            CustomListViewValuesArr.add(sched);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {
            case R.id.action_settings:
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }

}