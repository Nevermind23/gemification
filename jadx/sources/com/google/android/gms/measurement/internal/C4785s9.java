package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.C3941b;
import com.google.android.gms.common.C3943d;
import com.google.android.gms.internal.measurement.C4224i1;
import com.google.android.gms.internal.measurement.C4270kd;
import com.medallia.digital.mobilesdk.C10749b8;
import com.salesforce.marketingcloud.C11398b;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import p182n6.C7264i;
import p248s7.C8246b0;
import p248s7.C8262p;
import p248s7.C8263q;
import p248s7.C8264r;
import p248s7.C8265s;
import p260t6.C8405g;
import p286v6.C8708e;

/* renamed from: com.google.android.gms.measurement.internal.s9 */
public final class C4785s9 extends C4726n5 {

    /* renamed from: g */
    private static final String[] f14858g = {"firebase_", "google_", "ga_"};

    /* renamed from: h */
    private static final String[] f14859h = {"_err"};

    /* renamed from: c */
    private SecureRandom f14860c;

    /* renamed from: d */
    private final AtomicLong f14861d = new AtomicLong(0);

    /* renamed from: e */
    private int f14862e;

    /* renamed from: f */
    private Integer f14863f = null;

    C4785s9(C4791t4 t4Var) {
        super(t4Var);
    }

    /* renamed from: Y */
    static boolean m18219Y(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    /* renamed from: Z */
    static boolean m18220Z(String str) {
        C7264i.m27898g(str);
        if (str.charAt(0) != '_' || str.equals("_ep")) {
            return true;
        }
        return false;
    }

    /* renamed from: a0 */
    static boolean m18221a0(Context context) {
        ActivityInfo receiverInfo;
        C7264i.m27902k(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: b0 */
    static boolean m18222b0(Context context, boolean z) {
        C7264i.m27902k(context);
        if (Build.VERSION.SDK_INT >= 24) {
            return m18229k0(context, "com.google.android.gms.measurement.AppMeasurementJobService");
        }
        return m18229k0(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    /* renamed from: c0 */
    public static boolean m18223c0(String str) {
        if (f14859h[0].equals(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: f0 */
    static final boolean m18224f0(Bundle bundle, int i) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", (long) i);
        return true;
    }

    /* renamed from: g0 */
    static final boolean m18225g0(String str) {
        C7264i.m27902k(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    /* renamed from: h0 */
    private final int m18226h0(String str) {
        if ("_ldl".equals(str)) {
            this.f14613a.mo14876z();
            return C11398b.f33142u;
        } else if ("_id".equals(str)) {
            this.f14613a.mo14876z();
            return C11398b.f33139r;
        } else if ("_lgclid".equals(str)) {
            this.f14613a.mo14876z();
            return 100;
        } else {
            this.f14613a.mo14876z();
            return 36;
        }
    }

    /* renamed from: i0 */
    private final Object m18227i0(int i, Object obj, boolean z, boolean z2) {
        long j;
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            if (true != ((Boolean) obj).booleanValue()) {
                j = 0;
            } else {
                j = 1;
            }
            return Long.valueOf(j);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return mo14828r(obj.toString(), i, z);
            }
            if (!z2 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if (parcelable instanceof Bundle) {
                    Bundle w0 = mo14836w0((Bundle) parcelable);
                    if (!w0.isEmpty()) {
                        arrayList.add(w0);
                    }
                }
            }
            return arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    /* renamed from: j0 */
    private static boolean m18228j0(String str, String[] strArr) {
        C7264i.m27902k(strArr);
        for (String a : strArr) {
            if (C8246b0.m31066a(str, a)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k0 */
    private static boolean m18229k0(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) == null || !serviceInfo.enabled) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: s0 */
    static long m18230s0(byte[] bArr) {
        boolean z;
        C7264i.m27902k(bArr);
        int length = bArr.length;
        int i = 0;
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        C7264i.m27905n(z);
        int i2 = length - 1;
        long j = 0;
        while (i2 >= 0 && i2 >= bArr.length - 8) {
            j += (((long) bArr[i2]) & 255) << i;
            i += 8;
            i2--;
        }
        return j;
    }

    /* renamed from: t */
    static MessageDigest m18231t() {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    /* renamed from: v */
    public static ArrayList m18232v(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzac zzac = (zzac) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", zzac.f15091d);
            bundle.putString("origin", zzac.f15092e);
            bundle.putLong("creation_timestamp", zzac.f15094g);
            bundle.putString("name", zzac.f15093f.f15108e);
            C8262p.m31093b(bundle, C7264i.m27902k(zzac.f15093f.mo14994v()));
            bundle.putBoolean("active", zzac.f15095h);
            String str = zzac.f15096i;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            zzaw zzaw = zzac.f15097j;
            if (zzaw != null) {
                bundle.putString("timed_out_event_name", zzaw.f15103d);
                zzau zzau = zzaw.f15104e;
                if (zzau != null) {
                    bundle.putBundle("timed_out_event_params", zzau.mo14991x());
                }
            }
            bundle.putLong("trigger_timeout", zzac.f15098k);
            zzaw zzaw2 = zzac.f15099l;
            if (zzaw2 != null) {
                bundle.putString("triggered_event_name", zzaw2.f15103d);
                zzau zzau2 = zzaw2.f15104e;
                if (zzau2 != null) {
                    bundle.putBundle("triggered_event_params", zzau2.mo14991x());
                }
            }
            bundle.putLong("triggered_timestamp", zzac.f15093f.f15109f);
            bundle.putLong("time_to_live", zzac.f15100m);
            zzaw zzaw3 = zzac.f15101n;
            if (zzaw3 != null) {
                bundle.putString("expired_event_name", zzaw3.f15103d);
                zzau zzau3 = zzaw3.f15104e;
                if (zzau3 != null) {
                    bundle.putBundle("expired_event_params", zzau3.mo14991x());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* renamed from: y */
    public static void m18233y(C4848y6 y6Var, Bundle bundle, boolean z) {
        if (!(bundle == null || y6Var == null)) {
            if (!bundle.containsKey("_sc") || z) {
                String str = y6Var.f15042a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = y6Var.f15043b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", y6Var.f15044c);
                return;
            }
            z = false;
        }
        if (bundle != null && y6Var == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final void mo14793A(Parcelable[] parcelableArr, int i, boolean z) {
        C7264i.m27902k(parcelableArr);
        for (Bundle bundle : parcelableArr) {
            int i2 = 0;
            for (String str : new TreeSet(bundle.keySet())) {
                if (m18220Z(str) && !m18228j0(str, C8264r.f23468d) && (i2 = i2 + 1) > i) {
                    if (z) {
                        this.f14613a.mo14551d().mo14676s().mo14617c("Param can't contain more than " + i + " item-scoped custom parameters", this.f14613a.mo14847D().mo14529e(str), this.f14613a.mo14847D().mo14526b(bundle));
                        m18224f0(bundle, 28);
                    } else {
                        this.f14613a.mo14551d().mo14676s().mo14617c("Param cannot contain item-scoped custom parameters", this.f14613a.mo14847D().mo14529e(str), this.f14613a.mo14847D().mo14526b(bundle));
                        m18224f0(bundle, 23);
                    }
                    bundle.remove(str);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final void mo14794B(C4757q3 q3Var, int i) {
        int i2 = 0;
        for (String str : new TreeSet(q3Var.f14787d.keySet())) {
            if (m18220Z(str) && (i2 = i2 + 1) > i) {
                this.f14613a.mo14551d().mo14676s().mo14617c("Event can't contain more than " + i + " params", this.f14613a.mo14847D().mo14528d(q3Var.f14784a), this.f14613a.mo14847D().mo14526b(q3Var.f14787d));
                m18224f0(q3Var.f14787d, 5);
                q3Var.f14787d.remove(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public final void mo14795C(C4774r9 r9Var, String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        m18224f0(bundle, i);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", (long) i2);
        }
        r9Var.mo14453a(str, "_err", bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public final void mo14796D(Bundle bundle, String str, Object obj) {
        String str2;
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Bundle[]) {
                bundle.putParcelableArray(str, (Bundle[]) obj);
            } else if (str != null) {
                if (obj != null) {
                    str2 = obj.getClass().getSimpleName();
                } else {
                    str2 = null;
                }
                this.f14613a.mo14551d().mo14681x().mo14617c("Not putting event parameter. Invalid value type. name, type", this.f14613a.mo14847D().mo14529e(str), str2);
            }
        }
    }

    /* renamed from: E */
    public final void mo14797E(C4224i1 i1Var, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            i1Var.mo12891H1(bundle);
        } catch (RemoteException e) {
            this.f14613a.mo14551d().mo14680w().mo14616b("Error returning boolean value to wrapper", e);
        }
    }

    /* renamed from: F */
    public final void mo14798F(C4224i1 i1Var, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            i1Var.mo12891H1(bundle);
        } catch (RemoteException e) {
            this.f14613a.mo14551d().mo14680w().mo14616b("Error returning bundle list to wrapper", e);
        }
    }

    /* renamed from: G */
    public final void mo14799G(C4224i1 i1Var, Bundle bundle) {
        try {
            i1Var.mo12891H1(bundle);
        } catch (RemoteException e) {
            this.f14613a.mo14551d().mo14680w().mo14616b("Error returning bundle value to wrapper", e);
        }
    }

    /* renamed from: H */
    public final void mo14800H(C4224i1 i1Var, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            i1Var.mo12891H1(bundle);
        } catch (RemoteException e) {
            this.f14613a.mo14551d().mo14680w().mo14616b("Error returning byte array to wrapper", e);
        }
    }

    /* renamed from: I */
    public final void mo14801I(C4224i1 i1Var, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            i1Var.mo12891H1(bundle);
        } catch (RemoteException e) {
            this.f14613a.mo14551d().mo14680w().mo14616b("Error returning int value to wrapper", e);
        }
    }

    /* renamed from: J */
    public final void mo14802J(C4224i1 i1Var, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            i1Var.mo12891H1(bundle);
        } catch (RemoteException e) {
            this.f14613a.mo14551d().mo14680w().mo14616b("Error returning long value to wrapper", e);
        }
    }

    /* renamed from: K */
    public final void mo14803K(C4224i1 i1Var, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            i1Var.mo12891H1(bundle);
        } catch (RemoteException e) {
            this.f14613a.mo14551d().mo14680w().mo14616b("Error returning string value to wrapper", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final void mo14804L(String str, String str2, String str3, Bundle bundle, List list, boolean z) {
        int i;
        int i2;
        String str4;
        int i3;
        int i4;
        String str5;
        int i5;
        String str6;
        int i6;
        String str7 = str2;
        Bundle bundle2 = bundle;
        List list2 = list;
        if (bundle2 != null) {
            C4643g z2 = this.f14613a.mo14876z();
            C4270kd.m16205c();
            String str8 = null;
            if (!z2.f14613a.mo14876z().mo14398B((String) null, C4636f3.f14327B0) || !z2.f14613a.mo14856N().mo14816X(231100000, true)) {
                i = 0;
            } else {
                i = 35;
            }
            int i7 = 0;
            for (String str9 : new TreeSet(bundle.keySet())) {
                if (list2 == null || !list2.contains(str9)) {
                    if (!z) {
                        i6 = mo14823o0(str9);
                    } else {
                        i6 = 0;
                    }
                    if (i6 == 0) {
                        i6 = mo14821n0(str9);
                    }
                    i2 = i6;
                } else {
                    i2 = 0;
                }
                if (i2 != 0) {
                    if (i2 == 3) {
                        str6 = str9;
                    } else {
                        str6 = str8;
                    }
                    mo14837x(bundle, i2, str9, str9, str6);
                    bundle2.remove(str9);
                    i3 = i;
                    str4 = str8;
                } else {
                    if (mo14814V(bundle2.get(str9))) {
                        this.f14613a.mo14551d().mo14681x().mo14618d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str7, str3, str9);
                        i5 = 22;
                        str5 = str9;
                        i4 = i;
                    } else {
                        String str10 = str3;
                        str5 = str9;
                        i4 = i;
                        i5 = mo14807O(str, str2, str9, bundle2.get(str9), bundle, list, z, false);
                    }
                    if (i5 != 0 && !"_ev".equals(str5)) {
                        mo14837x(bundle, i5, str5, str5, bundle2.get(str5));
                        bundle2.remove(str5);
                    } else if (m18220Z(str5) && !m18228j0(str5, C8264r.f23468d)) {
                        int i8 = i7 + 1;
                        if (!mo14816X(231100000, true)) {
                            this.f14613a.mo14551d().mo14676s().mo14617c("Item array not supported on client's version of Google Play Services (Android Only)", this.f14613a.mo14847D().mo14528d(str7), this.f14613a.mo14847D().mo14526b(bundle2));
                            m18224f0(bundle2, 23);
                            bundle2.remove(str5);
                            i3 = i4;
                        } else {
                            i3 = i4;
                            if (i8 > i3) {
                                C4270kd.m16205c();
                                str4 = null;
                                if (this.f14613a.mo14876z().mo14398B((String) null, C4636f3.f14327B0)) {
                                    this.f14613a.mo14551d().mo14676s().mo14617c("Item can't contain more than " + i3 + " item-scoped custom params", this.f14613a.mo14847D().mo14528d(str7), this.f14613a.mo14847D().mo14526b(bundle2));
                                    m18224f0(bundle2, 28);
                                    bundle2.remove(str5);
                                } else {
                                    this.f14613a.mo14551d().mo14676s().mo14617c("Item cannot contain custom parameters", this.f14613a.mo14847D().mo14528d(str7), this.f14613a.mo14847D().mo14526b(bundle2));
                                    m18224f0(bundle2, 23);
                                    bundle2.remove(str5);
                                }
                                i7 = i8;
                            }
                        }
                        str4 = null;
                        i7 = i8;
                    }
                    i3 = i4;
                    str4 = null;
                }
                i = i3;
                str8 = str4;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final boolean mo14805M(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (m18225g0(str)) {
                return true;
            }
            if (this.f14613a.mo14871q()) {
                this.f14613a.mo14551d().mo14676s().mo14616b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", C4746p3.m18094z(str));
            }
            return false;
        } else if (TextUtils.isEmpty(str2)) {
            if (this.f14613a.mo14871q()) {
                this.f14613a.mo14551d().mo14676s().mo14615a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        } else if (m18225g0(str2)) {
            return true;
        } else {
            this.f14613a.mo14551d().mo14676s().mo14616b("Invalid admob_app_id. Analytics disabled.", C4746p3.m18094z(str2));
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public final boolean mo14806N(String str, int i, String str2) {
        if (str2 == null) {
            this.f14613a.mo14551d().mo14676s().mo14616b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        } else {
            this.f14613a.mo14551d().mo14676s().mo14618d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00cf A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d0  */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo14807O(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.Object r17, android.os.Bundle r18, java.util.List r19, boolean r20, boolean r21) {
        /*
            r13 = this;
            r7 = r13
            r8 = r16
            r0 = r17
            r1 = r18
            r13.mo14554h()
            boolean r2 = r13.mo14814V(r0)
            java.lang.String r3 = "param"
            r4 = 0
            if (r2 == 0) goto L_0x00ac
            if (r21 == 0) goto L_0x00a9
            java.lang.String[] r2 = p248s7.C8264r.f23467c
            boolean r2 = m18228j0(r8, r2)
            if (r2 != 0) goto L_0x0020
            r0 = 20
            return r0
        L_0x0020:
            com.google.android.gms.measurement.internal.t4 r2 = r7.f14613a
            com.google.android.gms.measurement.internal.f8 r2 = r2.mo14854L()
            r2.mo14554h()
            r2.mo14922i()
            boolean r5 = r2.mo14374B()
            if (r5 != 0) goto L_0x0033
            goto L_0x0045
        L_0x0033:
            com.google.android.gms.measurement.internal.t4 r2 = r2.f14613a
            com.google.android.gms.measurement.internal.s9 r2 = r2.mo14856N()
            int r2 = r2.mo14827q0()
            r5 = 200900(0x310c4, float:2.81521E-40)
            if (r2 >= r5) goto L_0x0045
            r0 = 25
            return r0
        L_0x0045:
            com.google.android.gms.measurement.internal.t4 r2 = r7.f14613a
            r2.mo14876z()
            boolean r2 = r0 instanceof android.os.Parcelable[]
            if (r2 == 0) goto L_0x0053
            r5 = r0
            android.os.Parcelable[] r5 = (android.os.Parcelable[]) r5
            int r5 = r5.length
            goto L_0x005e
        L_0x0053:
            boolean r5 = r0 instanceof java.util.ArrayList
            if (r5 == 0) goto L_0x00ac
            r5 = r0
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
        L_0x005e:
            r6 = 200(0xc8, float:2.8E-43)
            if (r5 <= r6) goto L_0x00ac
            com.google.android.gms.measurement.internal.t4 r9 = r7.f14613a
            com.google.android.gms.measurement.internal.p3 r9 = r9.mo14551d()
            com.google.android.gms.measurement.internal.n3 r9 = r9.mo14681x()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r10 = "Parameter array is too long; discarded. Value kind, name, array length"
            r9.mo14618d(r10, r3, r8, r5)
            com.google.android.gms.measurement.internal.t4 r5 = r7.f14613a
            r5.mo14876z()
            r5 = 17
            if (r2 == 0) goto L_0x008e
            r2 = r0
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            int r9 = r2.length
            if (r9 <= r6) goto L_0x00a7
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r6)
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            r1.putParcelableArray(r8, r2)
            goto L_0x00a7
        L_0x008e:
            boolean r2 = r0 instanceof java.util.ArrayList
            if (r2 == 0) goto L_0x00a7
            r2 = r0
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r9 = r2.size()
            if (r9 <= r6) goto L_0x00a7
            java.util.ArrayList r9 = new java.util.ArrayList
            java.util.List r2 = r2.subList(r4, r6)
            r9.<init>(r2)
            r1.putParcelableArrayList(r8, r9)
        L_0x00a7:
            r9 = r5
            goto L_0x00ad
        L_0x00a9:
            r0 = 21
            return r0
        L_0x00ac:
            r9 = r4
        L_0x00ad:
            boolean r1 = m18219Y(r15)
            if (r1 != 0) goto L_0x00c2
            boolean r1 = m18219Y(r16)
            if (r1 == 0) goto L_0x00ba
            goto L_0x00c2
        L_0x00ba:
            com.google.android.gms.measurement.internal.t4 r1 = r7.f14613a
            r1.mo14876z()
            r1 = 100
            goto L_0x00c9
        L_0x00c2:
            com.google.android.gms.measurement.internal.t4 r1 = r7.f14613a
            r1.mo14876z()
            r1 = 256(0x100, float:3.59E-43)
        L_0x00c9:
            boolean r1 = r13.mo14809Q(r3, r8, r1, r0)
            if (r1 == 0) goto L_0x00d0
            return r9
        L_0x00d0:
            if (r21 == 0) goto L_0x0160
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 == 0) goto L_0x00e7
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r5 = r19
            r6 = r20
            r0.mo14804L(r1, r2, r3, r4, r5, r6)
            goto L_0x015f
        L_0x00e7:
            boolean r1 = r0 instanceof android.os.Parcelable[]
            if (r1 == 0) goto L_0x011e
            r10 = r0
            android.os.Parcelable[] r10 = (android.os.Parcelable[]) r10
            int r11 = r10.length
            r12 = r4
        L_0x00f0:
            if (r12 >= r11) goto L_0x015f
            r0 = r10[r12]
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x010c
            com.google.android.gms.measurement.internal.t4 r1 = r7.f14613a
            com.google.android.gms.measurement.internal.p3 r1 = r1.mo14551d()
            com.google.android.gms.measurement.internal.n3 r1 = r1.mo14681x()
            java.lang.Class r0 = r0.getClass()
            java.lang.String r2 = "All Parcelable[] elements must be of type Bundle. Value type, name"
            r1.mo14617c(r2, r0, r8)
            goto L_0x0160
        L_0x010c:
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r5 = r19
            r6 = r20
            r0.mo14804L(r1, r2, r3, r4, r5, r6)
            int r12 = r12 + 1
            goto L_0x00f0
        L_0x011e:
            boolean r1 = r0 instanceof java.util.ArrayList
            if (r1 == 0) goto L_0x0160
            r10 = r0
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            int r11 = r10.size()
            r12 = r4
        L_0x012a:
            if (r12 >= r11) goto L_0x015f
            java.lang.Object r0 = r10.get(r12)
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x014d
            com.google.android.gms.measurement.internal.t4 r1 = r7.f14613a
            com.google.android.gms.measurement.internal.p3 r1 = r1.mo14551d()
            com.google.android.gms.measurement.internal.n3 r1 = r1.mo14681x()
            if (r0 == 0) goto L_0x0145
            java.lang.Class r0 = r0.getClass()
            goto L_0x0147
        L_0x0145:
            java.lang.String r0 = "null"
        L_0x0147:
            java.lang.String r2 = "All ArrayList elements must be of type Bundle. Value type, name"
            r1.mo14617c(r2, r0, r8)
            goto L_0x0160
        L_0x014d:
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r5 = r19
            r6 = r20
            r0.mo14804L(r1, r2, r3, r4, r5, r6)
            int r12 = r12 + 1
            goto L_0x012a
        L_0x015f:
            return r9
        L_0x0160:
            r0 = 4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4785s9.mo14807O(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public final boolean mo14808P(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.f14613a.mo14551d().mo14676s().mo14616b("Name is required and can't be null. Type", str);
            return false;
        }
        C7264i.m27902k(str2);
        String[] strArr3 = f14858g;
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(strArr3[i])) {
                this.f14613a.mo14551d().mo14676s().mo14617c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !m18228j0(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && m18228j0(str2, strArr2)) {
            return true;
        }
        this.f14613a.mo14551d().mo14676s().mo14617c("Name is reserved. Type, name", str, str2);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public final boolean mo14809Q(String str, String str2, int i, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String obj2 = obj.toString();
            if (obj2.codePointCount(0, obj2.length()) > i) {
                this.f14613a.mo14551d().mo14681x().mo14618d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(obj2.length()));
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public final boolean mo14810R(String str, String str2) {
        if (str2 == null) {
            this.f14613a.mo14551d().mo14676s().mo14616b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.f14613a.mo14551d().mo14676s().mo14616b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                if (codePointAt == 95) {
                    codePointAt = 95;
                } else {
                    this.f14613a.mo14551d().mo14676s().mo14617c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                    return false;
                }
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    this.f14613a.mo14551d().mo14676s().mo14617c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public final boolean mo14811S(String str, String str2) {
        if (str2 == null) {
            this.f14613a.mo14551d().mo14676s().mo14616b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.f14613a.mo14551d().mo14676s().mo14616b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                this.f14613a.mo14551d().mo14676s().mo14617c("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    this.f14613a.mo14551d().mo14676s().mo14617c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public final boolean mo14812T(String str) {
        mo14554h();
        if (C8708e.m32461a(this.f14613a.mo14550c()).mo24087a(str) == 0) {
            return true;
        }
        this.f14613a.mo14551d().mo14674q().mo14616b("Permission not granted", str);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public final boolean mo14813U(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String u = this.f14613a.mo14876z().mo14415u();
        this.f14613a.mo14549b();
        return u.equals(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public final boolean mo14814V(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public final boolean mo14815W(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo e = C8708e.m32461a(context).mo24091e(str, 64);
            if (e == null || (signatureArr = e.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (CertificateException e2) {
            this.f14613a.mo14551d().mo14675r().mo14616b("Error obtaining certificate", e2);
            return true;
        } catch (PackageManager.NameNotFoundException e3) {
            this.f14613a.mo14551d().mo14675r().mo14616b("Package name not found", e3);
            return true;
        }
    }

    /* renamed from: X */
    public final boolean mo14816X(int i, boolean z) {
        Boolean J = this.f14613a.mo14854L().mo14375J();
        if (mo14827q0() >= i / 1000) {
            return true;
        }
        if (J == null) {
            return false;
        }
        if (!J.booleanValue()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public final boolean mo14817d0(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            C7264i.m27902k(str);
            if (!str.equals(str2)) {
                return true;
            }
            return false;
        } else if (!isEmpty || !isEmpty2) {
            if (!isEmpty) {
                if (TextUtils.isEmpty(str4)) {
                    return false;
                }
                if (TextUtils.isEmpty(str3) || !str3.equals(str4)) {
                    return true;
                }
                return false;
            } else if (TextUtils.isEmpty(str3) || !str3.equals(str4)) {
                return true;
            } else {
                return false;
            }
        } else if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
            if (!TextUtils.isEmpty(str4)) {
                return true;
            }
            return false;
        } else if (!str3.equals(str4)) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e0 */
    public final byte[] mo14818e0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo14328i() {
        mo14554h();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                this.f14613a.mo14551d().mo14680w().mo14615a("Utils falling back to Random for random id");
            }
        }
        this.f14861d.set(nextLong);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo14329j() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l0 */
    public final int mo14819l0(String str, Object obj) {
        boolean z;
        if ("_ldl".equals(str)) {
            z = mo14809Q("user property referrer", str, m18226h0(str), obj);
        } else {
            z = mo14809Q("user property", str, m18226h0(str), obj);
        }
        if (z) {
            return 0;
        }
        return 7;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m0 */
    public final int mo14820m0(String str) {
        if (!mo14810R("event", str)) {
            return 2;
        }
        if (!mo14808P("event", C8263q.f23461a, C8263q.f23462b, str)) {
            return 13;
        }
        this.f14613a.mo14876z();
        if (!mo14806N("event", 40, str)) {
            return 2;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n0 */
    public final int mo14821n0(String str) {
        if (!mo14810R("event param", str)) {
            return 3;
        }
        if (!mo14808P("event param", (String[]) null, (String[]) null, str)) {
            return 14;
        }
        this.f14613a.mo14876z();
        if (!mo14806N("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final Object mo14822o(String str, Object obj) {
        boolean equals = "_ev".equals(str);
        int i = C11398b.f33139r;
        if (equals) {
            this.f14613a.mo14876z();
            return m18227i0(C11398b.f33139r, obj, true, true);
        }
        if (m18219Y(str)) {
            this.f14613a.mo14876z();
        } else {
            this.f14613a.mo14876z();
            i = 100;
        }
        return m18227i0(i, obj, false, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o0 */
    public final int mo14823o0(String str) {
        if (!mo14811S("event param", str)) {
            return 3;
        }
        if (!mo14808P("event param", (String[]) null, (String[]) null, str)) {
            return 14;
        }
        this.f14613a.mo14876z();
        if (!mo14806N("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final Object mo14824p(String str, Object obj) {
        if ("_ldl".equals(str)) {
            return m18227i0(m18226h0(str), obj, true, false);
        }
        return m18227i0(m18226h0(str), obj, false, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p0 */
    public final int mo14825p0(String str) {
        if (!mo14810R("user property", str)) {
            return 6;
        }
        if (!mo14808P("user property", C8265s.f23469a, (String[]) null, str)) {
            return 15;
        }
        this.f14613a.mo14876z();
        if (!mo14806N("user property", 24, str)) {
            return 6;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final String mo14826q() {
        byte[] bArr = new byte[16];
        mo14832u().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    /* renamed from: q0 */
    public final int mo14827q0() {
        if (this.f14863f == null) {
            this.f14863f = Integer.valueOf(C3941b.m14941h().mo12153b(this.f14613a.mo14550c()) / 1000);
        }
        return this.f14863f.intValue();
    }

    /* renamed from: r */
    public final String mo14828r(String str, int i, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return null;
    }

    /* renamed from: r0 */
    public final int mo14829r0(int i) {
        return C3941b.m14941h().mo11873j(this.f14613a.mo14550c(), C3943d.f12557a);
    }

    /* renamed from: s */
    public final URL mo14830s(long j, String str, String str2, long j2) {
        try {
            C7264i.m27898g(str2);
            C7264i.m27898g(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", new Object[]{String.format("v%s.%s", new Object[]{77000L, Integer.valueOf(mo14827q0())}), str2, str, Long.valueOf(j2)});
            if (str.equals(this.f14613a.mo14876z().mo14416v())) {
                format = format.concat("&ddl_test=1");
            }
            return new URL(format);
        } catch (IllegalArgumentException | MalformedURLException e) {
            this.f14613a.mo14551d().mo14675r().mo14616b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    /* renamed from: t0 */
    public final long mo14831t0() {
        long andIncrement;
        long j;
        if (this.f14861d.get() == 0) {
            synchronized (this.f14861d) {
                long nextLong = new Random(System.nanoTime() ^ this.f14613a.mo14548a().mo23594a()).nextLong();
                int i = this.f14862e + 1;
                this.f14862e = i;
                j = nextLong + ((long) i);
            }
            return j;
        }
        synchronized (this.f14861d) {
            this.f14861d.compareAndSet(-1, 1);
            andIncrement = this.f14861d.getAndIncrement();
        }
        return andIncrement;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final SecureRandom mo14832u() {
        mo14554h();
        if (this.f14860c == null) {
            this.f14860c = new SecureRandom();
        }
        return this.f14860c;
    }

    /* renamed from: u0 */
    public final long mo14833u0(long j, long j2) {
        return (j + (j2 * C10749b8.C10751b.f30743b)) / 86400000;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v0 */
    public final Bundle mo14834v0(Uri uri, boolean z) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        Uri uri2 = uri;
        if (uri2 != null) {
            try {
                if (uri.isHierarchical()) {
                    str8 = uri2.getQueryParameter("utm_campaign");
                    str7 = uri2.getQueryParameter("utm_source");
                    str6 = uri2.getQueryParameter("utm_medium");
                    str5 = uri2.getQueryParameter("gclid");
                    str4 = uri2.getQueryParameter("utm_id");
                    str3 = uri2.getQueryParameter("dclid");
                    str2 = uri2.getQueryParameter("srsltid");
                    if (z) {
                        str = uri2.getQueryParameter("sfmc_id");
                    } else {
                        str = null;
                    }
                } else {
                    str8 = null;
                    str7 = null;
                    str6 = null;
                    str5 = null;
                    str4 = null;
                    str3 = null;
                    str2 = null;
                    str = null;
                }
                if (TextUtils.isEmpty(str8) && TextUtils.isEmpty(str7) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str5) && TextUtils.isEmpty(str4) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2) && (!z || TextUtils.isEmpty(str))) {
                    return null;
                }
                Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty(str8)) {
                    bundle.putString("campaign", str8);
                }
                if (!TextUtils.isEmpty(str7)) {
                    bundle.putString("source", str7);
                }
                if (!TextUtils.isEmpty(str6)) {
                    bundle.putString("medium", str6);
                }
                if (!TextUtils.isEmpty(str5)) {
                    bundle.putString("gclid", str5);
                }
                String queryParameter = uri2.getQueryParameter("utm_term");
                if (!TextUtils.isEmpty(queryParameter)) {
                    bundle.putString("term", queryParameter);
                }
                String queryParameter2 = uri2.getQueryParameter("utm_content");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    bundle.putString("content", queryParameter2);
                }
                String queryParameter3 = uri2.getQueryParameter("aclid");
                if (!TextUtils.isEmpty(queryParameter3)) {
                    bundle.putString("aclid", queryParameter3);
                }
                String queryParameter4 = uri2.getQueryParameter("cp1");
                if (!TextUtils.isEmpty(queryParameter4)) {
                    bundle.putString("cp1", queryParameter4);
                }
                String queryParameter5 = uri2.getQueryParameter("anid");
                if (!TextUtils.isEmpty(queryParameter5)) {
                    bundle.putString("anid", queryParameter5);
                }
                if (!TextUtils.isEmpty(str4)) {
                    bundle.putString("campaign_id", str4);
                }
                if (!TextUtils.isEmpty(str3)) {
                    bundle.putString("dclid", str3);
                }
                String queryParameter6 = uri2.getQueryParameter("utm_source_platform");
                if (!TextUtils.isEmpty(queryParameter6)) {
                    bundle.putString("source_platform", queryParameter6);
                }
                String queryParameter7 = uri2.getQueryParameter("utm_creative_format");
                if (!TextUtils.isEmpty(queryParameter7)) {
                    bundle.putString("creative_format", queryParameter7);
                }
                String queryParameter8 = uri2.getQueryParameter("utm_marketing_tactic");
                if (!TextUtils.isEmpty(queryParameter8)) {
                    bundle.putString("marketing_tactic", queryParameter8);
                }
                if (!TextUtils.isEmpty(str2)) {
                    bundle.putString("srsltid", str2);
                }
                if (z && !TextUtils.isEmpty(str)) {
                    bundle.putString("sfmc_id", str);
                }
                return bundle;
            } catch (UnsupportedOperationException e) {
                this.f14613a.mo14551d().mo14680w().mo14616b("Install referrer url isn't a hierarchical URI", e);
                return null;
            }
        } else {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final void mo14835w(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            this.f14613a.mo14551d().mo14680w().mo14616b("Params already contained engagement", Long.valueOf(j2));
        } else {
            j2 = 0;
        }
        bundle.putLong("_et", j + j2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w0 */
    public final Bundle mo14836w0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String next : bundle.keySet()) {
                Object o = mo14822o(next, bundle.get(next));
                if (o == null) {
                    this.f14613a.mo14551d().mo14681x().mo14616b("Param value can't be null", this.f14613a.mo14847D().mo14529e(next));
                } else {
                    mo14796D(bundle2, next, o);
                }
            }
        }
        return bundle2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final void mo14837x(Bundle bundle, int i, String str, String str2, Object obj) {
        if (m18224f0(bundle, i)) {
            this.f14613a.mo14876z();
            bundle.putString("_ev", mo14828r(str, 40, true));
            if (obj != null) {
                C7264i.m27902k(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", (long) obj.toString().length());
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.lang.String} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0108 A[SYNTHETIC] */
    /* renamed from: x0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo14838x0(java.lang.String r21, java.lang.String r22, android.os.Bundle r23, java.util.List r24, boolean r25) {
        /*
            r20 = this;
            r9 = r20
            r10 = r22
            r11 = r23
            r12 = r24
            java.lang.String[] r0 = p248s7.C8263q.f23464d
            boolean r13 = m18228j0(r10, r0)
            if (r11 == 0) goto L_0x010d
            android.os.Bundle r15 = new android.os.Bundle
            r15.<init>(r11)
            com.google.android.gms.measurement.internal.t4 r0 = r9.f14613a
            com.google.android.gms.measurement.internal.g r0 = r0.mo14876z()
            int r8 = r0.mo14407m()
            java.util.TreeSet r0 = new java.util.TreeSet
            java.util.Set r1 = r23.keySet()
            r0.<init>(r1)
            java.util.Iterator r16 = r0.iterator()
            r17 = 0
            r18 = r17
        L_0x0030:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x010b
            java.lang.Object r0 = r16.next()
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            if (r12 == 0) goto L_0x0049
            boolean r0 = r12.contains(r7)
            if (r0 != 0) goto L_0x0046
            goto L_0x0049
        L_0x0046:
            r2 = r17
            goto L_0x0059
        L_0x0049:
            if (r25 != 0) goto L_0x0050
            int r0 = r9.mo14823o0(r7)
            goto L_0x0052
        L_0x0050:
            r0 = r17
        L_0x0052:
            if (r0 != 0) goto L_0x0058
            int r0 = r9.mo14821n0(r7)
        L_0x0058:
            r2 = r0
        L_0x0059:
            if (r2 == 0) goto L_0x006f
            r0 = 3
            if (r2 != r0) goto L_0x0060
            r5 = r7
            goto L_0x0061
        L_0x0060:
            r5 = 0
        L_0x0061:
            r0 = r20
            r1 = r15
            r3 = r7
            r4 = r7
            r0.mo14837x(r1, r2, r3, r4, r5)
            r15.remove(r7)
            r14 = r8
            goto L_0x0108
        L_0x006f:
            java.lang.Object r4 = r11.get(r7)
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r7
            r5 = r15
            r6 = r24
            r19 = r7
            r7 = r25
            r14 = r8
            r8 = r13
            int r2 = r0.mo14807O(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 17
            if (r2 != r0) goto L_0x009a
            r2 = 17
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r0 = r20
            r1 = r15
            r3 = r19
            r4 = r19
            r0.mo14837x(r1, r2, r3, r4, r5)
            goto L_0x00bc
        L_0x009a:
            if (r2 == 0) goto L_0x00bc
            java.lang.String r0 = "_ev"
            r6 = r19
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x00be
            r0 = 21
            if (r2 != r0) goto L_0x00ac
            r3 = r10
            goto L_0x00ad
        L_0x00ac:
            r3 = r6
        L_0x00ad:
            java.lang.Object r5 = r11.get(r6)
            r0 = r20
            r1 = r15
            r4 = r6
            r0.mo14837x(r1, r2, r3, r4, r5)
            r15.remove(r6)
            goto L_0x0108
        L_0x00bc:
            r6 = r19
        L_0x00be:
            boolean r0 = m18220Z(r6)
            if (r0 == 0) goto L_0x0108
            int r0 = r18 + 1
            if (r0 <= r14) goto L_0x0106
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Event can't contain more than "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r2 = " params"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.google.android.gms.measurement.internal.t4 r2 = r9.f14613a
            com.google.android.gms.measurement.internal.p3 r2 = r2.mo14551d()
            com.google.android.gms.measurement.internal.n3 r2 = r2.mo14676s()
            com.google.android.gms.measurement.internal.t4 r3 = r9.f14613a
            com.google.android.gms.measurement.internal.k3 r3 = r3.mo14847D()
            java.lang.String r3 = r3.mo14528d(r10)
            com.google.android.gms.measurement.internal.t4 r4 = r9.f14613a
            com.google.android.gms.measurement.internal.k3 r4 = r4.mo14847D()
            java.lang.String r4 = r4.mo14526b(r11)
            r2.mo14617c(r1, r3, r4)
            r1 = 5
            m18224f0(r15, r1)
            r15.remove(r6)
        L_0x0106:
            r18 = r0
        L_0x0108:
            r8 = r14
            goto L_0x0030
        L_0x010b:
            r14 = r15
            goto L_0x010e
        L_0x010d:
            r14 = 0
        L_0x010e:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4785s9.mo14838x0(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y0 */
    public final zzaw mo14839y0(String str, String str2, Bundle bundle, String str3, long j, boolean z, boolean z2) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (mo14820m0(str2) == 0) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            Bundle bundle3 = bundle2;
            bundle3.putString("_o", str3);
            Bundle x0 = mo14838x0(str, str2, bundle3, C8405g.m31541a("_o"), true);
            if (z) {
                x0 = mo14836w0(x0);
            }
            C7264i.m27902k(x0);
            return new zzaw(str2, new zzau(x0), str3, j);
        }
        this.f14613a.mo14551d().mo14675r().mo14616b("Invalid conditional property event name", this.f14613a.mo14847D().mo14530f(str2));
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final void mo14840z(Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            for (String next : bundle2.keySet()) {
                if (!bundle.containsKey(next)) {
                    this.f14613a.mo14856N().mo14796D(bundle, next, bundle2.get(next));
                }
            }
        }
    }
}
