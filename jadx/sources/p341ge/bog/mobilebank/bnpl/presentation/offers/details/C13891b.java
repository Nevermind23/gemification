package p341ge.bog.mobilebank.bnpl.presentation.offers.details;

import android.os.Bundle;
import androidx.lifecycle.C1644x;
import b41.C31128a;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import ee1.C40767b;
import g91.C32300e0;
import g91.C32343x;
import hd1.C41204a;
import he1.C41238w;
import iu0.C36546y;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p380ck.C10463g;
import p380ck.C10464h;
import p578ql.C17527b;
import p578ql.C17529c;
import p606sl.C17845k;
import p606sl.C17846l;
import p673xl.C18779b;
import p673xl.C18780c;
import p701zl.C19067f;
import p701zl.C19068g;
import p701zl.C19069h;
import p701zl.C19070i;
import p782hu.C25065a;
import p791iu.C25258b;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: ge.bog.mobilebank.bnpl.presentation.offers.details.b */
public final class C13891b extends C21481a implements C19067f, C19068g {

    /* renamed from: p */
    public static final C13892a f41222p = new C13892a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C17527b f41223d;

    /* renamed from: e */
    private final C25258b f41224e;

    /* renamed from: f */
    private final C17529c f41225f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final long f41226g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final String f41227h;

    /* renamed from: i */
    private final C19067f f41228i = this;

    /* renamed from: j */
    private final C19068g f41229j = this;

    /* renamed from: k */
    private final C1644x f41230k = new C1644x();

    /* renamed from: l */
    private final C1644x f41231l = new C1644x();

    /* renamed from: m */
    private final C1644x f41232m = new C1644x();

    /* renamed from: n */
    private final C1644x f41233n = new C1644x();

    /* renamed from: o */
    private final C40767b f41234o;

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.offers.details.b$a */
    public static final class C13892a {
        private C13892a() {
        }

        public /* synthetic */ C13892a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.offers.details.b$b */
    public interface C13893b {
        /* renamed from: a */
        C13891b mo32557a(long j, String str);
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.offers.details.b$c */
    static final class C13894c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C13891b f41235d;

        /* renamed from: ge.bog.mobilebank.bnpl.presentation.offers.details.b$c$a */
        static final class C13895a extends C41537m implements C43079p {

            /* renamed from: d */
            final /* synthetic */ C13891b f41236d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C13895a(C13891b bVar) {
                super(2);
                this.f41236d = bVar;
            }

            /* renamed from: a */
            public final C18780c invoke(C17845k kVar, C25065a aVar) {
                C41536l.m120489i(kVar, "merchantData");
                C41536l.m120489i(aVar, "limitData");
                return this.f41236d.m51763iw(kVar, aVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13894c(C13891b bVar) {
            super(1);
            this.f41235d = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C18780c m51784c(C43079p pVar, Object obj, Object obj2) {
            C41536l.m120489i(pVar, "$tmp0");
            return (C18780c) pVar.invoke(obj, obj2);
        }

        /* renamed from: b */
        public final C40754t invoke(Integer num) {
            boolean z;
            C41536l.m120489i(num, "it");
            C40762x b = this.f41235d.mo38308kw().mo45045b(this.f41235d.f41226g, this.f41235d.f41227h);
            C25258b jw = this.f41235d.mo38307jw();
            if (num.intValue() == 6 || num.intValue() == 2) {
                z = true;
            } else {
                z = false;
            }
            C40762x T = C40762x.m118154T(b, jw.mo63775b(z), new C13897c(new C13895a(this.f41235d)));
            C41536l.m120488h(T, "private fun subscribeToM…ndToLifecycle()\n        }");
            return C31270e.m92880i(T, num.intValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.offers.details.b$d */
    static final class C13896d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C13891b f41237d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13896d(C13891b bVar) {
            super(1);
            this.f41237d = bVar;
        }

        /* renamed from: a */
        public final C40754t invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C40749p O = this.f41237d.mo38309lw().mo45047a(this.f41237d.f41226g, this.f41237d.f41227h).mo95075O();
            C41536l.m120488h(O, "getBnplMerchantStoresUse…          .toObservable()");
            return C31270e.m92879h(O, 1);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13891b(C17527b bVar, C25258b bVar2, C17529c cVar, long j, String str) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(bVar, "getBnplMerchantDetailsUseCase");
        C41536l.m120489i(bVar2, "getBnplLimitUseCase");
        C41536l.m120489i(cVar, "getBnplMerchantStoresUseCase");
        C41536l.m120489i(str, "brandName");
        this.f41223d = bVar;
        this.f41224e = bVar2;
        this.f41225f = cVar;
        this.f41226g = j;
        this.f41227h = str;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Unit>()");
        this.f41234o = h1;
        m51764tw();
        m51766vw();
    }

    /* access modifiers changed from: private */
    /* renamed from: iw */
    public final C18780c m51763iw(C17845k kVar, C25065a aVar) {
        boolean z;
        List x0;
        List x02;
        String c = kVar.mo45493c();
        boolean z2 = false;
        if (c == null || (x02 = C40440x.m117182x0(c, new String[]{","}, false, 0, 6, (Object) null)) == null) {
            z = false;
        } else {
            z = x02.contains("ONL_INST");
        }
        String c2 = kVar.mo45493c();
        if (!(c2 == null || (x0 = C40440x.m117182x0(c2, new String[]{","}, false, 0, 6, (Object) null)) == null)) {
            z2 = x0.contains("INSTORE_INST");
        }
        return new C18780c(kVar, new C18779b(z, z2), aVar);
    }

    /* renamed from: tw */
    private final void m51764tw() {
        C40749p L0 = C40749p.m118047l0(onRefresh(), onInit()).mo94989L0(new C19069h(new C13894c(this)));
        C41536l.m120488h(L0, "private fun subscribeToM…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(C32343x.m95413R0(L0), mo38303R3()));
    }

    /* access modifiers changed from: private */
    /* renamed from: uw */
    public static final C40754t m51765uw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: vw */
    private final void m51766vw() {
        C40749p L0 = this.f41234o.mo94989L0(new C19070i(new C13896d(this)));
        C41536l.m120488h(L0, "private fun subscribeToM…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(C32343x.m95413R0(L0), mo38305Ti()));
    }

    /* access modifiers changed from: private */
    /* renamed from: ww */
    public static final C40754t m51767ww(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: jw */
    public final C25258b mo38307jw() {
        return this.f41224e;
    }

    /* renamed from: kw */
    public final C17527b mo38308kw() {
        return this.f41223d;
    }

    /* renamed from: lw */
    public final C17529c mo38309lw() {
        return this.f41225f;
    }

    /* renamed from: mw */
    public C1644x mo38306io() {
        return this.f41232m;
    }

    /* renamed from: nw */
    public C1644x mo38303R3() {
        return this.f41230k;
    }

    /* renamed from: ow */
    public C1644x mo38305Ti() {
        return this.f41231l;
    }

    /* renamed from: pw */
    public C1644x mo38304T6() {
        return this.f41233n;
    }

    /* renamed from: qw */
    public final C19068g mo38314qw() {
        return this.f41229j;
    }

    /* renamed from: rw */
    public void mo38315rw() {
        String str;
        C18780c cVar;
        C17845k c;
        C1644x mw = mo38306io();
        C31128a aVar = (C31128a) mo38303R3().mo4814f();
        if (aVar == null || (cVar = (C18780c) aVar.mo71340a()) == null || (c = cVar.mo46576c()) == null || (str = c.mo45495e()) == null) {
            str = "";
        }
        mw.mo4823o(C32343x.m95466m(str));
        C36546y.m108282F().mo27152s("bnpl", "BNPL_offers_internal_page", "Bnpl_buy_online");
        C36546y.m108282F().mo27137H("BNPL_click_buy_online_internalpage", "", "", (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE);
    }

    /* renamed from: sw */
    public void mo38316sw(int i) {
        C17846l lVar;
        String str;
        String str2;
        List list;
        C31128a aVar = (C31128a) mo38305Ti().mo4814f();
        String str3 = null;
        if (aVar == null || (list = (List) aVar.mo71340a()) == null) {
            lVar = null;
        } else {
            lVar = (C17846l) list.get(i);
        }
        C10463g F = C36546y.m108282F();
        C32300e0 e0Var = C32300e0.f79712a;
        if (lVar != null) {
            str = lVar.mo45500b();
        } else {
            str = null;
        }
        if (lVar != null) {
            str3 = lVar.mo45499a();
        }
        F.mo27152s("bnpl", "BNPL_offers_internal_page", (String) e0Var.mo72818d(str, str3));
        C36546y.m108282F().mo27137H("BNPL_click_shop_address_internalpage", "", "", (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE);
        C1644x pw = mo38304T6();
        if (lVar == null || (str2 = lVar.mo45501c()) == null) {
            str2 = "";
        }
        pw.mo4823o(C32343x.m95466m(str2));
    }
}
