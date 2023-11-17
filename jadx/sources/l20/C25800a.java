package l20;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.presentation.liabilityoverdue.liabilityinfo.LiabilityOverdueInfoUiModel;

/* renamed from: l20.a */
public final class C25800a {

    /* renamed from: a */
    private final LiabilityOverdueInfoUiModel f65627a;

    public C25800a(LiabilityOverdueInfoUiModel liabilityOverdueInfoUiModel) {
        this.f65627a = liabilityOverdueInfoUiModel;
    }

    /* renamed from: a */
    public final LiabilityOverdueInfoUiModel mo64430a() {
        return this.f65627a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C25800a) && C41536l.m120484d(this.f65627a, ((C25800a) obj).f65627a);
    }

    public int hashCode() {
        LiabilityOverdueInfoUiModel liabilityOverdueInfoUiModel = this.f65627a;
        if (liabilityOverdueInfoUiModel == null) {
            return 0;
        }
        return liabilityOverdueInfoUiModel.hashCode();
    }

    public String toString() {
        LiabilityOverdueInfoUiModel liabilityOverdueInfoUiModel = this.f65627a;
        return "LiabilityOverduePopupData(data=" + liabilityOverdueInfoUiModel + ")";
    }
}
