package com.google.firebase.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import com.google.firebase.C5270e;
import com.google.firebase.C5298l;
import java.util.concurrent.atomic.AtomicBoolean;
import p182n6.C7264i;

public class FirebaseInitProvider extends ContentProvider {

    /* renamed from: d */
    private static C5298l f17314d = C5298l.m20916e();

    /* renamed from: e */
    private static AtomicBoolean f17315e = new AtomicBoolean(false);

    /* renamed from: a */
    private static void m21577a(ProviderInfo providerInfo) {
        C7264i.m27903l(providerInfo, "FirebaseInitProvider ProviderInfo cannot be null.");
        if ("com.google.firebase.firebaseinitprovider".equals(providerInfo.authority)) {
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
    }

    /* renamed from: b */
    public static C5298l m21578b() {
        return f17314d;
    }

    /* renamed from: c */
    public static boolean m21579c() {
        return f17315e.get();
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        m21577a(providerInfo);
        super.attachInfo(context, providerInfo);
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        try {
            f17315e.set(true);
            if (C5270e.m20807q(getContext()) == null) {
                Log.i("FirebaseInitProvider", "FirebaseApp initialization unsuccessful");
            } else {
                Log.i("FirebaseInitProvider", "FirebaseApp initialization successful");
            }
            return false;
        } finally {
            f17315e.set(false);
        }
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
