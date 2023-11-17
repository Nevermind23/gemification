package mt0;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.CasDetailsUiModel;

/* renamed from: mt0.a */
public final class C37257a {

    /* renamed from: a */
    private final CasDetailsUiModel f89692a;

    /* renamed from: b */
    private final int f89693b;

    public C37257a(CasDetailsUiModel casDetailsUiModel, int i) {
        C41536l.m120489i(casDetailsUiModel, "details");
        this.f89692a = casDetailsUiModel;
        this.f89693b = i;
    }

    /* renamed from: a */
    public final CasDetailsUiModel mo90344a() {
        return this.f89692a;
    }

    /* renamed from: b */
    public final int mo90345b() {
        return this.f89693b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37257a)) {
            return false;
        }
        C37257a aVar = (C37257a) obj;
        return C41536l.m120484d(this.f89692a, aVar.f89692a) && this.f89693b == aVar.f89693b;
    }

    public int hashCode() {
        return (this.f89692a.hashCode() * 31) + this.f89693b;
    }

    public String toString() {
        CasDetailsUiModel casDetailsUiModel = this.f89692a;
        int i = this.f89693b;
        return "CasPagerDetailsUiModel(details=" + casDetailsUiModel + ", index=" + i + ")";
    }
}
