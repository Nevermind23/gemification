package vj0;

import bk0.C19393b;
import dk0.C20031a;
import dk0.C20032b;
import dk0.C20033c;
import dk0.C20036f;
import ed1.C40735b0;
import ed1.C40762x;
import ek0.C20261a;
import g91.C32307h;
import j70.C25341c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import md0.C26186e;
import o70.C26765d;
import o70.C26766e;
import p814kx.C25784a;
import ue1.C43075l;

/* renamed from: vj0.k */
public final class C29104k implements C25784a {

    /* renamed from: a */
    private final C25341c f74122a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C19393b f74123b;

    /* renamed from: vj0.k$a */
    static final class C29105a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ Long f74124d;

        /* renamed from: e */
        final /* synthetic */ C29104k f74125e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29105a(Long l, C29104k kVar) {
            super(1);
            this.f74124d = l;
            this.f74125e = kVar;
        }

        /* renamed from: a */
        public final List invoke(C26766e eVar) {
            List list;
            C41536l.m120489i(eVar, "it");
            if (this.f74124d == null) {
                list = C41343r.m119927w(eVar.mo66048a().values());
            } else {
                list = (List) eVar.mo66048a().get(this.f74124d);
                if (list == null) {
                    list = C41341q.m119907j();
                }
            }
            ArrayList<C26765d> arrayList = new ArrayList<>();
            for (Object next : list) {
                if (((C26765d) next).mo66044w()) {
                    arrayList.add(next);
                }
            }
            C29104k kVar = this.f74125e;
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(arrayList, 10));
            for (C26765d e : arrayList) {
                arrayList2.add(kVar.m89003g(e));
            }
            return arrayList2;
        }
    }

    /* renamed from: vj0.k$b */
    static final class C29106b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29104k f74126d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29106b(C29104k kVar) {
            super(1);
            this.f74126d = kVar;
        }

        /* renamed from: a */
        public final C40735b0 invoke(List list) {
            C41536l.m120489i(list, "it");
            return this.f74126d.f74123b.mo47614a(list);
        }
    }

    /* renamed from: vj0.k$c */
    static final class C29107c extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C29107c f74127d = new C29107c();

        C29107c() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(List list) {
            boolean z;
            C41536l.m120489i(list, "it");
            boolean z2 = false;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((C20033c) it.next()).mo48411b().mo48416b() != C20261a.TOKEN_STATE_ACTIVE) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (z) {
                            z2 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            return Boolean.valueOf(z2);
        }
    }

    public C29104k(C25341c cVar, C19393b bVar) {
        C41536l.m120489i(cVar, "getCardsAndDetails");
        C41536l.m120489i(bVar, "checkIfCardsAreAddedToWallet");
        this.f74122a = cVar;
        this.f74123b = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final C20032b m89003g(C26765d dVar) {
        return new C20032b(dVar.mo66047z(), m89004h(dVar.mo66022d()), m89005i(dVar.mo66022d()));
    }

    /* renamed from: h */
    private final C20031a m89004h(String str) {
        String[] strArr = C32307h.f79719a;
        C41536l.m120488h(strArr, "card_classes_visa");
        if (C41333m.m119794s(strArr, str)) {
            return C20031a.CARD_NETWORK_VISA;
        }
        String[] strArr2 = C32307h.f79721c;
        C41536l.m120488h(strArr2, "card_classes_amex");
        if (C41333m.m119794s(strArr2, str)) {
            return C20031a.CARD_NETWORK_AMEX;
        }
        return C20031a.CARD_NETWORK_MASTERCARD;
    }

    /* renamed from: i */
    private final C20036f m89005i(String str) {
        String[] strArr = C32307h.f79719a;
        C41536l.m120488h(strArr, "card_classes_visa");
        if (C41333m.m119794s(strArr, str)) {
            return C20036f.TOKEN_PROVIDER_VISA;
        }
        String[] strArr2 = C32307h.f79721c;
        C41536l.m120488h(strArr2, "card_classes_amex");
        if (C41333m.m119794s(strArr2, str)) {
            return C20036f.TOKEN_PROVIDER_AMEX;
        }
        return C20036f.TOKEN_PROVIDER_MASTERCARD;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final List m89006j(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final C40735b0 m89007k(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40735b0) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final Boolean m89008l(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (Boolean) lVar.invoke(obj);
    }

    /* renamed from: a */
    public C40762x mo64414a(Long l) {
        C40762x A = C26186e.m81990h(C25341c.C25342a.m80514a(this.f74122a, false, 1, (Object) null)).mo95062A(new C29101h(new C29105a(l, this))).mo95087r(new C29102i(new C29106b(this))).mo95062A(new C29103j(C29107c.f74127d));
        C41536l.m120488h(A, "override fun invoke(acct…_ACTIVE }\n        }\n    }");
        return A;
    }

    public C40762x invoke() {
        return C25784a.C25785a.m81087a(this);
    }
}
