package p784hw;

import com.salesforce.marketingcloud.C11398b;
import ed1.C40762x;
import he1.C41217g;
import java.util.Calendar;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.mobilebank.model.Client;
import p750ew.C20300c;
import p793iw.C25264c;
import p891su.C28261a;
import ue1.C43064a;
import ue1.C43079p;

/* renamed from: hw.c */
public final class C25074c {

    /* renamed from: a */
    private final C25072a f64428a;

    /* renamed from: b */
    private final C20300c f64429b;

    /* renamed from: c */
    private final Client f64430c;

    /* renamed from: d */
    private final C41217g f64431d = C41219i.m119470b(C25076b.f64433d);

    /* renamed from: hw.c$a */
    static final class C25075a extends C41537m implements C43079p {

        /* renamed from: d */
        public static final C25075a f64432d = new C25075a();

        C25075a() {
            super(2);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: fw.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: fw.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: fw.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: fw.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: fw.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p793iw.C25264c invoke(p793iw.C25264c r59, java.util.List r60) {
            /*
                r58 = this;
                java.lang.String r0 = "transactions"
                r1 = r59
                kotlin.jvm.internal.C41536l.m120489i(r1, r0)
                java.lang.String r0 = "categories"
                r2 = r60
                kotlin.jvm.internal.C41536l.m120489i(r2, r0)
                java.util.List r0 = r59.mo63846d()
                java.util.ArrayList r4 = new java.util.ArrayList
                r3 = 10
                int r3 = ie1.C41343r.m119925u(r0, r3)
                r4.<init>(r3)
                java.util.Iterator r0 = r0.iterator()
            L_0x0021:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L_0x00f7
                java.lang.Object r3 = r0.next()
                r5 = r3
                iw.b r5 = (p793iw.C25263b) r5
                java.util.Iterator r3 = r60.iterator()
            L_0x0032:
                boolean r6 = r3.hasNext()
                r7 = 1
                r8 = 0
                r9 = 0
                if (r6 == 0) goto L_0x005b
                java.lang.Object r6 = r3.next()
                r10 = r6
                fw.a r10 = (p760fw.C20575a) r10
                long r10 = r10.mo49102b()
                java.lang.Long r12 = r5.mo63800D()
                if (r12 != 0) goto L_0x004d
                goto L_0x0057
            L_0x004d:
                long r12 = r12.longValue()
                int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r10 != 0) goto L_0x0057
                r10 = r7
                goto L_0x0058
            L_0x0057:
                r10 = r8
            L_0x0058:
                if (r10 == 0) goto L_0x0032
                goto L_0x005c
            L_0x005b:
                r6 = r9
            L_0x005c:
                r51 = r6
                fw.a r51 = (p760fw.C20575a) r51
                if (r51 == 0) goto L_0x0094
                java.util.List r3 = r51.mo49111i()
                if (r3 == 0) goto L_0x0094
                java.util.Iterator r3 = r3.iterator()
            L_0x006c:
                boolean r6 = r3.hasNext()
                if (r6 == 0) goto L_0x0092
                java.lang.Object r6 = r3.next()
                r10 = r6
                fw.a r10 = (p760fw.C20575a) r10
                long r10 = r10.mo49102b()
                java.lang.Long r12 = r5.mo63842y()
                if (r12 != 0) goto L_0x0084
                goto L_0x008e
            L_0x0084:
                long r12 = r12.longValue()
                int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r10 != 0) goto L_0x008e
                r10 = r7
                goto L_0x008f
            L_0x008e:
                r10 = r8
            L_0x008f:
                if (r10 == 0) goto L_0x006c
                r9 = r6
            L_0x0092:
                fw.a r9 = (p760fw.C20575a) r9
            L_0x0094:
                r50 = r9
                r6 = 0
                r8 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
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
                r28 = 0
                r29 = 0
                r30 = 0
                r31 = 0
                r32 = 0
                r33 = 0
                r35 = 0
                r36 = 0
                r37 = 0
                r38 = 0
                r39 = 0
                r40 = 0
                r41 = 0
                r42 = 0
                r43 = 0
                r44 = 0
                r45 = 0
                r46 = 0
                r47 = 0
                r48 = 0
                r49 = 0
                r52 = 0
                r53 = 0
                r54 = 0
                r55 = -1
                r56 = 7423(0x1cff, float:1.0402E-41)
                r57 = 0
                iw.b r3 = p793iw.C25263b.m80388b(r5, r6, r8, r10, r11, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57)
                r4.add(r3)
                goto L_0x0021
            L_0x00f7:
                r2 = 0
                r3 = 0
                r5 = 3
                r6 = 0
                r1 = r59
                iw.c r0 = p793iw.C25264c.m80433b(r1, r2, r3, r4, r5, r6)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p784hw.C25074c.C25075a.invoke(iw.c, java.util.List):iw.c");
        }
    }

    /* renamed from: hw.c$b */
    static final class C25076b extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C25076b f64433d = new C25076b();

        C25076b() {
            super(0);
        }

        /* renamed from: b */
        public final Long invoke() {
            Calendar instance = Calendar.getInstance();
            instance.add(2, -24);
            return Long.valueOf(instance.getTimeInMillis());
        }
    }

    public C25074c(C25072a aVar, C20300c cVar, Client client) {
        C41536l.m120489i(aVar, "transactionsRepository");
        C41536l.m120489i(cVar, "transactionCategoriesUseCase");
        C41536l.m120489i(client, "client");
        this.f64428a = aVar;
        this.f64429b = cVar;
        this.f64430c = client;
    }

    /* renamed from: b */
    private final long m80039b() {
        return ((Number) this.f64431d.getValue()).longValue();
    }

    /* renamed from: d */
    public static /* synthetic */ C40762x m80040d(C25074c cVar, Long l, Long l2, Integer num, Integer num2, Integer num3, List list, List list2, List list3, String str, List list4, List list5, boolean z, C28261a aVar, boolean z2, int i, Object obj) {
        int i2 = i;
        C28261a aVar2 = null;
        Long l3 = (i2 & 1) != 0 ? null : l;
        Long l4 = (i2 & 2) != 0 ? null : l2;
        Integer num4 = (i2 & 4) != 0 ? null : num;
        Integer num5 = (i2 & 8) != 0 ? null : num2;
        Integer num6 = (i2 & 16) != 0 ? null : num3;
        List list6 = (i2 & 32) != 0 ? null : list;
        List list7 = (i2 & 64) != 0 ? null : list2;
        List list8 = (i2 & 128) != 0 ? null : list3;
        String str2 = (i2 & C11398b.f33139r) != 0 ? null : str;
        List list9 = (i2 & C11398b.f33140s) != 0 ? null : list4;
        List list10 = (i2 & C11398b.f33141t) != 0 ? null : list5;
        boolean z3 = false;
        boolean z4 = (i2 & C11398b.f33142u) != 0 ? false : z;
        if ((i2 & C11398b.f33143v) == 0) {
            aVar2 = aVar;
        }
        if ((i2 & 8192) == 0) {
            z3 = z2;
        }
        return cVar.mo63530c(l3, l4, num4, num5, num6, list6, list7, list8, str2, list9, list10, z4, aVar2, z3);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final C25264c m80041e(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (C25264c) pVar.invoke(obj, obj2);
    }

    /* renamed from: c */
    public final C40762x mo63530c(Long l, Long l2, Integer num, Integer num2, Integer num3, List list, List list2, List list3, String str, List list4, List list5, boolean z, C28261a aVar, boolean z2) {
        long j;
        Long l3;
        if (l != null) {
            j = l.longValue();
        } else {
            j = m80039b();
        }
        C25072a aVar2 = this.f64428a;
        String clientKey = this.f64430c.getUserInfo().getClient().getClientKey();
        C41536l.m120488h(clientKey, "client.userInfo.client.clientKey");
        if (z) {
            l3 = null;
        } else {
            l3 = Long.valueOf(j);
        }
        C40762x T = C40762x.m118154T(aVar2.mo49080a(clientKey, l2, l3, num, num2, num3, str, list, list2, list3, list4, list5, aVar, z, z2), this.f64429b.mo48784a().mo95066E(C41341q.m119907j()), new C25073b(C25075a.f64432d));
        C41536l.m120488h(T, "zip(\n            transac…WithCategories)\n        }");
        return T;
    }
}
