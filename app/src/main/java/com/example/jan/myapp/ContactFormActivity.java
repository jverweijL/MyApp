package com.example.jan.myapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.liferay.mobile.screens.ddl.form.DDLFormListener;
import com.liferay.mobile.screens.ddl.form.DDLFormScreenlet;
import com.liferay.mobile.screens.ddl.model.DocumentField;
import com.liferay.mobile.screens.ddl.model.Record;

import org.json.JSONObject;

import java.util.Map;

public class ContactFormActivity extends AppCompatActivity implements DDLFormListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactform);

        DDLFormScreenlet contactform = (DDLFormScreenlet) findViewById(R.id.contactform);
        contactform.setListener(this);
    }



    @Override
    public void onDDLFormLoaded(Record record) {

    }

    @Override
    public void onDDLFormRecordLoaded(Record record, Map<String, Object> valuesAndAttributes) {

    }

    @Override
    public void onDDLFormRecordAdded(Record record) {
        Toast.makeText(this,"Informatie is ontvangen!",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDDLFormRecordUpdated(Record record) {

    }

    @Override
    public void onDDLFormDocumentUploaded(DocumentField documentField, JSONObject jsonObject) {

    }

    @Override
    public void onDDLFormDocumentUploadFailed(DocumentField documentField, Exception e) {

    }

    @Override
    public void error(Exception e, String userAction) {

    }
}
