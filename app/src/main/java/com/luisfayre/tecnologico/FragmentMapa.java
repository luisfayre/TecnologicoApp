package com.luisfayre.tecnologico;


import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Created by luisf on 05/05/2017.
 */
public class FragmentMapa extends Fragment implements OnMapReadyCallback{

    private GoogleMap mMap;
    private MapView mMapView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v =inflater.inflate(R.layout.fragmento_mapa, container, false);


        return v;
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        android.app.FragmentManager fragment = getActivity().getFragmentManager();
        final MapFragment myMapFragment = (MapFragment) fragment.findFragmentById(R.id.mapaprueba);
        myMapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng edificioB = new LatLng(28.708749, -106.104872);
        LatLng edificioC = new LatLng(28.707782, -106.105092);
        LatLng edificioD = new LatLng(28.707974, -106.105490);
        LatLng edificioE = new LatLng(28.708666, -106.105472);
        LatLng edificioF = new LatLng(28.708274, -106.105774);
        LatLng edificioG = new LatLng(28.708087, -106.104452);
        LatLng edificioH = new LatLng(28.707441, -106.104467);

        LatLng biblioteca = new LatLng(28.707998, -106.106214);
        LatLng centroComputo = new LatLng(28.708445, -106.106515);
        LatLng labMetodos = new LatLng(28.708611, -106.1059569);
        LatLng cafeteria = new LatLng(28.709337, -106.105130);
        LatLng cienciasBasicas = new LatLng(28.707658, -106.105833);
        LatLng gimnacio = new LatLng(28.708907, -106.102840);

        mMap.addMarker(new MarkerOptions().position(edificioB).title("Edificio 'B'"));
        mMap.addMarker(new MarkerOptions().position(edificioC).title("Edificio 'C'"));
        mMap.addMarker(new MarkerOptions().position(edificioD).title("Edificio 'D'"));
        mMap.addMarker(new MarkerOptions().position(edificioE).title("Edificio 'E'"));
        mMap.addMarker(new MarkerOptions().position(edificioF).title("Edificio 'F'"));
        mMap.addMarker(new MarkerOptions().position(edificioG).title("Edificio 'G'"));
        mMap.addMarker(new MarkerOptions().position(edificioH).title("Edificio 'H' Administrativo"));

        mMap.addMarker(new MarkerOptions().position(biblioteca).title("Biblioteca"));
        mMap.addMarker(new MarkerOptions().position(centroComputo).title("Centro de Computo"));
        mMap.addMarker(new MarkerOptions().position(labMetodos).title("Laboratorio de Metodos"));
        mMap.addMarker(new MarkerOptions().position(cafeteria).title("Cafeteria"));
        mMap.addMarker(new MarkerOptions().position(cienciasBasicas).title("Ciencias Basicas"));
        mMap.addMarker(new MarkerOptions().position(gimnacio).title("Gimnasio"));


        mMap.moveCamera(CameraUpdateFactory.newLatLng(edificioB));
        mMap.setMinZoomPreference(17.5f);
        mMap.setMaxZoomPreference(20.0f);
    }
}
