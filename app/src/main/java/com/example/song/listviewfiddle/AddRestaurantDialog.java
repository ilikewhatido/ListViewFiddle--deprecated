package com.example.song.listviewfiddle;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Song on 2015/12/2.
 */
public class AddRestaurantDialog extends DialogFragment implements View.OnClickListener {

    private Button ok, cancel;
    private EditText name, number;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_add_restaurant, null);
        ok = (Button) view.findViewById(R.id.addRestauranOk);
        cancel = (Button) view.findViewById(R.id.addRestaurantCancel);
        ok.setOnClickListener(this);
        cancel.setOnClickListener(this);
        name = (EditText) view.findViewById(R.id.addRestaurantName);
        number = (EditText) view.findViewById(R.id.addRestaurantNumber);
        setCancelable(true);
        return view;
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if(id == R.id.addRestauranOk) {
            ((MainActivityActionManager)getActivity()).addRestaurant(name.getText().toString(), number.getText().toString());
            dismiss();
        } else if (id == R.id.addRestaurantCancel) {
            dismiss();
        }
    }
}
