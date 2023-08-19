package com.example.comicword.data.repository;

import android.content.Context;
import android.widget.Toast;

import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;

public abstract class BaseRepository {

    protected FirebaseFirestore firestore;
    protected FirebaseStorage firebaseStorage;
    protected CollectionReference collectionReference;

    protected Context context;

    public BaseRepository() {
        firestore = FirebaseFirestore.getInstance();
        firebaseStorage = FirebaseStorage.getInstance();
        this.context = context;
    }

    public interface onDataFetchedListener<T> {
        void onDataFetchedListener(T data);
    }

    public void onDataNotAvailable(String errorMessage) {
        // Hiển thị thông báo lỗi cho người dùng
        Toast.makeText(context, errorMessage, Toast.LENGTH_SHORT).show();
    }

}
