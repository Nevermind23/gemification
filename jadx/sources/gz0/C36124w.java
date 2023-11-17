package gz0;

import af1.C40303i;
import androidx.lifecycle.C1607m0;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import c41.C31270e;
import ed1.C40735b0;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import ee1.C40767b;
import ez0.C31895a;
import ez0.C31896b;
import fz0.C32038a;
import g91.C32300e0;
import g91.C32343x;
import h21.C36143a;
import h31.C36149a;
import hd1.C41204a;
import he1.C41238w;
import i31.C36345b;
import iu0.C36546y;
import j51.C36735g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41551a;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import m41.C37224b;
import m51.C37228a;
import p341ge.bog.mobilebank.cleanarch.cardinsurance.presentation.model.DebitCardInsuranceTypeUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.products.data.model.cardinsurance.RegisterCardInsuranceParams;
import p341ge.bog.mobilebank.rest.model.otpparameter.OtpParams;
import p380ck.C10463g;
import p863pw.C27635m;
import p863pw.C27636n;
import pc0.C27494a;
import ty0.C38895u0;
import ue1.C43075l;
import vy0.C39495b;
import xd0.C29742a;
import yd0.C29991a;
import yd0.C30003b;
import z31.C40143a;
import z31.C40144b;
import z31.C40145c;

/* renamed from: gz0.w */
public final class C36124w extends C21481a implements C36114n, C36116o {

    /* renamed from: y */
    static final /* synthetic */ C40303i[] f87292y;

    /* renamed from: d */
    private final C39495b f87293d;

    /* renamed from: e */
    private final C36149a f87294e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C29742a f87295f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C32038a f87296g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C38895u0 f87297h;

    /* renamed from: i */
    private final C36735g f87298i;

    /* renamed from: j */
    private final C27494a f87299j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C31895a f87300k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C27635m f87301l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C36345b f87302m;

    /* renamed from: n */
    private final C1644x f87303n;

    /* renamed from: o */
    private final LiveData f87304o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C1644x f87305p = new C1644x();

    /* renamed from: q */
    private final C1644x f87306q = new C1644x(new C31896b(C32343x.m95388F("card.insurance.actionsheet.button", new Object[0]), false, false, 6, (DefaultConstructorMarker) null));

    /* renamed from: r */
    private final C1644x f87307r = new C1644x();

    /* renamed from: s */
    private final C1644x f87308s = new C1644x();

    /* renamed from: t */
    private final C1644x f87309t = new C1644x();

    /* renamed from: u */
    private final C41555e f87310u;

    /* renamed from: v */
    private final C40767b f87311v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public C40144b f87312w;

    /* renamed from: x */
    private final C41555e f87313x;

    /* renamed from: gz0.w$a */
    static final class C36125a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36124w f87314d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36125a(C36124w wVar) {
            super(1);
            this.f87314d = wVar;
        }

        /* renamed from: a */
        public final C40754t invoke(Integer num) {
            C40762x xVar;
            C41536l.m120489i(num, "rc");
            Long a = this.f87314d.f87300k.mo72313a();
            if (a == null || (xVar = this.f87314d.m107467Gw(a.longValue())) == null) {
                C36124w wVar = this.f87314d;
                xVar = wVar.m107465Ew(wVar.f87300k);
            }
            return C31270e.m92880i(xVar, num.intValue());
        }
    }

    /* renamed from: gz0.w$b */
    static final class C36126b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36124w f87315d;

        /* renamed from: e */
        final /* synthetic */ C31895a f87316e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36126b(C36124w wVar, C31895a aVar) {
            super(1);
            this.f87315d = wVar;
            this.f87316e = aVar;
        }

        /* renamed from: a */
        public final void mo88885a(List list) {
            C40144b bVar;
            Object obj;
            String str;
            C36124w wVar = this.f87315d;
            C41536l.m120488h(list, "list");
            wVar.m107476Sw(list);
            C36124w wVar2 = this.f87315d;
            List sw = wVar2.m107470Kw();
            C31895a aVar = this.f87316e;
            Iterator it = sw.iterator();
            while (true) {
                bVar = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                String a = ((C40145c) obj).mo94082c().mo94074a();
                DebitCardInsuranceTypeUiModel c = aVar.mo72315c();
                if (c != null) {
                    str = c.mo49682d();
                } else {
                    str = null;
                }
                if (C41536l.m120484d(a, str)) {
                    break;
                }
            }
            C40145c cVar = (C40145c) obj;
            if (cVar != null) {
                bVar = cVar.mo94082c();
            }
            wVar2.f87312w = bVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo88885a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: gz0.w$c */
    static final class C36127c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36124w f87317d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36127c(C36124w wVar) {
            super(1);
            this.f87317d = wVar;
        }

        /* renamed from: a */
        public final C40735b0 invoke(C27635m mVar) {
            C41536l.m120489i(mVar, "it");
            this.f87317d.f87301l = mVar;
            return this.f87317d.m107469Jw(mVar);
        }
    }

    /* renamed from: gz0.w$d */
    static final class C36128d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36124w f87318d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36128d(C36124w wVar) {
            super(1);
            this.f87318d = wVar;
        }

        /* renamed from: a */
        public final void mo88887a(C36345b bVar) {
            this.f87318d.f87302m = bVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo88887a((C36345b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: gz0.w$e */
    static final class C36129e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36124w f87319d;

        /* renamed from: e */
        final /* synthetic */ C27635m f87320e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36129e(C36124w wVar, C27635m mVar) {
            super(1);
            this.f87319d = wVar;
            this.f87320e = mVar;
        }

        /* renamed from: a */
        public final List invoke(C36345b bVar) {
            String str;
            C41536l.m120489i(bVar, "info");
            List<C40143a> b = this.f87319d.f87296g.mo72527b(bVar, this.f87320e);
            C27635m mVar = this.f87320e;
            ArrayList arrayList = new ArrayList(C41343r.m119925u(b, 10));
            for (C40143a aVar : b) {
                String g = aVar.mo94077d().mo89077g();
                C27636n v = mVar.mo67139v();
                if (v != null) {
                    str = v.mo67157l();
                } else {
                    str = null;
                }
                arrayList.add(new C40145c(aVar, C41536l.m120484d(g, str)));
            }
            return arrayList;
        }
    }

    /* renamed from: gz0.w$f */
    static final class C36130f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36124w f87321d;

        /* renamed from: e */
        final /* synthetic */ C27635m f87322e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36130f(C36124w wVar, C27635m mVar) {
            super(1);
            this.f87321d = wVar;
            this.f87322e = mVar;
        }

        /* renamed from: a */
        public final void mo88889a(List list) {
            C40144b bVar;
            Object obj;
            String str;
            C36124w wVar = this.f87321d;
            C41536l.m120488h(list, "list");
            wVar.m107476Sw(list);
            C36124w wVar2 = this.f87321d;
            C27635m mVar = this.f87322e;
            Iterator it = list.iterator();
            while (true) {
                bVar = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                String a = ((C40145c) obj).mo94082c().mo94074a();
                C27636n v = mVar.mo67139v();
                if (v != null) {
                    str = v.mo67157l();
                } else {
                    str = null;
                }
                if (C41536l.m120484d(a, str)) {
                    break;
                }
            }
            C40145c cVar = (C40145c) obj;
            if (cVar != null) {
                bVar = cVar.mo94082c();
            }
            wVar2.f87312w = bVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo88889a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: gz0.w$g */
    static final class C36131g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36124w f87323d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36131g(C36124w wVar) {
            super(1);
            this.f87323d = wVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x004d A[Catch:{ all -> 0x0134 }] */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0051 A[Catch:{ all -> 0x0134 }] */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x00b9 A[Catch:{ all -> 0x0134 }] */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x0111 A[Catch:{ all -> 0x0134 }] */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x0115 A[Catch:{ all -> 0x0134 }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final b41.C31128a invoke(b41.C31128a r11) {
            /*
                r10 = this;
                java.lang.String r0 = "it"
                kotlin.jvm.internal.C41536l.m120488h(r11, r0)
                gz0.w r0 = r10.f87323d
                boolean r1 = r11 instanceof b41.C31128a.C31131c     // Catch:{ all -> 0x0134 }
                java.lang.String r2 = "MM/yy"
                r3 = 0
                java.lang.String r4 = ""
                r5 = 1
                r6 = 0
                if (r1 == 0) goto L_0x006e
                r1 = r11
                b41.a$c r1 = (b41.C31128a.C31131c) r1     // Catch:{ all -> 0x0134 }
                java.lang.Object r1 = r1.mo71340a()     // Catch:{ all -> 0x0134 }
                java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0134 }
                i31.b r1 = r0.f87302m     // Catch:{ all -> 0x0134 }
                if (r1 == 0) goto L_0x004e
                java.util.List r1 = r1.mo89064a()     // Catch:{ all -> 0x0134 }
                if (r1 == 0) goto L_0x004e
                boolean r7 = r1.isEmpty()     // Catch:{ all -> 0x0134 }
                if (r7 == 0) goto L_0x002f
            L_0x002d:
                r1 = r6
                goto L_0x004b
            L_0x002f:
                java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0134 }
            L_0x0033:
                boolean r7 = r1.hasNext()     // Catch:{ all -> 0x0134 }
                if (r7 == 0) goto L_0x002d
                java.lang.Object r7 = r1.next()     // Catch:{ all -> 0x0134 }
                i31.a r7 = (i31.C36344a) r7     // Catch:{ all -> 0x0134 }
                java.lang.Double r7 = r7.mo89060c()     // Catch:{ all -> 0x0134 }
                if (r7 == 0) goto L_0x0047
                r7 = r5
                goto L_0x0048
            L_0x0047:
                r7 = r6
            L_0x0048:
                if (r7 == 0) goto L_0x0033
                r1 = r5
            L_0x004b:
                if (r1 != r5) goto L_0x004e
                goto L_0x004f
            L_0x004e:
                r5 = r6
            L_0x004f:
                if (r5 == 0) goto L_0x0063
                pw.m r0 = r0.f87301l     // Catch:{ all -> 0x0134 }
                if (r0 == 0) goto L_0x005f
                long r0 = r0.mo67134r()     // Catch:{ all -> 0x0134 }
                java.lang.String r3 = g91.C32359z0.m95546Q(r0, r2)     // Catch:{ all -> 0x0134 }
            L_0x005f:
                if (r3 != 0) goto L_0x0062
                goto L_0x0063
            L_0x0062:
                r4 = r3
            L_0x0063:
                int r0 = r11.mo71341b()     // Catch:{ all -> 0x0134 }
                b41.a$c r1 = new b41.a$c     // Catch:{ all -> 0x0134 }
                r1.<init>(r4, r0)     // Catch:{ all -> 0x0134 }
                goto L_0x0143
            L_0x006e:
                boolean r1 = r11 instanceof b41.C31128a.C31129a     // Catch:{ all -> 0x0134 }
                if (r1 == 0) goto L_0x00d1
                r1 = r11
                b41.a$a r1 = (b41.C31128a.C31129a) r1     // Catch:{ all -> 0x0134 }
                java.lang.Throwable r1 = r1.mo71342c()     // Catch:{ all -> 0x0134 }
                int r7 = r11.mo71341b()     // Catch:{ all -> 0x0134 }
                java.lang.Object r8 = r11.mo71340a()     // Catch:{ all -> 0x0134 }
                java.util.List r8 = (java.util.List) r8     // Catch:{ all -> 0x0134 }
                i31.b r8 = r0.f87302m     // Catch:{ all -> 0x0134 }
                if (r8 == 0) goto L_0x00b6
                java.util.List r8 = r8.mo89064a()     // Catch:{ all -> 0x0134 }
                if (r8 == 0) goto L_0x00b6
                boolean r9 = r8.isEmpty()     // Catch:{ all -> 0x0134 }
                if (r9 == 0) goto L_0x0097
            L_0x0095:
                r8 = r6
                goto L_0x00b3
            L_0x0097:
                java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x0134 }
            L_0x009b:
                boolean r9 = r8.hasNext()     // Catch:{ all -> 0x0134 }
                if (r9 == 0) goto L_0x0095
                java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x0134 }
                i31.a r9 = (i31.C36344a) r9     // Catch:{ all -> 0x0134 }
                java.lang.Double r9 = r9.mo89060c()     // Catch:{ all -> 0x0134 }
                if (r9 == 0) goto L_0x00af
                r9 = r5
                goto L_0x00b0
            L_0x00af:
                r9 = r6
            L_0x00b0:
                if (r9 == 0) goto L_0x009b
                r8 = r5
            L_0x00b3:
                if (r8 != r5) goto L_0x00b6
                goto L_0x00b7
            L_0x00b6:
                r5 = r6
            L_0x00b7:
                if (r5 == 0) goto L_0x00cb
                pw.m r0 = r0.f87301l     // Catch:{ all -> 0x0134 }
                if (r0 == 0) goto L_0x00c7
                long r5 = r0.mo67134r()     // Catch:{ all -> 0x0134 }
                java.lang.String r3 = g91.C32359z0.m95546Q(r5, r2)     // Catch:{ all -> 0x0134 }
            L_0x00c7:
                if (r3 != 0) goto L_0x00ca
                goto L_0x00cb
            L_0x00ca:
                r4 = r3
            L_0x00cb:
                b41.a$a r0 = new b41.a$a     // Catch:{ all -> 0x0134 }
                r0.<init>(r1, r7, r4)     // Catch:{ all -> 0x0134 }
                goto L_0x012c
            L_0x00d1:
                boolean r1 = r11 instanceof b41.C31128a.C31130b     // Catch:{ all -> 0x0134 }
                if (r1 == 0) goto L_0x012e
                int r1 = r11.mo71341b()     // Catch:{ all -> 0x0134 }
                java.lang.Object r7 = r11.mo71340a()     // Catch:{ all -> 0x0134 }
                java.util.List r7 = (java.util.List) r7     // Catch:{ all -> 0x0134 }
                i31.b r7 = r0.f87302m     // Catch:{ all -> 0x0134 }
                if (r7 == 0) goto L_0x0112
                java.util.List r7 = r7.mo89064a()     // Catch:{ all -> 0x0134 }
                if (r7 == 0) goto L_0x0112
                boolean r8 = r7.isEmpty()     // Catch:{ all -> 0x0134 }
                if (r8 == 0) goto L_0x00f3
            L_0x00f1:
                r7 = r6
                goto L_0x010f
            L_0x00f3:
                java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x0134 }
            L_0x00f7:
                boolean r8 = r7.hasNext()     // Catch:{ all -> 0x0134 }
                if (r8 == 0) goto L_0x00f1
                java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x0134 }
                i31.a r8 = (i31.C36344a) r8     // Catch:{ all -> 0x0134 }
                java.lang.Double r8 = r8.mo89060c()     // Catch:{ all -> 0x0134 }
                if (r8 == 0) goto L_0x010b
                r8 = r5
                goto L_0x010c
            L_0x010b:
                r8 = r6
            L_0x010c:
                if (r8 == 0) goto L_0x00f7
                r7 = r5
            L_0x010f:
                if (r7 != r5) goto L_0x0112
                goto L_0x0113
            L_0x0112:
                r5 = r6
            L_0x0113:
                if (r5 == 0) goto L_0x0127
                pw.m r0 = r0.f87301l     // Catch:{ all -> 0x0134 }
                if (r0 == 0) goto L_0x0123
                long r5 = r0.mo67134r()     // Catch:{ all -> 0x0134 }
                java.lang.String r3 = g91.C32359z0.m95546Q(r5, r2)     // Catch:{ all -> 0x0134 }
            L_0x0123:
                if (r3 != 0) goto L_0x0126
                goto L_0x0127
            L_0x0126:
                r4 = r3
            L_0x0127:
                b41.a$b r0 = new b41.a$b     // Catch:{ all -> 0x0134 }
                r0.<init>(r1, r4)     // Catch:{ all -> 0x0134 }
            L_0x012c:
                r1 = r0
                goto L_0x0143
            L_0x012e:
                kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x0134 }
                r0.<init>()     // Catch:{ all -> 0x0134 }
                throw r0     // Catch:{ all -> 0x0134 }
            L_0x0134:
                r0 = move-exception
                r2 = r0
                b41.a$a r0 = new b41.a$a
                int r3 = r11.mo71341b()
                r4 = 0
                r5 = 4
                r6 = 0
                r1 = r0
                r1.<init>(r2, r3, r4, r5, r6)
            L_0x0143:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: gz0.C36124w.C36131g.invoke(b41.a):b41.a");
        }
    }

    /* renamed from: gz0.w$h */
    public static final class C36132h extends C41553c {

        /* renamed from: a */
        final /* synthetic */ C36124w f87324a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36132h(Object obj, C36124w wVar) {
            super(obj);
            this.f87324a = wVar;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            List list = (List) obj;
            this.f87324a.f87305p.mo4823o((List) obj2);
        }
    }

    /* renamed from: gz0.w$i */
    public static final class C36133i extends C41553c {

        /* renamed from: a */
        final /* synthetic */ C36124w f87325a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36133i(Object obj, C36124w wVar) {
            super(obj);
            this.f87325a = wVar;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            ((Boolean) obj2).booleanValue();
            ((Boolean) obj).booleanValue();
            this.f87325a.m107462Bw();
        }
    }

    /* renamed from: gz0.w$j */
    static final class C36134j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36124w f87326d;

        /* renamed from: gz0.w$j$a */
        static final class C36135a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ RegisterCardInsuranceParams f87327d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C36135a(RegisterCardInsuranceParams registerCardInsuranceParams) {
                super(1);
                this.f87327d = registerCardInsuranceParams;
            }

            /* renamed from: a */
            public final void mo88892a(C30003b bVar) {
                C36143a.C36144a aVar = new C36143a.C36144a(this.f87327d.getInsuranceType());
                C10463g F = C36546y.m108282F();
                C41536l.m120488h(F, "getAnalytics()");
                aVar.mo88899c(F);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo88892a((C30003b) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36134j(C36124w wVar) {
            super(1);
            this.f87326d = wVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m107522c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(RegisterCardInsuranceParams registerCardInsuranceParams) {
            C41536l.m120489i(registerCardInsuranceParams, "params");
            C40762x m = this.f87326d.f87297h.mo92592a(this.f87326d.mo88882Ow(registerCardInsuranceParams)).mo94898g(this.f87326d.f87295f.mo47470a(C29991a.C29994c.C29996b.f75808e)).mo95084m(new C36136x(new C36135a(registerCardInsuranceParams)));
            C41536l.m120488h(m, "params ->\n              …())\n                    }");
            return C31270e.m92880i(C32343x.m95465l1(m), -1);
        }
    }

    static {
        Class<C36124w> cls = C36124w.class;
        f87292y = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "insuranceList", "getInsuranceList()Ljava/util/List;", 0)), C41520a0.m120439e(new C41539o(cls, "checkedTerms", "getCheckedTerms()Z", 0))};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36124w(C39495b bVar, C36149a aVar, C29742a aVar2, C32038a aVar3, C38895u0 u0Var, C36735g gVar, C27494a aVar4, C31895a aVar5) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(bVar, "getCardDetails");
        C41536l.m120489i(aVar, "getDebitCardInsuranceTypeInfo");
        C41536l.m120489i(aVar2, "getClientCampaignInfo");
        C41536l.m120489i(aVar3, "insuranceMapper");
        C41536l.m120489i(u0Var, "useScaForAction");
        C41536l.m120489i(gVar, "getLoginInfo");
        C41536l.m120489i(aVar4, "otpParamsMapBuilder");
        C41536l.m120489i(aVar5, "options");
        this.f87293d = bVar;
        this.f87294e = aVar;
        this.f87295f = aVar2;
        this.f87296g = aVar3;
        this.f87297h = u0Var;
        this.f87298i = gVar;
        this.f87299j = aVar4;
        this.f87300k = aVar5;
        C1644x xVar = new C1644x();
        this.f87303n = xVar;
        this.f87304o = C1607m0.m5655c(xVar, new C36131g(this));
        C41551a aVar6 = C41551a.f97718a;
        this.f87310u = new C36132h(C41341q.m119907j(), this);
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<RegisterCardInsuranceParams>()");
        this.f87311v = h1;
        this.f87313x = new C36133i(Boolean.FALSE, this);
        m107477Tw();
        C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C36117p(new C36125a(this)));
        C41536l.m120488h(L0, "merge(onInit(), onRefres…ervable(rc)\n            }");
        bindToLifecycle(C31270e.m92876e(L0, xVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: Bw */
    public final void m107462Bw() {
        C40144b bVar;
        Object obj;
        Iterator it = m107470Kw().iterator();
        while (true) {
            bVar = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C40145c) obj).mo94083d()) {
                break;
            }
        }
        C40145c cVar = (C40145c) obj;
        if (cVar != null) {
            bVar = cVar.mo94082c();
        }
        m107463Cw(bVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009d, code lost:
        if (kotlin.jvm.internal.C41536l.m120484d(r12, r1) == false) goto L_0x009f;
     */
    /* renamed from: Cw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m107463Cw(z31.C40144b r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof z31.C40143a
            r1 = 0
            if (r0 == 0) goto L_0x0009
            r0 = r12
            z31.a r0 = (z31.C40143a) r0
            goto L_0x000a
        L_0x0009:
            r0 = r1
        L_0x000a:
            if (r0 == 0) goto L_0x0018
            i31.a r2 = r0.mo94075b()
            if (r2 == 0) goto L_0x0018
            java.lang.Double r2 = r2.mo89060c()
            if (r2 != 0) goto L_0x002a
        L_0x0018:
            if (r0 == 0) goto L_0x0029
            i31.a r0 = r0.mo94075b()
            if (r0 == 0) goto L_0x0029
            double r2 = r0.mo89058a()
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            goto L_0x002a
        L_0x0029:
            r2 = r1
        L_0x002a:
            r0 = 0
            if (r2 == 0) goto L_0x0042
            double r3 = r2.doubleValue()
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x0042
            double r2 = r2.doubleValue()
            java.lang.String r4 = "GEL"
            java.lang.String r2 = g91.C32303f.m95200k(r2, r4)
            goto L_0x004a
        L_0x0042:
            java.lang.String r2 = "text.insurence.fee.free"
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.String r2 = g91.C32343x.m95388F(r2, r3)
        L_0x004a:
            androidx.lifecycle.x r3 = r11.f87306q
            ez0.b r10 = new ez0.b
            java.lang.String r4 = "card.insurance.actionsheet.button"
            if (r12 == 0) goto L_0x0072
            boolean r5 = r12 instanceof z31.C40146d
            if (r5 == 0) goto L_0x0057
            goto L_0x0072
        L_0x0057:
            java.lang.Object[] r5 = new java.lang.Object[r0]
            java.lang.String r4 = g91.C32343x.m95388F(r4, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = " - "
            r5.append(r4)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            goto L_0x0078
        L_0x0072:
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r2 = g91.C32343x.m95388F(r4, r2)
        L_0x0078:
            r5 = r2
            ez0.a r2 = r11.f87300k
            java.lang.Long r2 = r2.mo72313a()
            if (r2 == 0) goto L_0x0087
            boolean r2 = r11.m107464Dw()
            if (r2 == 0) goto L_0x00a0
        L_0x0087:
            if (r12 == 0) goto L_0x00a0
            boolean r2 = r12 instanceof z31.C40146d
            if (r2 != 0) goto L_0x009f
            java.lang.String r12 = r12.mo94074a()
            z31.b r2 = r11.f87312w
            if (r2 == 0) goto L_0x0099
            java.lang.String r1 = r2.mo94074a()
        L_0x0099:
            boolean r12 = kotlin.jvm.internal.C41536l.m120484d(r12, r1)
            if (r12 != 0) goto L_0x00a0
        L_0x009f:
            r0 = 1
        L_0x00a0:
            r6 = r0
            r7 = 0
            r8 = 4
            r9 = 0
            r4 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r3.mo4823o(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gz0.C36124w.m107463Cw(z31.b):void");
    }

    /* renamed from: Dw */
    private final boolean m107464Dw() {
        return ((Boolean) this.f87313x.getValue(this, f87292y[1])).booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: Ew */
    public final C40762x m107465Ew(C31895a aVar) {
        C40762x m = C40762x.m118162z(this.f87296g.mo72529e(aVar.mo72314b(), aVar.mo72315c())).mo95084m(new C36118q(new C36126b(this, aVar)));
        C41536l.m120488h(m, "private fun getFromProvi… }?.details\n            }");
        return m;
    }

    /* access modifiers changed from: private */
    /* renamed from: Fw */
    public static final void m107466Fw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Gw */
    public final C40762x m107467Gw(long j) {
        C40762x r = C39495b.m114813c(this.f87293d, j, false, 2, (Object) null).mo95087r(new C36120s(new C36127c(this)));
        C41536l.m120488h(r, "private fun getFromServe…nceList(it)\n            }");
        return r;
    }

    /* access modifiers changed from: private */
    /* renamed from: Hw */
    public static final C40735b0 m107468Hw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40735b0) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Jw */
    public final C40762x m107469Jw(C27635m mVar) {
        Long l;
        C36149a aVar = this.f87294e;
        C37228a a = this.f87298i.mo89562a();
        if (a != null) {
            l = Long.valueOf(a.mo90305b());
        } else {
            l = null;
        }
        C40762x m = C36149a.C36150a.m107539a(aVar, String.valueOf(l), mVar.mo67118d(), mVar.mo67131o(), mVar.mo67105E(), String.valueOf(mVar.mo67126j()), (String) null, 32, (Object) null).mo95084m(new C36121t(new C36128d(this))).mo95062A(new C36122u(new C36129e(this, mVar))).mo95084m(new C36123v(new C36130f(this, mVar)));
        C41536l.m120488h(m, "private fun getInsurance…details\n                }");
        return m;
    }

    /* access modifiers changed from: private */
    /* renamed from: Kw */
    public final List m107470Kw() {
        return (List) this.f87310u.getValue(this, f87292y[0]);
    }

    /* access modifiers changed from: private */
    /* renamed from: Lw */
    public static final void m107471Lw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Mw */
    public static final List m107472Mw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Nw */
    public static final void m107473Nw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Qw */
    private final void m107474Qw(String str, String str2, String str3, long j, String str4) {
        if (C32300e0.f79712a.mo72816a(str, str2, str3)) {
            this.f87311v.onNext(new RegisterCardInsuranceParams(j, str4, str, str2, str3, (String) null, 32, (DefaultConstructorMarker) null));
            return;
        }
        C37224b.m109965d(this.f87308s, new RegisterCardInsuranceParams(j, str4, (String) null, (String) null, (String) null, (String) null, 60, (DefaultConstructorMarker) null));
    }

    /* renamed from: Rw */
    private final void m107475Rw(boolean z) {
        this.f87313x.setValue(this, f87292y[1], Boolean.valueOf(z));
    }

    /* access modifiers changed from: private */
    /* renamed from: Sw */
    public final void m107476Sw(List list) {
        this.f87310u.setValue(this, f87292y[0], list);
    }

    /* renamed from: Tw */
    private final void m107477Tw() {
        C40749p L0 = this.f87311v.mo94989L0(new C36119r(new C36134j(this)));
        C41536l.m120488h(L0, "private fun subscribeToS…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, this.f87307r));
    }

    /* access modifiers changed from: private */
    /* renamed from: Uw */
    public static final C40754t m107478Uw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: kw */
    public static final C40754t m107486kw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Eb */
    public LiveData mo88875Eb() {
        return this.f87307r;
    }

    /* renamed from: Ee */
    public LiveData mo88876Ee() {
        return this.f87309t;
    }

    /* renamed from: Iw */
    public final C36114n mo88881Iw() {
        return this;
    }

    /* renamed from: Jq */
    public void mo88872Jq(C40144b bVar) {
        C41536l.m120489i(bVar, "insuranceType");
        List<C40145c> Kw = m107470Kw();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(Kw, 10));
        for (C40145c cVar : Kw) {
            arrayList.add(C40145c.m116282b(cVar, (C40144b) null, C41536l.m120484d(cVar.mo94082c().mo94074a(), bVar.mo94074a()), 1, (Object) null));
        }
        m107476Sw(arrayList);
        m107462Bw();
    }

    /* renamed from: K8 */
    public LiveData mo88877K8() {
        return this.f87308s;
    }

    /* renamed from: Oo */
    public LiveData mo88878Oo() {
        return this.f87305p;
    }

    /* renamed from: Ow */
    public HashMap mo88882Ow(OtpParams otpParams) {
        C41536l.m120489i(otpParams, "otpParams");
        return this.f87299j.mo66809a(otpParams);
    }

    /* renamed from: Pw */
    public final C36116o mo88883Pw() {
        return this;
    }

    /* renamed from: T2 */
    public LiveData mo88879T2() {
        return this.f87306q;
    }

    /* renamed from: o6 */
    public void mo88873o6(String str, String str2, String str3) {
        C41238w wVar;
        Object obj;
        C40144b c;
        Iterator it = m107470Kw().iterator();
        while (true) {
            wVar = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C40145c) obj).mo94083d()) {
                break;
            }
        }
        C40145c cVar = (C40145c) obj;
        if (cVar != null && (c = cVar.mo94082c()) != null) {
            C27635m mVar = this.f87301l;
            if (mVar != null) {
                m107474Qw(str, str2, str3, mVar.mo67126j(), String.valueOf(c.mo94074a()));
                wVar = C41238w.f97225a;
            }
            if (wVar == null) {
                C37224b.m109965d(this.f87309t, c);
                C36143a.C36144a aVar = new C36143a.C36144a(c.mo94074a());
                C10463g F = C36546y.m108282F();
                C41536l.m120488h(F, "getAnalytics()");
                aVar.mo88899c(F);
            }
        }
    }

    /* renamed from: rt */
    public LiveData mo88880rt() {
        return this.f87304o;
    }

    /* renamed from: t1 */
    public void mo88874t1(boolean z) {
        m107475Rw(z);
    }
}
