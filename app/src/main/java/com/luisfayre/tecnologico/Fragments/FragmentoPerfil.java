package com.luisfayre.tecnologico.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.StorageReference;
import com.luisfayre.tecnologico.R;
import com.luisfayre.tecnologico.Registros.InfoUsuario;

/**
 * Created by luisf on 29/04/2017.
 */
public class FragmentoPerfil extends Fragment {

    //Ui
    private TextView nombre;
    private TextView coreo;
    private TextView ubicacion;

    //Firebase
    private FirebaseAuth firebaseAuth;
    private FirebaseAuth.AuthStateListener firebaseAuthListener;
    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;
    private StorageReference storageReference;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_profile,
                container, false);

        nombre = (TextView) view.findViewById(R.id.profile_nombre);
        coreo = (TextView) view.findViewById(R.id.profile_correo);
        ubicacion = (TextView) view.findViewById(R.id.profile_ubicacion);

        datosFirebase();

        return view;
    }


    private void datosFirebase() {
        firebaseAuth = FirebaseAuth.getInstance();
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                mostrardatos(dataSnapshot);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

    private void mostrardatos(DataSnapshot dataSnapshot) {
        for(DataSnapshot ds : dataSnapshot.getChildren()){

            firebaseAuth = FirebaseAuth.getInstance();
            FirebaseUser user = firebaseAuth.getCurrentUser();
            if(user !=null){
                InfoUsuario infoUser = new InfoUsuario();
                infoUser.setName(ds.child(user.getUid()).getValue(InfoUsuario.class).getName());
                infoUser.setEmail(ds.child(user.getUid()).getValue(InfoUsuario.class).getEmail());
                infoUser.setLocation(ds.child(user.getUid()).getValue(InfoUsuario.class).getLocation());
                nombre.setText(infoUser.getName());
                coreo.setText(infoUser.getEmail());
                ubicacion.setText(infoUser.getLocation());
            }

        }
    }


}
