package cf1;

import ze1.C43420e;

/* renamed from: cf1.b */
abstract class C40405b {
    /* renamed from: a */
    public static int m116976a(int i) {
        if (new C43420e(2, 36).mo102116v(i)) {
            return i;
        }
        throw new IllegalArgumentException("radix " + i + " was not in valid range " + new C43420e(2, 36));
    }

    /* renamed from: b */
    public static final int m116977b(char c, int i) {
        return Character.digit(c, i);
    }

    /* renamed from: c */
    public static boolean m116978c(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }
}
