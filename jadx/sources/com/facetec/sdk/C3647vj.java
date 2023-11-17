package com.facetec.sdk;

import android.content.Context;
import com.facetec.sdk.C3555s;
import java.util.ArrayList;

/* renamed from: com.facetec.sdk.vj */
public final /* synthetic */ class C3647vj implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C3401m f11654d;

    /* renamed from: e */
    public final /* synthetic */ C3555s.C3562d f11655e;

    /* renamed from: f */
    public final /* synthetic */ Context f11656f;

    /* renamed from: g */
    public final /* synthetic */ String f11657g;

    /* renamed from: h */
    public final /* synthetic */ ArrayList f11658h;

    public /* synthetic */ C3647vj(C3401m mVar, C3555s.C3562d dVar, Context context, String str, ArrayList arrayList) {
        this.f11654d = mVar;
        this.f11655e = dVar;
        this.f11656f = context;
        this.f11657g = str;
        this.f11658h = arrayList;
    }

    public final void run() {
        this.f11654d.m13558d(this.f11655e, this.f11656f, this.f11657g, this.f11658h);
    }
}
