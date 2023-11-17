package p341ge.bog.mobilebank.cleanarch.identityverification.presentation.viewmodel;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import ba1.C10146d0;
import e41.C31658b;
import ed0.C20217b;
import ed1.C40762x;
import g91.C32343x;
import gd1.C40992a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.identityverification.data.repository.IdentityVerificationRepositoryImpl;
import p341ge.bog.mobilebank.cleanarch.identityverification.presentation.model.VerificationProcessDataUiModel;
import p341ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.rest.model.otpparameter.OtpParams;
import p341ge.bog.mobilebank.shared.tmx_profiling.TMXFlags;
import p844nx.C26637a;
import p844nx.C26638b;
import p854ox.C27093a;
import p855oy.C27094a;
import p874qx.C27869a;
import p894sx.C28280a;
import p894sx.C28281b;
import p894sx.C28282c;
import p894sx.C28283d;
import p894sx.C28284e;
import p894sx.C28285f;
import p894sx.C28286g;
import p894sx.C28287h;
import pc0.C27494a;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: ge.bog.mobilebank.cleanarch.identityverification.presentation.viewmodel.IdentityVerificationViewModel */
public final class IdentityVerificationViewModel extends C21481a {

    /* renamed from: u */
    public static final C21082a f56601u = new C21082a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C26638b f56602d;

    /* renamed from: e */
    private final C26637a f56603e;

    /* renamed from: f */
    private final C31658b f56604f;

    /* renamed from: g */
    private final C20217b f56605g;

    /* renamed from: h */
    private final C27094a f56606h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C27869a f56607i;

    /* renamed from: j */
    private final C27494a f56608j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C1644x f56609k = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C1644x f56610l = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C1644x f56611m = new C1644x();

    /* renamed from: n */
    private final C1644x f56612n = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C1644x f56613o = new C1644x();

    /* renamed from: p */
    private final C1644x f56614p = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: q */
    public HashMap f56615q;

    /* renamed from: r */
    private boolean f56616r;

    /* renamed from: s */
    private String f56617s = "";

    /* renamed from: t */
    private String f56618t = "";

    /* renamed from: ge.bog.mobilebank.cleanarch.identityverification.presentation.viewmodel.IdentityVerificationViewModel$a */
    public static final class C21082a {
        private C21082a() {
        }

        public /* synthetic */ C21082a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.identityverification.presentation.viewmodel.IdentityVerificationViewModel$b */
    /* synthetic */ class C21083b extends C41535k implements C43075l {
        C21083b(Object obj) {
            super(1, obj, C27094a.class, "transform", "transform(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C27094a) this.receiver).mo66388b(list);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.identityverification.presentation.viewmodel.IdentityVerificationViewModel$c */
    static final class C21084c extends C41537m implements C43079p {

        /* renamed from: d */
        public static final C21084c f56619d = new C21084c();

        C21084c() {
            super(2);
        }

        /* renamed from: a */
        public final C41224m invoke(C27093a aVar, List list) {
            C41536l.m120489i(aVar, "verificationProcessData");
            C41536l.m120489i(list, "lookUpData");
            return C41233s.m119492a(aVar, list);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.identityverification.presentation.viewmodel.IdentityVerificationViewModel$d */
    static final class C21085d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ IdentityVerificationViewModel f56620d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21085d(IdentityVerificationViewModel identityVerificationViewModel) {
            super(1);
            this.f56620d = identityVerificationViewModel;
        }

        /* renamed from: a */
        public final void mo52315a(C41205b bVar) {
            C21484c.m69417i(this.f56620d.f56610l, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo52315a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.identityverification.presentation.viewmodel.IdentityVerificationViewModel$e */
    static final class C21086e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ IdentityVerificationViewModel f56621d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21086e(IdentityVerificationViewModel identityVerificationViewModel) {
            super(1);
            this.f56621d = identityVerificationViewModel;
        }

        /* renamed from: a */
        public final void mo52316a(C41224m mVar) {
            C27093a aVar = (C27093a) mVar.mo95675a();
            List list = (List) mVar.mo95676b();
            String c = aVar.mo66378c();
            if (c != null) {
                this.f56621d.f56611m.mo4826r(C32343x.m95466m(c));
            }
            IdentityVerificationViewModel identityVerificationViewModel = this.f56621d;
            C41536l.m120488h(list, "lookUpData");
            LinkedHashMap linkedHashMap = new LinkedHashMap(C43429k.m124585d(C41342q0.m119921f(C41343r.m119925u(list, 10)), 16));
            for (Object next : list) {
                linkedHashMap.put(((LookupUiModel) next).mo52393d(), next);
            }
            identityVerificationViewModel.f56615q = new HashMap(linkedHashMap);
            C1644x qw = this.f56621d.f56610l;
            IdentityVerificationViewModel identityVerificationViewModel2 = this.f56621d;
            C27869a mw = identityVerificationViewModel2.f56607i;
            C41536l.m120488h(aVar, "verificationProcessData");
            List rw = identityVerificationViewModel2.m68210Iw(mw.mo67400a(aVar));
            HashMap lw = this.f56621d.f56615q;
            C41536l.m120486f(lw);
            C21484c.m69418j(qw, C41233s.m119492a(rw, lw));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo52316a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.identityverification.presentation.viewmodel.IdentityVerificationViewModel$f */
    static final class C21087f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ IdentityVerificationViewModel f56622d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21087f(IdentityVerificationViewModel identityVerificationViewModel) {
            super(1);
            this.f56622d = identityVerificationViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f56622d.f56610l, th, (Object) null, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.identityverification.presentation.viewmodel.IdentityVerificationViewModel$g */
    static final class C21088g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ IdentityVerificationViewModel f56623d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21088g(IdentityVerificationViewModel identityVerificationViewModel) {
            super(1);
            this.f56623d = identityVerificationViewModel;
        }

        /* renamed from: a */
        public final void mo52318a(C41205b bVar) {
            C21484c.m69417i(this.f56623d.f56609k, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo52318a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.identityverification.presentation.viewmodel.IdentityVerificationViewModel$h */
    static final class C21089h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ IdentityVerificationViewModel f56624d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21089h(IdentityVerificationViewModel identityVerificationViewModel) {
            super(1);
            this.f56624d = identityVerificationViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f56624d.f56613o.mo4823o(new C21503d.C21504a(th, (Object) null, 2, (DefaultConstructorMarker) null));
            C21484c.m69415g(this.f56624d.f56609k, th, (Object) null, 2, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IdentityVerificationViewModel(C26638b bVar, C26637a aVar, C31658b bVar2, C20217b bVar3, C27094a aVar2, C27869a aVar3, C27494a aVar4) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(bVar, "verifyIdentityUseCase");
        C41536l.m120489i(aVar, "getVerifyIdentityProcessDataUseCase");
        C41536l.m120489i(bVar2, "startTMXProfilingUseCase");
        C41536l.m120489i(bVar3, "getLookup");
        C41536l.m120489i(aVar2, "lookupUiMapper");
        C41536l.m120489i(aVar3, "mapper");
        C41536l.m120489i(aVar4, "otpParamsMapBuilder");
        this.f56602d = bVar;
        this.f56603e = aVar;
        this.f56604f = bVar2;
        this.f56605g = bVar3;
        this.f56606h = aVar2;
        this.f56607i = aVar3;
        this.f56608j = aVar4;
    }

    /* access modifiers changed from: private */
    /* renamed from: Bw */
    public static final List m68205Bw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Cw */
    public static final C41224m m68206Cw(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (C41224m) pVar.invoke(obj, obj2);
    }

    /* access modifiers changed from: private */
    /* renamed from: Dw */
    public static final void m68207Dw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Ew */
    public static final void m68208Ew(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Fw */
    public static final void m68209Fw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Iw */
    public final List m68210Iw(VerificationProcessDataUiModel verificationProcessDataUiModel) {
        ArrayList arrayList = new ArrayList();
        String d = verificationProcessDataUiModel.mo52286d();
        if (d != null) {
            arrayList.add(C41233s.m119492a(C32343x.m95388F("online.inst.authorization.page.details.store", new Object[0]), d));
        }
        String b = verificationProcessDataUiModel.mo52285b();
        if (b != null) {
            arrayList.add(C41233s.m119492a(C32343x.m95388F("online.inst.authorization.page.details.IP.Address", new Object[0]), b));
        }
        String h = verificationProcessDataUiModel.mo52292h();
        if (h != null) {
            arrayList.add(C41233s.m119492a(C32343x.m95388F("online.inst.authorization.page.details.browser", new Object[0]), h));
        }
        String e = verificationProcessDataUiModel.mo52288e();
        if (e != null) {
            arrayList.add(C41233s.m119492a(C32343x.m95388F("online.inst.authorization.page.details.OS", new Object[0]), e));
        }
        String a = verificationProcessDataUiModel.mo52284a();
        if (a != null) {
            arrayList.add(C41233s.m119492a(C32343x.m95388F("online.inst.authorization.page.details.country", new Object[0]), a));
        }
        String f = verificationProcessDataUiModel.mo52290f();
        if (f != null) {
            arrayList.add(C41233s.m119492a(C32343x.m95388F("online.inst.authorization.page.details.service.name", new Object[0]), f));
        }
        String g = verificationProcessDataUiModel.mo52291g();
        if (g != null) {
            arrayList.add(C41233s.m119492a(C32343x.m95388F("online.inst.authorization.page.details.terminal.id", new Object[0]), g));
        }
        return arrayList;
    }

    /* renamed from: Kw */
    public static /* synthetic */ void m68211Kw(IdentityVerificationViewModel identityVerificationViewModel, C21503d dVar, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        identityVerificationViewModel.mo52305Ph(dVar, str, str2, str3);
    }

    /* renamed from: Lw */
    private final void m68212Lw(String str, String str2, String str3) {
        C41205b G = this.f56602d.mo65891a(mo52307tw(str, str2, str3)).mo94906z(C40992a.m118827a()).mo94904r(new C28285f(new C21088g(this))).mo94888G(new C28286g(this), new C28287h(new C21089h(this)));
        C41536l.m120488h(G, "private fun verifyIdenti…).bindToLifecycle()\n    }");
        bindToLifecycle(G);
    }

    /* access modifiers changed from: private */
    /* renamed from: Mw */
    public static final void m68213Mw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Nw */
    public static final void m68214Nw(IdentityVerificationViewModel identityVerificationViewModel) {
        C41536l.m120489i(identityVerificationViewModel, "this$0");
        identityVerificationViewModel.f56614p.mo4823o(Boolean.TRUE);
        C21484c.m69418j(identityVerificationViewModel.f56609k, C41238w.f97225a);
    }

    /* access modifiers changed from: private */
    /* renamed from: Ow */
    public static final void m68215Ow(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: uw */
    public static /* synthetic */ IdentityVerificationRepositoryImpl.IdentityVerificationParams m68232uw(IdentityVerificationViewModel identityVerificationViewModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        return identityVerificationViewModel.mo52307tw(str, str2, str3);
    }

    /* renamed from: Aw */
    public final void mo52300Aw(String str, String str2) {
        C41536l.m120489i(str, "operationReference");
        C41536l.m120489i(str2, "operationType");
        C41205b I = C40762x.m118154T(this.f56603e.mo65890a(str), this.f56605g.mo48650b(str2).mo95062A(new C28280a(new C21083b(this.f56606h))), new C28281b(C21084c.f56619d)).mo95063B(C40992a.m118827a()).mo95083l(new C28282c(new C21085d(this))).mo95070I(new C28283d(new C21086e(this)), new C28284e(new C21087f(this)));
        C41536l.m120488h(I, "fun getVerificationProce…).bindToLifecycle()\n    }");
        bindToLifecycle(I);
    }

    /* renamed from: Gw */
    public final LiveData mo52301Gw() {
        return this.f56610l;
    }

    /* renamed from: Hw */
    public final void mo52302Hw(String str, String str2, boolean z) {
        C41536l.m120489i(str, "operationReference");
        C41536l.m120489i(str2, "qrType");
        this.f56617s = str;
        this.f56618t = str2;
        this.f56616r = z;
    }

    /* renamed from: I2 */
    public final LiveData mo52303I2() {
        return this.f56613o;
    }

    /* renamed from: Jw */
    public final void mo52304Jw() {
        bindToLifecycle(this.f56604f.mo72084b(TMXFlags.TMX_FLAG_QR_LOGIN_KEY));
        this.f56613o.mo4823o(new C21503d.C21506c(C41238w.f97225a));
    }

    /* renamed from: Ph */
    public final void mo52305Ph(C21503d dVar, String str, String str2, String str3) {
        C41536l.m120489i(dVar, "state");
        if (dVar instanceof C21503d.C21505b) {
            this.f56613o.mo4823o(new C21503d.C21505b((Object) null, 1, (DefaultConstructorMarker) null));
        } else if (dVar instanceof C21503d.C21504a) {
            this.f56613o.mo4823o(dVar);
        } else if (dVar instanceof C21503d.C21506c) {
            m68212Lw(str, str2, str3);
        }
    }

    /* renamed from: k0 */
    public final void mo52306k0() {
        HashMap hashMap = this.f56615q;
        if (hashMap != null) {
            C1644x xVar = this.f56612n;
            C41536l.m120486f(hashMap);
            xVar.mo4823o(C32343x.m95466m(hashMap));
        }
    }

    /* renamed from: tw */
    public final IdentityVerificationRepositoryImpl.IdentityVerificationParams mo52307tw(String str, String str2, String str3) {
        return new IdentityVerificationRepositoryImpl.IdentityVerificationParams(this.f56616r, "", this.f56617s, this.f56618t, C10146d0.C10177h.m37232a(), "IDENTITY_VERIFY_LOGIN_REDIRECT_PROCESS", str, str2, str3);
    }

    /* renamed from: vw */
    public final LiveData mo52308vw() {
        return this.f56614p;
    }

    /* renamed from: ww */
    public final LiveData mo52309ww() {
        return this.f56609k;
    }

    /* renamed from: xw */
    public final LiveData mo52310xw() {
        return this.f56612n;
    }

    /* renamed from: yw */
    public final LiveData mo52311yw() {
        return this.f56611m;
    }

    /* renamed from: zw */
    public final HashMap mo52312zw(OtpParams otpParams) {
        C41536l.m120489i(otpParams, "otpParams");
        return this.f56608j.mo66809a(otpParams);
    }
}
