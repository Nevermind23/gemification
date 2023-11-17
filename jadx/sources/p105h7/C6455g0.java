package p105h7;

import java.util.Arrays;

/* renamed from: h7.g0 */
public final class C6455g0 extends C6457h0 {

    /* renamed from: d */
    private final String f19740d;

    C6455g0(String str) {
        this.f19740d = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo20322a() {
        return 3;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C6457h0 h0Var = (C6457h0) obj;
        h0Var.mo20322a();
        String str = this.f19740d;
        int length = str.length();
        String str2 = ((C6455g0) h0Var).f19740d;
        if (length != str2.length()) {
            return str.length() - str2.length();
        }
        return str.compareTo(str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C6455g0.class == obj.getClass()) {
            return this.f19740d.equals(((C6455g0) obj).f19740d);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{3, this.f19740d});
    }

    public final String toString() {
        String str = this.f19740d;
        return "\"" + str + "\"";
    }
}
