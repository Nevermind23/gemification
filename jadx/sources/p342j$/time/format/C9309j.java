package p342j$.time.format;

import p342j$.time.temporal.C9333a;

/* renamed from: j$.time.format.j */
final class C9309j implements C9306g {

    /* renamed from: a */
    public final /* synthetic */ int f25791a;

    /* renamed from: b */
    private final Object f25792b;

    public /* synthetic */ C9309j(Object obj, int i) {
        this.f25791a = i;
        this.f25792b = obj;
    }

    /* renamed from: b */
    private static void m34343b(StringBuilder sb, int i) {
        sb.append((char) ((i / 10) + 48));
        sb.append((char) ((i % 10) + 48));
    }

    /* renamed from: a */
    public final boolean mo25039a(C9321v vVar, StringBuilder sb) {
        int i = this.f25791a;
        Object obj = this.f25792b;
        switch (i) {
            case 0:
                Long e = vVar.mo25080e(C9333a.OFFSET_SECONDS);
                if (e == null) {
                    return false;
                }
                sb.append("GMT");
                long longValue = e.longValue();
                int i2 = (int) longValue;
                if (longValue != ((long) i2)) {
                    throw new ArithmeticException();
                } else if (i2 == 0) {
                    return true;
                } else {
                    int abs = Math.abs((i2 / 3600) % 100);
                    int abs2 = Math.abs((i2 / 60) % 60);
                    int abs3 = Math.abs(i2 % 60);
                    sb.append(i2 < 0 ? "-" : "+");
                    if (((TextStyle) obj) == TextStyle.FULL) {
                        m34343b(sb, abs);
                        sb.append(':');
                        m34343b(sb, abs2);
                        if (abs3 == 0) {
                            return true;
                        }
                    } else {
                        if (abs >= 10) {
                            sb.append((char) ((abs / 10) + 48));
                        }
                        sb.append((char) ((abs % 10) + 48));
                        if (abs2 == 0 && abs3 == 0) {
                            return true;
                        }
                        sb.append(':');
                        m34343b(sb, abs2);
                        if (abs3 == 0) {
                            return true;
                        }
                    }
                    sb.append(':');
                    m34343b(sb, abs3);
                    return true;
                }
            default:
                sb.append((String) obj);
                return true;
        }
    }

    public final String toString() {
        int i = this.f25791a;
        Object obj = this.f25792b;
        switch (i) {
            case 0:
                return "LocalizedOffset(" + ((TextStyle) obj) + ")";
            default:
                String replace = ((String) obj).replace("'", "''");
                return "'" + replace + "'";
        }
    }
}
