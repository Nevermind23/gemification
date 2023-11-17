package p642vh;

import af1.C40303i;
import kotlin.jvm.internal.C41536l;
import kotlin.properties.C41555e;
import p341ge.bog.designsystem.components.multipledots.HideableAmountView;

/* renamed from: vh.z */
public final class C18389z implements C41555e {

    /* renamed from: a */
    private final HideableAmountView f51847a;

    public C18389z(HideableAmountView hideableAmountView) {
        C41536l.m120489i(hideableAmountView, "view");
        this.f51847a = hideableAmountView;
    }

    /* renamed from: a */
    public Boolean getValue(Object obj, C40303i iVar) {
        C41536l.m120489i(obj, "thisRef");
        C41536l.m120489i(iVar, "property");
        return Boolean.valueOf(this.f51847a.getShowAmount());
    }

    /* renamed from: b */
    public void mo46189b(Object obj, C40303i iVar, boolean z) {
        C41536l.m120489i(obj, "thisRef");
        C41536l.m120489i(iVar, "property");
        this.f51847a.setShowAmount(z);
    }

    public /* bridge */ /* synthetic */ void setValue(Object obj, C40303i iVar, Object obj2) {
        mo46189b(obj, iVar, ((Boolean) obj2).booleanValue());
    }
}
