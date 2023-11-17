package androidx.work.impl;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import p190o1.C7386m;
import p190o1.C7399v;
import p190o1.C7417y;

/* renamed from: androidx.work.impl.w */
public final class C2061w {

    /* renamed from: a */
    private final Object f6196a = new Object();

    /* renamed from: b */
    private final Map f6197b = new LinkedHashMap();

    /* renamed from: a */
    public final boolean mo6912a(C7386m mVar) {
        boolean containsKey;
        C41536l.m120489i(mVar, "id");
        synchronized (this.f6196a) {
            containsKey = this.f6197b.containsKey(mVar);
        }
        return containsKey;
    }

    /* renamed from: b */
    public final C2060v mo6913b(C7386m mVar) {
        C2060v vVar;
        C41536l.m120489i(mVar, "id");
        synchronized (this.f6196a) {
            vVar = (C2060v) this.f6197b.remove(mVar);
        }
        return vVar;
    }

    /* renamed from: c */
    public final List mo6914c(String str) {
        List z0;
        C41536l.m120489i(str, "workSpecId");
        synchronized (this.f6196a) {
            Map map = this.f6197b;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (C41536l.m120484d(((C7386m) entry.getKey()).mo21770b(), str)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            for (C7386m remove : linkedHashMap.keySet()) {
                this.f6197b.remove(remove);
            }
            z0 = C41358y.m120036z0(linkedHashMap.values());
        }
        return z0;
    }

    /* renamed from: d */
    public final C2060v mo6915d(C7386m mVar) {
        C2060v vVar;
        C41536l.m120489i(mVar, "id");
        synchronized (this.f6196a) {
            Map map = this.f6197b;
            Object obj = map.get(mVar);
            if (obj == null) {
                obj = new C2060v(mVar);
                map.put(mVar, obj);
            }
            vVar = (C2060v) obj;
        }
        return vVar;
    }

    /* renamed from: e */
    public final C2060v mo6916e(C7399v vVar) {
        C41536l.m120489i(vVar, "spec");
        return mo6915d(C7417y.m28225a(vVar));
    }
}
