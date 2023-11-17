package p341ge.bog.mobilebank.insurance.presentation;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import g91.C32343x;
import hd1.C41204a;
import he1.C41238w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ll0.C26053a;
import ll0.C26054b;
import ml0.C26248b;
import ml0.C26249c;
import ml0.C26250d;
import nl0.C26549f;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.insurance.presentation.C24479c;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: ge.bog.mobilebank.insurance.presentation.f */
public final class C24488f extends C21481a {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C26054b f63187d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C26053a f63188e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C24508h f63189f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final String f63190g;

    /* renamed from: h */
    private final C1644x f63191h;

    /* renamed from: i */
    private final C1644x f63192i = new C1644x();

    /* renamed from: ge.bog.mobilebank.insurance.presentation.f$a */
    static final class C24489a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C24488f f63193d;

        /* renamed from: ge.bog.mobilebank.insurance.presentation.f$a$a */
        static final class C24490a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C24488f f63194d;

            /* renamed from: e */
            final /* synthetic */ Integer f63195e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C24490a(C24488f fVar, Integer num) {
                super(1);
                this.f63194d = fVar;
                this.f63195e = num;
            }

            /* renamed from: a */
            public final void mo62474a(List list) {
                C24488f fVar = this.f63194d;
                String hw = fVar.f63190g;
                C41536l.m120488h(list, "productList");
                Integer num = this.f63195e;
                C41536l.m120488h(num, "requestCode");
                fVar.m78741mw(hw, list, num.intValue());
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo62474a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.insurance.presentation.f$a$b */
        static final class C24491b extends C41537m implements C43079p {

            /* renamed from: d */
            final /* synthetic */ List f63196d;

            /* renamed from: e */
            final /* synthetic */ C24488f f63197e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C24491b(List list, C24488f fVar) {
                super(2);
                this.f63196d = list;
                this.f63197e = fVar;
            }

            /* renamed from: a */
            public final List invoke(C26248b bVar, List list) {
                C41536l.m120489i(bVar, "polices");
                C41536l.m120489i(list, "products");
                List list2 = this.f63196d;
                ArrayList<C26249c> arrayList = new ArrayList<>();
                Iterator it = list.iterator();
                while (true) {
                    boolean z = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((C26249c) next).mo65278c() == C26250d.NONE) {
                        z = false;
                    }
                    if (z) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C41343r.m119925u(arrayList, 10));
                for (C26249c fVar : arrayList) {
                    arrayList2.add(new C24479c.C24485f(fVar));
                }
                list2.addAll(arrayList2);
                List a = this.f63197e.f63189f.mo62485a(bVar);
                if (bVar.mo65271a() == null && bVar.mo65272b() == null) {
                    this.f63196d.add(C24479c.C24484e.f63183a);
                    this.f63196d.add(C24479c.C24481b.f63180a);
                    this.f63196d.add(C24479c.C24482c.f63181a);
                } else if (!a.isEmpty()) {
                    this.f63196d.add(C24479c.C24484e.f63183a);
                    this.f63196d.addAll(a);
                    this.f63196d.add(C24479c.C24482c.f63181a);
                }
                return C41358y.m120036z0(this.f63196d);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24489a(C24488f fVar) {
            super(1);
            this.f63193d = fVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final void m78746d(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final List m78747e(C43079p pVar, Object obj, Object obj2) {
            C41536l.m120489i(pVar, "$tmp0");
            return (List) pVar.invoke(obj, obj2);
        }

        /* renamed from: c */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "requestCode");
            C40749p O = C40762x.m118154T(this.f63193d.f63187d.mo64949a(), C32343x.m95465l1(this.f63193d.f63188e.mo64948a()).mo95079h(new C24486d(new C24490a(this.f63193d, num))), new C24487e(new C24491b(C41341q.m119913p(C24479c.C24480a.f63179a), this.f63193d))).mo95075O();
            C41536l.m120488h(O, "class ViewModel @Assiste…        }\n        }\n    }");
            return C31270e.m92879h(O, num.intValue());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24488f(C26054b bVar, C26053a aVar, C24508h hVar, String str) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(bVar, "getPolicies");
        C41536l.m120489i(aVar, "getInsuranceProducts");
        C41536l.m120489i(hVar, "mapper");
        this.f63187d = bVar;
        this.f63188e = aVar;
        this.f63189f = hVar;
        this.f63190g = str;
        C1644x xVar = new C1644x();
        this.f63191h = xVar;
        C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C26549f(new C24489a(this)));
        C41536l.m120488h(L0, "merge(\n                o…equestCode)\n            }");
        bindToLifecycle(C31270e.m92876e(C32343x.m95413R0(L0), xVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: ew */
    public static final C40754t m78735ew(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: ml0.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.String} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: mw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m78741mw(java.lang.String r5, java.util.List r6, int r7) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0066
            r0 = 1
            if (r7 != r0) goto L_0x0066
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x000e:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x002c
            java.lang.Object r1 = r6.next()
            r2 = r1
            ml0.c r2 = (ml0.C26249c) r2
            ml0.d r2 = r2.mo65278c()
            ml0.d r3 = ml0.C26250d.NONE
            if (r2 == r3) goto L_0x0025
            r2 = r0
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            if (r2 == 0) goto L_0x000e
            r7.add(r1)
            goto L_0x000e
        L_0x002c:
            java.util.Iterator r6 = r7.iterator()
        L_0x0030:
            boolean r7 = r6.hasNext()
            r0 = 0
            if (r7 == 0) goto L_0x004f
            java.lang.Object r7 = r6.next()
            r1 = r7
            ml0.c r1 = (ml0.C26249c) r1
            ml0.d r1 = r1.mo65278c()
            if (r1 == 0) goto L_0x0048
            java.lang.String r0 = r1.mo65283b()
        L_0x0048:
            boolean r0 = kotlin.jvm.internal.C41536l.m120484d(r5, r0)
            if (r0 == 0) goto L_0x0030
            r0 = r7
        L_0x004f:
            ml0.c r0 = (ml0.C26249c) r0
            if (r0 == 0) goto L_0x0066
            ml0.d r5 = r0.mo65278c()
            if (r5 == 0) goto L_0x0066
            java.lang.String r5 = r5.mo65283b()
            if (r5 == 0) goto L_0x0066
            androidx.lifecycle.x r6 = r4.mo62471kw()
            m41.C37224b.m109965d(r6, r5)
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.insurance.presentation.C24488f.m78741mw(java.lang.String, java.util.List, int):void");
    }

    /* renamed from: kw */
    public C1644x mo62471kw() {
        return this.f63192i;
    }

    /* renamed from: lw */
    public LiveData mo62472lw() {
        return this.f63191h;
    }
}
