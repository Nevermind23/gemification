package com.auth0.android.jwt;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* renamed from: com.auth0.android.jwt.d */
class C2377d {

    /* renamed from: a */
    final String f7518a;

    /* renamed from: b */
    final String f7519b;

    /* renamed from: c */
    final Date f7520c;

    /* renamed from: d */
    final Date f7521d;

    /* renamed from: e */
    final Date f7522e;

    /* renamed from: f */
    final String f7523f;

    /* renamed from: g */
    final List f7524g;

    /* renamed from: h */
    final Map f7525h;

    C2377d(String str, String str2, Date date, Date date2, Date date3, String str3, List list, Map map) {
        this.f7518a = str;
        this.f7519b = str2;
        this.f7520c = date;
        this.f7521d = date2;
        this.f7522e = date3;
        this.f7523f = str3;
        this.f7524g = list;
        this.f7525h = Collections.unmodifiableMap(map);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2375b mo7661a(String str) {
        C2375b bVar = (C2375b) this.f7525h.get(str);
        if (bVar != null) {
            return bVar;
        }
        return new C2374a();
    }
}
