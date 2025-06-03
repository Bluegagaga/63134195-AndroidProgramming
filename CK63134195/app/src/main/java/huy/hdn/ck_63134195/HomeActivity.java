package huy.hdn.ck_63134195;


import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class HomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    Toolbar toolbar;
    DrawerLayout drawlay;
    ActionBarDrawerToggle navDrawerToggle;
    NavigationView navview;
    BottomNavigationView botnavview;
    FrameLayout framelay;
    DashboardFragment dashfrag;
    IncomeFragment infrag;
    ExpenseFragment exfrag;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);

        //findID
        toolbar = findViewById(R.id.toolbar);
        drawlay = findViewById(R.id.drawer_layout);
        navview = findViewById(R.id.navview);
        botnavview = findViewById(R.id.botnav);
        framelay = findViewById(R.id.framelayout);


        // Setup toolbar
        toolbar.setTitle("Quan Ly Chi Tieu");
        setSupportActionBar(toolbar);

        // Setup navigation drawer toggle
        navDrawerToggle = new ActionBarDrawerToggle(
                this,
                drawlay,
                toolbar,
                R.string.nav_draw_open,
                R.string.nav_draw_close
        );
        drawlay.addDrawerListener(navDrawerToggle);
        navDrawerToggle.syncState();
        navview.setNavigationItemSelectedListener(this);

        //Fragment
        dashfrag = new DashboardFragment();
        infrag = new IncomeFragment();
        exfrag = new ExpenseFragment();



        //Setup botnavview
        botnavview.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()){
                    case R.id.dashboard:
                        setFragment(dashfrag);
                        botnavview.setItemBackgroundResource(R.color.dashcolor);
                        return true;
                    case R.id.income:
                        setFragment(infrag);
                        botnavview.setItemBackgroundResource(R.color.incomecolor);
                        return true;
                    case R.id.expense:
                        setFragment(exfrag);
                        botnavview.setItemBackgroundResource(R.color.expensecolor);
                        return true;
                    default:
                        return false;

            }
        }
        });



            }

    private void setFragment(Fragment frag) {
        FragmentTransaction fragtran = getSupportFragmentManager().beginTransaction();
        fragtran.replace(R.id.framelayout,frag);
        fragtran.commit();
    }

    @Override
    public void onBackPressed() {
        if (drawlay.isDrawerOpen(GravityCompat.END)) {
            drawlay.closeDrawer(GravityCompat.END);
        } else {
            super.onBackPressed();
        }
    }

    public void displaysellis(int itemID){
        Fragment frag = null;

        switch (itemID){
            case R.id.dashboard:
                break;
            case R.id.income:
                break;
            case R.id.expense:
                break;

        }

        if(frag!=null){
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.framelayout,frag);
            ft.commit();

        }

        drawlay.closeDrawer(GravityCompat.START);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        displaysellis(item.getItemId());
        return true;
    }
}