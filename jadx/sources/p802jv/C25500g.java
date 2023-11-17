package p802jv;

import ed1.C40749p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p812kv.C25778a;
import p812kv.C25779b;
import p822lv.C26093a;
import p832mv.C26305b;
import ue1.C43075l;

/* renamed from: jv.g */
public final class C25500g {

    /* renamed from: a */
    private final C26093a f65169a;

    /* renamed from: jv.g$a */
    static final class C25501a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C43075l f65170d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25501a(C43075l lVar) {
            super(1);
            this.f65170d = lVar;
        }

        public final List invoke(List list) {
            Object obj;
            C41536l.m120489i(list, "it");
            C43075l lVar = this.f65170d;
            ArrayList<C25779b> arrayList = new ArrayList<>();
            Iterator it = list.iterator();
            while (true) {
                boolean z = true;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                List h = ((C25779b) next).mo64389h();
                if (!(h instanceof Collection) || !h.isEmpty()) {
                    Iterator it2 = h.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((Boolean) lVar.invoke(it2.next())).booleanValue()) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                z = false;
                if (z) {
                    arrayList.add(next);
                }
            }
            C43075l lVar2 = this.f65170d;
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(arrayList, 10));
            for (C25779b bVar : arrayList) {
                Iterator it3 = bVar.mo64389h().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it3.next();
                    if (((Boolean) lVar2.invoke(obj)).booleanValue()) {
                        break;
                    }
                }
                C41536l.m120486f(obj);
                C26305b bVar2 = (C26305b) obj;
                arrayList2.add(new C25778a(!bVar.mo64394l(), bVar.mo64385e(), bVar2.mo65472c(), bVar2.mo65474e(), bVar.mo64383c(), bVar2.mo65473d() == C26305b.C26308c.f66669f));
            }
            return arrayList2;
        }
    }

    /* renamed from: jv.g$b */
    static final class C25502b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ long f65171d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25502b(long j) {
            super(1);
            this.f65171d = j;
        }

        /* renamed from: a */
        public final Boolean invoke(C26305b bVar) {
            boolean z;
            C41536l.m120489i(bVar, "receiver");
            if (!(bVar instanceof C26305b.C26306a) || ((C26305b.C26306a) bVar).mo65477h().mo67857m() != this.f65171d) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    public C25500g(C26093a aVar) {
        C41536l.m120489i(aVar, "moneyRequestRepository");
        this.f65169a = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final List m80678c(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* renamed from: b */
    public final C40749p mo64051b(long j) {
        C40749p k0 = this.f65169a.mo65011y1().mo95026k0(new C25499f(new C25501a(new C25502b(j))));
        C41536l.m120488h(k0, "containsContact = { rece…\n            }\n\n        }");
        return k0;
    }
}
