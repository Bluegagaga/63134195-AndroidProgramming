package huy.hdn.ck_63134195;

import android.app.AlertDialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.DateFormat;
import java.util.Date;

import huy.hdn.ck_63134195.model.Data;


public class DashboardFragment extends Fragment {

    FloatingActionButton fab_main, fab_in, fab_ex;
    TextView in_ft, ex_ft;
    boolean Isopem=false;
    EditText edt_tien, edt_loai, edt_nd;
    Button btn_luu, btn_thoat;
    Animation FaO,FaC;
    FirebaseAuth auth;
    FirebaseUser user;
    DatabaseReference in_database, ex_database;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_dashboard, container, false);

        auth = FirebaseAuth.getInstance();
        user = auth.getCurrentUser();
        String uid = user.getUid();
        in_database = FirebaseDatabase.getInstance().getReference().child("Thu").child(uid);
        ex_database = FirebaseDatabase.getInstance().getReference().child("Chi").child(uid);


        //findID
        fab_main = view.findViewById(R.id.fb_main_plus_btn);
        fab_in = view.findViewById(R.id.income_ft_btn);
        fab_ex = view.findViewById(R.id.expense_ft_btn);
        in_ft = view.findViewById(R.id.income_ft);
        ex_ft = view.findViewById(R.id.expense_ft);

        //Connect Animation
        FaO = AnimationUtils.loadAnimation(getActivity(),R.anim.fadeopen);
        FaC = AnimationUtils.loadAnimation(getActivity(),R.anim.fadeclose);

        //Click main button
        fab_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Isopem){
                    fab_in.startAnimation(FaC);
                    fab_ex.startAnimation(FaC);
                    in_ft.startAnimation(FaC);
                    ex_ft.startAnimation(FaC);
                    fab_in.setClickable(false);
                    fab_ex.setClickable(false);
                    in_ft.setClickable(false);
                    ex_ft.setClickable(false);
                    Isopem=false;

                }
                else {
                    fab_in.startAnimation(FaO);
                    fab_ex.startAnimation(FaO);
                    in_ft.startAnimation(FaO);
                    ex_ft.startAnimation(FaO);
                    fab_in.setClickable(true);
                    fab_ex.setClickable(true);
                    in_ft.setClickable(true);
                    ex_ft.setClickable(true);
                    Isopem=true;


                }

            }
        });

        fab_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InsertDataIn();

            }
        });

        fab_ex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InsertDataEx();

            }
        });


        return view;
    }

    private void InsertDataIn(){

                AlertDialog.Builder dialog = new AlertDialog.Builder(getActivity());
                LayoutInflater inflater = LayoutInflater.from(getActivity());
                View v = inflater.inflate(R.layout.insert_data, null);
                dialog.setView(v);
                AlertDialog dialogg = dialog.create();

                edt_tien = v.findViewById(R.id.edt_tien);
                edt_loai = v.findViewById(R.id.edt_loai);
                edt_nd = v.findViewById(R.id.edt_nd);
                btn_luu = v.findViewById(R.id.btn_OK);
                btn_thoat = v.findViewById(R.id.btn_thoat);

                btn_luu.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String loai = edt_loai.getText().toString().trim();
                        String tien = edt_tien.getText().toString().trim();
                        String nd = edt_nd.getText().toString().trim();

                        if(TextUtils.isEmpty(tien)){
                            edt_tien.setError("Khong duoc de trong!");
                            return;
                        }

                        if(TextUtils.isEmpty(loai)){
                            edt_loai.setError("Khong duoc de trong!");
                            return;
                        }

                        int tien_int = Integer.parseInt(tien);

                        if(TextUtils.isEmpty(nd)){
                            edt_nd.setError("Khong duoc de trong!");
                            return;
                        }



                            String id = in_database.push().getKey();
                            String date = DateFormat.getDateInstance().format(new Date());
                            Data data = new Data(tien_int, loai, nd, id, date);
                            in_database.child(id).setValue(data);
                            Toast.makeText(getActivity(), "Data added", Toast.LENGTH_SHORT).show();
                            dialogg.dismiss();

                    }
                });

                btn_thoat.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialogg.dismiss();

                    }
                });
                dialogg.show();


    }

    private void InsertDataEx(){

        AlertDialog.Builder dialog = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = LayoutInflater.from(getActivity());
        View v = inflater.inflate(R.layout.insert_data, null);
        dialog.setView(v);
        AlertDialog dialogg = dialog.create();

        edt_tien = v.findViewById(R.id.edt_tien);
        edt_loai = v.findViewById(R.id.edt_loai);
        edt_nd = v.findViewById(R.id.edt_nd);
        btn_luu = v.findViewById(R.id.btn_OK);
        btn_thoat = v.findViewById(R.id.btn_thoat);

        btn_luu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String loai = edt_loai.getText().toString().trim();
                String tien = edt_tien.getText().toString().trim();
                String nd = edt_nd.getText().toString().trim();

                if(TextUtils.isEmpty(tien)){
                    edt_tien.setError("Khong duoc de trong!");
                    return;
                }

                if(TextUtils.isEmpty(loai)){
                    edt_loai.setError("Khong duoc de trong!");
                    return;
                }

                int tien_int = Integer.parseInt(tien);

                if(TextUtils.isEmpty(nd)){
                    edt_nd.setError("Khong duoc de trong!");
                    return;
                }



                String id = ex_database.push().getKey();
                String date = DateFormat.getDateInstance().format(new Date());
                Data data = new Data(tien_int, loai, nd, id, date);
                ex_database.child(id).setValue(data);
                Toast.makeText(getActivity(), "Data added", Toast.LENGTH_SHORT).show();
                dialogg.dismiss();

            }
        });

        btn_thoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogg.dismiss();

            }
        });
        dialogg.show();


    }
}