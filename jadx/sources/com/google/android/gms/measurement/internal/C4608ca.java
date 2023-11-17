package com.google.android.gms.measurement.internal;

import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.internal.measurement.C4192g3;
import com.google.android.gms.internal.measurement.C4311n3;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import p182n6.C7264i;

/* renamed from: com.google.android.gms.measurement.internal.ca */
abstract class C4608ca {

    /* renamed from: a */
    final String f14248a;

    /* renamed from: b */
    final int f14249b;

    /* renamed from: c */
    Boolean f14250c;

    /* renamed from: d */
    Boolean f14251d;

    /* renamed from: e */
    Long f14252e;

    /* renamed from: f */
    Long f14253f;

    C4608ca(String str, int i) {
        this.f14248a = str;
        this.f14249b = i;
    }

    /* renamed from: d */
    private static Boolean m17616d(String str, int i, boolean z, String str2, List list, String str3, C4746p3 p3Var) {
        int i2;
        if (i == 7) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && i != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i - 1) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                if (true != z) {
                    i2 = 66;
                } else {
                    i2 = 0;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, i2).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (p3Var != null) {
                        p3Var.mo14680w().mo14616b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case 6:
                if (list == null) {
                    return null;
                }
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    /* renamed from: e */
    static Boolean m17617e(BigDecimal bigDecimal, C4192g3 g3Var, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        C7264i.m27902k(g3Var);
        if (g3Var.mo13138G()) {
            boolean z = true;
            if (g3Var.mo13143L() != 1) {
                if (g3Var.mo13143L() == 5) {
                    if (!g3Var.mo13142K() || !g3Var.mo13141J()) {
                        return null;
                    }
                } else if (!g3Var.mo13139H()) {
                    return null;
                }
                int L = g3Var.mo13143L();
                if (g3Var.mo13143L() == 5) {
                    if (C4741o9.m18055N(g3Var.mo13136E()) && C4741o9.m18055N(g3Var.mo13135D())) {
                        try {
                            BigDecimal bigDecimal5 = new BigDecimal(g3Var.mo13136E());
                            bigDecimal3 = new BigDecimal(g3Var.mo13135D());
                            bigDecimal2 = bigDecimal5;
                            bigDecimal4 = null;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    return null;
                } else if (!C4741o9.m18055N(g3Var.mo13134C())) {
                    return null;
                } else {
                    try {
                        bigDecimal4 = new BigDecimal(g3Var.mo13134C());
                        bigDecimal2 = null;
                        bigDecimal3 = null;
                    } catch (NumberFormatException unused2) {
                    }
                }
                if (L == 5) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                } else if (bigDecimal4 == null) {
                    return null;
                }
                int i = L - 1;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4 || bigDecimal2 == null) {
                                return null;
                            }
                            if (bigDecimal.compareTo(bigDecimal2) < 0 || bigDecimal.compareTo(bigDecimal3) > 0) {
                                z = false;
                            }
                            return Boolean.valueOf(z);
                        } else if (bigDecimal4 == null) {
                            return null;
                        } else {
                            if (d != Utils.DOUBLE_EPSILON) {
                                if (bigDecimal.compareTo(bigDecimal4.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 || bigDecimal.compareTo(bigDecimal4.add(new BigDecimal(d).multiply(new BigDecimal(2)))) >= 0) {
                                    z = false;
                                }
                                return Boolean.valueOf(z);
                            }
                            if (bigDecimal.compareTo(bigDecimal4) != 0) {
                                z = false;
                            }
                            return Boolean.valueOf(z);
                        }
                    } else if (bigDecimal4 == null) {
                        return null;
                    } else {
                        if (bigDecimal.compareTo(bigDecimal4) <= 0) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    }
                } else if (bigDecimal4 == null) {
                    return null;
                } else {
                    if (bigDecimal.compareTo(bigDecimal4) >= 0) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
            }
        }
        return null;
    }

    /* renamed from: f */
    static Boolean m17618f(String str, C4311n3 n3Var, C4746p3 p3Var) {
        String str2;
        List list;
        String str3;
        C7264i.m27902k(n3Var);
        if (str == null || !n3Var.mo13390I() || n3Var.mo13391J() == 1) {
            return null;
        }
        if (n3Var.mo13391J() == 7) {
            if (n3Var.mo13384A() == 0) {
                return null;
            }
        } else if (!n3Var.mo13389H()) {
            return null;
        }
        int J = n3Var.mo13391J();
        boolean F = n3Var.mo13387F();
        if (F || J == 2 || J == 7) {
            str2 = n3Var.mo13385D();
        } else {
            str2 = n3Var.mo13385D().toUpperCase(Locale.ENGLISH);
        }
        String str4 = str2;
        if (n3Var.mo13384A() == 0) {
            list = null;
        } else {
            List<String> E = n3Var.mo13386E();
            if (!F) {
                ArrayList arrayList = new ArrayList(E.size());
                for (String upperCase : E) {
                    arrayList.add(upperCase.toUpperCase(Locale.ENGLISH));
                }
                E = Collections.unmodifiableList(arrayList);
            }
            list = E;
        }
        if (J == 2) {
            str3 = str4;
        } else {
            str3 = null;
        }
        return m17616d(str, J, F, str4, list, str3, p3Var);
    }

    /* renamed from: g */
    static Boolean m17619g(double d, C4192g3 g3Var) {
        try {
            return m17617e(new BigDecimal(d), g3Var, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: h */
    static Boolean m17620h(long j, C4192g3 g3Var) {
        try {
            return m17617e(new BigDecimal(j), g3Var, Utils.DOUBLE_EPSILON);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: i */
    static Boolean m17621i(String str, C4192g3 g3Var) {
        if (!C4741o9.m18055N(str)) {
            return null;
        }
        try {
            return m17617e(new BigDecimal(str), g3Var, Utils.DOUBLE_EPSILON);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: j */
    static Boolean m17622j(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract int mo14315a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract boolean mo14316b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract boolean mo14317c();
}
