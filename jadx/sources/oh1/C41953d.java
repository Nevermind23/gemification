package oh1;

import fh1.C40951a;
import ih1.C41368a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kh1.C41518c;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lh1.C41702a;
import nh1.C41806a;
import org.koin.core.error.NoScopeDefFoundException;
import org.koin.core.error.ScopeAlreadyCreatedException;
import ph1.C42203a;
import ph1.C42205b;

/* renamed from: oh1.d */
public final class C41953d {

    /* renamed from: a */
    private final HashMap f98684a = new HashMap();

    /* renamed from: b */
    private final HashMap f98685b = new HashMap();

    /* renamed from: c */
    private C42205b f98686c;

    /* renamed from: d */
    private C42203a f98687d;

    /* renamed from: e */
    private final C40951a f98688e;

    public C41953d(C40951a aVar) {
        C41536l.m120489i(aVar, "_koin");
        this.f98688e = aVar;
    }

    /* renamed from: d */
    private final C42203a m121908d(String str, C42205b bVar, Object obj) {
        List list;
        C42203a aVar = new C42203a(str, bVar, this.f98688e);
        aVar.mo97680m(obj);
        C42203a aVar2 = this.f98687d;
        if (aVar2 == null || (list = C41339p.m119900e(aVar2)) == null) {
            list = C41341q.m119907j();
        }
        aVar.mo97672d(list);
        return aVar;
    }

    /* renamed from: e */
    private final void m121909e(C41806a aVar) {
        C42205b bVar = new C42205b(aVar, false, 2, (DefaultConstructorMarker) null);
        if (this.f98684a.get(aVar.getValue()) == null) {
            this.f98684a.put(aVar.getValue(), bVar);
        }
    }

    /* renamed from: f */
    private final void m121910f(HashSet hashSet) {
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            mo97160g((C41368a) it.next());
        }
    }

    /* renamed from: h */
    private final void m121911h(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m121909e((C41806a) it.next());
        }
    }

    /* renamed from: j */
    private final void m121912j(C41702a aVar) {
        m121911h(aVar.mo96503c());
        m121910f(aVar.mo96501a());
        aVar.mo96506g(true);
    }

    /* renamed from: a */
    public final void mo97157a() {
        if (this.f98687d == null) {
            this.f98687d = mo97159c("-Root-", C42205b.f99310e.mo97689a(), (Object) null);
            return;
        }
        throw new IllegalStateException("Try to recreate Root scope".toString());
    }

    /* renamed from: b */
    public final void mo97158b() {
        if (this.f98686c == null) {
            C42205b.C42206a aVar = C42205b.f99310e;
            C42205b b = aVar.mo97690b();
            this.f98684a.put(aVar.mo97689a().getValue(), b);
            this.f98686c = b;
            return;
        }
        throw new IllegalStateException("Try to recreate Root scope definition".toString());
    }

    /* renamed from: c */
    public final C42203a mo97159c(String str, C41806a aVar, Object obj) {
        C41536l.m120489i(str, "scopeId");
        C41536l.m120489i(aVar, "qualifier");
        if (!this.f98685b.containsKey(str)) {
            C42205b bVar = (C42205b) this.f98684a.get(aVar.getValue());
            if (bVar != null) {
                C42203a d = m121908d(str, bVar, obj);
                this.f98685b.put(str, d);
                return d;
            }
            throw new NoScopeDefFoundException("No Scope Definition found for qualifer '" + aVar.getValue() + '\'');
        }
        throw new ScopeAlreadyCreatedException("Scope with id '" + str + "' is already created");
    }

    /* renamed from: g */
    public final void mo97160g(C41368a aVar) {
        C41536l.m120489i(aVar, "bean");
        C42205b bVar = (C42205b) this.f98684a.get(aVar.mo96004g().getValue());
        if (bVar != null) {
            C41536l.m120488h(bVar, "_scopeDefinitions[bean.s…n for definition: $bean\")");
            C42205b.m122576e(bVar, aVar, false, 2, (Object) null);
            Collection values = this.f98685b.values();
            C41536l.m120488h(values, "_scopes.values");
            ArrayList<C42203a> arrayList = new ArrayList<>();
            for (Object next : values) {
                if (C41536l.m120484d(((C42203a) next).mo97678j(), bVar)) {
                    arrayList.add(next);
                }
            }
            for (C42203a k : arrayList) {
                k.mo97679k(aVar);
            }
            return;
        }
        throw new IllegalStateException(("Undeclared scope definition for definition: " + aVar).toString());
    }

    /* renamed from: i */
    public final C42203a mo97161i() {
        C42203a aVar = this.f98687d;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("No root scope".toString());
    }

    /* renamed from: k */
    public final void mo97162k(Iterable iterable) {
        C41536l.m120489i(iterable, "modules");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C41702a aVar = (C41702a) it.next();
            if (!aVar.mo96504d()) {
                m121912j(aVar);
            } else {
                C41518c b = this.f98688e.mo95344b();
                b.mo96285d("module '" + aVar + "' already loaded!");
            }
        }
    }

    /* renamed from: l */
    public final int mo97163l() {
        Collection<C42205b> values = this.f98684a.values();
        C41536l.m120488h(values, "_scopeDefinitions.values");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(values, 10));
        for (C42205b f : values) {
            arrayList.add(Integer.valueOf(f.mo97686f()));
        }
        return C41358y.m120031u0(arrayList);
    }
}
