package br.com.navigationdrawerdemo;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class FaleConosco extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    EditText edtNome;
    EditText edtEmail;
    EditText edtAssunto;
    EditText edtMensagem;
    Button btn;
    View view;

    public static View getCurrentView(){
        return view;
    }

    public FaleConosco(){

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fale_conosco, container, false);

        edtAssunto = v.findViewById(R.id.edtAssunto);
        edtEmail = v.findViewById(R.id.edtEmail);
        edtMensagem = v.findViewById(R.id.edtMensagem);
        edtNome = v.findViewById(R.id.edtNome);
        btn = v.findViewById(R.id.btnSend);
        view = v;

        return v;
    }








}
