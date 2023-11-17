package jg1;

import java.lang.reflect.Method;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: jg1.n */
public class C41454n {

    /* renamed from: a */
    final Method f97569a;

    /* renamed from: b */
    final ThreadMode f97570b;

    /* renamed from: c */
    final Class f97571c;

    /* renamed from: d */
    final int f97572d;

    /* renamed from: e */
    final boolean f97573e;

    /* renamed from: f */
    String f97574f;

    public C41454n(Method method, Class cls, ThreadMode threadMode, int i, boolean z) {
        this.f97569a = method;
        this.f97570b = threadMode;
        this.f97571c = cls;
        this.f97572d = i;
        this.f97573e = z;
    }

    /* renamed from: a */
    private synchronized void m120272a() {
        if (this.f97574f == null) {
            StringBuilder sb = new StringBuilder(64);
            sb.append(this.f97569a.getDeclaringClass().getName());
            sb.append('#');
            sb.append(this.f97569a.getName());
            sb.append('(');
            sb.append(this.f97571c.getName());
            this.f97574f = sb.toString();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C41454n)) {
            return false;
        }
        m120272a();
        C41454n nVar = (C41454n) obj;
        nVar.m120272a();
        return this.f97574f.equals(nVar.f97574f);
    }

    public int hashCode() {
        return this.f97569a.hashCode();
    }
}
