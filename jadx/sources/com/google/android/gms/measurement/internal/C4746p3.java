package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.C4505yc;
import p182n6.C7264i;

/* renamed from: com.google.android.gms.measurement.internal.p3 */
public final class C4746p3 extends C4726n5 {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public char f14713c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public long f14714d = -1;

    /* renamed from: e */
    private String f14715e;

    /* renamed from: f */
    private final C4724n3 f14716f = new C4724n3(this, 6, false, false);

    /* renamed from: g */
    private final C4724n3 f14717g = new C4724n3(this, 6, true, false);

    /* renamed from: h */
    private final C4724n3 f14718h = new C4724n3(this, 6, false, true);

    /* renamed from: i */
    private final C4724n3 f14719i = new C4724n3(this, 5, false, false);

    /* renamed from: j */
    private final C4724n3 f14720j = new C4724n3(this, 5, true, false);

    /* renamed from: k */
    private final C4724n3 f14721k = new C4724n3(this, 5, false, true);

    /* renamed from: l */
    private final C4724n3 f14722l = new C4724n3(this, 4, false, false);

    /* renamed from: m */
    private final C4724n3 f14723m = new C4724n3(this, 3, false, false);

    /* renamed from: n */
    private final C4724n3 f14724n = new C4724n3(this, 2, false, false);

    C4746p3(C4791t4 t4Var) {
        super(t4Var);
    }

    /* renamed from: A */
    static String m18087A(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String B = m18088B(z, obj);
        String B2 = m18088B(z, obj2);
        String B3 = m18088B(z, obj3);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(B)) {
            sb.append(str2);
            sb.append(B);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(B2)) {
            sb.append(str2);
            sb.append(B2);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(B3)) {
            sb.append(str3);
            sb.append(B3);
        }
        return sb.toString();
    }

    /* renamed from: B */
    static String m18088B(boolean z, Object obj) {
        String str;
        String className;
        String str2 = "";
        if (obj == null) {
            return str2;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        int i = 0;
        if (obj instanceof Long) {
            if (!z) {
                return obj.toString();
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            char charAt = obj.toString().charAt(0);
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf.length()) - 4.0d);
            StringBuilder sb = new StringBuilder();
            if (charAt == '-') {
                str2 = "-";
            }
            sb.append(str2);
            sb.append(round);
            sb.append("...");
            sb.append(str2);
            sb.append(round2);
            return sb.toString();
        } else if (obj instanceof Boolean) {
            return obj.toString();
        } else {
            if (obj instanceof Throwable) {
                Throwable th = (Throwable) obj;
                if (z) {
                    str = th.getClass().getName();
                } else {
                    str = th.toString();
                }
                StringBuilder sb2 = new StringBuilder(str);
                String C = m18089C(C4791t4.class.getCanonicalName());
                StackTraceElement[] stackTrace = th.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i];
                    if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && m18089C(className).equals(C)) {
                        sb2.append(": ");
                        sb2.append(stackTraceElement);
                        break;
                    }
                    i++;
                }
                return sb2.toString();
            } else if (obj instanceof C4735o3) {
                return ((C4735o3) obj).f14689a;
            } else {
                if (z) {
                    return "-";
                }
                return obj.toString();
            }
        }
    }

    /* renamed from: C */
    static String m18089C(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            return str.substring(0, lastIndexOf);
        }
        C4505yc.m17245c();
        if (((Boolean) C4636f3.f14325A0.mo14346a((Object) null)).booleanValue()) {
            return "";
        }
        return str;
    }

    /* renamed from: z */
    protected static Object m18094z(String str) {
        if (str == null) {
            return null;
        }
        return new C4735o3(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final String mo14672D() {
        String str;
        synchronized (this) {
            if (this.f14715e == null) {
                if (this.f14613a.mo14859Q() != null) {
                    this.f14715e = this.f14613a.mo14859Q();
                } else {
                    this.f14715e = this.f14613a.mo14876z().mo14417w();
                }
            }
            C7264i.m27902k(this.f14715e);
            str = this.f14715e;
        }
        return str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final void mo14673G(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(mo14672D(), i)) {
            Log.println(i, mo14672D(), m18087A(false, str, obj, obj2, obj3));
        }
        if (!z2 && i >= 5) {
            C7264i.m27902k(str);
            C4769r4 G = this.f14613a.mo14850G();
            if (G == null) {
                Log.println(6, mo14672D(), "Scheduler not set. Not logging error/warn");
            } else if (!G.mo14643n()) {
                Log.println(6, mo14672D(), "Scheduler not initialized. Not logging error/warn");
            } else {
                if (i >= 9) {
                    i = 8;
                }
                G.mo14776z(new C4713m3(this, i, str, obj, obj2, obj3));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo14329j() {
        return false;
    }

    /* renamed from: q */
    public final C4724n3 mo14674q() {
        return this.f14723m;
    }

    /* renamed from: r */
    public final C4724n3 mo14675r() {
        return this.f14716f;
    }

    /* renamed from: s */
    public final C4724n3 mo14676s() {
        return this.f14718h;
    }

    /* renamed from: t */
    public final C4724n3 mo14677t() {
        return this.f14717g;
    }

    /* renamed from: u */
    public final C4724n3 mo14678u() {
        return this.f14722l;
    }

    /* renamed from: v */
    public final C4724n3 mo14679v() {
        return this.f14724n;
    }

    /* renamed from: w */
    public final C4724n3 mo14680w() {
        return this.f14719i;
    }

    /* renamed from: x */
    public final C4724n3 mo14681x() {
        return this.f14721k;
    }

    /* renamed from: y */
    public final C4724n3 mo14682y() {
        return this.f14720j;
    }
}
