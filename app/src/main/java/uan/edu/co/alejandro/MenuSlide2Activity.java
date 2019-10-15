package uan.edu.co.alejandro;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.MenuItem;
import android.view.View;

import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;

public class MenuSlide2Activity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private AppBarConfiguration mAppBarConfiguration;

    public static int opcion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_slide2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow,
                R.id.nav_tools, R.id.nav_share, R.id.nav_send)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

        FragmentManager fm = getSupportFragmentManager();
        switch (opcion){
            case 1: fm.beginTransaction().replace(R.id.escenario, new Poseidon_Fragment()).commit();break;
            case 2: fm.beginTransaction().replace(R.id.escenario, new Zeus_Fragment()).commit();break;
            case 3: fm.beginTransaction().replace(R.id.escenario, new Hades_Fragment()).commit();break;
            case 4: fm.beginTransaction().replace(R.id.escenario, new Ares_Fragment()).commit();break;
            case 5: fm.beginTransaction().replace(R.id.escenario, new Hefesto_Fragment()).commit();break;
            case 6: fm.beginTransaction().replace(R.id.escenario, new Afrodita_Fragment()).commit();break;
            default: fm.beginTransaction().replace(R.id.escenario, new Zeus_Fragment()).commit();break;

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_slide2, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    public boolean onNavigationItemSelected(MenuItem item){
        int id = item.getItemId();
        FragmentManager fm = getSupportFragmentManager();
        if (id == R.id.nav_home){
            fm.beginTransaction().replace(R.id.escenario, new Poseidon_Fragment()).commit();
        }else if (id == R.id.nav_gallery){
            fm.beginTransaction().replace(R.id.escenario, new Zeus_Fragment()).commit();
        }else if (id == R.id.nav_slideshow){
            fm.beginTransaction().replace(R.id.escenario, new Hades_Fragment()).commit();
        }else if (id == R.id.nav_tools){
            fm.beginTransaction().replace(R.id.escenario, new Ares_Fragment()).commit();
        }else if (id == R.id.nav_share){
            fm.beginTransaction().replace(R.id.escenario, new Hefesto_Fragment()).commit();
        }else if (id == R.id.nav_send){
            fm.beginTransaction().replace(R.id.escenario, new Afrodita_Fragment()).commit();
        }
        return false;
    }
}
