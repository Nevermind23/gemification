package qi0;

import android.content.Context;
import android.widget.TextView;
import androidx.core.content.C0767a;
import java.util.Arrays;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mj0.C26238b;
import oh0.C27006a;
import oh0.C27007b;
import p642vh.C18368l;
import pi0.C27534a;
import th0.C28415n0;

/* renamed from: qi0.x */
public final class C27839x extends C26238b {

    /* renamed from: f */
    public static final C27840a f70967f = new C27840a((DefaultConstructorMarker) null);

    /* renamed from: qi0.x$a */
    public static final class C27840a {
        private C27840a() {
        }

        public /* synthetic */ C27840a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27839x(C28415n0 n0Var) {
        super(n0Var);
        C41536l.m120489i(n0Var, "binding");
    }

    /* renamed from: n */
    private final void m86033n(TextView textView, boolean z) {
        int i;
        if (z) {
            Context context = textView.getContext();
            C41536l.m120488h(context, "context");
            i = C18368l.m62755d(context, C27006a.f67781e);
        } else {
            i = C0767a.m2893c(textView.getContext(), C27007b.f67783a);
        }
        textView.setTextColor(i);
    }

    /* renamed from: m */
    public void mo48397j(C27534a.C27548m mVar) {
        String str;
        C41536l.m120489i(mVar, "item");
        C28415n0 n0Var = (C28415n0) mo65241h();
        super.mo48397j(mVar);
        TextView textView = n0Var.f72150f;
        if (mVar.mo66920d()) {
            str = String.format("-%s", Arrays.copyOf(new Object[]{mVar.mo66917a()}, 1));
            C41536l.m120488h(str, "format(this, *args)");
        } else {
            str = mVar.mo66917a();
        }
        textView.setText(str);
        n0Var.f72149e.setTitle(mVar.mo66919c());
        n0Var.f72149e.setText(mVar.mo66918b());
        TextView textView2 = n0Var.f72150f;
        C41536l.m120488h(textView2, "tvGiftCardAmount");
        m86033n(textView2, mVar.mo66920d());
    }
}
