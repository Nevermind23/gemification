package com.salesforce.marketingcloud.sfmcsdk;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.lifecycle.C1565c0;
import androidx.lifecycle.C1593j;
import com.salesforce.marketingcloud.sfmcsdk.components.behaviors.LifecycleListener;
import kotlin.jvm.internal.C41536l;

public final class SFMCSdkInitContentProvider extends ContentProvider {
    public int delete(Uri uri, String str, String[] strArr) {
        C41536l.m120489i(uri, "uri");
        return 0;
    }

    public String getType(Uri uri) {
        C41536l.m120489i(uri, "uri");
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        C41536l.m120489i(uri, "uri");
        return null;
    }

    public boolean onCreate() {
        Context applicationContext;
        Context context = getContext();
        if (context == null || (applicationContext = context.getApplicationContext()) == null) {
            return true;
        }
        SFMCSdk.Companion.getBehaviorManager$sfmcsdk_release().initIfNecessary$sfmcsdk_release(applicationContext);
        C1593j lifecycle = C1565c0.m5569l().getLifecycle();
        LifecycleListener.Companion companion = LifecycleListener.Companion;
        lifecycle.mo4906a(companion.getInstance(applicationContext));
        ((Application) applicationContext).registerActivityLifecycleCallbacks(companion.getInstance(applicationContext));
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        C41536l.m120489i(uri, "uri");
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        C41536l.m120489i(uri, "uri");
        return 0;
    }
}
