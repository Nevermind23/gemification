package p657wj;

import af1.C40303i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C1111b;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import p642vh.C18367k0;

/* renamed from: wj.a */
public abstract class C18597a extends C1111b {

    /* renamed from: e */
    static final /* synthetic */ C40303i[] f52188e = {C41520a0.m120439e(new C41539o(C18597a.class, "itemClickListener", "getItemClickListener$design_system_release()Landroidx/appcompat/widget/Toolbar$OnMenuItemClickListener;", 0))};

    /* renamed from: d */
    private final C18367k0 f52189d = new C18367k0();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18597a(Context context) {
        super(context);
        C41536l.m120489i(context, "context");
    }

    /* renamed from: k */
    public abstract void mo37098k(View view, ColorStateList colorStateList);

    /* renamed from: l */
    public final Toolbar.C0390h mo46443l() {
        return (Toolbar.C0390h) this.f52189d.mo46152a(this, f52188e[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo46444m(MenuItem menuItem) {
        C41536l.m120489i(menuItem, "menuItem");
        Toolbar.C0390h l = mo46443l();
        if (l != null) {
            l.onMenuItemClick(menuItem);
        }
    }

    /* renamed from: n */
    public final void mo46445n(Toolbar.C0390h hVar) {
        this.f52189d.mo46153b(this, f52188e[0], hVar);
    }
}
