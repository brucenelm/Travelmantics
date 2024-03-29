package com.example.travelmantics;

import android.app.Activity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class FirebaseUtil {
    public static FirebaseDatabase mFirebaseDatabase;
    public static DatabaseReference mDatabaseReference;
    private static FirebaseUtil firebaseUtil;
    public static FirebaseAuth mFirebaseAuth;
    public static FirebaseAuth.AuthStateListener mAuthListener;
    public static ArrayList<TravelDeal>mDeals;
    private static final int RC_SIGN_IN = 123;
    private static Activity caller;

    private FirebaseUtil(){}

   public static void openFbReference(String ref){
       if(firebaseUtil == null){
           firebaseUtil = new FirebaseUtil();
           mFirebaseDatabase= FirebaseDatabase.getInstance();
           mFirebaseAuth = FirebaseAuth.getInstance();

       }
       mDeals = new ArrayList<TravelDeal>();
       mDatabaseReference = mFirebaseDatabase.getReference().child(ref);

   }



}