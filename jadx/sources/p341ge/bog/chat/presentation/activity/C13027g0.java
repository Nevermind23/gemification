package p341ge.bog.chat.presentation.activity;

/* renamed from: ge.bog.chat.presentation.activity.g0 */
public enum C13027g0 {
    NO_GROUP(0, new int[]{r8, r8, r8, r8}, new int[]{r8, r8, r8, r8}),
    FIRST_MESSAGE(1, new int[]{r8, r8, r8, r2}, new int[]{r8, r8, r2, r8}),
    MIDDLE_MESSAGE(2, new int[]{r2, r8, r8, r2}, new int[]{r8, r2, r2, r8}),
    LAST_MESSAGE(3, new int[]{r2, r8, r8, r8}, new int[]{r8, r2, r8, r8});
    

    /* renamed from: d */
    private final int f38394d;

    /* renamed from: e */
    private final int[] f38395e;

    /* renamed from: f */
    private final int[] f38396f;

    private C13027g0(int i, int[] iArr, int[] iArr2) {
        this.f38394d = i;
        this.f38395e = iArr;
        this.f38396f = iArr2;
    }

    /* renamed from: b */
    public final int[] mo34281b() {
        return this.f38395e;
    }

    /* renamed from: c */
    public final int mo34282c() {
        return this.f38394d;
    }

    /* renamed from: e */
    public final int[] mo34283e() {
        return this.f38396f;
    }
}
