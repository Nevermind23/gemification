package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C4103b;
import com.google.android.gms.internal.measurement.C4107b3;
import com.google.android.gms.internal.measurement.C4109b5;
import com.google.android.gms.internal.measurement.C4126c5;
import com.google.android.gms.internal.measurement.C4143d5;
import com.google.android.gms.internal.measurement.C4164e9;
import com.google.android.gms.internal.measurement.C4176f4;
import com.google.android.gms.internal.measurement.C4192g3;
import com.google.android.gms.internal.measurement.C4210h4;
import com.google.android.gms.internal.measurement.C4226i3;
import com.google.android.gms.internal.measurement.C4227i4;
import com.google.android.gms.internal.measurement.C4244j4;
import com.google.android.gms.internal.measurement.C4295m4;
import com.google.android.gms.internal.measurement.C4311n3;
import com.google.android.gms.internal.measurement.C4312n4;
import com.google.android.gms.internal.measurement.C4356pe;
import com.google.android.gms.internal.measurement.C4369qa;
import com.google.android.gms.internal.measurement.C4397s4;
import com.google.android.gms.internal.measurement.C4414t4;
import com.google.android.gms.internal.measurement.C4423td;
import com.google.android.gms.internal.measurement.C4431u4;
import com.google.android.gms.internal.measurement.C4511z2;
import com.google.android.gms.internal.measurement.C4513z4;
import com.salesforce.marketingcloud.storage.p385db.C11772k;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import p182n6.C7264i;
import p248s7.C8263q;

/* renamed from: com.google.android.gms.measurement.internal.o9 */
public final class C4741o9 extends C4583a9 {
    C4741o9(C4719m9 m9Var) {
        super(m9Var);
    }

    /* renamed from: C */
    static C4369qa m18052C(C4369qa qaVar, byte[] bArr) {
        C4164e9 a = C4164e9.m15717a();
        if (a != null) {
            return qaVar.mo12986i1(bArr, a);
        }
        return qaVar.mo12987s0(bArr);
    }

    /* renamed from: H */
    static List m18053H(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* renamed from: L */
    static boolean m18054L(List list, int i) {
        if (i >= list.size() * 64) {
            return false;
        }
        if (((1 << (i % 64)) & ((Long) list.get(i / 64)).longValue()) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: N */
    static boolean m18055N(String str) {
        if (str == null || !str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") || str.length() > 310) {
            return false;
        }
        return true;
    }

    /* renamed from: P */
    static final void m18056P(C4227i4 i4Var, String str, Object obj) {
        List H = i4Var.mo13241H();
        int i = 0;
        while (true) {
            if (i >= H.size()) {
                i = -1;
                break;
            } else if (str.equals(((C4312n4) H.get(i)).mo13396G())) {
                break;
            } else {
                i++;
            }
        }
        C4295m4 E = C4312n4.m16323E();
        E.mo13342B(str);
        if (obj instanceof Long) {
            E.mo13341A(((Long) obj).longValue());
        }
        if (i >= 0) {
            i4Var.mo13235B(i, E);
        } else {
            i4Var.mo13247t(E);
        }
    }

    /* renamed from: m */
    static final boolean m18057m(zzaw zzaw, zzq zzq) {
        C7264i.m27902k(zzaw);
        C7264i.m27902k(zzq);
        if (!TextUtils.isEmpty(zzq.f15118e) || !TextUtils.isEmpty(zzq.f15133t)) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    static final C4312n4 m18058n(C4244j4 j4Var, String str) {
        for (C4312n4 n4Var : j4Var.mo13283I()) {
            if (n4Var.mo13396G().equals(str)) {
                return n4Var;
            }
        }
        return null;
    }

    /* renamed from: o */
    static final Object m18059o(C4244j4 j4Var, String str) {
        C4312n4 n = m18058n(j4Var, str);
        if (n == null) {
            return null;
        }
        if (n.mo13403Y()) {
            return n.mo13397H();
        }
        if (n.mo13401W()) {
            return Long.valueOf(n.mo13395D());
        }
        if (n.mo13399U()) {
            return Double.valueOf(n.mo13392A());
        }
        if (n.mo13394C() <= 0) {
            return null;
        }
        List<C4312n4> I = n.mo13398I();
        ArrayList arrayList = new ArrayList();
        for (C4312n4 n4Var : I) {
            if (n4Var != null) {
                Bundle bundle = new Bundle();
                for (C4312n4 n4Var2 : n4Var.mo13398I()) {
                    if (n4Var2.mo13403Y()) {
                        bundle.putString(n4Var2.mo13396G(), n4Var2.mo13397H());
                    } else if (n4Var2.mo13401W()) {
                        bundle.putLong(n4Var2.mo13396G(), n4Var2.mo13395D());
                    } else if (n4Var2.mo13399U()) {
                        bundle.putDouble(n4Var2.mo13396G(), n4Var2.mo13392A());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* renamed from: p */
    private final void m18060p(StringBuilder sb, int i, List list) {
        String str;
        String str2;
        Long l;
        if (list != null) {
            int i2 = i + 1;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C4312n4 n4Var = (C4312n4) it.next();
                if (n4Var != null) {
                    m18062r(sb, i2);
                    sb.append("param {\n");
                    Double d = null;
                    if (n4Var.mo13402X()) {
                        str = this.f14613a.mo14847D().mo14529e(n4Var.mo13396G());
                    } else {
                        str = null;
                    }
                    m18065u(sb, i2, "name", str);
                    if (n4Var.mo13403Y()) {
                        str2 = n4Var.mo13397H();
                    } else {
                        str2 = null;
                    }
                    m18065u(sb, i2, "string_value", str2);
                    if (n4Var.mo13401W()) {
                        l = Long.valueOf(n4Var.mo13395D());
                    } else {
                        l = null;
                    }
                    m18065u(sb, i2, "int_value", l);
                    if (n4Var.mo13399U()) {
                        d = Double.valueOf(n4Var.mo13392A());
                    }
                    m18065u(sb, i2, "double_value", d);
                    if (n4Var.mo13394C() > 0) {
                        m18060p(sb, i2, n4Var.mo13398I());
                    }
                    m18062r(sb, i2);
                    sb.append("}\n");
                }
            }
        }
    }

    /* renamed from: q */
    private final void m18061q(StringBuilder sb, int i, C4107b3 b3Var) {
        String str;
        if (b3Var != null) {
            m18062r(sb, i);
            sb.append("filter {\n");
            if (b3Var.mo12899H()) {
                m18065u(sb, i, "complement", Boolean.valueOf(b3Var.mo12898G()));
            }
            if (b3Var.mo12901J()) {
                m18065u(sb, i, "param_name", this.f14613a.mo14847D().mo14529e(b3Var.mo12897E()));
            }
            if (b3Var.mo12902K()) {
                int i2 = i + 1;
                C4311n3 D = b3Var.mo12896D();
                if (D != null) {
                    m18062r(sb, i2);
                    sb.append("string_filter {\n");
                    if (D.mo13390I()) {
                        switch (D.mo13391J()) {
                            case 1:
                                str = "UNKNOWN_MATCH_TYPE";
                                break;
                            case 2:
                                str = "REGEXP";
                                break;
                            case 3:
                                str = "BEGINS_WITH";
                                break;
                            case 4:
                                str = "ENDS_WITH";
                                break;
                            case 5:
                                str = "PARTIAL";
                                break;
                            case 6:
                                str = "EXACT";
                                break;
                            default:
                                str = "IN_LIST";
                                break;
                        }
                        m18065u(sb, i2, "match_type", str);
                    }
                    if (D.mo13389H()) {
                        m18065u(sb, i2, "expression", D.mo13385D());
                    }
                    if (D.mo13388G()) {
                        m18065u(sb, i2, "case_sensitive", Boolean.valueOf(D.mo13387F()));
                    }
                    if (D.mo13384A() > 0) {
                        m18062r(sb, i2 + 1);
                        sb.append("expression_list {\n");
                        for (String append : D.mo13386E()) {
                            m18062r(sb, i2 + 2);
                            sb.append(append);
                            sb.append("\n");
                        }
                        sb.append("}\n");
                    }
                    m18062r(sb, i2);
                    sb.append("}\n");
                }
            }
            if (b3Var.mo12900I()) {
                m18066v(sb, i + 1, "number_filter", b3Var.mo12895C());
            }
            m18062r(sb, i);
            sb.append("}\n");
        }
    }

    /* renamed from: r */
    private static final void m18062r(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    /* renamed from: s */
    private static final String m18063s(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* renamed from: t */
    private static final void m18064t(StringBuilder sb, int i, String str, C4513z4 z4Var) {
        Integer num;
        Integer num2;
        Long l;
        if (z4Var != null) {
            m18062r(sb, 3);
            sb.append(str);
            sb.append(" {\n");
            if (z4Var.mo13862B() != 0) {
                m18062r(sb, 4);
                sb.append("results: ");
                int i2 = 0;
                for (Long l2 : z4Var.mo13866I()) {
                    int i3 = i2 + 1;
                    if (i2 != 0) {
                        sb.append(", ");
                    }
                    sb.append(l2);
                    i2 = i3;
                }
                sb.append(10);
            }
            if (z4Var.mo13864D() != 0) {
                m18062r(sb, 4);
                sb.append("status: ");
                int i4 = 0;
                for (Long l3 : z4Var.mo13868K()) {
                    int i5 = i4 + 1;
                    if (i4 != 0) {
                        sb.append(", ");
                    }
                    sb.append(l3);
                    i4 = i5;
                }
                sb.append(10);
            }
            if (z4Var.mo13861A() != 0) {
                m18062r(sb, 4);
                sb.append("dynamic_filter_timestamps: {");
                int i6 = 0;
                for (C4210h4 h4Var : z4Var.mo13865H()) {
                    int i7 = i6 + 1;
                    if (i6 != 0) {
                        sb.append(", ");
                    }
                    if (h4Var.mo13207H()) {
                        num2 = Integer.valueOf(h4Var.mo13204A());
                    } else {
                        num2 = null;
                    }
                    sb.append(num2);
                    sb.append(":");
                    if (h4Var.mo13206G()) {
                        l = Long.valueOf(h4Var.mo13205B());
                    } else {
                        l = null;
                    }
                    sb.append(l);
                    i6 = i7;
                }
                sb.append("}\n");
            }
            if (z4Var.mo13863C() != 0) {
                m18062r(sb, 4);
                sb.append("sequence_filter_timestamps: {");
                int i8 = 0;
                for (C4109b5 b5Var : z4Var.mo13867J()) {
                    int i9 = i8 + 1;
                    if (i8 != 0) {
                        sb.append(", ");
                    }
                    if (b5Var.mo12909I()) {
                        num = Integer.valueOf(b5Var.mo12906B());
                    } else {
                        num = null;
                    }
                    sb.append(num);
                    sb.append(": [");
                    int i12 = 0;
                    for (Long longValue : b5Var.mo12908F()) {
                        long longValue2 = longValue.longValue();
                        int i13 = i12 + 1;
                        if (i12 != 0) {
                            sb.append(", ");
                        }
                        sb.append(longValue2);
                        i12 = i13;
                    }
                    sb.append("]");
                    i8 = i9;
                }
                sb.append("}\n");
            }
            m18062r(sb, 3);
            sb.append("}\n");
        }
    }

    /* renamed from: u */
    private static final void m18065u(StringBuilder sb, int i, String str, Object obj) {
        if (obj != null) {
            m18062r(sb, i + 1);
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append(10);
        }
    }

    /* renamed from: v */
    private static final void m18066v(StringBuilder sb, int i, String str, C4192g3 g3Var) {
        String str2;
        if (g3Var != null) {
            m18062r(sb, i);
            sb.append(str);
            sb.append(" {\n");
            if (g3Var.mo13138G()) {
                int L = g3Var.mo13143L();
                if (L == 1) {
                    str2 = "UNKNOWN_COMPARISON_TYPE";
                } else if (L == 2) {
                    str2 = "LESS_THAN";
                } else if (L == 3) {
                    str2 = "GREATER_THAN";
                } else if (L != 4) {
                    str2 = "BETWEEN";
                } else {
                    str2 = "EQUAL";
                }
                m18065u(sb, i, "comparison_type", str2);
            }
            if (g3Var.mo13140I()) {
                m18065u(sb, i, "match_as_float", Boolean.valueOf(g3Var.mo13137F()));
            }
            if (g3Var.mo13139H()) {
                m18065u(sb, i, "comparison_value", g3Var.mo13134C());
            }
            if (g3Var.mo13142K()) {
                m18065u(sb, i, "min_comparison_value", g3Var.mo13136E());
            }
            if (g3Var.mo13141J()) {
                m18065u(sb, i, "max_comparison_value", g3Var.mo13135D());
            }
            m18062r(sb, i);
            sb.append("}\n");
        }
    }

    /* renamed from: w */
    static int m18067w(C4414t4 t4Var, String str) {
        for (int i = 0; i < t4Var.mo13618r0(); i++) {
            if (str.equals(t4Var.mo13609k0(i).mo13033F())) {
                return i;
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final zzaw mo14656A(C4103b bVar) {
        String str;
        Object obj;
        Bundle y = mo14668y(bVar.mo12884e(), true);
        if (!y.containsKey("_o") || (obj = y.get("_o")) == null) {
            str = "app";
        } else {
            str = obj.toString();
        }
        String str2 = str;
        String b = C8263q.m31095b(bVar.mo12883d());
        if (b == null) {
            b = bVar.mo12883d();
        }
        return new zzaw(b, new zzau(y), str2, bVar.mo12879a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final C4244j4 mo14657B(C4742p pVar) {
        C4227i4 E = C4244j4.m16143E();
        E.mo13237D(pVar.f14708e);
        C4764r rVar = new C4764r(pVar.f14709f);
        while (rVar.hasNext()) {
            String b = rVar.next();
            C4295m4 E2 = C4312n4.m16323E();
            E2.mo13342B(b);
            Object q0 = pVar.f14709f.mo14986q0(b);
            C7264i.m27902k(q0);
            mo14663J(E2, q0);
            E.mo13247t(E2);
        }
        return (C4244j4) E.mo13361l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public final String mo14658D(C4397s4 s4Var) {
        Long l;
        Long l2;
        Double d;
        if (s4Var == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (C4431u4 u4Var : s4Var.mo13535D()) {
            if (u4Var != null) {
                m18062r(sb, 1);
                sb.append("bundle {\n");
                if (u4Var.mo13739s1()) {
                    m18065u(sb, 1, "protocol_version", Integer.valueOf(u4Var.mo13693C1()));
                }
                C4356pe.m16469c();
                if (this.f14613a.mo14876z().mo14398B(u4Var.mo13724W1(), C4636f3.f14393q0) && u4Var.mo13742v1()) {
                    m18065u(sb, 1, "session_stitching_token", u4Var.mo13710L());
                }
                m18065u(sb, 1, C11772k.C11773a.f34170b, u4Var.mo13706J());
                if (u4Var.mo13735o1()) {
                    m18065u(sb, 1, "gmp_version", Long.valueOf(u4Var.mo13709K1()));
                }
                if (u4Var.mo13687A1()) {
                    m18065u(sb, 1, "uploading_gmp_version", Long.valueOf(u4Var.mo13720Q1()));
                }
                if (u4Var.mo13733m1()) {
                    m18065u(sb, 1, "dynamite_version", Long.valueOf(u4Var.mo13705I1()));
                }
                if (u4Var.mo13730j1()) {
                    m18065u(sb, 1, "config_version", Long.valueOf(u4Var.mo13701G1()));
                }
                m18065u(sb, 1, "gmp_app_id", u4Var.mo13700G());
                m18065u(sb, 1, "admob_app_id", u4Var.mo13723V1());
                m18065u(sb, 1, "app_id", u4Var.mo13724W1());
                m18065u(sb, 1, C11772k.C11773a.f34185q, u4Var.mo13688B());
                if (u4Var.mo13728g1()) {
                    m18065u(sb, 1, "app_version_major", Integer.valueOf(u4Var.mo13726b0()));
                }
                m18065u(sb, 1, "firebase_instance_id", u4Var.mo13698F());
                if (u4Var.mo13732l1()) {
                    m18065u(sb, 1, "dev_cert_hash", Long.valueOf(u4Var.mo13703H1()));
                }
                m18065u(sb, 1, "app_store", u4Var.mo13686A());
                if (u4Var.mo13746z1()) {
                    m18065u(sb, 1, "upload_timestamp_millis", Long.valueOf(u4Var.mo13719P1()));
                }
                if (u4Var.mo13743w1()) {
                    m18065u(sb, 1, "start_timestamp_millis", Long.valueOf(u4Var.mo13715N1()));
                }
                if (u4Var.mo13734n1()) {
                    m18065u(sb, 1, "end_timestamp_millis", Long.valueOf(u4Var.mo13707J1()));
                }
                if (u4Var.mo13738r1()) {
                    m18065u(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(u4Var.mo13713M1()));
                }
                if (u4Var.mo13737q1()) {
                    m18065u(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(u4Var.mo13711L1()));
                }
                m18065u(sb, 1, "app_instance_id", u4Var.mo13725X1());
                m18065u(sb, 1, "resettable_device_id", u4Var.mo13708K());
                m18065u(sb, 1, "ds_id", u4Var.mo13696E());
                if (u4Var.mo13736p1()) {
                    m18065u(sb, 1, "limited_ad_tracking", Boolean.valueOf(u4Var.mo13689B0()));
                }
                m18065u(sb, 1, "os_version", u4Var.mo13704I());
                m18065u(sb, 1, "device_model", u4Var.mo13694D());
                m18065u(sb, 1, "user_default_language", u4Var.mo13712M());
                if (u4Var.mo13745y1()) {
                    m18065u(sb, 1, "time_zone_offset_minutes", Integer.valueOf(u4Var.mo13697E1()));
                }
                if (u4Var.mo13729h1()) {
                    m18065u(sb, 1, "bundle_sequential_index", Integer.valueOf(u4Var.mo13727d1()));
                }
                if (u4Var.mo13741u1()) {
                    m18065u(sb, 1, "service_upload", Boolean.valueOf(u4Var.mo13692C0()));
                }
                m18065u(sb, 1, "health_monitor", u4Var.mo13702H());
                if (u4Var.mo13740t1()) {
                    m18065u(sb, 1, "retry_counter", Integer.valueOf(u4Var.mo13695D1()));
                }
                if (u4Var.mo13731k1()) {
                    m18065u(sb, 1, "consent_signals", u4Var.mo13691C());
                }
                C4423td.m16772c();
                if (this.f14613a.mo14876z().mo14398B((String) null, C4636f3.f14337G0) && u4Var.mo13744x1()) {
                    m18065u(sb, 1, "target_os_version", Long.valueOf(u4Var.mo13717O1()));
                }
                List<C4143d5> P = u4Var.mo13718P();
                if (P != null) {
                    for (C4143d5 d5Var : P) {
                        if (d5Var != null) {
                            m18062r(sb, 2);
                            sb.append("user_property {\n");
                            if (d5Var.mo13037S()) {
                                l = Long.valueOf(d5Var.mo13032C());
                            } else {
                                l = null;
                            }
                            m18065u(sb, 2, "set_timestamp_millis", l);
                            m18065u(sb, 2, "name", this.f14613a.mo14847D().mo14530f(d5Var.mo13033F()));
                            m18065u(sb, 2, "string_value", d5Var.mo13034G());
                            if (d5Var.mo13036Q()) {
                                l2 = Long.valueOf(d5Var.mo13031B());
                            } else {
                                l2 = null;
                            }
                            m18065u(sb, 2, "int_value", l2);
                            if (d5Var.mo13035P()) {
                                d = Double.valueOf(d5Var.mo13030A());
                            } else {
                                d = null;
                            }
                            m18065u(sb, 2, "double_value", d);
                            m18062r(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<C4176f4> N = u4Var.mo13714N();
                if (N != null) {
                    for (C4176f4 f4Var : N) {
                        if (f4Var != null) {
                            m18062r(sb, 2);
                            sb.append("audience_membership {\n");
                            if (f4Var.mo13119K()) {
                                m18065u(sb, 2, "audience_id", Integer.valueOf(f4Var.mo13115A()));
                            }
                            if (f4Var.mo13120L()) {
                                m18065u(sb, 2, "new_audience", Boolean.valueOf(f4Var.mo13118J()));
                            }
                            m18064t(sb, 2, "current_data", f4Var.mo13116D());
                            if (f4Var.mo13121M()) {
                                m18064t(sb, 2, "previous_data", f4Var.mo13117E());
                            }
                            m18062r(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<C4244j4> O = u4Var.mo13716O();
                if (O != null) {
                    for (C4244j4 j4Var : O) {
                        if (j4Var != null) {
                            m18062r(sb, 2);
                            sb.append("event {\n");
                            m18065u(sb, 2, "name", this.f14613a.mo14847D().mo14528d(j4Var.mo13282H()));
                            if (j4Var.mo13286U()) {
                                m18065u(sb, 2, "timestamp_millis", Long.valueOf(j4Var.mo13280D()));
                            }
                            if (j4Var.mo13285T()) {
                                m18065u(sb, 2, "previous_timestamp_millis", Long.valueOf(j4Var.mo13279C()));
                            }
                            if (j4Var.mo13284S()) {
                                m18065u(sb, 2, "count", Integer.valueOf(j4Var.mo13277A()));
                            }
                            if (j4Var.mo13278B() != 0) {
                                m18060p(sb, 2, j4Var.mo13283I());
                            }
                            m18062r(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                m18062r(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final String mo14659E(C4511z2 z2Var) {
        if (z2Var == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (z2Var.mo13857O()) {
            m18065u(sb, 0, "filter_id", Integer.valueOf(z2Var.mo13848B()));
        }
        m18065u(sb, 0, "event_name", this.f14613a.mo14847D().mo14528d(z2Var.mo13851G()));
        String s = m18063s(z2Var.mo13853K(), z2Var.mo13854L(), z2Var.mo13855M());
        if (!s.isEmpty()) {
            m18065u(sb, 0, "filter_type", s);
        }
        if (z2Var.mo13856N()) {
            m18066v(sb, 1, "event_count_filter", z2Var.mo13850F());
        }
        if (z2Var.mo13847A() > 0) {
            sb.append("  filters {\n");
            for (C4107b3 q : z2Var.mo13852H()) {
                m18061q(sb, 2, q);
            }
        }
        m18062r(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final String mo14660F(C4226i3 i3Var) {
        if (i3Var == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (i3Var.mo13232J()) {
            m18065u(sb, 0, "filter_id", Integer.valueOf(i3Var.mo13226A()));
        }
        m18065u(sb, 0, "property_name", this.f14613a.mo14847D().mo14530f(i3Var.mo13228E()));
        String s = m18063s(i3Var.mo13229G(), i3Var.mo13230H(), i3Var.mo13231I());
        if (!s.isEmpty()) {
            m18065u(sb, 0, "filter_type", s);
        }
        m18061q(sb, 1, i3Var.mo13227B());
        sb.append("}\n");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final List mo14661G(List list, List list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.f14613a.mo14551d().mo14680w().mo14616b("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    this.f14613a.mo14551d().mo14680w().mo14617c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size >= 0 && ((Long) arrayList.get(size)).longValue() == 0) {
                size2 = size - 1;
            }
        }
        return arrayList.subList(0, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final Map mo14662I(Bundle bundle, boolean z) {
        HashMap hashMap = new HashMap();
        for (String next : bundle.keySet()) {
            Object obj = bundle.get(next);
            boolean z2 = obj instanceof Parcelable[];
            if (z2 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    if (z2) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(mo14662I((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            Object obj2 = arrayList2.get(i);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(mo14662I((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(mo14662I((Bundle) obj, false));
                    }
                    hashMap.put(next, arrayList);
                }
            } else if (obj != null) {
                hashMap.put(next, obj);
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final void mo14663J(C4295m4 m4Var, Object obj) {
        C7264i.m27902k(obj);
        m4Var.mo13350y();
        m4Var.mo13348t();
        m4Var.mo13347s();
        m4Var.mo13349u();
        if (obj instanceof String) {
            m4Var.mo13343C((String) obj);
        } else if (obj instanceof Long) {
            m4Var.mo13341A(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            m4Var.mo13351z(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    C4295m4 E = C4312n4.m16323E();
                    for (String next : bundle.keySet()) {
                        C4295m4 E2 = C4312n4.m16323E();
                        E2.mo13342B(next);
                        Object obj2 = bundle.get(next);
                        if (obj2 instanceof Long) {
                            E2.mo13341A(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            E2.mo13343C((String) obj2);
                        } else if (obj2 instanceof Double) {
                            E2.mo13351z(((Double) obj2).doubleValue());
                        }
                        E.mo13346r(E2);
                    }
                    if (E.mo13344p() > 0) {
                        arrayList.add((C4312n4) E.mo13361l());
                    }
                }
            }
            m4Var.mo13345q(arrayList);
        } else {
            this.f14613a.mo14551d().mo14675r().mo14616b("Ignoring invalid (type) event param value", obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final void mo14664K(C4126c5 c5Var, Object obj) {
        C7264i.m27902k(obj);
        c5Var.mo12975r();
        c5Var.mo12974q();
        c5Var.mo12973p();
        if (obj instanceof String) {
            c5Var.mo12980z((String) obj);
        } else if (obj instanceof Long) {
            c5Var.mo12977t(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            c5Var.mo12976s(((Double) obj).doubleValue());
        } else {
            this.f14613a.mo14551d().mo14675r().mo14616b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final boolean mo14665M(long j, long j2) {
        if (j == 0 || j2 <= 0 || Math.abs(this.f14613a.mo14548a().mo23594a() - j) > j2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public final byte[] mo14666O(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            this.f14613a.mo14551d().mo14675r().mo14616b("Failed to gzip content", e);
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final boolean mo14304l() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final long mo14667x(byte[] bArr) {
        C7264i.m27902k(bArr);
        this.f14613a.mo14856N().mo14554h();
        MessageDigest t = C4785s9.m18231t();
        if (t != null) {
            return C4785s9.m18230s0(t.digest(bArr));
        }
        this.f14613a.mo14551d().mo14675r().mo14615a("Failed to get MD5");
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final Bundle mo14668y(Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, (String) null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(mo14668y((Map) arrayList.get(i), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r4.f14613a.mo14551d().mo14675r().mo14615a("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Parcelable mo14669z(byte[] r5, android.os.Parcelable.Creator r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r2 = r5.length     // Catch:{ ParseException -> 0x001c }
            r3 = 0
            r1.unmarshall(r5, r3, r2)     // Catch:{ ParseException -> 0x001c }
            r1.setDataPosition(r3)     // Catch:{ ParseException -> 0x001c }
            java.lang.Object r5 = r6.createFromParcel(r1)     // Catch:{ ParseException -> 0x001c }
            android.os.Parcelable r5 = (android.os.Parcelable) r5     // Catch:{ ParseException -> 0x001c }
            r1.recycle()
            return r5
        L_0x001a:
            r5 = move-exception
            goto L_0x002f
        L_0x001c:
            com.google.android.gms.measurement.internal.t4 r5 = r4.f14613a     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.p3 r5 = r5.mo14551d()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.n3 r5 = r5.mo14675r()     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "Failed to load parcelable from buffer"
            r5.mo14615a(r6)     // Catch:{ all -> 0x001a }
            r1.recycle()
            return r0
        L_0x002f:
            r1.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4741o9.mo14669z(byte[], android.os.Parcelable$Creator):android.os.Parcelable");
    }
}
