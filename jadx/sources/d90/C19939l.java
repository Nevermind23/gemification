package d90;

import android.os.Bundle;
import androidx.lifecycle.C1644x;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import ed0.C20217b;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40767b;
import g91.C32343x;
import h00.C24842a;
import h00.C24846c;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import java.math.BigDecimal;
import java.net.SocketTimeoutException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.model.common.ResultData;
import p380ck.C10464h;
import p842nv.C26617h;
import p897tp.C28474a;
import ue1.C43075l;
import w80.C29242a;
import x80.C29660d;

/* renamed from: d90.l */
public final class C19939l extends C21481a implements C19934g, C19935h {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C29242a f54469d;

    /* renamed from: e */
    private final C26617h f54470e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C20217b f54471f;

    /* renamed from: g */
    private final C28474a f54472g;

    /* renamed from: h */
    private final String f54473h;

    /* renamed from: i */
    private final String f54474i;

    /* renamed from: j */
    private final String f54475j;

    /* renamed from: k */
    private final String f54476k;

    /* renamed from: l */
    private String f54477l;

    /* renamed from: m */
    private final C19934g f54478m = this;

    /* renamed from: n */
    private final C19935h f54479n = this;

    /* renamed from: o */
    private final C1644x f54480o = new C1644x();

    /* renamed from: p */
    private final C1644x f54481p = new C1644x();

    /* renamed from: q */
    private final C1644x f54482q = new C1644x();

    /* renamed from: r */
    private final C1644x f54483r = new C1644x();

    /* renamed from: s */
    private final C40767b f54484s;

    /* renamed from: d90.l$a */
    static final class C19940a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19939l f54485d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19940a(C19939l lVar) {
            super(1);
            this.f54485d = lVar;
        }

        /* renamed from: a */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "requestCode");
            return C31270e.m92880i(this.f54485d.f54471f.mo48650b(this.f54485d.mo48322uw()), num.intValue());
        }
    }

    /* renamed from: d90.l$b */
    static final class C19941b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19939l f54486d;

        /* renamed from: d90.l$b$a */
        static final class C19942a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C19939l f54487d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C19942a(C19939l lVar) {
                super(1);
                this.f54487d = lVar;
            }

            /* renamed from: a */
            public final void mo48326a(C41205b bVar) {
                C37224b.m109962a(this.f54487d.mo48312te());
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo48326a((C41205b) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19941b(C19939l lVar) {
            super(1);
            this.f54486d = lVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m65852c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(String str) {
            C41536l.m120489i(str, "rsContract");
            C40749p O = this.f54486d.f54469d.mo69087a(this.f54486d.mo48313lw(), true, str, this.f54486d.mo48320sw(), this.f54486d.mo48321tw()).mo95075O();
            C41536l.m120488h(O, "prepareApplication(\n    …          .toObservable()");
            return C31270e.m92879h(O, -1).mo94980F(new C19946m(new C19942a(this.f54486d)));
        }
    }

    /* renamed from: d90.l$c */
    static final class C19943c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19939l f54488d;

        /* renamed from: d90.l$c$a */
        static final class C19944a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C19939l f54489d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C19944a(C19939l lVar) {
                super(1);
                this.f54489d = lVar;
            }

            /* renamed from: a */
            public final void mo48328a(C29660d dVar) {
                C19939l lVar = this.f54489d;
                C41536l.m120488h(dVar, "applicationData");
                lVar.m65831ww(dVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo48328a((C29660d) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: d90.l$c$b */
        static final class C19945b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C19939l f54490d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C19945b(C19939l lVar) {
                super(1);
                this.f54490d = lVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "error");
                this.f54490d.m65830vw(th);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19943c(C19939l lVar) {
            super(1);
            this.f54488d = lVar;
        }

        /* renamed from: a */
        public final void mo48327a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C19944a(this.f54488d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C19945b(this.f54488d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo48327a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19939l(C29242a aVar, C26617h hVar, C20217b bVar, C28474a aVar2, String str, String str2, String str3, String str4, String str5) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(aVar, "prepareApplication");
        C41536l.m120489i(hVar, "refreshOffers");
        C41536l.m120489i(bVar, "getInfoLookUps");
        C41536l.m120489i(aVar2, "applicationEventPoster");
        C41536l.m120489i(str, "textLookupName");
        C41536l.m120489i(str2, "appType");
        C41536l.m120489i(str3, "product");
        C41536l.m120489i(str4, "subProduct");
        C41536l.m120489i(str5, "limitType");
        this.f54469d = aVar;
        this.f54470e = hVar;
        this.f54471f = bVar;
        this.f54472g = aVar2;
        this.f54473h = str;
        this.f54474i = str2;
        this.f54475j = str3;
        this.f54476k = str4;
        this.f54477l = str5;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<String>()");
        this.f54484s = h1;
        C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C19938k(new C19940a(this)));
        C41536l.m120488h(L0, "merge(onInit(), onRefres…equestCode)\n            }");
        bindToLifecycle(C31270e.m92876e(C32343x.m95413R0(L0), mo48310S9()));
        m65819Aw();
        m65833yw(this, (String) null, "page_did_load", 1, (Object) null);
    }

    /* renamed from: Aw */
    private final void m65819Aw() {
        C40749p L0 = this.f54484s.mo94989L0(new C19936i(new C19941b(this)));
        C41536l.m120488h(L0, "private fun subscribePre…ndToLifecycle()\n        }");
        C41205b F0 = C32343x.m95413R0(L0).mo94981F0(new C19937j(new C19943c(this)));
        C41536l.m120488h(F0, "private fun subscribePre…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Bw */
    public static final C40754t m65820Bw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Cw */
    public static final void m65821Cw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: gw */
    public static final C40754t m65825gw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: vw */
    public final void m65830vw(Throwable th) {
        C24846c cVar;
        if (th instanceof SocketTimeoutException) {
            cVar = C24846c.TIME_OUT;
        } else {
            cVar = C24846c.ERROR;
        }
        C37224b.m109965d(mo48311j3(), new ResultData(false, cVar, (String) null, (String) null, (BigDecimal) null, (String) null, (String) null, 124, (DefaultConstructorMarker) null));
    }

    /* access modifiers changed from: private */
    /* renamed from: ww */
    public final void m65831ww(C29660d dVar) {
        C24846c a = C24846c.f63808e.mo63281a(dVar.mo69598a().mo69593b());
        if (a == null) {
            a = C24846c.ERROR;
        }
        C24846c cVar = a;
        if (C19932e.f54465b.contains(cVar)) {
            this.f54470e.mo65871a();
            this.f54472g.mo68096b();
        }
        C37224b.m109965d(mo48311j3(), new ResultData(false, cVar, (String) null, dVar.mo69598a().mo69592a(), (BigDecimal) null, (String) null, (String) null, 116, (DefaultConstructorMarker) null));
    }

    /* renamed from: xw */
    private final void m65832xw(String str, String str2) {
        if (C41536l.m120484d(this.f54477l, C24842a.BNPL_LIMIT_APP.mo63277b())) {
            C32343x.m95397J0(this, "bnpl_" + str, (String) null, "bnpl_" + str2, C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 18, (Object) null);
            return;
        }
        C32343x.m95397J0(this, str, (String) null, str2, C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 18, (Object) null);
    }

    /* renamed from: yw */
    static /* synthetic */ void m65833yw(C19939l lVar, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "check_my_limit";
        }
        lVar.m65832xw(str, str2);
    }

    /* renamed from: k0 */
    public void mo48308k0() {
        C37224b.m109962a(mo48309Md());
        m65833yw(this, (String) null, "start_process", 1, (Object) null);
    }

    /* renamed from: lw */
    public final String mo48313lw() {
        return this.f54474i;
    }

    /* renamed from: mw */
    public final C19934g mo48314mw() {
        return this.f54478m;
    }

    /* renamed from: nw */
    public C1644x mo48310S9() {
        return this.f54480o;
    }

    /* renamed from: ow */
    public C1644x mo48309Md() {
        return this.f54481p;
    }

    /* renamed from: pw */
    public C1644x mo48311j3() {
        return this.f54483r;
    }

    /* renamed from: qw */
    public final C19935h mo48318qw() {
        return this.f54479n;
    }

    /* renamed from: rw */
    public C1644x mo48312te() {
        return this.f54482q;
    }

    /* renamed from: sw */
    public final String mo48320sw() {
        return this.f54475j;
    }

    /* renamed from: tw */
    public final String mo48321tw() {
        return this.f54476k;
    }

    /* renamed from: uw */
    public final String mo48322uw() {
        return this.f54473h;
    }

    /* renamed from: zw */
    public void mo48323zw(String str) {
        C41536l.m120489i(str, "rsContract");
        this.f54484s.onNext(str);
        m65833yw(this, (String) null, "rs_check_approve", 1, (Object) null);
    }
}
