package r01;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.shared.helper.StringSource;

/* renamed from: r01.c */
public final class C38275c {

    /* renamed from: a */
    private final C38273b f91779a;

    /* renamed from: b */
    private final StringSource f91780b;

    public C38275c(C38273b bVar, StringSource stringSource) {
        C41536l.m120489i(bVar, "type");
        this.f91779a = bVar;
        this.f91780b = stringSource;
    }

    /* renamed from: a */
    public final StringSource mo91825a() {
        return this.f91780b;
    }

    /* renamed from: b */
    public final C38273b mo91826b() {
        return this.f91779a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38275c)) {
            return false;
        }
        C38275c cVar = (C38275c) obj;
        return this.f91779a == cVar.f91779a && C41536l.m120484d(this.f91780b, cVar.f91780b);
    }

    public int hashCode() {
        int hashCode = this.f91779a.hashCode() * 31;
        StringSource stringSource = this.f91780b;
        return hashCode + (stringSource == null ? 0 : stringSource.hashCode());
    }

    public String toString() {
        C38273b bVar = this.f91779a;
        StringSource stringSource = this.f91780b;
        return "WithdrawalErrorUiModel(type=" + bVar + ", title=" + stringSource + ")";
    }
}
