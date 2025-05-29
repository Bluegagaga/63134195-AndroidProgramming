package huy.hdn.ck_63134195;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import com.google.android.material.navigation.NavigationView;

public class HomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    Toolbar toolbar;
    DrawerLayout drawlay;
    ActionBarDrawerToggle toggle;
    NavigationView navview;
    Fragment frag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);

        //findID
        toolbar = findViewById(R.id.toolbar);
        drawlay = findViewById(R.id.drawer_layout);
        navview = findViewById(R.id.navview);

        toolbar.setTitle("Quan Ly Chi Tieu");
        setSupportActionBar(toolbar);
        toggle = new ActionBarDrawerToggle(this, drawlay, toolbar, R.string.nav_draw_open, R.string.nav_draw_close);

        drawlay.addDrawerListener(toggle);
        toggle.syncState();

        navview.setNavigationItemSelectedListener(this);






    }

    @Override
    public void onBackPressed() {
        if (drawlay.isDrawerOpen(GravityCompat.END))
            drawlay.closeDrawer(GravityCompat.END);
        else
            super.onBackPressed();
    }

    public void displayselected (int item){
        frag = null;
        switch (item){


        }

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }
}