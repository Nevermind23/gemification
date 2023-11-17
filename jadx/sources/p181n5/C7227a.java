package p181n5;

import java.util.Arrays;
import p181n5.C7234f;

/* renamed from: n5.a */
final class C7227a extends C7234f {

    /* renamed from: a */
    private final Iterable f21405a;

    /* renamed from: b */
    private final byte[] f21406b;

    /* renamed from: n5.a$b */
    static final class C7229b extends C7234f.C7235a {

        /* renamed from: a */
        private Iterable f21407a;

        /* renamed from: b */
        private byte[] f21408b;

        C7229b() {
        }

        /* renamed from: a */
        public C7234f mo21595a() {
            String str = "";
            if (this.f21407a == null) {
                str = str + " events";
            }
            if (str.isEmpty()) {
                return new C7227a(this.f21407a, this.f21408b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C7234f.C7235a mo21596b(Iterable iterable) {
            if (iterable != null) {
                this.f21407a = iterable;
                return this;
            }
            throw new NullPointerException("Null events");
        }

        /* renamed from: c */
        public C7234f.C7235a mo21597c(byte[] bArr) {
            this.f21408b = bArr;
            return this;
        }
    }

    /* renamed from: b */
    public Iterable mo21590b() {
        return this.f21405a;
    }

    /* renamed from: c */
    public byte[] mo21591c() {
        return this.f21406b;
    }

    public boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7234f)) {
            return false;
        }
        C7234f fVar = (C7234f) obj;
        if (this.f21405a.equals(fVar.mo21590b())) {
            byte[] bArr2 = this.f21406b;
            if (fVar instanceof C7227a) {
                bArr = ((C7227a) fVar).f21406b;
            } else {
                bArr = fVar.mo21591c();
            }
            if (Arrays.equals(bArr2, bArr)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f21405a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f21406b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f21405a + ", extras=" + Arrays.toString(this.f21406b) + "}";
    }

    private C7227a(Iterable iterable, byte[] bArr) {
        this.f21405a = iterable;
        this.f21406b = bArr;
    }
}
