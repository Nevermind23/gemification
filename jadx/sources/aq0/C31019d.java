package aq0;

import com.github.mikephil.charting.utils.Utils;
import g91.C32319m;
import g91.C32343x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lq0.C37124a;
import m41.C37223a;
import np0.C37438d;
import nq0.C37444a;
import nq0.C37445b;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.details.ActivationDetailsData;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.checkdecision.CheckDecisionDetailsUiModel;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.provider.ProviderInfoUiModel;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.refinanceinfo.RefinanceInfoUiModel;
import sq0.C38513b;
import wp0.C39628a;

/* renamed from: aq0.d */
public final class C31019d {

    /* renamed from: a */
    public static final C31020a f77184a = new C31020a((DefaultConstructorMarker) null);

    /* renamed from: aq0.d$a */
    public static final class C31020a {
        private C31020a() {
        }

        public /* synthetic */ C31020a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: aq0.d$b */
    public /* synthetic */ class C31021b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f77185a;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(2:19|20)|21|23) */
        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|23) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                sq0.b[] r0 = sq0.C38513b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                sq0.b r1 = sq0.C38513b.CONSUMER     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                sq0.b r1 = sq0.C38513b.CONSUMERLOAN     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                sq0.b r1 = sq0.C38513b.STUDENTLOAN     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                sq0.b r1 = sq0.C38513b.BUSINESSLOAN     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                sq0.b r1 = sq0.C38513b.LEASINGFINANCIALS     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                sq0.b r1 = sq0.C38513b.OTHER     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                sq0.b r1 = sq0.C38513b.INSTALLMENT     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                sq0.b r1 = sq0.C38513b.OVERDRAFT     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                sq0.b r1 = sq0.C38513b.CREDITCARD     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                sq0.b r1 = sq0.C38513b.PAWNLOAN     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                f77185a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: aq0.C31019d.C31021b.<clinit>():void");
        }
    }

    /* renamed from: a */
    private final List m92372a(ActivationDetailsData activationDetailsData) {
        double d;
        double d2;
        double d3;
        Object obj;
        boolean z;
        boolean z2;
        Double i = activationDetailsData.mo73322g().mo73384a().mo73365i();
        if (i != null) {
            d = i.doubleValue();
        } else {
            d = 0.0d;
        }
        Double h = activationDetailsData.mo73322g().mo73384a().mo73363h();
        if (h != null) {
            d2 = h.doubleValue();
        } else {
            d2 = 0.0d;
        }
        double d4 = d + d2;
        Double j = activationDetailsData.mo73322g().mo73384a().mo73366j();
        if (j != null) {
            d3 = j.doubleValue();
        } else {
            d3 = 0.0d;
        }
        double d5 = d4 + d3;
        Iterator it = activationDetailsData.mo73322g().mo73385b().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C41536l.m120484d(((ProviderInfoUiModel) obj).mo73484d(), activationDetailsData.mo73329m())) {
                break;
            }
        }
        ProviderInfoUiModel providerInfoUiModel = (ProviderInfoUiModel) obj;
        List d6 = activationDetailsData.mo73322g().mo73386d();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = d6.iterator();
        while (true) {
            boolean z3 = false;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            RefinanceInfoUiModel refinanceInfoUiModel = (RefinanceInfoUiModel) next;
            if (C41536l.m120484d(refinanceInfoUiModel.mo73519s(), "BOG") && refinanceInfoUiModel.mo73502b()) {
                z3 = true;
            }
            if (z3) {
                arrayList.add(next);
            }
        }
        List e = m92376e(arrayList);
        List d7 = activationDetailsData.mo73322g().mo73386d();
        ArrayList arrayList2 = new ArrayList();
        for (Object next2 : d7) {
            RefinanceInfoUiModel refinanceInfoUiModel2 = (RefinanceInfoUiModel) next2;
            if (C41536l.m120484d(refinanceInfoUiModel2.mo73519s(), "BOG") || !refinanceInfoUiModel2.mo73502b()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                arrayList2.add(next2);
            }
        }
        List e2 = m92376e(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new C37445b.C37449d(activationDetailsData.mo73327k().mo90107q(), (String) null, false, 6, (DefaultConstructorMarker) null));
        arrayList3.addAll(m92374c(activationDetailsData.mo73322g().mo73384a(), activationDetailsData.mo73317d(), activationDetailsData.mo73327k()));
        C37445b.C37446a aVar = C37445b.C37446a.f90031a;
        arrayList3.add(aVar);
        if (d5 == Utils.DOUBLE_EPSILON) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            arrayList3.add(new C37445b.C37449d(activationDetailsData.mo73327k().mo90108r(), (String) null, false, 6, (DefaultConstructorMarker) null));
            arrayList3.addAll(m92375d(activationDetailsData.mo73322g().mo73384a(), activationDetailsData.mo73327k()));
            arrayList3.add(new C37445b.C37450e(activationDetailsData.mo73327k().mo90064F(), C32343x.m95410Q(d5, activationDetailsData.mo73322g().mo73384a().mo73369m(), false, 2, (Object) null)));
            arrayList3.add(aVar);
        }
        if (!e.isEmpty()) {
            arrayList3.add(new C37445b.C37449d(activationDetailsData.mo73327k().mo90109s(), (String) null, false, 6, (DefaultConstructorMarker) null));
            arrayList3.addAll(e);
        }
        if (!e2.isEmpty()) {
            arrayList3.add(new C37445b.C37449d(C32343x.m95388F("loan.activation.summary.page.refinance.block.other.banks.header", new Object[0]), C32343x.m95388F("loan.activation.summary.page.refinance.block.other.banks.explanatory", new Object[0]), e.isEmpty()));
            arrayList3.addAll(e2);
            arrayList3.add(new C37445b.C37448c(C32343x.m95388F("loan.activation.summary.page.other.banks.ref.condition", String.valueOf(activationDetailsData.mo73322g().mo73384a().mo73357d()))));
        }
        if ((!e.isEmpty()) || (!e2.isEmpty())) {
            arrayList3.add(aVar);
        }
        if (providerInfoUiModel != null && (activationDetailsData.mo73325i() || activationDetailsData.mo73326j())) {
            arrayList3.add(new C37445b.C37449d(activationDetailsData.mo73327k().mo90106o(), (String) null, false, 6, (DefaultConstructorMarker) null));
            arrayList3.addAll(m92373b(providerInfoUiModel, activationDetailsData.mo73325i(), activationDetailsData.mo73326j(), activationDetailsData.mo73327k()));
            arrayList3.add(aVar);
        }
        return arrayList3;
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [nq0.b$b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List m92373b(p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.provider.ProviderInfoUiModel r12, boolean r13, boolean r14, lq0.C37124a r15) {
        /*
            r11 = this;
            r0 = 2
            nq0.b$b[] r0 = new nq0.C37445b.C37447b[r0]
            java.lang.String r1 = "-"
            r2 = 0
            r3 = 0
            if (r13 == 0) goto L_0x003d
            int r5 = np0.C37438d.f89973f
            java.lang.String r13 = r15.mo90111u()
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r7 = g91.C32343x.m95388F(r13, r4)
            ge.bog.mobilebank.loanactivation.presentation.activation.model.form.provider.InsuranceInfoUiModel r13 = r12.mo73482a()
            if (r13 == 0) goto L_0x0020
            java.lang.String r13 = r13.mo73472a()
            goto L_0x0021
        L_0x0020:
            r13 = r2
        L_0x0021:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            r4.append(r13)
            java.lang.String r6 = r4.toString()
            java.lang.String r8 = r12.mo73486e()
            r10 = r14 ^ 1
            r9 = 1
            r4 = r11
            nq0.b$b r13 = r4.m92378h(r5, r6, r7, r8, r9, r10)
            goto L_0x003e
        L_0x003d:
            r13 = r2
        L_0x003e:
            r0[r3] = r13
            if (r14 == 0) goto L_0x0072
            int r5 = np0.C37438d.f89974h
            java.lang.String r13 = r15.mo90115y()
            java.lang.Object[] r14 = new java.lang.Object[r3]
            java.lang.String r7 = g91.C32343x.m95388F(r13, r14)
            ge.bog.mobilebank.loanactivation.presentation.activation.model.form.provider.InsuranceInfoUiModel r13 = r12.mo73483b()
            if (r13 == 0) goto L_0x0058
            java.lang.String r2 = r13.mo73472a()
        L_0x0058:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r1)
            r13.append(r2)
            java.lang.String r6 = r13.toString()
            java.lang.String r8 = r12.mo73486e()
            r9 = 1
            r10 = 1
            r4 = r11
            nq0.b$b r2 = r4.m92378h(r5, r6, r7, r8, r9, r10)
        L_0x0072:
            r12 = 1
            r0[r12] = r2
            java.util.List r12 = ie1.C41341q.m119912o(r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: aq0.C31019d.m92373b(ge.bog.mobilebank.loanactivation.presentation.activation.model.form.provider.ProviderInfoUiModel, boolean, boolean, lq0.a):java.util.List");
    }

    /* renamed from: c */
    private final List m92374c(CheckDecisionDetailsUiModel checkDecisionDetailsUiModel, String str, C37124a aVar) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        C37445b.C37447b[] bVarArr = new C37445b.C37447b[8];
        int i = C37438d.icons_16_system_calendar_outline;
        bVarArr[0] = m92379i(this, i, String.valueOf(checkDecisionDetailsUiModel.mo73374t()), C32343x.m95388F(aVar.mo90059A(), new Object[0]), (String) null, false, false, 56, (Object) null);
        String F = C32343x.m95388F(aVar.mo90102l(), new Object[0]);
        Long g = checkDecisionDetailsUiModel.mo73362g();
        C37445b.C37447b bVar = null;
        if (g != null) {
            str2 = C32319m.m95295b(g.longValue());
        } else {
            str2 = null;
        }
        bVarArr[1] = m92379i(this, i, str2, F, (String) null, false, false, 56, (Object) null);
        int i2 = C37438d.f89974h;
        String F2 = C32343x.m95388F(aVar.mo90114x(), new Object[0]);
        Double q = checkDecisionDetailsUiModel.mo73371q();
        if (q != null) {
            str3 = m92377g(q.doubleValue());
        } else {
            str3 = null;
        }
        bVarArr[2] = m92379i(this, i2, str3, F2, (String) null, false, false, 56, (Object) null);
        String F3 = C32343x.m95388F(aVar.mo90095g(), new Object[0]);
        Double p = checkDecisionDetailsUiModel.mo73370p();
        if (p != null) {
            str4 = m92377g(p.doubleValue());
        } else {
            str4 = null;
        }
        bVarArr[3] = m92379i(this, i2, str4, F3, (String) null, false, false, 56, (Object) null);
        bVarArr[4] = m92379i(this, C37438d.f89975m, checkDecisionDetailsUiModel.mo73372r() + " " + C32343x.m95388F(aVar.mo90073O(), new Object[0]), C32343x.m95388F(aVar.mo90112v(), new Object[0]), (String) null, false, false, 56, (Object) null);
        String F4 = C32343x.m95388F(aVar.mo90113w(), new Object[0]);
        Double u = checkDecisionDetailsUiModel.mo73376u();
        if (u != null) {
            str5 = C32343x.m95410Q(u.doubleValue(), checkDecisionDetailsUiModel.mo73369m(), false, 2, (Object) null);
        } else {
            str5 = null;
        }
        bVarArr[5] = m92379i(this, i, str5, F4, (String) null, false, false, 56, (Object) null);
        if (!C41536l.m120482b(checkDecisionDetailsUiModel.mo73378w(), Utils.DOUBLE_EPSILON)) {
            int i3 = C37438d.icons_16_payment_transfer_payment;
            String F5 = C32343x.m95388F("credit.offers.RL.summary.page.down.amount", new Object[0]);
            Double w = checkDecisionDetailsUiModel.mo73378w();
            if (w != null) {
                str6 = C32343x.m95410Q(w.doubleValue(), checkDecisionDetailsUiModel.mo73369m(), false, 2, (Object) null);
            } else {
                str6 = null;
            }
            bVar = m92379i(this, i3, str6, F5, (String) null, false, false, 56, (Object) null);
        }
        bVarArr[6] = bVar;
        bVarArr[7] = m92379i(this, C37438d.f89971c, str, C32343x.m95388F(aVar.mo90088c(), new Object[0]), (String) null, false, true, 24, (Object) null);
        return C41341q.m119912o(bVarArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: nq0.b$b[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.Object} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List m92375d(p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.checkdecision.CheckDecisionDetailsUiModel r18, lq0.C37124a r19) {
        /*
            r17 = this;
            r0 = 3
            nq0.b$b[] r0 = new nq0.C37445b.C37447b[r0]
            java.lang.Double r1 = r18.mo73366j()
            r2 = 0
            boolean r1 = kotlin.jvm.internal.C41536l.m120482b(r1, r2)
            r4 = 1
            r5 = 0
            r6 = 0
            if (r1 != 0) goto L_0x005a
            int r8 = np0.C37438d.icons_16_statement_bank_statement
            java.lang.String r1 = r19.mo90060B()
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.String r10 = g91.C32343x.m95388F(r1, r7)
            java.lang.Double r1 = r18.mo73366j()
            if (r1 == 0) goto L_0x0036
            double r11 = r1.doubleValue()
            java.lang.String r13 = r18.mo73369m()
            r14 = 0
            r15 = 2
            r16 = 0
            java.lang.String r1 = g91.C32343x.m95410Q(r11, r13, r14, r15, r16)
            r9 = r1
            goto L_0x0037
        L_0x0036:
            r9 = r5
        L_0x0037:
            java.lang.Double r1 = r18.mo73363h()
            boolean r1 = kotlin.jvm.internal.C41536l.m120482b(r1, r2)
            if (r1 == 0) goto L_0x004d
            java.lang.Double r1 = r18.mo73365i()
            boolean r1 = kotlin.jvm.internal.C41536l.m120482b(r1, r2)
            if (r1 == 0) goto L_0x004d
            r13 = r4
            goto L_0x004e
        L_0x004d:
            r13 = r6
        L_0x004e:
            r11 = 0
            r12 = 0
            r14 = 24
            r15 = 0
            r7 = r17
            nq0.b$b r1 = m92379i(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x005b
        L_0x005a:
            r1 = r5
        L_0x005b:
            r0[r6] = r1
            java.lang.Double r1 = r18.mo73363h()
            boolean r1 = kotlin.jvm.internal.C41536l.m120482b(r1, r2)
            if (r1 != 0) goto L_0x00a0
            int r8 = np0.C37438d.icons_16_general_fee
            java.lang.String r1 = r19.mo90097h()
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.String r10 = g91.C32343x.m95388F(r1, r7)
            java.lang.Double r1 = r18.mo73363h()
            if (r1 == 0) goto L_0x008b
            double r11 = r1.doubleValue()
            java.lang.String r13 = r18.mo73369m()
            r14 = 0
            r15 = 2
            r16 = 0
            java.lang.String r1 = g91.C32343x.m95410Q(r11, r13, r14, r15, r16)
            r9 = r1
            goto L_0x008c
        L_0x008b:
            r9 = r5
        L_0x008c:
            java.lang.Double r1 = r18.mo73365i()
            boolean r13 = kotlin.jvm.internal.C41536l.m120482b(r1, r2)
            r11 = 0
            r12 = 0
            r14 = 24
            r15 = 0
            r7 = r17
            nq0.b$b r1 = m92379i(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x00a1
        L_0x00a0:
            r1 = r5
        L_0x00a1:
            r0[r4] = r1
            java.lang.Double r1 = r18.mo73365i()
            boolean r1 = kotlin.jvm.internal.C41536l.m120482b(r1, r2)
            if (r1 != 0) goto L_0x00dc
            int r8 = np0.C37438d.f89974h
            java.lang.String r1 = r19.mo90110t()
            java.lang.Object[] r2 = new java.lang.Object[r6]
            java.lang.String r10 = g91.C32343x.m95388F(r1, r2)
            java.lang.Double r1 = r18.mo73365i()
            if (r1 == 0) goto L_0x00cf
            double r11 = r1.doubleValue()
            java.lang.String r13 = r18.mo73369m()
            r14 = 0
            r15 = 2
            r16 = 0
            java.lang.String r5 = g91.C32343x.m95410Q(r11, r13, r14, r15, r16)
        L_0x00cf:
            r9 = r5
            r11 = 0
            r12 = 0
            r13 = 1
            r14 = 24
            r15 = 0
            r7 = r17
            nq0.b$b r5 = m92379i(r7, r8, r9, r10, r11, r12, r13, r14, r15)
        L_0x00dc:
            r1 = 2
            r0[r1] = r5
            java.util.List r0 = ie1.C41341q.m119912o(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: aq0.C31019d.m92375d(ge.bog.mobilebank.loanactivation.presentation.activation.model.form.checkdecision.CheckDecisionDetailsUiModel, lq0.a):java.util.List");
    }

    /* renamed from: e */
    private final List m92376e(List list) {
        C37445b.C37447b bVar;
        int i;
        int i2;
        boolean z;
        ArrayList<RefinanceInfoUiModel> arrayList = new ArrayList<>();
        Iterator it = list.iterator();
        while (true) {
            boolean z2 = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((RefinanceInfoUiModel) next).mo73508g() != null) {
                z2 = true;
            }
            if (z2) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (RefinanceInfoUiModel refinanceInfoUiModel : arrayList) {
            if (refinanceInfoUiModel.mo73508g() != null) {
                C38513b a = C38513b.f92323d.mo92083a(refinanceInfoUiModel.mo73508g());
                if (a == null) {
                    i = -1;
                } else {
                    i = C31021b.f77185a[a.ordinal()];
                }
                switch (i) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        i2 = C37438d.icons_16_loan_consumer;
                        break;
                    case 7:
                        i2 = C37438d.f89974h;
                        break;
                    case 8:
                    case 9:
                        i2 = C37438d.f89972d;
                        break;
                    case 10:
                        i2 = C37438d.icons_16_loan_pawn;
                        break;
                    default:
                        i2 = C37438d.icons_16_loan_consumer;
                        break;
                }
                int i3 = i2;
                String Q = C32343x.m95410Q(refinanceInfoUiModel.mo73503d(), refinanceInfoUiModel.mo73505e(), false, 2, (Object) null);
                String m = refinanceInfoUiModel.mo73515m();
                String i4 = refinanceInfoUiModel.mo73511i();
                if (list.indexOf(refinanceInfoUiModel) == arrayList.size() - 1) {
                    z = true;
                } else {
                    z = false;
                }
                bVar = m92378h(i3, Q, m, i4, true, z);
            } else {
                List list2 = list;
                bVar = null;
            }
            if (bVar != null) {
                arrayList2.add(bVar);
            }
        }
        return arrayList2;
    }

    /* renamed from: g */
    private final String m92377g(double d) {
        return d + " %";
    }

    /* renamed from: h */
    private final C37445b.C37447b m92378h(int i, String str, String str2, String str3, boolean z, boolean z2) {
        if (str == null) {
            return null;
        }
        return new C37445b.C37447b(i, str, str2, str3, z, false, z2, 32, (DefaultConstructorMarker) null);
    }

    /* renamed from: i */
    static /* synthetic */ C37445b.C37447b m92379i(C31019d dVar, int i, String str, String str2, String str3, boolean z, boolean z2, int i2, Object obj) {
        return dVar.m92378h(i, str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? false : z2);
    }

    /* renamed from: f */
    public final C37444a mo71216f(ActivationDetailsData activationDetailsData) {
        Double d;
        Double d2;
        Double d3;
        C41536l.m120489i(activationDetailsData, "data");
        double l = activationDetailsData.mo73322g().mo73384a().mo73368l();
        if (!C41536l.m120482b(activationDetailsData.mo73322g().mo73384a().mo73377v(), Utils.DOUBLE_EPSILON)) {
            d = activationDetailsData.mo73322g().mo73384a().mo73377v();
        } else {
            d = null;
        }
        if (!C41536l.m120482b(activationDetailsData.mo73322g().mo73384a().mo73356b(), Utils.DOUBLE_EPSILON)) {
            d2 = activationDetailsData.mo73322g().mo73384a().mo73356b();
        } else {
            d2 = null;
        }
        if (!C41536l.m120482b(activationDetailsData.mo73322g().mo73384a().mo73367k(), Utils.DOUBLE_EPSILON)) {
            d3 = activationDetailsData.mo73322g().mo73384a().mo73367k();
        } else {
            d3 = null;
        }
        return new C37444a(l, d, d2, d3, activationDetailsData.mo73322g().mo73384a().mo73369m(), m92372a(activationDetailsData), (C37223a) null, false, !C41341q.m119910m(C39628a.C, C39628a.V).contains(activationDetailsData.mo73315a()), 192, (DefaultConstructorMarker) null);
    }
}
