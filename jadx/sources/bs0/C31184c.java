package bs0;

import kotlin.jvm.internal.C41536l;

/* renamed from: bs0.c */
public final class C31184c {

    /* renamed from: a */
    private final String f77484a;

    public C31184c(String str) {
        this.f77484a = str;
    }

    /* renamed from: a */
    public final String mo71392a() {
        return this.f77484a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31184c) && C41536l.m120484d(this.f77484a, ((C31184c) obj).f77484a);
    }

    public int hashCode() {
        String str = this.f77484a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        String str = this.f77484a;
        return "LoansHistoryUiState(title=" + str + ")";
    }
}
