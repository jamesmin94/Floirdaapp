package com.example.floridaproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentManager;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.hardware.Camera;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.maps.android.clustering.ClusterManager;

import org.json.JSONArray;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Floridamap1 extends AppCompatActivity implements OnMapReadyCallback {


    private static final int REQUEST_CODE_PERMISSIONS =1000 ;
    private FragmentManager fragmentManager;
    private MapFragment mapFragment;
    private FusedLocationProviderClient mFusedLocationClient;
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floridamap1);


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.googlemap);
        mapFragment.getMapAsync(this);
        mFusedLocationClient = LocationServices.getFusedLocationProviderClient(this);


    }



    @Override
    public void onMapReady(final GoogleMap googleMap) {

        mMap = googleMap;
        LatLng location = new LatLng(28.400872, -81.579455);
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.title("Walt Disney World Magic Kingdom Parking Lot");
        markerOptions.snippet("Theme Park");
        markerOptions.position(location);
        Marker marker = googleMap.addMarker(markerOptions);

        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(location, 6));

        LatLng location1 = new LatLng(28.473989, -81.460835);
        MarkerOptions markerOptions1 = new MarkerOptions();
        markerOptions1.title("Universal Studio Orlando Resort");
        markerOptions1.snippet("Theme park");
        markerOptions1.position(location1);
        googleMap.addMarker(markerOptions1);

        LatLng BreakersOceanFrontPark = new LatLng(29.226323, -81.006875);
        MarkerOptions markerOptions2 = new MarkerOptions();
        markerOptions2.title("Breakers Oceanfront Park");
        markerOptions2.snippet("Park");
        markerOptions2.position(BreakersOceanFrontPark);
        googleMap.addMarker(markerOptions2);

        LatLng FuntoDiveSwimWithManatee = new LatLng(28.897140, -82.591190);
        final MarkerOptions SwimWithManatees = new MarkerOptions();
        SwimWithManatees.title("FuntoDiveSwimWithManatee");
        SwimWithManatees.snippet("Animal Attractrion");
        SwimWithManatees.position(FuntoDiveSwimWithManatee);
        googleMap.addMarker(SwimWithManatees);



        LatLng DaytonaInternational = new LatLng(29.185656, -81.072202);
        final MarkerOptions DaytonaInternational1 = new MarkerOptions();
        DaytonaInternational1.title("Daytona International SpeedWay");
        DaytonaInternational1.snippet("Tourist Attractrion");
        DaytonaInternational1.position(DaytonaInternational);
        googleMap.addMarker(DaytonaInternational1);

        LatLng ReitzU = new LatLng(29.646453, -82.347949);
        MarkerOptions Reitz = new MarkerOptions();
        Reitz.title("Reitz Union");
        Reitz.snippet("Accomendation");
        Reitz.position(ReitzU);
        googleMap.addMarker(Reitz);


        LatLng BenHill = new LatLng(29.649822, -82.347909);
        MarkerOptions benhillm = new MarkerOptions();
        benhillm.title("Ben Hill Griffin Stadium");
        benhillm.snippet("Tourism Attraction - Football Stadium");
        benhillm.position(BenHill);
        googleMap.addMarker(benhillm);

        LatLng Hermingway = new LatLng(24.551176, -81.800585);
        MarkerOptions Hermingway1 = new MarkerOptions();
        Hermingway1.title("The Ernest Hemingway Home and Museum");
        Hermingway1.snippet("Tourism Attraction");
        Hermingway1.position(Hermingway);
        googleMap.addMarker(Hermingway1);

        LatLng Battery2 = new LatLng(24.545626, -81.803831);
        MarkerOptions Battery = new MarkerOptions();
        Battery.title("Battery 231");
        Battery.snippet("Tourism Attractrion - good for kids");
        Battery.position(Battery2);
        googleMap.addMarker(Battery);

        LatLng SmarhersB = new LatLng(24.551989, -81.768758);
        MarkerOptions SmarhersBe = new MarkerOptions();
        SmarhersBe.title("Smathers Beach ");
        SmarhersBe.snippet("Tourism Attraction");
        SmarhersBe.position(SmarhersB);
        googleMap.addMarker(SmarhersBe);

        LatLng OldChannel = new LatLng(24.836601, -80.766454);
        MarkerOptions OldChannelm = new MarkerOptions();
        OldChannelm.title("Old Channel 5 Bridge");
        OldChannelm.snippet("Tourism Attractrion");
        OldChannelm.position(OldChannel);
        googleMap.addMarker(OldChannelm);


        LatLng SevenMile = new LatLng(24.702393, -81.155062);
        MarkerOptions SevenMile1 = new MarkerOptions();
        SevenMile1.title("Seven Miles Bridge");
        SevenMile1.snippet("Tourism Attractrion");
        SevenMile1.position(SevenMile);
        googleMap.addMarker(SevenMile1);

        LatLng PigeonKey = new LatLng(24.704089, -81.155209);
        MarkerOptions PigeonKeyM = new MarkerOptions();
        PigeonKeyM.title("Pigeon Key Foundation & Marine Science Center");
        PigeonKeyM.snippet("Tourism Attractrion");
        PigeonKeyM.position(PigeonKey);
        googleMap.addMarker(PigeonKeyM);

        LatLng Souternmost = new LatLng(24.546506, -81.797482);
        MarkerOptions SouternmostM = new MarkerOptions();
        SouternmostM.title("Southernmost Point of the Continental US");
        SouternmostM.snippet("Tourism Attraction");
        SouternmostM.position(Souternmost);
        googleMap.addMarker(SouternmostM);

        LatLng WynwoodWall = new LatLng(25.801127, -80.199569);
        MarkerOptions WynwoodWallm = new MarkerOptions();
        WynwoodWallm.title("Wynwood wall");
        WynwoodWallm.snippet("Tourism Attractrion");
        WynwoodWallm.position(WynwoodWall);
        googleMap.addMarker(WynwoodWallm);

        LatLng Bayside = new LatLng(25.778361, -80.186780);
        MarkerOptions BaySide1 = new MarkerOptions();
        BaySide1.title("Bayside Marketplace");
        BaySide1.snippet("Tourism Attractrion");
        BaySide1.position(Bayside);
        googleMap.addMarker(BaySide1);


        LatLng Vizcya = new LatLng(25.744415, -80.210615);
        MarkerOptions Vizcya1 = new MarkerOptions();
        Vizcya1.title("Vizcaya Museum & Gardens");
        Vizcya1.snippet("Tourism Attractrion");
        Vizcya1.position(Vizcya);
        googleMap.addMarker(Vizcya1);

        LatLng ArtDeco = new LatLng(25.780221, -80.130246);
        MarkerOptions ArtDeco1 = new MarkerOptions();
        ArtDeco1.title("Art Deco Historic District");
        ArtDeco1.snippet("Tourism Attractrion");
        ArtDeco1.position(ArtDeco);
        googleMap.addMarker(ArtDeco1);

        LatLng Azucar = new LatLng(25.765864, -80.219642);
        MarkerOptions Azucar1 = new MarkerOptions();
        Azucar1.title("Azucar Ice Cream Company");
        Azucar1.snippet("Delicious Deseart");
        Azucar1.position(Azucar);
        googleMap.addMarker(Azucar1);

        LatLng HabitBur = new LatLng(25.769396, -80.357837);
        MarkerOptions HabitBur1 = new MarkerOptions();
        HabitBur1.title("The Habit Burger Grill ");
        HabitBur1.snippet("Delicious Hamburger");
        HabitBur1.position(HabitBur);
        googleMap.addMarker(HabitBur1);


        LatLng Aventura = new LatLng(25.957263, -80.143307);
        MarkerOptions Aventura1 = new MarkerOptions();
        Aventura1.title("Aventura Mall");
        Aventura1.snippet("Shopping District");
        Aventura1.position(Aventura);
        googleMap.addMarker(Aventura1);


        LatLng ParisMoring = new LatLng(26.346921, -80.155287);
        MarkerOptions parisMoring1 = new MarkerOptions();
        parisMoring1.title("Paris Morning Bakery");
        parisMoring1.snippet("Korean Sytle Bread");
        parisMoring1.position(ParisMoring);
        googleMap.addMarker(parisMoring1);

        LatLng NaplesPier = new LatLng(26.131720, -81.805747);
        MarkerOptions NaplerPier1 = new MarkerOptions();
        NaplerPier1.title("Naples Pier");
        NaplerPier1.snippet("Tourism Attractrion");
        NaplerPier1.position(NaplesPier);
        googleMap.addMarker(NaplerPier1);


        LatLng Beewon = new LatLng(28.490979, -81.491920);
        MarkerOptions Beewon1 = new MarkerOptions();
        Beewon1.title("Beewon Korean Resturant");
        Beewon1.snippet("Korean Style Dining ");
        Beewon1.position(Beewon);
        googleMap.addMarker(Beewon1);


        LatLng UniversalVolcanoBay = new LatLng(28.461471, -81.473087);
        MarkerOptions VolcanoBay1 = new MarkerOptions();
        VolcanoBay1.title("Universal Volcano Bay");
        VolcanoBay1.snippet("Tourism Attractrion");
        VolcanoBay1.position(UniversalVolcanoBay);
        googleMap.addMarker(VolcanoBay1);

        LatLng Premiunoutliet = new LatLng(28.387312, -81.492634);
        MarkerOptions Premiunoutliet1 = new MarkerOptions();
        Premiunoutliet1.title("Orlando Vineland Premium Outlets");
        Premiunoutliet1.snippet("Shopping District");
        Premiunoutliet1.position(Premiunoutliet);
        googleMap.addMarker(Premiunoutliet1);


        LatLng Kennedyspace = new LatLng(28.573215, -80.647589);
        MarkerOptions Kenndyspace1 = new MarkerOptions();
        Kenndyspace1.title("Kennedy Space Center");
        Kenndyspace1.snippet("Tourism Attractrion");
        Kenndyspace1.position(Kennedyspace);
        googleMap.addMarker(Kenndyspace1);

        LatLng OrlandoScience = new LatLng(28.572310, -81.368425);
        MarkerOptions OrlandoScience1 = new MarkerOptions();
        OrlandoScience1.title("Orlando Science Center");
        OrlandoScience1.snippet("Tourism Attractrion");
        OrlandoScience1.position(OrlandoScience);
        googleMap.addMarker(OrlandoScience1);

        LatLng FunspotA = new LatLng(28.466143, -81.455663);
        MarkerOptions FunSpotA1 = new MarkerOptions();
        FunSpotA1.title("Fun Spot America");
        FunSpotA1.snippet("Tourism Attractrion");
        FunSpotA1.position(FunspotA);
        googleMap.addMarker(FunSpotA1);

        LatLng TheWheelatIcon = new LatLng(28.443198, -81.468532);
        MarkerOptions TheWheelatIcon1 = new MarkerOptions();
        TheWheelatIcon1.title("The Wheel at ICON Park™ ");
        TheWheelatIcon1.snippet("Tourism Attractrion");
        TheWheelatIcon1.position(TheWheelatIcon);
        googleMap.addMarker(TheWheelatIcon1);


        LatLng DiscoveyCove = new LatLng(28.405133, -81.460815);
        MarkerOptions Discovercove1 = new MarkerOptions();
        Discovercove1.title("Discovery Cove");
        Discovercove1.snippet("Tourist Attractrion");
        Discovercove1.position(DiscoveyCove);
        googleMap.addMarker(Discovercove1);

        LatLng GatorLand = new LatLng(28.355530, -81.404086);
        MarkerOptions GatorLand1  = new MarkerOptions();
        GatorLand1.title("GatorLand");
        GatorLand1.snippet("Tourism Attractrion");
        GatorLand1.position(GatorLand);
        googleMap.addMarker(GatorLand1);


        LatLng DisneySpring = new LatLng(28.370136, -81.515163);
        MarkerOptions DisneySpring1 =  new MarkerOptions();
        DisneySpring1.title("Disney Springs");
        DisneySpring1.snippet("Shopping District");
        DisneySpring1.position(DisneySpring);
        googleMap.addMarker(DisneySpring1);


        LatLng FlaglerColl = new LatLng(29.892760, -81.314949);
        MarkerOptions FlagerCol1 = new MarkerOptions();
        FlagerCol1.title("Flagler College");
        FlagerCol1.snippet("Tourism Attractrion");
        FlagerCol1.position(FlaglerColl);
        googleMap.addMarker(FlagerCol1);



        LatLng BlackRavenPirate = new LatLng(29.891555, -81.310377);
        MarkerOptions BlackRavenPirate1 = new MarkerOptions();
        BlackRavenPirate1.title("Black Raven Pirate Ship");
        BlackRavenPirate1.snippet("Tourism Attractrion");
        BlackRavenPirate1.position(BlackRavenPirate);
        googleMap.addMarker(BlackRavenPirate1);


        LatLng Gelatotime = new LatLng(29.894058, -81.312938);
        MarkerOptions Gelatotim1 = new MarkerOptions();
        Gelatotim1.title("Gelato Time Gelateria Italiano");
        Gelatotim1.snippet("Tourism Attractrion");
        Gelatotim1.position(Gelatotime);
        googleMap.addMarker(Gelatotim1);



        LatLng OneFamilyKorean = new LatLng(27.995738, -82.560267);
        MarkerOptions OneFamilyKorean1 = new MarkerOptions();
        OneFamilyKorean1.title("One Family Korean Restaurant\n");
        OneFamilyKorean1.snippet("Korean Dining");
        OneFamilyKorean1.position(OneFamilyKorean);
        googleMap.addMarker(OneFamilyKorean1);

        LatLng ClearWater = new LatLng(27.977171, -82.829680);
        MarkerOptions ClearWater1 = new MarkerOptions();
        ClearWater1.title("Clear Water Beach");
        ClearWater1.snippet("Tourism Attractrion");
        ClearWater1.position(ClearWater);
        googleMap.addMarker(ClearWater1);

        LatLng BuschGarden = new LatLng(28.036185, -82.415262);
        MarkerOptions BuschGarden1 = new MarkerOptions();
        BuschGarden1.title("Busch Garden TampaBay");
        BuschGarden1.snippet("Tourism Attractrion");
        BuschGarden1.position(BuschGarden);
        googleMap.addMarker(BuschGarden1);


        LatLng MaraLargo = new LatLng(26.677140, -80.036831);
        MarkerOptions MaraLargo1 = new MarkerOptions();
        MaraLargo1.title("Mar-a-Lago Club");
        MaraLargo1.snippet("Tourism Attractrion");
        MaraLargo1.position(MaraLargo);
        googleMap.addMarker(MaraLargo1);


        LatLng FlagerMuseum = new LatLng(26.713655, -80.043571);
        MarkerOptions FlagerMuseum1 = new MarkerOptions();
        FlagerMuseum1.title("Henry Morrison Flagler Museum");
        FlagerMuseum1.snippet("Tourism Attractrion");
        FlagerMuseum1.position(FlagerMuseum);
        googleMap.addMarker(FlagerMuseum1);

        LatLng ClockTower = new LatLng(26.700700, -80.033211);
        MarkerOptions ClockTower1 = new MarkerOptions();
        ClockTower1.title("Clock Tower");
        ClockTower1.snippet("Tourism Attractrion");
        ClockTower1.position(ClockTower);
        googleMap.addMarker(ClockTower1);

        LatLng AnnNo = new LatLng(26.695344, -80.050586);
        MarkerOptions AnnNo1 = new MarkerOptions();
        AnnNo1.title("Ann Norton Sculpture Gardens");
        AnnNo1.snippet("Tourism Attractrion");
        AnnNo1.position(AnnNo);
        googleMap.addMarker(AnnNo1);

        LatLng Pizzatime = new LatLng(29.893924, -81.313036);
        MarkerOptions Pizzatime1 = new MarkerOptions();
        Pizzatime1.title("Pizza Time");
        Pizzatime1.snippet("Delecisous Resturant");
        Pizzatime1.position(Pizzatime);
        googleMap.addMarker(Pizzatime1);


        LatLng test = new LatLng(37.538751, 127.124099);
        MarkerOptions test1 = new MarkerOptions();
        test1.title("Test");
        test1.snippet("test");
        test1.position(test);
        googleMap.addMarker(test1);


































































        mMap.setOnMapClickListener(new GoogleMap.OnMapClickListener(){
            @Override
            public void onMapClick(LatLng point) {
                MarkerOptions mOptions = new MarkerOptions();
                // 마커 타이틀
                mOptions.title("Custom Marker Location");
                Double latitude = point.latitude; // 위도
                Double longitude = point.longitude; // 경도
                // 마커의 스니펫(간단한 텍스트) 설정
                mOptions.snippet(latitude.toString() + ", " + longitude.toString());
                // LatLng: 위도 경도 쌍을 나타냄
                mOptions.position(new LatLng(latitude, longitude));
                // 마커(핀) 추가
                googleMap.addMarker(mOptions).setIcon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN));
            }
        });


        googleMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
            @Override
            public void onInfoWindowClick(Marker marker) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+14079394357"));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });







    }





    public void onLastLocationButtonClicked(View view) {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.
                PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) !=
                PackageManager.PERMISSION_GRANTED){
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.ACCESS_FINE_LOCATION,
                    Manifest.permission.ACCESS_COARSE_LOCATION}, REQUEST_CODE_PERMISSIONS);
            return;
        }
        mFusedLocationClient.getLastLocation().addOnSuccessListener(this, new OnSuccessListener<Location>() {
            @Override
            public void onSuccess(Location location) {
              if(location != null){
                  LatLng myLocation = new LatLng(location.getLatitude(), location.getLongitude());


                  mMap.addMarker(new MarkerOptions()
                  .position(myLocation).title("Your Current Location").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)).alpha(1.0f));

                  mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(myLocation, 16f));



              }




            }
        });

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode){
            case REQUEST_CODE_PERMISSIONS:
                if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.
                        PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) !=
                        PackageManager.PERMISSION_GRANTED){
                    switch (requestCode){
                        case REQUEST_CODE_PERMISSIONS:
                            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.
                                    PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) !=
                                    PackageManager.PERMISSION_GRANTED) {
                                Toast.makeText(this, "Permission was decliened",Toast.LENGTH_SHORT).show();
                            }



                    }
                }

        }
    }
}