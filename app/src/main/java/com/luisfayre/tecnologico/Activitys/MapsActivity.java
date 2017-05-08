package com.luisfayre.tecnologico.Activitys;

import android.Manifest;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.luisfayre.tecnologico.R;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback{

    private GoogleMap mMap;
    private static final int REQUEST_LOCATION = 1503;
    static final Integer LOCATION = 0x1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.luisfayre.tecnologico.R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);

        mapFragment.getMapAsync(this);

        LocationManager locationManager = (LocationManager)getSystemService(Context.LOCATION_SERVICE);

        if (locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)){
//            GPS ABILITADO
        }else{
            showGPSDisabledAlertToUser();
        }


    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        Drawable db = getResources().getDrawable(R.drawable.b);
        Drawable dc = getResources().getDrawable(R.drawable.c);
        Drawable dd = getResources().getDrawable(R.drawable.d);
        Drawable de = getResources().getDrawable(R.drawable.e);
        Drawable df = getResources().getDrawable(R.drawable.f);
        Drawable dg = getResources().getDrawable(R.drawable.g);
        Drawable dh = getResources().getDrawable(R.drawable.h);
        Drawable di = getResources().getDrawable(R.drawable.i);
        Drawable ds = getResources().getDrawable(R.drawable.s);

        Drawable dcomputo = getResources().getDrawable(R.drawable.computo);
        Drawable dbiblioteca = getResources().getDrawable(R.drawable.biblioteca);
        Drawable dcafeteria= getResources().getDrawable(R.drawable.cafeteria);
        Drawable dadministrativo= getResources().getDrawable(R.drawable.cafeteria);
        Drawable dlabmetodos = getResources().getDrawable(R.drawable.labmetodos);
        Drawable dgym = getResources().getDrawable(R.drawable.gym);

        Bitmap bdb = ((BitmapDrawable) db).getBitmap();
        Bitmap bdc = ((BitmapDrawable) dc).getBitmap();
        Bitmap bdd = ((BitmapDrawable) dd).getBitmap();
        Bitmap bde = ((BitmapDrawable) de).getBitmap();
        Bitmap bdf = ((BitmapDrawable) df).getBitmap();
        Bitmap bdg = ((BitmapDrawable) dg).getBitmap();
        Bitmap bdh = ((BitmapDrawable) dh).getBitmap();
        Bitmap bdi = ((BitmapDrawable) di).getBitmap();
        Bitmap bds = ((BitmapDrawable) ds).getBitmap();

        Bitmap bdcomputo = ((BitmapDrawable) dcomputo).getBitmap();
        Bitmap bdbiblioteca = ((BitmapDrawable) dbiblioteca).getBitmap();
        Bitmap bdcafeteria = ((BitmapDrawable) dcafeteria).getBitmap();
        Bitmap bdadministrativo = ((BitmapDrawable) dadministrativo).getBitmap();
        Bitmap bdlabmetodos = ((BitmapDrawable) dlabmetodos).getBitmap();
        Bitmap bddgym = ((BitmapDrawable) dgym).getBitmap();

        Bitmap rbdb = Bitmap.createScaledBitmap(bdb, 80, 120, false);
        Bitmap rbdc = Bitmap.createScaledBitmap(bdc, 80, 120, false);
        Bitmap rbdd = Bitmap.createScaledBitmap(bdd, 80, 120, false);
        Bitmap rbde = Bitmap.createScaledBitmap(bde, 80, 120, false);
        Bitmap rbdf = Bitmap.createScaledBitmap(bdf, 80, 120, false);
        Bitmap rbdg = Bitmap.createScaledBitmap(bdg, 80, 120, false);
        Bitmap rbdh = Bitmap.createScaledBitmap(bdh, 80, 120, false);
        Bitmap rbdi = Bitmap.createScaledBitmap(bdi, 80, 120, false);
        Bitmap rbds = Bitmap.createScaledBitmap(bds, 80, 120, false);

        Bitmap rbdcomputo = Bitmap.createScaledBitmap(bdcomputo, 80, 120, false);
        Bitmap rbdbiblioteca = Bitmap.createScaledBitmap(bdbiblioteca, 80, 120, false);
        Bitmap rbdcafeteria = Bitmap.createScaledBitmap(bdcafeteria, 80, 120, false);
        Bitmap rbdadministrativo = Bitmap.createScaledBitmap(bdadministrativo, 80, 120, false);
        Bitmap rbdlabmetodos = Bitmap.createScaledBitmap(bdlabmetodos, 80, 120, false);
        Bitmap rbddgym = Bitmap.createScaledBitmap(bddgym, 80, 120, false);


        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
//            Toast.makeText(MapsActivity.this, "NO LOCATION", Toast.LENGTH_SHORT).show();
            if (ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.ACCESS_FINE_LOCATION)) {
                ActivityCompat.requestPermissions(MapsActivity.this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, REQUEST_LOCATION);
//                Toast.makeText(MapsActivity.this, "No permitido", Toast.LENGTH_SHORT).show();
            } else {
                ActivityCompat.requestPermissions(MapsActivity.this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, REQUEST_LOCATION);
                mMap.setMyLocationEnabled(true);
            }
        } else {
            mMap.setMyLocationEnabled(true);
        }


        // Add a marker in Sydney and move the camera
        LatLng edificioB = new LatLng(28.708749, -106.104872);
        LatLng edificioC = new LatLng(28.707782, -106.105092);
        LatLng edificioD = new LatLng(28.707974, -106.105490);
        LatLng edificioE = new LatLng(28.708666, -106.105472);
        LatLng edificioF = new LatLng(28.708274, -106.105774);
        LatLng edificioG = new LatLng(28.708087, -106.104452);
        LatLng edificioH = new LatLng(28.707441, -106.104467);
        LatLng edificioI = new LatLng(28.706763, -106.103254);

        LatLng biblioteca = new LatLng(28.707998, -106.106214);
        LatLng centroComputo = new LatLng(28.708445, -106.106515);
        LatLng labMetodos = new LatLng(28.708611, -106.1059569);
        LatLng cafeteria = new LatLng(28.709337, -106.105130);
        LatLng cienciasBasicas = new LatLng(28.707658, -106.105833);
        LatLng gimnacio = new LatLng(28.708907, -106.102840);



        mMap.addMarker(new MarkerOptions().position(edificioB).title("Edificio 'B'").icon(BitmapDescriptorFactory.fromBitmap(rbdb)));
        mMap.addMarker(new MarkerOptions().position(edificioC).title("Edificio 'C'").icon(BitmapDescriptorFactory.fromBitmap(rbdc)));
        mMap.addMarker(new MarkerOptions().position(edificioD).title("Edificio 'D'").icon(BitmapDescriptorFactory.fromBitmap(rbdd)));
        mMap.addMarker(new MarkerOptions().position(edificioE).title("Edificio 'E'").icon(BitmapDescriptorFactory.fromBitmap(rbde)));
        mMap.addMarker(new MarkerOptions().position(edificioF).title("Edificio 'F'").icon(BitmapDescriptorFactory.fromBitmap(rbdf)));
        mMap.addMarker(new MarkerOptions().position(edificioG).title("Edificio 'G'").icon(BitmapDescriptorFactory.fromBitmap(rbdg)));
        mMap.addMarker(new MarkerOptions().position(edificioH).title("Edificio 'H' Administrativo").icon(BitmapDescriptorFactory.fromBitmap(rbdh)));
        mMap.addMarker(new MarkerOptions().position(edificioI).title("Edificio 'I' ").icon(BitmapDescriptorFactory.fromBitmap(rbdi)));

        mMap.addMarker(new MarkerOptions().position(biblioteca).title("Biblioteca").icon(BitmapDescriptorFactory.fromBitmap(rbdbiblioteca)));
        mMap.addMarker(new MarkerOptions().position(centroComputo).title("Centro de Computo").icon(BitmapDescriptorFactory.fromBitmap(rbdcomputo)));
        mMap.addMarker(new MarkerOptions().position(labMetodos).title("Laboratorio de Metodos").icon(BitmapDescriptorFactory.fromBitmap(rbdlabmetodos)));
        mMap.addMarker(new MarkerOptions().position(cafeteria).title("Cafeteria").icon(BitmapDescriptorFactory.fromBitmap(rbdcafeteria)));
        mMap.addMarker(new MarkerOptions().position(cienciasBasicas).title("Ciencias Basicas").icon(BitmapDescriptorFactory.fromBitmap(rbds)));
        mMap.addMarker(new MarkerOptions().position(gimnacio).title("Gimnasio").icon(BitmapDescriptorFactory.fromBitmap(rbddgym)));


        mMap.moveCamera(CameraUpdateFactory.newLatLng(edificioB));
        mMap.setMinZoomPreference(17.2f);
        mMap.setMaxZoomPreference(20.0f);

    }
    private void askForPermission(String permission, Integer requestCode) {
        if (ContextCompat.checkSelfPermission(MapsActivity.this, permission) != PackageManager.PERMISSION_GRANTED) {
            // Should we show an explanation?
            if (ActivityCompat.shouldShowRequestPermissionRationale(MapsActivity.this, permission)) {
                //This is called if user has denied the permission before
                //In this case I am just asking the permission again
                ActivityCompat.requestPermissions(MapsActivity.this, new String[]{permission}, requestCode);

            } else {

                ActivityCompat.requestPermissions(MapsActivity.this, new String[]{permission}, requestCode);
            }
        } else {
            Toast.makeText(this, "" + permission + " is already granted.", Toast.LENGTH_SHORT).show();
        }
    }


    private void showGPSDisabledAlertToUser(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("El GPS de tu dispositivo esta desactivado")
                .setCancelable(false)
                .setPositiveButton("AJUSTES",
                        new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialog, int id){
                                Intent callGPSSettingIntent = new Intent(
                                        android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                                startActivity(callGPSSettingIntent);
                            }
                        });
        alertDialogBuilder.setNegativeButton("CANCELAR",
                new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int id){
                        dialog.cancel();
                    }
                });
        AlertDialog alert = alertDialogBuilder.create();
        alert.show();
    }
}