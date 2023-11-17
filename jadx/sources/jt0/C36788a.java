package jt0;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasAccountUiModel;
import p341ge.bog.mobilebank.shared.helper.ImageSource;

/* renamed from: jt0.a */
public final class C36788a {

    /* renamed from: a */
    private final CasAccountUiModel f88758a;

    /* renamed from: b */
    private final ImageSource f88759b;

    /* renamed from: c */
    private boolean f88760c;

    public C36788a(CasAccountUiModel casAccountUiModel, ImageSource imageSource, boolean z) {
        C41536l.m120489i(casAccountUiModel, "account");
        C41536l.m120489i(imageSource, "imageSource");
        this.f88758a = casAccountUiModel;
        this.f88759b = imageSource;
        this.f88760c = z;
    }

    /* renamed from: a */
    public final CasAccountUiModel mo89680a() {
        return this.f88758a;
    }

    /* renamed from: b */
    public final ImageSource mo89681b() {
        return this.f88759b;
    }

    /* renamed from: c */
    public final boolean mo89682c() {
        return this.f88760c;
    }

    /* renamed from: d */
    public final void mo89683d(boolean z) {
        this.f88760c = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36788a)) {
            return false;
        }
        C36788a aVar = (C36788a) obj;
        return C41536l.m120484d(this.f88758a, aVar.f88758a) && C41536l.m120484d(this.f88759b, aVar.f88759b) && this.f88760c == aVar.f88760c;
    }

    public int hashCode() {
        int hashCode = ((this.f88758a.hashCode() * 31) + this.f88759b.hashCode()) * 31;
        boolean z = this.f88760c;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        CasAccountUiModel casAccountUiModel = this.f88758a;
        ImageSource imageSource = this.f88759b;
        boolean z = this.f88760c;
        return "PiggyBankAccountListItem(account=" + casAccountUiModel + ", imageSource=" + imageSource + ", isChecked=" + z + ")";
    }
}
