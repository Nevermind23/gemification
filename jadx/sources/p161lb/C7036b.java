package p161lb;

import p200ob.C7507a;

/* renamed from: lb.b */
final class C7036b extends C7042g {

    /* renamed from: c */
    private final short f20950c;

    /* renamed from: d */
    private final short f20951d;

    C7036b(C7042g gVar, int i, int i2) {
        super(gVar);
        this.f20950c = (short) i;
        this.f20951d = (short) i2;
    }

    /* renamed from: c */
    public void mo21251c(C7507a aVar, byte[] bArr) {
        int i = 0;
        while (true) {
            short s = this.f20951d;
            if (i < s) {
                if (i == 0 || (i == 31 && s <= 62)) {
                    aVar.mo21951c(31, 5);
                    short s2 = this.f20951d;
                    if (s2 > 62) {
                        aVar.mo21951c(s2 - 31, 16);
                    } else if (i == 0) {
                        aVar.mo21951c(Math.min(s2, 31), 5);
                    } else {
                        aVar.mo21951c(s2 - 31, 5);
                    }
                }
                aVar.mo21951c(bArr[this.f20950c + i], 8);
                i++;
            } else {
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(this.f20950c);
        sb.append("::");
        sb.append((this.f20950c + this.f20951d) - 1);
        sb.append('>');
        return sb.toString();
    }
}
