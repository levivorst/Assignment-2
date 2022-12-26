package com.example.loginapplication;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import org.jetbrains.annotations.NotNull;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link login#newInstance} factory method to
 * create an instance of this fragment.
 */
public class login extends Fragment {
    private FirebaseAuth mAuth;
    private EditText emailT;
    private EditText passT;
    private Button buttonLogin;
    private Button buttonReg;
    private View view;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public login() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment login.
     */
    // TODO: Rename and change types and number of parameters
    public static login newInstance(String param1, String param2) {
        login fragment = new login();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_login, container, false);
        mAuth = FirebaseAuth.getInstance();

        emailT = view.findViewById(R.id.email);
        passT = view.findViewById(R.id.pass);
        Button buttonLogin = view.findViewById(R.id.login);
        buttonLogin.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                loginFirebase();
            }
        });
        buttonReg = view.findViewById(R.id.reg);
        buttonReg.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                reg();
            }
        });
        return view;
    }


    public  void loginFirebase(){

//        view = view;

        String email =emailT.getText().toString();
        String password =passT.getText().toString();

        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(getActivity(), new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(getActivity(),"login ok",Toast.LENGTH_LONG).show();
                            Navigation.findNavController(getView()).navigate(R.id.action_login2_to_fragment2);
                        } else {
                            Toast.makeText(getActivity(),"login fail",Toast.LENGTH_LONG).show();
                        }
                    }
                });
    }



    public void reg(){
        String email =emailT.getText().toString();
        String password =passT.getText().toString();
        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(getActivity(), new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(getActivity(),"reg ok",Toast.LENGTH_LONG).show();
                            Navigation.findNavController(getView()).navigate(R.id.action_login2_to_fragment2);
                        } else {
                            Toast.makeText(getActivity(),"reg fail",Toast.LENGTH_LONG).show();
                        }
                    }
                });

    }
}