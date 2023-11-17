package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.core.util.C1005e;
import com.bumptech.glide.load.data.C2417e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p089g4.C6223k;
import p166m3.C7088h;
import p166m3.C7090j;
import p192o3.C7430c;
import p333z3.C9203e;

/* renamed from: com.bumptech.glide.load.engine.i */
public class C2455i {

    /* renamed from: a */
    private final Class f7778a;

    /* renamed from: b */
    private final List f7779b;

    /* renamed from: c */
    private final C9203e f7780c;

    /* renamed from: d */
    private final C1005e f7781d;

    /* renamed from: e */
    private final String f7782e;

    /* renamed from: com.bumptech.glide.load.engine.i$a */
    interface C2456a {
        /* renamed from: a */
        C7430c mo7890a(C7430c cVar);
    }

    public C2455i(Class cls, Class cls2, Class cls3, List list, C9203e eVar, C1005e eVar2) {
        this.f7778a = cls;
        this.f7779b = list;
        this.f7780c = eVar;
        this.f7781d = eVar2;
        this.f7782e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: b */
    private C7430c m9512b(C2417e eVar, int i, int i2, C7088h hVar) {
        List list = (List) C6223k.m24730d(this.f7781d.mo3440b());
        try {
            return m9513c(eVar, i, i2, hVar, list);
        } finally {
            this.f7781d.mo3439a(list);
        }
    }

    /* renamed from: c */
    private C7430c m9513c(C2417e eVar, int i, int i2, C7088h hVar, List list) {
        int size = this.f7779b.size();
        C7430c cVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            C7090j jVar = (C7090j) this.f7779b.get(i3);
            try {
                if (jVar.mo7971a(eVar.mo7774a(), hVar)) {
                    cVar = jVar.mo7972b(eVar.mo7774a(), i, i2, hVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + jVar, e);
                }
                list.add(e);
            }
            if (cVar != null) {
                break;
            }
        }
        if (cVar != null) {
            return cVar;
        }
        throw new GlideException(this.f7782e, (List) new ArrayList(list));
    }

    /* renamed from: a */
    public C7430c mo7900a(C2417e eVar, int i, int i2, C7088h hVar, C2456a aVar) {
        return this.f7780c.mo24838a(aVar.mo7890a(m9512b(eVar, i, i2, hVar)), hVar);
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f7778a + ", decoders=" + this.f7779b + ", transcoder=" + this.f7780c + '}';
    }
}
