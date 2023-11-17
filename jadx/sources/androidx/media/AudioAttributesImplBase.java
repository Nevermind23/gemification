package androidx.media;

import java.util.Arrays;

class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a */
    int f4689a = 0;

    /* renamed from: b */
    int f4690b = 0;

    /* renamed from: c */
    int f4691c = 0;

    /* renamed from: d */
    int f4692d = -1;

    AudioAttributesImplBase() {
    }

    /* renamed from: a */
    public int mo4992a() {
        return this.f4690b;
    }

    /* renamed from: b */
    public int mo4993b() {
        int i = this.f4691c;
        int c = mo4994c();
        if (c == 6) {
            i |= 4;
        } else if (c == 7) {
            i |= 1;
        }
        return i & 273;
    }

    /* renamed from: c */
    public int mo4994c() {
        int i = this.f4692d;
        if (i != -1) {
            return i;
        }
        return AudioAttributesCompat.m5760a(false, this.f4691c, this.f4689a);
    }

    /* renamed from: d */
    public int mo4995d() {
        return this.f4689a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f4690b == audioAttributesImplBase.mo4992a() && this.f4691c == audioAttributesImplBase.mo4993b() && this.f4689a == audioAttributesImplBase.mo4995d() && this.f4692d == audioAttributesImplBase.f4692d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4690b), Integer.valueOf(this.f4691c), Integer.valueOf(this.f4689a), Integer.valueOf(this.f4692d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f4692d != -1) {
            sb.append(" stream=");
            sb.append(this.f4692d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.m5761b(this.f4689a));
        sb.append(" content=");
        sb.append(this.f4690b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f4691c).toUpperCase());
        return sb.toString();
    }
}
