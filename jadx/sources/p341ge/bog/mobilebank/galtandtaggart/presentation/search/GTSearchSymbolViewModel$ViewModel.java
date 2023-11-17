package p341ge.bog.mobilebank.galtandtaggart.presentation.search;

import android.graphics.Bitmap;
import androidx.lifecycle.C1607m0;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40767b;
import g91.C32343x;
import gd1.C40992a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41232r;
import he1.C41238w;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jg0.C25438a;
import jg0.C25439b;
import jg0.C25440c;
import jg0.C25441d;
import jg0.C25442e;
import jg0.C25443f;
import jg0.C25444g;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o31.C37600h;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import ue1.C43075l;
import we0.C29323b;
import we0.C29328d0;
import we0.C29365w;
import xe0.C29759q;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.search.GTSearchSymbolViewModel$ViewModel */
public final class GTSearchSymbolViewModel$ViewModel extends C21481a implements C37600h.C37601a, C23753a, C23755b {

    /* renamed from: d */
    private final C29328d0 f61769d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C29323b f61770e;

    /* renamed from: f */
    private final C23753a f61771f = this;

    /* renamed from: g */
    private final C23755b f61772g = this;

    /* renamed from: h */
    private final C1644x f61773h = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C1644x f61774i;

    /* renamed from: j */
    private final LiveData f61775j;

    /* renamed from: k */
    private String f61776k;

    /* renamed from: l */
    private final C40767b f61777l;

    /* renamed from: m */
    private final C1644x f61778m;

    /* renamed from: n */
    private final C40767b f61779n;

    /* renamed from: o */
    private final C40767b f61780o;

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.search.GTSearchSymbolViewModel$ViewModel$a */
    static final class C23714a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C23714a f61781d = new C23714a();

        C23714a() {
            super(1);
        }

        /* renamed from: a */
        public final C41232r invoke(C41224m mVar) {
            C41536l.m120489i(mVar, "it");
            return new C41232r(mVar.mo95678e(), mVar.mo95680f(), 1);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.search.GTSearchSymbolViewModel$ViewModel$b */
    static final class C23715b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29365w f61782d;

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.search.GTSearchSymbolViewModel$ViewModel$b$a */
        static final class C23716a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ int f61783d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23716a(int i) {
                super(1);
                this.f61783d = i;
            }

            /* renamed from: a */
            public final C41224m invoke(C31128a aVar) {
                C41536l.m120489i(aVar, "it");
                return new C41224m(aVar, Integer.valueOf(this.f61783d));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23715b(C29365w wVar) {
            super(1);
            this.f61782d = wVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C41224m m76632c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C41224m) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(C41232r rVar) {
            C41536l.m120489i(rVar, "<name for destructuring parameter 0>");
            int intValue = ((Number) rVar.mo95689b()).intValue();
            int intValue2 = ((Number) rVar.mo95690c()).intValue();
            C40749p O = this.f61782d.mo69213a((String) rVar.mo95688a(), intValue * 25, 25).mo95075O();
            C41536l.m120488h(O, "searchSymbolUseCase(sear…          .toObservable()");
            return C31270e.m92879h(O, intValue2).mo95026k0(new C23756c(new C23716a(intValue)));
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.search.GTSearchSymbolViewModel$ViewModel$c */
    static final class C23717c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTSearchSymbolViewModel$ViewModel f61784d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23717c(GTSearchSymbolViewModel$ViewModel gTSearchSymbolViewModel$ViewModel) {
            super(1);
            this.f61784d = gTSearchSymbolViewModel$ViewModel;
        }

        /* JADX WARNING: type inference failed for: r5v3, types: [b41.a$b] */
        /* JADX WARNING: type inference failed for: r5v7, types: [b41.a$c] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00f7  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x010d  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo60626a(he1.C41224m r18) {
            /*
                r17 = this;
                java.lang.Object r0 = r18.mo95675a()
                r1 = r0
                b41.a r1 = (b41.C31128a) r1
                java.lang.Object r0 = r18.mo95676b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r2 = r0.intValue()
                java.lang.String r0 = "result"
                kotlin.jvm.internal.C41536l.m120488h(r1, r0)
                r3 = 0
                java.lang.Object r0 = b41.C31132b.m92649k(r1, r3)
                java.util.List r0 = (java.util.List) r0
                if (r0 == 0) goto L_0x006d
                java.util.ArrayList r4 = new java.util.ArrayList
                r5 = 10
                int r5 = ie1.C41343r.m119925u(r0, r5)
                r4.<init>(r5)
                java.util.Iterator r0 = r0.iterator()
            L_0x002e:
                boolean r5 = r0.hasNext()
                if (r5 == 0) goto L_0x006e
                java.lang.Object r5 = r0.next()
                xe0.j r5 = (xe0.C29752j) r5
                ge.bog.mobilebank.galtandtaggart.presentation.search.GTSearchSymbolViewModel$ViewModel$e$b r15 = new ge.bog.mobilebank.galtandtaggart.presentation.search.GTSearchSymbolViewModel$ViewModel$e$b
                java.lang.String r7 = r5.mo69818f()
                java.lang.String r8 = r5.mo69812a()
                java.lang.String r9 = r5.mo69816e()
                java.math.BigDecimal r6 = r5.mo69815d()
                java.lang.String r10 = ug0.C28786c.m88250f(r6)
                java.util.List r6 = r5.mo69814c()
                java.util.List r11 = ie1.C41358y.m119991B0(r6)
                r12 = 0
                r13 = 0
                java.lang.String r14 = r5.mo69813b()
                r5 = 96
                r16 = 0
                r6 = r15
                r3 = r15
                r15 = r5
                r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                r4.add(r3)
                r3 = 0
                goto L_0x002e
            L_0x006d:
                r4 = 0
            L_0x006e:
                if (r4 != 0) goto L_0x0074
                java.util.List r4 = ie1.C41341q.m119907j()
            L_0x0074:
                boolean r0 = r1 instanceof b41.C31128a.C31131c     // Catch:{ all -> 0x00d7 }
                if (r0 == 0) goto L_0x00a3
                r0 = r1
                b41.a$c r0 = (b41.C31128a.C31131c) r0     // Catch:{ all -> 0x009f }
                java.lang.Object r0 = r0.mo71340a()     // Catch:{ all -> 0x009f }
                java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x009f }
                ge.bog.mobilebank.galtandtaggart.presentation.search.GTSearchSymbolViewModel$ViewModel$f r3 = new ge.bog.mobilebank.galtandtaggart.presentation.search.GTSearchSymbolViewModel$ViewModel$f     // Catch:{ all -> 0x009f }
                boolean r5 = r0.isEmpty()     // Catch:{ all -> 0x009f }
                int r0 = r0.size()     // Catch:{ all -> 0x009f }
                r6 = 25
                if (r0 != r6) goto L_0x0091
                r0 = 1
                goto L_0x0092
            L_0x0091:
                r0 = 0
            L_0x0092:
                r3.<init>(r5, r0)     // Catch:{ all -> 0x009f }
                int r0 = r1.mo71341b()     // Catch:{ all -> 0x009f }
                b41.a$c r5 = new b41.a$c     // Catch:{ all -> 0x009f }
                r5.<init>(r3, r0)     // Catch:{ all -> 0x009f }
                goto L_0x00bc
            L_0x009f:
                r0 = move-exception
                r8 = r0
                r6 = 0
                goto L_0x00da
            L_0x00a3:
                boolean r0 = r1 instanceof b41.C31128a.C31129a     // Catch:{ all -> 0x00d7 }
                if (r0 == 0) goto L_0x00be
                b41.a$a r0 = new b41.a$a     // Catch:{ all -> 0x009f }
                r3 = r1
                b41.a$a r3 = (b41.C31128a.C31129a) r3     // Catch:{ all -> 0x009f }
                java.lang.Throwable r6 = r3.mo71342c()     // Catch:{ all -> 0x009f }
                int r7 = r1.mo71341b()     // Catch:{ all -> 0x009f }
                r8 = 0
                r9 = 4
                r10 = 0
                r5 = r0
                r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x009f }
                r5 = r0
            L_0x00bc:
                r6 = 0
                goto L_0x00e7
            L_0x00be:
                boolean r0 = r1 instanceof b41.C31128a.C31130b     // Catch:{ all -> 0x00d7 }
                if (r0 == 0) goto L_0x00ce
                b41.a$b r5 = new b41.a$b     // Catch:{ all -> 0x00d7 }
                int r0 = r1.mo71341b()     // Catch:{ all -> 0x00d7 }
                r3 = 2
                r6 = 0
                r5.<init>(r0, r6, r3, r6)     // Catch:{ all -> 0x00d5 }
                goto L_0x00e7
            L_0x00ce:
                r6 = 0
                kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00d5 }
                r0.<init>()     // Catch:{ all -> 0x00d5 }
                throw r0     // Catch:{ all -> 0x00d5 }
            L_0x00d5:
                r0 = move-exception
                goto L_0x00d9
            L_0x00d7:
                r0 = move-exception
                r6 = 0
            L_0x00d9:
                r8 = r0
            L_0x00da:
                b41.a$a r5 = new b41.a$a
                int r9 = r1.mo71341b()
                r10 = 0
                r11 = 4
                r12 = 0
                r7 = r5
                r7.<init>(r8, r9, r10, r11, r12)
            L_0x00e7:
                r1 = r17
                ge.bog.mobilebank.galtandtaggart.presentation.search.GTSearchSymbolViewModel$ViewModel r0 = r1.f61784d
                androidx.lifecycle.x r0 = r0.f61774i
                java.lang.Object r3 = r0.mo4814f()
                ge.bog.mobilebank.galtandtaggart.presentation.search.GTSearchSymbolViewModel$ViewModel$g r3 = (p341ge.bog.mobilebank.galtandtaggart.presentation.search.GTSearchSymbolViewModel$ViewModel.C23725g) r3
                if (r3 == 0) goto L_0x010d
                he1.m r6 = new he1.m
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r6.<init>(r2, r5)
                java.util.List r2 = r3.mo60646c()
                java.util.List r2 = ie1.C41358y.m120023m0(r2, r4)
                ge.bog.mobilebank.galtandtaggart.presentation.search.GTSearchSymbolViewModel$ViewModel$g r3 = r3.mo60644a(r6, r2)
                goto L_0x010e
            L_0x010d:
                r3 = r6
            L_0x010e:
                r0.mo4826r(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.galtandtaggart.presentation.search.GTSearchSymbolViewModel$ViewModel.C23717c.mo60626a(he1.m):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60626a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.search.GTSearchSymbolViewModel$ViewModel$d */
    static final class C23718d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTSearchSymbolViewModel$ViewModel f61785d;

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.search.GTSearchSymbolViewModel$ViewModel$d$a */
        static final class C23719a extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C23719a f61786d = new C23719a();

            C23719a() {
                super(1);
            }

            /* renamed from: a */
            public final C31128a invoke(Throwable th) {
                C41536l.m120489i(th, "throwable");
                return new C31128a.C31129a(th, 0, (Object) null, 6, (DefaultConstructorMarker) null);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23718d(GTSearchSymbolViewModel$ViewModel gTSearchSymbolViewModel$ViewModel) {
            super(1);
            this.f61785d = gTSearchSymbolViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C31128a m76637c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C31128a) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(C41232r rVar) {
            C41536l.m120489i(rVar, "<name for destructuring parameter 0>");
            return this.f61785d.f61770e.mo69179a((String) rVar.mo95688a(), (List) rVar.mo95689b(), (List) rVar.mo95690c()).mo94893M(new C31128a.C31131c(C41238w.f97225a, 0, 2, (DefaultConstructorMarker) null)).mo95075O().mo94977D0(new C31128a.C31130b(0, (Object) null, 3, (DefaultConstructorMarker) null)).mo95035t0(new C23757d(C23719a.f61786d));
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.search.GTSearchSymbolViewModel$ViewModel$e */
    public static abstract class C23720e {

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.search.GTSearchSymbolViewModel$ViewModel$e$a */
        public static final class C23721a extends C23720e {

            /* renamed from: a */
            public static final C23721a f61787a = new C23721a();

            private C23721a() {
                super((DefaultConstructorMarker) null);
            }
        }

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.search.GTSearchSymbolViewModel$ViewModel$e$b */
        public static final class C23722b extends C23720e {

            /* renamed from: a */
            private final String f61788a;

            /* renamed from: b */
            private final String f61789b;

            /* renamed from: c */
            private final String f61790c;

            /* renamed from: d */
            private final String f61791d;

            /* renamed from: e */
            private List f61792e;

            /* renamed from: f */
            private C31128a f61793f;

            /* renamed from: g */
            private Bitmap f61794g;

            /* renamed from: h */
            private final String f61795h;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public /* synthetic */ C23722b(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.util.List r17, b41.C31128a r18, android.graphics.Bitmap r19, java.lang.String r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
                /*
                    r12 = this;
                    r0 = r21
                    r1 = r0 & 32
                    r2 = 0
                    if (r1 == 0) goto L_0x0009
                    r9 = r2
                    goto L_0x000b
                L_0x0009:
                    r9 = r18
                L_0x000b:
                    r1 = r0 & 64
                    if (r1 == 0) goto L_0x0011
                    r10 = r2
                    goto L_0x0013
                L_0x0011:
                    r10 = r19
                L_0x0013:
                    r0 = r0 & 128(0x80, float:1.794E-43)
                    if (r0 == 0) goto L_0x0019
                    r11 = r2
                    goto L_0x001b
                L_0x0019:
                    r11 = r20
                L_0x001b:
                    r3 = r12
                    r4 = r13
                    r5 = r14
                    r6 = r15
                    r7 = r16
                    r8 = r17
                    r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.galtandtaggart.presentation.search.GTSearchSymbolViewModel$ViewModel.C23720e.C23722b.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, b41.a, android.graphics.Bitmap, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }

            /* renamed from: a */
            public final String mo60629a() {
                return this.f61790c;
            }

            /* renamed from: b */
            public final Bitmap mo60630b() {
                return this.f61794g;
            }

            /* renamed from: c */
            public final String mo60631c() {
                return this.f61795h;
            }

            /* renamed from: d */
            public final String mo60632d() {
                return this.f61789b;
            }

            /* renamed from: e */
            public final String mo60633e() {
                return this.f61788a;
            }

            /* renamed from: f */
            public final List mo60634f() {
                return this.f61792e;
            }

            /* renamed from: g */
            public final String mo60635g() {
                return this.f61791d;
            }

            /* renamed from: h */
            public final C31128a mo60636h() {
                return this.f61793f;
            }

            /* renamed from: i */
            public final void mo60637i(Bitmap bitmap) {
                this.f61794g = bitmap;
            }

            /* renamed from: j */
            public final void mo60638j(C31128a aVar) {
                this.f61793f = aVar;
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C23722b(String str, String str2, String str3, String str4, List list, C31128a aVar, Bitmap bitmap, String str5) {
                super((DefaultConstructorMarker) null);
                C41536l.m120489i(str, "itemTitle");
                C41536l.m120489i(str2, "itemDesc");
                C41536l.m120489i(str3, "amount");
                C41536l.m120489i(str4, "percentage");
                C41536l.m120489i(list, "myWatchListIds");
                this.f61788a = str;
                this.f61789b = str2;
                this.f61790c = str3;
                this.f61791d = str4;
                this.f61792e = list;
                this.f61793f = aVar;
                this.f61794g = bitmap;
                this.f61795h = str5;
            }
        }

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.search.GTSearchSymbolViewModel$ViewModel$e$c */
        public static final class C23723c extends C23720e {

            /* renamed from: a */
            public static final C23723c f61796a = new C23723c();

            private C23723c() {
                super((DefaultConstructorMarker) null);
            }
        }

        private C23720e() {
        }

        public /* synthetic */ C23720e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.search.GTSearchSymbolViewModel$ViewModel$f */
    private static final class C23724f {

        /* renamed from: a */
        private final boolean f61797a;

        /* renamed from: b */
        private final boolean f61798b;

        public C23724f(boolean z, boolean z2) {
            this.f61797a = z;
            this.f61798b = z2;
        }

        /* renamed from: a */
        public final boolean mo60639a() {
            return this.f61798b;
        }

        /* renamed from: b */
        public final boolean mo60640b() {
            return this.f61797a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C23724f)) {
                return false;
            }
            C23724f fVar = (C23724f) obj;
            return this.f61797a == fVar.f61797a && this.f61798b == fVar.f61798b;
        }

        public int hashCode() {
            boolean z = this.f61797a;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            boolean z3 = this.f61798b;
            if (!z3) {
                z2 = z3;
            }
            return i + (z2 ? 1 : 0);
        }

        public String toString() {
            boolean z = this.f61797a;
            boolean z2 = this.f61798b;
            return "PagingResult(isEmpty=" + z + ", hasMorePages=" + z2 + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.search.GTSearchSymbolViewModel$ViewModel$h */
    public /* synthetic */ class C23726h {

        /* renamed from: a */
        public static final /* synthetic */ int[] f61801a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                xe0.q[] r0 = xe0.C29759q.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                xe0.q r1 = xe0.C29759q.TO_ADD     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                xe0.q r1 = xe0.C29759q.TO_REMOVE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f61801a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.galtandtaggart.presentation.search.GTSearchSymbolViewModel$ViewModel.C23726h.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.search.GTSearchSymbolViewModel$ViewModel$i */
    static final class C23727i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ List f61802d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23727i(List list) {
            super(1);
            this.f61802d = list;
        }

        /* renamed from: a */
        public final void mo60650a(C23724f fVar) {
            C41536l.m120489i(fVar, "data");
            if (fVar.mo60640b()) {
                this.f61802d.add(C23720e.C23721a.f61787a);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60650a((C23724f) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.search.GTSearchSymbolViewModel$ViewModel$j */
    static final class C23728j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ List f61803d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23728j(List list) {
            super(1);
            this.f61803d = list;
        }

        /* renamed from: a */
        public final void mo60651a(C23724f fVar) {
            this.f61803d.add(C23720e.C23723c.f61796a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60651a((C23724f) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.search.GTSearchSymbolViewModel$ViewModel$k */
    static final class C23729k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ String f61804d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23729k(String str) {
            super(1);
            this.f61804d = str;
        }

        /* renamed from: a */
        public final C41224m invoke(List list) {
            C41536l.m120489i(list, "it");
            return new C41224m(this.f61804d, new C31128a.C31131c(list, 0, 2, (DefaultConstructorMarker) null));
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.search.GTSearchSymbolViewModel$ViewModel$l */
    static final class C23730l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ String f61805d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23730l(String str) {
            super(1);
            this.f61805d = str;
        }

        /* renamed from: a */
        public final C41224m invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            return new C41224m(this.f61805d, new C31128a.C31129a(th, 0, (Object) null, 6, (DefaultConstructorMarker) null));
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.search.GTSearchSymbolViewModel$ViewModel$m */
    static final class C23731m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTSearchSymbolViewModel$ViewModel f61806d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23731m(GTSearchSymbolViewModel$ViewModel gTSearchSymbolViewModel$ViewModel) {
            super(1);
            this.f61806d = gTSearchSymbolViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo60654a(C41224m mVar) {
            C1644x zw = this.f61806d.mo60612J2();
            GTSearchSymbolViewModel$ViewModel gTSearchSymbolViewModel$ViewModel = this.f61806d;
            synchronized (zw) {
                gTSearchSymbolViewModel$ViewModel.mo60612J2().mo4826r(mVar);
                C41238w wVar = C41238w.f97225a;
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60654a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.search.GTSearchSymbolViewModel$ViewModel$n */
    static final class C23732n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTSearchSymbolViewModel$ViewModel f61807d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23732n(GTSearchSymbolViewModel$ViewModel gTSearchSymbolViewModel$ViewModel) {
            super(1);
            this.f61807d = gTSearchSymbolViewModel$ViewModel;
        }

        /* renamed from: a */
        public final List invoke(C23725g gVar) {
            GTSearchSymbolViewModel$ViewModel gTSearchSymbolViewModel$ViewModel = this.f61807d;
            C41536l.m120488h(gVar, "it");
            return gTSearchSymbolViewModel$ViewModel.m76612rw(gVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GTSearchSymbolViewModel$ViewModel(C29365w wVar, C29328d0 d0Var, C29323b bVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(wVar, "searchSymbolUseCase");
        C41536l.m120489i(d0Var, "getSymbolHistoryUseCase");
        C41536l.m120489i(bVar, "changeSymbolWatchListsUseCase");
        this.f61769d = d0Var;
        this.f61770e = bVar;
        C1644x xVar = new C1644x(new C23725g((C41224m) null, (List) null, 3, (DefaultConstructorMarker) null));
        this.f61774i = xVar;
        this.f61775j = C1607m0.m5655c(xVar, new C23732n(this));
        this.f61776k = "";
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Triple<String, Li…al>, List<BigDecimal>>>()");
        this.f61777l = h1;
        this.f61778m = new C1644x();
        C40767b h12 = C40767b.m118210h1();
        C41536l.m120488h(h12, "create<Pair<String, Int>>()");
        this.f61779n = h12;
        C40767b h13 = C40767b.m118210h1();
        C41536l.m120488h(h13, "create<String>()");
        this.f61780o = h13;
        C41205b F0 = h12.mo95026k0(new C25438a(C23714a.f61781d)).mo94989L0(new C25439b(new C23715b(wVar))).mo95027o0(C40992a.m118827a()).mo94981F0(new C25440c(new C23717c(this)));
        C41536l.m120488h(F0, "onLoadMoreSubject.map { …      }\n                }");
        bindToLifecycle(F0);
        C40749p L0 = h1.mo94989L0(new C25441d(new C23718d(this)));
        C41536l.m120488h(L0, "changeSymbolWatchListsSu…          }\n            }");
        bindToLifecycle(C31270e.m92876e(C32343x.m95413R0(L0), mo60614U()));
    }

    /* access modifiers changed from: private */
    /* renamed from: kw */
    public static final C41232r m76605kw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C41232r) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: lw */
    public static final C40754t m76606lw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: mw */
    public static final void m76607mw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: nw */
    public static final C40754t m76608nw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: rw */
    public final List m76612rw(C23725g gVar) {
        C31128a aVar;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(gVar.mo60646c());
        C41224m b = gVar.mo60645b();
        if (!(b == null || (aVar = (C31128a) b.mo95680f()) == null)) {
            C31132b.m92647i(aVar, new int[]{1, 6}, new C23727i(arrayList));
            C31132b.m92646h(aVar, (int[]) null, new C23728j(arrayList), 1, (Object) null);
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: ww */
    public static final C41224m m76613ww(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C41224m) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: xw */
    public static final C41224m m76614xw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C41224m) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: yw */
    public static final void m76615yw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Aw */
    public final void mo60609Aw(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.f61776k = str;
    }

    /* renamed from: Bw */
    public final boolean mo60610Bw(List list, BigDecimal bigDecimal) {
        C41536l.m120489i(list, "myWatchListIds");
        if (bigDecimal == null) {
            return false;
        }
        return list.contains(bigDecimal);
    }

    /* renamed from: C9 */
    public boolean mo60611C9() {
        C41224m b;
        C31128a aVar;
        C23724f fVar;
        C23725g gVar = (C23725g) this.f61774i.mo4814f();
        if (gVar == null || (b = gVar.mo60645b()) == null || (aVar = (C31128a) b.mo95680f()) == null || (fVar = (C23724f) C31132b.m92649k(aVar, (Object) null)) == null) {
            return false;
        }
        return fVar.mo60639a();
    }

    /* renamed from: Sf */
    public LiveData mo60613Sf() {
        return this.f61775j;
    }

    /* renamed from: Zt */
    public void mo60615Zt(String str, boolean z) {
        C41224m b;
        C41536l.m120489i(str, "searchText");
        C41238w wVar = null;
        if (z) {
            this.f61774i.mo4826r(new C23725g((C41224m) null, (List) null, 3, (DefaultConstructorMarker) null));
        }
        C23725g gVar = (C23725g) this.f61774i.mo4814f();
        if (!(gVar == null || (b = gVar.mo60645b()) == null)) {
            int intValue = ((Number) b.mo95675a()).intValue();
            C31128a aVar = (C31128a) b.mo95676b();
            if (aVar instanceof C31128a.C31131c) {
                this.f61779n.onNext(new C41224m(str, Integer.valueOf(intValue + 1)));
            } else if (aVar instanceof C31128a.C31129a) {
                this.f61779n.onNext(new C41224m(str, Integer.valueOf(intValue)));
            }
            wVar = C41238w.f97225a;
        }
        if (wVar == null) {
            this.f61779n.onNext(new C41224m(str, 0));
        }
    }

    /* renamed from: a8 */
    public void mo60616a8(BigDecimal bigDecimal, String str, C29759q qVar) {
        C41536l.m120489i(bigDecimal, "watchListId");
        C41536l.m120489i(str, "symbol");
        C41536l.m120489i(qVar, "state");
        int i = C23726h.f61801a[qVar.ordinal()];
        if (i == 1) {
            this.f61777l.onNext(new C41232r(str, C41341q.m119907j(), C41339p.m119900e(bigDecimal)));
        } else if (i == 2) {
            this.f61777l.onNext(new C41232r(str, C41339p.m119900e(bigDecimal), C41341q.m119907j()));
        }
    }

    /* renamed from: sw */
    public C1644x mo60614U() {
        return this.f61778m;
    }

    /* renamed from: tw */
    public final String mo60618tw() {
        return this.f61776k;
    }

    /* renamed from: uw */
    public final C23753a mo60619uw() {
        return this.f61771f;
    }

    /* renamed from: vw */
    public final C23755b mo60620vw() {
        return this.f61772g;
    }

    /* renamed from: xt */
    public void mo60621xt(String str) {
        C41536l.m120489i(str, "symbol");
        C41205b F0 = this.f61769d.mo69184a(str, (String) null, (String) null, 1, 1).mo95075O().mo95026k0(new C25442e(new C23729k(str))).mo95035t0(new C25443f(new C23730l(str))).mo94977D0(new C41224m(str, new C31128a.C31130b(0, (Object) null, 3, (DefaultConstructorMarker) null))).mo95027o0(C40992a.m118827a()).mo94981F0(new C25444g(new C23731m(this)));
        C41536l.m120488h(F0, "override fun getSymbolHi…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* renamed from: zw */
    public C1644x mo60612J2() {
        return this.f61773h;
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.search.GTSearchSymbolViewModel$ViewModel$g */
    private static final class C23725g {

        /* renamed from: a */
        private final C41224m f61799a;

        /* renamed from: b */
        private final List f61800b;

        public C23725g(C41224m mVar, List list) {
            C41536l.m120489i(list, "loadedHistory");
            this.f61799a = mVar;
            this.f61800b = list;
        }

        /* renamed from: a */
        public final C23725g mo60644a(C41224m mVar, List list) {
            C41536l.m120489i(list, "loadedHistory");
            return new C23725g(mVar, list);
        }

        /* renamed from: b */
        public final C41224m mo60645b() {
            return this.f61799a;
        }

        /* renamed from: c */
        public final List mo60646c() {
            return this.f61800b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C23725g)) {
                return false;
            }
            C23725g gVar = (C23725g) obj;
            return C41536l.m120484d(this.f61799a, gVar.f61799a) && C41536l.m120484d(this.f61800b, gVar.f61800b);
        }

        public int hashCode() {
            C41224m mVar = this.f61799a;
            return ((mVar == null ? 0 : mVar.hashCode()) * 31) + this.f61800b.hashCode();
        }

        public String toString() {
            C41224m mVar = this.f61799a;
            List list = this.f61800b;
            return "ViewState(lastPageResult=" + mVar + ", loadedHistory=" + list + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C23725g(C41224m mVar, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : mVar, (i & 2) != 0 ? C41341q.m119907j() : list);
        }
    }
}
