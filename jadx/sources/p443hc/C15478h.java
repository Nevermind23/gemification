package p443hc;

/* renamed from: hc.h */
public enum C15478h {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);
    

    /* renamed from: d */
    private final int[] f43920d;

    /* renamed from: e */
    private final int f43921e;

    private C15478h(int[] iArr, int i) {
        this.f43920d = iArr;
        this.f43921e = i;
    }

    /* renamed from: a */
    public static C15478h m55983a(int i) {
        if (i == 0) {
            return TERMINATOR;
        }
        if (i == 1) {
            return NUMERIC;
        }
        if (i == 2) {
            return ALPHANUMERIC;
        }
        if (i == 3) {
            return STRUCTURED_APPEND;
        }
        if (i == 4) {
            return BYTE;
        }
        if (i == 5) {
            return FNC1_FIRST_POSITION;
        }
        if (i == 7) {
            return ECI;
        }
        if (i == 8) {
            return KANJI;
        }
        if (i == 9) {
            return FNC1_SECOND_POSITION;
        }
        if (i == 13) {
            return HANZI;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    public int mo42564b() {
        return this.f43921e;
    }

    /* renamed from: c */
    public int mo42565c(C15480j jVar) {
        char c;
        int j = jVar.mo42572j();
        if (j <= 9) {
            c = 0;
        } else if (j <= 26) {
            c = 1;
        } else {
            c = 2;
        }
        return this.f43920d[c];
    }
}
