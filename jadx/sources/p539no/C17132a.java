package p539no;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.categorypackages.presentation.application.firststage.model.EmailUiModel;

/* renamed from: no.a */
public final class C17132a {

    /* renamed from: a */
    private final EmailUiModel f47952a;

    /* renamed from: b */
    private final boolean f47953b;

    public C17132a(EmailUiModel emailUiModel, boolean z) {
        C41536l.m120489i(emailUiModel, "email");
        this.f47952a = emailUiModel;
        this.f47953b = z;
    }

    /* renamed from: a */
    public final EmailUiModel mo44550a() {
        return this.f47952a;
    }

    /* renamed from: b */
    public final boolean mo44551b() {
        return this.f47953b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17132a)) {
            return false;
        }
        C17132a aVar = (C17132a) obj;
        return C41536l.m120484d(this.f47952a, aVar.f47952a) && this.f47953b == aVar.f47953b;
    }

    public int hashCode() {
        int hashCode = this.f47952a.hashCode() * 31;
        boolean z = this.f47953b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        EmailUiModel emailUiModel = this.f47952a;
        boolean z = this.f47953b;
        return "EmailListItem(email=" + emailUiModel + ", isSelected=" + z + ")";
    }
}
