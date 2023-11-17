package com.facetec.sdk;

import android.content.Context;
import com.facetec.sdk.C3555s;
import java.util.ArrayList;

/* renamed from: com.facetec.sdk.wj */
public final /* synthetic */ class C3668wj implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C3401m f11689d;

    /* renamed from: e */
    public final /* synthetic */ C3555s.C3562d f11690e;

    /* renamed from: f */
    public final /* synthetic */ boolean f11691f;

    /* renamed from: g */
    public final /* synthetic */ Context f11692g;

    /* renamed from: h */
    public final /* synthetic */ String f11693h;

    /* renamed from: i */
    public final /* synthetic */ ArrayList f11694i;

    /* renamed from: j */
    public final /* synthetic */ String f11695j;

    public /* synthetic */ C3668wj(C3401m mVar, C3555s.C3562d dVar, boolean z, Context context, String str, ArrayList arrayList, String str2) {
        this.f11689d = mVar;
        this.f11690e = dVar;
        this.f11691f = z;
        this.f11692g = context;
        this.f11693h = str;
        this.f11694i = arrayList;
        this.f11695j = str2;
    }

    public final void run() {
        this.f11689d.m13552a(this.f11690e, this.f11691f, this.f11692g, this.f11693h, this.f11694i, this.f11695j);
    }
}
