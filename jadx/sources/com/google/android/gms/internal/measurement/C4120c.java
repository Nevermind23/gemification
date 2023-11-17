package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.c */
public final class C4120c {

    /* renamed from: a */
    private C4103b f13169a;

    /* renamed from: b */
    private C4103b f13170b;

    /* renamed from: c */
    private final List f13171c;

    public C4120c() {
        this.f13169a = new C4103b("", 0, (Map) null);
        this.f13170b = new C4103b("", 0, (Map) null);
        this.f13171c = new ArrayList();
    }

    /* renamed from: a */
    public final C4103b mo12958a() {
        return this.f13169a;
    }

    /* renamed from: b */
    public final C4103b mo12959b() {
        return this.f13170b;
    }

    /* renamed from: c */
    public final List mo12960c() {
        return this.f13171c;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        C4120c cVar = new C4120c(this.f13169a.clone());
        for (C4103b b : this.f13171c) {
            cVar.f13171c.add(b.clone());
        }
        return cVar;
    }

    /* renamed from: d */
    public final void mo12962d(C4103b bVar) {
        this.f13169a = bVar;
        this.f13170b = bVar.clone();
        this.f13171c.clear();
    }

    /* renamed from: e */
    public final void mo12963e(String str, long j, Map map) {
        this.f13171c.add(new C4103b(str, j, map));
    }

    /* renamed from: f */
    public final void mo12964f(C4103b bVar) {
        this.f13170b = bVar;
    }

    public C4120c(C4103b bVar) {
        this.f13169a = bVar;
        this.f13170b = bVar.clone();
        this.f13171c = new ArrayList();
    }
}
