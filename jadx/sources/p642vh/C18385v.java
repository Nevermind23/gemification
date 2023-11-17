package p642vh;

import af1.C40303i;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C1152f3;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41555e;

/* renamed from: vh.v */
public final class C18385v implements C41555e {

    /* renamed from: a */
    private final ViewGroup f51839a;

    /* renamed from: b */
    private final boolean f51840b;

    /* renamed from: c */
    private final boolean f51841c;

    public C18385v(ViewGroup viewGroup, boolean z, boolean z2) {
        C41536l.m120489i(viewGroup, "parent");
        this.f51839a = viewGroup;
        this.f51840b = z;
        this.f51841c = z2;
    }

    /* renamed from: a */
    public List getValue(Object obj, C40303i iVar) {
        C41536l.m120489i(obj, "thisRef");
        C41536l.m120489i(iVar, "property");
        return C40355o.m116850A(C1152f3.m4215b(this.f51839a));
    }

    /* renamed from: b */
    public void setValue(Object obj, C40303i iVar, List list) {
        boolean z;
        C41536l.m120489i(obj, "thisRef");
        C41536l.m120489i(iVar, "property");
        if (this.f51839a.getChildCount() > 0) {
            this.f51839a.removeAllViews();
        }
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.f51839a.setVisibility(0);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                View view = (View) it.next();
                this.f51839a.addView(view);
                view.setDuplicateParentStateEnabled(this.f51840b);
            }
        } else if (this.f51841c) {
            this.f51839a.setVisibility(8);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18385v(ViewGroup viewGroup, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewGroup, (i & 2) != 0 ? true : z, (i & 4) != 0 ? true : z2);
    }
}
