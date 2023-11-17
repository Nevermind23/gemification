package j20;

import androidx.core.util.C1004d;
import bf1.C40342g;
import i20.C25104d;
import i20.C25105e;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.banner.presentation.model.BannerTypedParameterData;
import p341ge.bog.mobilebank.cleanarch.banner.presentation.model.NboBanner;
import p341ge.bog.mobilebank.cleanarch.banner.presentation.model.NboBanners;
import ue1.C43075l;

/* renamed from: j20.c */
public final class C25310c {

    /* renamed from: a */
    public static final C25311a f64973a = new C25311a((DefaultConstructorMarker) null);

    /* renamed from: j20.c$a */
    public static final class C25311a {
        private C25311a() {
        }

        public /* synthetic */ C25311a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: j20.c$b */
    static final class C25312b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C25310c f64974d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25312b(C25310c cVar) {
            super(1);
            this.f64974d = cVar;
        }

        /* renamed from: a */
        public final C25104d invoke(NboBanner nboBanner) {
            C41536l.m120489i(nboBanner, "it");
            return this.f64974d.mo63875d(nboBanner);
        }
    }

    /* renamed from: j20.c$c */
    static final class C25313c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ String f64975d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25313c(String str) {
            super(1);
            this.f64975d = str;
        }

        /* renamed from: a */
        public final Boolean invoke(C25104d dVar) {
            C41536l.m120489i(dVar, "it");
            return Boolean.valueOf(C41536l.m120484d(dVar.mo63563d(), this.f64975d));
        }
    }

    /* renamed from: j20.c$d */
    static final class C25314d extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C25314d f64976d = new C25314d();

        C25314d() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(C25104d dVar) {
            long j;
            boolean z;
            C41536l.m120489i(dVar, "it");
            Long b = dVar.mo63561b();
            if (b != null) {
                j = b.longValue();
            } else {
                j = Long.MAX_VALUE;
            }
            if (j > System.currentTimeMillis()) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: j20.c$e */
    static final class C25315e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C25310c f64977d;

        /* renamed from: e */
        final /* synthetic */ boolean f64978e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25315e(C25310c cVar, boolean z) {
            super(1);
            this.f64977d = cVar;
            this.f64978e = z;
        }

        /* renamed from: a */
        public final Boolean invoke(C25104d dVar) {
            C41536l.m120489i(dVar, "it");
            return Boolean.valueOf(this.f64977d.m80464b(dVar, this.f64978e));
        }
    }

    /* renamed from: j20.c$f */
    public static final class C25316f implements Comparator {
        public final int compare(Object obj, Object obj2) {
            return C41506d.m120406e(((C25104d) obj).mo63585w(), ((C25104d) obj2).mo63585w());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final boolean m80464b(C25104d dVar, boolean z) {
        String c = dVar.mo63562c();
        if (C41536l.m120484d(c, "CONSUMER_LOAN")) {
            if (z) {
                return false;
            }
        } else if (C41536l.m120484d(c, "CONSUMER_LOAN_ACTIVATE")) {
            return z;
        }
        return true;
    }

    /* renamed from: f */
    public static /* synthetic */ C25105e m80465f(C25310c cVar, NboBanners nboBanners, String str, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return cVar.mo63876e(nboBanners, str, z);
    }

    /* renamed from: c */
    public final C1004d mo63874c(BannerTypedParameterData bannerTypedParameterData) {
        C41536l.m120489i(bannerTypedParameterData, "data");
        return new C1004d(bannerTypedParameterData.getKey(), String.valueOf(bannerTypedParameterData.getValue()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x011c  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final i20.C25104d mo63875d(p341ge.bog.mobilebank.cleanarch.banner.presentation.model.NboBanner r39) {
        /*
            r38 = this;
            r0 = r38
            r1 = r39
            java.lang.String r2 = "data"
            kotlin.jvm.internal.C41536l.m120489i(r1, r2)
            java.lang.String r4 = r39.getBannerName()
            java.lang.Boolean r5 = r39.getBannerClosable()
            java.lang.String r2 = r39.getLayoutType()
            r3 = 1
            if (r2 == 0) goto L_0x0021
            boolean r2 = cf1.C40439w.m117118v(r2)
            if (r2 == 0) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            r2 = 0
            goto L_0x0022
        L_0x0021:
            r2 = r3
        L_0x0022:
            if (r2 != 0) goto L_0x004d
            ge.bog.mobilebank.cleanarch.presentation.home.model.LayoutType[] r2 = p341ge.bog.mobilebank.cleanarch.presentation.home.model.LayoutType.values()
            int r8 = r2.length
            r9 = 0
        L_0x002a:
            if (r9 >= r8) goto L_0x0040
            r10 = r2[r9]
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = r39.getLayoutType()
            boolean r10 = kotlin.jvm.internal.C41536l.m120484d(r10, r11)
            if (r10 == 0) goto L_0x003d
            goto L_0x0041
        L_0x003d:
            int r9 = r9 + 1
            goto L_0x002a
        L_0x0040:
            r3 = 0
        L_0x0041:
            if (r3 != 0) goto L_0x0044
            goto L_0x004d
        L_0x0044:
            java.lang.String r2 = r39.getLayoutType()
            ge.bog.mobilebank.cleanarch.presentation.home.model.LayoutType r2 = p341ge.bog.mobilebank.cleanarch.presentation.home.model.LayoutType.valueOf(r2)
            goto L_0x004e
        L_0x004d:
            r2 = 0
        L_0x004e:
            java.lang.Integer r8 = r39.getOrderNo()
            java.lang.String r9 = r39.getBannerType()
            java.lang.Long r10 = r39.getBannerEndDate()
            ge.bog.mobilebank.cleanarch.banner.presentation.model.BannerDeepLinkData r11 = r39.getDeepLinkData()
            java.lang.String r12 = r39.getClickCallBackService()
            java.lang.String r13 = r39.getCloseCallBackService()
            java.lang.String r14 = r39.getIOSCheckFunction()
            java.lang.String r15 = r39.getAndroidCheckFunction()
            java.lang.Long r16 = r39.getImpressionTargetId()
            java.lang.String r17 = r39.getImpressionActivityType()
            java.lang.String r18 = r39.getFirebaseClickEventName()
            java.util.List r3 = r39.getFirebaseClickEventParams()
            r7 = 10
            if (r3 == 0) goto L_0x00ae
            java.util.List r3 = ie1.C41358y.m120004T(r3)
            if (r3 == 0) goto L_0x00ae
            java.util.ArrayList r6 = new java.util.ArrayList
            r21 = r15
            int r15 = ie1.C41343r.m119925u(r3, r7)
            r6.<init>(r15)
            java.util.Iterator r3 = r3.iterator()
        L_0x0097:
            boolean r15 = r3.hasNext()
            if (r15 == 0) goto L_0x00ab
            java.lang.Object r15 = r3.next()
            ge.bog.mobilebank.cleanarch.banner.presentation.model.BannerTypedParameterData r15 = (p341ge.bog.mobilebank.cleanarch.banner.presentation.model.BannerTypedParameterData) r15
            androidx.core.util.d r15 = r0.mo63874c(r15)
            r6.add(r15)
            goto L_0x0097
        L_0x00ab:
            r22 = r6
            goto L_0x00b2
        L_0x00ae:
            r21 = r15
            r22 = 0
        L_0x00b2:
            java.lang.String r34 = r39.getFirebaseCloseEventName()
            java.util.List r3 = r39.getFirebaseCloseEventParams()
            if (r3 == 0) goto L_0x00e6
            java.util.List r3 = ie1.C41358y.m120004T(r3)
            if (r3 == 0) goto L_0x00e6
            java.util.ArrayList r6 = new java.util.ArrayList
            int r15 = ie1.C41343r.m119925u(r3, r7)
            r6.<init>(r15)
            java.util.Iterator r3 = r3.iterator()
        L_0x00cf:
            boolean r15 = r3.hasNext()
            if (r15 == 0) goto L_0x00e3
            java.lang.Object r15 = r3.next()
            ge.bog.mobilebank.cleanarch.banner.presentation.model.BannerTypedParameterData r15 = (p341ge.bog.mobilebank.cleanarch.banner.presentation.model.BannerTypedParameterData) r15
            androidx.core.util.d r15 = r0.mo63874c(r15)
            r6.add(r15)
            goto L_0x00cf
        L_0x00e3:
            r35 = r6
            goto L_0x00e8
        L_0x00e6:
            r35 = 0
        L_0x00e8:
            java.lang.String r36 = r39.getFirebaseImpressionEventName()
            java.util.List r3 = r39.getFirebaseImpressionEventParams()
            if (r3 == 0) goto L_0x011c
            java.util.List r3 = ie1.C41358y.m120004T(r3)
            if (r3 == 0) goto L_0x011c
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = ie1.C41343r.m119925u(r3, r7)
            r6.<init>(r7)
            java.util.Iterator r3 = r3.iterator()
        L_0x0105:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x0119
            java.lang.Object r7 = r3.next()
            ge.bog.mobilebank.cleanarch.banner.presentation.model.BannerTypedParameterData r7 = (p341ge.bog.mobilebank.cleanarch.banner.presentation.model.BannerTypedParameterData) r7
            androidx.core.util.d r7 = r0.mo63874c(r7)
            r6.add(r7)
            goto L_0x0105
        L_0x0119:
            r37 = r6
            goto L_0x011e
        L_0x011c:
            r37 = 0
        L_0x011e:
            java.lang.String r23 = r39.getFacebookClickEventName()
            java.lang.String r24 = r39.getFacebookCloseEventName()
            java.lang.String r25 = r39.getFacebookImpressionEventName()
            java.lang.String r3 = "rightHeaderText"
            java.lang.String r3 = p754fq.C20545b.m66798a(r1, r3)
            r6 = 0
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.String r26 = g91.C32343x.m95388F(r3, r7)
            java.lang.String r3 = "rightMainText"
            java.lang.String r3 = p754fq.C20545b.m66798a(r1, r3)
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.String r27 = g91.C32343x.m95388F(r3, r7)
            java.lang.String r3 = "rightButtonText"
            java.lang.String r3 = p754fq.C20545b.m66798a(r1, r3)
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.String r28 = g91.C32343x.m95388F(r3, r7)
            java.lang.String r3 = "buttonLeftText"
            java.lang.String r3 = p754fq.C20545b.m66798a(r1, r3)
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.String r29 = g91.C32343x.m95388F(r3, r7)
            java.lang.String r3 = "buttonValueText"
            java.lang.String r3 = p754fq.C20545b.m66798a(r1, r3)
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.String r30 = g91.C32343x.m95388F(r3, r7)
            java.lang.String r3 = "buttonValueSuffixText"
            java.lang.String r3 = p754fq.C20545b.m66798a(r1, r3)
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r31 = g91.C32343x.m95388F(r3, r6)
            java.lang.String r3 = "leftImgURL"
            java.lang.String r32 = p754fq.C20545b.m66798a(r1, r3)
            java.lang.String r3 = "bckImageURL"
            java.lang.String r33 = p754fq.C20545b.m66798a(r1, r3)
            i20.d r1 = new i20.d
            r3 = r1
            r6 = r2
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r14
            r14 = r21
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r22
            r19 = r34
            r20 = r35
            r21 = r36
            r22 = r37
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j20.C25310c.mo63875d(ge.bog.mobilebank.cleanarch.banner.presentation.model.NboBanner):i20.d");
    }

    /* renamed from: e */
    public final C25105e mo63876e(NboBanners nboBanners, String str, boolean z) {
        List list;
        C40342g M;
        C40342g n;
        C40342g u;
        C40342g l;
        C40342g l2;
        C40342g l3;
        C40342g w;
        C41536l.m120489i(nboBanners, "data");
        C41536l.m120489i(str, "bannerType");
        List<NboBanner> bannerList = nboBanners.getBannerList();
        if (bannerList == null || (M = C41358y.m119997M(bannerList)) == null || (n = C40355o.m116856n(M)) == null || (u = C40355o.m116863u(n, new C25312b(this))) == null || (l = C40355o.m116854l(u, new C25313c(str))) == null || (l2 = C40355o.m116854l(l, C25314d.f64976d)) == null || (l3 = C40355o.m116854l(l2, new C25315e(this, z))) == null || (w = C40355o.m116865w(l3, new C25316f())) == null) {
            list = null;
        } else {
            list = C40355o.m116850A(w);
        }
        return new C25105e(list);
    }
}
