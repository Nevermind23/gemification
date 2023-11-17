package com.google.gson;

import com.google.gson.internal.C5497a;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p316xa.C8982a;

/* renamed from: com.google.gson.d */
public final class C5490d {

    /* renamed from: a */
    private Excluder f17540a = Excluder.f17562j;

    /* renamed from: b */
    private C5614n f17541b = C5614n.DEFAULT;

    /* renamed from: c */
    private C5489c f17542c = C5481b.IDENTITY;

    /* renamed from: d */
    private final Map f17543d = new HashMap();

    /* renamed from: e */
    private final List f17544e = new ArrayList();

    /* renamed from: f */
    private final List f17545f = new ArrayList();

    /* renamed from: g */
    private boolean f17546g = false;

    /* renamed from: h */
    private String f17547h = Gson.f17499z;

    /* renamed from: i */
    private int f17548i = 2;

    /* renamed from: j */
    private int f17549j = 2;

    /* renamed from: k */
    private boolean f17550k = false;

    /* renamed from: l */
    private boolean f17551l = false;

    /* renamed from: m */
    private boolean f17552m = true;

    /* renamed from: n */
    private boolean f17553n = false;

    /* renamed from: o */
    private boolean f17554o = false;

    /* renamed from: p */
    private boolean f17555p = false;

    /* renamed from: q */
    private boolean f17556q = true;

    /* renamed from: r */
    private C5623q f17557r = Gson.f17497B;

    /* renamed from: s */
    private C5623q f17558s = Gson.f17498C;

    /* renamed from: t */
    private final LinkedList f17559t = new LinkedList();

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m21873a(java.lang.String r5, int r6, int r7, java.util.List r8) {
        /*
            r4 = this;
            boolean r0 = com.google.gson.internal.sql.C5607a.f17795a
            r1 = 0
            if (r5 == 0) goto L_0x0026
            java.lang.String r2 = r5.trim()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0026
            com.google.gson.internal.bind.DefaultDateTypeAdapter$b r6 = com.google.gson.internal.bind.DefaultDateTypeAdapter.C5505b.f17592b
            com.google.gson.r r6 = r6.mo18254b(r5)
            if (r0 == 0) goto L_0x0024
            com.google.gson.internal.bind.DefaultDateTypeAdapter$b r7 = com.google.gson.internal.sql.C5607a.f17797c
            com.google.gson.r r1 = r7.mo18254b(r5)
            com.google.gson.internal.bind.DefaultDateTypeAdapter$b r7 = com.google.gson.internal.sql.C5607a.f17796b
            com.google.gson.r r5 = r7.mo18254b(r5)
            goto L_0x0045
        L_0x0024:
            r5 = r1
            goto L_0x0045
        L_0x0026:
            r5 = 2
            if (r6 == r5) goto L_0x0050
            if (r7 == r5) goto L_0x0050
            com.google.gson.internal.bind.DefaultDateTypeAdapter$b r5 = com.google.gson.internal.bind.DefaultDateTypeAdapter.C5505b.f17592b
            com.google.gson.r r5 = r5.mo18253a(r6, r7)
            if (r0 == 0) goto L_0x0043
            com.google.gson.internal.bind.DefaultDateTypeAdapter$b r1 = com.google.gson.internal.sql.C5607a.f17797c
            com.google.gson.r r1 = r1.mo18253a(r6, r7)
            com.google.gson.internal.bind.DefaultDateTypeAdapter$b r2 = com.google.gson.internal.sql.C5607a.f17796b
            com.google.gson.r r6 = r2.mo18253a(r6, r7)
            r3 = r6
            r6 = r5
            r5 = r3
            goto L_0x0045
        L_0x0043:
            r6 = r5
            goto L_0x0024
        L_0x0045:
            r8.add(r6)
            if (r0 == 0) goto L_0x0050
            r8.add(r1)
            r8.add(r5)
        L_0x0050:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.C5490d.m21873a(java.lang.String, int, int, java.util.List):void");
    }

    /* renamed from: b */
    public Gson mo18203b() {
        ArrayList arrayList = r1;
        ArrayList arrayList2 = new ArrayList(this.f17544e.size() + this.f17545f.size() + 3);
        arrayList2.addAll(this.f17544e);
        Collections.reverse(arrayList2);
        ArrayList arrayList3 = new ArrayList(this.f17545f);
        Collections.reverse(arrayList3);
        arrayList2.addAll(arrayList3);
        m21873a(this.f17547h, this.f17548i, this.f17549j, arrayList2);
        Excluder excluder = this.f17540a;
        C5489c cVar = this.f17542c;
        HashMap hashMap = r5;
        HashMap hashMap2 = new HashMap(this.f17543d);
        boolean z = this.f17546g;
        boolean z2 = this.f17550k;
        boolean z3 = this.f17554o;
        boolean z4 = this.f17552m;
        boolean z5 = this.f17553n;
        boolean z6 = this.f17555p;
        boolean z7 = this.f17551l;
        boolean z8 = this.f17556q;
        C5614n nVar = this.f17541b;
        String str = this.f17547h;
        int i = this.f17548i;
        int i2 = this.f17549j;
        ArrayList arrayList4 = r1;
        Excluder excluder2 = excluder;
        ArrayList arrayList5 = new ArrayList(this.f17544e);
        ArrayList arrayList6 = r1;
        ArrayList arrayList7 = new ArrayList(this.f17545f);
        C5623q qVar = this.f17557r;
        C5623q qVar2 = this.f17558s;
        ArrayList arrayList8 = r1;
        ArrayList arrayList9 = new ArrayList(this.f17559t);
        return new Gson(excluder2, cVar, hashMap, z, z2, z3, z4, z5, z6, z7, z8, nVar, str, i, i2, arrayList4, arrayList6, arrayList, qVar, qVar2, arrayList8);
    }

    /* renamed from: c */
    public C5490d mo18204c() {
        this.f17540a = this.f17540a.mo18230g();
        return this;
    }

    /* renamed from: d */
    public C5490d mo18205d(Type type, Object obj) {
        boolean z;
        Objects.requireNonNull(type);
        if ((obj instanceof C5493g) || (obj instanceof TypeAdapter)) {
            z = true;
        } else {
            z = false;
        }
        C5497a.m21910a(z);
        if (obj instanceof C5493g) {
            this.f17544e.add(TreeTypeAdapter.m22009g(C8982a.get(type), obj));
        }
        if (obj instanceof TypeAdapter) {
            this.f17544e.add(TypeAdapters.m22020c(C8982a.get(type), (TypeAdapter) obj));
        }
        return this;
    }
}
