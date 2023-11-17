package p342j$.time.format;

/* renamed from: j$.time.format.e */
final class C9304e implements C9306g {

    /* renamed from: a */
    private final char f25784a;

    C9304e(char c) {
        this.f25784a = c;
    }

    /* renamed from: a */
    public final boolean mo25039a(C9321v vVar, StringBuilder sb) {
        sb.append(this.f25784a);
        return true;
    }

    public final String toString() {
        char c = this.f25784a;
        if (c == '\'') {
            return "''";
        }
        return "'" + c + "'";
    }
}
