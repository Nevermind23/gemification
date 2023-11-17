package p50;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebSettings;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1533o;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C4956a;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import he1.C41233s;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p725cr.C19788a;
import p90.C27316h2;

/* renamed from: p50.b */
public final class C27236b extends C19788a {

    /* renamed from: I */
    public static final C27237a f68247I = new C27237a((DefaultConstructorMarker) null);

    /* renamed from: H */
    private C27316h2 f68248H;

    /* renamed from: p50.b$a */
    public static final class C27237a {
        private C27237a() {
        }

        public /* synthetic */ C27237a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C27236b mo66514a(String str) {
            C41536l.m120489i(str, C11769i.C11770a.f34149l);
            C27236b bVar = new C27236b();
            bVar.setArguments(C0908e.m3336b(C41233s.m119492a("URL", str)));
            return bVar;
        }
    }

    /* renamed from: f2 */
    private final C27316h2 m84259f2() {
        C27316h2 h2Var = this.f68248H;
        C41536l.m120486f(h2Var);
        return h2Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: g2 */
    public static final void m84260g2(C27236b bVar, DialogInterface dialogInterface) {
        C41536l.m120489i(bVar, "this$0");
        View requireView = bVar.requireView();
        C41536l.m120488h(requireView, "requireView()");
        ViewGroup.LayoutParams layoutParams = requireView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = bVar.getResources().getDisplayMetrics().heightPixels;
            requireView.setLayoutParams(layoutParams);
            ViewParent parent = bVar.m84259f2().mo3946b().getParent();
            C41536l.m120487g(parent, "null cannot be cast to non-null type android.view.View");
            View view = (View) parent;
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = -1;
                view.setLayoutParams(layoutParams2);
                C41536l.m120487g(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
                BottomSheetBehavior n = ((C4956a) dialogInterface).mo15614n();
                n.mo15579I0(3);
                n.mo15578H0(true);
                n.mo15596w0(false);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    /* renamed from: h2 */
    private final void m84261h2() {
        String string = requireArguments().getString("URL");
        WebSettings settings = m84259f2().mo3946b().getSettings();
        boolean z = true;
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setLoadWithOverviewMode(false);
        settings.setUseWideViewPort(false);
        settings.setBuiltInZoomControls(true);
        if (!(string == null || string.length() == 0)) {
            z = false;
        }
        if (!z) {
            m84259f2().mo3946b().loadUrl(string);
        }
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f68248H = C27316h2.m84573d(getLayoutInflater(), viewGroup, true);
        m84261h2();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f68248H = null;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C41536l.m120489i(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        C1533o.m5445b(this, "WebViewActionSheet.REQUEST_KEY", C0908e.m3336b(C41233s.m119492a("WebViewActionSheet.REQUEST_KEY", Boolean.TRUE)));
    }

    /* renamed from: q1 */
    public Dialog mo710q1(Bundle bundle) {
        C4956a aVar;
        Dialog q1 = super.mo710q1(bundle);
        if (q1 instanceof C4956a) {
            aVar = (C4956a) q1;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            aVar.setOnShowListener(new C27235a(this));
        }
        return q1;
    }
}
