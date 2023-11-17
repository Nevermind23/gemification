package p341ge.bog.mobilebank.payments.presentation.resultpage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.C1644x;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import com.google.gson.Gson;
import ed1.C40749p;
import ed1.C40754t;
import fy0.C32035i;
import fy0.C32036j;
import fy0.C32037k;
import g91.C32289b0;
import g91.C32307h;
import g91.C32343x;
import g91.C32359z0;
import gy0.C36088a;
import gy0.C36089b;
import gy0.C36090c;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41238w;
import id0.C25179a;
import id0.C25180b;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import jd0.C25383a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ox0.C37829b;
import ox0.C37833c;
import p189o0.C7357a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.payments.data.model.CodeStatus;
import p341ge.bog.mobilebank.payments.domain.model.KeyValue;
import p341ge.bog.mobilebank.payments.domain.model.PaymentReceiptPdfParameters;
import p341ge.bog.mobilebank.payments.presentation.resultpage.model.PaymentResultObjectUiModel;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.payments.presentation.resultpage.c */
public final class C33775c extends C21481a {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C25180b f82256d;

    /* renamed from: e */
    private final C25179a f82257e;

    /* renamed from: f */
    private final Gson f82258f;

    /* renamed from: g */
    private final Client f82259g;

    /* renamed from: h */
    private final Context f82260h;

    /* renamed from: i */
    private final PaymentResultObjectUiModel f82261i;

    /* renamed from: j */
    private final C33775c f82262j = this;

    /* renamed from: k */
    private final C33775c f82263k = this;

    /* renamed from: l */
    private final C1644x f82264l = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C1644x f82265m = new C1644x();

    /* renamed from: n */
    private final C1644x f82266n = new C1644x();

    /* renamed from: o */
    private final C1644x f82267o = new C1644x();

    /* renamed from: p */
    private final C1644x f82268p = new C1644x();

    /* renamed from: q */
    private final C1644x f82269q = new C1644x();

    /* renamed from: ge.bog.mobilebank.payments.presentation.resultpage.c$a */
    public interface C33776a {
        /* renamed from: a */
        C33775c mo32539a(PaymentResultObjectUiModel paymentResultObjectUiModel);
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.resultpage.c$b */
    static final class C33777b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33775c f82270d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33777b(C33775c cVar) {
            super(1);
            this.f82270d = cVar;
        }

        /* renamed from: a */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "it");
            return C31270e.m92880i(this.f82270d.f82256d.mo63718a(), -1);
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.resultpage.c$c */
    static final class C33778c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33775c f82271d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33778c(C33775c cVar) {
            super(1);
            this.f82271d = cVar;
        }

        /* renamed from: a */
        public final void mo80456a(C31128a aVar) {
            C33775c cVar = this.f82271d;
            C41536l.m120488h(aVar, "res");
            cVar.m99327Aw(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo80456a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.resultpage.c$d */
    static final class C33779d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33775c f82272d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33779d(C33775c cVar) {
            super(1);
            this.f82272d = cVar;
        }

        /* renamed from: a */
        public final void mo80457a(C25383a aVar) {
            C41536l.m120489i(aVar, "res");
            C1644x hw = this.f82272d.f82265m;
            boolean d = aVar.mo63973d();
            String F = C32343x.m95388F(aVar.mo63971b(), new Object[0]);
            String c = C32289b0.m95091c(aVar.mo63972c());
            String F2 = C32343x.m95388F(aVar.mo63970a(), new Object[0]);
            C41536l.m120488h(c, "generateImageUrl(res.iconServiceUrl)");
            hw.mo4823o(new C36088a(d, F, F2, c));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo80457a((C25383a) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33775c(C25180b bVar, C25179a aVar, Gson gson, Client client, Context context, PaymentResultObjectUiModel paymentResultObjectUiModel) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(bVar, "getCrossSalePackage");
        C41536l.m120489i(aVar, "closeCrossSalePackage");
        C41536l.m120489i(gson, "gson");
        C41536l.m120489i(client, "client");
        C41536l.m120489i(context, "context");
        C41536l.m120489i(paymentResultObjectUiModel, "paymentResultObject");
        this.f82256d = bVar;
        this.f82257e = aVar;
        this.f82258f = gson;
        this.f82259g = client;
        this.f82260h = context;
        this.f82261i = paymentResultObjectUiModel;
        m99343ow();
        m99332Fw();
        m99333Gw();
    }

    /* access modifiers changed from: private */
    /* renamed from: Aw */
    public final void m99327Aw(C31128a aVar) {
        C31132b.m92648j(aVar, (int[]) null, new C33779d(this), 1, (Object) null);
    }

    /* renamed from: Bw */
    private final void m99328Bw() {
        boolean z;
        this.f82269q.mo4823o(Boolean.valueOf(this.f82261i.mo80473p()));
        C1644x xVar = this.f82268p;
        if (this.f82261i.mo80474q() || this.f82261i.mo80472m()) {
            z = true;
        } else {
            z = false;
        }
        xVar.mo4823o(Boolean.valueOf(z));
    }

    /* renamed from: Cw */
    private final void m99329Cw() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String P;
        String P2;
        C1644x xVar = this.f82267o;
        BigDecimal lw = m99341lw();
        if (lw == null || (P2 = C32343x.m95408P(lw, "GEL")) == null) {
            str = "";
        } else {
            str = P2;
        }
        BigDecimal nw = m99342nw();
        if (nw == null || (P = C32343x.m95408P(nw, "GEL")) == null) {
            str2 = "";
        } else {
            str2 = P;
        }
        Long h = this.f82261i.mo80466h();
        if (h != null) {
            h.longValue();
            str3 = new SimpleDateFormat("dd.MM.yyyy HH:mm").format(new Date(this.f82261i.mo80466h().longValue()));
        } else {
            str3 = null;
        }
        if (str3 == null) {
            str4 = "";
        } else {
            str4 = str3;
        }
        String str6 = this.f82261i.mo80459b() + " " + C32307h.m95232i(this.f82261i.mo80465g());
        String d = this.f82261i.mo80460d();
        if (d == null) {
            str5 = "";
        } else {
            str5 = d;
        }
        xVar.mo4823o(new C36089b(str, str2, str4, str6, str5));
    }

    /* renamed from: Dw */
    private final void m99330Dw() {
        StringSource.Dictionary dictionary;
        String f = this.f82261i.mo80464f();
        if (f != null) {
            dictionary = new StringSource.Dictionary(f, (Boolean) null, (List) null, 6, (DefaultConstructorMarker) null);
        } else {
            dictionary = C37833c.f90838a.mo91130P();
        }
        this.f82264l.mo4823o(new C41224m(this.f82261i.mo80469j(), dictionary));
    }

    /* renamed from: Ew */
    private final void m99331Ew() {
        String P;
        C1644x xVar = this.f82266n;
        String k = this.f82261i.mo80470k();
        String l = this.f82261i.mo80471l();
        String e = this.f82261i.mo80462e();
        String str = "";
        if (e == null) {
            e = str;
        }
        BigDecimal lw = m99341lw();
        if (!(lw == null || (P = C32343x.m95408P(lw, "GEL")) == null)) {
            str = P;
        }
        xVar.mo4823o(new C36090c(k, l, e, str));
    }

    /* renamed from: Fw */
    private final void m99332Fw() {
        m99330Dw();
        m99331Ew();
        m99329Cw();
        m99328Bw();
    }

    /* renamed from: Gw */
    private final void m99333Gw() {
        if (this.f82261i.mo80469j() != CodeStatus.REJECTED) {
            new Handler(Looper.getMainLooper()).postDelayed(new C32035i(this), 1000);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Hw */
    public static final void m99334Hw(C33775c cVar) {
        C41536l.m120489i(cVar, "this$0");
        cVar.f82259g.requestTemplateDebts(true);
        cVar.f82259g.requestCarDebts(true);
        cVar.f82259g.forceUpdateData();
        C7357a.m28044b(cVar.f82260h).mo21731d(new Intent("ge.bog.mobilebank.products.presentation.products.refresh_products"));
    }

    /* renamed from: lw */
    private final BigDecimal m99341lw() {
        Object obj;
        String e;
        Iterator it = this.f82261i.mo80468i().mo80181a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C41536l.m120484d(((KeyValue) obj).mo80134a(), this.f82261i.mo80458a())) {
                break;
            }
        }
        KeyValue keyValue = (KeyValue) obj;
        if (keyValue == null) {
            return null;
        }
        try {
            String b = keyValue.mo80135b();
            if (b == null || (e = C37829b.m111218e(b)) == null) {
                return null;
            }
            return new BigDecimal(e);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: nw */
    private final BigDecimal m99342nw() {
        Object obj;
        String e;
        Iterator it = this.f82261i.mo80468i().mo80181a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C41536l.m120484d(((KeyValue) obj).mo80134a(), "commission")) {
                break;
            }
        }
        KeyValue keyValue = (KeyValue) obj;
        if (keyValue == null) {
            return null;
        }
        try {
            String b = keyValue.mo80135b();
            if (b == null || (e = C37829b.m111218e(b)) == null) {
                return null;
            }
            return new BigDecimal(e);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: ow */
    private final void m99343ow() {
        C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C32036j(new C33777b(this)));
        C41536l.m120488h(L0, "private fun getCrossSell…ndToLifecycle()\n        }");
        C41205b F0 = C32343x.m95413R0(L0).mo94981F0(new C32037k(new C33778c(this)));
        C41536l.m120488h(F0, "private fun getCrossSell…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: pw */
    public static final C40754t m99344pw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: qw */
    public static final void m99345qw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: C5 */
    public String mo80442C5() {
        return this.f82261i.mo80468i().mo80182b();
    }

    /* renamed from: jw */
    public C1644x mo80443jw() {
        return this.f82269q;
    }

    /* renamed from: kw */
    public C1644x mo80444kw() {
        return this.f82268p;
    }

    /* renamed from: mw */
    public C1644x mo80445mw() {
        return this.f82265m;
    }

    /* renamed from: rw */
    public final C33775c mo80446rw() {
        return this.f82262j;
    }

    /* renamed from: sw */
    public final C33775c mo80447sw() {
        return this.f82263k;
    }

    /* renamed from: tw */
    public C1644x mo80448tw() {
        return this.f82267o;
    }

    /* renamed from: uw */
    public C1644x mo80449uw() {
        return this.f82264l;
    }

    /* renamed from: vw */
    public HashMap mo80450vw() {
        HashMap hashMap = new HashMap();
        String w = this.f82258f.mo18181w(new PaymentReceiptPdfParameters(this.f82261i.mo80468i().mo80181a()));
        try {
            w = URLEncoder.encode(w, "utf-8");
        } catch (Exception unused) {
        }
        hashMap.put("essParameters", w);
        hashMap.put("lastFour", this.f82261i.mo80465g());
        hashMap.put("essServiceId", mo80442C5());
        hashMap.put("requestId", C32359z0.m95563d0());
        return hashMap;
    }

    /* renamed from: ww */
    public C1644x mo80451ww() {
        return this.f82266n;
    }

    /* renamed from: xw */
    public String mo80452xw() {
        return this.f82261i.mo80471l();
    }

    /* renamed from: yw */
    public List mo80453yw() {
        List<KeyValue> a = this.f82261i.mo80468i().mo80181a();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(a, 10));
        for (KeyValue keyValue : a) {
            arrayList.add(new p341ge.bog.mobilebank.model.KeyValue(keyValue.mo80134a(), keyValue.mo80135b()));
        }
        return arrayList;
    }

    /* renamed from: zw */
    public void mo80454zw() {
        this.f82257e.mo63717a();
    }
}
