package p341ge.bog.mobilebank.cleanarch.moremenu.presentation.model;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.mobilebank.cleanarch.moremenu.presentation.model.OptionalActionsData */
public final class OptionalActionsData {
    private final boolean showInstantCard;

    public OptionalActionsData() {
        this(false, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ OptionalActionsData copy$default(OptionalActionsData optionalActionsData, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = optionalActionsData.showInstantCard;
        }
        return optionalActionsData.copy(z);
    }

    public final boolean component1() {
        return this.showInstantCard;
    }

    public final OptionalActionsData copy(boolean z) {
        return new OptionalActionsData(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OptionalActionsData) && this.showInstantCard == ((OptionalActionsData) obj).showInstantCard;
    }

    public final boolean getShowInstantCard() {
        return this.showInstantCard;
    }

    public int hashCode() {
        boolean z = this.showInstantCard;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        boolean z = this.showInstantCard;
        return "OptionalActionsData(showInstantCard=" + z + ")";
    }

    public OptionalActionsData(boolean z) {
        this.showInstantCard = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OptionalActionsData(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
