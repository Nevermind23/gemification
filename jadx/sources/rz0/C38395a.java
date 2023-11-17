package rz0;

import android.app.Application;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.utils.Utils;
import d01.C31513a;
import dk0.C20031a;
import dk0.C20032b;
import dk0.C20036f;
import g91.C32289b0;
import g91.C32303f;
import g91.C32307h;
import g91.C32343x;
import h50.C24882b;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m70.C26157j;
import o70.C26763b;
import o70.C26765d;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.mobilebank.products.domain.model.BillInfo;
import p341ge.bog.mobilebank.products.domain.model.CreditCardAccount;
import p341ge.bog.mobilebank.products.presentation.details.creditcard.C33950d;
import p683yh.C18917a;
import p760fw.C20575a;
import p793iw.C25263b;
import p793iw.C25264c;
import sz0.C38608b;
import ue1.C43064a;
import ue1.C43075l;
import xy0.C39946j;
import xy0.C39956t;

/* renamed from: rz0.a */
public final class C38395a {

    /* renamed from: c */
    public static final C38396a f91980c = new C38396a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final Application f91981a;

    /* renamed from: b */
    private final C38399b f91982b;

    /* renamed from: rz0.a$a */
    public static final class C38396a {
        private C38396a() {
        }

        public /* synthetic */ C38396a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: rz0.a$b */
    public static final class C38397b implements Comparator {
        public final int compare(Object obj, Object obj2) {
            return C41506d.m120406e(Long.valueOf(((C25263b) obj2).mo63839v()), Long.valueOf(((C25263b) obj).mo63839v()));
        }
    }

    /* renamed from: rz0.a$c */
    static final class C38398c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43075l f91983d;

        /* renamed from: e */
        final /* synthetic */ boolean f91984e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38398c(C43075l lVar, boolean z) {
            super(0);
            this.f91983d = lVar;
            this.f91984e = z;
        }

        public final void invoke() {
            this.f91983d.invoke(Boolean.valueOf(this.f91984e));
        }
    }

    public C38395a(Application application, C38399b bVar) {
        C41536l.m120489i(application, "application");
        C41536l.m120489i(bVar, "productsMapper");
        this.f91981a = application;
        this.f91982b = bVar;
    }

    /* renamed from: h */
    private final C20032b m112759h(C26765d dVar) {
        return new C20032b(dVar.mo66047z(), m112760j(dVar.mo66022d()), m112761k(dVar.mo66022d()));
    }

    /* renamed from: j */
    private final C20031a m112760j(String str) {
        String[] strArr = C32307h.f79721c;
        C41536l.m120488h(strArr, "card_classes_amex");
        if (C41333m.m119794s(strArr, str)) {
            return C20031a.CARD_NETWORK_AMEX;
        }
        String[] strArr2 = C32307h.f79719a;
        C41536l.m120488h(strArr2, "card_classes_visa");
        if (C41333m.m119794s(strArr2, str)) {
            return C20031a.CARD_NETWORK_VISA;
        }
        return C20031a.CARD_NETWORK_MASTERCARD;
    }

    /* renamed from: k */
    private final C20036f m112761k(String str) {
        String[] strArr = C32307h.f79721c;
        C41536l.m120488h(strArr, "card_classes_amex");
        if (C41333m.m119794s(strArr, str)) {
            return C20036f.TOKEN_PROVIDER_AMEX;
        }
        String[] strArr2 = C32307h.f79719a;
        C41536l.m120488h(strArr2, "card_classes_visa");
        if (C41333m.m119794s(strArr2, str)) {
            return C20036f.TOKEN_PROVIDER_VISA;
        }
        return C20036f.TOKEN_PROVIDER_MASTERCARD;
    }

    /* renamed from: a */
    public final C33950d.C33951a mo91910a(List list) {
        String str;
        boolean z;
        String str2;
        String str3;
        ArrayList arrayList = new ArrayList();
        boolean z2 = true;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C26765d dVar = (C26765d) it.next();
                C26763b f = dVar.mo66025f();
                if (f != null) {
                    str = f.mo65986c();
                } else {
                    str = null;
                }
                String c = C32289b0.m95091c(str);
                long j = dVar.mo66030j();
                String l = dVar.mo66032l();
                if (l == null || l.length() == 0) {
                    z = z2;
                } else {
                    z = false;
                }
                if (!z) {
                    str2 = dVar.mo66032l();
                    C41536l.m120486f(str2);
                } else {
                    str2 = C32343x.m95388F(dVar.mo65996A(), new Object[0]);
                }
                String str4 = str2;
                if (c == null) {
                    c = "";
                } else {
                    C41536l.m120488h(c, "imageUrl ?: \"\"");
                }
                Image.Url url = new Image.Url(c, (Image.Placeholder) null, (Image.Placeholder) null, (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 126, (DefaultConstructorMarker) null);
                String z3 = dVar.mo66047z();
                boolean T = dVar.mo66015T();
                if (dVar.mo66011P()) {
                    str3 = String.valueOf(dVar.mo66039s());
                } else {
                    str3 = null;
                }
                boolean S = dVar.mo66014S();
                boolean z4 = !dVar.mo66012Q();
                String format = new SimpleDateFormat("MM/yy").format(new Date(dVar.mo66042u()));
                C41536l.m120488h(format, "SimpleDateFormat(CARD_EX…ormat(Date(card.expDate))");
                arrayList.add(new C38608b(new C18917a(j, str4, url, z3, T, str3, S, false, z4, (String) null, format, (Integer) null, 2688, (DefaultConstructorMarker) null), dVar.mo66018W(), (String) null, 4, (DefaultConstructorMarker) null));
                z2 = true;
            }
        }
        if (!arrayList.isEmpty()) {
            return new C33950d.C33951a(arrayList);
        }
        return null;
    }

    /* renamed from: b */
    public final C33950d.C33952b mo91911b(CreditCardAccount creditCardAccount, C39946j jVar, List list) {
        C26765d dVar;
        String str;
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        String str2;
        String str3;
        String d;
        BigDecimal e;
        Object obj;
        boolean z;
        String str4 = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C26765d) obj).mo66035o() != null) {
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
            dVar = (C26765d) obj;
        } else {
            dVar = null;
        }
        if (creditCardAccount == null) {
            return null;
        }
        if (jVar == null || (e = jVar.mo93724e()) == null) {
            str = null;
        } else {
            str = C32343x.m95408P(e, creditCardAccount.mo81947f());
        }
        if (jVar == null || (bigDecimal = jVar.mo93721b()) == null) {
            bigDecimal = new BigDecimal(0);
        }
        String p = C32303f.m95205p(bigDecimal);
        C41536l.m120488h(p, "getFormattedNumber(\n    …imal(0)\n                )");
        if (jVar == null || (bigDecimal2 = jVar.mo93726f()) == null) {
            bigDecimal2 = new BigDecimal(0);
        }
        String p2 = C32303f.m95205p(bigDecimal2);
        C41536l.m120488h(p2, "getFormattedNumber(\n    …imal(0)\n                )");
        if (jVar == null || (d = jVar.mo93723d()) == null) {
            if (dVar != null) {
                str4 = dVar.mo66035o();
            }
            str2 = str4;
        } else {
            str2 = d;
        }
        if (jVar == null || (str3 = jVar.mo93722c()) == null) {
            str3 = "";
        }
        return new C33950d.C33952b(str, p, p2, str2, str3);
    }

    /* renamed from: c */
    public final C33950d.C33954d mo91912c(BillInfo billInfo) {
        Date date;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String Q;
        String Q2;
        String Q3;
        String Q4;
        String Q5;
        if (billInfo == null) {
            return null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMMM, yyyy ");
        Long j = billInfo.mo81917j();
        if (j != null) {
            date = new Date(j.longValue());
        } else {
            date = "";
        }
        String format = simpleDateFormat.format(date);
        C41536l.m120488h(format, "billDate");
        Double e = billInfo.mo81910e();
        if (e == null || (Q5 = C32343x.m95410Q(e.doubleValue(), billInfo.mo81908d(), false, 2, (Object) null)) == null) {
            str = "";
        } else {
            str = Q5;
        }
        Double m = billInfo.mo81920m();
        if (m == null || (Q4 = C32343x.m95410Q(m.doubleValue(), billInfo.mo81908d(), false, 2, (Object) null)) == null) {
            str2 = "";
        } else {
            str2 = Q4;
        }
        Double b = billInfo.mo81907b();
        if (b == null || (Q3 = C32343x.m95410Q(b.doubleValue(), billInfo.mo81908d(), false, 2, (Object) null)) == null) {
            str3 = "";
        } else {
            str3 = Q3;
        }
        Double k = billInfo.mo81918k();
        if (k == null || (Q2 = C32343x.m95410Q(k.doubleValue(), billInfo.mo81908d(), false, 2, (Object) null)) == null) {
            str4 = "";
        } else {
            str4 = Q2;
        }
        Double f = billInfo.mo81912f();
        if (f == null || (Q = C32343x.m95410Q(f.doubleValue(), billInfo.mo81908d(), false, 2, (Object) null)) == null) {
            str5 = "";
        } else {
            str5 = Q;
        }
        return new C33950d.C33954d(format, str, str2, str3, str4, str5);
    }

    /* renamed from: d */
    public final C33950d.C33961k mo91913d(List list, long j, List list2, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        List list3 = list;
        List list4 = list2;
        C41536l.m120489i(list4, "closableAccounts");
        if (list3 == null || !list.contains("REIMBURSEMENT")) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (list3 == null || !list.contains("STATEMENT")) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (list3 == null || !list.contains("REQUISITE_PRINT")) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (list3 == null || !list.contains("P2P_PAYMENT_TOPUP_I")) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (!z5 || !z) {
            z6 = false;
        } else {
            z6 = true;
        }
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list4, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((C26157j) it.next()).mo65194a()));
        }
        return new C33950d.C33961k(j, z2, true, z3, z4, z6, arrayList.contains(Long.valueOf(j)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v21, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v23, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v25, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v18, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v19, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v20, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v31, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v33, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v34, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v47, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v48, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00fd, code lost:
        if (r9 != null) goto L_0x0100;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r7v1, types: [int, boolean] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01a1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01a7  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo91914e(he1.C41224m r34, ue1.C43075l r35) {
        /*
            r33 = this;
            r0 = r33
            r1 = r35
            java.lang.String r2 = "accountsAndCards"
            r3 = r34
            kotlin.jvm.internal.C41536l.m120489i(r3, r2)
            java.lang.String r2 = "badgeClickListener"
            kotlin.jvm.internal.C41536l.m120489i(r1, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.Object r4 = r34.mo95678e()
            xy0.l r4 = (xy0.C39948l) r4
            xy0.f r4 = r4.mo93735b()
            java.util.List r4 = r4.mo93700a()
            if (r4 == 0) goto L_0x02b2
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x002e:
            boolean r6 = r4.hasNext()
            r7 = 1
            r8 = 0
            if (r6 == 0) goto L_0x0080
            java.lang.Object r6 = r4.next()
            r9 = r6
            ge.bog.mobilebank.products.domain.model.CreditCardAccount r9 = (p341ge.bog.mobilebank.products.domain.model.CreditCardAccount) r9
            java.lang.Object r10 = r34.mo95680f()
            o70.e r10 = (o70.C26766e) r10
            java.util.Map r10 = r10.mo66048a()
            long r11 = r9.mo81941a()
            java.lang.Long r9 = java.lang.Long.valueOf(r11)
            java.lang.Object r9 = r10.get(r9)
            java.util.List r9 = (java.util.List) r9
            if (r9 == 0) goto L_0x0079
            boolean r10 = r9.isEmpty()
            if (r10 == 0) goto L_0x005f
        L_0x005d:
            r9 = r8
            goto L_0x0076
        L_0x005f:
            java.util.Iterator r9 = r9.iterator()
        L_0x0063:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x005d
            java.lang.Object r10 = r9.next()
            o70.d r10 = (o70.C26765d) r10
            boolean r10 = r10.mo66016U()
            if (r10 == 0) goto L_0x0063
            r9 = r7
        L_0x0076:
            if (r9 != r7) goto L_0x0079
            r8 = r7
        L_0x0079:
            r7 = r7 ^ r8
            if (r7 == 0) goto L_0x002e
            r5.add(r6)
            goto L_0x002e
        L_0x0080:
            java.util.Iterator r4 = r5.iterator()
        L_0x0084:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x02b2
            java.lang.Object r5 = r4.next()
            ge.bog.mobilebank.products.domain.model.CreditCardAccount r5 = (p341ge.bog.mobilebank.products.domain.model.CreditCardAccount) r5
            java.lang.String r6 = r5.mo81942b()
            int r9 = r6.length()
            if (r9 != 0) goto L_0x009c
            r9 = r7
            goto L_0x009d
        L_0x009c:
            r9 = r8
        L_0x009d:
            if (r9 == 0) goto L_0x00a9
            java.lang.String r6 = r5.mo81951i()
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.String r6 = g91.C32343x.m95388F(r6, r9)
        L_0x00a9:
            r10 = r6
            ti.a[] r6 = new p617ti.C17966a[r7]
            ti.a r9 = new ti.a
            double r11 = r5.mo81943d()
            java.lang.String r13 = r5.mo81947f()
            r9.<init>(r11, r13)
            r6[r8] = r9
            java.util.List r11 = ie1.C41341q.m119913p(r6)
            java.lang.Object r6 = r34.mo95680f()
            o70.e r6 = (o70.C26766e) r6
            java.util.Map r6 = r6.mo66048a()
            long r12 = r5.mo81941a()
            java.lang.Long r9 = java.lang.Long.valueOf(r12)
            java.lang.Object r6 = r6.get(r9)
            java.util.List r6 = (java.util.List) r6
            r19 = 0
            if (r6 == 0) goto L_0x0102
            java.util.Iterator r9 = r6.iterator()
        L_0x00df:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L_0x00f3
            java.lang.Object r12 = r9.next()
            r13 = r12
            o70.d r13 = (o70.C26765d) r13
            boolean r13 = r13.mo66013R()
            if (r13 == 0) goto L_0x00df
            goto L_0x00f5
        L_0x00f3:
            r12 = r19
        L_0x00f5:
            o70.d r12 = (o70.C26765d) r12
            if (r12 == 0) goto L_0x0102
            o70.b r9 = r12.mo66043v()
            if (r9 != 0) goto L_0x0100
            goto L_0x0102
        L_0x0100:
            r6 = r9
            goto L_0x0129
        L_0x0102:
            if (r6 == 0) goto L_0x0127
            java.util.Iterator r6 = r6.iterator()
        L_0x0108:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x011c
            java.lang.Object r9 = r6.next()
            r12 = r9
            o70.d r12 = (o70.C26765d) r12
            boolean r12 = r12.mo66017V()
            if (r12 == 0) goto L_0x0108
            goto L_0x011e
        L_0x011c:
            r9 = r19
        L_0x011e:
            o70.d r9 = (o70.C26765d) r9
            if (r9 == 0) goto L_0x0127
            o70.b r9 = r9.mo66043v()
            goto L_0x0100
        L_0x0127:
            r6 = r19
        L_0x0129:
            if (r6 == 0) goto L_0x0130
            java.lang.String r9 = r6.mo65986c()
            goto L_0x0132
        L_0x0130:
            r9 = r19
        L_0x0132:
            java.lang.String r22 = g91.C32289b0.m95091c(r9)
            java.lang.Object r9 = r34.mo95680f()
            o70.e r9 = (o70.C26766e) r9
            java.util.Map r9 = r9.mo66048a()
            long r12 = r5.mo81941a()
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            java.lang.Object r9 = r9.get(r12)
            java.util.List r9 = (java.util.List) r9
            if (r9 == 0) goto L_0x0173
            boolean r12 = r9.isEmpty()
            if (r12 == 0) goto L_0x0158
        L_0x0156:
            r9 = r8
            goto L_0x016f
        L_0x0158:
            java.util.Iterator r9 = r9.iterator()
        L_0x015c:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L_0x0156
            java.lang.Object r12 = r9.next()
            o70.d r12 = (o70.C26765d) r12
            boolean r12 = r12.mo66013R()
            if (r12 == 0) goto L_0x015c
            r9 = r7
        L_0x016f:
            if (r9 != r7) goto L_0x0173
            r15 = r7
            goto L_0x0174
        L_0x0173:
            r15 = r8
        L_0x0174:
            java.lang.Object r9 = r34.mo95678e()
            xy0.l r9 = (xy0.C39948l) r9
            java.util.List r9 = r9.mo93734a()
            java.util.Iterator r9 = r9.iterator()
        L_0x0182:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L_0x01a1
            java.lang.Object r12 = r9.next()
            r13 = r12
            ge.bog.mobilebank.products.domain.model.BillInfo r13 = (p341ge.bog.mobilebank.products.domain.model.BillInfo) r13
            long r16 = r5.mo81941a()
            long r13 = r13.mo81906a()
            int r13 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
            if (r13 != 0) goto L_0x019d
            r13 = r7
            goto L_0x019e
        L_0x019d:
            r13 = r8
        L_0x019e:
            if (r13 == 0) goto L_0x0182
            goto L_0x01a3
        L_0x01a1:
            r12 = r19
        L_0x01a3:
            ge.bog.mobilebank.products.domain.model.BillInfo r12 = (p341ge.bog.mobilebank.products.domain.model.BillInfo) r12
            if (r12 == 0) goto L_0x0259
            java.lang.Long r9 = r12.mo81913g()
            if (r9 == 0) goto L_0x01ba
            long r13 = r9.longValue()
            android.app.Application r9 = r0.f91981a
            java.lang.String r9 = g91.C32319m.m95298e(r13, r7, r9)
            r26 = r9
            goto L_0x01bc
        L_0x01ba:
            r26 = r19
        L_0x01bc:
            java.lang.Long r9 = r12.mo81913g()
            if (r9 == 0) goto L_0x01da
            long r13 = r9.longValue()
            java.util.Calendar r9 = java.util.Calendar.getInstance()
            r9.setTimeInMillis(r13)
            r13 = 5
            r9.add(r13, r7)
            long r13 = r9.getTimeInMillis()
            java.lang.Long r9 = java.lang.Long.valueOf(r13)
            goto L_0x01dc
        L_0x01da:
            r9 = r19
        L_0x01dc:
            double r13 = r12.mo81919l()
            r16 = 0
            int r13 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r13 <= 0) goto L_0x01f6
            if (r9 == 0) goto L_0x01f6
            long r13 = r9.longValue()
            long r20 = java.lang.System.currentTimeMillis()
            int r9 = (r13 > r20 ? 1 : (r13 == r20 ? 0 : -1))
            if (r9 >= 0) goto L_0x01f6
            r9 = r7
            goto L_0x01f7
        L_0x01f6:
            r9 = r8
        L_0x01f7:
            double r13 = r12.mo81921p()
            int r13 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r13 <= 0) goto L_0x0201
            r13 = r7
            goto L_0x0202
        L_0x0201:
            r13 = r8
        L_0x0202:
            if (r9 == 0) goto L_0x020d
            android.app.Application r14 = r0.f91981a
            int r7 = hy0.C36274h.overdue
            java.lang.String r7 = r14.getString(r7)
            goto L_0x0220
        L_0x020d:
            if (r13 == 0) goto L_0x0218
            android.app.Application r7 = r0.f91981a
            int r14 = hy0.C36274h.f87563P
            java.lang.String r7 = r7.getString(r14)
            goto L_0x0220
        L_0x0218:
            android.app.Application r7 = r0.f91981a
            int r14 = hy0.C36274h.next_payment
            java.lang.String r7 = r7.getString(r14)
        L_0x0220:
            java.lang.String r14 = "when {\n                 …                        }"
            kotlin.jvm.internal.C41536l.m120488h(r7, r14)
            if (r9 != 0) goto L_0x022d
            if (r13 == 0) goto L_0x022a
            goto L_0x022d
        L_0x022a:
            r24 = r8
            goto L_0x022f
        L_0x022d:
            r24 = 1
        L_0x022f:
            double r27 = r12.mo81919l()
            java.lang.String r29 = r12.mo81908d()
            r30 = 0
            r31 = 2
            r32 = 0
            java.lang.String r27 = g91.C32343x.m95410Q(r27, r29, r30, r31, r32)
            dj.g r9 = new dj.g
            r28 = 0
            r29 = 0
            rz0.a$c r12 = new rz0.a$c
            r12.<init>(r1, r13)
            r31 = 48
            r23 = r9
            r25 = r7
            r30 = r12
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r14 = r9
            goto L_0x025b
        L_0x0259:
            r14 = r19
        L_0x025b:
            dj.a r21 = new dj.a
            r12 = 0
            r13 = 0
            r16 = 0
            r17 = 76
            r18 = 0
            r9 = r21
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            a41.b r7 = new a41.b
            r23 = 0
            if (r6 == 0) goto L_0x0278
            boolean r6 = r6.mo65987d()
            java.lang.Boolean r19 = java.lang.Boolean.valueOf(r6)
        L_0x0278:
            r6 = r19
            if (r6 != 0) goto L_0x0281
            ge.bog.designsystem.components.productheader.NewProductHeaderView$a r6 = p341ge.bog.designsystem.components.productheader.NewProductHeaderView.C13482a.COLOR
        L_0x027e:
            r24 = r6
            goto L_0x0297
        L_0x0281:
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r6, r9)
            if (r9 == 0) goto L_0x028c
            ge.bog.designsystem.components.productheader.NewProductHeaderView$a r6 = p341ge.bog.designsystem.components.productheader.NewProductHeaderView.C13482a.BLACK
            goto L_0x027e
        L_0x028c:
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            boolean r6 = kotlin.jvm.internal.C41536l.m120484d(r6, r9)
            if (r6 == 0) goto L_0x02ac
            ge.bog.designsystem.components.productheader.NewProductHeaderView$a r6 = p341ge.bog.designsystem.components.productheader.NewProductHeaderView.C13482a.WHITE
            goto L_0x027e
        L_0x0297:
            long r25 = r5.mo81941a()
            r27 = 0
            r28 = 32
            r29 = 0
            r20 = r7
            r20.<init>(r21, r22, r23, r24, r25, r27, r28, r29)
            r2.add(r7)
            r7 = 1
            goto L_0x0084
        L_0x02ac:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        L_0x02b2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: rz0.C38395a.mo91914e(he1.m, ue1.l):java.util.List");
    }

    /* renamed from: f */
    public final List mo91915f(C25264c cVar) {
        String str;
        String str2;
        double d;
        String f;
        C41536l.m120489i(cVar, "transactions");
        ArrayList arrayList = new ArrayList();
        String str3 = "";
        for (C25263b bVar : C41358y.m120030t0(cVar.mo63846d(), new C38397b())) {
            String format = new SimpleDateFormat("dd MMM, yyyy").format(new Date(bVar.mo63839v()));
            if (!C41536l.m120484d(format, str3)) {
                C41536l.m120488h(format, "date");
                arrayList.add(new C33950d.C33962l(format));
                str3 = format;
            }
            String c = C32289b0.m95091c(bVar.mo63834r());
            String w = bVar.mo63840w();
            if (w == null) {
                str = "";
            } else {
                str = w;
            }
            C20575a j = bVar.mo63826j();
            if (j == null || (f = j.mo49107f()) == null) {
                str2 = "";
            } else {
                str2 = f;
            }
            BigDecimal c2 = bVar.mo63817c();
            if (c2 != null) {
                d = c2.doubleValue();
            } else {
                d = Utils.DOUBLE_EPSILON;
            }
            boolean z = !C41536l.m120484d(bVar.mo63810N(), "F");
            String a = C31513a.m93587a(bVar, this.f91981a);
            C41536l.m120488h(c, "imageUrl");
            String k = bVar.mo63827k();
            if (k == null) {
                k = "GEL";
            }
            arrayList.add(new C33950d.C33960j(str, str2, d, z, a, c, k, C24882b.m79536d(bVar)));
        }
        return arrayList;
    }

    /* renamed from: g */
    public final C33950d.C33966p mo91916g(BillInfo billInfo) {
        Object obj;
        String str = null;
        if (billInfo == null) {
            return null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMMM, yyyy ");
        Long g = billInfo.mo81913g();
        if (g != null) {
            obj = new Date(g.longValue());
        } else {
            obj = "";
        }
        String format = simpleDateFormat.format(obj);
        String Q = C32343x.m95410Q(billInfo.mo81919l(), billInfo.mo81908d(), false, 2, (Object) null);
        Double i = billInfo.mo81916i();
        if (i != null) {
            str = C32343x.m95410Q(i.doubleValue(), billInfo.mo81908d(), false, 2, (Object) null);
        }
        C41536l.m120488h(format, "paymentDate");
        return new C33950d.C33966p(Q, str, format);
    }

    /* renamed from: i */
    public final List mo91917i(List list) {
        C41536l.m120489i(list, "cards");
        ArrayList<C26765d> arrayList = new ArrayList<>();
        for (Object next : list) {
            if (((C26765d) next).mo66044w()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(arrayList, 10));
        for (C26765d h : arrayList) {
            arrayList2.add(m112759h(h));
        }
        return arrayList2;
    }

    /* renamed from: l */
    public final C33950d.C33955e mo91918l(List list) {
        List m = this.f91982b.mo91929m(list);
        if (m != null) {
            return new C33950d.C33955e(m);
        }
        return null;
    }

    /* renamed from: m */
    public final List mo91919m(List list) {
        List list2 = list;
        C41536l.m120489i(list2, "loanPairs");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list2, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C39956t tVar = (C39956t) it.next();
            long d = tVar.mo93776b().mo93757d();
            String e = tVar.mo93776b().mo93758e();
            if (e == null) {
                e = C32343x.m95388F(tVar.mo93776b().mo93760g(), new Object[0]);
            }
            arrayList.add(new C33950d.C33958h(d, e, C32343x.m95410Q(tVar.mo93776b().mo93755b(), tVar.mo93776b().mo93756c(), false, 2, (Object) null), tVar.mo93775a()));
        }
        return arrayList;
    }
}
