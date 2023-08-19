package com.example.comicword.data.repository;

import com.example.comicword.R;
import com.example.comicword.data.model.Story;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.List;

public class StoryRepository extends BaseRepository{

    private static final String TAG = "StoryRepository";

    public StoryRepository() {
        firestore = FirebaseFirestore.getInstance();
        collectionReference = firestore.collection("stories");
    }

    // Get Story By Id
    public void getSotryById(String storyId, final onDataFetchedListener<Story> listener){
        collectionReference.document(storyId) // to query the database and get the story document based on the given ID.
                .get() // method get
                .addOnSuccessListener(storyDocument -> { // get success
                    if(storyDocument.exists()) { // convert Firestore document to Story object using

                        Story story = storyDocument.toObject(Story.class);

                        listener.onDataFetchedListener(story); // returns story data to the user.
                    }
                    else {
                        onDataNotAvailable(context.getString(R.string.error_story_not_found));
                    }
                })
                .addOnFailureListener(e -> {
                    onDataNotAvailable(context.getString(R.string.error_getting_story) + e.getMessage());
                });
    }
}
