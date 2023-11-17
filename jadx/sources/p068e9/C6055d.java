package p068e9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p027b9.C2184f;

/* renamed from: e9.d */
class C6055d {

    /* renamed from: a */
    private final Float f18842a;

    /* renamed from: b */
    private final boolean f18843b;

    private C6055d(Float f, boolean z) {
        this.f18843b = z;
        this.f18842a = f;
    }

    /* renamed from: a */
    public static C6055d m24184a(Context context) {
        boolean z = false;
        Float f = null;
        try {
            Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                z = m24186e(registerReceiver);
                f = m24185d(registerReceiver);
            }
        } catch (IllegalStateException e) {
            C2184f.m8346f().mo7092e("An error occurred getting battery state.", e);
        }
        return new C6055d(f, z);
    }

    /* renamed from: d */
    private static Float m24185d(Intent intent) {
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return null;
        }
        return Float.valueOf(((float) intExtra) / ((float) intExtra2));
    }

    /* renamed from: e */
    private static boolean m24186e(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra == -1) {
            return false;
        }
        if (intExtra == 2 || intExtra == 5) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public Float mo19546b() {
        return this.f18842a;
    }

    /* renamed from: c */
    public int mo19547c() {
        Float f;
        if (!this.f18843b || (f = this.f18842a) == null) {
            return 1;
        }
        if (((double) f.floatValue()) < 0.99d) {
            return 2;
        }
        return 3;
    }
}
