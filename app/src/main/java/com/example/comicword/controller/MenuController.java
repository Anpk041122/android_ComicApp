package com.example.comicword.controller;

import static android.os.Build.VERSION_CODES.R;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;

import com.google.android.material.appbar.MaterialToolbar;

public class MenuController {

    private Context context;

    public MenuController(Context context) {
        this.context = context;
    }

    public void handleViewMenu(ImageView iv){
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Menu thông báo", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void handleTopLeftAppBar(MaterialToolbar topAppBar){

    }
}
