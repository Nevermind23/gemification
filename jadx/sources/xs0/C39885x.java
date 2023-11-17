package xs0;

import ed1.C40735b0;
import ed1.C40762x;
import j70.C25339b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m70.C26156i;
import md0.C26186e;
import p843nw.C26633o;
import p863pw.C27637o;
import p895sy.C28290a;
import p906ty.C28527e;
import p906ty.C28530h;
import ts0.C38793a;
import ue1.C43075l;
import ue1.C43082s;
import ys0.C40057a;

/* renamed from: xs0.x */
public final class C39885x {

    /* renamed from: a */
    private final C28290a f94635a;

    /* renamed from: b */
    private final C39862i f94636b;

    /* renamed from: c */
    private final C39860h f94637c;

    /* renamed from: d */
    private final C39889y f94638d;

    /* renamed from: e */
    private final C26633o f94639e;

    /* renamed from: f */
    private final C25339b f94640f;

    /* renamed from: g */
    private final C38793a f94641g;

    /* renamed from: xs0.x$a */
    static final class C39886a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C40057a f94642d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39886a(C40057a aVar) {
            super(1);
            this.f94642d = aVar;
        }

        /* renamed from: a */
        public final C40057a invoke(List list) {
            C41536l.m120489i(list, "it");
            C40057a aVar = this.f94642d;
            List e = aVar.mo93928e();
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (Object next : e) {
                if (hashSet.add(((C28527e) next).mo68191b())) {
                    arrayList.add(next);
                }
            }
            return C40057a.m116040b(aVar, (C28530h) null, arrayList, (List) null, list, 5, (Object) null);
        }
    }

    /* renamed from: xs0.x$b */
    static final class C39887b extends C41537m implements C43082s {

        /* renamed from: d */
        final /* synthetic */ C39885x f94643d;

        /* renamed from: e */
        final /* synthetic */ long f94644e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39887b(C39885x xVar, long j) {
            super(5);
            this.f94643d = xVar;
            this.f94644e = j;
        }

        /* renamed from: a */
        public final C40057a mo41133P0(C28530h hVar, List list, List list2, C27637o oVar, C26156i iVar) {
            C41536l.m120489i(hVar, "bonuses");
            C41536l.m120489i(list, "deposits");
            C41536l.m120489i(list2, "accounts");
            C41536l.m120489i(oVar, "cardsAndDetails");
            C41536l.m120489i(iVar, "accountsAndDetails");
            return this.f94643d.m115672k(this.f94644e, hVar, list, list2, oVar, iVar);
        }
    }

    /* renamed from: xs0.x$c */
    static final class C39888c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C39885x f94645d;

        /* renamed from: e */
        final /* synthetic */ long f94646e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39888c(C39885x xVar, long j) {
            super(1);
            this.f94645d = xVar;
            this.f94646e = j;
        }

        /* renamed from: a */
        public final C40735b0 invoke(C40057a aVar) {
            String str;
            Object obj;
            boolean z;
            C41536l.m120489i(aVar, "data");
            List e = aVar.mo93928e();
            long j = this.f94646e;
            Iterator it = e.iterator();
            while (true) {
                str = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Long f = ((C28527e) obj).mo68196f();
                if (f != null && f.longValue() == j) {
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
            C28527e eVar = (C28527e) obj;
            if (eVar != null) {
                str = eVar.mo68198h();
            }
            if (str != null) {
                return this.f94645d.m115668f(str, aVar);
            }
            List e2 = aVar.mo93928e();
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (Object next : e2) {
                if (hashSet.add(((C28527e) next).mo68191b())) {
                    arrayList.add(next);
                }
            }
            C40762x z2 = C40762x.m118162z(C40057a.m116040b(aVar, (C28530h) null, arrayList, (List) null, (List) null, 13, (Object) null));
            C41536l.m120488h(z2, "{\n                    Si…      )\n                }");
            return z2;
        }
    }

    public C39885x(C28290a aVar, C39862i iVar, C39860h hVar, C39889y yVar, C26633o oVar, C25339b bVar, C38793a aVar2) {
        C41536l.m120489i(aVar, "getBonuses");
        C41536l.m120489i(iVar, "getCasAvailableDeposits");
        C41536l.m120489i(hVar, "getCasAccounts");
        C41536l.m120489i(yVar, "getMoneyBoxTariffs");
        C41536l.m120489i(oVar, "getCardsAndDetails");
        C41536l.m120489i(bVar, "getAccountsAndDetails");
        C41536l.m120489i(aVar2, "casMapper");
        this.f94635a = aVar;
        this.f94636b = iVar;
        this.f94637c = hVar;
        this.f94638d = yVar;
        this.f94639e = oVar;
        this.f94640f = bVar;
        this.f94641g = aVar2;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final C40762x m115668f(String str, C40057a aVar) {
        C40762x A = this.f94638d.mo93588a(str).mo95062A(new C39884w(new C39886a(aVar)));
        C41536l.m120488h(A, "data: MoneyBoxData,\n    …iffs = it\n        )\n    }");
        return A;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final C40057a m115669g(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40057a) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static final C40057a m115670i(C43082s sVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        C41536l.m120489i(sVar, "$tmp0");
        return (C40057a) sVar.mo41133P0(obj, obj2, obj3, obj4, obj5);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final C40735b0 m115671j(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40735b0) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final C40057a m115672k(long j, C28530h hVar, List list, List list2, C27637o oVar, C26156i iVar) {
        Object obj;
        String str;
        boolean z;
        C38793a aVar = this.f94641g;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Long f = ((C28527e) obj).mo68196f();
            if (f != null && f.longValue() == j) {
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
        C28527e eVar = (C28527e) obj;
        if (eVar == null || (str = eVar.mo68194e()) == null) {
            str = "GEL";
        }
        return new C40057a(hVar, list, aVar.mo92488c(list2, oVar, iVar, str), (List) null, 8, (DefaultConstructorMarker) null);
    }

    /* renamed from: h */
    public final C40762x mo93584h(long j) {
        C40762x r = C40762x.m118151Q(C28290a.m86927b(this.f94635a, false, 1, (Object) null).mo94996P(), this.f94636b.mo93568a(), this.f94637c.mo93566a(), C26633o.m83102d(this.f94639e, false, 1, (Object) null).mo94996P(), C26186e.m81990h(C25339b.C25340a.m80512a(this.f94640f, false, 1, (Object) null)), new C39882u(new C39887b(this, j))).mo95087r(new C39883v(new C39888c(this, j)));
        C41536l.m120488h(r, "operator fun invoke(\n   …}\n            }\n        }");
        return r;
    }
}
