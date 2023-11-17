package com.bumptech.glide;

import p063e4.C6030c;
import p063e4.C6034e;
import p089g4.C6223k;
import p089g4.C6224l;

/* renamed from: com.bumptech.glide.l */
public abstract class C2400l implements Cloneable {

    /* renamed from: d */
    private C6034e f7627d = C6030c.m24153c();

    /* renamed from: c */
    private C2400l m9308c() {
        return this;
    }

    /* renamed from: a */
    public final C2400l clone() {
        try {
            return (C2400l) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C6034e mo7763b() {
        return this.f7627d;
    }

    /* renamed from: d */
    public final C2400l mo7765d(C6034e eVar) {
        this.f7627d = (C6034e) C6223k.m24730d(eVar);
        return m9308c();
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2400l) {
            return C6224l.m24735d(this.f7627d, ((C2400l) obj).f7627d);
        }
        return false;
    }

    public int hashCode() {
        C6034e eVar = this.f7627d;
        if (eVar != null) {
            return eVar.hashCode();
        }
        return 0;
    }
}
