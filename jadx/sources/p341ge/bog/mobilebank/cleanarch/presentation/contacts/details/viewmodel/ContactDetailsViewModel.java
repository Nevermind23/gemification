package p341ge.bog.mobilebank.cleanarch.presentation.contacts.details.viewmodel;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import ed1.C40735b0;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import ee1.C40767b;
import g91.C32343x;
import gd1.C40992a;
import h50.C24882b;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l10.C25799a;
import m41.C37223a;
import o10.C26658a;
import o10.C26659a0;
import o10.C26660b;
import o10.C26661b0;
import o10.C26662c;
import o10.C26664d;
import o10.C26666e;
import o10.C26667f;
import o10.C26668g;
import o10.C26669h;
import o10.C26670i;
import o10.C26671j;
import o10.C26672k;
import o10.C26673l;
import o10.C26674m;
import o10.C26675n;
import o10.C26676o;
import o10.C26677p;
import o10.C26678q;
import o10.C26679r;
import o10.C26680s;
import o10.C26681t;
import o10.C26682u;
import o10.C26683v;
import o10.C26684w;
import o10.C26685x;
import o10.C26686y;
import o10.C26687z;
import p341ge.bog.mobilebank.cleanarch.data.contact.ContactsRepositoryImpl;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.cleanarch.presentation.common.filter.model.FilterValue;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.model.otpparameter.OtpParams;
import p366bk.C10328q;
import p773gv.C24800g;
import p773gv.C24807j;
import p784hw.C25074c;
import p793iw.C25264c;
import p802jv.C25500g;
import p881ru.C28092a;
import p881ru.C28093b;
import p881ru.C28095d;
import p881ru.C28096e;
import p881ru.C28101j;
import p881ru.C28103l;
import p881ru.C28105m;
import p891su.C28261a;
import p891su.C28263c;
import p891su.C28271f;
import p948xw.C29861a;
import pc0.C27494a;
import s10.C28122a;
import ue1.C43075l;
import x30.C29644a;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.viewmodel.ContactDetailsViewModel */
public final class ContactDetailsViewModel extends C21481a {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public final C1644x f57680A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public final C1644x f57681B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public final C1644x f57682C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public final C1644x f57683D;

    /* renamed from: E */
    private final C1644x f57684E;

    /* renamed from: F */
    private final C1644x f57685F;

    /* renamed from: G */
    private long f57686G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public String f57687H;

    /* renamed from: I */
    private final AtomicBoolean f57688I;

    /* renamed from: J */
    private final AtomicBoolean f57689J;

    /* renamed from: K */
    private FilterValue.Calendar f57690K;

    /* renamed from: L */
    private FilterValue.Calendar f57691L;

    /* renamed from: M */
    private boolean f57692M;

    /* renamed from: d */
    private final C28092a f57693d;

    /* renamed from: e */
    private final C28095d f57694e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C28122a f57695f;

    /* renamed from: g */
    private final C28103l f57696g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C25074c f57697h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C29644a f57698i;

    /* renamed from: j */
    private final C28093b f57699j;

    /* renamed from: k */
    private final C28096e f57700k;

    /* renamed from: l */
    private final C24800g f57701l;

    /* renamed from: m */
    private final C24807j f57702m;

    /* renamed from: n */
    private final C29861a f57703n;

    /* renamed from: o */
    private final C27494a f57704o;

    /* renamed from: p */
    private final C40767b f57705p;

    /* renamed from: q */
    private final C1644x f57706q = new C1644x();

    /* renamed from: r */
    private final C1644x f57707r;

    /* renamed from: s */
    private final C1644x f57708s;

    /* renamed from: t */
    private final C1644x f57709t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public final C40767b f57710u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public final C40767b f57711v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public final C1644x f57712w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public final C1644x f57713x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public final C1644x f57714y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public final C40767b f57715z;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.viewmodel.ContactDetailsViewModel$a */
    static final class C21587a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28101j f57716d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21587a(C28101j jVar) {
            super(1);
            this.f57716d = jVar;
        }

        /* renamed from: a */
        public final C40754t invoke(Long l) {
            C41536l.m120489i(l, "it");
            return this.f57716d.mo67636a(l.longValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.viewmodel.ContactDetailsViewModel$b */
    static final class C21588b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactDetailsViewModel f57717d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21588b(ContactDetailsViewModel contactDetailsViewModel) {
            super(1);
            this.f57717d = contactDetailsViewModel;
        }

        /* renamed from: a */
        public final void mo53934a(C28263c cVar) {
            if (cVar instanceof C28263c.C28265b) {
                this.f57717d.f57711v.onNext(((C28263c.C28265b) cVar).mo67878b());
            } else if (cVar instanceof C28263c.C28264a) {
                this.f57717d.f57710u.onNext(this.f57717d.f57695f.mo67654a(((C28263c.C28264a) cVar).mo67877b()));
            } else if (cVar instanceof C28263c.C28266c) {
                this.f57717d.f57715z.onNext(this.f57717d.f57695f.mo67654a(((C28263c.C28266c) cVar).mo67879b()));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53934a((C28263c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.viewmodel.ContactDetailsViewModel$c */
    static final class C21589c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactDetailsViewModel f57718d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21589c(ContactDetailsViewModel contactDetailsViewModel) {
            super(1);
            this.f57718d = contactDetailsViewModel;
        }

        /* renamed from: a */
        public final void mo53935a(C28271f.C28274c cVar) {
            this.f57718d.f57712w.mo4823o(this.f57718d.f57695f.mo67657d(cVar.mo67884a()));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53935a((C28271f.C28274c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.viewmodel.ContactDetailsViewModel$d */
    static final class C21590d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactDetailsViewModel f57719d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21590d(ContactDetailsViewModel contactDetailsViewModel) {
            super(1);
            this.f57719d = contactDetailsViewModel;
        }

        /* renamed from: a */
        public final void mo53936a(C28271f.C28273b bVar) {
            this.f57719d.f57713x.mo4823o(this.f57719d.f57695f.mo67656c(bVar.mo67884a()));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53936a((C28271f.C28273b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.viewmodel.ContactDetailsViewModel$e */
    static final class C21591e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C25500g f57720d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21591e(C25500g gVar) {
            super(1);
            this.f57720d = gVar;
        }

        /* renamed from: a */
        public final C40754t invoke(Long l) {
            C41536l.m120489i(l, "it");
            return this.f57720d.mo64051b(l.longValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.viewmodel.ContactDetailsViewModel$f */
    static final class C21592f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactDetailsViewModel f57721d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21592f(ContactDetailsViewModel contactDetailsViewModel) {
            super(1);
            this.f57721d = contactDetailsViewModel;
        }

        /* renamed from: a */
        public final void mo53938a(List list) {
            this.f57721d.f57683D.mo4826r(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53938a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.viewmodel.ContactDetailsViewModel$g */
    static final class C21593g extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C21593g f57722d = new C21593g();

        C21593g() {
            super(1);
        }

        public final void invoke(Throwable th) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.viewmodel.ContactDetailsViewModel$h */
    static final class C21594h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactDetailsViewModel f57723d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21594h(ContactDetailsViewModel contactDetailsViewModel) {
            super(1);
            this.f57723d = contactDetailsViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f57723d.f57680A.mo4826r(new C37223a(new C21503d.C21504a(th, (Object) null, 2, (DefaultConstructorMarker) null)));
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.viewmodel.ContactDetailsViewModel$i */
    static final class C21595i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactDetailsViewModel f57724d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21595i(ContactDetailsViewModel contactDetailsViewModel) {
            super(1);
            this.f57724d = contactDetailsViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f57724d.f57680A.mo4826r(new C37223a(new C21503d.C21504a(th, (Object) null, 2, (DefaultConstructorMarker) null)));
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.viewmodel.ContactDetailsViewModel$j */
    static final class C21596j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactDetailsViewModel f57725d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21596j(ContactDetailsViewModel contactDetailsViewModel) {
            super(1);
            this.f57725d = contactDetailsViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f57725d.f57681B.mo4826r(new C37223a(new C21503d.C21504a(th, (Object) null, 2, (DefaultConstructorMarker) null)));
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.viewmodel.ContactDetailsViewModel$k */
    static final class C21597k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactDetailsViewModel f57726d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21597k(ContactDetailsViewModel contactDetailsViewModel) {
            super(1);
            this.f57726d = contactDetailsViewModel;
        }

        /* renamed from: a */
        public final void mo53943a(C41205b bVar) {
            C21484c.m69417i(this.f57726d.f57714y, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53943a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.viewmodel.ContactDetailsViewModel$l */
    static final class C21598l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactDetailsViewModel f57727d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21598l(ContactDetailsViewModel contactDetailsViewModel) {
            super(1);
            this.f57727d = contactDetailsViewModel;
        }

        /* renamed from: a */
        public final void mo53944a(C28261a aVar) {
            boolean z;
            ContactDetailsViewModel contactDetailsViewModel = this.f57727d;
            boolean z2 = false;
            if (!aVar.mo67861q() && aVar.mo67862r()) {
                String o = aVar.mo67859o();
                if (o == null || o.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    z2 = true;
                }
            }
            contactDetailsViewModel.mo53914ay(z2);
            this.f57727d.f57687H = aVar.mo67850g().mo67882b();
            this.f57727d.mo53907Rx().set(aVar.mo67866u());
            this.f57727d.mo53923mx().set(aVar.mo67849f());
            this.f57727d.mo53910Xx(new FilterValue.Calendar(aVar.mo67851h(), Long.valueOf(this.f57727d.f57698i.mo69560b()), Long.valueOf(this.f57727d.f57698i.mo69563e()), Long.valueOf(this.f57727d.f57698i.mo69561c())));
            ContactDetailsViewModel contactDetailsViewModel2 = this.f57727d;
            contactDetailsViewModel2.mo53911Yx(contactDetailsViewModel2.mo53921kx());
            C1644x Qw = this.f57727d.f57714y;
            boolean t = aVar.mo67864t();
            boolean e = aVar.mo67847e();
            C28122a Lw = this.f57727d.f57695f;
            C41536l.m120488h(aVar, "it");
            C21484c.m69418j(Qw, new C25799a(t, e, Lw.mo67657d(aVar), this.f57727d.f57695f.mo67656c(aVar), new ArrayList(this.f57727d.f57695f.mo67655b(aVar)), aVar.mo67866u(), aVar.mo67849f()));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53944a((C28261a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.viewmodel.ContactDetailsViewModel$m */
    static final class C21599m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactDetailsViewModel f57728d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21599m(ContactDetailsViewModel contactDetailsViewModel) {
            super(1);
            this.f57728d = contactDetailsViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f57728d.f57714y, (Throwable) null, (Object) null, 3, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.viewmodel.ContactDetailsViewModel$n */
    static final class C21600n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactDetailsViewModel f57729d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21600n(ContactDetailsViewModel contactDetailsViewModel) {
            super(1);
            this.f57729d = contactDetailsViewModel;
        }

        /* renamed from: a */
        public final C40735b0 invoke(C28261a aVar) {
            C41536l.m120489i(aVar, "contact");
            C25074c Mw = this.f57729d.f57697h;
            Long valueOf = Long.valueOf(this.f57729d.mo53922lx().mo53804d());
            Long a = this.f57729d.mo53922lx().mo53802a();
            Long l = a;
            C41536l.m120486f(a);
            return C25074c.m80040d(Mw, valueOf, l, (Integer) null, (Integer) null, (Integer) null, (List) null, (List) null, (List) null, (String) null, (List) null, (List) null, false, aVar, true, 4092, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.viewmodel.ContactDetailsViewModel$o */
    static final class C21601o extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C21601o f57730d = new C21601o();

        C21601o() {
            super(1);
        }

        public final void invoke(Throwable th) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.viewmodel.ContactDetailsViewModel$p */
    static final class C21602p extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactDetailsViewModel f57731d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21602p(ContactDetailsViewModel contactDetailsViewModel) {
            super(1);
            this.f57731d = contactDetailsViewModel;
        }

        /* renamed from: a */
        public final void mo53948a(C41205b bVar) {
            C21484c.m69417i(this.f57731d.mo53900Fx(), (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53948a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.viewmodel.ContactDetailsViewModel$q */
    static final class C21603q extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactDetailsViewModel f57732d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21603q(ContactDetailsViewModel contactDetailsViewModel) {
            super(1);
            this.f57732d = contactDetailsViewModel;
        }

        /* renamed from: a */
        public final void mo53949a(C25264c cVar) {
            BigDecimal c = cVar.mo63845c();
            if (c != null) {
                this.f57732d.mo53931yx().mo4826r(c);
            }
            BigDecimal e = cVar.mo63847e();
            if (e != null) {
                this.f57732d.mo53898Dx().mo4826r(e);
            }
            C21484c.m69418j(this.f57732d.mo53900Fx(), C24882b.m79537e(cVar.mo63846d()));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53949a((C25264c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.viewmodel.ContactDetailsViewModel$r */
    static final class C21604r extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactDetailsViewModel f57733d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21604r(ContactDetailsViewModel contactDetailsViewModel) {
            super(1);
            this.f57733d = contactDetailsViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f57733d.mo53900Fx(), th, (Object) null, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.viewmodel.ContactDetailsViewModel$s */
    static final class C21605s extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactDetailsViewModel f57734d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21605s(ContactDetailsViewModel contactDetailsViewModel) {
            super(1);
            this.f57734d = contactDetailsViewModel;
        }

        /* renamed from: a */
        public final void mo53951a(C41205b bVar) {
            this.f57734d.f57682C.mo4823o(new C37223a(new C21503d.C21505b((Object) null, 1, (DefaultConstructorMarker) null)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53951a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.viewmodel.ContactDetailsViewModel$t */
    static final class C21606t extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactDetailsViewModel f57735d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21606t(ContactDetailsViewModel contactDetailsViewModel) {
            super(1);
            this.f57735d = contactDetailsViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f57735d.f57682C.mo4823o(new C37223a(new C21503d.C21504a(th, (Object) null, 2, (DefaultConstructorMarker) null)));
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.viewmodel.ContactDetailsViewModel$u */
    static final class C21607u extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactDetailsViewModel f57736d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21607u(ContactDetailsViewModel contactDetailsViewModel) {
            super(1);
            this.f57736d = contactDetailsViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f57736d.f57680A.mo4826r(new C37223a(new C21503d.C21504a(th, (Object) null, 2, (DefaultConstructorMarker) null)));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactDetailsViewModel(C28101j jVar, C28092a aVar, C28095d dVar, C28105m mVar, C28122a aVar2, C28103l lVar, C25074c cVar, C29644a aVar3, C28093b bVar, C28096e eVar, C24800g gVar, C24807j jVar2, C29861a aVar4, C27494a aVar5, C25500g gVar2) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C28092a aVar6 = aVar;
        C28095d dVar2 = dVar;
        C28122a aVar7 = aVar2;
        C28103l lVar2 = lVar;
        C25074c cVar2 = cVar;
        C29644a aVar8 = aVar3;
        C28093b bVar2 = bVar;
        C28096e eVar2 = eVar;
        C24800g gVar3 = gVar;
        C24807j jVar3 = jVar2;
        C29861a aVar9 = aVar4;
        C27494a aVar10 = aVar5;
        C25500g gVar4 = gVar2;
        C41536l.m120489i(jVar, "getAccountEvent");
        C41536l.m120489i(aVar6, "addAccountToContact");
        C41536l.m120489i(dVar2, "deleteContactAccount");
        C41536l.m120489i(mVar, "getContactEvent");
        C41536l.m120489i(aVar7, "contactItemsMapper");
        C41536l.m120489i(lVar2, "getContactByIdUseCase");
        C41536l.m120489i(cVar2, "getTransactions");
        C41536l.m120489i(aVar8, "initialDateSettings");
        C41536l.m120489i(bVar2, "changeFavoriteAccountUseCase");
        C41536l.m120489i(eVar2, "deleteContact");
        C41536l.m120489i(gVar3, "addOrRemoveContactToReceiverListUseCase");
        C41536l.m120489i(jVar3, "addPhoneNumberAndAddToReceiversList");
        C41536l.m120489i(aVar9, "trustOrUntrustContactUseCase");
        C41536l.m120489i(aVar10, "otpParamsMapBuilder");
        C41536l.m120489i(gVar4, "getContactMoneyRequests");
        this.f57693d = aVar6;
        this.f57694e = dVar2;
        this.f57695f = aVar7;
        this.f57696g = lVar2;
        this.f57697h = cVar2;
        this.f57698i = aVar8;
        this.f57699j = bVar2;
        this.f57700k = eVar2;
        this.f57701l = gVar3;
        this.f57702m = jVar3;
        this.f57703n = aVar9;
        this.f57704o = aVar10;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Long>()");
        this.f57705p = h1;
        C1644x xVar = new C1644x();
        xVar.mo4826r(BigDecimal.ZERO);
        this.f57707r = xVar;
        C1644x xVar2 = new C1644x();
        xVar2.mo4826r(BigDecimal.ZERO);
        this.f57708s = xVar2;
        C1644x xVar3 = new C1644x();
        xVar3.mo4826r(Boolean.FALSE);
        this.f57709t = xVar3;
        C40767b h12 = C40767b.m118210h1();
        C41536l.m120488h(h12, "create<AccountItem>()");
        this.f57710u = h12;
        C40767b h13 = C40767b.m118210h1();
        C41536l.m120488h(h13, "create<String>()");
        this.f57711v = h13;
        this.f57712w = new C1644x();
        this.f57713x = new C1644x();
        this.f57714y = new C1644x();
        C40767b h14 = C40767b.m118210h1();
        C41536l.m120488h(h14, "create<AccountItem>()");
        this.f57715z = h14;
        this.f57680A = new C1644x();
        this.f57681B = new C1644x();
        this.f57682C = new C1644x();
        this.f57683D = new C1644x();
        this.f57684E = new C1644x();
        this.f57685F = new C1644x();
        this.f57686G = -1;
        this.f57687H = "";
        this.f57688I = new AtomicBoolean(false);
        this.f57689J = new AtomicBoolean(false);
        FilterValue.Calendar calendar = new FilterValue.Calendar(aVar3.mo69563e(), Long.valueOf(aVar3.mo69560b()), Long.valueOf(aVar3.mo69563e()), Long.valueOf(aVar3.mo69561c()));
        this.f57690K = calendar;
        this.f57691L = calendar;
        C41205b F0 = h1.mo94989L0(new C26660b(new C21587a(jVar))).mo95027o0(C40992a.m118827a()).mo94981F0(new C26662c(new C21588b(this)));
        C41536l.m120488h(F0, "contactIdSubject.switchM…)\n            }\n        }");
        bindToLifecycle(F0);
        C41205b F02 = mVar.mo67639a().mo95030q0(C28271f.C28274c.class).mo94981F0(new C26664d(new C21589c(this)));
        C41536l.m120488h(F02, "getContactEvent().ofType…          )\n            }");
        bindToLifecycle(F02);
        C41205b F03 = mVar.mo67639a().mo95030q0(C28271f.C28273b.class).mo94981F0(new C26666e(new C21590d(this)));
        C41536l.m120488h(F03, "getContactEvent().ofType…t.contact))\n            }");
        bindToLifecycle(F03);
        C41205b G0 = h1.mo94989L0(new C26667f(new C21591e(gVar4))).mo95027o0(C40992a.m118827a()).mo94983G0(new C26668g(new C21592f(this)), new C26669h(C21593g.f57722d));
        C41536l.m120488h(G0, "contactIdSubject.switchM…\n        }, {\n\n        })");
        bindToLifecycle(G0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Fw */
    public static final C40754t m69793Fw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Gw */
    public static final void m69794Gw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Gx */
    private final C40762x m69795Gx() {
        C40762x r = this.f57696g.mo67637b(this.f57686G).mo95087r(new C26681t(new C21600n(this)));
        C41536l.m120488h(r, "private fun getTransacti…    )\n            }\n    }");
        return r;
    }

    /* access modifiers changed from: private */
    /* renamed from: Hw */
    public static final void m69796Hw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Hx */
    public static final C40735b0 m69797Hx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40735b0) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Iw */
    public static final C40754t m69798Iw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Jw */
    public static final void m69799Jw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Kw */
    public static final void m69800Kw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Mx */
    public static final void m69803Mx(ContactDetailsViewModel contactDetailsViewModel, boolean z) {
        C41536l.m120489i(contactDetailsViewModel, "this$0");
        contactDetailsViewModel.f57685F.mo4826r(C32343x.m95466m(Boolean.valueOf(z)));
    }

    /* access modifiers changed from: private */
    /* renamed from: Nx */
    public static final void m69805Nx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Ox */
    public static final void m69807Ox(ContactDetailsViewModel contactDetailsViewModel, boolean z) {
        C41536l.m120489i(contactDetailsViewModel, "this$0");
        contactDetailsViewModel.f57685F.mo4826r(C32343x.m95466m(Boolean.valueOf(z)));
    }

    /* access modifiers changed from: private */
    /* renamed from: Tx */
    public static final void m69813Tx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Ux */
    public static final void m69815Ux(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Vx */
    public static final void m69817Vx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    public static final void _init_$lambda$5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: ax */
    public static final void m69821ax(ContactDetailsViewModel contactDetailsViewModel) {
        int i;
        C41536l.m120489i(contactDetailsViewModel, "this$0");
        C1644x xVar = contactDetailsViewModel.f57680A;
        if (contactDetailsViewModel.mo53905Px()) {
            i = C10328q.contact_treasury_code_add_successful;
        } else {
            i = C10328q.contact_account_add_successfull;
        }
        xVar.mo4826r(new C37223a(new C21503d.C21506c(Integer.valueOf(i))));
    }

    /* access modifiers changed from: private */
    /* renamed from: bx */
    public static final void m69822bx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: dx */
    public static final void m69824dx(ContactDetailsViewModel contactDetailsViewModel) {
        int i;
        C41536l.m120489i(contactDetailsViewModel, "this$0");
        C1644x xVar = contactDetailsViewModel.f57680A;
        if (contactDetailsViewModel.mo53905Px()) {
            i = C10328q.contact_treasury_code_delete_successful;
        } else {
            i = C10328q.contact_account_delete_successful;
        }
        xVar.mo4826r(new C37223a(new C21503d.C21506c(Integer.valueOf(i))));
    }

    /* access modifiers changed from: private */
    /* renamed from: dy */
    public static final void m69825dy(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: ex */
    public static final void m69827ex(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: ey */
    public static final void m69828ey(ContactDetailsViewModel contactDetailsViewModel) {
        C41536l.m120489i(contactDetailsViewModel, "this$0");
        AtomicBoolean atomicBoolean = contactDetailsViewModel.f57688I;
        atomicBoolean.set(!atomicBoolean.get());
        contactDetailsViewModel.f57682C.mo4823o(new C37223a(new C21503d.C21506c(C41238w.f97225a)));
    }

    /* access modifiers changed from: private */
    /* renamed from: fy */
    public static final void m69830fy(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: gx */
    public static final void m69832gx(ContactDetailsViewModel contactDetailsViewModel) {
        C41536l.m120489i(contactDetailsViewModel, "this$0");
        contactDetailsViewModel.f57681B.mo4826r(new C37223a(new C21503d.C21506c(C41238w.f97225a)));
    }

    /* access modifiers changed from: private */
    /* renamed from: hx */
    public static final void m69834hx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: hy */
    public static final void m69835hy(ContactDetailsViewModel contactDetailsViewModel) {
        C41536l.m120489i(contactDetailsViewModel, "this$0");
        contactDetailsViewModel.f57680A.mo4826r(new C37223a(new C21503d.C21506c(Integer.valueOf(C10328q.contact_successful_transaction))));
    }

    /* access modifiers changed from: private */
    /* renamed from: iy */
    public static final void m69837iy(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: px */
    private final void m69845px() {
        C41205b I = this.f57696g.mo67637b(this.f57686G).mo95083l(new C26687z(new C21597k(this))).mo95070I(new C26659a0(new C21598l(this)), new C26661b0(new C21599m(this)));
        C41536l.m120488h(I, "private fun getContactIn…).bindToLifecycle()\n    }");
        bindToLifecycle(I);
    }

    /* access modifiers changed from: private */
    /* renamed from: qx */
    public static final void m69847qx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: rx */
    public static final void m69849rx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: sx */
    public static final void m69851sx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Ax */
    public final LiveData mo53895Ax() {
        return this.f57685F;
    }

    /* renamed from: Bx */
    public final LiveData mo53896Bx() {
        return this.f57680A;
    }

    /* renamed from: Cx */
    public final HashMap mo53897Cx(OtpParams otpParams) {
        C41536l.m120489i(otpParams, "otpParams");
        return this.f57704o.mo66809a(otpParams);
    }

    /* renamed from: Dx */
    public final C1644x mo53898Dx() {
        return this.f57708s;
    }

    /* renamed from: Ex */
    public final LiveData mo53899Ex() {
        return this.f57684E;
    }

    /* renamed from: Fx */
    public final C1644x mo53900Fx() {
        return this.f57706q;
    }

    /* renamed from: Ix */
    public final LiveData mo53901Ix() {
        return this.f57682C;
    }

    /* renamed from: Jx */
    public final ContactsRepositoryImpl.TrustUntrustContactParams mo53902Jx(String str, String str2, String str3) {
        return new ContactsRepositoryImpl.TrustUntrustContactParams(C41339p.m119900e(Long.valueOf(this.f57686G)), this.f57688I.get() ^ true ? 1 : 0, BankApi.SERVICE_CLIENTS_TRUST_OR_UNTRUST_CONNECTION, str, str2, str3);
    }

    /* renamed from: Kx */
    public final void mo53903Kx(String str, boolean z) {
        boolean z2;
        if (this.f57692M) {
            if (str == null || str.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                C41205b F = this.f57702m.mo63219c(this.f57686G, str).mo94906z(C40992a.m118827a()).mo94887F(new C26658a(this, z));
                C41536l.m120488h(F, "addPhoneNumberAndAddToRe…Split.asEvent()\n        }");
                bindToLifecycle(F);
            }
        }
    }

    /* renamed from: Lx */
    public final void mo53904Lx(boolean z) {
        if (this.f57692M) {
            this.f57684E.mo4826r(C32343x.m95466m(Boolean.valueOf(z)));
            return;
        }
        C41205b G = this.f57701l.mo63215c(this.f57686G).mo94906z(C40992a.m118827a()).mo94888G(new C26672k(this, z), new C26674m(C21601o.f57730d));
        C41536l.m120488h(G, "addOrRemoveContactToRece…()\n                }, {})");
        bindToLifecycle(G);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = (l10.C25799a) r0.mo53701a();
     */
    /* renamed from: Px */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo53905Px() {
        /*
            r3 = this;
            androidx.lifecycle.x r0 = r3.f57714y
            java.lang.Object r0 = r0.mo4814f()
            ge.bog.mobilebank.cleanarch.presentation.common.d r0 = (p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d) r0
            r1 = 0
            if (r0 == 0) goto L_0x001b
            java.lang.Object r0 = r0.mo53701a()
            l10.a r0 = (l10.C25799a) r0
            if (r0 == 0) goto L_0x001b
            boolean r0 = r0.mo64426f()
            r2 = 1
            if (r0 != r2) goto L_0x001b
            r1 = r2
        L_0x001b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.presentation.contacts.details.viewmodel.ContactDetailsViewModel.mo53905Px():boolean");
    }

    /* renamed from: Qx */
    public final C1644x mo53906Qx() {
        return this.f57709t;
    }

    /* renamed from: Rx */
    public final AtomicBoolean mo53907Rx() {
        return this.f57688I;
    }

    /* renamed from: Sx */
    public final void mo53908Sx() {
        C41205b I = m69795Gx().mo95063B(C40992a.m118827a()).mo95083l(new C26673l(new C21602p(this))).mo95070I(new C26682u(new C21603q(this)), new C26683v(new C21604r(this)));
        C41536l.m120488h(I, "fun loadOperations() {\n …).bindToLifecycle()\n    }");
        bindToLifecycle(I);
    }

    /* renamed from: Wx */
    public final void mo53909Wx() {
        mo53911Yx(this.f57690K);
    }

    /* renamed from: Xx */
    public final void mo53910Xx(FilterValue.Calendar calendar) {
        C41536l.m120489i(calendar, "<set-?>");
        this.f57690K = calendar;
    }

    /* renamed from: Yx */
    public final void mo53911Yx(FilterValue.Calendar calendar) {
        C41536l.m120489i(calendar, C11755a.C11756a.f34100b);
        this.f57691L = calendar;
        this.f57709t.mo4823o(Boolean.valueOf(!C41536l.m120484d(this.f57690K, calendar)));
    }

    /* renamed from: Zw */
    public final void mo53912Zw(String str) {
        if (str != null) {
            C41205b G = this.f57693d.mo67628a(this.f57686G, str).mo94906z(C40992a.m118827a()).mo94888G(new C26670i(this), new C26671j(new C21594h(this)));
            C41536l.m120488h(G, "fun addContactAccount(ac…).bindToLifecycle()\n    }");
            bindToLifecycle(G);
        }
    }

    /* renamed from: Zx */
    public final void mo53913Zx(long j) {
        this.f57686G = j;
        this.f57705p.onNext(Long.valueOf(j));
        m69845px();
    }

    /* renamed from: ay */
    public final void mo53914ay(boolean z) {
        this.f57692M = z;
    }

    /* renamed from: cx */
    public final void mo53915cx(String str) {
        C41536l.m120489i(str, "acctNo");
        C41205b G = this.f57694e.mo67630a(this.f57686G, str).mo94906z(C40992a.m118827a()).mo94888G(new C26675n(this), new C26676o(new C21595i(this)));
        C41536l.m120488h(G, "fun deleteAccount(acctNo…).bindToLifecycle()\n    }");
        bindToLifecycle(G);
    }

    /* renamed from: cy */
    public final void mo53916cy(String str, String str2, String str3) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "scaAuthCode");
        C41205b G = this.f57703n.mo70123a(C41339p.m119900e(Long.valueOf(this.f57686G)), this.f57688I.get() ^ true ? 1 : 0, str, str2, str3).mo94904r(new C26684w(new C21605s(this))).mo94888G(new C26685x(this), new C26686y(new C21606t(this)));
        C41536l.m120488h(G, "fun trustOrUntrustContac…).bindToLifecycle()\n    }");
        bindToLifecycle(G);
    }

    /* renamed from: fx */
    public final void mo53917fx() {
        C41205b G = this.f57700k.mo67631a(this.f57686G).mo94906z(C40992a.m118827a()).mo94888G(new C26679r(this), new C26680s(new C21596j(this)));
        C41536l.m120488h(G, "fun deleteContact() {\n  …).bindToLifecycle()\n    }");
        bindToLifecycle(G);
    }

    /* renamed from: gy */
    public final void mo53918gy(String str) {
        C41536l.m120489i(str, "acctNo");
        C41205b G = this.f57699j.mo67629a(this.f57686G, str).mo94906z(C40992a.m118827a()).mo94888G(new C26677p(this), new C26678q(new C21607u(this)));
        C41536l.m120488h(G, "fun updateAccount(acctNo…).bindToLifecycle()\n    }");
        bindToLifecycle(G);
    }

    /* renamed from: ix */
    public final C40749p mo53919ix() {
        return this.f57715z;
    }

    /* renamed from: jx */
    public final C40749p mo53920jx() {
        return this.f57710u;
    }

    /* renamed from: kx */
    public final FilterValue.Calendar mo53921kx() {
        return this.f57690K;
    }

    /* renamed from: lx */
    public final FilterValue.Calendar mo53922lx() {
        return this.f57691L;
    }

    /* renamed from: mx */
    public final AtomicBoolean mo53923mx() {
        return this.f57689J;
    }

    /* renamed from: nx */
    public final String mo53924nx() {
        return this.f57687H;
    }

    /* renamed from: ox */
    public final long mo53925ox() {
        return this.f57686G;
    }

    /* renamed from: tx */
    public final LiveData mo53926tx() {
        return this.f57714y;
    }

    /* renamed from: ux */
    public final LiveData mo53927ux() {
        return this.f57713x;
    }

    /* renamed from: vx */
    public final LiveData mo53928vx() {
        return this.f57712w;
    }

    /* renamed from: wx */
    public final C40749p mo53929wx() {
        return this.f57711v;
    }

    /* renamed from: xx */
    public final LiveData mo53930xx() {
        return this.f57681B;
    }

    /* renamed from: yx */
    public final C1644x mo53931yx() {
        return this.f57707r;
    }

    /* renamed from: zx */
    public final LiveData mo53932zx() {
        return this.f57683D;
    }
}
