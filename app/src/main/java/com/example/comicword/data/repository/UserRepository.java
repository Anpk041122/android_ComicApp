package com.example.comicword.data.repository;

import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class UserRepository extends BaseRepository {
    private static final String TAG = "UserRepository";

    public UserRepository()
    {
        firestore = FirebaseFirestore.getInstance();
        collectionReference = firestore.collection("user");
    }

    
}
