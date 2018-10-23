package edmt.dev.androidgridlayout;


import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;


//import android.content.Intent;
//import android.graphics.Color;
//import android.support.v7.widget.CardView;
//import android.view.View;
//import android.widget.GridLayout;
//import android.widget.GridView;
//import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    private FirebaseAuth firebaseAuth;




    private CardView Engineering, Agriculture, General, Medical, National, Private, Logout, Dashboard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);*/


        Engineering = (CardView) findViewById(R.id.EngineeringCard);
        Agriculture = (CardView) findViewById(R.id.AgricultureCard);
        General = (CardView) findViewById(R.id.GeneralCard);
        Medical = (CardView) findViewById(R.id.MedicalCard);
        National = (CardView) findViewById(R.id.NationalCard);
        Private = (CardView) findViewById(R.id.PrivateCard);
        Logout = (CardView) findViewById(R.id.LogOutCard);
        Dashboard = (CardView) findViewById(R.id.DashboardCard);

         Engineering.setOnClickListener(this);
         Agriculture.setOnClickListener(this);
         General.setOnClickListener(this);
         Medical.setOnClickListener(this);
         National.setOnClickListener(this);
         Private.setOnClickListener(this);
         Logout.setOnClickListener(this);
         Dashboard.setOnClickListener(this);



    }




    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.EngineeringCard:
                i = new Intent(this, ActivityEngineering.class);
                startActivity(i);
                break;

            case R.id.AgricultureCard:
                i = new Intent(this, ActivityAgriculture.class);
                startActivity(i);
                break;

            case R.id.GeneralCard:
                i = new Intent(this, ActivityGeneral.class);
                startActivity(i);
                break;

            case R.id.MedicalCard:
                i = new Intent(this, ActivityMedical.class);
                startActivity(i);
                break;

            case R.id.NationalCard:
                i = new Intent(this, ActivityNational.class);
                startActivity(i);
                break;

            case R.id.PrivateCard:
                i = new Intent(this, ActivityPrivate.class);
                startActivity(i);
                break;



            case R.id.LogOutCard:
                firebaseAuth.getInstance().signOut();
                finish();
                startActivity(new Intent(MainActivity.this, ActivityLogin.class));
                Toast.makeText(getApplicationContext(), "Logged Out", Toast.LENGTH_SHORT).show();
                break;

            case R.id.DashboardCard:
                //Database Codes Retrieve Data..

                startActivity(new Intent(MainActivity.this, ProfileActivity.class));

                Toast.makeText(getApplicationContext(), "Showing Dashboard Info...", Toast.LENGTH_SHORT).show();

                break;


            default:
                break;

        }

    }

    @Override
    public void onBackPressed() {
        // Nothing Will Happen When Pressing Back Button, You have to press Logout Card to logout....
    }


}
