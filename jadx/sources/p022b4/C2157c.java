package p022b4;

import androidx.collection.ArrayMap;
import androidx.core.util.C1005e;
import com.bumptech.glide.load.engine.C2455i;
import com.bumptech.glide.load.engine.C2476q;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import p089g4.C6222j;
import p333z3.C9206g;

/* renamed from: b4.c */
public class C2157c {

    /* renamed from: c */
    private static final C2476q f6333c = new C2476q(Object.class, Object.class, Object.class, Collections.singletonList(new C2455i(Object.class, Object.class, Object.class, Collections.emptyList(), new C9206g(), (C1005e) null)), (C1005e) null);

    /* renamed from: a */
    private final ArrayMap f6334a = new ArrayMap();

    /* renamed from: b */
    private final AtomicReference f6335b = new AtomicReference();

    /* renamed from: b */
    private C6222j m8267b(Class cls, Class cls2, Class cls3) {
        C6222j jVar = (C6222j) this.f6335b.getAndSet((Object) null);
        if (jVar == null) {
            jVar = new C6222j();
        }
        jVar.mo19829a(cls, cls2, cls3);
        return jVar;
    }

    /* renamed from: a */
    public C2476q mo7032a(Class cls, Class cls2, Class cls3) {
        C2476q qVar;
        C6222j b = m8267b(cls, cls2, cls3);
        synchronized (this.f6334a) {
            qVar = (C2476q) this.f6334a.get(b);
        }
        this.f6335b.set(b);
        return qVar;
    }

    /* renamed from: c */
    public boolean mo7033c(C2476q qVar) {
        return f6333c.equals(qVar);
    }

    /* renamed from: d */
    public void mo7034d(Class cls, Class cls2, Class cls3, C2476q qVar) {
        synchronized (this.f6334a) {
            ArrayMap arrayMap = this.f6334a;
            C6222j jVar = new C6222j(cls, cls2, cls3);
            if (qVar == null) {
                qVar = f6333c;
            }
            arrayMap.put(jVar, qVar);
        }
    }
}
