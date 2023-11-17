package p168m5;

import java.util.Arrays;
import p142k5.C6813d;
import p168m5.C7129p;

/* renamed from: m5.d */
final class C7109d extends C7129p {

    /* renamed from: a */
    private final String f21102a;

    /* renamed from: b */
    private final byte[] f21103b;

    /* renamed from: c */
    private final C6813d f21104c;

    /* renamed from: m5.d$b */
    static final class C7111b extends C7129p.C7130a {

        /* renamed from: a */
        private String f21105a;

        /* renamed from: b */
        private byte[] f21106b;

        /* renamed from: c */
        private C6813d f21107c;

        C7111b() {
        }

        /* renamed from: a */
        public C7129p mo21360a() {
            String str = "";
            if (this.f21105a == null) {
                str = str + " backendName";
            }
            if (this.f21107c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new C7109d(this.f21105a, this.f21106b, this.f21107c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C7129p.C7130a mo21361b(String str) {
            if (str != null) {
                this.f21105a = str;
                return this;
            }
            throw new NullPointerException("Null backendName");
        }

        /* renamed from: c */
        public C7129p.C7130a mo21362c(byte[] bArr) {
            this.f21106b = bArr;
            return this;
        }

        /* renamed from: d */
        public C7129p.C7130a mo21363d(C6813d dVar) {
            if (dVar != null) {
                this.f21107c = dVar;
                return this;
            }
            throw new NullPointerException("Null priority");
        }
    }

    /* renamed from: b */
    public String mo21355b() {
        return this.f21102a;
    }

    /* renamed from: c */
    public byte[] mo21356c() {
        return this.f21103b;
    }

    /* renamed from: d */
    public C6813d mo21357d() {
        return this.f21104c;
    }

    public boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7129p)) {
            return false;
        }
        C7129p pVar = (C7129p) obj;
        if (this.f21102a.equals(pVar.mo21355b())) {
            byte[] bArr2 = this.f21103b;
            if (pVar instanceof C7109d) {
                bArr = ((C7109d) pVar).f21103b;
            } else {
                bArr = pVar.mo21356c();
            }
            if (Arrays.equals(bArr2, bArr) && this.f21104c.equals(pVar.mo21357d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f21102a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f21103b)) * 1000003) ^ this.f21104c.hashCode();
    }

    private C7109d(String str, byte[] bArr, C6813d dVar) {
        this.f21102a = str;
        this.f21103b = bArr;
        this.f21104c = dVar;
    }
}
