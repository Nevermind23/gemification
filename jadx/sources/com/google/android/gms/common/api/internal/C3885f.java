package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C3847a;
import com.google.android.gms.common.api.internal.C3877d;
import p337z7.C9227g;

/* renamed from: com.google.android.gms.common.api.internal.f */
public abstract class C3885f {

    /* renamed from: a */
    private final C3877d f12385a;

    /* renamed from: b */
    private final Feature[] f12386b;

    /* renamed from: c */
    private final boolean f12387c;

    /* renamed from: d */
    private final int f12388d;

    protected C3885f(C3877d dVar, Feature[] featureArr, boolean z, int i) {
        this.f12385a = dVar;
        this.f12386b = featureArr;
        this.f12387c = z;
        this.f12388d = i;
    }

    /* renamed from: a */
    public void mo12056a() {
        this.f12385a.mo12041a();
    }

    /* renamed from: b */
    public C3877d.C3878a mo12057b() {
        return this.f12385a.mo12042b();
    }

    /* renamed from: c */
    public Feature[] mo12058c() {
        return this.f12386b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo12059d(C3847a.C3849b bVar, C9227g gVar);

    /* renamed from: e */
    public final int mo12060e() {
        return this.f12388d;
    }

    /* renamed from: f */
    public final boolean mo12061f() {
        return this.f12387c;
    }
}
