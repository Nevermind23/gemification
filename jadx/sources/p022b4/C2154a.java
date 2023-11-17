package p022b4;

import java.util.ArrayList;
import java.util.List;
import p166m3.C7082d;

/* renamed from: b4.a */
public class C2154a {

    /* renamed from: a */
    private final List f6329a = new ArrayList();

    /* renamed from: b4.a$a */
    private static final class C2155a {

        /* renamed from: a */
        private final Class f6330a;

        /* renamed from: b */
        final C7082d f6331b;

        C2155a(Class cls, C7082d dVar) {
            this.f6330a = cls;
            this.f6331b = dVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo7029a(Class cls) {
            return this.f6330a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized void mo7027a(Class cls, C7082d dVar) {
        this.f6329a.add(new C2155a(cls, dVar));
    }

    /* renamed from: b */
    public synchronized C7082d mo7028b(Class cls) {
        for (C2155a aVar : this.f6329a) {
            if (aVar.mo7029a(cls)) {
                return aVar.f6331b;
            }
        }
        return null;
    }
}
