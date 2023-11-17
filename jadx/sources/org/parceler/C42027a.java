package org.parceler;

import java.util.ArrayList;
import java.util.List;

/* renamed from: org.parceler.a */
public final class C42027a {

    /* renamed from: b */
    private static final Object f98783b = new Object();

    /* renamed from: a */
    private final List f98784a = new ArrayList();

    public C42027a() {
        mo97500e((Object) null);
    }

    /* renamed from: a */
    public boolean mo97496a(int i) {
        return i < this.f98784a.size();
    }

    /* renamed from: b */
    public Object mo97497b(int i) {
        return this.f98784a.get(i);
    }

    /* renamed from: c */
    public int mo97498c(Object obj) {
        for (int i = 0; i < this.f98784a.size(); i++) {
            if (this.f98784a.get(i) == obj) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: d */
    public boolean mo97499d(int i) {
        return this.f98784a.get(i) == f98783b;
    }

    /* renamed from: e */
    public int mo97500e(Object obj) {
        this.f98784a.add(obj);
        return this.f98784a.size() - 1;
    }

    /* renamed from: f */
    public void mo97501f(int i, Object obj) {
        if (this.f98784a.size() > i) {
            this.f98784a.remove(i);
        }
        this.f98784a.add(i, obj);
    }

    /* renamed from: g */
    public int mo97502g() {
        return mo97500e(f98783b);
    }
}
