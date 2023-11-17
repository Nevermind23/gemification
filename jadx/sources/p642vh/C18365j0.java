package p642vh;

import af1.C40303i;
import android.view.View;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41555e;
import ue1.C43075l;

/* renamed from: vh.j0 */
public final class C18365j0 implements C41555e {

    /* renamed from: a */
    private final View f51818a;

    /* renamed from: b */
    private int f51819b;

    /* renamed from: c */
    private final C43075l f51820c;

    public C18365j0(View view, int i, C43075l lVar) {
        C41536l.m120489i(view, "view");
        this.f51818a = view;
        this.f51819b = i;
        this.f51820c = lVar;
    }

    /* renamed from: a */
    public Boolean getValue(Object obj, C40303i iVar) {
        boolean z;
        C41536l.m120489i(obj, "thisRef");
        C41536l.m120489i(iVar, "property");
        if (this.f51818a.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: b */
    public final void mo46150b(int i) {
        this.f51819b = i;
    }

    /* renamed from: c */
    public void mo46151c(Object obj, C40303i iVar, boolean z) {
        int i;
        C41536l.m120489i(obj, "thisRef");
        C41536l.m120489i(iVar, "property");
        View view = this.f51818a;
        if (z) {
            i = 0;
        } else {
            i = this.f51819b;
        }
        view.setVisibility(i);
        C43075l lVar = this.f51820c;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(z));
        }
    }

    public /* bridge */ /* synthetic */ void setValue(Object obj, C40303i iVar, Object obj2) {
        mo46151c(obj, iVar, ((Boolean) obj2).booleanValue());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18365j0(View view, int i, C43075l lVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, (i2 & 2) != 0 ? 8 : i, (i2 & 4) != 0 ? null : lVar);
    }
}
