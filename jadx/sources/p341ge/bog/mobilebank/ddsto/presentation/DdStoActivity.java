package p341ge.bog.mobilebank.ddsto.presentation;

import a81.C30772sa;
import aa0.C19216a;
import android.os.Bundle;
import android.view.View;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.toolbar.ToolbarView;
import v90.C29003a;

/* renamed from: ge.bog.mobilebank.ddsto.presentation.DdStoActivity */
public final class DdStoActivity extends C30772sa {

    /* renamed from: G */
    public static final C22731a f59992G = new C22731a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private C29003a f59993F;

    /* renamed from: ge.bog.mobilebank.ddsto.presentation.DdStoActivity$a */
    public static final class C22731a {
        private C22731a() {
        }

        public /* synthetic */ C22731a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F2 */
    public static final void m73722F2(DdStoActivity ddStoActivity, View view) {
        C41536l.m120489i(ddStoActivity, "this$0");
        ddStoActivity.finish();
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C29003a d = C29003a.m88737d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f59993F = d;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        setContentView((View) d.mo3946b());
        ToolbarView toolbarView = this.f85671t;
        if (toolbarView != null) {
            toolbarView.setNavigationOnClickListener(new C19216a(this));
        }
    }
}
