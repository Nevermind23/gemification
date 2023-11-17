package p341ge.bog.mobilebank.categorypackages.presentation.packagelist;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import ed1.C40735b0;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import ee1.C40765a;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41232r;
import he1.C41238w;
import j51.C36738j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.model.Client;
import p441go.C15376d;
import p441go.C15382g;
import p441go.C15386k;
import p455ho.C15550d;
import p469io.C15709b;
import p554op.C17297b;
import p554op.C17329t;
import p554op.C17330u;
import p554op.C17331v;
import p554op.C17332w;
import p554op.C17333x;
import p554op.C17334y;
import p554op.C17335z;
import p568pp.C17472b;
import p568pp.C17475c;
import p568pp.C17480d;
import p748eu.C20292b;
import p758fu.C20557a;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagelist.c */
public final class C14787c extends C21481a {

    /* renamed from: x */
    public static final C14788a f42828x = new C14788a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Client f42829d;

    /* renamed from: e */
    private final C20292b f42830e;

    /* renamed from: f */
    private final C15376d f42831f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C15382g f42832g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C15386k f42833h;

    /* renamed from: i */
    private final C36738j f42834i;

    /* renamed from: j */
    private final C17329t f42835j;

    /* renamed from: k */
    private final boolean f42836k;

    /* renamed from: l */
    private final C14787c f42837l = this;

    /* renamed from: m */
    private final C14787c f42838m = this;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C1644x f42839n = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C1644x f42840o = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C1644x f42841p = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final C1644x f42842q = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final C1644x f42843r = new C1644x();

    /* renamed from: s */
    private final C1644x f42844s = new C1644x();

    /* renamed from: t */
    private final C1644x f42845t = new C1644x();

    /* renamed from: u */
    private final C40765a f42846u;

    /* renamed from: v */
    private final C40765a f42847v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public C15709b f42848w;

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagelist.c$a */
    public static final class C14788a {
        private C14788a() {
        }

        public /* synthetic */ C14788a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagelist.c$b */
    public interface C14789b {
        /* renamed from: a */
        C14787c mo32784a(boolean z);
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagelist.c$c */
    /* synthetic */ class C14790c extends C41535k implements C43075l {
        C14790c(Object obj) {
            super(1, obj, C14787c.class, "formatBenefTypes", "formatBenefTypes(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C14787c) this.receiver).m54410xw(list);
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagelist.c$d */
    static final class C14791d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C14787c f42849d;

        /* renamed from: e */
        final /* synthetic */ C15709b f42850e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14791d(C14787c cVar, C15709b bVar) {
            super(0);
            this.f42849d = cVar;
            this.f42850e = bVar;
        }

        public final void invoke() {
            C14787c cVar = this.f42849d;
            String p = this.f42850e.mo43093p();
            if (p == null) {
                p = "";
            }
            cVar.mo41222Jw(p);
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagelist.c$e */
    static final class C14792e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C14787c f42851d;

        /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagelist.c$e$a */
        static final class C14793a extends C41537m implements C43079p {

            /* renamed from: d */
            final /* synthetic */ C14787c f42852d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14793a(C14787c cVar) {
                super(2);
                this.f42852d = cVar;
            }

            /* renamed from: a */
            public final C41224m invoke(List list, List list2) {
                Object obj;
                String str;
                boolean z;
                C41536l.m120489i(list, "becomeSolo");
                C41536l.m120489i(list2, "packages");
                C14787c cVar = this.f42852d;
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((C15709b) obj).mo43078c() != null) {
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
                cVar.f42848w = (C15709b) obj;
                C14787c cVar2 = this.f42852d;
                ArrayList arrayList = new ArrayList();
                for (Object next : list2) {
                    String o = ((C15709b) next).mo43092o();
                    if (cVar2.mo41221Iw()) {
                        str = C15386k.C15387a.C15388a.SOLO.mo42488b();
                    } else {
                        str = C15386k.C15387a.C15388a.RB.mo42488b();
                    }
                    if (C41536l.m120484d(o, str)) {
                        arrayList.add(next);
                    }
                }
                return new C41224m(list, arrayList);
            }
        }

        /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagelist.c$e$b */
        static final class C14794b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C14787c f42853d;

            /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagelist.c$e$b$a */
            static final class C14795a extends C41537m implements C43075l {

                /* renamed from: d */
                final /* synthetic */ List f42854d;

                /* renamed from: e */
                final /* synthetic */ List f42855e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C14795a(List list, List list2) {
                    super(1);
                    this.f42854d = list;
                    this.f42855e = list2;
                }

                /* renamed from: a */
                public final C41232r invoke(Object[] objArr) {
                    List list;
                    C41536l.m120489i(objArr, "packageBenefits");
                    List list2 = this.f42854d;
                    List list3 = this.f42855e;
                    ArrayList arrayList = new ArrayList(objArr.length);
                    for (List list4 : objArr) {
                        if (list4 instanceof List) {
                            list = list4;
                        } else {
                            list = null;
                        }
                        arrayList.add(list);
                    }
                    return new C41232r(list2, list3, arrayList);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14794b(C14787c cVar) {
                super(1);
                this.f42853d = cVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: c */
            public static final C41232r m54436c(C43075l lVar, Object obj) {
                C41536l.m120489i(lVar, "$tmp0");
                return (C41232r) lVar.invoke(obj);
            }

            /* renamed from: b */
            public final C40735b0 invoke(C41224m mVar) {
                C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
                List list = (List) mVar.mo95675a();
                List<C15709b> list2 = (List) mVar.mo95676b();
                C14787c cVar = this.f42853d;
                ArrayList arrayList = new ArrayList(C41343r.m119925u(list2, 10));
                for (C15709b p : list2) {
                    C15382g nw = cVar.f42832g;
                    String p2 = p.mo43093p();
                    C41536l.m120486f(p2);
                    arrayList.add(nw.mo42483a(p2, "PACKAGE_COMPARE"));
                }
                return C40762x.m118155U(arrayList, new C14805f(new C14795a(list, list2)));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14792e(C14787c cVar) {
            super(1);
            this.f42851d = cVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final C41224m m54431d(C43079p pVar, Object obj, Object obj2) {
            C41536l.m120489i(pVar, "$tmp0");
            return (C41224m) pVar.invoke(obj, obj2);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final C40735b0 m54432e(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C40735b0) lVar.invoke(obj);
        }

        /* renamed from: c */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "rc");
            C40762x r = C40762x.m118154T(this.f42851d.m54411yw(), C15386k.m55854b(this.f42851d.f42833h, (String) null, true, 1, (Object) null), new C14803d(new C14793a(this.f42851d))).mo95087r(new C14804e(new C14794b(this.f42851d)));
            C41536l.m120488h(r, "private fun subscribeSer…ndToLifecycle()\n        }");
            return C31270e.m92880i(r, num.intValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagelist.c$f */
    static final class C14796f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C14787c f42856d;

        /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagelist.c$f$a */
        static final class C14797a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C14787c f42857d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14797a(C14787c cVar) {
                super(1);
                this.f42857d = cVar;
            }

            /* renamed from: a */
            public final void mo41234a(C41232r rVar) {
                List list = (List) rVar.mo95688a();
                C14787c cVar = this.f42857d;
                C41536l.m120488h(list, "becomeSolo");
                cVar.m54380Kw(list, (List) rVar.mo95689b(), (List) rVar.mo95690c());
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo41234a((C41232r) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagelist.c$f$b */
        static final class C14798b extends C41537m implements C43079p {

            /* renamed from: d */
            final /* synthetic */ C14787c f42858d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14798b(C14787c cVar) {
                super(2);
                this.f42858d = cVar;
            }

            /* renamed from: a */
            public final void mo41235a(Throwable th, C41232r rVar) {
                C41536l.m120489i(th, "error");
                this.f42858d.f42841p.mo4823o(th);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                mo41235a((Throwable) obj, (C41232r) obj2);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagelist.c$f$c */
        static final class C14799c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C14787c f42859d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14799c(C14787c cVar) {
                super(1);
                this.f42859d = cVar;
            }

            /* renamed from: a */
            public final void mo41236a(C41232r rVar) {
                this.f42859d.f42840o.mo4823o(Boolean.TRUE);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo41236a((C41232r) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14796f(C14787c cVar) {
            super(1);
            this.f42856d = cVar;
        }

        /* renamed from: a */
        public final void mo41233a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C14797a(this.f42856d), 1, (Object) null);
            C31132b.m92644f(aVar, (int[]) null, new C14798b(this.f42856d), 1, (Object) null);
            C31132b.m92646h(aVar, (int[]) null, new C14799c(this.f42856d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41233a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagelist.c$g */
    static final class C14800g extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C14800g f42860d = new C14800g();

        C14800g() {
            super(1);
        }

        /* renamed from: a */
        public final C40754t invoke(String str) {
            C41536l.m120489i(str, "it");
            return C40762x.m118162z(str).mo95075O();
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagelist.c$h */
    static final class C14801h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C14787c f42861d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14801h(C14787c cVar) {
            super(1);
            this.f42861d = cVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:58:0x00ec  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x00ee  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x00fb  */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x011c  */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x0124  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo41238a(java.lang.String r31) {
            /*
                r30 = this;
                r0 = r30
                ge.bog.mobilebank.categorypackages.presentation.packagelist.c r1 = r0.f42861d
                androidx.lifecycle.x r1 = r1.f42839n
                java.lang.Object r1 = r1.mo4814f()
                pp.d r1 = (p568pp.C17480d) r1
                if (r1 == 0) goto L_0x0155
                java.util.List r1 = r1.mo45004c()
                if (r1 == 0) goto L_0x0155
                java.util.Iterator r1 = r1.iterator()
            L_0x001a:
                boolean r2 = r1.hasNext()
                r3 = 0
                if (r2 == 0) goto L_0x0035
                java.lang.Object r2 = r1.next()
                r4 = r2
                pp.b$b r4 = (p568pp.C17472b.C17474b) r4
                java.lang.String r4 = r4.mo44996j()
                r5 = r31
                boolean r4 = kotlin.jvm.internal.C41536l.m120484d(r5, r4)
                if (r4 == 0) goto L_0x001a
                goto L_0x0036
            L_0x0035:
                r2 = r3
            L_0x0036:
                pp.b$b r2 = (p568pp.C17472b.C17474b) r2
                if (r2 == 0) goto L_0x0155
                ge.bog.mobilebank.categorypackages.presentation.packagelist.c r1 = r0.f42861d
                io.b r4 = r1.f42848w
                java.lang.String r5 = ""
                if (r4 == 0) goto L_0x004d
                java.lang.String r4 = r4.mo43093p()
                if (r4 != 0) goto L_0x004b
                goto L_0x004d
            L_0x004b:
                r7 = r4
                goto L_0x004e
            L_0x004d:
                r7 = r5
            L_0x004e:
                java.lang.String r4 = r2.mo44996j()
                if (r4 == 0) goto L_0x0155
                java.lang.String r4 = r2.mo44997k()
                if (r4 == 0) goto L_0x0155
                java.lang.Integer r4 = r2.mo44998l()
                if (r4 != 0) goto L_0x0062
                goto L_0x0155
            L_0x0062:
                java.lang.String r4 = r2.mo44996j()
                boolean r4 = kotlin.jvm.internal.C41536l.m120484d(r7, r4)
                if (r4 == 0) goto L_0x0089
                ge.bog.mobilebank.cleanarch.moremenu.presentation.PackageType$Companion r2 = p341ge.bog.mobilebank.cleanarch.moremenu.presentation.PackageType.Companion
                ge.bog.mobilebank.model.Client r3 = r1.f42829d
                ge.bog.mobilebank.model.usrinfo.ClientInfoWrapper r3 = r3.getUserInfo()
                java.lang.String r3 = r3.getPackageBadge()
                ge.bog.mobilebank.cleanarch.moremenu.presentation.PackageType r2 = r2.getPackageTypeByBadge(r3)
                if (r2 == 0) goto L_0x0155
                androidx.lifecycle.x r1 = r1.f42843r
                m41.C37224b.m109965d(r1, r2)
                goto L_0x0155
            L_0x0089:
                io.b r4 = r1.f42848w
                if (r4 == 0) goto L_0x0098
                java.lang.String r4 = r4.mo43083g()
                if (r4 != 0) goto L_0x0096
                goto L_0x0098
            L_0x0096:
                r9 = r4
                goto L_0x0099
            L_0x0098:
                r9 = r5
            L_0x0099:
                java.lang.String r8 = r2.mo44996j()
                java.lang.String r4 = r2.mo44988d()
                if (r4 != 0) goto L_0x00a5
                r10 = r5
                goto L_0x00a6
            L_0x00a5:
                r10 = r4
            L_0x00a6:
                java.lang.String r14 = r2.mo44997k()
                io.b r4 = r1.f42848w
                if (r4 == 0) goto L_0x00ba
                int r4 = r4.mo43096s()
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r11 = r4
                goto L_0x00bb
            L_0x00ba:
                r11 = r3
            L_0x00bb:
                java.lang.Integer r4 = r2.mo44998l()
                io.b r6 = r1.f42848w
                if (r6 == 0) goto L_0x00d4
                io.a r6 = r6.mo43078c()
                if (r6 == 0) goto L_0x00d4
                java.lang.Long r6 = r6.mo43060f()
                if (r6 != 0) goto L_0x00d2
                goto L_0x00d4
            L_0x00d2:
                r13 = r6
                goto L_0x00e6
            L_0x00d4:
                io.b r6 = r1.f42848w
                if (r6 == 0) goto L_0x00e5
                io.a r6 = r6.mo43078c()
                if (r6 == 0) goto L_0x00e5
                java.lang.Long r6 = r6.mo43069n()
                goto L_0x00d2
            L_0x00e5:
                r13 = r3
            L_0x00e6:
                java.lang.String r2 = r2.mo44995i()
                if (r2 != 0) goto L_0x00ee
                r15 = r5
                goto L_0x00ef
            L_0x00ee:
                r15 = r2
            L_0x00ef:
                io.b r2 = r1.f42848w
                if (r2 == 0) goto L_0x011c
                java.lang.Double r2 = r2.mo43089l()
                if (r2 == 0) goto L_0x011c
                double r16 = r2.doubleValue()
                io.b r2 = r1.f42848w
                if (r2 == 0) goto L_0x010b
                java.lang.String r2 = r2.mo43090m()
                if (r2 != 0) goto L_0x010d
            L_0x010b:
                java.lang.String r2 = "GEL"
            L_0x010d:
                r18 = r2
                r19 = 0
                r20 = 2
                r21 = 0
                java.lang.String r2 = g91.C32343x.m95410Q(r16, r18, r19, r20, r21)
                r16 = r2
                goto L_0x011e
            L_0x011c:
                r16 = r3
            L_0x011e:
                io.b r2 = r1.f42848w
                if (r2 == 0) goto L_0x0128
                java.lang.String r3 = r2.mo43087j()
            L_0x0128:
                r17 = r3
                ge.bog.mobilebank.categorypackages.presentation.application.shared.model.SoloApplicationFormData r2 = new ge.bog.mobilebank.categorypackages.presentation.application.shared.model.SoloApplicationFormData
                r6 = r2
                int r12 = r4.intValue()
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 0
                r23 = 0
                r24 = 0
                r25 = 0
                r26 = 0
                r27 = 0
                r28 = 2095104(0x1ff800, float:2.935866E-39)
                r29 = 0
                r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
                androidx.lifecycle.x r1 = r1.f42842q
                m41.C37224b.m109965d(r1, r2)
            L_0x0155:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.categorypackages.presentation.packagelist.C14787c.C14801h.mo41238a(java.lang.String):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41238a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagelist.c$i */
    static final class C14802i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C14787c f42862d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14802i(C14787c cVar) {
            super(1);
            this.f42862d = cVar;
        }

        /* renamed from: a */
        public final void mo41239a(C41238w wVar) {
            C40749p unused = this.f42862d.onRefresh();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41239a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14787c(Client client, C20292b bVar, C15376d dVar, C15382g gVar, C15386k kVar, C36738j jVar, C17329t tVar, boolean z) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(client, "client");
        C41536l.m120489i(bVar, "getAppSettingByName");
        C41536l.m120489i(dVar, "getBenefitTypes");
        C41536l.m120489i(gVar, "getPackageBenefits");
        C41536l.m120489i(kVar, "getPackageDetailsUseCase");
        C41536l.m120489i(jVar, "getUserInfoObservableUseCase");
        C41536l.m120489i(tVar, "packageListUiStateHandler");
        this.f42829d = client;
        this.f42830e = bVar;
        this.f42831f = dVar;
        this.f42832g = gVar;
        this.f42833h = kVar;
        this.f42834i = jVar;
        this.f42835j = tVar;
        this.f42836k = z;
        C40765a h1 = C40765a.m118198h1();
        C41536l.m120488h(h1, "create<String>()");
        this.f42846u = h1;
        C40765a h12 = C40765a.m118198h1();
        C41536l.m120488h(h12, "create<String>()");
        this.f42847v = h12;
        m54381Mw();
        m54384Pw();
    }

    /* access modifiers changed from: private */
    /* renamed from: Kw */
    public final void m54380Kw(List list, List list2, List list3) {
        C1644x xVar = this.f42839n;
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            C15709b bVar = (C15709b) it.next();
            arrayList.add(C17475c.m60979i(bVar, mo41221Iw(), (C43064a) null, new C14791d(this, bVar), (Integer) null, 10, (Object) null));
        }
        xVar.mo4823o(new C17480d(arrayList, new C17472b.C17473a(list), this.f42835j.mo44741a(list, list3)));
        this.f42840o.mo4823o(Boolean.FALSE);
    }

    /* renamed from: Mw */
    private final void m54381Mw() {
        C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C17330u(new C14792e(this)));
        C41536l.m120488h(L0, "private fun subscribeSer…ndToLifecycle()\n        }");
        C41205b F0 = C32343x.m95413R0(L0).mo94981F0(new C17331v(new C14796f(this)));
        C41536l.m120488h(F0, "private fun subscribeSer…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Nw */
    public static final C40754t m54382Nw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Ow */
    public static final void m54383Ow(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Pw */
    private final void m54384Pw() {
        m54385Qw();
        m54388Tw();
    }

    /* renamed from: Qw */
    private final void m54385Qw() {
        C41205b F0 = this.f42846u.mo94989L0(new C17333x(C14800g.f42860d)).mo94981F0(new C17334y(new C14801h(this)));
        C41536l.m120488h(F0, "private fun subscribeToP…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Rw */
    public static final C40754t m54386Rw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Sw */
    public static final void m54387Sw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Tw */
    private final void m54388Tw() {
        C41205b F0 = C32343x.m95462k1(this.f42834i.mo89564a()).mo94981F0(new C17332w(new C14802i(this)));
        C41536l.m120488h(F0, "private fun subscribeToU…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Uw */
    public static final void m54389Uw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: xw */
    public final List m54410xw(List list) {
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C17475c.m60977g((C15550d) it.next()));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: yw */
    public final C40762x m54411yw() {
        boolean z;
        if (!mo41221Iw()) {
            C20557a b = this.f42830e.mo48775b("SHOW_SOLO_CARD_IN_PACKAGES");
            if (b != null) {
                z = C41536l.m120484d(b.mo49084a(), Boolean.TRUE);
            } else {
                z = false;
            }
            if (z) {
                C40762x A = this.f42831f.mo42480a(C15376d.C15377a.C15378a.BECOME_SOLO).mo95062A(new C17335z(new C14790c(this)));
                C41536l.m120488h(A, "{\n                getBen…BenefTypes)\n            }");
                return A;
            }
        }
        C40762x z2 = C40762x.m118162z(C41341q.m119907j());
        C41536l.m120488h(z2, "{\n                Single…mptyList())\n            }");
        return z2;
    }

    /* access modifiers changed from: private */
    /* renamed from: zw */
    public static final List m54412zw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* renamed from: Aw */
    public LiveData mo41213Aw() {
        return this.f42845t;
    }

    /* renamed from: Bw */
    public LiveData mo41214Bw() {
        return this.f42840o;
    }

    /* renamed from: Cw */
    public final C14787c mo41215Cw() {
        return this.f42837l;
    }

    /* renamed from: Dw */
    public LiveData mo41216Dw() {
        return this.f42843r;
    }

    /* renamed from: Ew */
    public final C14787c mo41217Ew() {
        return this.f42838m;
    }

    /* renamed from: Fw */
    public String mo41218Fw(int i) {
        List list;
        C17480d dVar = (C17480d) this.f42839n.mo4814f();
        if (dVar != null) {
            list = dVar.mo45004c();
        } else {
            list = null;
        }
        if (list == null || list.size() <= i) {
            return null;
        }
        return ((C17472b.C17474b) list.get(i)).mo44988d();
    }

    /* renamed from: Gw */
    public LiveData mo41219Gw() {
        return this.f42839n;
    }

    /* renamed from: Hw */
    public LiveData mo41220Hw() {
        return this.f42844s;
    }

    /* renamed from: Iw */
    public boolean mo41221Iw() {
        return this.f42836k || this.f42829d.getUserInfo().isSolo();
    }

    /* renamed from: Jw */
    public void mo41222Jw(String str) {
        C41536l.m120489i(str, "packageName");
        this.f42847v.onNext(str);
    }

    /* renamed from: Lw */
    public void mo41223Lw(int i) {
        C17297b bVar;
        List c;
        C17472b.C17474b bVar2;
        C1644x xVar = this.f42845t;
        C17480d dVar = (C17480d) this.f42839n.mo4814f();
        if (dVar == null || (c = dVar.mo45004c()) == null || (bVar2 = (C17472b.C17474b) C41358y.m120010Z(c, i)) == null || (bVar = bVar2.mo44987c()) == null) {
            bVar = C17297b.BECOMESOLO;
        }
        xVar.mo4823o(bVar);
    }

    /* renamed from: vv */
    public String mo41224vv() {
        C20557a b = this.f42830e.mo48775b("PACKAGES_DATE_DEFAULT_FORMAT");
        if (b != null) {
            return b.mo49087d();
        }
        return null;
    }

    /* renamed from: x0 */
    public LiveData mo41225x0() {
        return this.f42841p;
    }

    /* renamed from: z0 */
    public void mo41226z0(int i) {
        C41238w wVar;
        List c;
        C17472b.C17474b bVar;
        String j;
        C17480d dVar = (C17480d) this.f42839n.mo4814f();
        if (dVar == null || (c = dVar.mo45004c()) == null || (bVar = (C17472b.C17474b) C41358y.m120010Z(c, i)) == null || (j = bVar.mo44996j()) == null) {
            wVar = null;
        } else {
            this.f42846u.onNext(j);
            wVar = C41238w.f97225a;
        }
        if (wVar == null) {
            C37224b.m109962a(this.f42844s);
        }
    }

    /* renamed from: zu */
    public LiveData mo41227zu() {
        return this.f42842q;
    }
}
