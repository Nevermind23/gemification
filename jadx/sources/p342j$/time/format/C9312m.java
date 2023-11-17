package p342j$.time.format;

import p342j$.time.C9288c;

/* renamed from: j$.time.format.m */
final class C9312m implements C9306g {

    /* renamed from: a */
    private final C9306g f25803a;

    /* renamed from: b */
    private final int f25804b;

    /* renamed from: c */
    private final char f25805c;

    C9312m(C9306g gVar, int i, char c) {
        this.f25803a = gVar;
        this.f25804b = i;
        this.f25805c = c;
    }

    /* renamed from: a */
    public final boolean mo25039a(C9321v vVar, StringBuilder sb) {
        int length = sb.length();
        if (!this.f25803a.mo25039a(vVar, sb)) {
            return false;
        }
        int length2 = sb.length() - length;
        int i = this.f25804b;
        if (length2 <= i) {
            for (int i2 = 0; i2 < i - length2; i2++) {
                sb.insert(length, this.f25805c);
            }
            return true;
        }
        throw new C9288c("Cannot print as output of " + length2 + " characters exceeds pad width of " + i);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Pad(");
        sb.append(this.f25803a);
        sb.append(",");
        sb.append(this.f25804b);
        char c = this.f25805c;
        if (c == ' ') {
            str = ")";
        } else {
            str = ",'" + c + "')";
        }
        sb.append(str);
        return sb.toString();
    }
}
