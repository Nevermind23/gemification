package p381cl;

import g91.C32343x;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView;
import p341ge.bog.mobilebank.autoliabilityinsurance.domain.model.SCARegisterPolicyParams;
import p341ge.bog.mobilebank.model.PensionStatusResult;
import p563pk.C17371a;
import p563pk.C17372b;
import p563pk.C17373c;
import p563pk.C17374d;
import p563pk.C17375e;
import p563pk.C17377g;
import p563pk.C17379i;
import p563pk.C17381k;

/* renamed from: cl.k */
public final class C10494k {

    /* renamed from: a */
    public static final C10495a f29831a = new C10495a((DefaultConstructorMarker) null);

    /* renamed from: cl.k$a */
    public static final class C10495a {
        private C10495a() {
        }

        public /* synthetic */ C10495a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    private final CreditCardSmallPickerView.C13279b.C13281b m38057b(C17375e eVar) {
        return new CreditCardSmallPickerView.C13279b.C13281b(eVar.mo44842g().mo44849a(), (Integer) null, C32343x.m95410Q(eVar.mo44836b(), eVar.mo44843h(), false, 2, (Object) null), eVar.mo44847k(), (String) null, 16, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public final C10496l mo27206a(C17381k kVar, List list, List list2) {
        String str;
        CreditCardSmallPickerView.C13279b.C13281b bVar;
        List list3 = list;
        List list4 = list2;
        C41536l.m120489i(kVar, "policyDetails");
        C41536l.m120489i(list3, "providers");
        C41536l.m120489i(list4, "cards");
        Integer j = kVar.mo44880j();
        C41536l.m120486f(j);
        List a = ((C17371a) list3.get(j.intValue())).mo44813a();
        Integer h = kVar.mo44877h();
        C41536l.m120486f(h);
        C17377g gVar = (C17377g) a.get(h.intValue());
        String Q = C32343x.m95410Q(gVar.mo44858e(), gVar.mo44855b(), false, 2, (Object) null);
        String Q2 = C32343x.m95410Q(gVar.mo44854a(), gVar.mo44855b(), false, 2, (Object) null);
        if (gVar.mo44856c() != null) {
            str = C32343x.m95410Q(gVar.mo44856c().doubleValue(), gVar.mo44855b(), false, 2, (Object) null);
        } else {
            str = null;
        }
        C17379i i = kVar.mo44879i();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd");
        Long c = kVar.mo44871c();
        C41536l.m120486f(c);
        String format = simpleDateFormat.format(new Date(c.longValue()));
        C41536l.m120488h(format, "SimpleDateFormat(\"dd\").f…etails.activationDate!!))");
        Integer k = kVar.mo44881k();
        if (k != null) {
            k.intValue();
            bVar = m38057b((C17375e) list4.get(kVar.mo44881k().intValue()));
        } else {
            bVar = null;
        }
        return new C10496l(Q, Q2, str, i, format, bVar);
    }

    /* renamed from: c */
    public final SCARegisterPolicyParams mo27207c(C17381k kVar, List list, List list2) {
        C17375e eVar;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Long l;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        Long l2;
        C17374d c;
        String b;
        List list3 = list;
        List list4 = list2;
        C41536l.m120489i(kVar, "policyDetails");
        C41536l.m120489i(list3, "providers");
        C41536l.m120489i(list4, "cards");
        if (kVar.mo44881k() != null) {
            eVar = (C17375e) list4.get(kVar.mo44881k().intValue());
        } else {
            eVar = null;
        }
        Integer j = kVar.mo44880j();
        C41536l.m120486f(j);
        C17371a aVar = (C17371a) list3.get(j.intValue());
        List a = aVar.mo44813a();
        Integer h = kVar.mo44877h();
        C41536l.m120486f(h);
        C17377g gVar = (C17377g) a.get(h.intValue());
        Calendar instance = Calendar.getInstance();
        Long c2 = kVar.mo44871c();
        C41536l.m120486f(c2);
        instance.setTimeInMillis(c2.longValue());
        int i = 1;
        instance.add(1, 1);
        long timeInMillis = instance.getTimeInMillis();
        Long c3 = kVar.mo44871c();
        C41536l.m120486f(c3);
        long longValue = c3.longValue();
        C17373c g = kVar.mo44876g();
        if (g != null) {
            str = g.mo44829a();
        } else {
            str = null;
        }
        C17373c g2 = kVar.mo44876g();
        if (g2 == null || (b = g2.mo44830b()) == null) {
            str2 = "";
        } else {
            str2 = b;
        }
        String c4 = aVar.mo44815c();
        double e = gVar.mo44858e();
        String b2 = gVar.mo44855b();
        double d = gVar.mo44857d();
        String b3 = gVar.mo44855b();
        String b4 = kVar.mo44879i().mo44866b();
        String e2 = kVar.mo44873e();
        if (e2 == null) {
            str3 = "";
        } else {
            str3 = e2;
        }
        if (kVar.mo44872d()) {
            str4 = PensionStatusResult.STATUS_INACTIVE;
        } else {
            str4 = "O";
        }
        String str11 = str4;
        C17372b f = kVar.mo44875f();
        if (f != null) {
            str5 = f.mo44824d();
        } else {
            str5 = null;
        }
        C17372b f2 = kVar.mo44875f();
        if (f2 != null) {
            l = Long.valueOf(f2.mo44821a());
        } else {
            l = null;
        }
        C17372b f3 = kVar.mo44875f();
        if (f3 != null) {
            str6 = f3.mo44822b();
        } else {
            str6 = null;
        }
        C17372b f4 = kVar.mo44875f();
        if (f4 != null) {
            str7 = f4.mo44825e();
        } else {
            str7 = null;
        }
        C17372b f5 = kVar.mo44875f();
        if (f5 == null || (c = f5.mo44823c()) == null) {
            str8 = null;
        } else {
            str8 = c.mo44834b();
        }
        if (eVar != null) {
            str9 = eVar.mo44846j();
        } else {
            str9 = null;
        }
        if (eVar != null) {
            str10 = new SimpleDateFormat("MMyy").format(new Date(eVar.mo44845i()));
        } else {
            str10 = null;
        }
        if (eVar != null) {
            l2 = Long.valueOf(eVar.mo44835a());
        } else {
            l2 = null;
        }
        if (kVar.mo44879i() != C17379i.AUTOMATIC) {
            i = 0;
        }
        return new SCARegisterPolicyParams(longValue, timeInMillis, str, str2, c4, e, b2, d, b3, b4, str3, str11, str5, l, str6, str7, str8, str9, str10, l2, i, "INSURANCE_REGISTER_MTPL_POLICY", (String) null, (String) null, (String) null);
    }
}
