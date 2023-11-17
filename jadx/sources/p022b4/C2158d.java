package p022b4;

import androidx.collection.ArrayMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p089g4.C6222j;

/* renamed from: b4.d */
public class C2158d {

    /* renamed from: a */
    private final AtomicReference f6336a = new AtomicReference();

    /* renamed from: b */
    private final ArrayMap f6337b = new ArrayMap();

    /* renamed from: a */
    public List mo7035a(Class cls, Class cls2, Class cls3) {
        List list;
        C6222j jVar = (C6222j) this.f6336a.getAndSet((Object) null);
        if (jVar == null) {
            jVar = new C6222j(cls, cls2, cls3);
        } else {
            jVar.mo19829a(cls, cls2, cls3);
        }
        synchronized (this.f6337b) {
            list = (List) this.f6337b.get(jVar);
        }
        this.f6336a.set(jVar);
        return list;
    }

    /* renamed from: b */
    public void mo7036b(Class cls, Class cls2, Class cls3, List list) {
        synchronized (this.f6337b) {
            this.f6337b.put(new C6222j(cls, cls2, cls3), list);
        }
    }
}
