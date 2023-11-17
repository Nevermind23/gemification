package androidx.core.text;

import java.util.Locale;

/* renamed from: androidx.core.text.x */
public abstract class C0991x {

    /* renamed from: a */
    public static final C0990w f3629a = new C0996e((C0994c) null, false);

    /* renamed from: b */
    public static final C0990w f3630b = new C0996e((C0994c) null, true);

    /* renamed from: c */
    public static final C0990w f3631c;

    /* renamed from: d */
    public static final C0990w f3632d;

    /* renamed from: e */
    public static final C0990w f3633e = new C0996e(C0992a.f3635b, false);

    /* renamed from: f */
    public static final C0990w f3634f = C0997f.f3640b;

    /* renamed from: androidx.core.text.x$a */
    private static class C0992a implements C0994c {

        /* renamed from: b */
        static final C0992a f3635b = new C0992a(true);

        /* renamed from: a */
        private final boolean f3636a;

        private C0992a(boolean z) {
            this.f3636a = z;
        }

        /* renamed from: a */
        public int mo3434a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int a = C0991x.m3496a(Character.getDirectionality(charSequence.charAt(i)));
                if (a != 0) {
                    if (a != 1) {
                        continue;
                        i++;
                    } else if (!this.f3636a) {
                        return 1;
                    }
                } else if (this.f3636a) {
                    return 0;
                }
                z = true;
                i++;
            }
            if (z) {
                return this.f3636a ? 1 : 0;
            }
            return 2;
        }
    }

    /* renamed from: androidx.core.text.x$b */
    private static class C0993b implements C0994c {

        /* renamed from: a */
        static final C0993b f3637a = new C0993b();

        private C0993b() {
        }

        /* renamed from: a */
        public int mo3434a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = C0991x.m3497b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }
    }

    /* renamed from: androidx.core.text.x$c */
    private interface C0994c {
        /* renamed from: a */
        int mo3434a(CharSequence charSequence, int i, int i2);
    }

    /* renamed from: androidx.core.text.x$d */
    private static abstract class C0995d implements C0990w {

        /* renamed from: a */
        private final C0994c f3638a;

        C0995d(C0994c cVar) {
            this.f3638a = cVar;
        }

        /* renamed from: c */
        private boolean m3501c(CharSequence charSequence, int i, int i2) {
            int a = this.f3638a.mo3434a(charSequence, i, i2);
            if (a == 0) {
                return true;
            }
            if (a != 1) {
                return mo3435b();
            }
            return false;
        }

        /* renamed from: a */
        public boolean mo3433a(CharSequence charSequence, int i, int i2) {
            if (charSequence == null || i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            } else if (this.f3638a == null) {
                return mo3435b();
            } else {
                return m3501c(charSequence, i, i2);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract boolean mo3435b();
    }

    /* renamed from: androidx.core.text.x$e */
    private static class C0996e extends C0995d {

        /* renamed from: b */
        private final boolean f3639b;

        C0996e(C0994c cVar, boolean z) {
            super(cVar);
            this.f3639b = z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public boolean mo3435b() {
            return this.f3639b;
        }
    }

    /* renamed from: androidx.core.text.x$f */
    private static class C0997f extends C0995d {

        /* renamed from: b */
        static final C0997f f3640b = new C0997f();

        C0997f() {
            super((C0994c) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public boolean mo3435b() {
            return C0998y.m3506a(Locale.getDefault()) == 1;
        }
    }

    static {
        C0993b bVar = C0993b.f3637a;
        f3631c = new C0996e(bVar, false);
        f3632d = new C0996e(bVar, true);
    }

    /* renamed from: a */
    static int m3496a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: b */
    static int m3497b(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
