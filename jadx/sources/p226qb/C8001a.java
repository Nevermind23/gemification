package p226qb;

import com.salesforce.marketingcloud.C11398b;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;

/* renamed from: qb.a */
public final class C8001a {

    /* renamed from: h */
    public static final C8001a f23051h = new C8001a(4201, C11398b.f33143v, 1);

    /* renamed from: i */
    public static final C8001a f23052i = new C8001a(1033, C11398b.f33141t, 1);

    /* renamed from: j */
    public static final C8001a f23053j;

    /* renamed from: k */
    public static final C8001a f23054k = new C8001a(19, 16, 1);

    /* renamed from: l */
    public static final C8001a f23055l = new C8001a(285, C11398b.f33139r, 0);

    /* renamed from: m */
    public static final C8001a f23056m;

    /* renamed from: n */
    public static final C8001a f23057n;

    /* renamed from: o */
    public static final C8001a f23058o;

    /* renamed from: a */
    private final int[] f23059a;

    /* renamed from: b */
    private final int[] f23060b;

    /* renamed from: c */
    private final C8002b f23061c;

    /* renamed from: d */
    private final C8002b f23062d;

    /* renamed from: e */
    private final int f23063e;

    /* renamed from: f */
    private final int f23064f;

    /* renamed from: g */
    private final int f23065g;

    static {
        C8001a aVar = new C8001a(67, 64, 1);
        f23053j = aVar;
        C8001a aVar2 = new C8001a(BogInputLayout.INPUT_TYPE_NUM_PASSWORD, C11398b.f33139r, 1);
        f23056m = aVar2;
        f23057n = aVar2;
        f23058o = aVar;
    }

    public C8001a(int i, int i2, int i3) {
        this.f23064f = i;
        this.f23063e = i2;
        this.f23065g = i3;
        this.f23059a = new int[i2];
        this.f23060b = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.f23059a[i5] = i4;
            i4 <<= 1;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.f23060b[this.f23059a[i6]] = i6;
        }
        this.f23061c = new C8002b(this, new int[]{0});
        this.f23062d = new C8002b(this, new int[]{1});
    }

    /* renamed from: a */
    static int m30377a(int i, int i2) {
        return i ^ i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C8002b mo23134b(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f23061c;
        } else {
            int[] iArr = new int[(i + 1)];
            iArr[0] = i2;
            return new C8002b(this, iArr);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo23135c(int i) {
        return this.f23059a[i];
    }

    /* renamed from: d */
    public int mo23136d() {
        return this.f23065g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C8002b mo23137e() {
        return this.f23062d;
    }

    /* renamed from: f */
    public int mo23138f() {
        return this.f23063e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C8002b mo23139g() {
        return this.f23061c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo23140h(int i) {
        if (i != 0) {
            return this.f23059a[(this.f23063e - this.f23060b[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo23141i(int i) {
        if (i != 0) {
            return this.f23060b[i];
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo23142j(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f23059a;
        int[] iArr2 = this.f23060b;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.f23063e - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f23064f) + ',' + this.f23063e + ')';
    }
}
