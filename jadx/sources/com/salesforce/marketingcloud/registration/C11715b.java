package com.salesforce.marketingcloud.registration;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: com.salesforce.marketingcloud.registration.b */
class C11715b implements Map<String, String> {

    /* renamed from: a */
    private final HashMap<String, String> f33969a;

    /* renamed from: b */
    private final TreeMap<String, String> f33970b;

    C11715b() {
        this.f33969a = new HashMap<>();
        this.f33970b = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
    }

    /* renamed from: a */
    public String get(Object obj) {
        String str = this.f33970b.get(obj);
        if (str != null) {
            return this.f33969a.get(str);
        }
        return null;
    }

    /* renamed from: b */
    public String remove(Object obj) {
        return this.f33969a.remove(this.f33970b.remove(obj));
    }

    public void clear() {
        this.f33969a.clear();
        this.f33970b.clear();
    }

    public boolean containsKey(Object obj) {
        return this.f33970b.containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return this.f33969a.containsValue(obj);
    }

    public Set<Map.Entry<String, String>> entrySet() {
        return this.f33969a.entrySet();
    }

    public boolean isEmpty() {
        return this.f33969a.isEmpty();
    }

    public Set<String> keySet() {
        return this.f33969a.keySet();
    }

    public void putAll(Map<? extends String, ? extends String> map) {
        if (map != null && !map.isEmpty()) {
            for (Map.Entry next : map.entrySet()) {
                put((String) next.getKey(), (String) next.getValue());
            }
        }
    }

    public int size() {
        return this.f33969a.size();
    }

    public Collection<String> values() {
        return this.f33969a.values();
    }

    C11715b(Map<String, String> map) {
        this();
        if (map != null) {
            this.f33969a.putAll(map);
            for (String next : this.f33969a.keySet()) {
                this.f33970b.put(next, next);
            }
        }
    }

    /* renamed from: a */
    public String put(String str, String str2) {
        String str3 = null;
        if (str == null) {
            return null;
        }
        String str4 = this.f33970b.get(str);
        if (str4 != null) {
            str3 = this.f33969a.remove(str4);
        }
        this.f33970b.put(str, str);
        this.f33969a.put(str, str2);
        return str3;
    }
}
