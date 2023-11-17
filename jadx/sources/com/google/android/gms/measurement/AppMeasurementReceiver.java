package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import p137k0.C6770a;
import p248s7.C8256j;
import p248s7.C8257k;

public final class AppMeasurementReceiver extends C6770a implements C8256j {

    /* renamed from: c */
    private C8257k f14172c;

    /* renamed from: a */
    public void mo14272a(Context context, Intent intent) {
        C6770a.m26402c(context, intent);
    }

    public void onReceive(Context context, Intent intent) {
        if (this.f14172c == null) {
            this.f14172c = new C8257k(this);
        }
        this.f14172c.mo23440a(context, intent);
    }
}
