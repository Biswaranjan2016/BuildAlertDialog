package com.example.happy.buildalertdialog;


import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 */
public class AlertDialogFrag extends DialogFragment {


    public AlertDialogFrag() {
        // Required empty public constructor
    }

    public Dialog onCreateDialog(Bundle savedInstance){

        //Instantiate an AlertDialog with its constructor
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        //Chain togather various setter methods to set the Dialog characteristics
        builder.setMessage("Automatic brightness")
                .setTitle("Brightness")
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getContext(),"Okay",Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("Cancell", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getContext(),"Cancelled",Toast.LENGTH_SHORT).show();
                    }
                });
        return builder.create();
    }
}
