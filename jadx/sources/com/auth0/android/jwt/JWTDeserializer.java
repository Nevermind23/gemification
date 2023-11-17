package com.auth0.android.jwt;

import com.google.gson.C5491e;
import com.google.gson.C5492f;
import com.google.gson.C5493g;
import com.google.gson.C5494h;
import com.google.gson.C5610j;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class JWTDeserializer implements C5493g {
    JWTDeserializer() {
    }

    /* renamed from: c */
    private Date m9171c(C5610j jVar, String str) {
        if (!jVar.mo18451z(str)) {
            return null;
        }
        return new Date(jVar.mo18450x(str).mo18210j() * 1000);
    }

    /* renamed from: d */
    private String m9172d(C5610j jVar, String str) {
        if (!jVar.mo18451z(str)) {
            return null;
        }
        return jVar.mo18450x(str).mo18211k();
    }

    /* renamed from: e */
    private List m9173e(C5610j jVar, String str) {
        List emptyList = Collections.emptyList();
        if (!jVar.mo18451z(str)) {
            return emptyList;
        }
        C5494h x = jVar.mo18450x(str);
        if (!x.mo18218l()) {
            return Collections.singletonList(x.mo18211k());
        }
        C5491e c = x.mo18215c();
        ArrayList arrayList = new ArrayList(c.size());
        for (int i = 0; i < c.size(); i++) {
            arrayList.add(c.mo18214w(i).mo18211k());
        }
        return arrayList;
    }

    /* renamed from: b */
    public C2377d mo7657a(C5494h hVar, Type type, C5492f fVar) {
        if (hVar.mo18219n() || !hVar.mo18220o()) {
            throw new DecodeException("The token's payload had an invalid JSON format.");
        }
        C5610j g = hVar.mo18216g();
        String d = m9172d(g, "iss");
        String d2 = m9172d(g, "sub");
        Date c = m9171c(g, "exp");
        Date c2 = m9171c(g, "nbf");
        Date c3 = m9171c(g, "iat");
        String d3 = m9172d(g, "jti");
        List e = m9173e(g, "aud");
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : g.mo18449w()) {
            hashMap.put(entry.getKey(), new C2376c((C5494h) entry.getValue()));
        }
        return new C2377d(d, d2, c, c2, c3, d3, e, hashMap);
    }
}
