package k81;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.presentation.productconfirmation.model.PendingProductConfirmationData;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p90.C27355l2;
import ue1.C43075l;

/* renamed from: k81.t */
public final class C36921t extends C36917q {

    /* renamed from: b */
    private PendingProductConfirmationData f89035b;

    /* renamed from: c */
    private C43075l f89036c;

    /* renamed from: d */
    private C43075l f89037d;

    /* renamed from: e */
    private C27355l2 f89038e;

    /* renamed from: i */
    private final void m109344i(C27355l2 l2Var) {
        String str;
        BogTextView bogTextView = l2Var.f69215g;
        C41536l.m120488h(bogTextView, "binding.pendingProductConfirmationItemTitleText");
        ImageView imageView = l2Var.f69213e;
        C41536l.m120488h(imageView, "binding.dismissBannerImage");
        l2Var.mo3946b().setOnClickListener(new C36919r(this));
        PendingProductConfirmationData pendingProductConfirmationData = this.f89035b;
        if (pendingProductConfirmationData == null || (str = pendingProductConfirmationData.mo55154b()) == null) {
            str = "";
        }
        bogTextView.setText(str);
        imageView.setOnClickListener(new C36920s(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final void m109345j(C36921t tVar, View view) {
        C41536l.m120489i(tVar, "this$0");
        C43075l lVar = tVar.f89036c;
        if (lVar != null) {
            lVar.invoke(tVar.f89035b);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final void m109346k(C36921t tVar, View view) {
        C41536l.m120489i(tVar, "this$0");
        C43075l lVar = tVar.f89037d;
        if (lVar != null) {
            lVar.invoke(tVar.f89035b);
        }
        tVar.mo89859b();
    }

    /* renamed from: a */
    public View mo89824a(Context context, ViewGroup viewGroup) {
        C27355l2 d = C27355l2.m84729d(LayoutInflater.from(context), viewGroup, false);
        C41536l.m120488h(d, "inflate(LayoutInflater.f…arent,\n            false)");
        this.f89038e = d;
        C27355l2 l2Var = null;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        m109344i(d);
        C27355l2 l2Var2 = this.f89038e;
        if (l2Var2 == null) {
            C41536l.m120506z("binding");
        } else {
            l2Var = l2Var2;
        }
        CardView c = l2Var.mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    /* renamed from: f */
    public final void mo89863f(PendingProductConfirmationData pendingProductConfirmationData) {
        C41536l.m120489i(pendingProductConfirmationData, "data");
        this.f89035b = pendingProductConfirmationData;
        C27355l2 l2Var = this.f89038e;
        if (l2Var == null) {
            C41536l.m120506z("binding");
            l2Var = null;
        }
        BogTextView bogTextView = l2Var.f69215g;
        String b = pendingProductConfirmationData.mo55154b();
        if (b == null) {
            b = "";
        }
        bogTextView.setText(b);
    }

    /* renamed from: g */
    public final void mo89864g(C43075l lVar) {
        this.f89036c = lVar;
    }

    /* renamed from: h */
    public final void mo89865h(C43075l lVar) {
        this.f89037d = lVar;
    }
}
