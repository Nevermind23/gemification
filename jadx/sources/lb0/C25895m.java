package lb0;

import androidx.lifecycle.C1607m0;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import ed1.C40749p;
import ed1.C40754t;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41217g;
import he1.C41225n;
import he1.C41228o;
import he1.C41238w;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccount;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccountItem;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccounts;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission.fragment.onspecificdate.AccumulateOnSpecificDateModel;
import p775gx.C24836a;
import ue1.C43064a;
import ue1.C43075l;
import y11.C39989a;
import z11.C40139a;

/* renamed from: lb0.m */
public final class C25895m extends C21481a implements C25890h, C25891i {

    /* renamed from: d */
    private final AccumulateOnSpecificDateModel f65894d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C24836a f65895e;

    /* renamed from: f */
    private final C25890h f65896f = this;

    /* renamed from: g */
    private final C25891i f65897g = this;

    /* renamed from: h */
    private final C1644x f65898h = new C1644x();

    /* renamed from: i */
    private final C1644x f65899i = new C1644x();

    /* renamed from: j */
    private final C1644x f65900j = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C1644x f65901k = new C1644x();

    /* renamed from: l */
    private final LiveData f65902l = C1607m0.m5655c(mo64707k8(), C25898c.f65910d);
    /* access modifiers changed from: private */

    /* renamed from: m */
    public AccumulateOnSpecificDateModel f65903m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C40139a f65904n;

    /* renamed from: o */
    private final C41217g f65905o;

    /* renamed from: lb0.m$a */
    public static final class C25896a {

        /* renamed from: a */
        private final C40139a f65906a;

        /* renamed from: b */
        private final String f65907b;

        /* renamed from: c */
        private final Long f65908c;

        /* renamed from: d */
        private final C39989a f65909d;

        public C25896a(C40139a aVar, String str, Long l, C39989a aVar2) {
            C41536l.m120489i(aVar, "accountType");
            C41536l.m120489i(str, "mainCurrency");
            this.f65906a = aVar;
            this.f65907b = str;
            this.f65908c = l;
            this.f65909d = aVar2;
        }

        /* renamed from: a */
        public final C39989a mo64713a() {
            return this.f65909d;
        }

        /* renamed from: b */
        public final C40139a mo64714b() {
            return this.f65906a;
        }

        /* renamed from: c */
        public final String mo64715c() {
            return this.f65907b;
        }

        /* renamed from: d */
        public final Long mo64716d() {
            return this.f65908c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C25896a)) {
                return false;
            }
            C25896a aVar = (C25896a) obj;
            return this.f65906a == aVar.f65906a && C41536l.m120484d(this.f65907b, aVar.f65907b) && C41536l.m120484d(this.f65908c, aVar.f65908c) && C41536l.m120484d(this.f65909d, aVar.f65909d);
        }

        public int hashCode() {
            int hashCode = ((this.f65906a.hashCode() * 31) + this.f65907b.hashCode()) * 31;
            Long l = this.f65908c;
            int i = 0;
            int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
            C39989a aVar = this.f65909d;
            if (aVar != null) {
                i = aVar.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            C40139a aVar = this.f65906a;
            String str = this.f65907b;
            Long l = this.f65908c;
            C39989a aVar2 = this.f65909d;
            return "CardSelectorModel(accountType=" + aVar + ", mainCurrency=" + str + ", selectedAccountId=" + l + ", accountFilter=" + aVar2 + ")";
        }
    }

    /* renamed from: lb0.m$b */
    public interface C25897b {
        /* renamed from: a */
        C25895m mo32813a(AccumulateOnSpecificDateModel accumulateOnSpecificDateModel);
    }

    /* renamed from: lb0.m$c */
    static final class C25898c extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C25898c f65910d = new C25898c();

        C25898c() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(AccumulateOnSpecificDateModel accumulateOnSpecificDateModel) {
            C41536l.m120489i(accumulateOnSpecificDateModel, "it");
            return Boolean.valueOf(accumulateOnSpecificDateModel.mo57149q());
        }
    }

    /* renamed from: lb0.m$d */
    static final class C25899d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C25895m f65911d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25899d(C25895m mVar) {
            super(0);
            this.f65911d = mVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final boolean m81411c(C25895m mVar, TransferAccountItem transferAccountItem) {
            C41536l.m120489i(mVar, "this$0");
            C41536l.m120489i(transferAccountItem, "account");
            List<TransferAccountItem> t = transferAccountItem.mo52151t();
            if ((t instanceof Collection) && t.isEmpty()) {
                return false;
            }
            for (TransferAccountItem i : t) {
                if (C41536l.m120484d(i.mo52142i(), mVar.mo64709qw().mo57137e())) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public final C39989a invoke() {
            return new C25904n(this.f65911d);
        }
    }

    /* renamed from: lb0.m$e */
    static final class C25900e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C25895m f65912d;

        /* renamed from: lb0.m$e$a */
        static final class C25901a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C25895m f65913d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C25901a(C25895m mVar) {
                super(1);
                this.f65913d = mVar;
            }

            /* renamed from: a */
            public final List invoke(TransferAccounts transferAccounts) {
                boolean z;
                C41536l.m120489i(transferAccounts, "list");
                C25895m mVar = this.f65913d;
                List gw = mVar.m81383ow(transferAccounts, mVar.f65904n);
                C39989a hw = this.f65913d.m81384pw();
                ArrayList arrayList = new ArrayList();
                for (Object next : gw) {
                    if (hw.mo57048z((TransferAccountItem) next)) {
                        arrayList.add(next);
                    }
                }
                C25895m mVar2 = this.f65913d;
                ArrayList arrayList2 = new ArrayList();
                for (Object next2 : arrayList) {
                    long m = ((TransferAccountItem) next2).mo52146m();
                    Long i = mVar2.mo64709qw().mo57143i();
                    if (i != null && m == i.longValue()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        arrayList2.add(next2);
                    }
                }
                return arrayList2;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25900e(C25895m mVar) {
            super(1);
            this.f65912d = mVar;
        }

        /* access modifiers changed from: private */
        public static final List invoke$lambda$0(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "it");
            return this.f65912d.f65895e.mo63245a().mo95062A(new C25905o(new C25901a(this.f65912d))).mo95075O();
        }
    }

    /* renamed from: lb0.m$f */
    static final class C25902f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C25895m f65914d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25902f(C25895m mVar) {
            super(1);
            this.f65914d = mVar;
        }

        /* renamed from: a */
        public final void mo64724a(C41205b bVar) {
            this.f65914d.f65901k.mo4823o(Boolean.TRUE);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo64724a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: lb0.m$g */
    static final class C25903g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C25895m f65915d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25903g(C25895m mVar) {
            super(1);
            this.f65915d = mVar;
        }

        /* renamed from: a */
        public final void mo64725a(List list) {
            C41238w wVar;
            C41536l.m120488h(list, "result");
            TransferAccountItem transferAccountItem = (TransferAccountItem) C41358y.m120009Y(list);
            if (transferAccountItem != null) {
                C25895m mVar = this.f65915d;
                AccumulateOnSpecificDateModel kw = mVar.f65903m;
                long m = transferAccountItem.mo52146m();
                String d = transferAccountItem.mo52134d();
                String i = transferAccountItem.mo52142i();
                mVar.m81389yw(AccumulateOnSpecificDateModel.m74487b(kw, (BigDecimal) null, d, (String) null, Long.valueOf(m), transferAccountItem.mo52136e(), false, (String) null, (Long) null, (String) null, i, (Integer) null, 1509, (Object) null));
                wVar = C41238w.f97225a;
            } else {
                wVar = null;
            }
            if (wVar == null) {
                C25895m mVar2 = this.f65915d;
                mVar2.m81389yw(AccumulateOnSpecificDateModel.m74487b(mVar2.f65903m, (BigDecimal) null, (String) null, (String) null, (Long) null, (String) null, false, (String) null, (Long) null, (String) null, (String) null, (Integer) null, 2039, (Object) null));
            }
            this.f65915d.f65901k.mo4823o(Boolean.FALSE);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo64725a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25895m(AccumulateOnSpecificDateModel accumulateOnSpecificDateModel, C24836a aVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(accumulateOnSpecificDateModel, "args");
        C41536l.m120489i(aVar, "getAccountsUseCase");
        this.f65894d = accumulateOnSpecificDateModel;
        this.f65895e = aVar;
        this.f65903m = accumulateOnSpecificDateModel;
        this.f65904n = C40139a.SRC;
        this.f65905o = C41219i.m119470b(new C25899d(this));
        if (accumulateOnSpecificDateModel.mo57143i() != null) {
            m81385tw();
        } else {
            m81389yw(accumulateOnSpecificDateModel);
        }
    }

    /* renamed from: nw */
    private final long m81382nw(int i) {
        Calendar instance = Calendar.getInstance();
        if (instance.get(5) >= i) {
            instance.add(2, 1);
        }
        instance.set(5, i);
        return instance.getTimeInMillis();
    }

    /* access modifiers changed from: private */
    /* renamed from: ow */
    public final List m81383ow(TransferAccounts transferAccounts, C40139a aVar) {
        List list = null;
        if (aVar == C40139a.DST) {
            TransferAccount b = transferAccounts.mo52162b();
            if (b != null) {
                list = b.mo52122a();
            }
        } else {
            TransferAccount b2 = transferAccounts.mo52162b();
            if (b2 != null) {
                list = b2.mo52123b();
            }
        }
        if (list == null) {
            return C41341q.m119907j();
        }
        return list;
    }

    /* access modifiers changed from: private */
    /* renamed from: pw */
    public final C39989a m81384pw() {
        return (C39989a) this.f65905o.getValue();
    }

    /* renamed from: tw */
    private final void m81385tw() {
        C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C25892j(new C25900e(this)));
        C41536l.m120488h(L0, "private fun loadAccounts…ndToLifecycle()\n        }");
        C41205b F0 = C32343x.m95453h1(L0).mo94980F(new C25893k(new C25902f(this))).mo94981F0(new C25894l(new C25903g(this)));
        C41536l.m120488h(F0, "private fun loadAccounts…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: uw */
    public static final C40754t m81386uw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: vw */
    public static final void m81387vw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: ww */
    public static final void m81388ww(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: yw */
    public final void m81389yw(AccumulateOnSpecificDateModel accumulateOnSpecificDateModel) {
        this.f65903m = accumulateOnSpecificDateModel;
        this.f65898h.mo4823o(accumulateOnSpecificDateModel);
    }

    /* renamed from: Dr */
    public LiveData mo64704Dr() {
        return this.f65899i;
    }

    /* renamed from: F1 */
    public void mo64699F1() {
        C37224b.m109965d(this.f65899i, this.f65903m);
    }

    /* renamed from: M3 */
    public void mo64700M3(int i) {
        Integer f = this.f65903m.mo57139f();
        if (f == null) {
            int i2 = i;
        } else if (i == f.intValue()) {
            return;
        }
        m81389yw(AccumulateOnSpecificDateModel.m74487b(this.f65903m, (BigDecimal) null, (String) null, (String) null, (Long) null, (String) null, false, (String) null, Long.valueOf(m81382nw(i)), (String) null, (String) null, Integer.valueOf(i), 895, (Object) null));
    }

    /* renamed from: P */
    public void mo64701P(TransferAccountItem transferAccountItem) {
        Long l;
        String str;
        String str2;
        String str3;
        AccumulateOnSpecificDateModel accumulateOnSpecificDateModel = this.f65903m;
        if (transferAccountItem != null) {
            l = Long.valueOf(transferAccountItem.mo52146m());
        } else {
            l = null;
        }
        if (transferAccountItem != null) {
            str = transferAccountItem.mo52134d();
        } else {
            str = null;
        }
        if (transferAccountItem != null) {
            str2 = transferAccountItem.mo52142i();
        } else {
            str2 = null;
        }
        if (transferAccountItem != null) {
            str3 = transferAccountItem.mo52136e();
        } else {
            str3 = null;
        }
        m81389yw(AccumulateOnSpecificDateModel.m74487b(accumulateOnSpecificDateModel, (BigDecimal) null, str, (String) null, l, str3, false, (String) null, (Long) null, (String) null, str2, (Integer) null, 1509, (Object) null));
    }

    /* renamed from: P0 */
    public void mo64702P0() {
        C1644x xVar = this.f65900j;
        C40139a aVar = C40139a.SRC;
        String h = this.f65903m.mo57141h();
        if (h == null) {
            h = "GEL";
        }
        C37224b.m109965d(xVar, new C25896a(aVar, h, this.f65903m.mo57143i(), m81384pw()));
    }

    /* renamed from: d */
    public void mo64703d(String str) {
        Object obj;
        BigDecimal bigDecimal;
        String obj2;
        BigDecimal bigDecimal2 = null;
        try {
            C41225n.C41226a aVar = C41225n.f97210d;
            if (str == null || (obj2 = C40440x.m117146P0(str).toString()) == null) {
                bigDecimal = null;
            } else {
                bigDecimal = new BigDecimal(obj2);
            }
            obj = C41225n.m119478a(bigDecimal);
        } catch (Throwable th) {
            C41225n.C41226a aVar2 = C41225n.f97210d;
            obj = C41225n.m119478a(C41228o.m119482a(th));
        }
        if (!C41225n.m119480c(obj)) {
            bigDecimal2 = obj;
        }
        BigDecimal bigDecimal3 = bigDecimal2;
        if (!C41536l.m120484d(bigDecimal3, this.f65903m.mo57135d())) {
            m81389yw(AccumulateOnSpecificDateModel.m74487b(this.f65903m, bigDecimal3, (String) null, (String) null, (Long) null, (String) null, false, (String) null, (Long) null, (String) null, (String) null, (Integer) null, 2046, (Object) null));
        }
    }

    /* renamed from: e */
    public LiveData mo64705e() {
        return this.f65901k;
    }

    /* renamed from: f3 */
    public LiveData mo64706f3() {
        return this.f65900j;
    }

    /* renamed from: k8 */
    public LiveData mo64707k8() {
        return this.f65898h;
    }

    /* renamed from: m */
    public LiveData mo64708m() {
        return this.f65902l;
    }

    /* renamed from: qw */
    public final AccumulateOnSpecificDateModel mo64709qw() {
        return this.f65894d;
    }

    /* renamed from: rw */
    public final C25890h mo64710rw() {
        return this.f65896f;
    }

    /* renamed from: sw */
    public final C25891i mo64711sw() {
        return this.f65897g;
    }

    /* renamed from: xw */
    public void mo64712xw() {
        C1644x xVar = this.f65899i;
        AccumulateOnSpecificDateModel accumulateOnSpecificDateModel = r2;
        AccumulateOnSpecificDateModel accumulateOnSpecificDateModel2 = new AccumulateOnSpecificDateModel((BigDecimal) null, (String) null, (String) null, (Long) null, (String) null, false, (String) null, (Long) null, (String) null, (String) null, (Integer) null, 2047, (DefaultConstructorMarker) null);
        C37224b.m109965d(xVar, accumulateOnSpecificDateModel);
    }
}
