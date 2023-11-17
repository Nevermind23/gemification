package p333z3;

import java.util.ArrayList;
import java.util.List;

/* renamed from: z3.f */
public class C9204f {

    /* renamed from: a */
    private final List f25621a = new ArrayList();

    /* renamed from: z3.f$a */
    private static final class C9205a {

        /* renamed from: a */
        final Class f25622a;

        /* renamed from: b */
        final Class f25623b;

        /* renamed from: c */
        final C9203e f25624c;

        C9205a(Class cls, Class cls2, C9203e eVar) {
            this.f25622a = cls;
            this.f25623b = cls2;
            this.f25624c = eVar;
        }

        /* renamed from: a */
        public boolean mo24842a(Class cls, Class cls2) {
            return this.f25622a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f25623b);
        }
    }

    /* renamed from: a */
    public synchronized C9203e mo24839a(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C9206g.m34020b();
        }
        for (C9205a aVar : this.f25621a) {
            if (aVar.mo24842a(cls, cls2)) {
                return aVar.f25624c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    /* renamed from: b */
    public synchronized List mo24840b(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (C9205a aVar : this.f25621a) {
            if (aVar.mo24842a(cls, cls2) && !arrayList.contains(aVar.f25623b)) {
                arrayList.add(aVar.f25623b);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public synchronized void mo24841c(Class cls, Class cls2, C9203e eVar) {
        this.f25621a.add(new C9205a(cls, cls2, eVar));
    }
}
