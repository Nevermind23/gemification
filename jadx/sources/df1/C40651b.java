package df1;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;
import ze1.C43425h;

/* renamed from: df1.b */
public abstract class C40651b implements Comparable {

    /* renamed from: d */
    public static final C40652a f96277d = new C40652a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final long f96278e = m117478f(0);

    /* renamed from: f */
    private static final long f96279f = C40654d.m117505i(4611686018427387903L);

    /* renamed from: g */
    private static final long f96280g = C40654d.m117505i(-4611686018427387903L);

    /* renamed from: df1.b$a */
    public static final class C40652a {
        private C40652a() {
        }

        public /* synthetic */ C40652a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final long mo94646a() {
            return C40651b.f96278e;
        }
    }

    /* renamed from: A */
    private static final boolean m117466A(long j) {
        return (((int) j) & 1) == 0;
    }

    /* renamed from: B */
    public static final boolean m117467B(long j) {
        return j == f96279f || j == f96280g;
    }

    /* renamed from: C */
    public static final boolean m117468C(long j) {
        return j < 0;
    }

    /* renamed from: D */
    public static final long m117469D(long j, long j2) {
        if (m117467B(j)) {
            if (m117493y(j2) || (j2 ^ j) >= 0) {
                return j;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        } else if (m117467B(j2)) {
            return j2;
        } else {
            if ((((int) j) & 1) == (((int) j2) & 1)) {
                long w = m117491w(j) + m117491w(j2);
                if (m117466A(j)) {
                    return C40654d.m117508l(w);
                }
                return C40654d.m117506j(w);
            } else if (m117494z(j)) {
                return m117475b(j, m117491w(j), m117491w(j2));
            } else {
                return m117475b(j, m117491w(j2), m117491w(j));
            }
        }
    }

    /* renamed from: E */
    public static final int m117470E(long j, C40655e eVar) {
        C41536l.m120489i(eVar, "unit");
        return (int) C43429k.m124591j(m117471F(j, eVar), -2147483648L, 2147483647L);
    }

    /* renamed from: F */
    public static final long m117471F(long j, C40655e eVar) {
        C41536l.m120489i(eVar, "unit");
        if (j == f96279f) {
            return Long.MAX_VALUE;
        }
        if (j == f96280g) {
            return Long.MIN_VALUE;
        }
        return C40656f.m117514a(m117491w(j), m117490v(j), eVar);
    }

    /* renamed from: G */
    public static String m117472G(long j) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (j == 0) {
            return "0s";
        }
        if (j == f96279f) {
            return "Infinity";
        }
        if (j == f96280g) {
            return "-Infinity";
        }
        boolean C = m117468C(j);
        StringBuilder sb = new StringBuilder();
        if (C) {
            sb.append('-');
        }
        long h = m117480h(j);
        long l = m117482l(h);
        int j2 = m117481j(h);
        int s = m117487s(h);
        int u = m117489u(h);
        int t = m117488t(h);
        int i = 0;
        if (l != 0) {
            z = true;
        } else {
            z = false;
        }
        if (j2 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (s != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (u == 0 && t == 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z) {
            sb.append(l);
            sb.append('d');
            i = 1;
        }
        if (z2 || (z && (z3 || z4))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(j2);
            sb.append('h');
            i = i2;
        }
        if (z3 || (z4 && (z2 || z))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(s);
            sb.append('m');
            i = i3;
        }
        if (z4) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (u != 0 || z || z2 || z3) {
                m117476c(j, sb, u, t, 9, "s", false);
            } else if (t >= 1000000) {
                m117476c(j, sb, t / 1000000, t % 1000000, 6, "ms", false);
            } else if (t >= 1000) {
                m117476c(j, sb, t / 1000, t % 1000, 3, "us", false);
            } else {
                sb.append(t);
                sb.append("ns");
            }
            i = i4;
        }
        if (C && i > 1) {
            sb.insert(1, '(').append(')');
        }
        String sb2 = sb.toString();
        C41536l.m120488h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: H */
    public static final long m117473H(long j) {
        return C40654d.m117504h(-m117491w(j), ((int) j) & 1);
    }

    /* renamed from: b */
    private static final long m117475b(long j, long j2, long j3) {
        long g = C40654d.m117510n(j3);
        long j4 = j2 + g;
        if (!new C43425h(-4611686018426L, 4611686018426L).mo102128r(j4)) {
            return C40654d.m117505i(C43429k.m124591j(j4, -4611686018427387903L, 4611686018427387903L));
        }
        return C40654d.m117507k(C40654d.m117509m(j4) + (j3 - C40654d.m117509m(g)));
    }

    /* renamed from: c */
    private static final void m117476c(long j, StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        boolean z2;
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String h0 = C40440x.m117166h0(String.valueOf(i2), i3, '0');
            int i4 = -1;
            int length = h0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (h0.charAt(length) != '0') {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z || i6 >= 3) {
                sb.append(h0, 0, ((i6 + 2) / 3) * 3);
                C41536l.m120488h(sb, "this.append(value, startIndex, endIndex)");
            } else {
                sb.append(h0, 0, i6);
                C41536l.m120488h(sb, "this.append(value, startIndex, endIndex)");
            }
        }
        sb.append(str);
    }

    /* renamed from: e */
    public static int m117477e(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return C41536l.m120492l(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        if (m117468C(j)) {
            return -i;
        }
        return i;
    }

    /* renamed from: f */
    public static long m117478f(long j) {
        if (C40653c.m117496a()) {
            if (m117466A(j)) {
                if (!new C43425h(-4611686018426999999L, 4611686018426999999L).mo102128r(m117491w(j))) {
                    throw new AssertionError(m117491w(j) + " ns is out of nanoseconds range");
                }
            } else if (!new C43425h(-4611686018427387903L, 4611686018427387903L).mo102128r(m117491w(j))) {
                throw new AssertionError(m117491w(j) + " ms is out of milliseconds range");
            } else if (new C43425h(-4611686018426L, 4611686018426L).mo102128r(m117491w(j))) {
                throw new AssertionError(m117491w(j) + " ms is denormalized");
            }
        }
        return j;
    }

    /* renamed from: g */
    public static final boolean m117479g(long j, long j2) {
        return j == j2;
    }

    /* renamed from: h */
    public static final long m117480h(long j) {
        return m117468C(j) ? m117473H(j) : j;
    }

    /* renamed from: j */
    public static final int m117481j(long j) {
        if (m117467B(j)) {
            return 0;
        }
        return (int) (m117483n(j) % ((long) 24));
    }

    /* renamed from: l */
    public static final long m117482l(long j) {
        return m117471F(j, C40655e.DAYS);
    }

    /* renamed from: n */
    public static final long m117483n(long j) {
        return m117471F(j, C40655e.HOURS);
    }

    /* renamed from: o */
    public static final long m117484o(long j) {
        return (!m117494z(j) || !m117493y(j)) ? m117471F(j, C40655e.MILLISECONDS) : m117491w(j);
    }

    /* renamed from: q */
    public static final long m117485q(long j) {
        return m117471F(j, C40655e.MINUTES);
    }

    /* renamed from: r */
    public static final long m117486r(long j) {
        return m117471F(j, C40655e.SECONDS);
    }

    /* renamed from: s */
    public static final int m117487s(long j) {
        if (m117467B(j)) {
            return 0;
        }
        return (int) (m117485q(j) % ((long) 60));
    }

    /* renamed from: t */
    public static final int m117488t(long j) {
        long j2;
        if (m117467B(j)) {
            return 0;
        }
        if (m117494z(j)) {
            j2 = C40654d.m117509m(m117491w(j) % ((long) 1000));
        } else {
            j2 = m117491w(j) % ((long) 1000000000);
        }
        return (int) j2;
    }

    /* renamed from: u */
    public static final int m117489u(long j) {
        if (m117467B(j)) {
            return 0;
        }
        return (int) (m117486r(j) % ((long) 60));
    }

    /* renamed from: v */
    private static final C40655e m117490v(long j) {
        return m117466A(j) ? C40655e.NANOSECONDS : C40655e.MILLISECONDS;
    }

    /* renamed from: w */
    private static final long m117491w(long j) {
        return j >> 1;
    }

    /* renamed from: x */
    public static int m117492x(long j) {
        return C7397t.m28148a(j);
    }

    /* renamed from: y */
    public static final boolean m117493y(long j) {
        return !m117467B(j);
    }

    /* renamed from: z */
    private static final boolean m117494z(long j) {
        return (((int) j) & 1) == 1;
    }
}
