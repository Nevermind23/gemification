package p094g9;

import java.util.Arrays;
import p094g9.C6285b0;

/* renamed from: g9.g */
final class C6345g extends C6285b0.C6293d.C6295b {

    /* renamed from: a */
    private final String f19466a;

    /* renamed from: b */
    private final byte[] f19467b;

    /* renamed from: g9.g$b */
    static final class C6347b extends C6285b0.C6293d.C6295b.C6296a {

        /* renamed from: a */
        private String f19468a;

        /* renamed from: b */
        private byte[] f19469b;

        C6347b() {
        }

        /* renamed from: a */
        public C6285b0.C6293d.C6295b mo19997a() {
            String str = "";
            if (this.f19468a == null) {
                str = str + " filename";
            }
            if (this.f19469b == null) {
                str = str + " contents";
            }
            if (str.isEmpty()) {
                return new C6345g(this.f19468a, this.f19469b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C6285b0.C6293d.C6295b.C6296a mo19998b(byte[] bArr) {
            if (bArr != null) {
                this.f19469b = bArr;
                return this;
            }
            throw new NullPointerException("Null contents");
        }

        /* renamed from: c */
        public C6285b0.C6293d.C6295b.C6296a mo19999c(String str) {
            if (str != null) {
                this.f19468a = str;
                return this;
            }
            throw new NullPointerException("Null filename");
        }
    }

    /* renamed from: b */
    public byte[] mo19995b() {
        return this.f19467b;
    }

    /* renamed from: c */
    public String mo19996c() {
        return this.f19466a;
    }

    public boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6285b0.C6293d.C6295b)) {
            return false;
        }
        C6285b0.C6293d.C6295b bVar = (C6285b0.C6293d.C6295b) obj;
        if (this.f19466a.equals(bVar.mo19996c())) {
            byte[] bArr2 = this.f19467b;
            if (bVar instanceof C6345g) {
                bArr = ((C6345g) bVar).f19467b;
            } else {
                bArr = bVar.mo19995b();
            }
            if (Arrays.equals(bArr2, bArr)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f19466a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f19467b);
    }

    public String toString() {
        return "File{filename=" + this.f19466a + ", contents=" + Arrays.toString(this.f19467b) + "}";
    }

    private C6345g(String str, byte[] bArr) {
        this.f19466a = str;
        this.f19467b = bArr;
    }
}
