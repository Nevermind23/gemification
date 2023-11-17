package oh1;

import af1.C40296c;
import fh1.C40951a;
import ih1.C41368a;
import ih1.C41370b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import jh1.C41458a;
import jh1.C41459b;
import jh1.C41460c;
import jh1.C41462d;
import kh1.C41517b;
import kh1.C41518c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ph1.C42203a;
import ue1.C43064a;

/* renamed from: oh1.b */
public final class C41951b {

    /* renamed from: a */
    private final HashMap f98679a = new HashMap();

    /* renamed from: b */
    private final C40951a f98680b;

    /* renamed from: c */
    private final C42203a f98681c;

    public C41951b(C40951a aVar, C42203a aVar2) {
        C41536l.m120489i(aVar, "_koin");
        C41536l.m120489i(aVar2, "_scope");
        this.f98680b = aVar;
        this.f98681c = aVar2;
    }

    /* renamed from: d */
    private final C41460c m121898d(C40951a aVar, C41368a aVar2) {
        int i = C41950a.f98678a[aVar2.mo95998b().ordinal()];
        if (i == 1) {
            return new C41462d(aVar, aVar2);
        }
        if (i == 2) {
            return new C41458a(aVar, aVar2);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: e */
    private final C41459b m121899e(C43064a aVar) {
        return new C41459b(this.f98680b, this.f98681c, aVar);
    }

    /* renamed from: i */
    private final void m121900i(String str, C41460c cVar, boolean z) {
        if (!this.f98679a.containsKey(str) || z) {
            this.f98679a.put(str, cVar);
            return;
        }
        throw new IllegalStateException(("InstanceRegistry already contains index '" + str + '\'').toString());
    }

    /* renamed from: j */
    private final void m121901j(String str, C41460c cVar) {
        if (!this.f98679a.containsKey(str)) {
            this.f98679a.put(str, cVar);
        }
    }

    /* renamed from: a */
    public final void mo97151a(Set set) {
        C41536l.m120489i(set, "definitions");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C41368a aVar = (C41368a) it.next();
            if (this.f98680b.mo95344b().mo96287f(C41517b.DEBUG)) {
                if (this.f98681c.mo97678j().mo97683c()) {
                    C41518c b = this.f98680b.mo95344b();
                    b.mo96284b("- " + aVar);
                } else {
                    C41518c b2 = this.f98680b.mo95344b();
                    b2.mo96284b(this.f98681c + " -> " + aVar);
                }
            }
            mo97156h(aVar, false);
        }
    }

    /* renamed from: b */
    public final void mo97152b(C41368a aVar) {
        C41536l.m120489i(aVar, "definition");
        mo97156h(aVar, aVar.mo95999c().mo96013a());
    }

    /* renamed from: c */
    public final void mo97153c() {
        Collection values = mo97154f().values();
        ArrayList arrayList = new ArrayList();
        for (Object next : values) {
            if (next instanceof C41462d) {
                arrayList.add(next);
            }
        }
        ArrayList<C41462d> arrayList2 = new ArrayList<>();
        for (Object next2 : arrayList) {
            if (((C41462d) next2).mo96216c().mo95999c().mo96014b()) {
                arrayList2.add(next2);
            }
        }
        for (C41462d b : arrayList2) {
            b.mo96212b(new C41459b(this.f98680b, this.f98681c, (C43064a) null, 4, (DefaultConstructorMarker) null));
        }
    }

    /* renamed from: f */
    public final Map mo97154f() {
        return this.f98679a;
    }

    /* renamed from: g */
    public final Object mo97155g(String str, C43064a aVar) {
        Object obj;
        C41536l.m120489i(str, "indexKey");
        C41460c cVar = (C41460c) this.f98679a.get(str);
        if (cVar != null) {
            obj = cVar.mo96212b(m121899e(aVar));
        } else {
            obj = null;
        }
        if (!(obj instanceof Object)) {
            return null;
        }
        return obj;
    }

    /* renamed from: h */
    public final void mo97156h(C41368a aVar, boolean z) {
        boolean z2;
        C41536l.m120489i(aVar, "definition");
        if (aVar.mo95999c().mo96013a() || z) {
            z2 = true;
        } else {
            z2 = false;
        }
        C41460c d = m121898d(this.f98680b, aVar);
        m121900i(C41370b.m120068a(aVar.mo96000d(), aVar.mo96003f()), d, z2);
        for (C40296c cVar : aVar.mo96005h()) {
            if (z2) {
                m121900i(C41370b.m120068a(cVar, aVar.mo96003f()), d, z2);
            } else {
                m121901j(C41370b.m120068a(cVar, aVar.mo96003f()), d);
            }
        }
    }
}
