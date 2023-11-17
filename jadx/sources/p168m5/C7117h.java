package p168m5;

import java.util.Arrays;
import p142k5.C6811b;

/* renamed from: m5.h */
public final class C7117h {

    /* renamed from: a */
    private final C6811b f21122a;

    /* renamed from: b */
    private final byte[] f21123b;

    public C7117h(C6811b bVar, byte[] bArr) {
        if (bVar == null) {
            throw new NullPointerException("encoding is null");
        } else if (bArr != null) {
            this.f21122a = bVar;
            this.f21123b = bArr;
        } else {
            throw new NullPointerException("bytes is null");
        }
    }

    /* renamed from: a */
    public byte[] mo21369a() {
        return this.f21123b;
    }

    /* renamed from: b */
    public C6811b mo21370b() {
        return this.f21122a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7117h)) {
            return false;
        }
        C7117h hVar = (C7117h) obj;
        if (!this.f21122a.equals(hVar.f21122a)) {
            return false;
        }
        return Arrays.equals(this.f21123b, hVar.f21123b);
    }

    public int hashCode() {
        return ((this.f21122a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f21123b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f21122a + ", bytes=[...]}";
    }
}
