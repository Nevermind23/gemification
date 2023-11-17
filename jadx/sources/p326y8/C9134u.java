package p326y8;

import p327y9.C9142b;

/* renamed from: y8.u */
public class C9134u implements C9142b {

    /* renamed from: c */
    private static final Object f25326c = new Object();

    /* renamed from: a */
    private volatile Object f25327a = f25326c;

    /* renamed from: b */
    private volatile C9142b f25328b;

    public C9134u(C9142b bVar) {
        this.f25328b = bVar;
    }

    public Object get() {
        Object obj = this.f25327a;
        Object obj2 = f25326c;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f25327a;
                if (obj == obj2) {
                    obj = this.f25328b.get();
                    this.f25327a = obj;
                    this.f25328b = null;
                }
            }
        }
        return obj;
    }
}
