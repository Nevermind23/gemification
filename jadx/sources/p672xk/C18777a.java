package p672xk;

import g91.C32343x;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p563pk.C17371a;
import p563pk.C17372b;
import p563pk.C17373c;
import p563pk.C17377g;
import p563pk.C17381k;
import p658wk.C18604c;

/* renamed from: xk.a */
public final class C18777a {
    /* renamed from: a */
    public final C18604c mo46571a(C17381k kVar, List list) {
        String str;
        String str2;
        Long l;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String d;
        String a;
        String b;
        List list2 = list;
        C41536l.m120489i(kVar, "policyDetails");
        C41536l.m120489i(list2, "providers");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        if (kVar.mo44871c() != null) {
            str = simpleDateFormat.format(new Date(kVar.mo44871c().longValue()));
        } else {
            str = "";
        }
        if (kVar.mo44871c() != null) {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(kVar.mo44871c().longValue());
            instance.add(1, 1);
            str2 = simpleDateFormat.format(instance.getTime());
        } else {
            str2 = "";
        }
        C17372b f = kVar.mo44875f();
        String str9 = null;
        if (f != null) {
            l = Long.valueOf(f.mo44821a());
        } else {
            l = null;
        }
        if (l != null) {
            str3 = simpleDateFormat.format(new Date(kVar.mo44875f().mo44821a()));
        } else {
            str3 = "";
        }
        Integer j = kVar.mo44880j();
        C41536l.m120486f(j);
        List a2 = ((C17371a) list2.get(kVar.mo44880j().intValue())).mo44813a();
        Integer h = kVar.mo44877h();
        C41536l.m120486f(h);
        C17377g gVar = (C17377g) a2.get(h.intValue());
        String e = ((C17371a) list2.get(j.intValue())).mo44817e();
        String Q = C32343x.m95410Q(gVar.mo44857d(), gVar.mo44855b(), false, 2, (Object) null);
        String Q2 = C32343x.m95410Q(gVar.mo44858e(), gVar.mo44855b(), false, 2, (Object) null);
        C41536l.m120488h(str, "startDate");
        C41536l.m120488h(str2, "endDate");
        String e2 = kVar.mo44873e();
        if (e2 == null) {
            str4 = "";
        } else {
            str4 = e2;
        }
        C17373c g = kVar.mo44876g();
        if (g == null || (b = g.mo44830b()) == null) {
            str5 = "";
        } else {
            str5 = b;
        }
        C17373c g2 = kVar.mo44876g();
        if (g2 == null || (a = g2.mo44829a()) == null) {
            str6 = "";
        } else {
            str6 = a;
        }
        C17372b f2 = kVar.mo44875f();
        if (f2 != null) {
            str7 = f2.mo44822b();
        } else {
            str7 = null;
        }
        C17372b f3 = kVar.mo44875f();
        if (f3 != null) {
            str9 = f3.mo44825e();
        }
        String str10 = str7 + " " + str9;
        C17372b f4 = kVar.mo44875f();
        if (f4 == null || (d = f4.mo44824d()) == null) {
            str8 = "";
        } else {
            str8 = d;
        }
        return new C18604c(e, Q, Q2, str, str2, str4, str5, str6, str10, str8, str3, kVar.mo44872d());
    }
}
