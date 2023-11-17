package hc0;

import com.github.mikephil.charting.utils.Utils;
import ec0.C20206a;
import ec0.C20212d;
import ec0.C20214f;
import g91.C32303f;
import g91.C32319m;
import g91.C32343x;
import h50.C24882b;
import ic0.C25168f;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ny0.C37499a;
import ny0.C37500b;
import ny0.C37502d;
import ny0.C37505g;
import ny0.C37510k;
import o31.C37594d;
import oy0.C37838d;
import p341ge.bog.designsystem.components.Amount;
import p341ge.bog.designsystem.components.inlinefeedback2.InlineFeedback2;
import p341ge.bog.designsystem.components.textprogressbar.TextProgressBarView;
import p341ge.bog.mobilebank.deposits.presentation.model.C23182a;
import p341ge.bog.mobilebank.deposits.presentation.model.C23183b;
import p341ge.bog.mobilebank.deposits.presentation.model.depositbreak.DepositBreakOption;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import p341ge.bog.mobilebank.shared2.environment.EnvironmentType;
import p341ge.bog.mobilebank.shared2.environment.TargetEnvironment;
import p394dj.C12132a;
import p394dj.C12138g;
import p422fj.C12920b;
import p617ti.C17966a;
import p760fw.C20575a;
import p793iw.C25263b;
import p793iw.C25264c;
import ue1.C43075l;
import zs0.C40253f;

/* renamed from: hc0.b */
public final class C24974b {

    /* renamed from: b */
    private static final C24975a f64295b = new C24975a((DefaultConstructorMarker) null);

    /* renamed from: c */
    private static final SimpleDateFormat f64296c = new SimpleDateFormat("dd MMM, yyyy");

    /* renamed from: a */
    private final TargetEnvironment f64297a;

    /* renamed from: hc0.b$a */
    private static final class C24975a {
        private C24975a() {
        }

        public /* synthetic */ C24975a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: hc0.b$b */
    public static final class C24976b implements Comparator {
        public final int compare(Object obj, Object obj2) {
            return C41506d.m120406e(Long.valueOf(((C25263b) obj2).mo63839v()), Long.valueOf(((C25263b) obj).mo63839v()));
        }
    }

    public C24974b(TargetEnvironment targetEnvironment) {
        C41536l.m120489i(targetEnvironment, "environment");
        this.f64297a = targetEnvironment;
    }

    /* renamed from: a */
    private final List m79820a(C37499a aVar) {
        return C41339p.m119896a(C41339p.m119898c());
    }

    /* renamed from: b */
    private final List m79821b(C37500b bVar, C40253f fVar) {
        Object obj;
        Amount amount;
        List c = C41339p.m119898c();
        if (bVar.mo90692y().contains("CAS")) {
            if (fVar != null) {
                amount = new Amount(fVar.mo94266y(), fVar.mo94264w());
            } else {
                amount = null;
            }
            c.add(new C23183b.C23195f0(amount));
        }
        if (bVar.mo90692y().contains("STO")) {
            c.add(new C23183b.C23188c(bVar.mo90663D()));
        }
        boolean z = true;
        if (bVar.mo90692y().contains("SAVING_GOALS")) {
            c.add(new C23183b.C23185a0(!bVar.mo90661B().isEmpty()));
        }
        if (bVar.mo90665F()) {
            Long q = bVar.mo90683q();
            if (q == null || !C37594d.m110561b(new Date(q.longValue()), new Date(System.currentTimeMillis()))) {
                z = false;
            }
            if (z) {
                obj = C23183b.C23215u.f60774k;
            } else {
                obj = C23183b.C23212r.f60770k;
            }
            c.add(obj);
        }
        return C41339p.m119896a(c);
    }

    /* renamed from: c */
    private final List m79822c(C37499a aVar) {
        StringSource.Dictionary b;
        List c = C41339p.m119898c();
        String j = aVar.mo90648j();
        if (!(j == null || (b = C34646b.m101748b(j, new Object[0])) == null)) {
            m79823d(new C23183b.C23207m(b), c);
        }
        List<C37502d> h = aVar.mo90645h();
        if (h != null) {
            ArrayList arrayList = new ArrayList();
            for (C37502d a : h) {
                String a2 = a.mo90694a();
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
            String g0 = C41358y.m120017g0(arrayList, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C43075l) null, 62, (Object) null);
            C23183b.C23190d dVar = (C23183b.C23190d) C32343x.m95409P0(new C23183b.C23190d(g0), C40439w.m117118v(g0));
            if (dVar != null) {
                m79823d(dVar, c);
            }
        }
        m79823d(new C23183b.C23196g(aVar.mo90653o()), c);
        m79823d(new C23183b.C23200i(aVar.mo90655q()), c);
        String d = aVar.mo90640d();
        if (d != null) {
            m79823d(new C23183b.C23211q(d), c);
        }
        return C41339p.m119896a(c);
    }

    /* renamed from: d */
    private static final boolean m79823d(C23183b.C23216v vVar, List list) {
        return list.add(vVar);
    }

    /* renamed from: e */
    private final List m79824e(C37500b bVar) {
        boolean z;
        List c = C41339p.m119898c();
        if (bVar.mo90692y().contains("IN_TRANSFER")) {
            c.add(new C20206a.C20208b(false, 1, (DefaultConstructorMarker) null));
        }
        if (bVar.mo90692y().contains("OUT_TRANSFER")) {
            if (bVar.mo90672g() > Utils.DOUBLE_EPSILON) {
                z = true;
            } else {
                z = false;
            }
            c.add(new C20206a.C20209c(z));
        }
        if (bVar.mo90692y().contains("STATEMENT")) {
            c.add(new C20206a.C20207a(false, 1, (DefaultConstructorMarker) null));
        }
        return C41339p.m119896a(c);
    }

    /* renamed from: f */
    private final List m79825f(C37500b bVar) {
        StringSource stringSource;
        StringSource.Dictionary b;
        List c = C41339p.m119898c();
        String s = bVar.mo90685s();
        C23183b.C23213s sVar = null;
        if (s == null || (stringSource = C34646b.m101749c(s)) == null) {
            String i = bVar.mo90675i();
            if (i != null) {
                stringSource = C34646b.m101748b(i, new Object[0]);
            } else {
                stringSource = null;
            }
        }
        if (stringSource != null) {
            m79826g(new C23183b.C23217w(stringSource, false, 2, (DefaultConstructorMarker) null), c);
        }
        String j = bVar.mo90676j();
        if (j != null) {
            String o = bVar.mo90681o();
            if (o != null) {
                sVar = new C23183b.C23213s(j, o);
            }
            if (sVar != null) {
                m79826g(sVar, c);
            }
        }
        String i2 = bVar.mo90675i();
        if (!(i2 == null || (b = C34646b.m101748b(i2, new Object[0])) == null)) {
            m79826g(new C23183b.C23187b0(b), c);
        }
        String a = bVar.mo90637a();
        if (a != null) {
            m79826g(new C23183b.C23210p(a), c);
        }
        Long C = bVar.mo90662C();
        if (C != null) {
            m79826g(new C23183b.C23218x(C.longValue()), c);
        }
        m79826g(new C23183b.C23214t(bVar.mo90683q()), c);
        String h = bVar.mo90673h();
        if (h != null) {
            m79826g(new C23183b.C23211q(h), c);
        }
        return C41339p.m119896a(c);
    }

    /* renamed from: g */
    private static final boolean m79826g(C23183b.C23216v vVar, List list) {
        return list.add(vVar);
    }

    /* renamed from: h */
    private final List m79827h(C37499a aVar) {
        boolean z;
        Double d;
        StringSource.Dictionary b;
        List c = C41339p.m119898c();
        String e = aVar.mo90641e();
        if (e == null) {
            e = "GEL";
        }
        Number f = aVar.mo90643f();
        if (f != null) {
            m79830k(new C23183b.C23192e(f.intValue()), c);
        }
        Number k = aVar.mo90649k();
        if (k != null) {
            m79830k(new C23183b.C23206l(new Amount(k.doubleValue(), e)), c);
        }
        double m = aVar.mo90651m();
        C23183b.C23184a aVar2 = new C23183b.C23184a(new Amount(m, e));
        if (m == Utils.DOUBLE_EPSILON) {
            z = true;
        } else {
            z = false;
        }
        C23183b.C23184a aVar3 = (C23183b.C23184a) C32343x.m95409P0(aVar2, z);
        if (aVar3 != null) {
            m79830k(aVar3, c);
        }
        String l = aVar.mo90650l();
        if (!(l == null || (b = C34646b.m101748b(l, new Object[0])) == null)) {
            m79830k(new C23183b.C23208n(b), c);
        }
        Number r = aVar.mo90656r();
        if (r != null) {
            m79830k(new C23183b.C23202j(new Amount(r.doubleValue(), e)), c);
        }
        Number s = aVar.mo90657s();
        if (s != null) {
            C23183b.C23204k kVar = new C23183b.C23204k(new Amount(s.doubleValue(), e));
            Number s2 = aVar.mo90657s();
            Double d2 = null;
            if (s2 != null) {
                d = Double.valueOf(s2.doubleValue());
            } else {
                d = null;
            }
            Number r2 = aVar.mo90656r();
            if (r2 != null) {
                d2 = Double.valueOf(r2.doubleValue());
            }
            C23183b.C23204k kVar2 = (C23183b.C23204k) C32343x.m95409P0(kVar, C41536l.m120483c(d, d2));
            if (kVar2 != null) {
                m79830k(kVar2, c);
            }
        }
        Number n = aVar.mo90652n();
        if (n != null) {
            m79830k(new C23183b.C23194f(Double.valueOf(n.doubleValue())), c);
        }
        m79830k(new C23183b.C23198h(new Amount(aVar.mo90654p(), e)), c);
        return C41339p.m119896a(c);
    }

    /* renamed from: i */
    private final List m79828i(C37500b bVar) {
        String F;
        boolean z;
        C23183b.C23184a aVar;
        List c = C41339p.m119898c();
        Number l = bVar.mo90678l();
        boolean z2 = true;
        if (l != null) {
            double doubleValue = l.doubleValue();
            if (doubleValue == Utils.DOUBLE_EPSILON) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                aVar = null;
            } else {
                aVar = new C23183b.C23184a(new Amount(doubleValue, bVar.mo90671f()));
            }
            if (aVar != null) {
                m79829j(aVar, c);
            }
        }
        String u = bVar.mo90688u();
        if (!(u == null || (F = C32343x.m95388F(u, new Object[0])) == null)) {
            m79829j(new C23183b.C23203j0(bVar.mo90686t(), F), c);
        }
        Number n = bVar.mo90680n();
        if (n != null) {
            C23183b.C23199h0 h0Var = new C23183b.C23199h0(new Amount(n.doubleValue(), bVar.mo90671f()));
            if (n.doubleValue() != Utils.DOUBLE_EPSILON) {
                z2 = false;
            }
            C23183b.C23199h0 h0Var2 = (C23183b.C23199h0) C32343x.m95409P0(h0Var, z2);
            if (h0Var2 != null) {
                m79829j(h0Var2, c);
            }
        }
        Number m = bVar.mo90679m();
        if (m != null) {
            m79829j(new C23183b.C23191d0(Double.valueOf(m.doubleValue())), c);
        }
        Number r = bVar.mo90684r();
        if (r != null) {
            m79829j(new C23183b.C23193e0(r, bVar.mo90671f(), bVar.mo90691x()), c);
        }
        return C41339p.m119896a(c);
    }

    /* renamed from: j */
    private static final boolean m79829j(C23183b.C23189c0 c0Var, List list) {
        return list.add(c0Var);
    }

    /* renamed from: k */
    private static final boolean m79830k(C23183b.C23189c0 c0Var, List list) {
        return list.add(c0Var);
    }

    /* renamed from: l */
    private final C20214f m79831l(C37500b bVar) {
        long j;
        String F;
        String F2;
        String F3;
        InlineFeedback2.C13350a aVar;
        C25168f fVar;
        String str;
        if (bVar.mo90683q() == null || !bVar.mo90666G()) {
            return null;
        }
        long m = m79832m();
        Long q = bVar.mo90683q();
        if (q != null) {
            j = q.longValue();
        } else {
            j = Long.MAX_VALUE;
        }
        long t = C32319m.m95313t(m, j);
        if (!bVar.mo90693z()) {
            F = C32343x.m95388F("deposit.prolong.warning.close", Long.valueOf(t));
            F2 = C32343x.m95388F("deposit.prolong.actionsheet.close.text.header", Long.valueOf(t));
            F3 = C32343x.m95388F("deposit.prolong.warning.close.see.details", new Object[0]);
            aVar = InlineFeedback2.C13350a.PENDING;
            fVar = C25168f.DONT_WANT_TO_RENEW;
            str = "Rejected";
        } else if (bVar.mo90677k()) {
            F = C32343x.m95388F("deposit.prolong.warning.newterms", Long.valueOf(t));
            F2 = C32343x.m95388F("deposit.prolong.actionsheet.newterms.text.header", new Object[0]);
            F3 = C32343x.m95388F("deposit.prolong.warning.newterms.see.details", new Object[0]);
            aVar = InlineFeedback2.C13350a.POSITIVE;
            fVar = C25168f.LOWER_THAN_INITIAL_AMOUNT;
            str = "Prolongated";
        } else {
            F = C32343x.m95388F("deposit.prolong.warning", Long.valueOf(t));
            F2 = C32343x.m95388F("deposit.prolong.actionsheet.text.header", Long.valueOf(t));
            F3 = C32343x.m95388F("deposit.prolong.warning.see.details", new Object[0]);
            aVar = InlineFeedback2.C13350a.PENDING;
            fVar = C25168f.INITIAL_AMOUNT_WITH_INTEREST;
            str = "Offered_to_prolongate";
        }
        return new C20214f(F, F2, str, F3, aVar, fVar);
    }

    /* renamed from: m */
    private final long m79832m() {
        if (this.f64297a.getType() != EnvironmentType.TEST) {
            return System.currentTimeMillis();
        }
        return 1631192745000L;
    }

    /* renamed from: n */
    private final String m79833n(C25263b bVar) {
        String format = f64296c.format(Long.valueOf(bVar.mo63839v()));
        C41536l.m120488h(format, "dateFormat.format(transaction.operationDate)");
        return format;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: ge.bog.mobilebank.shared.helper.ImageSource$Resource} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: ge.bog.mobilebank.shared.helper.ImageSource$Url} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: ge.bog.mobilebank.shared.helper.ImageSource$Url} */
    /* JADX WARNING: type inference failed for: r0v1 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p341ge.bog.mobilebank.deposits.presentation.model.SavingGoalUiModel m79834r(ny0.C37510k r11) {
        /*
            r10 = this;
            java.lang.String r0 = r11.mo90742b()
            if (r0 == 0) goto L_0x001c
            java.lang.String r2 = g91.C32289b0.m95091c(r0)
            if (r2 == 0) goto L_0x001c
            java.lang.String r0 = "let(ImageLoader::generateImageUrl)"
            kotlin.jvm.internal.C41536l.m120488h(r2, r0)
            ge.bog.mobilebank.shared.helper.ImageSource$Url r0 = new ge.bog.mobilebank.shared.helper.ImageSource$Url
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0023
        L_0x001c:
            ge.bog.mobilebank.shared.helper.ImageSource$Resource r0 = new ge.bog.mobilebank.shared.helper.ImageSource$Resource
            int r1 = rb0.C27984c.f71249z
            r0.<init>(r1)
        L_0x0023:
            r3 = r0
            long r4 = r11.mo90747f()
            java.lang.Long r6 = r11.mo90743c()
            java.lang.String r7 = r11.mo90744d()
            java.lang.String r8 = r11.mo90745e()
            java.lang.String r9 = r11.mo90741a()
            ge.bog.mobilebank.deposits.presentation.model.SavingGoalUiModel r11 = new ge.bog.mobilebank.deposits.presentation.model.SavingGoalUiModel
            r2 = r11
            r2.<init>(r3, r4, r6, r7, r8, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: hc0.C24974b.m79834r(ny0.k):ge.bog.mobilebank.deposits.presentation.model.SavingGoalUiModel");
    }

    /* renamed from: t */
    private final TextProgressBarView.ProgressModel.Progress m79835t(C37500b bVar, C37505g gVar) {
        String h = C32303f.m95197h(gVar.mo90709b());
        C41536l.m120488h(h, "getCcyLogo(goal.ccy)");
        return new TextProgressBarView.ProgressModel.Progress((float) bVar.mo90672g(), (float) gVar.mo90708a(), h, C32343x.m95388F("deposit.saving.goal.saved", new Object[0]), C32343x.m95388F(gVar.mo90715g(), new Object[0]), false, (C12920b) null, (C12920b) null, 224, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: ge.bog.mobilebank.deposits.presentation.model.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: ge.bog.mobilebank.deposits.presentation.model.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: ge.bog.mobilebank.deposits.presentation.model.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: ge.bog.mobilebank.deposits.presentation.model.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: ge.bog.mobilebank.deposits.presentation.model.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: zs0.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: ge.bog.mobilebank.deposits.presentation.model.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo63377o(ny0.C37508i r10, java.util.List r11) {
        /*
            r9 = this;
            java.lang.String r0 = "depositsAndBonds"
            kotlin.jvm.internal.C41536l.m120489i(r10, r0)
            java.lang.String r0 = "cas"
            kotlin.jvm.internal.C41536l.m120489i(r11, r0)
            java.util.List r10 = r10.mo90724e()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x0017:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x0064
            java.lang.Object r1 = r10.next()
            ny0.c r1 = (ny0.C37501c) r1
            boolean r2 = r1 instanceof ny0.C37500b
            r3 = 0
            if (r2 == 0) goto L_0x0054
            ny0.b r1 = (ny0.C37500b) r1
            java.util.Iterator r2 = r11.iterator()
        L_0x002e:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x004d
            java.lang.Object r4 = r2.next()
            r5 = r4
            zs0.f r5 = (zs0.C40253f) r5
            long r5 = r5.mo94242d()
            long r7 = r1.mo90668d()
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x0049
            r5 = 1
            goto L_0x004a
        L_0x0049:
            r5 = 0
        L_0x004a:
            if (r5 == 0) goto L_0x002e
            r3 = r4
        L_0x004d:
            zs0.f r3 = (zs0.C40253f) r3
            ge.bog.mobilebank.deposits.presentation.model.a r3 = r9.mo63379q(r1, r3)
            goto L_0x005e
        L_0x0054:
            boolean r2 = r1 instanceof ny0.C37499a
            if (r2 == 0) goto L_0x005e
            ny0.a r1 = (ny0.C37499a) r1
            ge.bog.mobilebank.deposits.presentation.model.a r3 = r9.mo63378p(r1)
        L_0x005e:
            if (r3 == 0) goto L_0x0017
            r0.add(r3)
            goto L_0x0017
        L_0x0064:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hc0.C24974b.mo63377o(ny0.i, java.util.List):java.util.List");
    }

    /* renamed from: p */
    public final C23182a mo63378p(C37499a aVar) {
        C41536l.m120489i(aVar, "bond");
        Long valueOf = Long.valueOf(aVar.mo90644g());
        String F = C32343x.m95388F(aVar.mo90648j(), new Object[0]);
        double p = aVar.mo90654p();
        String e = aVar.mo90641e();
        if (e == null) {
            e = "GEL";
        }
        return new C23182a(valueOf, new C20212d(new C12132a(F, C41339p.m119900e(new C17966a(p, e)), (List) null, (TextProgressBarView.ProgressModel) null, (C12138g) null, false, false, 92, (DefaultConstructorMarker) null), aVar.mo90638b()), C41341q.m119907j(), m79827h(aVar), m79820a(aVar), m79822c(aVar), C41341q.m119907j(), aVar, (C40253f) null, (C20214f) null, 768, (DefaultConstructorMarker) null);
    }

    /* renamed from: q */
    public final C23182a mo63379q(C37500b bVar, C40253f fVar) {
        C37500b bVar2 = bVar;
        C41536l.m120489i(bVar2, "deposit");
        Long valueOf = Long.valueOf(bVar.mo90668d());
        String s = bVar.mo90685s();
        if (s == null) {
            s = C32343x.m95388F(bVar.mo90675i(), new Object[0]);
        }
        C20212d dVar = new C20212d(new C12132a(s, C41339p.m119900e(new C17966a(bVar.mo90672g(), bVar.mo90671f())), (List) null, (TextProgressBarView.ProgressModel) null, (C12138g) null, false, false, 92, (DefaultConstructorMarker) null), bVar.mo90638b());
        List e = m79824e(bVar);
        List i = m79828i(bVar);
        List b = m79821b(bVar, fVar);
        List f = m79825f(bVar);
        List<C37505g> B = bVar.mo90661B();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(B, 10));
        for (C37505g t : B) {
            arrayList.add(m79835t(bVar2, t));
        }
        return new C23182a(valueOf, dVar, e, i, b, f, arrayList, bVar, fVar, m79831l(bVar));
    }

    /* renamed from: s */
    public final List mo63380s(C37838d dVar) {
        C41536l.m120489i(dVar, "possibilities");
        List c = C41339p.m119898c();
        if (dVar.mo91180c()) {
            c.add(DepositBreakOption.CashCoverLoan.f60813j);
        }
        if (dVar.mo91178a()) {
            c.add(DepositBreakOption.BreakDeposit.f60812j);
        }
        if (c.isEmpty()) {
            c.add(DepositBreakOption.NoOptions.f60819e);
        }
        return C41339p.m119896a(c);
    }

    /* renamed from: u */
    public final List mo63381u(List list) {
        C41536l.m120489i(list, "list");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m79834r((C37510k) it.next()));
        }
        return arrayList;
    }

    /* renamed from: v */
    public final List mo63382v(C25264c cVar) {
        C41536l.m120489i(cVar, "transactions");
        List c = C41339p.m119898c();
        List t0 = C41358y.m120030t0(cVar.mo63846d(), new C24976b());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : t0) {
            String n = m79833n((C25263b) next);
            Object obj = linkedHashMap.get(n);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(n, obj);
            }
            ((List) obj).add(next);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            c.add(new C23183b.C23220z((String) entry.getKey()));
            ArrayList arrayList = new ArrayList();
            for (C25263b w : (List) entry.getValue()) {
                C23183b.C23219y w2 = mo63383w(w);
                if (w2 != null) {
                    arrayList.add(w2);
                }
            }
            c.addAll(arrayList);
        }
        if (!c.isEmpty()) {
            c.add(C23183b.C23201i0.f60755d);
        }
        return C41339p.m119896a(c);
    }

    /* renamed from: w */
    public final C23183b.C23219y mo63383w(C25263b bVar) {
        String f;
        C41536l.m120489i(bVar, "transaction");
        StringSource.Dictionary dictionary = null;
        if (bVar.mo63817c() == null) {
            return null;
        }
        String w = bVar.mo63840w();
        if (w == null) {
            w = "";
        }
        StringSource.Raw c = C34646b.m101749c(w);
        C20575a j = bVar.mo63826j();
        if (!(j == null || (f = j.mo49107f()) == null)) {
            dictionary = C34646b.m101748b(f, new Object[0]);
        }
        BigDecimal c2 = bVar.mo63817c();
        C41536l.m120486f(c2);
        double d = -c2.doubleValue();
        String k = bVar.mo63827k();
        if (k == null) {
            k = "GEL";
        }
        Amount amount = new Amount(d, k);
        if (amount.mo34590d().compareTo(BigDecimal.ZERO) >= 0) {
            return new C23183b.C23197g0(c, dictionary, amount, C24882b.m79536d(bVar));
        }
        return new C23183b.C23205k0(c, dictionary, amount, C24882b.m79536d(bVar));
    }
}
