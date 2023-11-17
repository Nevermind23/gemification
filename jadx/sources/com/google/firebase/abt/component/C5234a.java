package com.google.firebase.abt.component;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import p275u8.C8648b;
import p327y9.C9142b;

/* renamed from: com.google.firebase.abt.component.a */
public class C5234a {

    /* renamed from: a */
    private final Map f16784a = new HashMap();

    /* renamed from: b */
    private final Context f16785b;

    /* renamed from: c */
    private final C9142b f16786c;

    protected C5234a(Context context, C9142b bVar) {
        this.f16785b = context;
        this.f16786c = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C8648b mo17401a(String str) {
        return new C8648b(this.f16785b, this.f16786c, str);
    }

    /* renamed from: b */
    public synchronized C8648b mo17402b(String str) {
        if (!this.f16784a.containsKey(str)) {
            this.f16784a.put(str, mo17401a(str));
        }
        return (C8648b) this.f16784a.get(str);
    }
}
