package huy.hdn.luyentap;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FooterFragment extends Fragment {
    Button b1, b2 ,b3;
    private String mParam2;

    public FooterFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_footer, container, false);

        //find view
        b1 = v.findViewById(R.id.btn1);
        b2 = v.findViewById(R.id.btn2);
        b3 = v.findViewById(R.id.btn3);

        FragmentManager FM = getParentFragmentManager();

        //event
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FM.beginTransaction().replace(R.id.frcont, new FragmentOne()).commit();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FM.beginTransaction().replace(R.id.frcont, new FragmentTwo()).commit();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FM.beginTransaction().replace(R.id.frcont, new FragmentThree()).commit();
            }
        });

        return v;
    }
}