package xr0;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.shared.helper.StringSource;

/* renamed from: xr0.c */
public final class C39840c {

    /* renamed from: a */
    private final StringSource f94571a;

    /* renamed from: b */
    private final String f94572b;

    public C39840c(StringSource stringSource, String str) {
        C41536l.m120489i(stringSource, "title");
        C41536l.m120489i(str, "text");
        this.f94571a = stringSource;
        this.f94572b = str;
    }

    /* renamed from: a */
    public final String mo93544a() {
        return this.f94572b;
    }

    /* renamed from: b */
    public final StringSource mo93545b() {
        return this.f94571a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39840c)) {
            return false;
        }
        C39840c cVar = (C39840c) obj;
        return C41536l.m120484d(this.f94571a, cVar.f94571a) && C41536l.m120484d(this.f94572b, cVar.f94572b);
    }

    public int hashCode() {
        return (this.f94571a.hashCode() * 31) + this.f94572b.hashCode();
    }

    public String toString() {
        StringSource stringSource = this.f94571a;
        String str = this.f94572b;
        return "PaymentDetailsUiModel(title=" + stringSource + ", text=" + str + ")";
    }
}
