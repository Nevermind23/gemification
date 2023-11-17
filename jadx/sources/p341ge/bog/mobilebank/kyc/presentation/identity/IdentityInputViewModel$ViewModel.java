package p341ge.bog.mobilebank.kyc.presentation.identity;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40765a;
import g91.C32343x;
import gn0.C15365c;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41232r;
import he1.C41238w;
import hn0.C15536a;
import hn0.C15537b;
import hn0.C15538c;
import hn0.C15546k;
import jn0.C16254a;
import jn0.C16255a0;
import jn0.C16280f;
import kn0.C16485a0;
import kn0.C16487b0;
import kn0.C16499l;
import kn0.C16500m;
import kn0.C16501n;
import kn0.C16502o;
import kn0.C16503p;
import kn0.C16504q;
import kn0.C16505r;
import kn0.C16506s;
import kn0.C16507t;
import kn0.C16508u;
import kn0.C16509v;
import kn0.C16510w;
import kn0.C16511x;
import kn0.C16512y;
import kn0.C16513z;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.kyc.presentation.identity.C14831b;
import ue1.C43075l;
import ue1.C43079p;
import ue1.C43080q;
import ue1.C43083t;
import zd1.C43413a;

/* renamed from: ge.bog.mobilebank.kyc.presentation.identity.IdentityInputViewModel$ViewModel */
public final class IdentityInputViewModel$ViewModel extends C21481a implements C16500m, C16499l, C16280f {

    /* renamed from: d */
    private final /* synthetic */ C16280f f42884d;

    /* renamed from: e */
    private final C16499l f42885e = this;

    /* renamed from: f */
    private final C16500m f42886f = this;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C1644x f42887g = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C40765a f42888h;

    /* renamed from: i */
    private final C40765a f42889i;

    /* renamed from: ge.bog.mobilebank.kyc.presentation.identity.IdentityInputViewModel$ViewModel$a */
    static final class C14815a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C40749p f42890d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14815a(C40749p pVar) {
            super(1);
            this.f42890d = pVar;
        }

        /* renamed from: a */
        public final C40754t invoke(Boolean bool) {
            C41536l.m120489i(bool, "it");
            if (bool.booleanValue()) {
                return this.f42890d;
            }
            return C40749p.m118027J();
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.identity.IdentityInputViewModel$ViewModel$b */
    static final class C14816b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ IdentityInputViewModel$ViewModel f42891d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14816b(IdentityInputViewModel$ViewModel identityInputViewModel$ViewModel) {
            super(1);
            this.f42891d = identityInputViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo41434a(C41232r rVar) {
            C15538c cVar = (C15538c) rVar.mo95688a();
            C15537b bVar = (C15537b) rVar.mo95689b();
            String str = (String) rVar.mo95690c();
            IdentityInputViewModel$ViewModel identityInputViewModel$ViewModel = this.f42891d;
            C41536l.m120488h(cVar, "country");
            C16254a aVar = C16254a.LEGAL;
            identityInputViewModel$ViewModel.mo41427g8(cVar, aVar);
            IdentityInputViewModel$ViewModel identityInputViewModel$ViewModel2 = this.f42891d;
            C41536l.m120488h(bVar, "city");
            identityInputViewModel$ViewModel2.mo41424Vc(bVar, aVar);
            IdentityInputViewModel$ViewModel identityInputViewModel$ViewModel3 = this.f42891d;
            C41536l.m120488h(str, "addressLine");
            identityInputViewModel$ViewModel3.mo41426d9(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41434a((C41232r) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.identity.IdentityInputViewModel$ViewModel$c */
    static final class C14817c extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C14817c f42892d = new C14817c();

        C14817c() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(C31128a aVar) {
            C41536l.m120489i(aVar, "it");
            return Boolean.valueOf(aVar instanceof C31128a.C31130b);
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.identity.IdentityInputViewModel$ViewModel$d */
    static final class C14818d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ IdentityInputViewModel$ViewModel f42893d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14818d(IdentityInputViewModel$ViewModel identityInputViewModel$ViewModel) {
            super(1);
            this.f42893d = identityInputViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo41436a(C31128a aVar) {
            this.f42893d.f42887g.mo4826r(C14831b.C14833b.f42911a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41436a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.identity.IdentityInputViewModel$ViewModel$e */
    static final class C14819e extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C14819e f42894d = new C14819e();

        C14819e() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(C31128a aVar) {
            C41536l.m120489i(aVar, "it");
            return Boolean.valueOf(aVar instanceof C31128a.C31129a);
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.identity.IdentityInputViewModel$ViewModel$f */
    static final class C14820f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ IdentityInputViewModel$ViewModel f42895d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14820f(IdentityInputViewModel$ViewModel identityInputViewModel$ViewModel) {
            super(1);
            this.f42895d = identityInputViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo41438a(C31128a aVar) {
            this.f42895d.f42887g.mo4826r(C14831b.C14832a.f42910a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41438a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.identity.IdentityInputViewModel$ViewModel$g */
    static final class C14821g extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C14821g f42896d = new C14821g();

        C14821g() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(C31128a aVar) {
            C41536l.m120489i(aVar, "it");
            return Boolean.valueOf(aVar instanceof C31128a.C31131c);
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.identity.IdentityInputViewModel$ViewModel$h */
    static final class C14822h extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C14822h f42897d = new C14822h();

        C14822h() {
            super(1);
        }

        /* renamed from: a */
        public final C15546k invoke(C31128a aVar) {
            C41536l.m120489i(aVar, "it");
            Object a = aVar.mo71340a();
            C41536l.m120486f(a);
            return (C15546k) a;
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.identity.IdentityInputViewModel$ViewModel$i */
    static final class C14823i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ IdentityInputViewModel$ViewModel f42898d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14823i(IdentityInputViewModel$ViewModel identityInputViewModel$ViewModel) {
            super(1);
            this.f42898d = identityInputViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo41441a(C15546k kVar) {
            C15538c cVar;
            C15537b bVar;
            String str;
            C15538c cVar2;
            C15537b bVar2;
            boolean z;
            IdentityInputViewModel$ViewModel identityInputViewModel$ViewModel = this.f42898d;
            C15536a a = kVar.mo42713a();
            if (a == null || (cVar = a.mo42653c()) == null) {
                cVar = C16255a0.f46066v.mo43269b();
            }
            C16254a aVar = C16254a.ACTUAL;
            identityInputViewModel$ViewModel.mo41427g8(cVar, aVar);
            IdentityInputViewModel$ViewModel identityInputViewModel$ViewModel2 = this.f42898d;
            C15536a a2 = kVar.mo42713a();
            if (a2 == null || (bVar = a2.mo42652b()) == null) {
                bVar = C16255a0.f46066v.mo43268a();
            }
            identityInputViewModel$ViewModel2.mo41424Vc(bVar, aVar);
            IdentityInputViewModel$ViewModel identityInputViewModel$ViewModel3 = this.f42898d;
            C15536a a3 = kVar.mo42713a();
            String str2 = null;
            if (a3 != null) {
                str = a3.mo42651a();
            } else {
                str = null;
            }
            String str3 = "";
            if (str == null) {
                str = str3;
            }
            identityInputViewModel$ViewModel3.mo41428gm(str);
            IdentityInputViewModel$ViewModel identityInputViewModel$ViewModel4 = this.f42898d;
            C15536a d = kVar.mo42716d();
            if (d == null || (cVar2 = d.mo42653c()) == null) {
                cVar2 = C16255a0.f46066v.mo43269b();
            }
            C16254a aVar2 = C16254a.LEGAL;
            identityInputViewModel$ViewModel4.mo41427g8(cVar2, aVar2);
            IdentityInputViewModel$ViewModel identityInputViewModel$ViewModel5 = this.f42898d;
            C15536a d2 = kVar.mo42716d();
            if (d2 == null || (bVar2 = d2.mo42652b()) == null) {
                bVar2 = C16255a0.f46066v.mo43268a();
            }
            identityInputViewModel$ViewModel5.mo41424Vc(bVar2, aVar2);
            IdentityInputViewModel$ViewModel identityInputViewModel$ViewModel6 = this.f42898d;
            C15536a d3 = kVar.mo42716d();
            if (d3 != null) {
                str2 = d3.mo42651a();
            }
            if (str2 != null) {
                str3 = str2;
            }
            identityInputViewModel$ViewModel6.mo41426d9(str3);
            IdentityInputViewModel$ViewModel identityInputViewModel$ViewModel7 = this.f42898d;
            C15538c b = kVar.mo42714b();
            if (b == null) {
                b = C16255a0.f46066v.mo43269b();
            }
            identityInputViewModel$ViewModel7.mo41427g8(b, C16254a.CITIZENSHIP);
            IdentityInputViewModel$ViewModel identityInputViewModel$ViewModel8 = this.f42898d;
            C15538c c = kVar.mo42715c();
            if (c == null) {
                c = C16255a0.f46066v.mo43269b();
            }
            identityInputViewModel$ViewModel8.mo41427g8(c, C16254a.CITIZENSHIP2);
            this.f42898d.f42888h.onNext(Boolean.valueOf(kVar.mo42717e()));
            IdentityInputViewModel$ViewModel identityInputViewModel$ViewModel9 = this.f42898d;
            if (kVar.mo42715c() != null) {
                z = true;
            } else {
                z = false;
            }
            identityInputViewModel$ViewModel9.mo41430w4(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41441a((C15546k) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.identity.IdentityInputViewModel$ViewModel$j */
    static final class C14824j extends C41537m implements C43083t {

        /* renamed from: d */
        public static final C14824j f42899d = new C14824j();

        C14824j() {
            super(6);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a3, code lost:
            if (r11 != false) goto L_0x00a5;
         */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00c0  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00c5  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00cd  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00d2  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00da  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00dd  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x00e7  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00ec  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x00f4  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x00fa  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x0102  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x0105  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x0113  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x011a  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x0126  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x012d  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p341ge.bog.mobilebank.kyc.presentation.identity.C14831b.C14834c mo41442Q(he1.C41232r r25, he1.C41232r r26, he1.C41224m r27, java.lang.Boolean r28, java.lang.Boolean r29, java.lang.Boolean r30) {
            /*
                r24 = this;
                java.lang.String r0 = "<name for destructuring parameter 0>"
                r1 = r25
                kotlin.jvm.internal.C41536l.m120489i(r1, r0)
                java.lang.String r0 = "<name for destructuring parameter 1>"
                r2 = r26
                kotlin.jvm.internal.C41536l.m120489i(r2, r0)
                java.lang.String r0 = "<name for destructuring parameter 2>"
                r3 = r27
                kotlin.jvm.internal.C41536l.m120489i(r3, r0)
                java.lang.String r0 = "resident"
                r4 = r28
                kotlin.jvm.internal.C41536l.m120489i(r4, r0)
                java.lang.String r0 = "copyAddress"
                r5 = r29
                kotlin.jvm.internal.C41536l.m120489i(r5, r0)
                java.lang.String r0 = "dualNationality"
                r6 = r30
                kotlin.jvm.internal.C41536l.m120489i(r6, r0)
                java.lang.Object r0 = r25.mo95688a()
                hn0.c r0 = (hn0.C15538c) r0
                java.lang.Object r7 = r25.mo95689b()
                hn0.b r7 = (hn0.C15537b) r7
                java.lang.Object r1 = r25.mo95690c()
                r12 = r1
                java.lang.String r12 = (java.lang.String) r12
                java.lang.Object r1 = r26.mo95688a()
                hn0.c r1 = (hn0.C15538c) r1
                java.lang.Object r8 = r26.mo95689b()
                hn0.b r8 = (hn0.C15537b) r8
                java.lang.Object r2 = r26.mo95690c()
                java.lang.String r2 = (java.lang.String) r2
                java.lang.Object r9 = r27.mo95675a()
                hn0.c r9 = (hn0.C15538c) r9
                java.lang.Object r3 = r27.mo95676b()
                hn0.c r3 = (hn0.C15538c) r3
                jn0.a0$d r10 = jn0.C16255a0.f46066v
                hn0.c r11 = r10.mo43269b()
                java.lang.String r13 = "addressLegal"
                java.lang.String r14 = "addressActual"
                r16 = 1
                if (r1 == r11) goto L_0x00b4
                hn0.b r11 = r10.mo43268a()
                if (r8 == r11) goto L_0x00b4
                kotlin.jvm.internal.C41536l.m120488h(r2, r14)
                int r11 = r2.length()
                if (r11 <= 0) goto L_0x007b
                r11 = r16
                goto L_0x007c
            L_0x007b:
                r11 = 0
            L_0x007c:
                if (r11 == 0) goto L_0x00b4
                hn0.c r11 = r10.mo43269b()
                if (r9 == r11) goto L_0x00b4
                boolean r11 = r28.booleanValue()
                if (r11 != 0) goto L_0x00a5
                hn0.c r11 = r10.mo43269b()
                if (r0 == r11) goto L_0x00b4
                hn0.b r11 = r10.mo43268a()
                if (r7 == r11) goto L_0x00b4
                kotlin.jvm.internal.C41536l.m120488h(r12, r13)
                int r11 = r12.length()
                if (r11 <= 0) goto L_0x00a2
                r11 = r16
                goto L_0x00a3
            L_0x00a2:
                r11 = 0
            L_0x00a3:
                if (r11 == 0) goto L_0x00b4
            L_0x00a5:
                boolean r11 = r30.booleanValue()
                if (r11 == 0) goto L_0x00b1
                hn0.c r11 = r10.mo43269b()
                if (r3 == r11) goto L_0x00b4
            L_0x00b1:
                r22 = r16
                goto L_0x00b6
            L_0x00b4:
                r22 = 0
            L_0x00b6:
                ge.bog.mobilebank.kyc.presentation.identity.b$c r23 = new ge.bog.mobilebank.kyc.presentation.identity.b$c
                hn0.c r11 = r10.mo43269b()
                java.lang.String r17 = ""
                if (r0 == r11) goto L_0x00c5
                java.lang.String r11 = r0.mo42664b()
                goto L_0x00c7
            L_0x00c5:
                r11 = r17
            L_0x00c7:
                hn0.b r15 = r10.mo43268a()
                if (r7 == r15) goto L_0x00d2
                java.lang.String r7 = r7.mo42658b()
                goto L_0x00d4
            L_0x00d2:
                r7 = r17
            L_0x00d4:
                hn0.c r15 = r10.mo43269b()
                if (r0 == r15) goto L_0x00dd
                r0 = r16
                goto L_0x00de
            L_0x00dd:
                r0 = 0
            L_0x00de:
                kotlin.jvm.internal.C41536l.m120488h(r12, r13)
                hn0.c r13 = r10.mo43269b()
                if (r1 == r13) goto L_0x00ec
                java.lang.String r13 = r1.mo42664b()
                goto L_0x00ee
            L_0x00ec:
                r13 = r17
            L_0x00ee:
                hn0.b r15 = r10.mo43268a()
                if (r8 == r15) goto L_0x00fa
                java.lang.String r8 = r8.mo42658b()
                r15 = r8
                goto L_0x00fc
            L_0x00fa:
                r15 = r17
            L_0x00fc:
                hn0.c r8 = r10.mo43269b()
                if (r1 == r8) goto L_0x0105
                r1 = r16
                goto L_0x0106
            L_0x0105:
                r1 = 0
            L_0x0106:
                kotlin.jvm.internal.C41536l.m120488h(r2, r14)
                boolean r5 = r29.booleanValue()
                hn0.c r8 = r10.mo43269b()
                if (r9 == r8) goto L_0x011a
                java.lang.String r8 = r9.mo42664b()
                r18 = r8
                goto L_0x011c
            L_0x011a:
                r18 = r17
            L_0x011c:
                boolean r19 = r30.booleanValue()
                hn0.c r6 = r10.mo43269b()
                if (r3 == r6) goto L_0x012d
                java.lang.String r3 = r3.mo42664b()
                r20 = r3
                goto L_0x012f
            L_0x012d:
                r20 = r17
            L_0x012f:
                boolean r3 = r28.booleanValue()
                r21 = r3 ^ 1
                r8 = r23
                r9 = r11
                r10 = r7
                r11 = r0
                r14 = r15
                r15 = r1
                r16 = r2
                r17 = r5
                r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
                return r23
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.kyc.presentation.identity.IdentityInputViewModel$ViewModel.C14824j.mo41442Q(he1.r, he1.r, he1.m, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean):ge.bog.mobilebank.kyc.presentation.identity.b$c");
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.identity.IdentityInputViewModel$ViewModel$k */
    static final class C14825k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ IdentityInputViewModel$ViewModel f42900d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14825k(IdentityInputViewModel$ViewModel identityInputViewModel$ViewModel) {
            super(1);
            this.f42900d = identityInputViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo41444a(C14831b.C14834c cVar) {
            this.f42900d.f42887g.mo4823o(cVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41444a((C14831b.C14834c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.identity.IdentityInputViewModel$ViewModel$l */
    /* synthetic */ class C14826l extends C41535k implements C43080q {

        /* renamed from: d */
        public static final C14826l f42901d = new C14826l();

        C14826l() {
            super(3, C41232r.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", 0);
        }

        /* renamed from: b */
        public final C41232r invoke(C15538c cVar, C15537b bVar, String str) {
            return new C41232r(cVar, bVar, str);
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.identity.IdentityInputViewModel$ViewModel$m */
    /* synthetic */ class C14827m extends C41535k implements C43079p {

        /* renamed from: d */
        public static final C14827m f42902d = new C14827m();

        C14827m() {
            super(2, C41224m.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 0);
        }

        /* renamed from: b */
        public final C41224m invoke(C15538c cVar, C15538c cVar2) {
            return new C41224m(cVar, cVar2);
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.identity.IdentityInputViewModel$ViewModel$n */
    /* synthetic */ class C14828n extends C41535k implements C43080q {

        /* renamed from: d */
        public static final C14828n f42903d = new C14828n();

        C14828n() {
            super(3, C41232r.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", 0);
        }

        /* renamed from: b */
        public final C41232r invoke(C15538c cVar, C15537b bVar, String str) {
            return new C41232r(cVar, bVar, str);
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.identity.IdentityInputViewModel$ViewModel$o */
    static final class C14829o extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C15365c f42904d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14829o(C15365c cVar) {
            super(1);
            this.f42904d = cVar;
        }

        /* renamed from: a */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "it");
            return C31270e.m92880i(this.f42904d.mo42455a(), num.intValue());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IdentityInputViewModel$ViewModel(C15365c cVar, C16280f fVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(cVar, "getIdentityData");
        C41536l.m120489i(fVar, "delegate");
        this.f42884d = fVar;
        C40765a i1 = C40765a.m118199i1(Boolean.TRUE);
        C41536l.m120488h(i1, "createDefault(true)");
        this.f42888h = i1;
        C40765a i12 = C40765a.m118199i1(Boolean.FALSE);
        C41536l.m120488h(i12, "createDefault(false)");
        this.f42889i = i12;
        C43413a w0 = onRefresh().mo94977D0(1).mo94989L0(new C16501n(new C14829o(cVar))).mo95040w0();
        C40749p M = w0.mo94990M(new C16512y(C14817c.f42892d));
        C41536l.m120488h(M, "obs.filter { it is RequestedResult.Loading }");
        C41205b F0 = C32343x.m95413R0(M).mo94981F0(new C16513z(new C14818d(this)));
        C41536l.m120488h(F0, "obs.filter { it is Reque…Loading\n                }");
        bindToLifecycle(F0);
        C40749p M2 = w0.mo94990M(new C16485a0(C14819e.f42894d));
        C41536l.m120488h(M2, "obs.filter { it is RequestedResult.Error }");
        C41205b F02 = C32343x.m95413R0(M2).mo94981F0(new C16487b0(new C14820f(this)));
        C41536l.m120488h(F02, "obs.filter { it is Reque…e.Error\n                }");
        bindToLifecycle(F02);
        C40749p k0 = w0.mo94990M(new C16502o(C14821g.f42896d)).mo95026k0(new C16503p(C14822h.f42897d));
        C41536l.m120488h(k0, "obs.filter { it is Reque…ccess }.map { it.data!! }");
        C41205b F03 = C32343x.m95413R0(k0).mo94981F0(new C16504q(new C14823i(this)));
        C41536l.m120488h(F03, "obs.filter { it is Reque…= null)\n                }");
        bindToLifecycle(F03);
        C40749p l = C40749p.m118046l(mo41417Fb(), mo41422Nf(), mo41416Dq(), new C16505r(C14828n.f42903d));
        C41536l.m120488h(l, "combineLatest(\n         …   ::Triple\n            )");
        C40749p l2 = C40749p.m118046l(mo41421Lj(), mo41425Xo(), mo41431wd(), new C16506s(C14826l.f42901d));
        C41536l.m120488h(l2, "combineLatest(\n         …   ::Triple\n            )");
        C40749p m = C40749p.m118048m(mo41432yn(), mo41429qs(), new C16507t(C14827m.f42902d));
        C41536l.m120488h(m, "combineLatest(\n         …     ::Pair\n            )");
        C40749p j = C40749p.m118044j(l, l2, m, i1, i12, mo41423S4(), new C16508u(C14824j.f42899d));
        C41536l.m120488h(j, "combineLatest(\n         …          )\n            }");
        C41205b F04 = C32343x.m95413R0(j).mo94981F0(new C16509v(new C14825k(this)));
        C41536l.m120488h(F04, "combineLatest(\n         …lue(it)\n                }");
        bindToLifecycle(F04);
        w0.mo102094i1();
        C40749p L0 = i12.mo94989L0(new C16510w(new C14815a(l2)));
        C41536l.m120488h(L0, "copyActualAddress.switch…          }\n            }");
        C41205b F05 = C32343x.m95413R0(L0).mo94981F0(new C16511x(new C14816b(this)));
        C41536l.m120488h(F05, "copyActualAddress.switch…ssLine)\n                }");
        bindToLifecycle(F05);
    }

    /* access modifiers changed from: private */
    /* renamed from: Aw */
    public static final void m54477Aw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Bw */
    public static final boolean m54478Bw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return ((Boolean) lVar.invoke(obj)).booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: Cw */
    public static final C15546k m54479Cw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C15546k) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Dw */
    public static final void m54480Dw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Ew */
    public static final C41232r m54481Ew(C43080q qVar, Object obj, Object obj2, Object obj3) {
        C41536l.m120489i(qVar, "$tmp0");
        return (C41232r) qVar.invoke(obj, obj2, obj3);
    }

    /* access modifiers changed from: private */
    /* renamed from: Fw */
    public static final C41232r m54482Fw(C43080q qVar, Object obj, Object obj2, Object obj3) {
        C41536l.m120489i(qVar, "$tmp0");
        return (C41232r) qVar.invoke(obj, obj2, obj3);
    }

    /* access modifiers changed from: private */
    public static final boolean _init_$lambda$1(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return ((Boolean) lVar.invoke(obj)).booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: sw */
    public static final C40754t m54500sw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: tw */
    public static final C41224m m54501tw(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (C41224m) pVar.invoke(obj, obj2);
    }

    /* access modifiers changed from: private */
    /* renamed from: uw */
    public static final C14831b.C14834c m54502uw(C43083t tVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        C41536l.m120489i(tVar, "$tmp0");
        return (C14831b.C14834c) tVar.mo41442Q(obj, obj2, obj3, obj4, obj5, obj6);
    }

    /* access modifiers changed from: private */
    /* renamed from: vw */
    public static final void m54503vw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: ww */
    public static final C40754t m54504ww(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: xw */
    public static final void m54505xw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: yw */
    public static final void m54506yw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: zw */
    public static final boolean m54507zw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return ((Boolean) lVar.invoke(obj)).booleanValue();
    }

    /* renamed from: Cq */
    public void mo41415Cq(boolean z) {
        this.f42889i.onNext(Boolean.valueOf(z));
    }

    /* renamed from: Dq */
    public C40749p mo41416Dq() {
        return this.f42884d.mo41416Dq();
    }

    /* renamed from: Fb */
    public C40749p mo41417Fb() {
        return this.f42884d.mo41417Fb();
    }

    /* renamed from: Hk */
    public LiveData mo41418Hk() {
        return this.f42887g;
    }

    /* renamed from: Iw */
    public final C16499l mo41419Iw() {
        return this.f42885e;
    }

    /* renamed from: Jw */
    public final C16500m mo41420Jw() {
        return this.f42886f;
    }

    /* renamed from: Lj */
    public C40749p mo41421Lj() {
        return this.f42884d.mo41421Lj();
    }

    /* renamed from: Nf */
    public C40749p mo41422Nf() {
        return this.f42884d.mo41422Nf();
    }

    /* renamed from: S4 */
    public C40749p mo41423S4() {
        return this.f42884d.mo41423S4();
    }

    /* renamed from: Vc */
    public void mo41424Vc(C15537b bVar, C16254a aVar) {
        C41536l.m120489i(bVar, "city");
        C41536l.m120489i(aVar, "addressType");
        this.f42884d.mo41424Vc(bVar, aVar);
    }

    /* renamed from: Xo */
    public C40749p mo41425Xo() {
        return this.f42884d.mo41425Xo();
    }

    /* renamed from: d9 */
    public void mo41426d9(String str) {
        C41536l.m120489i(str, "addressLine");
        this.f42884d.mo41426d9(str);
    }

    /* renamed from: g8 */
    public void mo41427g8(C15538c cVar, C16254a aVar) {
        C41536l.m120489i(cVar, "country");
        C41536l.m120489i(aVar, "addressType");
        this.f42884d.mo41427g8(cVar, aVar);
    }

    /* renamed from: gm */
    public void mo41428gm(String str) {
        C41536l.m120489i(str, "addressLine");
        this.f42884d.mo41428gm(str);
    }

    /* renamed from: qs */
    public C40749p mo41429qs() {
        return this.f42884d.mo41429qs();
    }

    /* renamed from: w4 */
    public void mo41430w4(boolean z) {
        this.f42884d.mo41430w4(z);
    }

    /* renamed from: wd */
    public C40749p mo41431wd() {
        return this.f42884d.mo41431wd();
    }

    /* renamed from: yn */
    public C40749p mo41432yn() {
        return this.f42884d.mo41432yn();
    }
}
