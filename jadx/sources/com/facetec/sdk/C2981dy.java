package com.facetec.sdk;

import java.lang.reflect.Type;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.facetec.sdk.dy */
public final class C2981dy {

    /* renamed from: a */
    private C2970dt f10077a = C2963ds.f10044d;

    /* renamed from: b */
    private final List<C3013eo> f10078b = new ArrayList();

    /* renamed from: c */
    private C3015eq f10079c = C3015eq.f10136a;

    /* renamed from: d */
    private C3001ef f10080d = C3001ef.f10132b;

    /* renamed from: e */
    private final Map<Type, C2979dw<?>> f10081e = new HashMap();

    /* renamed from: f */
    private final List<C3013eo> f10082f = new ArrayList();

    /* renamed from: g */
    private String f10083g;

    /* renamed from: h */
    private boolean f10084h = false;

    /* renamed from: i */
    private int f10085i = 2;

    /* renamed from: j */
    private int f10086j = 2;

    /* renamed from: k */
    private boolean f10087k = true;

    /* renamed from: l */
    private boolean f10088l = false;

    /* renamed from: m */
    private boolean f10089m = false;

    /* renamed from: n */
    private boolean f10090n = false;

    /* renamed from: o */
    private boolean f10091o = false;

    /* renamed from: t */
    private boolean f10092t = false;

    /* renamed from: b */
    public final C2981dy mo9141b() {
        this.f10087k = false;
        return this;
    }

    /* renamed from: c */
    public final C2972dv mo9142c() {
        ArrayList arrayList = r1;
        ArrayList arrayList2 = new ArrayList(this.f10078b.size() + this.f10082f.size() + 3);
        arrayList2.addAll(this.f10078b);
        Collections.reverse(arrayList2);
        ArrayList arrayList3 = new ArrayList(this.f10082f);
        Collections.reverse(arrayList3);
        arrayList2.addAll(arrayList3);
        m12559b(this.f10083g, this.f10085i, this.f10086j, arrayList2);
        return new C2972dv(this.f10079c, this.f10077a, this.f10081e, this.f10084h, this.f10089m, this.f10088l, this.f10087k, this.f10091o, this.f10092t, this.f10090n, this.f10080d, this.f10083g, this.f10085i, this.f10086j, this.f10078b, this.f10082f, arrayList);
    }

    /* renamed from: b */
    private static void m12559b(String str, int i, int i2, List<C3013eo> list) {
        C2971du duVar;
        C2971du duVar2;
        C2971du duVar3;
        Class<Date> cls = Date.class;
        Class<Timestamp> cls2 = Timestamp.class;
        Class<java.util.Date> cls3 = java.util.Date.class;
        if (str != null && !"".equals(str.trim())) {
            duVar2 = new C2971du(cls3, str);
            duVar = new C2971du(cls2, str);
            duVar3 = new C2971du(cls, str);
        } else if (i != 2 && i2 != 2) {
            C2971du duVar4 = new C2971du(cls3, i, i2);
            C2971du duVar5 = new C2971du(cls2, i, i2);
            C2971du duVar6 = new C2971du(cls, i, i2);
            duVar2 = duVar4;
            duVar = duVar5;
            duVar3 = duVar6;
        } else {
            return;
        }
        list.add(C3096fp.m12797c(cls3, duVar2));
        list.add(C3096fp.m12797c(cls2, duVar));
        list.add(C3096fp.m12797c(cls, duVar3));
    }
}
