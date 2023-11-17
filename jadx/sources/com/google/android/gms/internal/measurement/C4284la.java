package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.measurement.la */
public final class C4284la extends LinkedHashMap {

    /* renamed from: e */
    private static final C4284la f13453e;

    /* renamed from: d */
    private boolean f13454d = true;

    static {
        C4284la laVar = new C4284la();
        f13453e = laVar;
        laVar.f13454d = false;
    }

    private C4284la() {
    }

    /* renamed from: a */
    public static C4284la m16228a() {
        return f13453e;
    }

    /* renamed from: f */
    private static int m16229f(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = C4470w9.f13784d;
        int length = bArr.length;
        int b = C4470w9.m17096b(length, bArr, 0, length);
        if (b == 0) {
            return 1;
        }
        return b;
    }

    /* renamed from: h */
    private final void m16230h() {
        if (!this.f13454d) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: b */
    public final C4284la mo13322b() {
        return isEmpty() ? new C4284la() : new C4284la(this);
    }

    /* renamed from: c */
    public final void mo13323c() {
        this.f13454d = false;
    }

    public final void clear() {
        m16230h();
        super.clear();
    }

    /* renamed from: d */
    public final void mo13325d(C4284la laVar) {
        m16230h();
        if (!laVar.isEmpty()) {
            putAll(laVar);
        }
    }

    /* renamed from: e */
    public final boolean mo13326e() {
        return this.f13454d;
    }

    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(value instanceof byte[]) || !(obj2 instanceof byte[])) {
                z = value.equals(obj2);
                continue;
            } else {
                z = Arrays.equals((byte[]) value, (byte[]) obj2);
                continue;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += m16229f(entry.getValue()) ^ m16229f(entry.getKey());
        }
        return i;
    }

    public final Object put(Object obj, Object obj2) {
        m16230h();
        byte[] bArr = C4470w9.f13784d;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    public final void putAll(Map map) {
        m16230h();
        for (Object next : map.keySet()) {
            byte[] bArr = C4470w9.f13784d;
            next.getClass();
            map.get(next).getClass();
        }
        super.putAll(map);
    }

    public final Object remove(Object obj) {
        m16230h();
        return super.remove(obj);
    }

    private C4284la(Map map) {
        super(map);
    }
}
