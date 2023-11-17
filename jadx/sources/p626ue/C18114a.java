package p626ue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/* renamed from: ue.a */
public abstract class C18114a {

    /* renamed from: a */
    public static boolean f51376a = true;

    /* renamed from: b */
    private static ArrayList f51377b = null;

    /* renamed from: c */
    private static ArrayList f51378c = null;

    /* renamed from: d */
    private static int f51379d = 77;

    /* renamed from: e */
    public static int f51380e = 47;

    /* renamed from: f */
    public static int f51381f = 1;

    /* renamed from: g */
    public static int f51382g = 2;

    /* renamed from: h */
    public static int f51383h;

    /* renamed from: ue.a$a */
    public static abstract class C18115a {
        /* renamed from: a */
        public abstract String mo45808a(String str, char c);
    }

    /* renamed from: ue.a$b */
    public static class C18116b extends C18115a {

        /* renamed from: a */
        public static int f51384a = 24;

        /* renamed from: b */
        public static int f51385b = 0;

        /* renamed from: c */
        public static int f51386c = 1;

        /* renamed from: d */
        public static int f51387d = 2;

        /* renamed from: a */
        public String mo45808a(String str, char c) {
            int[] iArr = new int[str.length()];
            C18128c cVar = new C18128c(str);
            int i = 0;
            while (cVar.mo45813c()) {
                int a = cVar.mo45812a();
                int i2 = f51384a;
                if (((f51386c + i2) * i2) % f51387d != f51385b) {
                    f51384a = 13;
                    f51385b = 77;
                }
                C18129d a2 = C18129d.m62205a(a);
                int d = a2.mo45810d(a2.mo45811e(a) - ((c + c) + i));
                int i3 = f51384a;
                if (((f51386c + i3) * i3) % f51387d != f51385b) {
                    f51384a = 78;
                    f51385b = 94;
                }
                iArr[i] = d;
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    /* renamed from: ue.a$c */
    public static class C18117c extends C18119e {

        /* renamed from: a */
        public static int f51388a = 94;

        /* renamed from: b */
        public static int f51389b = 1;

        /* renamed from: c */
        public static int f51390c = 2;

        /* renamed from: d */
        public static int f51391d;

        /* renamed from: a */
        public String mo45809a(String str, char c, char c2) {
            int[] iArr = new int[str.length()];
            C18128c cVar = new C18128c(str);
            int i = 0;
            while (cVar.mo45813c()) {
                int a = cVar.mo45812a();
                C18129d a2 = C18129d.m62205a(a);
                int e = a2.mo45811e(a);
                int i2 = c + i;
                int i3 = f51388a;
                int i4 = i3 * (f51389b + i3);
                int i5 = f51390c;
                if (i4 % i5 != 0) {
                    f51388a = 37;
                    f51389b = 6;
                    if (((37 + 6) * 37) % i5 != f51391d) {
                        f51388a = 29;
                        f51391d = 91;
                    }
                }
                iArr[i] = a2.mo45810d((e + i2) - c2);
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    /* renamed from: ue.a$d */
    public static class C18118d extends C18115a {

        /* renamed from: a */
        public static int f51392a = 43;

        /* renamed from: b */
        public static int f51393b = 0;

        /* renamed from: c */
        public static int f51394c = 1;

        /* renamed from: d */
        public static int f51395d = 2;

        /* renamed from: b */
        public static int m62175b() {
            return 7;
        }

        /* renamed from: a */
        public String mo45808a(String str, char c) {
            int[] iArr = new int[str.length()];
            C18128c cVar = new C18128c(str);
            int i = 0;
            while (cVar.mo45813c()) {
                int a = cVar.mo45812a();
                C18129d a2 = C18129d.m62205a(a);
                int d = a2.mo45810d(a2.mo45811e(a) - (c + i));
                int i2 = f51392a;
                int i3 = f51394c;
                int i4 = (i2 + i3) * i2;
                int i5 = f51395d;
                if (i4 % i5 != f51393b) {
                    f51392a = 73;
                    f51393b = 69;
                    if (((i3 + 73) * 73) % i5 != 69) {
                        f51392a = 7;
                        f51393b = m62175b();
                    }
                }
                iArr[i] = d;
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    /* renamed from: ue.a$e */
    public static abstract class C18119e {
        /* renamed from: a */
        public abstract String mo45809a(String str, char c, char c2);
    }

    /* renamed from: ue.a$f */
    public static class C18120f extends C18119e {

        /* renamed from: a */
        public static int f51396a = 0;

        /* renamed from: b */
        public static int f51397b = 1;

        /* renamed from: c */
        public static int f51398c = 2;

        /* renamed from: d */
        public static int f51399d = 99;

        /* renamed from: b */
        public static int m62178b() {
            return 8;
        }

        /* renamed from: c */
        public static int m62179c() {
            return 1;
        }

        /* renamed from: a */
        public String mo45809a(String str, char c, char c2) {
            int[] iArr = new int[str.length()];
            C18128c cVar = new C18128c(str);
            int i = 0;
            while (cVar.mo45813c()) {
                int a = cVar.mo45812a();
                C18129d a2 = C18129d.m62205a(a);
                int e = a2.mo45811e(a);
                int i2 = f51399d;
                if ((i2 * (m62179c() + i2)) % f51398c != 0) {
                    f51399d = 93;
                    f51396a = m62178b();
                }
                iArr[i] = a2.mo45810d((e - (c + i)) + c2);
                if (((m62178b() + f51397b) * m62178b()) % f51398c != f51396a) {
                    f51396a = 34;
                }
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    /* renamed from: ue.a$g */
    public static class C18121g extends C18119e {

        /* renamed from: a */
        public static int f51400a = 31;

        /* renamed from: b */
        public static int f51401b = 0;

        /* renamed from: c */
        public static int f51402c = 1;

        /* renamed from: d */
        public static int f51403d = 2;

        /* renamed from: b */
        public static int m62181b() {
            return 86;
        }

        /* renamed from: c */
        public static int m62182c() {
            return 2;
        }

        /* renamed from: d */
        public static int m62183d() {
            return 0;
        }

        /* renamed from: a */
        public String mo45809a(String str, char c, char c2) {
            int[] iArr = new int[str.length()];
            C18128c cVar = new C18128c(str);
            int i = 0;
            while (cVar.mo45813c()) {
                int a = cVar.mo45812a();
                C18129d a2 = C18129d.m62205a(a);
                int i2 = f51400a;
                if (((f51402c + i2) * i2) % f51403d != f51401b) {
                    f51400a = m62181b();
                    f51401b = 28;
                }
                int e = a2.mo45811e(a);
                int i3 = c + i;
                int i4 = f51400a;
                if (((f51402c + i4) * i4) % m62182c() != m62183d()) {
                    f51400a = m62181b();
                    f51401b = 46;
                }
                iArr[i] = a2.mo45810d((e - i3) - c2);
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    /* renamed from: ue.a$h */
    public static class C18122h extends C18115a {

        /* renamed from: a */
        public static int f51404a = 84;

        /* renamed from: b */
        public static int f51405b = 0;

        /* renamed from: c */
        public static int f51406c = 1;

        /* renamed from: b */
        public static int m62185b() {
            return 71;
        }

        /* renamed from: c */
        public static int m62186c() {
            return 2;
        }

        /* renamed from: a */
        public String mo45808a(String str, char c) {
            int i = f51404a;
            if ((i * (f51406c + i)) % m62186c() != 0) {
                f51404a = 3;
                f51405b = 1;
            }
            int[] iArr = new int[str.length()];
            int i2 = f51404a;
            if (((f51406c + i2) * i2) % m62186c() != f51405b) {
                f51404a = m62185b();
                f51405b = m62185b();
            }
            C18128c cVar = new C18128c(str);
            int i3 = 0;
            while (cVar.mo45813c()) {
                int a = cVar.mo45812a();
                C18129d a2 = C18129d.m62205a(a);
                iArr[i3] = a2.mo45810d(a2.mo45811e(a) + c + c + c + i3);
                i3++;
            }
            return new String(iArr, 0, i3);
        }
    }

    /* renamed from: ue.a$i */
    public static class C18123i extends C18115a {

        /* renamed from: a */
        public static int f51407a = 1;

        /* renamed from: b */
        public static int f51408b = 2;

        /* renamed from: c */
        public static int f51409c = 23;

        /* renamed from: b */
        public static int m62188b() {
            return 29;
        }

        /* renamed from: c */
        public static int m62189c() {
            return 0;
        }

        /* renamed from: a */
        public String mo45808a(String str, char c) {
            int[] iArr = new int[str.length()];
            C18128c cVar = new C18128c(str);
            int i = f51409c;
            if ((i * (f51407a + i)) % f51408b != 0) {
                f51409c = m62188b();
                f51407a = 46;
            }
            int i2 = 0;
            while (cVar.mo45813c()) {
                int a = cVar.mo45812a();
                if (((m62188b() + f51407a) * m62188b()) % f51408b != m62189c()) {
                    f51407a = 96;
                }
                C18129d a2 = C18129d.m62205a(a);
                iArr[i2] = a2.mo45810d(a2.mo45811e(a) - (((c + c) + c) + i2));
                i2++;
            }
            return new String(iArr, 0, i2);
        }
    }

    /* renamed from: ue.a$j */
    public static class C18124j extends C18115a {

        /* renamed from: a */
        public static int f51410a = 89;

        /* renamed from: b */
        public static int f51411b = 1;

        /* renamed from: c */
        public static int f51412c = 2;

        /* renamed from: b */
        public static int m62191b() {
            return 7;
        }

        /* renamed from: a */
        public String mo45808a(String str, char c) {
            int i = f51410a;
            if ((i * (f51411b + i)) % f51412c != 0) {
                f51410a = 96;
                f51411b = m62191b();
            }
            int[] iArr = new int[str.length()];
            C18128c cVar = new C18128c(str);
            int i2 = f51410a;
            if ((i2 * (f51411b + i2)) % f51412c != 0) {
                f51410a = m62191b();
                f51411b = 2;
            }
            int i3 = 0;
            while (cVar.mo45813c()) {
                int a = cVar.mo45812a();
                C18129d a2 = C18129d.m62205a(a);
                iArr[i3] = a2.mo45810d(a2.mo45811e(a) + c + i3);
                i3++;
            }
            return new String(iArr, 0, i3);
        }
    }

    /* renamed from: ue.a$k */
    public static class C18125k extends C18115a {

        /* renamed from: a */
        public static int f51413a = 62;

        /* renamed from: b */
        public static int f51414b = 0;

        /* renamed from: c */
        public static int f51415c = 2;

        /* renamed from: b */
        public static int m62193b() {
            return 1;
        }

        /* renamed from: c */
        public static int m62194c() {
            return 96;
        }

        /* renamed from: a */
        public String mo45808a(String str, char c) {
            int[] iArr = new int[str.length()];
            C18128c cVar = new C18128c(str);
            int i = 0;
            while (cVar.mo45813c()) {
                int a = cVar.mo45812a();
                C18129d a2 = C18129d.m62205a(a);
                iArr[i] = a2.mo45810d(a2.mo45811e(a) + c + c + i);
                i++;
                int b = f51413a + m62193b();
                int i2 = f51413a;
                if ((b * i2) % f51415c != f51414b) {
                    if (((i2 + m62193b()) * f51413a) % f51415c != f51414b) {
                        f51413a = 28;
                        f51414b = m62194c();
                    }
                    f51413a = 36;
                    f51414b = 83;
                }
            }
            return new String(iArr, 0, i);
        }
    }

    /* renamed from: ue.a$l */
    public static class C18126l extends C18119e {

        /* renamed from: a */
        public static int f51416a = 41;

        /* renamed from: b */
        public static int f51417b = 0;

        /* renamed from: c */
        public static int f51418c = 1;

        /* renamed from: d */
        public static int f51419d = 2;

        /* renamed from: b */
        public static int m62196b() {
            return 7;
        }

        /* renamed from: a */
        public String mo45809a(String str, char c, char c2) {
            int[] iArr = new int[str.length()];
            C18128c cVar = new C18128c(str);
            int i = 0;
            while (cVar.mo45813c()) {
                int a = cVar.mo45812a();
                C18129d a2 = C18129d.m62205a(a);
                int d = a2.mo45810d(a2.mo45811e(a) + c + i + c2);
                int i2 = f51416a;
                if (((f51418c + i2) * i2) % f51419d != f51417b) {
                    f51416a = m62196b();
                    f51417b = m62196b();
                }
                iArr[i] = d;
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    /* renamed from: a */
    private static String m62165a(String str, char c, char c2) {
        m62169e();
        try {
            Object obj = f51377b.get(c2);
            int i = f51380e;
            if ((i * (f51381f + i)) % f51382g != 0) {
                f51380e = 83;
                f51383h = m62168d();
                int i2 = f51380e;
                if ((i2 * (f51381f + i2)) % f51382g != 0) {
                    f51380e = m62168d();
                    f51383h = m62168d();
                }
            }
            return ((C18115a) obj).mo45808a(str, c);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: b */
    private static String m62166b(String str, char c, char c2, char c3) {
        m62169e();
        try {
            return ((C18119e) f51378c.get(c3)).mo45809a(str, c, c2);
        } catch (Exception unused) {
            int i = f51380e;
            if ((i * (f51381f + i)) % f51382g == 0) {
                return "";
            }
            f51380e = 94;
            f51383h = m62168d();
            int i2 = f51380e;
            if ((i2 * (f51381f + i2)) % m62171g() == 0) {
                return "";
            }
            f51380e = m62168d();
            f51383h = 18;
            return "";
        }
    }

    /* renamed from: c */
    public static String m62167c(String str, char c, char c2) {
        int i = f51380e;
        if (((f51381f + i) * i) % f51382g != f51383h) {
            f51380e = m62168d();
            int d = m62168d();
            f51383h = d;
            int i2 = f51380e;
            if (((f51381f + i2) * i2) % f51382g != d) {
                f51380e = m62168d();
                f51383h = 25;
            }
        }
        return m62165a(str, c, c2).intern();
    }

    /* renamed from: d */
    public static int m62168d() {
        return 23;
    }

    /* renamed from: e */
    private static synchronized void m62169e() {
        synchronized (C18114a.class) {
            if (f51376a) {
                f51376a = false;
                f51377b = new ArrayList(7);
                f51378c = new ArrayList(4);
                f51377b.add(new C18118d());
                ArrayList arrayList = f51377b;
                int i = f51380e;
                if (((f51381f + i) * i) % f51382g != f51383h) {
                    f51380e = m62168d();
                    f51383h = m62168d();
                }
                try {
                    C18116b bVar = new C18116b();
                    int i2 = f51380e;
                    if (((f51381f + i2) * i2) % f51382g != f51383h) {
                        f51380e = 48;
                        f51383h = m62168d();
                    }
                    arrayList.add(bVar);
                    f51377b.add(new C18123i());
                    f51377b.add(new C18124j());
                    f51377b.add(new C18125k());
                    f51377b.add(new C18122h());
                    f51378c.add(new C18120f());
                    f51378c.add(new C18117c());
                    f51378c.add(new C18121g());
                    f51378c.add(new C18126l());
                    Collections.shuffle(f51377b, new Random((long) f51379d));
                    Collections.shuffle(f51378c, new Random((long) f51379d));
                } catch (Exception e) {
                    throw e;
                } catch (Exception e2) {
                    throw e2;
                }
            }
        }
        return;
    }

    /* renamed from: f */
    public static String m62170f(String str, char c, char c2, char c3) {
        if (((m62168d() + f51381f) * m62168d()) % f51382g != f51383h) {
            f51380e = 51;
            f51383h = 52;
        }
        String intern = m62166b(str, c, c2, c3).intern();
        int i = f51380e;
        if (((f51381f + i) * i) % f51382g != f51383h) {
            f51380e = 74;
            f51383h = m62168d();
        }
        return intern;
    }

    /* renamed from: g */
    public static int m62171g() {
        return 2;
    }
}
