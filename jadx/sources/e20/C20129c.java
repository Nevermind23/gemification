package e20;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.C0214c;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1483c;
import androidx.fragment.app.C1533o;
import g91.C32289b0;
import g91.C32343x;
import he1.C41233s;
import iu0.C36546y;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p366bk.C10320i;
import p863pw.C27634l;
import p90.C27472y2;

/* renamed from: e20.c */
public final class C20129c extends C1483c {

    /* renamed from: x */
    public static final C20130a f54793x = new C20130a((DefaultConstructorMarker) null);

    /* renamed from: t */
    private C27472y2 f54794t;

    /* renamed from: u */
    private String f54795u;

    /* renamed from: v */
    private String f54796v;

    /* renamed from: w */
    private String f54797w;

    /* renamed from: e20.c$a */
    public static final class C20130a {
        private C20130a() {
        }

        public /* synthetic */ C20130a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C20129c mo48559a(C27634l lVar) {
            C41536l.m120489i(lVar, "data");
            C20129c cVar = new C20129c();
            cVar.setArguments(C0908e.m3336b(C41233s.m119492a("TITLE_ID", lVar.mo67095d()), C41233s.m119492a("SUBTITLE_ID", lVar.mo67092a()), C41233s.m119492a("IMAGE_URL", lVar.mo67093b())));
            return cVar;
        }
    }

    /* renamed from: D1 */
    private final C27472y2 m66109D1() {
        C27472y2 y2Var = this.f54794t;
        C41536l.m120486f(y2Var);
        return y2Var;
    }

    /* renamed from: E1 */
    public static final C20129c m66110E1(C27634l lVar) {
        return f54793x.mo48559a(lVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: F1 */
    public static final void m66111F1(C20129c cVar, View view) {
        C41536l.m120489i(cVar, "this$0");
        C36546y.m108282F().mo27152s("amex_debit_card_popup", (String) null, "click_order_later");
        C1533o.m5445b(cVar, "REQUEST_KEY_AMEX_OFFER", C0908e.m3336b(C41233s.m119492a("RESULT_NO", Boolean.TRUE)));
        cVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: G1 */
    public static final void m66112G1(C20129c cVar, View view) {
        C41536l.m120489i(cVar, "this$0");
        C36546y.m108282F().mo27152s("amex_debit_card_popup", (String) null, "click_order");
        C1533o.m5445b(cVar, "REQUEST_KEY_AMEX_OFFER", C0908e.m3336b(C41233s.m119492a("RESULT_YES", Boolean.TRUE)));
        cVar.mo4577k1();
    }

    public void onCancel(DialogInterface dialogInterface) {
        C41536l.m120489i(dialogInterface, "dialog");
        C1533o.m5445b(this, "REQUEST_KEY_AMEX_OFFER", C0908e.m3336b(C41233s.m119492a("RESULT_NO", Boolean.TRUE)));
        super.onCancel(dialogInterface);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.f54795u = requireArguments.getString("TITLE_ID");
        this.f54796v = requireArguments.getString("SUBTITLE_ID");
        this.f54797w = requireArguments.getString("IMAGE_URL");
    }

    /* renamed from: q1 */
    public Dialog mo710q1(Bundle bundle) {
        String str;
        LayoutInflater layoutInflater = requireActivity().getLayoutInflater();
        C41536l.m120488h(layoutInflater, "requireActivity().layoutInflater");
        C0214c.C0215a aVar = new C0214c.C0215a(requireContext());
        this.f54794t = C27472y2.m85196d(layoutInflater);
        TextView textView = m66109D1().f70259g;
        String str2 = this.f54796v;
        String str3 = null;
        if (str2 != null) {
            str = C32343x.m95388F(str2, new Object[0]);
        } else {
            str = null;
        }
        textView.setText(str);
        TextView textView2 = m66109D1().f70261i;
        String str4 = this.f54795u;
        if (str4 != null) {
            str3 = C32343x.m95388F(str4, new Object[0]);
        }
        textView2.setText(str3);
        ImageView imageView = m66109D1().f70260h;
        String c = C32289b0.m95091c(this.f54797w);
        int i = C10320i.f28688dc;
        C32289b0.m95107s(imageView, c, Integer.valueOf(i), Integer.valueOf(i), false, false);
        m66109D1().f70257e.setOnClickListener(new C20127a(this));
        m66109D1().f70258f.setOnClickListener(new C20128b(this));
        aVar.setView((View) m66109D1().mo3946b());
        C0214c create = aVar.create();
        C41536l.m120488h(create, "builder.create()");
        create.setCanceledOnTouchOutside(false);
        Window window = create.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(17170445);
        }
        return create;
    }
}
