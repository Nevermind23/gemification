package wf1;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: wf1.l */
public final class C43239l {

    /* renamed from: c */
    public static final C43240a f100972c = new C43240a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private int f100973a;

    /* renamed from: b */
    private final int[] f100974b = new int[10];

    /* renamed from: wf1.l$a */
    public static final class C43240a {
        private C43240a() {
        }

        public /* synthetic */ C43240a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo101917a(int i) {
        return this.f100974b[i];
    }

    /* renamed from: b */
    public final int mo101918b() {
        if ((this.f100973a & 2) != 0) {
            return this.f100974b[1];
        }
        return -1;
    }

    /* renamed from: c */
    public final int mo101919c() {
        if ((this.f100973a & 128) != 0) {
            return this.f100974b[7];
        }
        return 65535;
    }

    /* renamed from: d */
    public final int mo101920d() {
        if ((this.f100973a & 16) != 0) {
            return this.f100974b[4];
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: e */
    public final int mo101921e(int i) {
        return (this.f100973a & 32) != 0 ? this.f100974b[5] : i;
    }

    /* renamed from: f */
    public final boolean mo101922f(int i) {
        return ((1 << i) & this.f100973a) != 0;
    }

    /* renamed from: g */
    public final void mo101923g(C43239l lVar) {
        C41536l.m120489i(lVar, "other");
        int i = 0;
        while (i < 10) {
            int i2 = i + 1;
            if (lVar.mo101922f(i)) {
                mo101924h(i, lVar.mo101917a(i));
            }
            i = i2;
        }
    }

    /* renamed from: h */
    public final C43239l mo101924h(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f100974b;
            if (i < iArr.length) {
                this.f100973a = (1 << i) | this.f100973a;
                iArr[i] = i2;
            }
        }
        return this;
    }

    /* renamed from: i */
    public final int mo101925i() {
        return Integer.bitCount(this.f100973a);
    }
}
