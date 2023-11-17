package p510ln;

import ed1.C40735b0;
import ed1.C40762x;
import ed1.C40763y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41550z;
import md0.C26186e;
import o70.C26762a;
import o70.C26765d;
import o70.C26766e;
import p524mn.C16800a;
import sy0.C38606b;
import ue1.C43075l;

/* renamed from: ln.i */
public final class C16595i {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C38606b f46774a;

    /* renamed from: ln.i$a */
    static final class C16596a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ long f46775d;

        /* renamed from: e */
        final /* synthetic */ C16595i f46776e;

        /* renamed from: ln.i$a$a */
        static final class C16597a extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C16597a f46777d = new C16597a();

            C16597a() {
                super(1);
            }

            /* access modifiers changed from: private */
            /* renamed from: c */
            public static final void m58900c(C40763y yVar) {
                C41536l.m120489i(yVar, "it");
                yVar.mo95093a(new C26762a(-1, false));
            }

            /* renamed from: b */
            public final C40735b0 invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                return C40762x.m118157e(new C16594h());
            }
        }

        /* renamed from: ln.i$a$b */
        static final class C16598b extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C16598b f46778d = new C16598b();

            C16598b() {
                super(1);
            }

            /* renamed from: a */
            public final List invoke(Object[] objArr) {
                C41536l.m120489i(objArr, "statuses");
                ArrayList arrayList = new ArrayList(objArr.length);
                for (C26762a aVar : objArr) {
                    C41536l.m120487g(aVar, "null cannot be cast to non-null type ge.bog.mobilebank.cleanarch.shareddomain.model.cards.CardBlockStatusModel");
                    arrayList.add(aVar);
                }
                return arrayList;
            }
        }

        /* renamed from: ln.i$a$c */
        static final class C16599c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C41550z f46779d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C16599c(C41550z zVar) {
                super(1);
                this.f46779d = zVar;
            }

            public final List invoke(List list) {
                boolean z;
                Object obj;
                boolean z2;
                C41536l.m120489i(list, "blockStatusData");
                Iterable<C26765d> iterable = (Iterable) this.f46779d.f97717d;
                ArrayList arrayList = new ArrayList(C41343r.m119925u(iterable, 10));
                for (C26765d dVar : iterable) {
                    Iterator it = list.iterator();
                    while (true) {
                        z = false;
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((C26762a) obj).mo65979a() == dVar.mo66030j()) {
                            z2 = true;
                            continue;
                        } else {
                            z2 = false;
                            continue;
                        }
                        if (z2) {
                            break;
                        }
                    }
                    C26762a aVar = (C26762a) obj;
                    if (aVar != null) {
                        z = aVar.mo65980b();
                    }
                    arrayList.add(new C16800a(dVar, z));
                }
                return arrayList;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16596a(long j, C16595i iVar) {
            super(1);
            this.f46775d = j;
            this.f46776e = iVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final C40735b0 m58895e(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C40735b0) lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public static final List m58896f(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public static final List m58897g(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* renamed from: d */
        public final C40735b0 invoke(C26766e eVar) {
            Object obj;
            boolean z;
            C41536l.m120489i(eVar, "cardsData");
            C41550z zVar = new C41550z();
            zVar.f97717d = C41341q.m119907j();
            for (Map.Entry value : eVar.mo66048a().entrySet()) {
                ArrayList arrayList = new ArrayList();
                for (Object next : (List) value.getValue()) {
                    if (true ^ ((C26765d) next).mo66012Q()) {
                        arrayList.add(next);
                    }
                }
                zVar.f97717d = arrayList;
                long j = this.f46775d;
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((C26765d) obj).mo66030j() == j) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                if (((C26765d) obj) != null) {
                    break;
                }
            }
            Iterable<C26765d> iterable = (Iterable) zVar.f97717d;
            C16595i iVar = this.f46776e;
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(iterable, 10));
            for (C26765d j2 : iterable) {
                arrayList2.add(iVar.f46774a.getCardBlockStatus(j2.mo66030j()).mo95064C(new C16591e(C16597a.f46777d)));
            }
            return C40762x.m118155U(arrayList2, new C16592f(C16598b.f46778d)).mo95062A(new C16593g(new C16599c(zVar)));
        }
    }

    public C16595i(C38606b bVar) {
        C41536l.m120489i(bVar, "repository");
        this.f46774a = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final C40735b0 m58890d(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40735b0) lVar.invoke(obj);
    }

    /* renamed from: c */
    public final C40762x mo43743c(long j) {
        C40762x r = C26186e.m81990h(this.f46774a.getCardsAndDetails(true)).mo95087r(new C16590d(new C16596a(j, this)));
        C41536l.m120488h(r, "operator fun invoke(card…        }\n        }\n    }");
        return r;
    }
}
