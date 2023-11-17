package p626ue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/* renamed from: ue.g */
public abstract class C18132g {

    /* renamed from: a */
    public static boolean f51441a = true;

    /* renamed from: b */
    private static ArrayList f51442b = null;

    /* renamed from: c */
    private static ArrayList f51443c = null;

    /* renamed from: d */
    private static int f51444d = 77;

    /* renamed from: ue.g$a */
    public static class C18133a extends C18141i {
        /* renamed from: a */
        public String mo45816a(String str, char c) {
            int[] iArr = new int[str.length()];
            C18150m mVar = new C18150m(str);
            int i = 0;
            while (mVar.mo45818a()) {
                int b = mVar.mo45819b();
                C18131f b2 = C18131f.m62210b(b);
                iArr[i] = b2.mo45815c(b2.mo45814a(b) + c + i);
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    /* renamed from: ue.g$b */
    public static class C18134b extends C18135c {
    }

    /* renamed from: ue.g$c */
    public static abstract class C18135c {
    }

    /* renamed from: ue.g$d */
    public static class C18136d extends C18135c {
    }

    /* renamed from: ue.g$e */
    public static class C18137e extends C18141i {
        /* renamed from: a */
        public String mo45816a(String str, char c) {
            int[] iArr = new int[str.length()];
            C18150m mVar = new C18150m(str);
            int i = 0;
            while (mVar.mo45818a()) {
                int b = mVar.mo45819b();
                C18131f b2 = C18131f.m62210b(b);
                iArr[i] = b2.mo45815c(b2.mo45814a(b) - ((c + c) + i));
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    /* renamed from: ue.g$f */
    public static class C18138f extends C18141i {
        /* renamed from: a */
        public String mo45816a(String str, char c) {
            int[] iArr = new int[str.length()];
            C18150m mVar = new C18150m(str);
            int i = 0;
            while (mVar.mo45818a()) {
                int b = mVar.mo45819b();
                C18131f b2 = C18131f.m62210b(b);
                iArr[i] = b2.mo45815c(b2.mo45814a(b) + c + c + c + i);
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    /* renamed from: ue.g$g */
    public static class C18139g extends C18141i {
        /* renamed from: a */
        public String mo45816a(String str, char c) {
            int[] iArr = new int[str.length()];
            C18150m mVar = new C18150m(str);
            int i = 0;
            while (mVar.mo45818a()) {
                int b = mVar.mo45819b();
                C18131f b2 = C18131f.m62210b(b);
                iArr[i] = b2.mo45815c(b2.mo45814a(b) - (((c + c) + c) + i));
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    /* renamed from: ue.g$h */
    public static class C18140h extends C18135c {
    }

    /* renamed from: ue.g$i */
    public static abstract class C18141i {
        /* renamed from: a */
        public abstract String mo45816a(String str, char c);
    }

    /* renamed from: ue.g$j */
    public static class C18142j extends C18135c {
    }

    /* renamed from: ue.g$k */
    public static class C18143k extends C18141i {
        /* renamed from: a */
        public String mo45816a(String str, char c) {
            int[] iArr = new int[str.length()];
            C18150m mVar = new C18150m(str);
            int i = 0;
            while (mVar.mo45818a()) {
                int b = mVar.mo45819b();
                C18131f b2 = C18131f.m62210b(b);
                iArr[i] = b2.mo45815c(b2.mo45814a(b) - (c + i));
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    /* renamed from: ue.g$l */
    public static class C18144l extends C18141i {
        /* renamed from: a */
        public String mo45816a(String str, char c) {
            int[] iArr = new int[str.length()];
            C18150m mVar = new C18150m(str);
            int i = 0;
            while (mVar.mo45818a()) {
                int b = mVar.mo45819b();
                C18131f b2 = C18131f.m62210b(b);
                iArr[i] = b2.mo45815c(b2.mo45814a(b) + c + c + i);
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    /* renamed from: a */
    private static synchronized void m62213a() {
        synchronized (C18132g.class) {
            if (f51441a) {
                f51441a = false;
                f51442b = new ArrayList(7);
                f51443c = new ArrayList(4);
                f51442b.add(new C18143k());
                f51442b.add(new C18137e());
                f51442b.add(new C18139g());
                f51442b.add(new C18133a());
                f51442b.add(new C18144l());
                f51442b.add(new C18138f());
                f51443c.add(new C18140h());
                f51443c.add(new C18134b());
                f51443c.add(new C18142j());
                f51443c.add(new C18136d());
                Collections.shuffle(f51442b, new Random((long) f51444d));
                Collections.shuffle(f51443c, new Random((long) f51444d));
            }
        }
    }

    /* renamed from: b */
    public static String m62214b(String str, char c, char c2) {
        return m62215c(str, c, c2).intern();
    }

    /* renamed from: c */
    private static String m62215c(String str, char c, char c2) {
        m62213a();
        try {
            return ((C18141i) f51442b.get(c2)).mo45816a(str, c);
        } catch (Exception unused) {
            return "";
        }
    }
}
