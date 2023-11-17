package p613te;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/* renamed from: te.a */
public abstract class C17931a {

    /* renamed from: a */
    public static boolean f51026a = true;

    /* renamed from: b */
    private static ArrayList f51027b = null;

    /* renamed from: c */
    private static ArrayList f51028c = null;

    /* renamed from: d */
    private static int f51029d = 27;

    /* renamed from: e */
    public static int f51030e = 51;

    /* renamed from: f */
    public static int f51031f = 1;

    /* renamed from: g */
    public static int f51032g = 2;

    /* renamed from: h */
    public static int f51033h;

    /* renamed from: te.a$a */
    public static class C17932a extends C17940i {

        /* renamed from: a */
        public static int f51034a = 69;

        /* renamed from: b */
        public static int f51035b = 0;

        /* renamed from: c */
        public static int f51036c = 1;

        /* renamed from: d */
        public static int f51037d = 2;

        /* renamed from: b */
        public static int m61774b() {
            return 18;
        }

        /* renamed from: a */
        public String mo45605a(String str, char c) {
            int[] iArr = new int[str.length()];
            C17949g gVar = new C17949g(str);
            int i = 0;
            while (gVar.mo45620c()) {
                int a = gVar.mo45619a();
                C17954k b = C17954k.m61864b(a);
                iArr[i] = b.mo45607c(b.mo45608d(a) - (((c + c) + c) + i));
                i++;
                int i2 = f51034a;
                if (((f51036c + i2) * i2) % f51037d != f51035b) {
                    f51034a = m61774b();
                    f51035b = 47;
                }
            }
            return new String(iArr, 0, i);
        }
    }

    /* renamed from: te.a$b */
    public static class C17933b extends C17940i {

        /* renamed from: a */
        public static int f51038a = 19;

        /* renamed from: b */
        public static int f51039b = 1;

        /* renamed from: c */
        public static int f51040c = 2;

        /* renamed from: d */
        public static int f51041d;

        /* renamed from: b */
        public static int m61776b() {
            return 70;
        }

        /* renamed from: a */
        public String mo45605a(String str, char c) {
            int[] iArr = new int[str.length()];
            C17949g gVar = new C17949g(str);
            int i = f51038a;
            if (((f51039b + i) * i) % f51040c != f51041d) {
                f51038a = m61776b();
                f51041d = m61776b();
            }
            int i2 = 0;
            while (gVar.mo45620c()) {
                int a = gVar.mo45619a();
                C17954k b = C17954k.m61864b(a);
                int d = b.mo45608d(a);
                int i3 = f51038a;
                if ((i3 * (f51039b + i3)) % f51040c != 0) {
                    f51038a = 60;
                    f51039b = 15;
                }
                iArr[i2] = b.mo45607c(d + c + c + c + i2);
                i2++;
            }
            return new String(iArr, 0, i2);
        }
    }

    /* renamed from: te.a$c */
    public static class C17934c extends C17942k {

        /* renamed from: a */
        public static int f51042a = 42;

        /* renamed from: b */
        public static int f51043b = 0;

        /* renamed from: c */
        public static int f51044c = 1;

        /* renamed from: d */
        public static int f51045d = 2;

        /* renamed from: b */
        public static int m61778b() {
            return 60;
        }

        /* renamed from: a */
        public String mo45606a(String str, char c, char c2) {
            int i = f51042a;
            if (((f51044c + i) * i) % f51045d != 0) {
                f51042a = m61778b();
                f51043b = 3;
            }
            if (((i + f51044c) * f51042a) % f51045d != f51043b) {
                f51042a = m61778b();
                f51043b = 37;
            }
            int[] iArr = new int[str.length()];
            C17949g gVar = new C17949g(str);
            int i2 = 0;
            while (gVar.mo45620c()) {
                int a = gVar.mo45619a();
                C17954k b = C17954k.m61864b(a);
                iArr[i2] = b.mo45607c((b.mo45608d(a) - (c + i2)) - c2);
                i2++;
            }
            return new String(iArr, 0, i2);
        }
    }

    /* renamed from: te.a$d */
    public static class C17935d extends C17940i {

        /* renamed from: a */
        public static int f51046a = 63;

        /* renamed from: b */
        public static int f51047b = 1;

        /* renamed from: c */
        public static int f51048c = 2;

        /* renamed from: b */
        public static int m61780b() {
            return 2;
        }

        /* renamed from: c */
        public static int m61781c() {
            return 93;
        }

        /* renamed from: d */
        public static int m61782d() {
            return 0;
        }

        /* renamed from: a */
        public String mo45605a(String str, char c) {
            int[] iArr = new int[str.length()];
            C17949g gVar = new C17949g(str);
            int i = 0;
            while (true) {
                int i2 = f51046a;
                if (((f51047b + i2) * i2) % f51048c != m61782d()) {
                    f51046a = m61781c();
                    f51047b = 89;
                }
                if (!gVar.mo45620c()) {
                    return new String(iArr, 0, i);
                }
                int a = gVar.mo45619a();
                C17954k b = C17954k.m61864b(a);
                iArr[i] = b.mo45607c(b.mo45608d(a) + c + c + i);
                int i3 = f51046a;
                if ((i3 * (f51047b + i3)) % m61780b() != 0) {
                    f51046a = 32;
                    f51047b = 58;
                }
                i++;
            }
        }
    }

    /* renamed from: te.a$e */
    public static class C17936e extends C17940i {

        /* renamed from: a */
        public static int f51049a = 74;

        /* renamed from: b */
        public static int f51050b = 0;

        /* renamed from: c */
        public static int f51051c = 1;

        /* renamed from: d */
        public static int f51052d = 2;

        /* renamed from: b */
        public static int m61784b() {
            return 67;
        }

        /* renamed from: a */
        public String mo45605a(String str, char c) {
            int[] iArr = new int[str.length()];
            C17949g gVar = new C17949g(str);
            int i = 0;
            while (gVar.mo45620c()) {
                int a = gVar.mo45619a();
                C17954k b = C17954k.m61864b(a);
                int i2 = f51049a;
                if (((f51051c + i2) * i2) % f51052d != f51050b) {
                    f51049a = 30;
                    f51050b = m61784b();
                }
                int c2 = b.mo45607c(b.mo45608d(a) + c + i);
                int i3 = f51049a;
                if (((f51051c + i3) * i3) % f51052d != f51050b) {
                    f51049a = 20;
                    f51050b = 0;
                }
                iArr[i] = c2;
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    /* renamed from: te.a$f */
    public static class C17937f extends C17942k {

        /* renamed from: a */
        public static int f51053a = 18;

        /* renamed from: b */
        public static int f51054b = 0;

        /* renamed from: c */
        public static int f51055c = 2;

        /* renamed from: d */
        public static int f51056d = 1;

        /* renamed from: b */
        public static int m61786b() {
            return 1;
        }

        /* renamed from: c */
        public static int m61787c() {
            return 90;
        }

        /* renamed from: a */
        public String mo45606a(String str, char c, char c2) {
            int[] iArr = new int[str.length()];
            C17949g gVar = new C17949g(str);
            int i = 0;
            while (gVar.mo45620c()) {
                int a = gVar.mo45619a();
                C17954k b = C17954k.m61864b(a);
                int c3 = b.mo45607c(b.mo45608d(a) + c + i + c2);
                int i2 = f51053a;
                if ((i2 * (f51056d + i2)) % f51055c != 0) {
                    f51053a = 23;
                    f51054b = m61787c();
                }
                iArr[i] = c3;
                i++;
            }
            String str2 = new String(iArr, 0, i);
            if (((f51053a + m61786b()) * f51053a) % f51055c != f51054b) {
                f51053a = m61787c();
                f51054b = m61787c();
            }
            return str2;
        }
    }

    /* renamed from: te.a$g */
    public static class C17938g extends C17942k {

        /* renamed from: a */
        public static int f51057a = 61;

        /* renamed from: b */
        public static int f51058b = 0;

        /* renamed from: c */
        public static int f51059c = 1;

        /* renamed from: d */
        public static int f51060d = 2;

        /* renamed from: b */
        public static int m61789b() {
            return 37;
        }

        /* renamed from: a */
        public String mo45606a(String str, char c, char c2) {
            int[] iArr = new int[str.length()];
            C17949g gVar = new C17949g(str);
            int i = 0;
            while (gVar.mo45620c()) {
                int i2 = f51057a;
                if (((f51059c + i2) * i2) % f51060d != f51058b) {
                    f51057a = m61789b();
                    f51058b = m61789b();
                }
                int a = gVar.mo45619a();
                C17954k b = C17954k.m61864b(a);
                int c3 = b.mo45607c((b.mo45608d(a) + (c + i)) - c2);
                int i3 = f51057a;
                if ((i3 * (f51059c + i3)) % f51060d != 0) {
                    f51057a = m61789b();
                    f51058b = 0;
                }
                iArr[i] = c3;
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    /* renamed from: te.a$h */
    public static class C17939h extends C17940i {

        /* renamed from: a */
        public static int f51061a = 2;

        /* renamed from: b */
        public static int f51062b = 12;

        /* renamed from: c */
        public static int f51063c = 1;

        /* renamed from: b */
        public static int m61791b() {
            return 28;
        }

        /* renamed from: c */
        public static int m61792c() {
            return 1;
        }

        /* renamed from: a */
        public String mo45605a(String str, char c) {
            int i = f51062b;
            if ((i * (f51063c + i)) % f51061a != 0) {
                f51062b = 82;
                f51063c = 81;
            }
            int[] iArr = new int[str.length()];
            C17949g gVar = new C17949g(str);
            int i2 = 0;
            while (gVar.mo45620c()) {
                int a = gVar.mo45619a();
                C17954k b = C17954k.m61864b(a);
                int d = b.mo45608d(a);
                int i3 = c + c;
                int b2 = m61791b();
                if ((b2 * (m61792c() + b2)) % f51061a != 0) {
                    f51061a = 0;
                }
                iArr[i2] = b.mo45607c(d - (i3 + i2));
                i2++;
            }
            return new String(iArr, 0, i2);
        }
    }

    /* renamed from: te.a$i */
    public static abstract class C17940i {
        /* renamed from: a */
        public abstract String mo45605a(String str, char c);
    }

    /* renamed from: te.a$j */
    public static class C17941j extends C17940i {

        /* renamed from: a */
        public static int f51064a = 3;

        /* renamed from: b */
        public static int f51065b = 1;

        /* renamed from: c */
        public static int f51066c = 2;

        /* renamed from: d */
        public static int f51067d;

        /* renamed from: b */
        public static int m61795b() {
            return 19;
        }

        /* renamed from: a */
        public String mo45605a(String str, char c) {
            int i = f51064a;
            if (((f51065b + i) * i) % f51066c != f51067d) {
                f51064a = 22;
                f51067d = 55;
            }
            int[] iArr = new int[str.length()];
            C17949g gVar = new C17949g(str);
            int i2 = f51064a;
            if ((i2 * (f51065b + i2)) % f51066c != 0) {
                f51064a = 44;
                f51065b = m61795b();
            }
            int i3 = 0;
            while (gVar.mo45620c()) {
                int a = gVar.mo45619a();
                C17954k b = C17954k.m61864b(a);
                iArr[i3] = b.mo45607c(b.mo45608d(a) - (c + i3));
                i3++;
            }
            return new String(iArr, 0, i3);
        }
    }

    /* renamed from: te.a$k */
    public static abstract class C17942k {
        /* renamed from: a */
        public abstract String mo45606a(String str, char c, char c2);
    }

    /* renamed from: te.a$l */
    public static class C17943l extends C17942k {

        /* renamed from: a */
        public static int f51068a = 26;

        /* renamed from: b */
        public static int f51069b = 0;

        /* renamed from: c */
        public static int f51070c = 1;

        /* renamed from: b */
        public static int m61798b() {
            return 2;
        }

        /* renamed from: c */
        public static int m61799c() {
            return 56;
        }

        /* renamed from: a */
        public String mo45606a(String str, char c, char c2) {
            int i = f51068a;
            if (((f51070c + i) * i) % m61798b() != f51069b) {
                int i2 = f51068a;
                if ((i2 * (f51070c + i2)) % m61798b() != 0) {
                    f51068a = m61799c();
                    f51069b = 6;
                }
                f51068a = m61799c();
                f51069b = m61799c();
            }
            int[] iArr = new int[str.length()];
            C17949g gVar = new C17949g(str);
            int i3 = 0;
            while (gVar.mo45620c()) {
                int a = gVar.mo45619a();
                C17954k b = C17954k.m61864b(a);
                iArr[i3] = b.mo45607c((b.mo45608d(a) - (c + i3)) + c2);
                i3++;
            }
            return new String(iArr, 0, i3);
        }
    }

    /* renamed from: a */
    private static String m61766a(String str, char c, char c2) {
        m61771f();
        try {
            ArrayList arrayList = f51027b;
            int i = f51030e;
            if ((i * (f51031f + i)) % f51032g != 0) {
                f51030e = 33;
                f51033h = 23;
            }
            String a = ((C17940i) arrayList.get(c2)).mo45605a(str, c);
            int i2 = f51030e;
            if ((i2 * (f51031f + i2)) % f51032g != 0) {
                f51030e = m61770e();
                f51033h = 81;
            }
            return a;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: b */
    private static String m61767b(String str, char c, char c2, char c3) {
        m61771f();
        try {
            C17942k kVar = (C17942k) f51028c.get(c3);
            int i = f51030e;
            if ((i * (m61773h() + i)) % f51032g != 0) {
                f51030e = 69;
                f51033h = 3;
            }
            if (((m61770e() + m61773h()) * m61770e()) % f51032g != f51033h) {
                f51030e = 14;
                f51033h = m61770e();
            }
            return kVar.mo45606a(str, c, c2);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: c */
    public static String m61768c(String str, char c, char c2) {
        String a = m61766a(str, c, c2);
        int i = f51030e;
        if (((f51031f + i) * i) % f51032g != m61769d()) {
            f51030e = m61770e();
            f51033h = m61770e();
            int i2 = f51030e;
            if ((i2 * (f51031f + i2)) % f51032g != 0) {
                f51030e = 69;
                f51033h = m61770e();
            }
        }
        return a.intern();
    }

    /* renamed from: d */
    public static int m61769d() {
        return 0;
    }

    /* renamed from: e */
    public static int m61770e() {
        return 27;
    }

    /* renamed from: f */
    private static synchronized void m61771f() {
        synchronized (C17931a.class) {
            if (f51026a) {
                f51026a = false;
                f51027b = new ArrayList(7);
                f51028c = new ArrayList(4);
                f51027b.add(new C17941j());
                try {
                    f51027b.add(new C17939h());
                    f51027b.add(new C17932a());
                    f51027b.add(new C17936e());
                    ArrayList arrayList = f51027b;
                    C17935d dVar = new C17935d();
                    int i = f51030e;
                    if ((i * (f51031f + i)) % f51032g != 0) {
                        f51030e = m61770e();
                        f51031f = m61770e();
                    }
                    arrayList.add(dVar);
                    f51027b.add(new C17933b());
                    f51028c.add(new C17943l());
                    f51028c.add(new C17938g());
                    f51028c.add(new C17934c());
                    f51028c.add(new C17937f());
                    Collections.shuffle(f51027b, new Random((long) f51029d));
                    ArrayList arrayList2 = f51028c;
                    int i2 = f51030e;
                    if (((f51031f + i2) * i2) % f51032g != f51033h) {
                        f51030e = 97;
                        f51033h = 59;
                    }
                    Collections.shuffle(arrayList2, new Random((long) f51029d));
                } catch (Exception e) {
                    throw e;
                } catch (Exception e2) {
                    throw e2;
                }
            }
        }
        return;
    }

    /* renamed from: g */
    public static String m61772g(String str, char c, char c2, char c3) {
        int i = f51030e;
        int i2 = f51031f;
        int i3 = f51032g;
        if (((i + i2) * i) % i3 != 0) {
            if ((i * (i2 + i)) % i3 != 0) {
                f51030e = m61770e();
                f51033h = m61770e();
            }
            f51030e = 69;
            f51033h = 42;
        }
        return m61767b(str, c, c2, c3).intern();
    }

    /* renamed from: h */
    public static int m61773h() {
        return 1;
    }
}
