package c11;

import kotlin.jvm.internal.C41536l;

/* renamed from: c11.c */
public final class C31254c {

    /* renamed from: a */
    private final boolean f77622a;

    /* renamed from: b */
    private final String f77623b;

    public C31254c(boolean z, String str) {
        this.f77622a = z;
        this.f77623b = str;
    }

    /* renamed from: a */
    public final String mo71500a() {
        return this.f77623b;
    }

    /* renamed from: b */
    public final boolean mo71501b() {
        return this.f77622a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31254c)) {
            return false;
        }
        C31254c cVar = (C31254c) obj;
        return this.f77622a == cVar.f77622a && C41536l.m120484d(this.f77623b, cVar.f77623b);
    }

    public int hashCode() {
        boolean z = this.f77622a;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.f77623b;
        return i + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        boolean z = this.f77622a;
        String str = this.f77623b;
        return "OutOfServiceUiState(isServerUnderMaintenance=" + z + ", message=" + str + ")";
    }
}
