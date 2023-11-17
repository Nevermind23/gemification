package com.facetec.sdk;

import com.guardsquare.dexguard.annotation.EncryptStrings;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

@EncryptStrings
/* renamed from: com.facetec.sdk.o */
public class C3471o {

    /* renamed from: a */
    C3583t f11326a;

    /* renamed from: b */
    String f11327b;

    /* renamed from: c */
    String f11328c;

    /* renamed from: d */
    String f11329d;

    /* renamed from: e */
    ArrayList<String> f11330e;

    /* renamed from: f */
    int f11331f;

    /* renamed from: g */
    String f11332g;

    /* renamed from: i */
    String f11333i;

    /* renamed from: j */
    String f11334j;

    public /* synthetic */ C3471o() {
    }

    C3471o(String str, C3583t tVar, ArrayList<String> arrayList, String str2, String str3, String str4, String str5, String str6) {
        this.f11328c = str;
        this.f11326a = tVar;
        this.f11330e = arrayList;
        this.f11329d = str2;
        this.f11327b = str3;
        this.f11333i = str4;
        this.f11334j = str5;
        this.f11332g = str6;
        this.f11331f = 0;
    }

    /* renamed from: a */
    static C3471o m13874a(byte[] bArr) {
        return (C3471o) new C2981dy().mo9141b().mo9142c().mo9137e(new String(bArr, 0, bArr.length, StandardCharsets.UTF_8), C3471o.class);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final byte[] mo9948d() {
        return new C2981dy().mo9141b().mo9142c().mo9135c((Object) this).getBytes(StandardCharsets.UTF_8);
    }
}
