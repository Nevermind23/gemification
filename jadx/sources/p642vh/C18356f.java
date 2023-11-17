package p642vh;

import af1.C40303i;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41555e;

/* renamed from: vh.f */
public final class C18356f implements C41555e {

    /* renamed from: a */
    private final ViewGroup f51805a;

    /* renamed from: b */
    private final boolean f51806b;

    /* renamed from: c */
    private final boolean f51807c;

    public C18356f(ViewGroup viewGroup, boolean z, boolean z2) {
        C41536l.m120489i(viewGroup, "parent");
        this.f51805a = viewGroup;
        this.f51806b = z;
        this.f51807c = z2;
    }

    /* renamed from: a */
    public View getValue(Object obj, C40303i iVar) {
        C41536l.m120489i(obj, "thisRef");
        C41536l.m120489i(iVar, "property");
        View childAt = this.f51805a.getChildAt(0);
        if (childAt instanceof View) {
            return childAt;
        }
        return null;
    }

    /* renamed from: b */
    public void setValue(Object obj, C40303i iVar, View view) {
        C41536l.m120489i(obj, "thisRef");
        C41536l.m120489i(iVar, "property");
        if (this.f51805a.getChildCount() > 0) {
            this.f51805a.removeAllViews();
        }
        if (view != null) {
            this.f51805a.addView(view);
            this.f51805a.setVisibility(0);
            view.setDuplicateParentStateEnabled(this.f51806b);
        } else if (this.f51807c) {
            this.f51805a.setVisibility(8);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18356f(ViewGroup viewGroup, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewGroup, (i & 2) != 0 ? true : z, (i & 4) != 0 ? true : z2);
    }
}
