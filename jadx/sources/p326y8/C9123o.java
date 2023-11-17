package p326y8;

import android.util.Log;
import androidx.lifecycle.C1612n;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import com.google.firebase.components.MissingDependencyException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p224q9.C7946a;
import p289v9.C8716c;
import p289v9.C8717d;
import p327y9.C9140a;
import p327y9.C9142b;

/* renamed from: y8.o */
public class C9123o implements C9110e, C7946a {

    /* renamed from: h */
    private static final C9142b f25301h = new C9120l();

    /* renamed from: a */
    private final Map f25302a;

    /* renamed from: b */
    private final Map f25303b;

    /* renamed from: c */
    private final Map f25304c;

    /* renamed from: d */
    private final List f25305d;

    /* renamed from: e */
    private final C9133t f25306e;

    /* renamed from: f */
    private final AtomicReference f25307f;

    /* renamed from: g */
    private final C9118j f25308g;

    /* renamed from: y8.o$b */
    public static final class C9125b {

        /* renamed from: a */
        private final Executor f25309a;

        /* renamed from: b */
        private final List f25310b = new ArrayList();

        /* renamed from: c */
        private final List f25311c = new ArrayList();

        /* renamed from: d */
        private C9118j f25312d = C9118j.f25294a;

        C9125b(Executor executor) {
            this.f25309a = executor;
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public static /* synthetic */ ComponentRegistrar m33650f(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        /* renamed from: b */
        public C9125b mo24683b(C9104c cVar) {
            this.f25311c.add(cVar);
            return this;
        }

        /* renamed from: c */
        public C9125b mo24684c(ComponentRegistrar componentRegistrar) {
            this.f25310b.add(new C9126p(componentRegistrar));
            return this;
        }

        /* renamed from: d */
        public C9125b mo24685d(Collection collection) {
            this.f25310b.addAll(collection);
            return this;
        }

        /* renamed from: e */
        public C9123o mo24686e() {
            return new C9123o(this.f25309a, this.f25310b, this.f25311c, this.f25312d);
        }

        /* renamed from: g */
        public C9125b mo24687g(C9118j jVar) {
            this.f25312d = jVar;
            return this;
        }
    }

    /* renamed from: m */
    public static C9125b m33628m(Executor executor) {
        return new C9125b(executor);
    }

    /* renamed from: n */
    private void m33629n(List list) {
        ArrayList<Runnable> arrayList = new ArrayList<>();
        synchronized (this) {
            Iterator it = this.f25305d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((C9142b) it.next()).get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f25308g.mo23615a(componentRegistrar));
                        it.remove();
                    }
                } catch (InvalidRegistrarException e) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            if (this.f25302a.isEmpty()) {
                C9127q.m33656a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f25302a.keySet());
                arrayList2.addAll(list);
                C9127q.m33656a(arrayList2);
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C9104c cVar = (C9104c) it2.next();
                this.f25302a.put(cVar, new C9134u(new C9119k(this, cVar)));
            }
            arrayList.addAll(m33637w(list));
            arrayList.addAll(m33638x());
            m33636v();
        }
        for (Runnable run : arrayList) {
            run.run();
        }
        m33635u();
    }

    /* renamed from: o */
    private void m33630o(Map map, boolean z) {
        for (Map.Entry entry : map.entrySet()) {
            C9104c cVar = (C9104c) entry.getKey();
            C9142b bVar = (C9142b) entry.getValue();
            if (cVar.mo24657n() || (cVar.mo24658o() && z)) {
                bVar.get();
            }
        }
        this.f25306e.mo24706d();
    }

    /* renamed from: q */
    private static List m33631q(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        for (Object add : iterable) {
            arrayList.add(add);
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ Object m33632r(C9104c cVar) {
        return cVar.mo24653h().mo129a(new C9107c0(cVar, this));
    }

    /* renamed from: u */
    private void m33635u() {
        Boolean bool = (Boolean) this.f25307f.get();
        if (bool != null) {
            m33630o(this.f25302a, bool.booleanValue());
        }
    }

    /* renamed from: v */
    private void m33636v() {
        for (C9104c cVar : this.f25302a.keySet()) {
            Iterator it = cVar.mo24652g().iterator();
            while (true) {
                if (it.hasNext()) {
                    C9131r rVar = (C9131r) it.next();
                    if (rVar.mo24702g() && !this.f25304c.containsKey(rVar.mo24697c())) {
                        this.f25304c.put(rVar.mo24697c(), C9135v.m33687b(Collections.emptySet()));
                    } else if (this.f25303b.containsKey(rVar.mo24697c())) {
                        continue;
                    } else if (rVar.mo24701f()) {
                        throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", new Object[]{cVar, rVar.mo24697c()}));
                    } else if (!rVar.mo24702g()) {
                        this.f25303b.put(rVar.mo24697c(), C9139z.m33696e());
                    }
                }
            }
        }
    }

    /* renamed from: w */
    private List m33637w(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C9104c cVar = (C9104c) it.next();
            if (cVar.mo24659p()) {
                C9142b bVar = (C9142b) this.f25302a.get(cVar);
                for (C9102b0 b0Var : cVar.mo24655j()) {
                    if (!this.f25303b.containsKey(b0Var)) {
                        this.f25303b.put(b0Var, bVar);
                    } else {
                        arrayList.add(new C9121m((C9139z) ((C9142b) this.f25303b.get(b0Var)), bVar));
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: x */
    private List m33638x() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f25302a.entrySet()) {
            C9104c cVar = (C9104c) entry.getKey();
            if (!cVar.mo24659p()) {
                C9142b bVar = (C9142b) entry.getValue();
                for (C9102b0 b0Var : cVar.mo24655j()) {
                    if (!hashMap.containsKey(b0Var)) {
                        hashMap.put(b0Var, new HashSet());
                    }
                    ((Set) hashMap.get(b0Var)).add(bVar);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (!this.f25304c.containsKey(entry2.getKey())) {
                this.f25304c.put((C9102b0) entry2.getKey(), C9135v.m33687b((Collection) entry2.getValue()));
            } else {
                C9135v vVar = (C9135v) this.f25304c.get(entry2.getKey());
                for (C9142b nVar : (Set) entry2.getValue()) {
                    arrayList.add(new C9122n(vVar, nVar));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public /* synthetic */ Object mo24668a(Class cls) {
        return C9109d.m33598a(this, cls);
    }

    /* renamed from: b */
    public synchronized C9142b mo24669b(C9102b0 b0Var) {
        C9135v vVar = (C9135v) this.f25304c.get(b0Var);
        if (vVar != null) {
            return vVar;
        }
        return f25301h;
    }

    /* renamed from: c */
    public /* synthetic */ Object mo24670c(C9102b0 b0Var) {
        return C9109d.m33599b(this, b0Var);
    }

    /* renamed from: d */
    public /* synthetic */ Set mo24671d(Class cls) {
        return C9109d.m33602e(this, cls);
    }

    /* renamed from: e */
    public synchronized C9142b mo24672e(C9102b0 b0Var) {
        C9100a0.m33554c(b0Var, "Null interface requested.");
        return (C9142b) this.f25303b.get(b0Var);
    }

    /* renamed from: f */
    public /* synthetic */ Set mo24673f(C9102b0 b0Var) {
        return C9109d.m33603f(this, b0Var);
    }

    /* renamed from: g */
    public /* synthetic */ C9142b mo24674g(Class cls) {
        return C9109d.m33601d(this, cls);
    }

    /* renamed from: h */
    public C9140a mo24675h(C9102b0 b0Var) {
        C9142b e = mo24672e(b0Var);
        if (e == null) {
            return C9139z.m33696e();
        }
        if (e instanceof C9139z) {
            return (C9139z) e;
        }
        return C9139z.m33700i(e);
    }

    /* renamed from: i */
    public /* synthetic */ C9140a mo24676i(Class cls) {
        return C9109d.m33600c(this, cls);
    }

    /* renamed from: p */
    public void mo24682p(boolean z) {
        HashMap hashMap;
        if (C1612n.m5659a(this.f25307f, (Object) null, Boolean.valueOf(z))) {
            synchronized (this) {
                hashMap = new HashMap(this.f25302a);
            }
            m33630o(hashMap, z);
        }
    }

    private C9123o(Executor executor, Iterable iterable, Collection collection, C9118j jVar) {
        this.f25302a = new HashMap();
        this.f25303b = new HashMap();
        this.f25304c = new HashMap();
        this.f25307f = new AtomicReference();
        C9133t tVar = new C9133t(executor);
        this.f25306e = tVar;
        this.f25308g = jVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C9104c.m33569s(tVar, C9133t.class, C8717d.class, C8716c.class));
        arrayList.add(C9104c.m33569s(this, C7946a.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C9104c cVar = (C9104c) it.next();
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        this.f25305d = m33631q(iterable);
        m33629n(arrayList);
    }
}
