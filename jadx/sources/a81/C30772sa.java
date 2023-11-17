package a81;

import android.os.Bundle;
import android.view.View;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.toolbar.ToolbarView;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;

/* renamed from: a81.sa */
public abstract class C30772sa extends C35388f2 {
    /* access modifiers changed from: private */
    /* renamed from: C2 */
    public /* synthetic */ void m91947C2(View view) {
        onBackPressed();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D2 */
    public final void mo70996D2(Bundle bundle, C6201a aVar) {
        if (aVar != null) {
            setContentView(aVar.mo3946b());
        }
        ToolbarView toolbarView = this.f85671t;
        if (toolbarView != null) {
            toolbarView.setNavigationEnabled(true);
            this.f85671t.setNavigationOnClickListener(new C30759ra(this));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        mo70996D2(bundle, (C6201a) null);
    }
}
