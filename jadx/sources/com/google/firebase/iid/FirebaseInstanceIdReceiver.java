package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.firebase.messaging.C5322e0;
import com.google.firebase.messaging.C5342m;
import java.util.concurrent.ExecutionException;
import p117i6.C6572a;
import p337z7.C9231i;

public final class FirebaseInstanceIdReceiver extends C6572a {
    /* renamed from: g */
    private static Intent m20833g(Context context, String str, Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo17491b(Context context, CloudMessage cloudMessage) {
        try {
            return ((Integer) C9231i.m34107a(new C5342m(context).mo17613i(cloudMessage.mo11820v()))).intValue();
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e);
            return 500;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo17492c(Context context, Bundle bundle) {
        Intent g = m20833g(context, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle);
        if (C5322e0.m21030A(g)) {
            C5322e0.m21050s(g);
        }
    }
}
