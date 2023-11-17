package p341ge.bog.mobilebank.categorypackages.presentation.cancel;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import ed1.C40734b;
import ed1.C40736c;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import j51.C36746r;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p341ge.bog.mobilebank.cleanarch.moremenu.presentation.PackageType;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.model.Client;
import p400dp.C12409d;
import p400dp.C12410e;
import p400dp.C12411f;
import p400dp.C12412g;
import p400dp.C12413h;
import p400dp.C12414i;
import p400dp.C12415j;
import p400dp.C12416k;
import p441go.C15374b;
import p441go.C15386k;
import p469io.C15709b;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: ge.bog.mobilebank.categorypackages.presentation.cancel.PackageCancelViewModel$ViewModel */
public final class PackageCancelViewModel$ViewModel extends C21481a implements C12409d, C12410e {

    /* renamed from: d */
    private final C15386k f42487d;

    /* renamed from: e */
    private final C15374b f42488e;

    /* renamed from: f */
    private final C36746r f42489f;

    /* renamed from: g */
    private final Client f42490g;

    /* renamed from: h */
    private final C12409d f42491h = this;

    /* renamed from: i */
    private final C12410e f42492i = this;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C1644x f42493j = new C1644x();

    /* renamed from: k */
    private final C1644x f42494k = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C1644x f42495l = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C1644x f42496m = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C15709b f42497n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C15709b f42498o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public long f42499p = -1;

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.cancel.PackageCancelViewModel$ViewModel$a */
    static final class C14583a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C14583a f42500d = new C14583a();

        C14583a() {
            super(1);
        }

        public final void invoke(Throwable th) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.cancel.PackageCancelViewModel$ViewModel$b */
    static final class C14584b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PackageCancelViewModel$ViewModel f42501d;

        /* renamed from: ge.bog.mobilebank.categorypackages.presentation.cancel.PackageCancelViewModel$ViewModel$b$a */
        static final class C14585a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ PackageCancelViewModel$ViewModel f42502d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14585a(PackageCancelViewModel$ViewModel packageCancelViewModel$ViewModel) {
                super(1);
                this.f42502d = packageCancelViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo40968a(C41238w wVar) {
                this.f42502d.f42496m.mo4826r(new C31128a.C31130b(0, (Object) null, 3, (DefaultConstructorMarker) null));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo40968a((C41238w) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.categorypackages.presentation.cancel.PackageCancelViewModel$ViewModel$b$b */
        static final class C14586b extends C41537m implements C43079p {

            /* renamed from: d */
            final /* synthetic */ PackageCancelViewModel$ViewModel f42503d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14586b(PackageCancelViewModel$ViewModel packageCancelViewModel$ViewModel) {
                super(2);
                this.f42503d = packageCancelViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo40969a(Throwable th, C41238w wVar) {
                C41536l.m120489i(th, "error");
                this.f42503d.f42496m.mo4826r(new C31128a.C31129a(th, 0, (Object) null, 6, (DefaultConstructorMarker) null));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                mo40969a((Throwable) obj, (C41238w) obj2);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14584b(PackageCancelViewModel$ViewModel packageCancelViewModel$ViewModel) {
            super(1);
            this.f42501d = packageCancelViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo40967a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92646h(aVar, (int[]) null, new C14585a(this.f42501d), 1, (Object) null);
            C31132b.m92644f(aVar, (int[]) null, new C14586b(this.f42501d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40967a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.cancel.PackageCancelViewModel$ViewModel$c */
    static final class C14587c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PackageCancelViewModel$ViewModel f42504d;

        /* renamed from: ge.bog.mobilebank.categorypackages.presentation.cancel.PackageCancelViewModel$ViewModel$c$a */
        static final class C14588a extends C41537m implements C43079p {

            /* renamed from: d */
            final /* synthetic */ PackageCancelViewModel$ViewModel f42505d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14588a(PackageCancelViewModel$ViewModel packageCancelViewModel$ViewModel) {
                super(2);
                this.f42505d = packageCancelViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo40971a(Throwable th, List list) {
                C41536l.m120489i(th, "error");
                C37224b.m109965d(this.f42505d.f42495l, th);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                mo40971a((Throwable) obj, (List) obj2);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.categorypackages.presentation.cancel.PackageCancelViewModel$ViewModel$c$b */
        static final class C14589b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ PackageCancelViewModel$ViewModel f42506d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14589b(PackageCancelViewModel$ViewModel packageCancelViewModel$ViewModel) {
                super(1);
                this.f42506d = packageCancelViewModel$ViewModel;
            }

            /* JADX WARNING: Removed duplicated region for block: B:31:0x0070  */
            /* JADX WARNING: Removed duplicated region for block: B:32:0x0075  */
            /* JADX WARNING: Removed duplicated region for block: B:36:0x0089  */
            /* JADX WARNING: Removed duplicated region for block: B:48:0x00ba  */
            /* JADX WARNING: Removed duplicated region for block: B:58:0x00e5 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:59:0x00e6  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo40972a(java.util.List r10) {
                /*
                    r9 = this;
                    java.lang.String r0 = "packages"
                    kotlin.jvm.internal.C41536l.m120489i(r10, r0)
                    java.util.Iterator r0 = r10.iterator()
                L_0x0009:
                    boolean r1 = r0.hasNext()
                    r2 = 1
                    r3 = 0
                    r4 = 0
                    if (r1 == 0) goto L_0x0025
                    java.lang.Object r1 = r0.next()
                    r5 = r1
                    io.b r5 = (p469io.C15709b) r5
                    io.a r5 = r5.mo43078c()
                    if (r5 == 0) goto L_0x0021
                    r5 = r2
                    goto L_0x0022
                L_0x0021:
                    r5 = r3
                L_0x0022:
                    if (r5 == 0) goto L_0x0009
                    goto L_0x0026
                L_0x0025:
                    r1 = r4
                L_0x0026:
                    io.b r1 = (p469io.C15709b) r1
                    if (r1 != 0) goto L_0x002b
                    return
                L_0x002b:
                    java.util.Iterator r0 = r10.iterator()
                L_0x002f:
                    boolean r5 = r0.hasNext()
                    if (r5 == 0) goto L_0x0048
                    java.lang.Object r5 = r0.next()
                    r6 = r5
                    io.b r6 = (p469io.C15709b) r6
                    io.a r6 = r6.mo43095r()
                    if (r6 == 0) goto L_0x0044
                    r6 = r2
                    goto L_0x0045
                L_0x0044:
                    r6 = r3
                L_0x0045:
                    if (r6 == 0) goto L_0x002f
                    goto L_0x0049
                L_0x0048:
                    r5 = r4
                L_0x0049:
                    io.b r5 = (p469io.C15709b) r5
                    ge.bog.mobilebank.categorypackages.presentation.cancel.PackageCancelViewModel$ViewModel r0 = r9.f42506d
                    if (r5 == 0) goto L_0x005e
                    io.a r6 = r5.mo43095r()
                    if (r6 == 0) goto L_0x006d
                    long r6 = r6.mo43055b()
                    java.lang.Long r6 = java.lang.Long.valueOf(r6)
                    goto L_0x006e
                L_0x005e:
                    io.a r6 = r1.mo43078c()
                    if (r6 == 0) goto L_0x006d
                    long r6 = r6.mo43055b()
                    java.lang.Long r6 = java.lang.Long.valueOf(r6)
                    goto L_0x006e
                L_0x006d:
                    r6 = r4
                L_0x006e:
                    if (r6 == 0) goto L_0x0075
                    long r6 = r6.longValue()
                    goto L_0x0077
                L_0x0075:
                    r6 = -1
                L_0x0077:
                    r0.f42499p = r6
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    java.util.Iterator r10 = r10.iterator()
                L_0x0083:
                    boolean r6 = r10.hasNext()
                    if (r6 == 0) goto L_0x00af
                    java.lang.Object r6 = r10.next()
                    r7 = r6
                    io.b r7 = (p469io.C15709b) r7
                    boolean r8 = kotlin.jvm.internal.C41536l.m120484d(r7, r1)
                    if (r8 != 0) goto L_0x00a8
                    boolean r8 = kotlin.jvm.internal.C41536l.m120484d(r7, r5)
                    if (r8 != 0) goto L_0x00a8
                    int r7 = r7.mo43096s()
                    int r8 = r1.mo43096s()
                    if (r7 > r8) goto L_0x00a8
                    r7 = r2
                    goto L_0x00a9
                L_0x00a8:
                    r7 = r3
                L_0x00a9:
                    if (r7 == 0) goto L_0x0083
                    r0.add(r6)
                    goto L_0x0083
                L_0x00af:
                    java.util.Iterator r10 = r0.iterator()
                    boolean r0 = r10.hasNext()
                    if (r0 != 0) goto L_0x00ba
                    goto L_0x00e1
                L_0x00ba:
                    java.lang.Object r4 = r10.next()
                    boolean r0 = r10.hasNext()
                    if (r0 != 0) goto L_0x00c5
                    goto L_0x00e1
                L_0x00c5:
                    r0 = r4
                    io.b r0 = (p469io.C15709b) r0
                    int r0 = r0.mo43096s()
                L_0x00cc:
                    java.lang.Object r2 = r10.next()
                    r3 = r2
                    io.b r3 = (p469io.C15709b) r3
                    int r3 = r3.mo43096s()
                    if (r0 >= r3) goto L_0x00db
                    r4 = r2
                    r0 = r3
                L_0x00db:
                    boolean r2 = r10.hasNext()
                    if (r2 != 0) goto L_0x00cc
                L_0x00e1:
                    io.b r4 = (p469io.C15709b) r4
                    if (r4 != 0) goto L_0x00e6
                    return
                L_0x00e6:
                    ge.bog.mobilebank.categorypackages.presentation.cancel.PackageCancelViewModel$ViewModel r10 = r9.f42506d
                    r10.f42497n = r1
                    ge.bog.mobilebank.categorypackages.presentation.cancel.PackageCancelViewModel$ViewModel r10 = r9.f42506d
                    r10.f42498o = r4
                    ge.bog.mobilebank.categorypackages.presentation.cancel.PackageCancelViewModel$ViewModel r10 = r9.f42506d
                    androidx.lifecycle.x r10 = r10.f42493j
                    m41.C37224b.m109965d(r10, r4)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.categorypackages.presentation.cancel.PackageCancelViewModel$ViewModel.C14587c.C14589b.mo40972a(java.util.List):void");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo40972a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14587c(PackageCancelViewModel$ViewModel packageCancelViewModel$ViewModel) {
            super(1);
            this.f42504d = packageCancelViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo40970a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92644f(aVar, (int[]) null, new C14588a(this.f42504d), 1, (Object) null);
            C31132b.m92648j(aVar, (int[]) null, new C14589b(this.f42504d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40970a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PackageCancelViewModel$ViewModel(C15386k kVar, C15374b bVar, C36746r rVar, Client client) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(kVar, "getPackages");
        C41536l.m120489i(bVar, "cancelPackage");
        C41536l.m120489i(rVar, "updateUserInfoUseCase");
        C41536l.m120489i(client, "client");
        this.f42487d = kVar;
        this.f42488e = bVar;
        this.f42489f = rVar;
        this.f42490g = client;
        m53857vw();
    }

    /* access modifiers changed from: private */
    /* renamed from: qw */
    public static final void m53852qw(PackageCancelViewModel$ViewModel packageCancelViewModel$ViewModel) {
        C41536l.m120489i(packageCancelViewModel$ViewModel, "this$0");
        C40734b k = C40734b.m117920k(new C12414i(packageCancelViewModel$ViewModel));
        C41536l.m120488h(k, "create {\n               …it)\n                    }");
        C41205b G = C32343x.m95459j1(k).mo94888G(new C12415j(packageCancelViewModel$ViewModel), new C12416k(C14583a.f42500d));
        C41536l.m120488h(G, "create {\n               …                   }, {})");
        packageCancelViewModel$ViewModel.bindToLifecycle(G);
    }

    /* access modifiers changed from: private */
    /* renamed from: rw */
    public static final void m53853rw(PackageCancelViewModel$ViewModel packageCancelViewModel$ViewModel, C40736c cVar) {
        C41536l.m120489i(packageCancelViewModel$ViewModel, "this$0");
        C41536l.m120489i(cVar, "it");
        packageCancelViewModel$ViewModel.f42489f.mo89570a(cVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: sw */
    public static final void m53854sw(PackageCancelViewModel$ViewModel packageCancelViewModel$ViewModel) {
        C41536l.m120489i(packageCancelViewModel$ViewModel, "this$0");
        C1644x xVar = packageCancelViewModel$ViewModel.f42496m;
        PackageType packageTypeByBadge = PackageType.Companion.getPackageTypeByBadge(packageCancelViewModel$ViewModel.f42490g.getUserInfo().getPackageBadge());
        if (packageTypeByBadge == null) {
            packageTypeByBadge = PackageType.NO_ACTIVE_PACKAGE;
        }
        xVar.mo4826r(new C31128a.C31131c(packageTypeByBadge, 0, 2, (DefaultConstructorMarker) null));
    }

    /* access modifiers changed from: private */
    /* renamed from: tw */
    public static final void m53855tw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: uw */
    public static final void m53856uw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: vw */
    private final void m53857vw() {
        C41205b F0 = C32343x.m95413R0(C32343x.m95453h1(C31270e.m92880i(C15386k.m55854b(this.f42487d, (String) null, false, 3, (Object) null), 1))).mo94981F0(new C12413h(new C14587c(this)));
        C41536l.m120488h(F0, "private fun fetchPackage…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: ww */
    public static final void m53858ww(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: N8 */
    public LiveData mo33013N8() {
        return this.f42493j;
    }

    /* renamed from: bj */
    public LiveData mo33014bj() {
        return this.f42494k;
    }

    /* renamed from: pw */
    public void mo40963pw() {
        C40734b o = C32343x.m95411Q0(C32343x.m95450g1(C15374b.m55843b(this.f42488e, this.f42499p, (String) null, 2, (Object) null))).mo94902o(new C12411f(this));
        C41536l.m120488h(o, "cancelPackage(packageCan…cycle()\n                }");
        C41205b F0 = C31270e.m92878g(o, -1).mo94981F0(new C12412g(new C14584b(this)));
        C41536l.m120488h(F0, "override fun cancelPress…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* renamed from: vl */
    public LiveData mo33015vl() {
        return this.f42496m;
    }

    /* renamed from: wj */
    public LiveData mo33016wj() {
        return this.f42495l;
    }

    /* renamed from: xw */
    public final C12410e mo40964xw() {
        return this.f42492i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00e2  */
    /* renamed from: yw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo40965yw() {
        /*
            r33 = this;
            r0 = r33
            io.b r1 = r0.f42498o
            if (r1 == 0) goto L_0x010a
            io.b r2 = r0.f42497n
            if (r2 != 0) goto L_0x000c
            goto L_0x010a
        L_0x000c:
            r8 = 0
            if (r1 == 0) goto L_0x001b
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 14
            r7 = 0
            pp.b$b r1 = p568pp.C17475c.m60979i(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x001c
        L_0x001b:
            r1 = r8
        L_0x001c:
            androidx.lifecycle.x r2 = r0.f42494k
            io.b r3 = r0.f42497n
            java.lang.String r4 = ""
            if (r3 == 0) goto L_0x002d
            java.lang.String r3 = r3.mo43093p()
            if (r3 != 0) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            r10 = r3
            goto L_0x002e
        L_0x002d:
            r10 = r4
        L_0x002e:
            io.b r3 = r0.f42497n
            if (r3 == 0) goto L_0x003b
            java.lang.String r3 = r3.mo43083g()
            if (r3 != 0) goto L_0x0039
            goto L_0x003b
        L_0x0039:
            r12 = r3
            goto L_0x003c
        L_0x003b:
            r12 = r4
        L_0x003c:
            if (r1 == 0) goto L_0x0047
            java.lang.String r3 = r1.mo44996j()
            if (r3 != 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r11 = r3
            goto L_0x0048
        L_0x0047:
            r11 = r4
        L_0x0048:
            if (r1 == 0) goto L_0x0053
            java.lang.String r3 = r1.mo44988d()
            if (r3 != 0) goto L_0x0051
            goto L_0x0053
        L_0x0051:
            r13 = r3
            goto L_0x0054
        L_0x0053:
            r13 = r4
        L_0x0054:
            if (r1 == 0) goto L_0x0060
            java.lang.String r3 = r1.mo44997k()
            if (r3 != 0) goto L_0x005d
            goto L_0x0060
        L_0x005d:
            r17 = r3
            goto L_0x0062
        L_0x0060:
            r17 = r4
        L_0x0062:
            io.b r3 = r0.f42497n
            if (r3 == 0) goto L_0x0070
            int r3 = r3.mo43096s()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r14 = r3
            goto L_0x0071
        L_0x0070:
            r14 = r8
        L_0x0071:
            if (r1 == 0) goto L_0x007e
            java.lang.Integer r3 = r1.mo44998l()
            if (r3 == 0) goto L_0x007e
            int r3 = r3.intValue()
            goto L_0x007f
        L_0x007e:
            r3 = -1
        L_0x007f:
            r15 = r3
            io.b r3 = r0.f42497n
            if (r3 == 0) goto L_0x0094
            io.a r3 = r3.mo43078c()
            if (r3 == 0) goto L_0x0094
            java.lang.Long r3 = r3.mo43060f()
            if (r3 != 0) goto L_0x0091
            goto L_0x0094
        L_0x0091:
            r16 = r3
            goto L_0x00a5
        L_0x0094:
            io.b r3 = r0.f42497n
            if (r3 == 0) goto L_0x00a3
            io.a r3 = r3.mo43078c()
            if (r3 == 0) goto L_0x00a3
            java.lang.Long r3 = r3.mo43069n()
            goto L_0x0091
        L_0x00a3:
            r16 = r8
        L_0x00a5:
            if (r1 == 0) goto L_0x00b1
            java.lang.String r1 = r1.mo44995i()
            if (r1 != 0) goto L_0x00ae
            goto L_0x00b1
        L_0x00ae:
            r18 = r1
            goto L_0x00b3
        L_0x00b1:
            r18 = r4
        L_0x00b3:
            io.b r1 = r0.f42497n
            if (r1 == 0) goto L_0x00dc
            java.lang.Double r1 = r1.mo43089l()
            if (r1 == 0) goto L_0x00dc
            double r19 = r1.doubleValue()
            io.b r1 = r0.f42497n
            if (r1 == 0) goto L_0x00cb
            java.lang.String r1 = r1.mo43090m()
            if (r1 != 0) goto L_0x00cd
        L_0x00cb:
            java.lang.String r1 = "GEL"
        L_0x00cd:
            r21 = r1
            r22 = 0
            r23 = 2
            r24 = 0
            java.lang.String r1 = g91.C32343x.m95410Q(r19, r21, r22, r23, r24)
            r19 = r1
            goto L_0x00de
        L_0x00dc:
            r19 = r8
        L_0x00de:
            io.b r1 = r0.f42497n
            if (r1 == 0) goto L_0x00e6
            java.lang.String r8 = r1.mo43087j()
        L_0x00e6:
            r20 = r8
            ge.bog.mobilebank.categorypackages.presentation.application.shared.model.SoloApplicationFormData r1 = new ge.bog.mobilebank.categorypackages.presentation.application.shared.model.SoloApplicationFormData
            r9 = r1
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 2095104(0x1ff800, float:2.935866E-39)
            r32 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            m41.C37224b.m109965d(r2, r1)
        L_0x010a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.categorypackages.presentation.cancel.PackageCancelViewModel$ViewModel.mo40965yw():void");
    }
}
