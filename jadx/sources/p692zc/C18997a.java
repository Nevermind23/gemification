package p692zc;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: zc.a */
public final class C18997a {

    /* renamed from: a */
    private final C18998b f53020a;

    /* renamed from: b */
    private List f53021b = new ArrayList();

    public C18997a(C18998b bVar) {
        C41536l.m120489i(bVar, "flags");
        this.f53020a = bVar;
    }

    /* renamed from: a */
    public final List mo47049a() {
        return this.f53021b;
    }

    /* renamed from: b */
    public final void mo47050b() {
        this.f53021b.clear();
        if (this.f53020a.mo47060i()) {
            this.f53021b.add(0);
        }
        if (this.f53020a.mo47061j()) {
            this.f53021b.add(3);
        }
        if (this.f53020a.mo47058g()) {
            this.f53021b.add(1);
        }
        if (this.f53020a.mo47062k()) {
            this.f53021b.add(2);
        }
        if (this.f53020a.mo47059h()) {
            this.f53021b.add(5);
        }
    }

    public String toString() {
        return this.f53021b.toString();
    }
}
