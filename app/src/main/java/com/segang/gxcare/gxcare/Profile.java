package com.segang.gxcare.gxcare;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Profile extends Fragment {


    public Profile() {
        // Required empty public constructor
    }

    public static Profile newInstance() {
        Profile profile = new Profile();
        return profile;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        FloatingActionButton editBtn = (FloatingActionButton) view.findViewById(R.id.edit_btn);
        editBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                edit(v);
            }
        });

        FloatingActionButton saveBtn = (FloatingActionButton) view.findViewById(R.id.save_btn);
        saveBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                save(v);
            }
        });

        // Inflate the layout for this fragment
        return view;
    }

    public void edit(View view) {
        TextView firstName = getView().findViewById(R.id.first_name);
        TextView lastName = getView().findViewById(R.id.last_name);
        TextView dateOfBirth = getView().findViewById(R.id.date_of_birth);
        TextView emergencyContactName = getView().findViewById(R.id.emergency_contact_name);
        TextView emergencyContactPhoneNumber = getView().findViewById(R.id.emergency_contact_number);
        FloatingActionButton editBtn = getView().findViewById(R.id.edit_btn);
        firstName.setVisibility(View.GONE);
        lastName.setVisibility(View.GONE);
        dateOfBirth.setVisibility(View.GONE);
        emergencyContactName.setVisibility(View.GONE);
        emergencyContactPhoneNumber.setVisibility(View.GONE);
        editBtn.setVisibility(View.GONE);

        EditText firstNameEdit = getView().findViewById(R.id.first_name_edit);
        EditText lastNameEdit = getView().findViewById(R.id.last_name_edit);
        EditText dateOfBirthEdit = getView().findViewById(R.id.date_of_birth_edit);
        EditText emergencyContactNameEdit = getView().findViewById(R.id.emergency_contact_name_edit);
        EditText emergencyContactPhoneNumberEdit = getView().findViewById(R.id.emergency_contact_number_edit);
        FloatingActionButton saveBtn = getView().findViewById(R.id.save_btn);
        firstNameEdit.setVisibility(View.VISIBLE);
        lastNameEdit.setVisibility(View.VISIBLE);
        dateOfBirthEdit.setVisibility(View.VISIBLE);
        emergencyContactNameEdit.setVisibility(View.VISIBLE);
        emergencyContactPhoneNumberEdit.setVisibility(View.VISIBLE);
        saveBtn.setVisibility(View.VISIBLE);

        firstNameEdit.setText(firstName.getText());
        lastNameEdit.setText(lastName.getText());
        dateOfBirthEdit.setText(dateOfBirth.getText());
        emergencyContactNameEdit.setText(emergencyContactName.getText());
        emergencyContactPhoneNumberEdit.setText(emergencyContactPhoneNumber.getText());
    }

    public void save(View view) {
        EditText firstNameEdit = getView().findViewById(R.id.first_name_edit);
        EditText lastNameEdit = getView().findViewById(R.id.last_name_edit);
        EditText dateOfBirthEdit = getView().findViewById(R.id.date_of_birth_edit);
        EditText emergencyContactNameEdit = getView().findViewById(R.id.emergency_contact_name_edit);
        EditText emergencyContactPhoneNumberEdit = getView().findViewById(R.id.emergency_contact_number_edit);
        FloatingActionButton saveBtn = getView().findViewById(R.id.save_btn);
        firstNameEdit.setVisibility(View.GONE);
        lastNameEdit.setVisibility(View.GONE);
        dateOfBirthEdit.setVisibility(View.GONE);
        emergencyContactNameEdit.setVisibility(View.GONE);
        emergencyContactPhoneNumberEdit.setVisibility(View.GONE);
        saveBtn.setVisibility(View.GONE);

        TextView firstName = getView().findViewById(R.id.first_name);
        TextView lastName = getView().findViewById(R.id.last_name);
        TextView dateOfBirth = getView().findViewById(R.id.date_of_birth);
        TextView emergencyContactName = getView().findViewById(R.id.emergency_contact_name);
        TextView emergencyContactPhoneNumber = getView().findViewById(R.id.emergency_contact_number);
        FloatingActionButton editBtn = getView().findViewById(R.id.edit_btn);
        firstName.setVisibility(View.VISIBLE);
        lastName.setVisibility(View.VISIBLE);
        dateOfBirth.setVisibility(View.VISIBLE);
        emergencyContactName.setVisibility(View.VISIBLE);
        emergencyContactPhoneNumber.setVisibility(View.VISIBLE);
        editBtn.setVisibility(View.VISIBLE);

        firstName.setText(firstNameEdit.getText());
        lastName.setText(lastNameEdit.getText());
        dateOfBirth.setText(dateOfBirthEdit.getText());
        emergencyContactName.setText(emergencyContactNameEdit.getText());
        emergencyContactPhoneNumber.setText(emergencyContactPhoneNumberEdit.getText());
    }

}
