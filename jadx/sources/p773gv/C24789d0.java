package p773gv;

import ed1.C40735b0;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p783hv.C25071c;
import p881ru.C28106n;
import p891su.C28261a;
import ue1.C43075l;

/* renamed from: gv.d0 */
public final class C24789d0 {

    /* renamed from: a */
    private final C28106n f63697a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C24827t f63698b;

    /* renamed from: gv.d0$a */
    static final class C24790a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ String f63699d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24790a(String str) {
            super(1);
            this.f63699d = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0067, code lost:
            if ((r3 != null && cf1.C40440x.m117135K(r3, r0, true)) != false) goto L_0x0069;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.List invoke(java.util.List r8) {
            /*
                r7 = this;
                java.lang.String r0 = "contactList"
                kotlin.jvm.internal.C41536l.m120489i(r8, r0)
                java.lang.String r0 = r7.f63699d
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Iterator r8 = r8.iterator()
            L_0x0010:
                boolean r2 = r8.hasNext()
                if (r2 == 0) goto L_0x0070
                java.lang.Object r2 = r8.next()
                r3 = r2
                su.a r3 = (p891su.C28261a) r3
                boolean r4 = r3.mo67847e()
                r5 = 0
                if (r4 == 0) goto L_0x006a
                java.lang.String r4 = r3.mo67853i()
                r6 = 1
                if (r4 == 0) goto L_0x0033
                boolean r4 = cf1.C40440x.m117135K(r4, r0, r6)
                if (r4 != r6) goto L_0x0033
                r4 = r6
                goto L_0x0034
            L_0x0033:
                r4 = r5
            L_0x0034:
                if (r4 != 0) goto L_0x0069
                java.lang.String r4 = r3.mo67858n()
                if (r4 == 0) goto L_0x0044
                boolean r4 = cf1.C40440x.m117135K(r4, r0, r6)
                if (r4 != r6) goto L_0x0044
                r4 = r6
                goto L_0x0045
            L_0x0044:
                r4 = r5
            L_0x0045:
                if (r4 != 0) goto L_0x0069
                java.lang.String r4 = r3.mo67854j()
                if (r4 == 0) goto L_0x0055
                boolean r4 = cf1.C40440x.m117135K(r4, r0, r6)
                if (r4 != r6) goto L_0x0055
                r4 = r6
                goto L_0x0056
            L_0x0055:
                r4 = r5
            L_0x0056:
                if (r4 != 0) goto L_0x0069
                java.lang.String r3 = r3.mo67855k()
                if (r3 == 0) goto L_0x0066
                boolean r3 = cf1.C40440x.m117135K(r3, r0, r6)
                if (r3 != r6) goto L_0x0066
                r3 = r6
                goto L_0x0067
            L_0x0066:
                r3 = r5
            L_0x0067:
                if (r3 == 0) goto L_0x006a
            L_0x0069:
                r5 = r6
            L_0x006a:
                if (r5 == 0) goto L_0x0010
                r1.add(r2)
                goto L_0x0010
            L_0x0070:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p773gv.C24789d0.C24790a.invoke(java.util.List):java.util.List");
        }
    }

    /* renamed from: gv.d0$b */
    static final class C24791b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C24791b f63700d = new C24791b();

        C24791b() {
            super(1);
        }

        /* renamed from: a */
        public final C40754t invoke(List list) {
            C41536l.m120489i(list, "it");
            return C40749p.m118032a0(list);
        }
    }

    /* renamed from: gv.d0$c */
    static final class C24792c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C24789d0 f63701d;

        /* renamed from: gv.d0$c$a */
        static final class C24793a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C28261a f63702d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C24793a(C28261a aVar) {
                super(1);
                this.f63702d = aVar;
            }

            /* renamed from: a */
            public final C25071c invoke(Boolean bool) {
                C41536l.m120489i(bool, "isSelected");
                C28261a aVar = this.f63702d;
                C41536l.m120488h(aVar, "contact");
                return new C25071c(aVar, bool.booleanValue());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24792c(C24789d0 d0Var) {
            super(1);
            this.f63701d = d0Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C25071c m79418c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C25071c) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40735b0 invoke(C28261a aVar) {
            C41536l.m120489i(aVar, "contact");
            return this.f63701d.f63698b.mo63238a(aVar).mo95062A(new C24797e0(new C24793a(aVar)));
        }
    }

    public C24789d0(C28106n nVar, C24827t tVar) {
        C41536l.m120489i(nVar, "loadContactsUseCase");
        C41536l.m120489i(tVar, "isContactSelectedUseCase");
        this.f63697a = nVar;
        this.f63698b = tVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final List m79412f(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final C40754t m79413g(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final C40735b0 m79414h(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40735b0) lVar.invoke(obj);
    }

    /* renamed from: e */
    public final C40762x mo63207e(String str) {
        C41536l.m120489i(str, "searchWord");
        C40762x U0 = C28106n.m86558c(this.f63697a, true, (Long) null, 2, (Object) null).mo95062A(new C24781a0(new C24790a(str))).mo95090u(new C24783b0(C24791b.f63700d)).mo95010W(new C24787c0(new C24792c(this))).mo95007U0();
        C41536l.m120488h(U0, "operator fun invoke(sear…         }.toList()\n    }");
        return U0;
    }
}
