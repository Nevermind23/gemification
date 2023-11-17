package p369bn;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.RecoverCardUiModel;

/* renamed from: bn.c */
public final class C10339c {

    /* renamed from: a */
    private final DebitCardUiModel f29515a;

    /* renamed from: b */
    private final int f29516b;

    /* renamed from: c */
    private final boolean f29517c;

    /* renamed from: d */
    private final RecoverCardUiModel f29518d;

    public C10339c(DebitCardUiModel debitCardUiModel, int i, boolean z, RecoverCardUiModel recoverCardUiModel) {
        C41536l.m120489i(debitCardUiModel, "card");
        this.f29515a = debitCardUiModel;
        this.f29516b = i;
        this.f29517c = z;
        this.f29518d = recoverCardUiModel;
    }

    /* renamed from: b */
    public static /* synthetic */ C10339c m37619b(C10339c cVar, DebitCardUiModel debitCardUiModel, int i, boolean z, RecoverCardUiModel recoverCardUiModel, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            debitCardUiModel = cVar.f29515a;
        }
        if ((i2 & 2) != 0) {
            i = cVar.f29516b;
        }
        if ((i2 & 4) != 0) {
            z = cVar.f29517c;
        }
        if ((i2 & 8) != 0) {
            recoverCardUiModel = cVar.f29518d;
        }
        return cVar.mo26939a(debitCardUiModel, i, z, recoverCardUiModel);
    }

    /* renamed from: a */
    public final C10339c mo26939a(DebitCardUiModel debitCardUiModel, int i, boolean z, RecoverCardUiModel recoverCardUiModel) {
        C41536l.m120489i(debitCardUiModel, "card");
        return new C10339c(debitCardUiModel, i, z, recoverCardUiModel);
    }

    /* renamed from: c */
    public final DebitCardUiModel mo26940c() {
        return this.f29515a;
    }

    /* renamed from: d */
    public final int mo26941d() {
        return this.f29516b;
    }

    /* renamed from: e */
    public final RecoverCardUiModel mo26942e() {
        return this.f29518d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10339c)) {
            return false;
        }
        C10339c cVar = (C10339c) obj;
        return C41536l.m120484d(this.f29515a, cVar.f29515a) && this.f29516b == cVar.f29516b && this.f29517c == cVar.f29517c && C41536l.m120484d(this.f29518d, cVar.f29518d);
    }

    /* renamed from: f */
    public final boolean mo26944f() {
        return this.f29517c;
    }

    public int hashCode() {
        int hashCode = ((this.f29515a.hashCode() * 31) + this.f29516b) * 31;
        boolean z = this.f29517c;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        RecoverCardUiModel recoverCardUiModel = this.f29518d;
        return i + (recoverCardUiModel == null ? 0 : recoverCardUiModel.hashCode());
    }

    public String toString() {
        DebitCardUiModel debitCardUiModel = this.f29515a;
        int i = this.f29516b;
        boolean z = this.f29517c;
        RecoverCardUiModel recoverCardUiModel = this.f29518d;
        return "OrderCardListItem(card=" + debitCardUiModel + ", index=" + i + ", isDigital=" + z + ", recoverCard=" + recoverCardUiModel + ")";
    }
}
