package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.C4126c5;
import com.google.android.gms.internal.measurement.C4143d5;
import com.google.android.gms.internal.measurement.C4227i4;
import com.google.android.gms.internal.measurement.C4244j4;
import com.google.android.gms.internal.measurement.C4261k4;
import com.google.android.gms.internal.measurement.C4278l4;
import com.google.android.gms.internal.measurement.C4295m4;
import com.google.android.gms.internal.measurement.C4312n4;
import com.google.android.gms.internal.measurement.C4356pe;
import com.google.android.gms.internal.measurement.C4380r4;
import com.google.android.gms.internal.measurement.C4397s4;
import com.google.android.gms.internal.measurement.C4414t4;
import com.google.android.gms.internal.measurement.C4423td;
import com.google.android.gms.internal.measurement.C4431u4;
import com.google.android.gms.internal.measurement.C4448v4;
import com.google.android.gms.internal.measurement.C4481x4;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import p182n6.C7264i;
import p248s7.C8243a;
import p248s7.C8245b;

/* renamed from: com.google.android.gms.measurement.internal.g5 */
final class C4649g5 implements Callable {

    /* renamed from: d */
    final /* synthetic */ zzaw f14447d;

    /* renamed from: e */
    final /* synthetic */ String f14448e;

    /* renamed from: f */
    final /* synthetic */ C4704l5 f14449f;

    C4649g5(C4704l5 l5Var, zzaw zzaw, String str) {
        this.f14449f = l5Var;
        this.f14447d = zzaw;
        this.f14448e = str;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C4763q9 q9Var;
        C4380r4 r4Var;
        C4414t4 t4Var;
        String str;
        Bundle bundle;
        C4748p5 p5Var;
        long j;
        String str2;
        C4753q qVar;
        byte[] bArr;
        C4719m9 m9Var;
        this.f14449f.f14588b.mo14584e();
        C4837x6 d0 = this.f14449f.f14588b.mo14583d0();
        zzaw zzaw = this.f14447d;
        String str3 = this.f14448e;
        d0.mo14554h();
        C4791t4.m18290t();
        C7264i.m27902k(zzaw);
        C7264i.m27898g(str3);
        if (!d0.f14613a.mo14876z().mo14398B(str3, C4636f3.f14356W)) {
            d0.f14613a.mo14551d().mo14674q().mo14616b("Generating ScionPayload disabled. packageName", str3);
            return new byte[0];
        } else if ("_iap".equals(zzaw.f15103d) || "_iapx".equals(zzaw.f15103d)) {
            C4380r4 A = C4397s4.m16624A();
            d0.f15082b.mo14577W().mo14509e0();
            C4748p5 R = d0.f15082b.mo14577W().mo14497R(str3);
            if (R == null) {
                d0.f14613a.mo14551d().mo14674q().mo14616b("Log and bundle not available. package_name", str3);
                bArr = new byte[0];
                m9Var = d0.f15082b;
            } else if (!R.mo14697M()) {
                d0.f14613a.mo14551d().mo14674q().mo14616b("Log and bundle disabled. package_name", str3);
                bArr = new byte[0];
                m9Var = d0.f15082b;
            } else {
                C4414t4 S1 = C4431u4.m16847S1();
                S1.mo13597X(1);
                S1.mo13592S("android");
                if (!TextUtils.isEmpty(R.mo14728i0())) {
                    S1.mo13619s(R.mo14728i0());
                }
                if (!TextUtils.isEmpty(R.mo14732k0())) {
                    S1.mo13622u((String) C7264i.m27902k(R.mo14732k0()));
                }
                if (!TextUtils.isEmpty(R.mo14734l0())) {
                    S1.mo13627y((String) C7264i.m27902k(R.mo14734l0()));
                }
                if (R.mo14700P() != -2147483648L) {
                    S1.mo13629z((int) R.mo14700P());
                }
                S1.mo13584N(R.mo14712a0());
                S1.mo13572H(R.mo14709Y());
                String n0 = R.mo14738n0();
                String g0 = R.mo14724g0();
                if (!TextUtils.isEmpty(n0)) {
                    S1.mo13582M(n0);
                } else if (!TextUtils.isEmpty(g0)) {
                    S1.mo13617r(g0);
                }
                C4423td.m16772c();
                if (d0.f14613a.mo14876z().mo14398B((String) null, C4636f3.f14337G0)) {
                    S1.mo13603d0(R.mo14720e0());
                }
                C8245b V = d0.f15082b.mo14576V(str3);
                S1.mo13566E(R.mo14708X());
                if (d0.f14613a.mo14869o() && d0.f14613a.mo14876z().mo14399C(S1.mo13610l0()) && V.mo23435i(C8243a.AD_STORAGE) && !TextUtils.isEmpty((CharSequence) null)) {
                    S1.mo13570G((String) null);
                }
                S1.mo13564D(V.mo23433h());
                if (V.mo23435i(C8243a.AD_STORAGE) && R.mo14696L()) {
                    Pair n = d0.f15082b.mo14585e0().mo14467n(R.mo14728i0(), V);
                    if (R.mo14696L() && !TextUtils.isEmpty((CharSequence) n.first)) {
                        try {
                            S1.mo13598Y(C4837x6.m18431e((String) n.first, Long.toString(zzaw.f15106g)));
                            Object obj = n.second;
                            if (obj != null) {
                                S1.mo13588P(((Boolean) obj).booleanValue());
                            }
                        } catch (SecurityException e) {
                            d0.f14613a.mo14551d().mo14674q().mo14616b("Resettable device id encryption failed", e.getMessage());
                            bArr = new byte[0];
                            m9Var = d0.f15082b;
                        } catch (Throwable th) {
                            d0.f15082b.mo14577W().mo14510f0();
                            throw th;
                        }
                    }
                }
                d0.f14613a.mo14844A().mo14640k();
                S1.mo13568F(Build.MODEL);
                d0.f14613a.mo14844A().mo14640k();
                S1.mo13590Q(Build.VERSION.RELEASE);
                S1.mo13604e0((int) d0.f14613a.mo14844A().mo14648p());
                S1.mo13608j0(d0.f14613a.mo14844A().mo14649q());
                try {
                    if (V.mo23435i(C8243a.ANALYTICS_STORAGE) && R.mo14730j0() != null) {
                        S1.mo13620t(C4837x6.m18431e((String) C7264i.m27902k(R.mo14730j0()), Long.toString(zzaw.f15106g)));
                    }
                    if (!TextUtils.isEmpty(R.mo14736m0())) {
                        S1.mo13580L((String) C7264i.m27902k(R.mo14736m0()));
                    }
                    String i0 = R.mo14728i0();
                    List c0 = d0.f15082b.mo14577W().mo14507c0(i0);
                    Iterator it = c0.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            q9Var = null;
                            break;
                        }
                        q9Var = (C4763q9) it.next();
                        if ("_lte".equals(q9Var.f14804c)) {
                            break;
                        }
                    }
                    if (q9Var == null || q9Var.f14806e == null) {
                        C4763q9 q9Var2 = new C4763q9(i0, "auto", "_lte", d0.f14613a.mo14548a().mo23594a(), 0L);
                        c0.add(q9Var2);
                        d0.f15082b.mo14577W().mo14524x(q9Var2);
                    }
                    C4741o9 g02 = d0.f15082b.mo14587g0();
                    g02.f14613a.mo14551d().mo14679v().mo14615a("Checking account type status for ad personalization signals");
                    if (g02.f14613a.mo14844A().mo14651s()) {
                        String i02 = R.mo14728i0();
                        C7264i.m27902k(i02);
                        if (R.mo14696L() && g02.f15082b.mo14581a0().mo14620B(i02)) {
                            g02.f14613a.mo14551d().mo14674q().mo14615a("Turning off ad personalization due to account type");
                            Iterator it2 = c0.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                } else if ("_npa".equals(((C4763q9) it2.next()).f14804c)) {
                                    it2.remove();
                                    break;
                                }
                            }
                            c0.add(new C4763q9(i02, "auto", "_npa", g02.f14613a.mo14548a().mo23594a(), 1L));
                        }
                    }
                    C4143d5[] d5VarArr = new C4143d5[c0.size()];
                    for (int i = 0; i < c0.size(); i++) {
                        C4126c5 D = C4143d5.m15667D();
                        D.mo12978u(((C4763q9) c0.get(i)).f14804c);
                        D.mo12979y(((C4763q9) c0.get(i)).f14805d);
                        d0.f15082b.mo14587g0().mo14664K(D, ((C4763q9) c0.get(i)).f14806e);
                        d5VarArr[i] = (C4143d5) D.mo13361l();
                    }
                    S1.mo13559A0(Arrays.asList(d5VarArr));
                    C4757q3 b = C4757q3.m18181b(zzaw);
                    d0.f14613a.mo14856N().mo14840z(b.f14787d, d0.f15082b.mo14577W().mo14496Q(str3));
                    d0.f14613a.mo14856N().mo14794B(b, d0.f14613a.mo14876z().mo14408n(str3));
                    Bundle bundle2 = b.f14787d;
                    bundle2.putLong("_c", 1);
                    d0.f14613a.mo14551d().mo14674q().mo14615a("Marking in-app purchase as real-time");
                    bundle2.putLong(NotificationMessage.NOTIF_KEY_REQUEST_ID, 1);
                    bundle2.putString("_o", zzaw.f15105f);
                    if (d0.f14613a.mo14856N().mo14813U(S1.mo13610l0())) {
                        d0.f14613a.mo14856N().mo14796D(bundle2, "_dbg", 1L);
                        d0.f14613a.mo14856N().mo14796D(bundle2, NotificationMessage.NOTIF_KEY_REQUEST_ID, 1L);
                    }
                    C4753q V2 = d0.f15082b.mo14577W().mo14501V(str3, zzaw.f15103d);
                    if (V2 == null) {
                        t4Var = S1;
                        p5Var = R;
                        r4Var = A;
                        str = str3;
                        bundle = bundle2;
                        str2 = null;
                        qVar = new C4753q(str3, zzaw.f15103d, 0, 0, 0, zzaw.f15106g, 0, (Long) null, (Long) null, (Long) null, (Boolean) null);
                        j = 0;
                    } else {
                        p5Var = R;
                        r4Var = A;
                        str = str3;
                        bundle = bundle2;
                        t4Var = S1;
                        str2 = null;
                        long j2 = V2.f14775f;
                        qVar = V2.mo14757c(zzaw.f15106g);
                        j = j2;
                    }
                    d0.f15082b.mo14577W().mo14517q(qVar);
                    C4742p pVar = new C4742p(d0.f14613a, zzaw.f15105f, str, zzaw.f15103d, zzaw.f15106g, j, bundle);
                    C4227i4 E = C4244j4.m16143E();
                    E.mo13238E(pVar.f14707d);
                    E.mo13234A(pVar.f14705b);
                    E.mo13237D(pVar.f14708e);
                    C4764r rVar = new C4764r(pVar.f14709f);
                    while (rVar.hasNext()) {
                        String b2 = rVar.next();
                        C4295m4 E2 = C4312n4.m16323E();
                        E2.mo13342B(b2);
                        Object q0 = pVar.f14709f.mo14986q0(b2);
                        if (q0 != null) {
                            d0.f15082b.mo14587g0().mo14663J(E2, q0);
                            E.mo13247t(E2);
                        }
                    }
                    C4414t4 t4Var2 = t4Var;
                    t4Var2.mo13561B0(E);
                    C4448v4 A2 = C4481x4.m17133A();
                    C4261k4 A3 = C4278l4.m16218A();
                    A3.mo13293p(qVar.f14772c);
                    A3.mo13294q(zzaw.f15103d);
                    A2.mo13776p(A3);
                    t4Var2.mo13594U(A2);
                    t4Var2.mo13625w0(d0.f15082b.mo14574T().mo14306m(p5Var.mo14728i0(), Collections.emptyList(), t4Var2.mo13615p0(), Long.valueOf(E.mo13245r()), Long.valueOf(E.mo13245r())));
                    if (E.mo13242I()) {
                        t4Var2.mo13602c0(E.mo13245r());
                        t4Var2.mo13574I(E.mo13245r());
                    }
                    long b0 = p5Var.mo14714b0();
                    int i2 = (b0 > 0 ? 1 : (b0 == 0 ? 0 : -1));
                    if (i2 != 0) {
                        t4Var2.mo13595V(b0);
                    }
                    long d02 = p5Var.mo14718d0();
                    if (d02 != 0) {
                        t4Var2.mo13596W(d02);
                    } else if (i2 != 0) {
                        t4Var2.mo13596W(b0);
                    }
                    String c = p5Var.mo14715c();
                    C4356pe.m16469c();
                    String str4 = str;
                    if (d0.f14613a.mo14876z().mo14398B(str4, C4636f3.f14393q0) && c != null) {
                        t4Var2.mo13601b0(c);
                    }
                    p5Var.mo14721f();
                    t4Var2.mo13558A((int) p5Var.mo14716c0());
                    d0.f14613a.mo14876z().mo14411q();
                    t4Var2.mo13606h0(77000);
                    t4Var2.mo13605g0(d0.f14613a.mo14548a().mo23594a());
                    t4Var2.mo13600a0(true);
                    if (d0.f14613a.mo14876z().mo14398B(str2, C4636f3.f14401u0)) {
                        d0.f15082b.mo14588h(t4Var2.mo13610l0(), t4Var2);
                    }
                    C4380r4 r4Var2 = r4Var;
                    r4Var2.mo13516p(t4Var2);
                    C4748p5 p5Var2 = p5Var;
                    p5Var2.mo14688D(t4Var2.mo13623u0());
                    p5Var2.mo14686B(t4Var2.mo13621t0());
                    d0.f15082b.mo14577W().mo14516p(p5Var2);
                    d0.f15082b.mo14577W().mo14515o();
                    d0.f15082b.mo14577W().mo14510f0();
                    try {
                        return d0.f15082b.mo14587g0().mo14666O(((C4397s4) r4Var2.mo13361l()).mo13041g());
                    } catch (IOException e2) {
                        d0.f14613a.mo14551d().mo14675r().mo14617c("Data loss. Failed to bundle and serialize. appId", C4746p3.m18094z(str4), e2);
                        return str2;
                    }
                } catch (SecurityException e3) {
                    d0.f14613a.mo14551d().mo14674q().mo14616b("app instance id encryption failed", e3.getMessage());
                    byte[] bArr2 = new byte[0];
                    d0.f15082b.mo14577W().mo14510f0();
                    return bArr2;
                }
            }
            m9Var.mo14577W().mo14510f0();
            return bArr;
        } else {
            d0.f14613a.mo14551d().mo14674q().mo14617c("Generating a payload for this event is not available. package_name, event_name", str3, zzaw.f15103d);
            return null;
        }
    }
}
