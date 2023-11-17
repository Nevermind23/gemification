package o90;

import androidx.lifecycle.C1644x;
import b41.C31128a;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import g90.C20782d;
import g90.C20783e;
import g91.C32343x;
import h90.C24921b;
import hd1.C41204a;
import he1.C41238w;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import nc1.C41772a;
import p341ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.FormData;
import p855oy.C27094a;
import t80.C28325b;
import ue1.C43075l;

/* renamed from: o90.m1 */
public final class C26836m1 extends C21481a implements C26818h1, C26822i1 {

    /* renamed from: d */
    private final FormData f67558d;

    /* renamed from: e */
    private final String f67559e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C28325b f67560f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C27094a f67561g;

    /* renamed from: h */
    private final C26818h1 f67562h = this;

    /* renamed from: i */
    private final C26822i1 f67563i = this;

    /* renamed from: j */
    private final C1644x f67564j = new C1644x();

    /* renamed from: k */
    private final C1644x f67565k = new C1644x();

    /* renamed from: l */
    private final C1644x f67566l = new C1644x();

    /* renamed from: m */
    private final C1644x f67567m = new C1644x();

    /* renamed from: n */
    private final C1644x f67568n = new C1644x();

    /* renamed from: o90.m1$a */
    static final class C26837a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26836m1 f67569d;

        /* renamed from: o90.m1$a$a */
        /* synthetic */ class C26838a extends C41535k implements C43075l {
            C26838a(Object obj) {
                super(1, obj, C27094a.class, "transform", "transform(Ljava/util/List;)Ljava/util/List;", 0);
            }

            public final List invoke(List list) {
                C41536l.m120489i(list, "p0");
                return ((C27094a) this.receiver).mo66388b(list);
            }
        }

        /* renamed from: o90.m1$a$b */
        /* synthetic */ class C26839b extends C41535k implements C43075l {
            C26839b(Object obj) {
                super(1, obj, C26836m1.class, "transformCurrencies", "transformCurrencies(Ljava/util/List;)Ljava/util/List;", 0);
            }

            public final List invoke(List list) {
                C41536l.m120489i(list, "p0");
                return ((C26836m1) this.receiver).m83474pw(list);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26837a(C26836m1 m1Var) {
            super(1);
            this.f67569d = m1Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final List m83494d(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        public static final List invoke$lambda$0(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* renamed from: c */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "requestCode");
            C40762x A = this.f67569d.f67560f.mo67967a().mo95062A(new C26830k1(new C26838a(this.f67569d.f67561g))).mo95062A(new C26833l1(new C26839b(this.f67569d)));
            C41536l.m120488h(A, "getCurrencyLookup()\n    …ap(::transformCurrencies)");
            return C31270e.m92880i(A, num.intValue());
        }
    }

    /* renamed from: o90.m1$b */
    public interface C26840b {
        /* renamed from: a */
        C26836m1 mo32792a(FormData formData, String str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26836m1(FormData formData, String str, C28325b bVar, C27094a aVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(formData, "formData");
        C41536l.m120489i(str, "minAmount");
        C41536l.m120489i(bVar, "getCurrencyLookup");
        C41536l.m120489i(aVar, "lookupUiMapper");
        this.f67558d = formData;
        this.f67559e = str;
        this.f67560f = bVar;
        this.f67561g = aVar;
        C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C26826j1(new C26837a(this)));
        C41536l.m120488h(L0, "merge(onInit(), onRefres…equestCode)\n            }");
        bindToLifecycle(C31270e.m92876e(C32343x.m95413R0(L0), mo66128z()));
        String a = formData.mo56084a();
        if (a != null) {
            mo66125Qr().mo4823o(C32343x.m95466m(a));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ew */
    public static final C40754t m83470ew(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: pw */
    public final List m83474pw(List list) {
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LookupUiModel lookupUiModel = (LookupUiModel) it.next();
            String d = lookupUiModel.mo52393d();
            String e = this.f67558d.mo56088e();
            if (e == null) {
                e = "GEL";
            }
            arrayList.add(new C20783e(lookupUiModel, C41536l.m120484d(d, e)));
        }
        return arrayList;
    }

    /* renamed from: qw */
    private final void m83475qw() {
        C20782d a = C24921b.m79667a(this.f67558d);
        if (a != null) {
            mo66127wk().mo4823o(Boolean.valueOf(a.mo49349m()));
        }
    }

    /* renamed from: Va */
    public String mo66120Va() {
        C41772a aVar = C41772a.f98076a;
        String e = this.f67558d.mo56088e();
        if (e == null) {
            e = "GEL";
        }
        return aVar.mo96595c(e);
    }

    /* renamed from: d */
    public void mo66121d(String str) {
        this.f67558d.mo56100q(str);
        m83475qw();
    }

    /* renamed from: iw */
    public C1644x mo66127wk() {
        return this.f67567m;
    }

    /* renamed from: jw */
    public C1644x mo66128z() {
        return this.f67564j;
    }

    /* renamed from: kw */
    public C1644x mo66125Qr() {
        return this.f67568n;
    }

    /* renamed from: lw */
    public final C26818h1 mo66139lw() {
        return this.f67562h;
    }

    /* renamed from: mw */
    public C1644x mo66126iq() {
        return this.f67566l;
    }

    /* renamed from: nw */
    public C1644x mo66124Mt() {
        return this.f67565k;
    }

    /* renamed from: ow */
    public final C26822i1 mo66142ow() {
        return this.f67563i;
    }

    /* renamed from: sg */
    public void mo66122sg() {
        boolean z;
        String e = this.f67558d.mo56088e();
        String a = this.f67558d.mo56084a();
        if (a == null || a.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && e != null) {
            try {
                if (new BigDecimal(a).compareTo(new BigDecimal(this.f67559e)) < 0) {
                    mo66126iq().mo4823o(C32343x.m95466m(C41238w.f97225a));
                } else {
                    C37224b.m109965d(mo66124Mt(), this.f67558d);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    /* renamed from: uh */
    public void mo66123uh(int i) {
        String str;
        List list;
        C20783e eVar;
        LookupUiModel a;
        FormData formData = this.f67558d;
        C31128a aVar = (C31128a) mo66128z().mo4814f();
        if (aVar == null || (list = (List) aVar.mo71340a()) == null || (eVar = (C20783e) list.get(i)) == null || (a = eVar.mo49353a()) == null) {
            str = null;
        } else {
            str = a.mo52393d();
        }
        formData.mo56102s(str);
        m83475qw();
    }
}
