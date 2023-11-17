package org.slf4j.helpers;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;
import vh1.C43168a;
import wh1.C43242a;
import wh1.C43244c;

/* renamed from: org.slf4j.helpers.e */
public class C42046e implements C43168a {

    /* renamed from: d */
    private final String f98793d;

    /* renamed from: e */
    private volatile C43168a f98794e;

    /* renamed from: f */
    private Boolean f98795f;

    /* renamed from: g */
    private Method f98796g;

    /* renamed from: h */
    private C43242a f98797h;

    /* renamed from: i */
    private Queue f98798i;

    /* renamed from: j */
    private final boolean f98799j;

    public C42046e(String str, Queue queue, boolean z) {
        this.f98793d = str;
        this.f98798i = queue;
        this.f98799j = z;
    }

    /* renamed from: i */
    private C43168a m122138i() {
        if (this.f98797h == null) {
            this.f98797h = new C43242a(this, this.f98798i);
        }
        return this.f98797h;
    }

    /* renamed from: a */
    public void mo97512a(String str, Throwable th) {
        mo97522h().mo97512a(str, th);
    }

    /* renamed from: b */
    public void mo97513b(String str) {
        mo97522h().mo97513b(str);
    }

    /* renamed from: c */
    public void mo97514c(String str, Object obj, Object obj2) {
        mo97522h().mo97514c(str, obj, obj2);
    }

    /* renamed from: d */
    public boolean mo97515d() {
        return mo97522h().mo97515d();
    }

    /* renamed from: e */
    public void mo97516e(String str, Throwable th) {
        mo97522h().mo97516e(str, th);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !this.f98793d.equals(((C42046e) obj).f98793d)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public void mo97517f(String str, Object obj) {
        mo97522h().mo97517f(str, obj);
    }

    /* renamed from: g */
    public void mo97518g(String str) {
        mo97522h().mo97518g(str);
    }

    public String getName() {
        return this.f98793d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C43168a mo97522h() {
        if (this.f98794e != null) {
            return this.f98794e;
        }
        if (this.f98799j) {
            return C42043b.f98792d;
        }
        return m122138i();
    }

    public int hashCode() {
        return this.f98793d.hashCode();
    }

    /* renamed from: j */
    public boolean mo97524j() {
        Boolean bool = this.f98795f;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f98796g = this.f98794e.getClass().getMethod("log", new Class[]{C43244c.class});
            this.f98795f = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f98795f = Boolean.FALSE;
        }
        return this.f98795f.booleanValue();
    }

    /* renamed from: k */
    public boolean mo97525k() {
        return this.f98794e instanceof C42043b;
    }

    /* renamed from: l */
    public boolean mo97526l() {
        return this.f98794e == null;
    }

    /* renamed from: m */
    public void mo97527m(C43244c cVar) {
        if (mo97524j()) {
            try {
                this.f98796g.invoke(this.f98794e, new Object[]{cVar});
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }

    /* renamed from: n */
    public void mo97528n(C43168a aVar) {
        this.f98794e = aVar;
    }
}
