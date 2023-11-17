package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import androidx.profileinstaller.C1694g;
import java.util.concurrent.Executor;
import p260t6.C8413o;
import p337z7.C9231i;
import p337z7.Task;

/* renamed from: com.google.firebase.messaging.m */
public class C5342m {

    /* renamed from: c */
    private static final Object f17071c = new Object();

    /* renamed from: d */
    private static C5329g1 f17072d;

    /* renamed from: a */
    private final Context f17073a;

    /* renamed from: b */
    private final Executor f17074b = new C1694g();

    public C5342m(Context context) {
        this.f17073a = context;
    }

    /* renamed from: d */
    private static Task m21129d(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        if (C5352q0.m21157b().mo17631e(context)) {
            C5311b1.m20997f(context, m21130e(context, "com.google.firebase.MESSAGING_EVENT"), intent);
        } else {
            m21130e(context, "com.google.firebase.MESSAGING_EVENT").mo17600c(intent);
        }
        return C9231i.m34113g(-1);
    }

    /* renamed from: e */
    private static C5329g1 m21130e(Context context, String str) {
        C5329g1 g1Var;
        synchronized (f17071c) {
            if (f17072d == null) {
                f17072d = new C5329g1(context, str);
            }
            g1Var = f17072d;
        }
        return g1Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ Task m21133h(Context context, Intent intent, Task task) {
        if (!C8413o.m31570h() || ((Integer) task.mo24869n()).intValue() != 402) {
            return task;
        }
        return m21129d(context, intent).mo24865j(new C1694g(), new C5340l());
    }

    /* renamed from: i */
    public Task mo17613i(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return mo17614j(this.f17073a, intent);
    }

    /* renamed from: j */
    public Task mo17614j(Context context, Intent intent) {
        boolean z;
        boolean z2 = true;
        if (!C8413o.m31570h() || context.getApplicationInfo().targetSdkVersion < 26) {
            z = false;
        } else {
            z = true;
        }
        if ((intent.getFlags() & 268435456) == 0) {
            z2 = false;
        }
        if (!z || z2) {
            return C9231i.m34110d(this.f17074b, new C5336j(context, intent)).mo24867l(this.f17074b, new C5338k(context, intent));
        }
        return m21129d(context, intent);
    }
}
