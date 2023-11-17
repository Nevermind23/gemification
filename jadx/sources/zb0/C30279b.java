package zb0;

import bc0.C19369a;
import ed1.C40762x;
import j70.C25339b;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ky0.C37019f;
import m70.C26156i;
import md0.C26186e;
import ny0.C37500b;
import ny0.C37508i;
import oy0.C37837c;
import p843nw.C26633o;
import p863pw.C27637o;
import qy0.C38267a;
import ue1.C43081r;

/* renamed from: zb0.b */
public final class C30279b {

    /* renamed from: a */
    private final C38267a f76192a;

    /* renamed from: b */
    private final C26633o f76193b;

    /* renamed from: c */
    private final C25339b f76194c;

    /* renamed from: d */
    private final C37019f f76195d;

    /* renamed from: zb0.b$a */
    static final class C30280a extends C41537m implements C43081r {

        /* renamed from: d */
        final /* synthetic */ C30279b f76196d;

        /* renamed from: e */
        final /* synthetic */ long f76197e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30280a(C30279b bVar, long j) {
            super(4);
            this.f76196d = bVar;
            this.f76197e = j;
        }

        /* renamed from: a */
        public final C19369a invoke(C37837c cVar, C27637o oVar, C26156i iVar, C37508i iVar2) {
            C41536l.m120489i(cVar, "breakInfo");
            C41536l.m120489i(oVar, "cardsAndDetails");
            C41536l.m120489i(iVar, "accounts");
            C41536l.m120489i(iVar2, "deposits");
            List b = this.f76196d.m91387c(cVar.mo91173b(), iVar.mo65188a().mo65182a(), oVar);
            C37500b b2 = iVar2.mo90721b(this.f76197e);
            C41536l.m120486f(b2);
            return new C19369a(cVar, b, b2);
        }
    }

    public C30279b(C38267a aVar, C26633o oVar, C25339b bVar, C37019f fVar) {
        C41536l.m120489i(aVar, "repository");
        C41536l.m120489i(oVar, "getCardsAndDetails");
        C41536l.m120489i(bVar, "getAccountsAndDetails");
        C41536l.m120489i(fVar, "getDepositsAndBonds");
        this.f76192a = aVar;
        this.f76193b = oVar;
        this.f76194c = bVar;
        this.f76195d = fVar;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x008d A[EDGE_INSN: B:103:0x008d->B:27:0x008d ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0112 A[EDGE_INSN: B:111:0x0112->B:61:0x0112 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0193  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List m91387c(java.util.List r24, java.util.List r25, p863pw.C27637o r26) {
        /*
            r23 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r24.iterator()
        L_0x0009:
            boolean r2 = r1.hasNext()
            r3 = 10
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0094
            java.lang.Object r2 = r1.next()
            r6 = r2
            oy0.a r6 = (oy0.C37835a) r6
            r7 = r25
            boolean r8 = r7 instanceof java.util.Collection
            if (r8 == 0) goto L_0x0028
            boolean r8 = r25.isEmpty()
            if (r8 == 0) goto L_0x0028
        L_0x0026:
            r4 = r5
            goto L_0x008d
        L_0x0028:
            java.util.Iterator r8 = r25.iterator()
        L_0x002c:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0026
            java.lang.Object r9 = r8.next()
            m70.a r9 = (m70.C26148a) r9
            long r10 = r9.mo65087b()
            long r12 = r6.mo91166b()
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L_0x008a
            m70.c r9 = r9.mo65086a()
            if (r9 == 0) goto L_0x0075
            java.util.List r9 = r9.mo65138q()
            if (r9 == 0) goto L_0x0075
            java.util.ArrayList r10 = new java.util.ArrayList
            int r11 = ie1.C41343r.m119925u(r9, r3)
            r10.<init>(r11)
            java.util.Iterator r9 = r9.iterator()
        L_0x005d:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x0079
            java.lang.Object r11 = r9.next()
            m70.f r11 = (m70.C26153f) r11
            long r11 = r11.mo65165a()
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r10.add(r11)
            goto L_0x005d
        L_0x0075:
            java.util.List r10 = ie1.C41341q.m119907j()
        L_0x0079:
            long r11 = r6.mo91166b()
            java.lang.Long r9 = java.lang.Long.valueOf(r11)
            boolean r9 = r10.contains(r9)
            if (r9 == 0) goto L_0x0088
            goto L_0x008a
        L_0x0088:
            r9 = r5
            goto L_0x008b
        L_0x008a:
            r9 = r4
        L_0x008b:
            if (r9 == 0) goto L_0x002c
        L_0x008d:
            if (r4 == 0) goto L_0x0009
            r0.add(r2)
            goto L_0x0009
        L_0x0094:
            r7 = r25
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = ie1.C41343r.m119925u(r0, r3)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x00a3:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x01a5
            java.lang.Object r2 = r0.next()
            oy0.a r2 = (oy0.C37835a) r2
            java.util.Iterator r3 = r25.iterator()
        L_0x00b3:
            boolean r6 = r3.hasNext()
            r8 = 0
            if (r6 == 0) goto L_0x0111
            java.lang.Object r6 = r3.next()
            r9 = r6
            m70.a r9 = (m70.C26148a) r9
            long r10 = r9.mo65087b()
            long r12 = r2.mo91166b()
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L_0x010d
            m70.c r9 = r9.mo65086a()
            if (r9 == 0) goto L_0x0107
            java.util.List r9 = r9.mo65138q()
            if (r9 == 0) goto L_0x0107
            boolean r10 = r9.isEmpty()
            if (r10 == 0) goto L_0x00e1
        L_0x00df:
            r9 = r5
            goto L_0x0103
        L_0x00e1:
            java.util.Iterator r9 = r9.iterator()
        L_0x00e5:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x00df
            java.lang.Object r10 = r9.next()
            m70.f r10 = (m70.C26153f) r10
            long r10 = r10.mo65165a()
            long r12 = r2.mo91166b()
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 != 0) goto L_0x00ff
            r10 = r4
            goto L_0x0100
        L_0x00ff:
            r10 = r5
        L_0x0100:
            if (r10 == 0) goto L_0x00e5
            r9 = r4
        L_0x0103:
            if (r9 != r4) goto L_0x0107
            r9 = r4
            goto L_0x0108
        L_0x0107:
            r9 = r5
        L_0x0108:
            if (r9 == 0) goto L_0x010b
            goto L_0x010d
        L_0x010b:
            r9 = r5
            goto L_0x010e
        L_0x010d:
            r9 = r4
        L_0x010e:
            if (r9 == 0) goto L_0x00b3
            goto L_0x0112
        L_0x0111:
            r6 = r8
        L_0x0112:
            m70.a r6 = (m70.C26148a) r6
            if (r6 == 0) goto L_0x0131
            long r9 = r6.mo65099l()
            java.util.Map r3 = r26.mo67167a()
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            java.lang.Object r3 = r3.get(r9)
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L_0x0131
            java.lang.Object r3 = ie1.C41358y.m120009Y(r3)
            pw.m r3 = (p863pw.C27635m) r3
            goto L_0x0132
        L_0x0131:
            r3 = r8
        L_0x0132:
            if (r3 == 0) goto L_0x0139
            java.lang.String r9 = r3.mo67105E()
            goto L_0x013a
        L_0x0139:
            r9 = r8
        L_0x013a:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r9 = p341ge.bog.mobilebank.model.account.ProductProperties.getCardBackgroundInfo(r9)
            long r11 = r2.mo91166b()
            java.lang.String r13 = r2.mo91165a()
            if (r6 == 0) goto L_0x0153
            java.math.BigDecimal r10 = r6.mo65093g()
            if (r10 == 0) goto L_0x0153
            double r14 = r10.doubleValue()
            goto L_0x0155
        L_0x0153:
            r14 = 0
        L_0x0155:
            java.lang.String r16 = r2.mo91168d()
            int r10 = r9.resId
            if (r3 == 0) goto L_0x016d
            ge.bog.mobilebank.cleanarch.domain.products.model.CardExternalFile r17 = r3.mo67135s()
            if (r17 == 0) goto L_0x016d
            java.lang.String r17 = r17.getFileUrl()
            if (r17 == 0) goto L_0x016d
            java.lang.String r8 = g91.C32289b0.m95091c(r17)
        L_0x016d:
            r18 = r8
            java.lang.String r19 = r2.mo91167c()
            boolean r2 = r9.isLightText
            if (r3 == 0) goto L_0x0185
            ge.bog.mobilebank.cleanarch.domain.products.model.CardExternalFile r3 = r3.mo67135s()
            if (r3 == 0) goto L_0x0185
            boolean r3 = r3.isDark()
            if (r3 != r4) goto L_0x0185
            r3 = r4
            goto L_0x0186
        L_0x0185:
            r3 = r5
        L_0x0186:
            r21 = r3 ^ 1
            if (r6 == 0) goto L_0x0193
            boolean r3 = r6.mo65084F()
            if (r3 != r4) goto L_0x0193
            r22 = r4
            goto L_0x0195
        L_0x0193:
            r22 = r5
        L_0x0195:
            c21.a r3 = new c21.a
            r6 = r10
            r10 = r3
            r17 = r6
            r20 = r2
            r10.<init>(r11, r13, r14, r16, r17, r18, r19, r20, r21, r22)
            r1.add(r3)
            goto L_0x00a3
        L_0x01a5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zb0.C30279b.m91387c(java.util.List, java.util.List, pw.o):java.util.List");
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final C19369a m91388e(C43081r rVar, Object obj, Object obj2, Object obj3, Object obj4) {
        C41536l.m120489i(rVar, "$tmp0");
        return (C19369a) rVar.invoke(obj, obj2, obj3, obj4);
    }

    /* renamed from: d */
    public final C40762x mo70619d(long j) {
        C40762x R = C40762x.m118152R(this.f76192a.mo69122Yh(j), C26633o.m83102d(this.f76193b, false, 1, (Object) null).mo94996P(), C26186e.m81990h(C25339b.C25340a.m80512a(this.f76194c, false, 1, (Object) null)), C26186e.m81990h(C37019f.m109528b(this.f76195d, false, 1, (Object) null)), new C30278a(new C30280a(this, j)));
        C41536l.m120488h(R, "operator fun invoke(agre…!\n            )\n        }");
        return R;
    }
}
