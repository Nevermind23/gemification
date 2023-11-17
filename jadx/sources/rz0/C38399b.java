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
import g91.C32319m;
import g91.C32343x;
import h50.C24882b;
import he1.C41224m;
import he1.C41233s;
import hy0.C36274h;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41527d0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m70.C26150c;
import m70.C26151d;
import m70.C26152e;
import m70.C26153f;
import m70.C26157j;
import o31.C37603j;
import o70.C26763b;
import o70.C26765d;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.creditcard.CreditCardView;
import p341ge.bog.mobilebank.cleanarch.shareddomain.model.cards.CardInsSecCardModel;
import p341ge.bog.mobilebank.products.presentation.details.debitcard.C34093e;
import p341ge.bog.mobilebank.products.presentation.details.models.CardUiModel;
import p617ti.C17966a;
import p669xh.C18763a;
import p683yh.C18917a;
import p760fw.C20575a;
import p793iw.C25263b;
import p793iw.C25264c;
import sz0.C38608b;
import xy0.C39956t;

/* renamed from: rz0.b */
public final class C38399b {

    /* renamed from: b */
    public static final C38400a f91985b = new C38400a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final Application f91986a;

    /* renamed from: rz0.b$a */
    public static final class C38400a {
        private C38400a() {
        }

        public /* synthetic */ C38400a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: rz0.b$b */
    public static final class C38401b implements Comparator {
        public final int compare(Object obj, Object obj2) {
            return C41506d.m120406e(Long.valueOf(((C25263b) obj2).mo63839v()), Long.valueOf(((C25263b) obj).mo63839v()));
        }
    }

    public C38399b(Application application) {
        C41536l.m120489i(application, "application");
        this.f91986a = application;
    }

    /* renamed from: h */
    private final C20032b m112772h(C26765d dVar) {
        return new C20032b(dVar.mo66047z(), m112773j(dVar.mo66022d()), m112774k(dVar.mo66022d()));
    }

    /* renamed from: j */
    private final C20031a m112773j(String str) {
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
    private final C20036f m112774k(String str) {
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

    /* renamed from: l */
    private final List m112775l(List list, String str) {
        Object obj;
        C41536l.m120487g(list, "null cannot be cast to non-null type kotlin.collections.MutableList<ge.bog.designsystem.components.interactiveamount.AmountData>");
        Iterator it = C41527d0.m120456c(list).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C41536l.m120484d(((C17966a) obj).mo45639d(), str)) {
                break;
            }
        }
        C17966a aVar = (C17966a) obj;
        if (aVar != null) {
            list.remove(list.indexOf(aVar));
            list.add(0, aVar);
        }
        return list;
    }

    /* renamed from: a */
    public final C34093e.C34094a mo91921a(List list) {
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
                C41536l.m120488h(format, "SimpleDateFormat(\"MM/yy\"…ormat(Date(card.expDate))");
                C18917a aVar = r6;
                C18917a aVar2 = new C18917a(j, str4, url, z3, T, str3, S, false, z4, (String) null, format, (Integer) null, 2688, (DefaultConstructorMarker) null);
                arrayList.add(new C38608b(aVar, dVar.mo66018W(), dVar.mo66010O()));
                it = it;
                z2 = true;
            }
        }
        if (!arrayList.isEmpty()) {
            return new C34093e.C34094a(arrayList);
        }
        return null;
    }

    /* renamed from: b */
    public final C34093e.C34108o mo91922b(List list, long j, boolean z, List list2, boolean z2) {
        boolean z3;
        int i;
        boolean z4;
        int i2;
        boolean z5;
        int i3;
        boolean z6;
        int i4;
        boolean z7;
        int i5;
        int i6;
        int i7;
        List list3 = list;
        List list4 = list2;
        C41536l.m120489i(list4, "closableAccounts");
        boolean z8 = true;
        if (list3 == null || !list3.contains("OUT_TRANSFER_OWN")) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3) {
            i = 0;
        } else {
            i = 8;
        }
        if (list3 == null || !list3.contains("OUT_TRANSFER_OTHER")) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z4) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        if (list3 == null || !list3.contains("ADD_AMOUNT")) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (z5) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        if (list3 == null || !list3.contains("STATEMENT")) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (z6) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        if (list3 == null || !list3.contains("REQUISITE_PRINT")) {
            z7 = false;
        } else {
            z7 = true;
        }
        if (z7) {
            i5 = 0;
        } else {
            i5 = 8;
        }
        if (list3 == null || !list3.contains("P2P_PAYMENT_TOPUP_I")) {
            z8 = false;
        }
        if (!z8 || !z2) {
            i6 = 8;
        } else {
            i6 = 0;
        }
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list4, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((C26157j) it.next()).mo65194a()));
        }
        if (arrayList.contains(Long.valueOf(j))) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        return new C34093e.C34108o(j, i, i2, z, i3, i4, i5, i6, i7);
    }

    /* renamed from: c */
    public final List mo91923c(C25264c cVar) {
        String str;
        String str2;
        double d;
        String f;
        C41536l.m120489i(cVar, "transactions");
        ArrayList arrayList = new ArrayList();
        String str3 = "";
        for (C25263b bVar : C41358y.m120030t0(cVar.mo63846d(), new C38401b())) {
            String format = new SimpleDateFormat("dd MMM, yyyy").format(new Date(bVar.mo63839v()));
            if (!C41536l.m120484d(format, str3)) {
                C41536l.m120488h(format, "date");
                arrayList.add(new C34093e.C34109p(format));
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
            String a = C31513a.m93587a(bVar, this.f91986a);
            C41536l.m120488h(c, "imageUrl");
            String k = bVar.mo63827k();
            if (k == null) {
                k = "GEL";
            }
            arrayList.add(new C34093e.C34107n(str, str2, d, z, a, c, k, C24882b.m79536d(bVar)));
        }
        return arrayList;
    }

    /* renamed from: d */
    public final List mo91924d(List list) {
        CreditCardView.C13273e eVar;
        List list2 = list;
        C41536l.m120489i(list2, "cards");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list2, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CardUiModel cardUiModel = (CardUiModel) it.next();
            String b = cardUiModel.mo82609b();
            String h = cardUiModel.mo82616h();
            String f = cardUiModel.mo82614f();
            C18763a g = C37603j.m110584g(cardUiModel.mo82612e());
            if (g == null) {
                g = C18763a.VISA;
            }
            C18763a aVar = g;
            String a = cardUiModel.mo82608a();
            if (cardUiModel.mo82618i()) {
                eVar = CreditCardView.C13273e.BLACK;
            } else {
                eVar = CreditCardView.C13273e.WHITE;
            }
            CreditCardView.C13270b bVar = r3;
            CreditCardView.C13270b bVar2 = new CreditCardView.C13270b(b, h, (String) null, (String) null, f, aVar, 0, a, false, false, eVar, cardUiModel.mo82615g(), 76, (DefaultConstructorMarker) null);
            arrayList.add(bVar);
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0057 A[EDGE_INSN: B:57:0x0057->B:24:0x0057 ?: BREAK  , SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo91925e(java.util.List r16, long r17) {
        /*
            r15 = this;
            java.lang.String r0 = "bonusCasServices"
            r1 = r16
            kotlin.jvm.internal.C41536l.m120489i(r1, r0)
            java.util.Iterator r0 = r16.iterator()
        L_0x000b:
            boolean r2 = r0.hasNext()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0056
            java.lang.Object r2 = r0.next()
            r5 = r2
            zs0.f r5 = (zs0.C40253f) r5
            boolean r6 = r5.mo94257q()
            if (r6 == 0) goto L_0x0052
            java.util.List r5 = r5.mo94252l()
            boolean r6 = r5 instanceof java.util.Collection
            if (r6 == 0) goto L_0x0030
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L_0x0030
        L_0x002e:
            r5 = r4
            goto L_0x004e
        L_0x0030:
            java.util.Iterator r5 = r5.iterator()
        L_0x0034:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x002e
            java.lang.Object r6 = r5.next()
            zs0.g r6 = (zs0.C40254g) r6
            long r6 = r6.mo94268a()
            int r6 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
            if (r6 != 0) goto L_0x004a
            r6 = r3
            goto L_0x004b
        L_0x004a:
            r6 = r4
        L_0x004b:
            if (r6 == 0) goto L_0x0034
            r5 = r3
        L_0x004e:
            if (r5 == 0) goto L_0x0052
            r5 = r3
            goto L_0x0053
        L_0x0052:
            r5 = r4
        L_0x0053:
            if (r5 == 0) goto L_0x000b
            goto L_0x0057
        L_0x0056:
            r2 = 0
        L_0x0057:
            zs0.f r2 = (zs0.C40253f) r2
            if (r2 == 0) goto L_0x0061
            java.util.List r0 = ie1.C41339p.m119900e(r2)
            if (r0 != 0) goto L_0x00ab
        L_0x0061:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r16.iterator()
        L_0x006a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00ab
            java.lang.Object r2 = r1.next()
            r5 = r2
            zs0.f r5 = (zs0.C40253f) r5
            java.util.List r5 = r5.mo94239a()
            boolean r6 = r5 instanceof java.util.Collection
            if (r6 == 0) goto L_0x0087
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L_0x0087
        L_0x0085:
            r5 = r4
            goto L_0x00a5
        L_0x0087:
            java.util.Iterator r5 = r5.iterator()
        L_0x008b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0085
            java.lang.Object r6 = r5.next()
            zs0.a r6 = (zs0.C40248a) r6
            long r6 = r6.mo94202a()
            int r6 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
            if (r6 != 0) goto L_0x00a1
            r6 = r3
            goto L_0x00a2
        L_0x00a1:
            r6 = r4
        L_0x00a2:
            if (r6 == 0) goto L_0x008b
            r5 = r3
        L_0x00a5:
            if (r5 == 0) goto L_0x006a
            r0.add(r2)
            goto L_0x006a
        L_0x00ab:
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = ie1.C41343r.m119925u(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x00ba:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00f8
            java.lang.Object r2 = r0.next()
            zs0.f r2 = (zs0.C40253f) r2
            ge.bog.mobilebank.products.presentation.details.debitcard.e$l r3 = new ge.bog.mobilebank.products.presentation.details.debitcard.e$l
            long r6 = r2.mo94250j()
            boolean r5 = r2.mo94257q()
            if (r5 == 0) goto L_0x00d5
            java.lang.String r5 = "products.accounts.cas.service.new"
            goto L_0x00d7
        L_0x00d5:
            java.lang.String r5 = "products.accounts.cas.service.old"
        L_0x00d7:
            java.lang.Object[] r8 = new java.lang.Object[r4]
            java.lang.String r8 = g91.C32343x.m95388F(r5, r8)
            double r9 = r2.mo94266y()
            java.lang.String r11 = r2.mo94264w()
            r12 = 0
            r13 = 2
            r14 = 0
            java.lang.String r9 = g91.C32343x.m95410Q(r9, r11, r12, r13, r14)
            boolean r10 = r2.mo94257q()
            r5 = r3
            r5.<init>(r6, r8, r9, r10)
            r1.add(r3)
            goto L_0x00ba
        L_0x00f8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: rz0.C38399b.mo91925e(java.util.List, long):java.util.List");
    }

    /* renamed from: f */
    public final List mo91926f(List list, C26150c cVar) {
        Object obj;
        String str;
        String str2;
        boolean z;
        C41536l.m120489i(list, "overdraftParams");
        C41536l.m120489i(cVar, "accountDetails");
        ArrayList arrayList = new ArrayList();
        for (C26153f fVar : cVar.mo65138q()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (fVar.mo65165a() == ((C26151d) obj).mo65144a()) {
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
            C26151d dVar = (C26151d) obj;
            String c = fVar.mo65167c();
            if (dVar != null) {
                ArrayList arrayList2 = new ArrayList();
                String str3 = c;
                arrayList2.add(new C41224m(this.f91986a.getString(C36274h.product_details_label_overdraft_used_amount), C32343x.m95410Q(dVar.mo65151g() - dVar.mo65152h(), str3, false, 2, (Object) null)));
                String string = this.f91986a.getString(C36274h.product_details_label_overdraft_yearly_percent);
                String o = C32303f.m95204o(dVar.mo65150f());
                arrayList2.add(new C41224m(string, o + " %"));
                arrayList2.add(new C41224m(this.f91986a.getString(C36274h.product_details_label_overdraft_earned_percent), C32343x.m95410Q(dVar.mo65148e(), str3, false, 2, (Object) null)));
                String string2 = this.f91986a.getString(C36274h.product_details_title_overdraft_valid_until);
                if (dVar.mo65145b() > 0) {
                    str = C32319m.m95298e(dVar.mo65145b(), true, this.f91986a);
                } else {
                    str = this.f91986a.getString(C36274h.perpetual_label);
                }
                arrayList2.add(new C41224m(string2, str));
                long a = fVar.mo65165a();
                String Q = C32343x.m95410Q(dVar.mo65151g(), c, false, 2, (Object) null);
                double g = dVar.mo65151g() - dVar.mo65152h();
                if (dVar.mo65146c() != null) {
                    str2 = dVar.mo65147d();
                } else {
                    str2 = null;
                }
                arrayList.add(new C34093e.C34114u(a, Q, g, arrayList2, str2, dVar.mo65146c()));
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0132, code lost:
        if (r8 != null) goto L_0x0135;
     */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x019f  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo91927g(l70.C25846a r30) {
        /*
            r29 = this;
            java.lang.String r0 = "accountsAndCards"
            r1 = r30
            kotlin.jvm.internal.C41536l.m120489i(r1, r0)
            m70.i r0 = r30.mo64628a()
            o70.e r1 = r30.mo64629b()
            he1.m r0 = he1.C41233s.m119492a(r0, r1)
            java.lang.Object r1 = r0.mo95675a()
            m70.i r1 = (m70.C26156i) r1
            java.lang.Object r0 = r0.mo95676b()
            o70.e r0 = (o70.C26766e) r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            m70.h r3 = r1.mo65188a()
            java.util.List r3 = r3.mo65182a()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0035:
            boolean r5 = r3.hasNext()
            r6 = 1
            if (r5 == 0) goto L_0x004e
            java.lang.Object r5 = r3.next()
            r7 = r5
            m70.a r7 = (m70.C26148a) r7
            boolean r7 = r7.mo65085G()
            r6 = r6 ^ r7
            if (r6 == 0) goto L_0x0035
            r4.add(r5)
            goto L_0x0035
        L_0x004e:
            java.util.Iterator r3 = r4.iterator()
        L_0x0052:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x01cf
            java.lang.Object r4 = r3.next()
            m70.a r4 = (m70.C26148a) r4
            java.lang.String r5 = r4.mo65088c()
            r7 = 0
            if (r5 == 0) goto L_0x006e
            int r5 = r5.length()
            if (r5 != 0) goto L_0x006c
            goto L_0x006e
        L_0x006c:
            r5 = r7
            goto L_0x006f
        L_0x006e:
            r5 = r6
        L_0x006f:
            if (r5 == 0) goto L_0x007c
            java.lang.String r5 = r4.mo65113y()
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.String r5 = g91.C32343x.m95388F(r5, r8)
            goto L_0x0080
        L_0x007c:
            java.lang.String r5 = r4.mo65088c()
        L_0x0080:
            r9 = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.List r8 = r1.mo65189b()
            java.util.Iterator r8 = r8.iterator()
        L_0x0093:
            boolean r10 = r8.hasNext()
            r18 = 0
            if (r10 == 0) goto L_0x00b4
            java.lang.Object r10 = r8.next()
            r12 = r10
            m70.c r12 = (m70.C26150c) r12
            long r12 = r12.mo65121b()
            long r14 = r4.mo65087b()
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 != 0) goto L_0x00b0
            r12 = r6
            goto L_0x00b1
        L_0x00b0:
            r12 = r7
        L_0x00b1:
            if (r12 == 0) goto L_0x0093
            goto L_0x00b6
        L_0x00b4:
            r10 = r18
        L_0x00b6:
            m70.c r10 = (m70.C26150c) r10
            if (r10 == 0) goto L_0x00fc
            java.util.List r7 = r10.mo65138q()
            java.util.Iterator r7 = r7.iterator()
        L_0x00c2:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00fc
            java.lang.Object r8 = r7.next()
            m70.f r8 = (m70.C26153f) r8
            ti.a r10 = new ti.a
            java.math.BigDecimal r12 = r8.mo65166b()
            double r12 = r12.doubleValue()
            java.lang.String r14 = r8.mo65167c()
            r10.<init>(r12, r14)
            r5.add(r10)
            ti.a r10 = new ti.a
            java.math.BigDecimal r12 = r8.mo65173h()
            if (r12 == 0) goto L_0x00ef
            double r12 = r12.doubleValue()
            goto L_0x00f1
        L_0x00ef:
            r12 = 0
        L_0x00f1:
            java.lang.String r8 = r8.mo65167c()
            r10.<init>(r12, r8)
            r11.add(r10)
            goto L_0x00c2
        L_0x00fc:
            java.util.Map r7 = r0.mo66048a()
            long r12 = r4.mo65087b()
            java.lang.Long r8 = java.lang.Long.valueOf(r12)
            java.lang.Object r7 = r7.get(r8)
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L_0x0137
            java.util.Iterator r8 = r7.iterator()
        L_0x0114:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x0128
            java.lang.Object r10 = r8.next()
            r12 = r10
            o70.d r12 = (o70.C26765d) r12
            boolean r12 = r12.mo66013R()
            if (r12 == 0) goto L_0x0114
            goto L_0x012a
        L_0x0128:
            r10 = r18
        L_0x012a:
            o70.d r10 = (o70.C26765d) r10
            if (r10 == 0) goto L_0x0137
            o70.b r8 = r10.mo66043v()
            if (r8 != 0) goto L_0x0135
            goto L_0x0137
        L_0x0135:
            r7 = r8
            goto L_0x015e
        L_0x0137:
            if (r7 == 0) goto L_0x015c
            java.util.Iterator r7 = r7.iterator()
        L_0x013d:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0151
            java.lang.Object r8 = r7.next()
            r10 = r8
            o70.d r10 = (o70.C26765d) r10
            boolean r10 = r10.mo66017V()
            if (r10 == 0) goto L_0x013d
            goto L_0x0153
        L_0x0151:
            r8 = r18
        L_0x0153:
            o70.d r8 = (o70.C26765d) r8
            if (r8 == 0) goto L_0x015c
            o70.b r8 = r8.mo66043v()
            goto L_0x0135
        L_0x015c:
            r7 = r18
        L_0x015e:
            if (r7 == 0) goto L_0x0165
            java.lang.String r8 = r7.mo65986c()
            goto L_0x0167
        L_0x0165:
            r8 = r18
        L_0x0167:
            java.lang.String r21 = g91.C32289b0.m95091c(r8)
            dj.a r20 = new dj.a
            java.lang.String r8 = r4.mo65094h()
            r15 = r29
            java.util.List r10 = r15.m112775l(r5, r8)
            r12 = 0
            r13 = 0
            boolean r14 = r4.mo65084F()
            r5 = 0
            r16 = 88
            r17 = 0
            r8 = r20
            r15 = r5
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            a41.b r5 = new a41.b
            r22 = 0
            if (r7 == 0) goto L_0x0196
            boolean r7 = r7.mo65987d()
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r7)
        L_0x0196:
            r7 = r18
            if (r7 != 0) goto L_0x019f
            ge.bog.designsystem.components.productheader.NewProductHeaderView$a r7 = p341ge.bog.designsystem.components.productheader.NewProductHeaderView.C13482a.COLOR
        L_0x019c:
            r23 = r7
            goto L_0x01b5
        L_0x019f:
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            boolean r8 = kotlin.jvm.internal.C41536l.m120484d(r7, r8)
            if (r8 == 0) goto L_0x01aa
            ge.bog.designsystem.components.productheader.NewProductHeaderView$a r7 = p341ge.bog.designsystem.components.productheader.NewProductHeaderView.C13482a.BLACK
            goto L_0x019c
        L_0x01aa:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            boolean r7 = kotlin.jvm.internal.C41536l.m120484d(r7, r8)
            if (r7 == 0) goto L_0x01c9
            ge.bog.designsystem.components.productheader.NewProductHeaderView$a r7 = p341ge.bog.designsystem.components.productheader.NewProductHeaderView.C13482a.WHITE
            goto L_0x019c
        L_0x01b5:
            long r24 = r4.mo65087b()
            r26 = 0
            r27 = 32
            r28 = 0
            r19 = r5
            r19.<init>(r20, r21, r22, r23, r24, r26, r27, r28)
            r2.add(r5)
            goto L_0x0052
        L_0x01c9:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01cf:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: rz0.C38399b.mo91927g(l70.a):java.util.List");
    }

    /* renamed from: i */
    public final List mo91928i(List list) {
        C41536l.m120489i(list, "cards");
        ArrayList<C26765d> arrayList = new ArrayList<>();
        for (Object next : list) {
            if (((C26765d) next).mo66044w()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(arrayList, 10));
        for (C26765d h : arrayList) {
            arrayList2.add(m112772h(h));
        }
        return arrayList2;
    }

    /* renamed from: m */
    public final List mo91929m(List list) {
        boolean z;
        String str;
        boolean z2;
        String str2;
        boolean z3;
        String str3;
        if (list == null) {
            return null;
        }
        ArrayList<C26765d> arrayList = new ArrayList<>();
        Iterator it = list.iterator();
        while (true) {
            boolean z4 = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            C26765d dVar = (C26765d) next;
            CardInsSecCardModel y = dVar.mo66046y();
            if (y != null) {
                str3 = y.mo55716k();
            } else {
                str3 = null;
            }
            if (str3 != null || dVar.mo66012Q()) {
                z4 = false;
            }
            if (z4) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(arrayList, 10));
        for (C26765d dVar2 : arrayList) {
            C26763b v = dVar2.mo66043v();
            if (v != null) {
                str = v.mo65986c();
            } else {
                str = null;
            }
            String c = C32289b0.m95091c(str);
            if (c == null) {
                c = "";
            } else {
                C41536l.m120488h(c, "ImageLoader.generateImag…ernalFile?.fileUrl) ?: \"\"");
            }
            String str4 = c;
            String valueOf = String.valueOf(dVar2.mo66030j());
            String l = dVar2.mo66032l();
            if (l == null || l.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                str2 = dVar2.mo66032l();
                C41536l.m120486f(str2);
            } else {
                str2 = C32343x.m95388F(dVar2.mo65996A(), new Object[0]);
            }
            String str5 = str2;
            String z5 = dVar2.mo66047z();
            String format = new SimpleDateFormat("MM/yy").format(new Date(dVar2.mo66042u()));
            C41536l.m120488h(format, "SimpleDateFormat(CARD_EX…(Date(cardModel.expDate))");
            String c2 = dVar2.mo66021c();
            C26763b f = dVar2.mo66025f();
            if (f != null) {
                z3 = f.mo65987d();
            } else {
                z3 = false;
            }
            arrayList2.add(new CardUiModel(valueOf, str5, z5, format, c2, str4, z3, dVar2.mo66046y()));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object next2 : arrayList2) {
            CardInsSecCardModel d = ((CardUiModel) next2).mo82610d();
            if (d == null || !d.mo55715j()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                arrayList3.add(next2);
            }
        }
        if (!arrayList3.isEmpty()) {
            return arrayList3;
        }
        return null;
    }

    /* renamed from: n */
    public final C34093e.C34097d mo91930n(List list) {
        List m = mo91929m(list);
        if (m != null) {
            return new C34093e.C34097d(m);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0041, code lost:
        if (r3 == true) goto L_0x0045;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo91931o(java.util.List r17) {
        /*
            r16 = this;
            r0 = r17
            java.lang.String r1 = "depositPairs"
            kotlin.jvm.internal.C41536l.m120489i(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = ie1.C41343r.m119925u(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r17.iterator()
        L_0x0016:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0085
            java.lang.Object r2 = r0.next()
            ny0.f r2 = (ny0.C37504f) r2
            ge.bog.mobilebank.products.presentation.details.debitcard.e$h r9 = new ge.bog.mobilebank.products.presentation.details.debitcard.e$h
            ny0.b r3 = r2.mo90703a()
            long r4 = r3.mo90668d()
            ny0.b r3 = r2.mo90703a()
            java.lang.String r3 = r3.mo90685s()
            r6 = 0
            if (r3 == 0) goto L_0x0044
            int r3 = r3.length()
            r7 = 1
            if (r3 <= 0) goto L_0x0040
            r3 = r7
            goto L_0x0041
        L_0x0040:
            r3 = r6
        L_0x0041:
            if (r3 != r7) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r7 = r6
        L_0x0045:
            if (r7 == 0) goto L_0x0053
            ny0.b r3 = r2.mo90703a()
            java.lang.String r3 = r3.mo90685s()
            kotlin.jvm.internal.C41536l.m120486f(r3)
            goto L_0x0061
        L_0x0053:
            ny0.b r3 = r2.mo90703a()
            java.lang.String r3 = r3.mo90675i()
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r3 = g91.C32343x.m95388F(r3, r6)
        L_0x0061:
            r6 = r3
            ny0.b r3 = r2.mo90703a()
            double r10 = r3.mo90672g()
            ny0.b r3 = r2.mo90703a()
            java.lang.String r12 = r3.mo90671f()
            r13 = 0
            r14 = 2
            r15 = 0
            java.lang.String r7 = g91.C32343x.m95410Q(r10, r12, r13, r14, r15)
            int r8 = r2.mo90704b()
            r3 = r9
            r3.<init>(r4, r6, r7, r8)
            r1.add(r9)
            goto L_0x0016
        L_0x0085:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: rz0.C38399b.mo91931o(java.util.List):java.util.List");
    }

    /* renamed from: p */
    public final List mo91932p(List list) {
        List list2 = list;
        C41536l.m120489i(list2, "loans");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list2, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C39956t tVar = (C39956t) it.next();
            long d = tVar.mo93776b().mo93757d();
            String e = tVar.mo93776b().mo93758e();
            if (e == null) {
                e = C32343x.m95388F(tVar.mo93776b().mo93760g(), new Object[0]);
            }
            arrayList.add(new C34093e.C34103j(d, e, C32343x.m95410Q(tVar.mo93776b().mo93755b(), tVar.mo93776b().mo93756c(), false, 2, (Object) null), tVar.mo93775a()));
        }
        return arrayList;
    }

    /* renamed from: q */
    public final List mo91933q(List list) {
        String str;
        String str2;
        String f;
        C41536l.m120489i(list, "studDepInfos");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C26152e eVar = (C26152e) it.next();
            ArrayList arrayList2 = new ArrayList();
            Application application = this.f91986a;
            int i = C36274h.annual_interest_rate_label;
            String string = application.getString(i);
            String o = C32303f.m95204o(eVar.mo65158d());
            arrayList2.add(new C41224m(string, o + " %"));
            arrayList2.add(new C41224m(this.f91986a.getString(C36274h.product_details_label_overdraft_earned_percent), C32343x.m95410Q(eVar.mo65157c(), eVar.mo65156b(), false, 2, (Object) null)));
            if (!(eVar.mo65159e() == null || (f = eVar.mo65161f()) == null)) {
                arrayList2.add(C41233s.m119492a(C32343x.m95388F("account.details.int.with.period", new Object[0]), C32343x.m95388F(f, new Object[0])));
            }
            Date g = eVar.mo65162g();
            if (g != null) {
                str = C32319m.m95299f(g, "dd.MM.yyyy");
            } else {
                str = null;
            }
            if (str == null) {
                str = C32343x.m95388F("text.deposits.details.end.date.termless", new Object[0]);
            }
            arrayList2.add(C41233s.m119492a(C32343x.m95388F("account.details.int.exp.date", new Object[0]), str));
            String string2 = this.f91986a.getString(i);
            String b = eVar.mo65156b();
            int hashCode = b.hashCode();
            if (hashCode != 69026) {
                if (hashCode != 70357) {
                    if (hashCode == 84326 && b.equals("USD")) {
                        str2 = this.f91986a.getString(C36274h.in_us_dollar_label);
                        arrayList.add(new C34093e.C34116w(string2 + " " + str2, arrayList2));
                    }
                } else if (b.equals("GBP")) {
                    str2 = this.f91986a.getString(C36274h.in_pound_sterling_label);
                    arrayList.add(new C34093e.C34116w(string2 + " " + str2, arrayList2));
                }
            } else if (b.equals("EUR")) {
                str2 = this.f91986a.getString(C36274h.in_euro_label);
                arrayList.add(new C34093e.C34116w(string2 + " " + str2, arrayList2));
            }
            str2 = this.f91986a.getString(C36274h.in_lari_label);
            arrayList.add(new C34093e.C34116w(string2 + " " + str2, arrayList2));
        }
        return arrayList;
    }
}
