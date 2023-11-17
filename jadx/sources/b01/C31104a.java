package b01;

import android.app.Application;
import androidx.core.content.C0767a;
import c01.C31251a;
import com.github.mikephil.charting.utils.Utils;
import d01.C31513a;
import g91.C32343x;
import hy0.C36268b;
import hy0.C36270d;
import hy0.C36274h;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ny0.C37499a;
import ny0.C37500b;
import ny0.C37508i;
import o70.C26766e;
import p341ge.bog.designsystem.components.Amount;
import p341ge.bog.mobilebank.cleanarch.domain.home.model.ProductType;
import p341ge.bog.mobilebank.products.domain.model.BillInfo;
import p341ge.bog.mobilebank.products.domain.model.CreditCardAccount;
import p341ge.bog.mobilebank.products.presentation.products.C34366d;
import p606sl.C17843i;
import p606sl.C17847m;
import q70.C27685a;
import xh0.C29789f;
import xy0.C39940d;
import xy0.C39941e;
import xy0.C39948l;
import xy0.C39950n;
import xy0.C39952p;
import xy0.C39959w;
import xy0.C39960x;
import zs0.C40251d;
import zs0.C40252e;
import zs0.C40253f;
import zs0.C40254g;

/* renamed from: b01.a */
public final class C31104a {

    /* renamed from: b */
    public static final C31105a f77309b = new C31105a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final Application f77310a;

    /* renamed from: b01.a$a */
    public static final class C31105a {
        private C31105a() {
        }

        public /* synthetic */ C31105a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C31104a(Application application) {
        C41536l.m120489i(application, "application");
        this.f77310a = application;
    }

    /* renamed from: a */
    private final int m92540a(int i) {
        if (i == 2) {
            return C36270d.f87472c;
        }
        return C36270d.ic_bnpl_products;
    }

    /* renamed from: b */
    private final boolean m92541b(C37500b bVar) {
        Long q = bVar.mo90683q();
        if (q == null) {
            return false;
        }
        if (System.currentTimeMillis() + ((long) 864000000) > q.longValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final C34366d.C34371e mo71306c(C17847m mVar, int i) {
        Long l;
        C41536l.m120489i(mVar, "bnpl");
        Amount amount = new Amount(mVar.mo45507c().mo63386b(), mVar.mo45507c().mo63385a());
        if (mVar.mo45506b().size() == 1) {
            l = Long.valueOf(((C17843i) mVar.mo45506b().get(0)).mo45476c());
        } else {
            l = null;
        }
        int i2 = i;
        return new C34366d.C34371e(l, C32343x.m95388F("text.bnpl.name", new Object[0]), amount, Integer.valueOf(m92540a(i2)), C27685a.BNPL, false, (String) null, (Integer) null, (Integer) null, i2, 448, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public final C34366d.C34371e mo71307d(List list) {
        Long l;
        C41536l.m120489i(list, "data");
        BigDecimal valueOf = BigDecimal.valueOf(0);
        C41536l.m120488h(valueOf, "valueOf(this.toLong())");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BigDecimal a = ((C29789f) it.next()).mo69966a();
            if (a == null) {
                a = BigDecimal.ZERO;
            }
            C41536l.m120488h(a, "it.availableAmount ?: BigDecimal.ZERO");
            valueOf = valueOf.add(a);
            C41536l.m120488h(valueOf, "this.add(other)");
        }
        if (list.size() == 1) {
            l = Long.valueOf(((C29789f) C41358y.m120007W(list)).mo69970e());
        } else {
            l = null;
        }
        return new C34366d.C34371e(l, C32343x.m95388F("giftcard.owner.list.header", new Object[0]), new Amount(valueOf, "GEL"), Integer.valueOf(C36270d.ic_product_gift_cards), C27685a.GIFT_CARD_OWNER, false, (String) null, (Integer) null, (Integer) null, 2, 448, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: ge.bog.mobilebank.products.presentation.products.d$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: ge.bog.mobilebank.products.presentation.products.d$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: ge.bog.mobilebank.products.presentation.products.d$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: ge.bog.mobilebank.products.presentation.products.d$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: m70.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: ge.bog.mobilebank.products.presentation.products.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0133 A[SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p341ge.bog.mobilebank.products.presentation.products.C34366d mo71308e(m70.C26156i r21, o70.C26766e r22, int r23) {
        /*
            r20 = this;
            java.lang.String r0 = "accountsAndDetailsModel"
            r1 = r21
            kotlin.jvm.internal.C41536l.m120489i(r1, r0)
            java.lang.String r0 = "cardsAndDetailsModel"
            r2 = r22
            kotlin.jvm.internal.C41536l.m120489i(r2, r0)
            m70.h r0 = r21.mo65188a()
            java.util.List r0 = r0.mo65182a()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x001f:
            boolean r4 = r0.hasNext()
            r5 = 1
            if (r4 == 0) goto L_0x0038
            java.lang.Object r4 = r0.next()
            r6 = r4
            m70.a r6 = (m70.C26148a) r6
            boolean r6 = r6.mo65085G()
            r5 = r5 ^ r6
            if (r5 == 0) goto L_0x001f
            r3.add(r4)
            goto L_0x001f
        L_0x0038:
            int r0 = r3.size()
            r4 = 0
            r6 = 0
            if (r0 != r5) goto L_0x009b
            java.lang.Object r0 = r3.get(r6)
            m70.a r0 = (m70.C26148a) r0
            long r8 = r0.mo65087b()
            java.util.Map r2 = r22.mo66048a()
            long r10 = r0.mo65087b()
            java.lang.Long r3 = java.lang.Long.valueOf(r10)
            java.lang.Object r2 = r2.get(r3)
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L_0x0062
            java.util.List r2 = ie1.C41341q.m119907j()
        L_0x0062:
            java.util.List r1 = r21.mo65189b()
            java.util.Iterator r1 = r1.iterator()
        L_0x006a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0089
            java.lang.Object r3 = r1.next()
            r7 = r3
            m70.c r7 = (m70.C26150c) r7
            long r10 = r7.mo65121b()
            long r12 = r0.mo65087b()
            int r7 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r7 != 0) goto L_0x0085
            r7 = r5
            goto L_0x0086
        L_0x0085:
            r7 = r6
        L_0x0086:
            if (r7 == 0) goto L_0x006a
            r4 = r3
        L_0x0089:
            m70.c r4 = (m70.C26150c) r4
            ge.bog.designsystem.components.productcards.AccountCardView$a r10 = d01.C31513a.m93589c(r0, r2, r4)
            q70.a r11 = q70.C27685a.ACC_TYPE_ACCOUNT
            ge.bog.mobilebank.products.presentation.products.d$a r4 = new ge.bog.mobilebank.products.presentation.products.d$a
            r7 = r4
            r12 = r23
            r7.<init>(r8, r10, r11, r12)
            goto L_0x0146
        L_0x009b:
            int r0 = r3.size()
            if (r0 <= r5) goto L_0x0146
            r8 = 0
            r0 = r20
            android.app.Application r4 = r0.f77310a
            int r7 = hy0.C36274h.f87579v
            java.lang.String r9 = r4.getString(r7)
            java.lang.String r4 = "application.getString(R.…_text_accounts_and_cards)"
            kotlin.jvm.internal.C41536l.m120488h(r9, r4)
            ge.bog.designsystem.components.Amount r10 = new ge.bog.designsystem.components.Amount
            m70.h r4 = r21.mo65188a()
            hd0.a r4 = r4.mo65184c()
            double r11 = r4.mo63386b()
            m70.h r1 = r21.mo65188a()
            hd0.a r1 = r1.mo65184c()
            java.lang.String r1 = r1.mo63385a()
            r10.<init>((double) r11, (java.lang.String) r1)
            r1 = 2
            r4 = r23
            if (r4 != r1) goto L_0x00d6
            int r1 = hy0.C36270d.product_group_wide_account
            goto L_0x00d8
        L_0x00d6:
            int r1 = hy0.C36270d.product_group_square_account
        L_0x00d8:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            q70.a r12 = q70.C27685a.ACC_TYPE_ACCOUNT
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L_0x00e6
        L_0x00e4:
            r13 = r6
            goto L_0x0134
        L_0x00e6:
            java.util.Iterator r1 = r3.iterator()
        L_0x00ea:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00e4
            java.lang.Object r3 = r1.next()
            m70.a r3 = (m70.C26148a) r3
            java.util.Map r7 = r22.mo66048a()
            long r13 = r3.mo65087b()
            java.lang.Long r3 = java.lang.Long.valueOf(r13)
            java.lang.Object r3 = r7.get(r3)
            java.util.List r3 = (java.util.List) r3
            if (r3 != 0) goto L_0x010e
            java.util.List r3 = ie1.C41341q.m119907j()
        L_0x010e:
            boolean r7 = r3 instanceof java.util.Collection
            if (r7 == 0) goto L_0x011a
            boolean r7 = r3.isEmpty()
            if (r7 == 0) goto L_0x011a
        L_0x0118:
            r3 = r6
            goto L_0x0131
        L_0x011a:
            java.util.Iterator r3 = r3.iterator()
        L_0x011e:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x0118
            java.lang.Object r7 = r3.next()
            o70.d r7 = (o70.C26765d) r7
            boolean r7 = r7.mo66011P()
            if (r7 == 0) goto L_0x011e
            r3 = r5
        L_0x0131:
            if (r3 == 0) goto L_0x00ea
            r13 = r5
        L_0x0134:
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 448(0x1c0, float:6.28E-43)
            r19 = 0
            ge.bog.mobilebank.products.presentation.products.d$e r1 = new ge.bog.mobilebank.products.presentation.products.d$e
            r7 = r1
            r17 = r23
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r4 = r1
            goto L_0x0148
        L_0x0146:
            r0 = r20
        L_0x0148:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b01.C31104a.mo71308e(m70.i, o70.e, int):ge.bog.mobilebank.products.presentation.products.d");
    }

    /* renamed from: f */
    public final C34366d.C34371e mo71309f(C39941e eVar, int i) {
        Long l;
        int i2;
        C41536l.m120489i(eVar, "bonds");
        if (eVar.mo93694a().size() == 1) {
            l = Long.valueOf(((C39940d) eVar.mo93694a().get(0)).mo93685b());
        } else {
            l = null;
        }
        String string = this.f77310a.getString(C36274h.f87570g0);
        C41536l.m120488h(string, "application.getString(R.…e_title_bonds_and_shares)");
        Amount amount = new Amount(eVar.mo93696c().mo93680c(), eVar.mo93696c().mo93679b());
        if (i == 2) {
            i2 = C36270d.product_group_wide_galt;
        } else {
            i2 = C36270d.product_group_square_galt;
        }
        return new C34366d.C34371e(l, string, amount, Integer.valueOf(i2), C27685a.ACC_TYPE_GT, false, (String) null, (Integer) null, (Integer) null, i, 448, (DefaultConstructorMarker) null);
    }

    /* renamed from: g */
    public final C34366d mo71310g(C39948l lVar, C26766e eVar, int i) {
        boolean z;
        int i2;
        Object obj;
        boolean z2;
        C41536l.m120489i(lVar, "creditCards");
        C41536l.m120489i(eVar, "cardsAndDetailsModel");
        List a = lVar.mo93735b().mo93700a();
        if (a == null || a.size() != 1) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            CreditCardAccount creditCardAccount = (CreditCardAccount) lVar.mo93735b().mo93700a().get(0);
            long a2 = creditCardAccount.mo81941a();
            Iterator it = lVar.mo93734a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((BillInfo) obj).mo81906a() == creditCardAccount.mo81941a()) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    break;
                }
            }
            BillInfo billInfo = (BillInfo) obj;
            String string = this.f77310a.getString(C36274h.f87563P);
            C41536l.m120488h(string, "application.getString(R.string.overspent)");
            String string2 = this.f77310a.getString(C36274h.payment);
            C41536l.m120488h(string2, "application.getString(R.string.payment)");
            List list = (List) eVar.mo66048a().get(Long.valueOf(creditCardAccount.mo81941a()));
            if (list == null) {
                list = C41341q.m119907j();
            }
            return new C34366d.C34369c(a2, C31513a.m93590d(creditCardAccount, billInfo, string, string2, list), C27685a.ACC_TYPE_CREDIT_CARD, i);
        }
        String string3 = this.f77310a.getString(C36274h.f87581x);
        C41536l.m120488h(string3, "application.getString(R.…header_text_credit_cards)");
        Amount amount = new Amount(lVar.mo93735b().mo93701b().mo93729a().doubleValue(), lVar.mo93735b().mo93701b().mo93730b());
        if (i == 2) {
            i2 = C36270d.product_group_wide_credit_card;
        } else {
            i2 = C36270d.product_group_square_credit_card;
        }
        return new C34366d.C34371e((Long) null, string3, amount, Integer.valueOf(i2), C27685a.ACC_TYPE_CREDIT_CARD, false, (String) null, (Integer) null, (Integer) null, i, 448, (DefaultConstructorMarker) null);
    }

    /* renamed from: h */
    public final C34366d.C34371e mo71311h(C37508i iVar, int i) {
        Long l;
        int i2;
        boolean z;
        C41536l.m120489i(iVar, "deposits");
        if (iVar.mo90723d().size() == 1 && iVar.mo90722c().isEmpty()) {
            l = Long.valueOf(((C37500b) iVar.mo90723d().get(0)).mo90668d());
        } else if (iVar.mo90722c().size() != 1 || !iVar.mo90723d().isEmpty()) {
            l = null;
        } else {
            l = Long.valueOf(((C37499a) iVar.mo90722c().get(0)).mo90644g());
        }
        Long l2 = l;
        String string = this.f77310a.getString(C36274h.f87582y);
        Amount amount = new Amount(iVar.mo90726f().mo90698a(), iVar.mo90726f().mo90699b());
        if (i == 2) {
            i2 = C36270d.product_group_wide_deposit;
        } else {
            i2 = C36270d.product_group_square_deposit;
        }
        C27685a aVar = C27685a.ACC_TYPE_DEPOSIT;
        List d = iVar.mo90723d();
        if (!(d instanceof Collection) || !d.isEmpty()) {
            Iterator it = d.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (m92541b((C37500b) it.next())) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = false;
        C41536l.m120488h(string, "getString(R.string.header_text_deposits)");
        return new C34366d.C34371e(l2, string, amount, Integer.valueOf(i2), aVar, z, (String) null, (Integer) null, (Integer) null, i, 448, (DefaultConstructorMarker) null);
    }

    /* renamed from: i */
    public final C34366d.C34371e mo71312i(String str, int i) {
        boolean z;
        String str2;
        boolean z2;
        int i2;
        Integer num;
        C41536l.m120489i(str, "status");
        String string = this.f77310a.getString(C36274h.f87580w);
        C41536l.m120488h(string, "application.getString(R.…er_text_bonds_and_shares)");
        Integer valueOf = Integer.valueOf(C36270d.product_group_wide_galt);
        C27685a aVar = C27685a.TYPE_GTP_TRADING;
        boolean z3 = true;
        if (C41536l.m120484d(str, ProductType.PRODUCT_STATUS_REJECTED)) {
            z = true;
        } else {
            z = C41536l.m120484d(str, ProductType.PRODUCT_STATUS_NEW);
        }
        if (z) {
            str2 = this.f77310a.getString(C36274h.gt_new_info_text);
        } else {
            str2 = this.f77310a.getString(C36274h.gt_pending_info_text);
        }
        if (C41536l.m120484d(str, ProductType.PRODUCT_STATUS_NEW)) {
            z2 = true;
        } else {
            z2 = C41536l.m120484d(str, ProductType.PRODUCT_STATUS_REJECTED);
        }
        if (z2) {
            i2 = C0767a.m2893c(this.f77310a, C36268b.f87449a);
        } else {
            i2 = C0767a.m2893c(this.f77310a, C36268b.f87455g);
        }
        Integer valueOf2 = Integer.valueOf(i2);
        if (!C41536l.m120484d(str, ProductType.PRODUCT_STATUS_NEW)) {
            z3 = C41536l.m120484d(str, ProductType.PRODUCT_STATUS_REJECTED);
        }
        if (z3) {
            num = Integer.valueOf(C0767a.m2893c(this.f77310a, C36268b.f87459k));
        } else {
            num = null;
        }
        return new C34366d.C34371e((Long) null, string, (Amount) null, valueOf, aVar, false, str2, valueOf2, num, i);
    }

    /* renamed from: j */
    public final C34366d.C34371e mo71313j(C39950n nVar, int i) {
        C41536l.m120489i(nVar, "gtWrapper");
        String string = this.f77310a.getString(C36274h.f87580w);
        C41536l.m120488h(string, "application.getString(R.…er_text_bonds_and_shares)");
        return new C34366d.C34371e((Long) null, string, new Amount(nVar.mo93746b(), nVar.mo93745a()), Integer.valueOf(C36270d.product_group_wide_galt), C27685a.TYPE_GTP_TRADING, false, (String) null, (Integer) null, (Integer) null, i, 448, (DefaultConstructorMarker) null);
    }

    /* renamed from: k */
    public final C34366d.C34371e mo71314k(C39959w wVar, int i) {
        C31251a aVar;
        Long l;
        Amount amount;
        int i2;
        C41536l.m120489i(wVar, "loans");
        if (wVar.mo93784a().mo63386b() <= Utils.DOUBLE_EPSILON) {
            aVar = C31251a.JUST_MY_LOANS;
        } else if (wVar.mo93784a().mo63386b() <= Utils.DOUBLE_EPSILON || wVar.mo93787d().mo63386b() <= Utils.DOUBLE_EPSILON) {
            aVar = C31251a.COSIGNER_ONLY;
        } else {
            aVar = C31251a.MY_AND_COSIGNER;
        }
        if (wVar.mo93786c().size() == 1) {
            l = Long.valueOf(((C39952p) wVar.mo93786c().get(0)).mo93757d());
        } else {
            l = null;
        }
        String F = C32343x.m95388F(aVar.mo71498b(), new Object[0]);
        if (aVar == C31251a.COSIGNER_ONLY) {
            amount = new Amount(wVar.mo93784a().mo63386b(), wVar.mo93784a().mo63385a());
        } else {
            amount = new Amount(wVar.mo93787d().mo63386b(), wVar.mo93787d().mo63385a());
        }
        Amount amount2 = amount;
        if (i == 2) {
            i2 = C36270d.product_group_wide_loan;
        } else {
            i2 = C36270d.product_group_square_loan;
        }
        return new C34366d.C34371e(l, F, amount2, Integer.valueOf(i2), C27685a.ACC_TYPE_LOAN, false, (String) null, (Integer) null, (Integer) null, i, 448, (DefaultConstructorMarker) null);
    }

    /* renamed from: l */
    public final C34366d.C34371e mo71315l(C39960x xVar, int i) {
        double d;
        int i2;
        C39960x xVar2 = xVar;
        C41536l.m120489i(xVar, "pensionAmount");
        String F = C32343x.m95388F("text.georgian.pension.funds.title", new Object[0]);
        BigDecimal a = xVar.mo93788a();
        if (a != null) {
            d = a.doubleValue();
        } else {
            d = Utils.DOUBLE_EPSILON;
        }
        Amount amount = new Amount(d, "GEL");
        if (i == 2) {
            i2 = C36270d.product_group_wide_pension;
        } else {
            i2 = C36270d.product_group_square_pension;
        }
        return new C34366d.C34371e((Long) null, F, amount, Integer.valueOf(i2), C27685a.ACC_TYPE_PENSION, false, (String) null, (Integer) null, (Integer) null, i, 448, (DefaultConstructorMarker) null);
    }

    /* renamed from: m */
    public final C34366d mo71316m(C40252e eVar, int i) {
        int i2;
        Object obj;
        C41536l.m120489i(eVar, "info");
        C40251d dVar = (C40251d) C41358y.m120009Y(eVar.mo94233b());
        if (dVar == null) {
            return new C34366d.C34372f(C27685a.PIGGY_BANK);
        }
        List a = eVar.mo94232a();
        ArrayList<C40253f> arrayList = new ArrayList<>();
        for (Object next : a) {
            if (((C40253f) next).mo94257q()) {
                arrayList.add(next);
            }
        }
        double d = 0.0d;
        for (C40253f l : arrayList) {
            double d2 = 0.0d;
            for (C40254g c : l.mo94252l()) {
                d2 += c.mo94270c();
            }
            d += d2;
        }
        List<C40253f> a2 = eVar.mo94232a();
        if (!(a2 instanceof Collection) || !a2.isEmpty()) {
            i2 = 0;
            for (C40253f q : a2) {
                if (q.mo94257q() && (i2 = i2 + 1) < 0) {
                    C41341q.m119916s();
                }
            }
        } else {
            i2 = 0;
        }
        Long l2 = null;
        if (i2 == 1) {
            Iterator it = eVar.mo94232a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C40253f) obj).mo94257q()) {
                    break;
                }
            }
            C40253f fVar = (C40253f) obj;
            if (fVar != null) {
                l2 = Long.valueOf(fVar.mo94250j());
            }
        }
        return new C34366d.C34371e(l2, C32343x.m95388F("products.cas.service", new Object[0]), new Amount(d, dVar.mo94226a()), Integer.valueOf(C36270d.product_group_piggy_bank), C27685a.PIGGY_BANK, false, (String) null, (Integer) null, (Integer) null, i, 448, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: ge.bog.mobilebank.products.presentation.products.d$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: ge.bog.mobilebank.products.presentation.products.d$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v36, resolved type: ge.bog.mobilebank.products.presentation.products.d$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: ge.bog.mobilebank.products.presentation.products.d$d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo71317n(java.util.List r9) {
        /*
            r8 = this;
            java.lang.String r0 = "productTypes"
            kotlin.jvm.internal.C41536l.m120489i(r9, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x000e:
            boolean r1 = r9.hasNext()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0074
            java.lang.Object r1 = r9.next()
            r4 = r1
            q70.b r4 = (q70.C27686b) r4
            q70.a r5 = r4.mo67222a()
            q70.a r6 = q70.C27685a.ACC_TYPE_ACCOUNT
            if (r5 == r6) goto L_0x006d
            q70.a r5 = r4.mo67222a()
            q70.a r6 = q70.C27685a.ACC_TYPE_CREDIT_CARD
            if (r5 == r6) goto L_0x006d
            q70.a r5 = r4.mo67222a()
            q70.a r6 = q70.C27685a.ACC_TYPE_DEPOSIT
            if (r5 == r6) goto L_0x006d
            q70.a r5 = r4.mo67222a()
            q70.a r6 = q70.C27685a.ACC_TYPE_LOAN
            if (r5 == r6) goto L_0x006d
            q70.a r5 = r4.mo67222a()
            q70.a r6 = q70.C27685a.ACC_TYPE_GT
            if (r5 == r6) goto L_0x006d
            q70.a r5 = r4.mo67222a()
            q70.a r6 = q70.C27685a.ACC_TYPE_PENSION
            if (r5 == r6) goto L_0x006d
            q70.a r5 = r4.mo67222a()
            q70.a r6 = q70.C27685a.TYPE_GTP_TRADING
            if (r5 == r6) goto L_0x006d
            q70.a r5 = r4.mo67222a()
            q70.a r6 = q70.C27685a.PIGGY_BANK
            if (r5 == r6) goto L_0x006d
            q70.a r5 = r4.mo67222a()
            q70.a r6 = q70.C27685a.BNPL
            if (r5 == r6) goto L_0x006d
            q70.a r4 = r4.mo67222a()
            q70.a r5 = q70.C27685a.GIFT_CARD_OWNER
            if (r4 != r5) goto L_0x006e
        L_0x006d:
            r2 = r3
        L_0x006e:
            if (r2 == 0) goto L_0x000e
            r0.add(r1)
            goto L_0x000e
        L_0x0074:
            java.util.ArrayList r9 = new java.util.ArrayList
            r1 = 10
            int r1 = ie1.C41343r.m119925u(r0, r1)
            r9.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x0083:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00a3
            java.lang.Object r1 = r0.next()
            q70.b r1 = (q70.C27686b) r1
            ge.bog.mobilebank.products.presentation.products.d$d r4 = new ge.bog.mobilebank.products.presentation.products.d$d
            q70.a r5 = r1.mo67222a()
            kotlin.jvm.internal.C41536l.m120486f(r5)
            java.lang.String r1 = r1.mo67223b()
            r4.<init>(r5, r1)
            r9.add(r4)
            goto L_0x0083
        L_0x00a3:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r9.iterator()
        L_0x00ac:
            boolean r4 = r1.hasNext()
            r5 = 0
            if (r4 == 0) goto L_0x00c8
            java.lang.Object r4 = r1.next()
            r6 = r4
            ge.bog.mobilebank.products.presentation.products.d$d r6 = (p341ge.bog.mobilebank.products.presentation.products.C34366d.C34370d) r6
            q70.a r6 = r6.mo82745b()
            q70.a r7 = q70.C27685a.ACC_TYPE_ACCOUNT
            if (r6 != r7) goto L_0x00c4
            r6 = r3
            goto L_0x00c5
        L_0x00c4:
            r6 = r2
        L_0x00c5:
            if (r6 == 0) goto L_0x00ac
            goto L_0x00c9
        L_0x00c8:
            r4 = r5
        L_0x00c9:
            ge.bog.mobilebank.products.presentation.products.d$d r4 = (p341ge.bog.mobilebank.products.presentation.products.C34366d.C34370d) r4
            if (r4 == 0) goto L_0x00d0
            r0.add(r4)
        L_0x00d0:
            java.util.Iterator r1 = r9.iterator()
        L_0x00d4:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x00ef
            java.lang.Object r4 = r1.next()
            r6 = r4
            ge.bog.mobilebank.products.presentation.products.d$d r6 = (p341ge.bog.mobilebank.products.presentation.products.C34366d.C34370d) r6
            q70.a r6 = r6.mo82745b()
            q70.a r7 = q70.C27685a.ACC_TYPE_CREDIT_CARD
            if (r6 != r7) goto L_0x00eb
            r6 = r3
            goto L_0x00ec
        L_0x00eb:
            r6 = r2
        L_0x00ec:
            if (r6 == 0) goto L_0x00d4
            goto L_0x00f0
        L_0x00ef:
            r4 = r5
        L_0x00f0:
            ge.bog.mobilebank.products.presentation.products.d$d r4 = (p341ge.bog.mobilebank.products.presentation.products.C34366d.C34370d) r4
            if (r4 == 0) goto L_0x0121
            int r1 = r0.size()
            if (r1 <= 0) goto L_0x011e
            int r1 = r0.size()
            int r1 = r1 - r3
            java.lang.Object r1 = r0.get(r1)
            ge.bog.mobilebank.products.presentation.products.d$d r1 = (p341ge.bog.mobilebank.products.presentation.products.C34366d.C34370d) r1
            q70.a r1 = r1.mo82745b()
            q70.a r6 = q70.C27685a.ACC_TYPE_ACCOUNT
            if (r1 != r6) goto L_0x011e
            int r1 = r0.size()
            int r1 = r1 - r3
            java.lang.Object r1 = r0.get(r1)
            ge.bog.mobilebank.products.presentation.products.d$d r1 = (p341ge.bog.mobilebank.products.presentation.products.C34366d.C34370d) r1
            r1.mo82746c(r3)
            r4.mo82746c(r3)
        L_0x011e:
            r0.add(r4)
        L_0x0121:
            java.util.Iterator r1 = r9.iterator()
        L_0x0125:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0140
            java.lang.Object r4 = r1.next()
            r6 = r4
            ge.bog.mobilebank.products.presentation.products.d$d r6 = (p341ge.bog.mobilebank.products.presentation.products.C34366d.C34370d) r6
            q70.a r6 = r6.mo82745b()
            q70.a r7 = q70.C27685a.ACC_TYPE_DEPOSIT
            if (r6 != r7) goto L_0x013c
            r6 = r3
            goto L_0x013d
        L_0x013c:
            r6 = r2
        L_0x013d:
            if (r6 == 0) goto L_0x0125
            goto L_0x0141
        L_0x0140:
            r4 = r5
        L_0x0141:
            ge.bog.mobilebank.products.presentation.products.d$d r4 = (p341ge.bog.mobilebank.products.presentation.products.C34366d.C34370d) r4
            if (r4 == 0) goto L_0x0148
            r0.add(r4)
        L_0x0148:
            java.util.Iterator r1 = r9.iterator()
        L_0x014c:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0167
            java.lang.Object r4 = r1.next()
            r6 = r4
            ge.bog.mobilebank.products.presentation.products.d$d r6 = (p341ge.bog.mobilebank.products.presentation.products.C34366d.C34370d) r6
            q70.a r6 = r6.mo82745b()
            q70.a r7 = q70.C27685a.PIGGY_BANK
            if (r6 != r7) goto L_0x0163
            r6 = r3
            goto L_0x0164
        L_0x0163:
            r6 = r2
        L_0x0164:
            if (r6 == 0) goto L_0x014c
            goto L_0x0168
        L_0x0167:
            r4 = r5
        L_0x0168:
            ge.bog.mobilebank.products.presentation.products.d$d r4 = (p341ge.bog.mobilebank.products.presentation.products.C34366d.C34370d) r4
            if (r4 == 0) goto L_0x0199
            int r1 = r0.size()
            if (r1 <= 0) goto L_0x0196
            int r1 = r0.size()
            int r1 = r1 - r3
            java.lang.Object r1 = r0.get(r1)
            ge.bog.mobilebank.products.presentation.products.d$d r1 = (p341ge.bog.mobilebank.products.presentation.products.C34366d.C34370d) r1
            q70.a r1 = r1.mo82745b()
            q70.a r6 = q70.C27685a.ACC_TYPE_DEPOSIT
            if (r1 != r6) goto L_0x0196
            int r1 = r0.size()
            int r1 = r1 - r3
            java.lang.Object r1 = r0.get(r1)
            ge.bog.mobilebank.products.presentation.products.d$d r1 = (p341ge.bog.mobilebank.products.presentation.products.C34366d.C34370d) r1
            r1.mo82746c(r3)
            r4.mo82746c(r3)
        L_0x0196:
            r0.add(r4)
        L_0x0199:
            java.util.Iterator r1 = r9.iterator()
        L_0x019d:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x01b8
            java.lang.Object r4 = r1.next()
            r6 = r4
            ge.bog.mobilebank.products.presentation.products.d$d r6 = (p341ge.bog.mobilebank.products.presentation.products.C34366d.C34370d) r6
            q70.a r6 = r6.mo82745b()
            q70.a r7 = q70.C27685a.ACC_TYPE_LOAN
            if (r6 != r7) goto L_0x01b4
            r6 = r3
            goto L_0x01b5
        L_0x01b4:
            r6 = r2
        L_0x01b5:
            if (r6 == 0) goto L_0x019d
            goto L_0x01b9
        L_0x01b8:
            r4 = r5
        L_0x01b9:
            ge.bog.mobilebank.products.presentation.products.d$d r4 = (p341ge.bog.mobilebank.products.presentation.products.C34366d.C34370d) r4
            if (r4 == 0) goto L_0x01c0
            r0.add(r4)
        L_0x01c0:
            java.util.Iterator r1 = r9.iterator()
        L_0x01c4:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x01df
            java.lang.Object r4 = r1.next()
            r6 = r4
            ge.bog.mobilebank.products.presentation.products.d$d r6 = (p341ge.bog.mobilebank.products.presentation.products.C34366d.C34370d) r6
            q70.a r6 = r6.mo82745b()
            q70.a r7 = q70.C27685a.BNPL
            if (r6 != r7) goto L_0x01db
            r6 = r3
            goto L_0x01dc
        L_0x01db:
            r6 = r2
        L_0x01dc:
            if (r6 == 0) goto L_0x01c4
            goto L_0x01e0
        L_0x01df:
            r4 = r5
        L_0x01e0:
            ge.bog.mobilebank.products.presentation.products.d$d r4 = (p341ge.bog.mobilebank.products.presentation.products.C34366d.C34370d) r4
            if (r4 == 0) goto L_0x0211
            int r1 = r0.size()
            if (r1 <= 0) goto L_0x020e
            int r1 = r0.size()
            int r1 = r1 - r3
            java.lang.Object r1 = r0.get(r1)
            ge.bog.mobilebank.products.presentation.products.d$d r1 = (p341ge.bog.mobilebank.products.presentation.products.C34366d.C34370d) r1
            q70.a r1 = r1.mo82745b()
            q70.a r6 = q70.C27685a.ACC_TYPE_LOAN
            if (r1 != r6) goto L_0x020e
            int r1 = r0.size()
            int r1 = r1 - r3
            java.lang.Object r1 = r0.get(r1)
            ge.bog.mobilebank.products.presentation.products.d$d r1 = (p341ge.bog.mobilebank.products.presentation.products.C34366d.C34370d) r1
            r1.mo82746c(r3)
            r4.mo82746c(r3)
        L_0x020e:
            r0.add(r4)
        L_0x0211:
            java.util.Iterator r1 = r9.iterator()
        L_0x0215:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0230
            java.lang.Object r4 = r1.next()
            r6 = r4
            ge.bog.mobilebank.products.presentation.products.d$d r6 = (p341ge.bog.mobilebank.products.presentation.products.C34366d.C34370d) r6
            q70.a r6 = r6.mo82745b()
            q70.a r7 = q70.C27685a.GIFT_CARD_OWNER
            if (r6 != r7) goto L_0x022c
            r6 = r3
            goto L_0x022d
        L_0x022c:
            r6 = r2
        L_0x022d:
            if (r6 == 0) goto L_0x0215
            goto L_0x0231
        L_0x0230:
            r4 = r5
        L_0x0231:
            ge.bog.mobilebank.products.presentation.products.d$d r4 = (p341ge.bog.mobilebank.products.presentation.products.C34366d.C34370d) r4
            if (r4 == 0) goto L_0x0238
            r0.add(r4)
        L_0x0238:
            java.util.Iterator r1 = r9.iterator()
        L_0x023c:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0257
            java.lang.Object r4 = r1.next()
            r6 = r4
            ge.bog.mobilebank.products.presentation.products.d$d r6 = (p341ge.bog.mobilebank.products.presentation.products.C34366d.C34370d) r6
            q70.a r6 = r6.mo82745b()
            q70.a r7 = q70.C27685a.ACC_TYPE_GT
            if (r6 != r7) goto L_0x0253
            r6 = r3
            goto L_0x0254
        L_0x0253:
            r6 = r2
        L_0x0254:
            if (r6 == 0) goto L_0x023c
            goto L_0x0258
        L_0x0257:
            r4 = r5
        L_0x0258:
            ge.bog.mobilebank.products.presentation.products.d$d r4 = (p341ge.bog.mobilebank.products.presentation.products.C34366d.C34370d) r4
            if (r4 == 0) goto L_0x025f
            r0.add(r4)
        L_0x025f:
            java.util.Iterator r1 = r9.iterator()
        L_0x0263:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x027e
            java.lang.Object r4 = r1.next()
            r6 = r4
            ge.bog.mobilebank.products.presentation.products.d$d r6 = (p341ge.bog.mobilebank.products.presentation.products.C34366d.C34370d) r6
            q70.a r6 = r6.mo82745b()
            q70.a r7 = q70.C27685a.ACC_TYPE_PENSION
            if (r6 != r7) goto L_0x027a
            r6 = r3
            goto L_0x027b
        L_0x027a:
            r6 = r2
        L_0x027b:
            if (r6 == 0) goto L_0x0263
            goto L_0x027f
        L_0x027e:
            r4 = r5
        L_0x027f:
            ge.bog.mobilebank.products.presentation.products.d$d r4 = (p341ge.bog.mobilebank.products.presentation.products.C34366d.C34370d) r4
            if (r4 == 0) goto L_0x02b0
            int r1 = r0.size()
            if (r1 <= 0) goto L_0x02ad
            int r1 = r0.size()
            int r1 = r1 - r3
            java.lang.Object r1 = r0.get(r1)
            ge.bog.mobilebank.products.presentation.products.d$d r1 = (p341ge.bog.mobilebank.products.presentation.products.C34366d.C34370d) r1
            q70.a r1 = r1.mo82745b()
            q70.a r6 = q70.C27685a.ACC_TYPE_GT
            if (r1 != r6) goto L_0x02ad
            int r1 = r0.size()
            int r1 = r1 - r3
            java.lang.Object r1 = r0.get(r1)
            ge.bog.mobilebank.products.presentation.products.d$d r1 = (p341ge.bog.mobilebank.products.presentation.products.C34366d.C34370d) r1
            r1.mo82746c(r3)
            r4.mo82746c(r3)
        L_0x02ad:
            r0.add(r4)
        L_0x02b0:
            java.util.Iterator r9 = r9.iterator()
        L_0x02b4:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x02cf
            java.lang.Object r1 = r9.next()
            r4 = r1
            ge.bog.mobilebank.products.presentation.products.d$d r4 = (p341ge.bog.mobilebank.products.presentation.products.C34366d.C34370d) r4
            q70.a r4 = r4.mo82745b()
            q70.a r6 = q70.C27685a.TYPE_GTP_TRADING
            if (r4 != r6) goto L_0x02cb
            r4 = r3
            goto L_0x02cc
        L_0x02cb:
            r4 = r2
        L_0x02cc:
            if (r4 == 0) goto L_0x02b4
            r5 = r1
        L_0x02cf:
            ge.bog.mobilebank.products.presentation.products.d$d r5 = (p341ge.bog.mobilebank.products.presentation.products.C34366d.C34370d) r5
            if (r5 == 0) goto L_0x02d6
            r0.add(r5)
        L_0x02d6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b01.C31104a.mo71317n(java.util.List):java.util.List");
    }
}
