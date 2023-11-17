package androidx.core.text;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* renamed from: androidx.core.text.a */
public final class C0963a {

    /* renamed from: d */
    static final C0990w f3611d;

    /* renamed from: e */
    private static final String f3612e = Character.toString(8206);

    /* renamed from: f */
    private static final String f3613f = Character.toString(8207);

    /* renamed from: g */
    static final C0963a f3614g;

    /* renamed from: h */
    static final C0963a f3615h;

    /* renamed from: a */
    private final boolean f3616a;

    /* renamed from: b */
    private final int f3617b;

    /* renamed from: c */
    private final C0990w f3618c;

    /* renamed from: androidx.core.text.a$a */
    public static final class C0964a {

        /* renamed from: a */
        private boolean f3619a;

        /* renamed from: b */
        private int f3620b;

        /* renamed from: c */
        private C0990w f3621c;

        public C0964a() {
            m3456c(C0963a.m3447e(Locale.getDefault()));
        }

        /* renamed from: b */
        private static C0963a m3455b(boolean z) {
            return z ? C0963a.f3615h : C0963a.f3614g;
        }

        /* renamed from: c */
        private void m3456c(boolean z) {
            this.f3619a = z;
            this.f3621c = C0963a.f3611d;
            this.f3620b = 2;
        }

        /* renamed from: a */
        public C0963a mo3428a() {
            if (this.f3620b == 2 && this.f3621c == C0963a.f3611d) {
                return m3455b(this.f3619a);
            }
            return new C0963a(this.f3619a, this.f3620b, this.f3621c);
        }
    }

    /* renamed from: androidx.core.text.a$b */
    private static class C0965b {

        /* renamed from: f */
        private static final byte[] f3622f = new byte[1792];

        /* renamed from: a */
        private final CharSequence f3623a;

        /* renamed from: b */
        private final boolean f3624b;

        /* renamed from: c */
        private final int f3625c;

        /* renamed from: d */
        private int f3626d;

        /* renamed from: e */
        private char f3627e;

        static {
            for (int i = 0; i < 1792; i++) {
                f3622f[i] = Character.getDirectionality(i);
            }
        }

        C0965b(CharSequence charSequence, boolean z) {
            this.f3623a = charSequence;
            this.f3624b = z;
            this.f3625c = charSequence.length();
        }

        /* renamed from: c */
        private static byte m3458c(char c) {
            return c < 1792 ? f3622f[c] : Character.getDirectionality(c);
        }

        /* renamed from: f */
        private byte m3459f() {
            char charAt;
            int i = this.f3626d;
            do {
                int i2 = this.f3626d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f3623a;
                int i3 = i2 - 1;
                this.f3626d = i3;
                charAt = charSequence.charAt(i3);
                this.f3627e = charAt;
                if (charAt == '&') {
                    return 12;
                }
            } while (charAt != ';');
            this.f3626d = i;
            this.f3627e = ';';
            return 13;
        }

        /* renamed from: g */
        private byte m3460g() {
            char charAt;
            do {
                int i = this.f3626d;
                if (i >= this.f3625c) {
                    return 12;
                }
                CharSequence charSequence = this.f3623a;
                this.f3626d = i + 1;
                charAt = charSequence.charAt(i);
                this.f3627e = charAt;
            } while (charAt != ';');
            return 12;
        }

        /* renamed from: h */
        private byte m3461h() {
            char charAt;
            int i = this.f3626d;
            while (true) {
                int i2 = this.f3626d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f3623a;
                int i3 = i2 - 1;
                this.f3626d = i3;
                char charAt2 = charSequence.charAt(i3);
                this.f3627e = charAt2;
                if (charAt2 == '<') {
                    return 12;
                }
                if (charAt2 == '>') {
                    break;
                } else if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i4 = this.f3626d;
                        if (i4 <= 0) {
                            break;
                        }
                        CharSequence charSequence2 = this.f3623a;
                        int i5 = i4 - 1;
                        this.f3626d = i5;
                        charAt = charSequence2.charAt(i5);
                        this.f3627e = charAt;
                    } while (charAt != charAt2);
                }
            }
            this.f3626d = i;
            this.f3627e = '>';
            return 13;
        }

        /* renamed from: i */
        private byte m3462i() {
            char charAt;
            int i = this.f3626d;
            while (true) {
                int i2 = this.f3626d;
                if (i2 < this.f3625c) {
                    CharSequence charSequence = this.f3623a;
                    this.f3626d = i2 + 1;
                    char charAt2 = charSequence.charAt(i2);
                    this.f3627e = charAt2;
                    if (charAt2 == '>') {
                        return 12;
                    }
                    if (charAt2 == '\"' || charAt2 == '\'') {
                        do {
                            int i3 = this.f3626d;
                            if (i3 >= this.f3625c) {
                                break;
                            }
                            CharSequence charSequence2 = this.f3623a;
                            this.f3626d = i3 + 1;
                            charAt = charSequence2.charAt(i3);
                            this.f3627e = charAt;
                        } while (charAt != charAt2);
                    }
                } else {
                    this.f3626d = i;
                    this.f3627e = '<';
                    return 13;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public byte mo3429a() {
            char charAt = this.f3623a.charAt(this.f3626d - 1);
            this.f3627e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f3623a, this.f3626d);
                this.f3626d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f3626d--;
            byte c = m3458c(this.f3627e);
            if (!this.f3624b) {
                return c;
            }
            char c2 = this.f3627e;
            if (c2 == '>') {
                return m3461h();
            }
            if (c2 == ';') {
                return m3459f();
            }
            return c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public byte mo3430b() {
            char charAt = this.f3623a.charAt(this.f3626d);
            this.f3627e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f3623a, this.f3626d);
                this.f3626d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f3626d++;
            byte c = m3458c(this.f3627e);
            if (!this.f3624b) {
                return c;
            }
            char c2 = this.f3627e;
            if (c2 == '<') {
                return m3462i();
            }
            if (c2 == '&') {
                return m3460g();
            }
            return c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo3431d() {
            this.f3626d = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.f3626d < this.f3625c && i == 0) {
                byte b = mo3430b();
                if (b != 0) {
                    if (b == 1 || b == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (b != 9) {
                        switch (b) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.f3626d > 0) {
                switch (mo3429a()) {
                    case 14:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case 18:
                        i3++;
                        continue;
                }
                i3--;
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public int mo3432e() {
            this.f3626d = this.f3625c;
            int i = 0;
            while (true) {
                int i2 = i;
                while (this.f3626d > 0) {
                    byte a = mo3429a();
                    if (a != 0) {
                        if (a == 1 || a == 2) {
                            if (i == 0) {
                                return 1;
                            }
                            if (i2 == 0) {
                            }
                        } else if (a != 9) {
                            switch (a) {
                                case 14:
                                case 15:
                                    if (i2 == i) {
                                        return -1;
                                    }
                                    break;
                                case 16:
                                case 17:
                                    if (i2 == i) {
                                        return 1;
                                    }
                                    break;
                                case 18:
                                    i++;
                                    break;
                                default:
                                    if (i2 != 0) {
                                        break;
                                    } else {
                                        continue;
                                    }
                            }
                            i--;
                        } else {
                            continue;
                        }
                    } else if (i == 0) {
                        return -1;
                    } else {
                        if (i2 == 0) {
                        }
                    }
                }
                return 0;
            }
        }
    }

    static {
        C0990w wVar = C0991x.f3631c;
        f3611d = wVar;
        f3614g = new C0963a(false, 2, wVar);
        f3615h = new C0963a(true, 2, wVar);
    }

    C0963a(boolean z, int i, C0990w wVar) {
        this.f3616a = z;
        this.f3617b = i;
        this.f3618c = wVar;
    }

    /* renamed from: a */
    private static int m3444a(CharSequence charSequence) {
        return new C0965b(charSequence, false).mo3431d();
    }

    /* renamed from: b */
    private static int m3445b(CharSequence charSequence) {
        return new C0965b(charSequence, false).mo3432e();
    }

    /* renamed from: c */
    public static C0963a m3446c() {
        return new C0964a().mo3428a();
    }

    /* renamed from: e */
    static boolean m3447e(Locale locale) {
        return C0998y.m3506a(locale) == 1;
    }

    /* renamed from: f */
    private String m3448f(CharSequence charSequence, C0990w wVar) {
        boolean a = wVar.mo3433a(charSequence, 0, charSequence.length());
        if (!this.f3616a && (a || m3445b(charSequence) == 1)) {
            return f3612e;
        }
        if (!this.f3616a) {
            return "";
        }
        if (!a || m3445b(charSequence) == -1) {
            return f3613f;
        }
        return "";
    }

    /* renamed from: g */
    private String m3449g(CharSequence charSequence, C0990w wVar) {
        boolean a = wVar.mo3433a(charSequence, 0, charSequence.length());
        if (!this.f3616a && (a || m3444a(charSequence) == 1)) {
            return f3612e;
        }
        if (!this.f3616a) {
            return "";
        }
        if (!a || m3444a(charSequence) == -1) {
            return f3613f;
        }
        return "";
    }

    /* renamed from: d */
    public boolean mo3423d() {
        return (this.f3617b & 2) != 0;
    }

    /* renamed from: h */
    public CharSequence mo3424h(CharSequence charSequence) {
        return mo3425i(charSequence, this.f3618c, true);
    }

    /* renamed from: i */
    public CharSequence mo3425i(CharSequence charSequence, C0990w wVar, boolean z) {
        C0990w wVar2;
        char c;
        C0990w wVar3;
        if (charSequence == null) {
            return null;
        }
        boolean a = wVar.mo3433a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (mo3423d() && z) {
            if (a) {
                wVar3 = C0991x.f3630b;
            } else {
                wVar3 = C0991x.f3629a;
            }
            spannableStringBuilder.append(m3449g(charSequence, wVar3));
        }
        if (a != this.f3616a) {
            if (a) {
                c = 8235;
            } else {
                c = 8234;
            }
            spannableStringBuilder.append(c);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            if (a) {
                wVar2 = C0991x.f3630b;
            } else {
                wVar2 = C0991x.f3629a;
            }
            spannableStringBuilder.append(m3448f(charSequence, wVar2));
        }
        return spannableStringBuilder;
    }

    /* renamed from: j */
    public String mo3426j(String str) {
        return mo3427k(str, this.f3618c, true);
    }

    /* renamed from: k */
    public String mo3427k(String str, C0990w wVar, boolean z) {
        if (str == null) {
            return null;
        }
        return mo3425i(str, wVar, z).toString();
    }
}
