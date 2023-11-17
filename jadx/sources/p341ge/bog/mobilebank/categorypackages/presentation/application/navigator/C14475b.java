package p341ge.bog.mobilebank.categorypackages.presentation.application.navigator;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import cf1.C40407d;
import ed1.C40734b;
import ed1.C40735b0;
import ed1.C40736c;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import ee1.C40767b;
import g91.C32343x;
import g91.C32359z0;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import j51.C36746r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ld0.C25950a;
import m41.C37223a;
import m41.C37224b;
import p341ge.bog.mobilebank.categorypackages.data.entity.PackageActivationParamsObject;
import p341ge.bog.mobilebank.categorypackages.presentation.application.shared.model.SoloApplicationFormData;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.utm.data.entity.UtmParamsEntity;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.rest.model.otpparameter.OtpParams;
import p441go.C15373a;
import p441go.C15375c;
import p441go.C15381f;
import p441go.C15386k;
import p441go.C15389l;
import p455ho.C15548b;
import p455ho.C15549c;
import p455ho.C15551e;
import p455ho.C15552f;
import p455ho.C15554g;
import p595ro.C17686d;
import p595ro.C17687e;
import p595ro.C17688f;
import p595ro.C17689g;
import p595ro.C17690h;
import p595ro.C17691i;
import p595ro.C17692j;
import p595ro.C17693k;
import p595ro.C17694l;
import p595ro.C17695m;
import p595ro.C17696n;
import p748eu.C20292b;
import p758fu.C20557a;
import pc0.C27494a;
import t70.C28323a;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.navigator.b */
public final class C14475b extends C21481a implements C17686d, C17687e {

    /* renamed from: D */
    public static final C14476a f42272D = new C14476a((DefaultConstructorMarker) null);

    /* renamed from: A */
    private final C40767b f42273A;

    /* renamed from: B */
    private final C40767b f42274B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public List f42275C;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C15389l f42276d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C15375c f42277e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C15373a f42278f;

    /* renamed from: g */
    private final PreferencesApiManager f42279g;

    /* renamed from: h */
    private final C20292b f42280h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C15381f f42281i;

    /* renamed from: j */
    private final C36746r f42282j;

    /* renamed from: k */
    private final Client f42283k;

    /* renamed from: l */
    private final C27494a f42284l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final SoloApplicationFormData f42285m;

    /* renamed from: n */
    private final boolean f42286n;

    /* renamed from: o */
    private final C17686d f42287o = this;

    /* renamed from: p */
    private final C17687e f42288p = this;

    /* renamed from: q */
    private final C1644x f42289q = new C1644x();

    /* renamed from: r */
    private final C1644x f42290r = new C1644x();

    /* renamed from: s */
    private final C1644x f42291s = new C1644x();

    /* renamed from: t */
    private final C1644x f42292t = new C1644x();

    /* renamed from: u */
    private final C1644x f42293u = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: v */
    public final C1644x f42294v = new C1644x();

    /* renamed from: w */
    private final C1644x f42295w = new C1644x();

    /* renamed from: x */
    private final C1644x f42296x = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: y */
    public final C1644x f42297y = new C1644x();

    /* renamed from: z */
    private final C40767b f42298z;

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.navigator.b$a */
    public static final class C14476a {
        private C14476a() {
        }

        public /* synthetic */ C14476a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.navigator.b$b */
    public interface C14477b {
        /* renamed from: a */
        C14475b mo32783a(SoloApplicationFormData soloApplicationFormData, boolean z);
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.navigator.b$c */
    static final class C14478c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C14475b f42299d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14478c(C14475b bVar) {
            super(1);
            this.f42299d = bVar;
        }

        /* renamed from: a */
        public final C40754t invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            return C31270e.m92880i(this.f42299d.f42276d.mo42489a(this.f42299d.f42285m.mo40919f(), this.f42299d.f42285m.mo40932t(), true), -1);
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.navigator.b$d */
    static final class C14479d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C14475b f42300d;

        /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.navigator.b$d$a */
        static final class C14480a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C14475b f42301d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14480a(C14475b bVar) {
                super(1);
                this.f42301d = bVar;
            }

            /* renamed from: a */
            public final void mo40695a(C15548b bVar) {
                this.f42301d.m53535Tw(true);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo40695a((C15548b) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.navigator.b$d$b */
        static final class C14481b extends C41537m implements C43079p {

            /* renamed from: d */
            final /* synthetic */ C14475b f42302d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14481b(C14475b bVar) {
                super(2);
                this.f42302d = bVar;
            }

            /* renamed from: a */
            public final void mo40696a(Throwable th, C15548b bVar) {
                C41536l.m120489i(th, "error");
                this.f42302d.m53524Iw(String.valueOf(C32343x.m95431a0(th, (String) null, 1, (Object) null)));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                mo40696a((Throwable) obj, (C15548b) obj2);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.navigator.b$d$c */
        static final class C14482c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C14475b f42303d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14482c(C14475b bVar) {
                super(1);
                this.f42303d = bVar;
            }

            /* renamed from: a */
            public final void mo40697a(C15548b bVar) {
                C41536l.m120489i(bVar, "fields");
                this.f42303d.f42275C = bVar.mo42721a();
                this.f42303d.m53523Hw();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo40697a((C15548b) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14479d(C14475b bVar) {
            super(1);
            this.f42300d = bVar;
        }

        /* renamed from: a */
        public final void mo40694a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92646h(aVar, (int[]) null, new C14480a(this.f42300d), 1, (Object) null);
            C31132b.m92644f(aVar, (int[]) null, new C14481b(this.f42300d), 1, (Object) null);
            C31132b.m92648j(aVar, (int[]) null, new C14482c(this.f42300d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40694a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.navigator.b$e */
    static final class C14483e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C14475b f42304d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14483e(C14475b bVar) {
            super(1);
            this.f42304d = bVar;
        }

        /* renamed from: a */
        public final C40754t invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            return C31270e.m92880i(this.f42304d.f42277e.mo42479a(this.f42304d.f42285m.mo40919f(), this.f42304d.f42285m.mo40913a(), this.f42304d.f42285m.mo40932t(), this.f42304d.f42285m.mo40931s(), this.f42304d.f42285m.mo40921h(), this.f42304d.f42285m.mo40924j()), -1);
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.navigator.b$f */
    static final class C14484f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C14475b f42305d;

        /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.navigator.b$f$a */
        static final class C14485a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C14475b f42306d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14485a(C14475b bVar) {
                super(1);
                this.f42306d = bVar;
            }

            /* renamed from: a */
            public final void mo40700a(C25950a aVar) {
                this.f42306d.m53535Tw(true);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo40700a((C25950a) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.navigator.b$f$b */
        static final class C14486b extends C41537m implements C43079p {

            /* renamed from: d */
            final /* synthetic */ C14475b f42307d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14486b(C14475b bVar) {
                super(2);
                this.f42307d = bVar;
            }

            /* renamed from: a */
            public final void mo40701a(Throwable th, C25950a aVar) {
                C41536l.m120489i(th, "error");
                this.f42307d.m53524Iw(String.valueOf(C32343x.m95431a0(th, (String) null, 1, (Object) null)));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                mo40701a((Throwable) obj, (C25950a) obj2);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.navigator.b$f$c */
        static final class C14487c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C14475b f42308d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14487c(C14475b bVar) {
                super(1);
                this.f42308d = bVar;
            }

            /* renamed from: a */
            public final void mo40702a(C25950a aVar) {
                C41536l.m120489i(aVar, "preContract");
                C37224b.m109965d(this.f42308d.f42294v, aVar.mo64864a());
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo40702a((C25950a) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14484f(C14475b bVar) {
            super(1);
            this.f42305d = bVar;
        }

        /* renamed from: a */
        public final void mo40699a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92646h(aVar, (int[]) null, new C14485a(this.f42305d), 1, (Object) null);
            C31132b.m92644f(aVar, (int[]) null, new C14486b(this.f42305d), 1, (Object) null);
            C31132b.m92648j(aVar, (int[]) null, new C14487c(this.f42305d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40699a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.navigator.b$g */
    static final class C14488g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C14475b f42309d;

        /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.navigator.b$g$a */
        static final class C14489a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C14475b f42310d;

            /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.navigator.b$g$a$a */
            static final class C14490a extends C41537m implements C43079p {

                /* renamed from: d */
                final /* synthetic */ C15554g f42311d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C14490a(C15554g gVar) {
                    super(2);
                    this.f42311d = gVar;
                }

                /* renamed from: a */
                public final C41224m invoke(List list, C15554g gVar) {
                    C41536l.m120489i(list, "cardTypes");
                    C41536l.m120489i(gVar, "<anonymous parameter 1>");
                    return C41233s.m119492a(list, this.f42311d);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14489a(C14475b bVar) {
                super(1);
                this.f42310d = bVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: c */
            public static final C41224m m53593c(C43079p pVar, Object obj, Object obj2) {
                C41536l.m120489i(pVar, "$tmp0");
                return (C41224m) pVar.invoke(obj, obj2);
            }

            /* renamed from: b */
            public final C40735b0 invoke(C15554g gVar) {
                C41536l.m120489i(gVar, "activationResponse");
                if (C41536l.m120484d(gVar.mo42742b(), Boolean.TRUE)) {
                    return C40762x.m118154T(this.f42310d.f42281i.mo42482a(), C40762x.m118162z(gVar), new C14497d(new C14490a(gVar)));
                }
                return C40762x.m118162z(C41233s.m119492a(C41341q.m119907j(), gVar));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14488g(C14475b bVar) {
            super(1);
            this.f42309d = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C40735b0 m53590c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C40735b0) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(HashMap hashMap) {
            C41536l.m120489i(hashMap, "params");
            C40762x r = this.f42309d.f42278f.mo42477a(hashMap).mo95087r(new C14496c(new C14489a(this.f42309d)));
            C41536l.m120488h(r, "private fun subscribeToS…ndToLifecycle()\n        }");
            return C31270e.m92880i(r, -1);
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.navigator.b$h */
    static final class C14491h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C14475b f42312d;

        /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.navigator.b$h$a */
        static final class C14492a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C14475b f42313d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14492a(C14475b bVar) {
                super(1);
                this.f42313d = bVar;
            }

            /* renamed from: a */
            public final void mo40707a(C41224m mVar) {
                this.f42313d.m53535Tw(true);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo40707a((C41224m) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.navigator.b$h$b */
        static final class C14493b extends C41537m implements C43079p {

            /* renamed from: d */
            final /* synthetic */ C14475b f42314d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14493b(C14475b bVar) {
                super(2);
                this.f42314d = bVar;
            }

            /* renamed from: a */
            public final void mo40708a(Throwable th, C41224m mVar) {
                C41536l.m120489i(th, "error");
                this.f42314d.m53524Iw(String.valueOf(C32343x.m95431a0(th, (String) null, 1, (Object) null)));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                mo40708a((Throwable) obj, (C41224m) obj2);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.navigator.b$h$c */
        static final class C14494c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C14475b f42315d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14494c(C14475b bVar) {
                super(1);
                this.f42315d = bVar;
            }

            /* renamed from: a */
            public final void mo40709a(C41224m mVar) {
                List<C15551e> list = (List) mVar.mo95675a();
                C15554g gVar = (C15554g) mVar.mo95676b();
                this.f42315d.m53536Uw();
                C41536l.m120488h(list, "cardTypes");
                ArrayList arrayList = new ArrayList();
                for (C15551e d : list) {
                    String d2 = d.mo42734d();
                    if (d2 != null) {
                        arrayList.add(d2);
                    }
                }
                if (arrayList.isEmpty()) {
                    C14475b bVar = this.f42315d;
                    C41536l.m120488h(gVar, "activationResponse");
                    bVar.m53522Gw(gVar);
                    return;
                }
                C37224b.m109965d(this.f42315d.f42297y, arrayList);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo40709a((C41224m) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14491h(C14475b bVar) {
            super(1);
            this.f42312d = bVar;
        }

        /* renamed from: a */
        public final void mo40706a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92646h(aVar, (int[]) null, new C14492a(this.f42312d), 1, (Object) null);
            C31132b.m92644f(aVar, (int[]) null, new C14493b(this.f42312d), 1, (Object) null);
            C31132b.m92648j(aVar, (int[]) null, new C14494c(this.f42312d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40706a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.navigator.b$i */
    static final class C14495i extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C14495i f42316d = new C14495i();

        C14495i() {
            super(1);
        }

        public final void invoke(Throwable th) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14475b(C15389l lVar, C15375c cVar, C15373a aVar, PreferencesApiManager preferencesApiManager, C20292b bVar, C15381f fVar, C36746r rVar, Client client, C27494a aVar2, SoloApplicationFormData soloApplicationFormData, boolean z) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(lVar, "getRequiredApplicationFields");
        C41536l.m120489i(cVar, "getApplicationPreContract");
        C41536l.m120489i(aVar, "activatePackage");
        C41536l.m120489i(preferencesApiManager, "preferencesApiManager");
        C41536l.m120489i(bVar, "getAppSettingByNameUseCase");
        C41536l.m120489i(fVar, "getEligibleCardTypes");
        C41536l.m120489i(rVar, "updateUserInfoUseCase");
        C41536l.m120489i(client, "client");
        C41536l.m120489i(aVar2, "otpParamsMapBuilder");
        C41536l.m120489i(soloApplicationFormData, "formData");
        this.f42276d = lVar;
        this.f42277e = cVar;
        this.f42278f = aVar;
        this.f42279g = preferencesApiManager;
        this.f42280h = bVar;
        this.f42281i = fVar;
        this.f42282j = rVar;
        this.f42283k = client;
        this.f42284l = aVar2;
        this.f42285m = soloApplicationFormData;
        this.f42286n = z;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Unit>()");
        this.f42298z = h1;
        C40767b h12 = C40767b.m118210h1();
        C41536l.m120488h(h12, "create<HashMap<String, Any>>()");
        this.f42273A = h12;
        C40767b h13 = C40767b.m118210h1();
        C41536l.m120488h(h13, "create<Unit>()");
        this.f42274B = h13;
        this.f42275C = C41341q.m119907j();
        m53529Nw();
        m53532Qw();
        m53526Kw();
        if (z) {
            h1.onNext(C41238w.f97225a);
        } else {
            h13.onNext(C41238w.f97225a);
        }
    }

    /* renamed from: Aw */
    static /* synthetic */ PackageActivationParamsObject m53519Aw(C14475b bVar, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        return bVar.m53562zw(str, str2, str3);
    }

    /* renamed from: Bw */
    private final String m53520Bw() {
        String str;
        C37223a aVar = (C37223a) this.f42294v.mo4814f();
        String str2 = null;
        if (aVar != null) {
            str = (String) aVar.mo90299d();
        } else {
            str = null;
        }
        if (str != null) {
            byte[] bytes = str.getBytes(C40407d.f95989b);
            C41536l.m120488h(bytes, "this as java.lang.String).getBytes(charset)");
            if (bytes != null) {
                str2 = C32359z0.m95597y(bytes);
            }
        }
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    /* renamed from: Fw */
    private final String m53521Fw(String str) {
        return (!this.f42283k.getUserInfo().isRBClient() || !C41536l.m120484d(str, C15386k.C15387a.C15388a.SOLO.mo42488b())) ? "" : "Y";
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [ge.bog.designsystem.components.pagestate.PageStateType] */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r3v15, types: [ge.bog.designsystem.components.pagestate.PageStateType$Success] */
    /* JADX WARNING: type inference failed for: r4v13, types: [ge.bog.designsystem.components.pagestate.PageStateType$Success] */
    /* JADX WARNING: type inference failed for: r4v14, types: [ge.bog.designsystem.components.pagestate.PageStateType$Warning] */
    /* JADX WARNING: type inference failed for: r4v15, types: [ge.bog.designsystem.components.pagestate.PageStateType$Warning] */
    /* JADX WARNING: type inference failed for: r3v16, types: [ge.bog.designsystem.components.pagestate.PageStateType$Success] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: Gw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m53522Gw(p455ho.C15554g r18) {
        /*
            r17 = this;
            r0 = r17
            boolean r1 = r18.mo42741a()
            r2 = 0
            if (r1 == 0) goto L_0x001a
            ge.bog.designsystem.components.pagestate.PageStateType$Success r1 = new ge.bog.designsystem.components.pagestate.PageStateType$Success
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 15
            r9 = 0
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9)
            java.lang.String r3 = "text.packages.activation.downgrade.result"
            goto L_0x0086
        L_0x001a:
            java.lang.Boolean r1 = r18.mo42743c()
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r1 = kotlin.jvm.internal.C41536l.m120484d(r1, r3)
            if (r1 == 0) goto L_0x0036
            ge.bog.designsystem.components.pagestate.PageStateType$Warning r1 = new ge.bog.designsystem.components.pagestate.PageStateType$Warning
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 15
            r10 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            java.lang.String r3 = "packages.application.result.genesis.call.request.registered"
            goto L_0x0086
        L_0x0036:
            java.lang.Boolean r1 = r18.mo42747f()
            boolean r1 = kotlin.jvm.internal.C41536l.m120484d(r1, r3)
            if (r1 == 0) goto L_0x0050
            ge.bog.designsystem.components.pagestate.PageStateType$Warning r1 = new ge.bog.designsystem.components.pagestate.PageStateType$Warning
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 15
            r10 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            java.lang.String r3 = "packages.application.result.solo.package.change.requested"
            goto L_0x0086
        L_0x0050:
            java.lang.Boolean r1 = r18.mo42742b()
            boolean r1 = kotlin.jvm.internal.C41536l.m120484d(r1, r3)
            if (r1 == 0) goto L_0x006a
            ge.bog.designsystem.components.pagestate.PageStateType$Success r1 = new ge.bog.designsystem.components.pagestate.PageStateType$Success
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 15
            r10 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            java.lang.String r3 = "packages.application.result.digital.solo.activation.success"
            goto L_0x0086
        L_0x006a:
            java.lang.Boolean r1 = r18.mo42745e()
            boolean r1 = kotlin.jvm.internal.C41536l.m120484d(r1, r3)
            if (r1 == 0) goto L_0x0084
            ge.bog.designsystem.components.pagestate.PageStateType$Success r1 = new ge.bog.designsystem.components.pagestate.PageStateType$Success
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 15
            r9 = 0
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9)
            java.lang.String r3 = "packages.application.result.RB.package.activation.success"
            goto L_0x0086
        L_0x0084:
            r1 = r2
            r3 = r1
        L_0x0086:
            r4 = 0
            if (r3 == 0) goto L_0x0090
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r3 = g91.C32343x.m95388F(r3, r5)
            goto L_0x0091
        L_0x0090:
            r3 = r2
        L_0x0091:
            if (r3 == 0) goto L_0x01ca
            if (r1 == 0) goto L_0x01ca
            java.lang.Long r5 = r18.mo42744d()
            if (r5 == 0) goto L_0x00b5
            long r5 = r5.longValue()
            eu.b r7 = r0.f42280h
            java.lang.String r8 = "PACKAGES_DATE_DEFAULT_FORMAT"
            fu.a r7 = r7.mo48775b(r8)
            if (r7 == 0) goto L_0x00ad
            java.lang.String r2 = r7.mo49087d()
        L_0x00ad:
            java.lang.String r2 = p610sp.C17913e.m61727i(r5, r3, r2)
            if (r2 != 0) goto L_0x00b4
            goto L_0x00b5
        L_0x00b4:
            r3 = r2
        L_0x00b5:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            boolean r5 = r18.mo42741a()
            java.lang.String r6 = "my.package.page.fee.type.Y"
            java.lang.String r7 = "my.package.page.fee.type.MD"
            java.lang.String r8 = "packages.application.result.details.fee.period.desc"
            java.lang.String r10 = "packages.application.result.details.fee.period"
            r11 = 2
            java.lang.String r12 = "packages.application.result.details.package.name"
            r13 = 1
            r14 = 4
            if (r5 == 0) goto L_0x013e
            ge.bog.mobilebank.categorypackages.presentation.application.result.model.DetailsItem[] r5 = new p341ge.bog.mobilebank.categorypackages.presentation.application.result.model.DetailsItem[r14]
            ge.bog.mobilebank.categorypackages.presentation.application.result.model.DetailsItem$DetailHeader r15 = new ge.bog.mobilebank.categorypackages.presentation.application.result.model.DetailsItem$DetailHeader
            java.lang.String r14 = "text.packages.activate.result.existing.pack.details"
            java.lang.Object[] r9 = new java.lang.Object[r4]
            java.lang.String r9 = g91.C32343x.m95388F(r14, r9)
            r15.<init>(r9)
            r5[r4] = r15
            ge.bog.mobilebank.categorypackages.presentation.application.result.model.DetailsItem$DetailsKeyValue r9 = new ge.bog.mobilebank.categorypackages.presentation.application.result.model.DetailsItem$DetailsKeyValue
            java.lang.Object[] r14 = new java.lang.Object[r4]
            java.lang.String r14 = g91.C32343x.m95388F(r12, r14)
            ge.bog.mobilebank.categorypackages.presentation.application.shared.model.SoloApplicationFormData r15 = r0.f42285m
            java.lang.String r15 = r15.mo40913a()
            r9.<init>(r14, r15)
            r5[r13] = r9
            ge.bog.mobilebank.categorypackages.presentation.application.result.model.DetailsItem$DetailsKeyValue r9 = new ge.bog.mobilebank.categorypackages.presentation.application.result.model.DetailsItem$DetailsKeyValue
            java.lang.Object[] r14 = new java.lang.Object[r4]
            java.lang.String r14 = g91.C32343x.m95388F(r10, r14)
            ge.bog.mobilebank.categorypackages.presentation.application.shared.model.SoloApplicationFormData r15 = r0.f42285m
            java.lang.String r15 = r15.mo40915d()
            if (r15 != 0) goto L_0x0103
            java.lang.String r15 = ""
        L_0x0103:
            r9.<init>(r14, r15)
            r5[r11] = r9
            ge.bog.mobilebank.categorypackages.presentation.application.result.model.DetailsItem$DetailsKeyValue r9 = new ge.bog.mobilebank.categorypackages.presentation.application.result.model.DetailsItem$DetailsKeyValue
            java.lang.Object[] r14 = new java.lang.Object[r4]
            java.lang.String r14 = g91.C32343x.m95388F(r8, r14)
            ge.bog.mobilebank.categorypackages.presentation.application.shared.model.SoloApplicationFormData r15 = r0.f42285m
            java.lang.String r15 = r15.mo40917e()
            ho.f r16 = p455ho.C15552f.YA
            java.lang.String r11 = r16.mo42739b()
            boolean r11 = kotlin.jvm.internal.C41536l.m120484d(r15, r11)
            if (r11 == 0) goto L_0x0129
            java.lang.Object[] r11 = new java.lang.Object[r4]
            java.lang.String r11 = g91.C32343x.m95388F(r6, r11)
            goto L_0x012f
        L_0x0129:
            java.lang.Object[] r11 = new java.lang.Object[r4]
            java.lang.String r11 = g91.C32343x.m95388F(r7, r11)
        L_0x012f:
            r9.<init>(r14, r11)
            r11 = 3
            r5[r11] = r9
            java.util.List r5 = ie1.C41341q.m119913p(r5)
            r2.addAll(r5)
            r5 = 4
            goto L_0x013f
        L_0x013e:
            r5 = r14
        L_0x013f:
            ge.bog.mobilebank.categorypackages.presentation.application.result.model.DetailsItem[] r5 = new p341ge.bog.mobilebank.categorypackages.presentation.application.result.model.DetailsItem[r5]
            ge.bog.mobilebank.categorypackages.presentation.application.result.model.DetailsItem$DetailHeader r9 = new ge.bog.mobilebank.categorypackages.presentation.application.result.model.DetailsItem$DetailHeader
            boolean r11 = r18.mo42741a()
            if (r11 == 0) goto L_0x0152
            java.lang.String r11 = "text.packages.activate.result.pending.pack.details"
            java.lang.Object[] r14 = new java.lang.Object[r4]
            java.lang.String r11 = g91.C32343x.m95388F(r11, r14)
            goto L_0x015a
        L_0x0152:
            java.lang.String r11 = "packages.application.result.details.block.header"
            java.lang.Object[] r14 = new java.lang.Object[r4]
            java.lang.String r11 = g91.C32343x.m95388F(r11, r14)
        L_0x015a:
            r9.<init>(r11)
            r5[r4] = r9
            ge.bog.mobilebank.categorypackages.presentation.application.result.model.DetailsItem$DetailsKeyValue r9 = new ge.bog.mobilebank.categorypackages.presentation.application.result.model.DetailsItem$DetailsKeyValue
            java.lang.Object[] r11 = new java.lang.Object[r4]
            java.lang.String r11 = g91.C32343x.m95388F(r12, r11)
            ge.bog.mobilebank.categorypackages.presentation.application.shared.model.SoloApplicationFormData r12 = r0.f42285m
            java.lang.String r12 = r12.mo40931s()
            r9.<init>(r11, r12)
            r5[r13] = r9
            ge.bog.mobilebank.categorypackages.presentation.application.result.model.DetailsItem$DetailsKeyValue r9 = new ge.bog.mobilebank.categorypackages.presentation.application.result.model.DetailsItem$DetailsKeyValue
            java.lang.Object[] r11 = new java.lang.Object[r4]
            java.lang.String r10 = g91.C32343x.m95388F(r10, r11)
            ge.bog.mobilebank.categorypackages.presentation.application.shared.model.SoloApplicationFormData r11 = r0.f42285m
            java.lang.String r11 = r11.mo40926l()
            r9.<init>(r10, r11)
            r10 = 2
            r5[r10] = r9
            ge.bog.mobilebank.categorypackages.presentation.application.result.model.DetailsItem$DetailsKeyValue r9 = new ge.bog.mobilebank.categorypackages.presentation.application.result.model.DetailsItem$DetailsKeyValue
            java.lang.Object[] r10 = new java.lang.Object[r4]
            java.lang.String r8 = g91.C32343x.m95388F(r8, r10)
            ge.bog.mobilebank.categorypackages.presentation.application.shared.model.SoloApplicationFormData r10 = r0.f42285m
            java.lang.String r10 = r10.mo40927m()
            ho.f r11 = p455ho.C15552f.YA
            java.lang.String r11 = r11.mo42739b()
            boolean r10 = kotlin.jvm.internal.C41536l.m120484d(r10, r11)
            if (r10 == 0) goto L_0x01a7
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r4 = g91.C32343x.m95388F(r6, r4)
            goto L_0x01ad
        L_0x01a7:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r4 = g91.C32343x.m95388F(r7, r4)
        L_0x01ad:
            r9.<init>(r8, r4)
            r4 = 3
            r5[r4] = r9
            java.util.List r4 = ie1.C41341q.m119913p(r5)
            r2.addAll(r4)
            androidx.lifecycle.x r4 = r0.f42296x
            ge.bog.mobilebank.categorypackages.presentation.application.result.model.ApplicationResultData r5 = new ge.bog.mobilebank.categorypackages.presentation.application.result.model.ApplicationResultData
            ge.bog.mobilebank.categorypackages.presentation.application.shared.model.SoloApplicationFormData r6 = r0.f42285m
            java.lang.String r6 = r6.mo40932t()
            r5.<init>(r3, r6, r1, r2)
            m41.C37224b.m109965d(r4, r5)
        L_0x01ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.categorypackages.presentation.application.navigator.C14475b.m53522Gw(ho.g):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: Hw */
    public final void m53523Hw() {
        if (C15549c.m56159e(this.f42275C)) {
            C37224b.m109965d(this.f42291s, this.f42285m.mo40932t());
            m53535Tw(false);
            return;
        }
        mo40690kb();
    }

    /* access modifiers changed from: private */
    /* renamed from: Iw */
    public final void m53524Iw(String str) {
        C37224b.m109965d(this.f42289q, str);
    }

    /* renamed from: Jw */
    static /* synthetic */ void m53525Jw(C14475b bVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        bVar.m53524Iw(str);
    }

    /* renamed from: Kw */
    private final void m53526Kw() {
        C40749p L0 = this.f42274B.mo94989L0(new C17692j(new C14478c(this)));
        C41536l.m120488h(L0, "private fun subscribeReq…ndToLifecycle()\n        }");
        C41205b F0 = C32343x.m95413R0(L0).mo94981F0(new C17693k(new C14479d(this)));
        C41536l.m120488h(F0, "private fun subscribeReq…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Lw */
    public static final C40754t m53527Lw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Mw */
    public static final void m53528Mw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Nw */
    private final void m53529Nw() {
        C40749p L0 = this.f42298z.mo94989L0(new C17688f(new C14483e(this)));
        C41536l.m120488h(L0, "private fun subscribeToP…ndToLifecycle()\n        }");
        C41205b F0 = C32343x.m95413R0(L0).mo94981F0(new C17689g(new C14484f(this)));
        C41536l.m120488h(F0, "private fun subscribeToP…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Ow */
    public static final C40754t m53530Ow(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Pw */
    public static final void m53531Pw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Qw */
    private final void m53532Qw() {
        C40749p L0 = this.f42273A.mo94989L0(new C17690h(new C14488g(this)));
        C41536l.m120488h(L0, "private fun subscribeToS…ndToLifecycle()\n        }");
        C41205b F0 = C32343x.m95413R0(L0).mo94981F0(new C17691i(new C14491h(this)));
        C41536l.m120488h(F0, "private fun subscribeToS…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Rw */
    public static final C40754t m53533Rw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Sw */
    public static final void m53534Sw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Tw */
    public final void m53535Tw(boolean z) {
        C37224b.m109965d(this.f42290r, Boolean.valueOf(z));
    }

    /* access modifiers changed from: private */
    /* renamed from: Uw */
    public final void m53536Uw() {
        C40734b k = C40734b.m117920k(new C17694l(this));
        C41536l.m120488h(k, "create {\n               …UseCase(it)\n            }");
        C41205b G = C32343x.m95459j1(k).mo94888G(new C17695m(), new C17696n(C14495i.f42316d));
        C41536l.m120488h(G, "create {\n               …       .subscribe({}, {})");
        bindToLifecycle(G);
    }

    /* access modifiers changed from: private */
    /* renamed from: Vw */
    public static final void m53537Vw(C14475b bVar, C40736c cVar) {
        C41536l.m120489i(bVar, "this$0");
        C41536l.m120489i(cVar, "it");
        bVar.f42282j.mo89570a(cVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: Ww */
    public static final void m53538Ww() {
    }

    /* access modifiers changed from: private */
    /* renamed from: Xw */
    public static final void m53539Xw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: zw */
    private final PackageActivationParamsObject m53562zw(String str, String str2, String str3) {
        Long l;
        boolean z;
        String str4;
        String str5;
        Double c;
        UtmParamsEntity utmParams = this.f42279g.getUtmParams();
        C20557a b = this.f42280h.mo48775b("UTM_PARAMETER_EXPIRATION_IN_HOURS");
        String str6 = null;
        if (b == null || (c = b.mo49086c()) == null) {
            l = null;
        } else {
            l = Long.valueOf((long) c.doubleValue());
        }
        if (!C28323a.m86959a(utmParams, l)) {
            utmParams = null;
        }
        String Fw = m53521Fw(this.f42285m.mo40935v());
        String j = this.f42285m.mo40924j();
        String v = this.f42285m.mo40935v();
        String m = this.f42285m.mo40927m();
        if (m.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m = C15552f.MD.mo42739b();
            C41536l.m120486f(m);
        }
        String str7 = m;
        String r = this.f42285m.mo40930r();
        String k = this.f42285m.mo40925k();
        String p = this.f42285m.mo40928p();
        String x = this.f42285m.mo40938x();
        String w = this.f42285m.mo40936w();
        String Bw = m53520Bw();
        String i = this.f42285m.mo40923i();
        String f = this.f42285m.mo40919f();
        String t = this.f42285m.mo40932t();
        String q = this.f42285m.mo40929q();
        if (utmParams != null) {
            str4 = utmParams.getMedium();
        } else {
            str4 = null;
        }
        if (utmParams != null) {
            str5 = utmParams.getSource();
        } else {
            str5 = null;
        }
        if (utmParams != null) {
            str6 = utmParams.getCampaign();
        }
        return new PackageActivationParamsObject(Fw, j, v, str7, r, k, p, x, w, Bw, i, f, t, q, str4, str5, str6, (String) null, str, str2, str3, 131072, (DefaultConstructorMarker) null);
    }

    /* renamed from: Bo */
    public LiveData mo40678Bo() {
        return this.f42297y;
    }

    /* renamed from: Cw */
    public final C17686d mo40679Cw() {
        return this.f42287o;
    }

    /* renamed from: Dw */
    public HashMap mo40680Dw(OtpParams otpParams) {
        C41536l.m120489i(otpParams, "otpParams");
        return this.f42284l.mo66809a(otpParams);
    }

    /* renamed from: Ew */
    public final C17687e mo40681Ew() {
        return this.f42288p;
    }

    /* renamed from: H2 */
    public LiveData mo40682H2() {
        return this.f42293u;
    }

    /* renamed from: O */
    public void mo40683O(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "scaAuthCode");
        this.f42273A.onNext(mo40680Dw(m53562zw(str, str2, str3)));
    }

    /* renamed from: Sk */
    public LiveData mo40684Sk() {
        return this.f42296x;
    }

    /* renamed from: de */
    public void mo40685de() {
        C37224b.m109965d(this.f42295w, m53519Aw(this, (String) null, (String) null, (String) null, 7, (Object) null));
    }

    /* renamed from: e */
    public LiveData mo40686e() {
        return this.f42290r;
    }

    /* renamed from: es */
    public LiveData mo40687es() {
        return this.f42291s;
    }

    /* renamed from: i3 */
    public LiveData mo40688i3() {
        return this.f42295w;
    }

    /* renamed from: k */
    public LiveData mo40689k() {
        return this.f42294v;
    }

    /* renamed from: kb */
    public void mo40690kb() {
        List list = this.f42275C;
        if (list.isEmpty()) {
            m53525Jw(this, (String) null, 1, (Object) null);
        } else if (C15549c.m56155a(list)) {
            C37224b.m109965d(this.f42292t, this.f42285m);
        } else if (C15549c.m56158d(list)) {
            C37224b.m109965d(this.f42293u, this.f42285m);
        } else if (C15549c.m56156b(list)) {
            this.f42298z.onNext(C41238w.f97225a);
        } else {
            mo40685de();
        }
    }

    /* renamed from: x0 */
    public LiveData mo40691x0() {
        return this.f42289q;
    }

    /* renamed from: xm */
    public LiveData mo40692xm() {
        return this.f42292t;
    }
}
