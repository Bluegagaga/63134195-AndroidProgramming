package huy.hdn.ck_63134195;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class DashboardFragment extends Fragment {

    FloatingActionButton fab_main, fab_in, fab_ex;
    TextView in_ft, ex_ft;
    boolean Isopem;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_dashboard, container, false);

        //findID
        fab_main = view.findViewById(R.id.fb_main_plus_btn);
        fab_in = view.findViewById(R.id.income_ft_btn);
        fab_ex = view.findViewById(R.id.expense_ft_btn);
        in_ft = view.findViewById(R.id.income_ft);
        ex_ft = view.findViewById(R.id.expense_ft);


        fab_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Isopem){
                    fab_in.setClickable(false);
                    fab_ex.setClickable(false);
                    in_ft.setClickable(false);
                    ex_ft.setClickable(false);
                    Isopem=false;

                }
                else {
                    fab_in.setClickable(true);
                    fab_ex.setClickable(true);
                    in_ft.setClickable(true);
                    ex_ft.setClickable(true);
                    Isopem=true;

                }

            }
        });


        return view;
    }

    private void InsertData(){
        fab_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });

        fab_ex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                

            }
        });

    }
}