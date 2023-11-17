package p341ge.bog.designsystem.components.list;

import af1.C40303i;
import android.view.View;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41555e;

/* renamed from: ge.bog.designsystem.components.list.d */
final class C13367d implements C41555e {

    /* renamed from: a */
    private boolean f39756a;

    public C13367d(boolean z) {
        this.f39756a = z;
    }

    /* renamed from: a */
    public Boolean getValue(View view, C40303i iVar) {
        C41536l.m120489i(view, "thisRef");
        C41536l.m120489i(iVar, "property");
        return Boolean.valueOf(this.f39756a);
    }

    /* renamed from: b */
    public void mo36109b(View view, C40303i iVar, boolean z) {
        C41536l.m120489i(view, "thisRef");
        C41536l.m120489i(iVar, "property");
        this.f39756a = z;
        view.refreshDrawableState();
    }

    public /* bridge */ /* synthetic */ void setValue(Object obj, C40303i iVar, Object obj2) {
        mo36109b((View) obj, iVar, ((Boolean) obj2).booleanValue());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13367d(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
