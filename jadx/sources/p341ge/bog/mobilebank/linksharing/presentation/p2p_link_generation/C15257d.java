package p341ge.bog.mobilebank.linksharing.presentation.p2p_link_generation;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.app.C0214c;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.FragmentManager;
import ap0.C10136i;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import g91.C32343x;
import he1.C41233s;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.C41524c0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mp0.C16890b;
import mp0.C16891c;
import mp0.C16892d;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import ue1.C43075l;
import wo0.C18655e;

/* renamed from: ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.d */
public final class C15257d extends C15250a {

    /* renamed from: A */
    public static final C15258a f43631A = new C15258a((DefaultConstructorMarker) null);

    /* renamed from: y */
    private C10136i f43632y;

    /* renamed from: z */
    private View.OnClickListener f43633z;

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.d$a */
    public static final class C15258a {
        private C15258a() {
        }

        public /* synthetic */ C15258a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m55602c(C43075l lVar, C15257d dVar, View view) {
            C41536l.m120489i(dVar, "$this_apply");
            if (lVar != null) {
                lVar.invoke(dVar);
            }
        }

        /* renamed from: b */
        public final void mo42317b(FragmentManager fragmentManager, String str, C43075l lVar) {
            C41536l.m120489i(fragmentManager, "fragmentManager");
            C41536l.m120489i(str, C11755a.C11756a.f34100b);
            C15257d dVar = new C15257d();
            dVar.setArguments(C0908e.m3336b(C41233s.m119492a("HOSTNAME", str)));
            dVar.mo42316G1(new C16892d(lVar, dVar));
            dVar.mo4576A1(fragmentManager, (String) null);
        }
    }

    /* renamed from: D1 */
    private final C10136i m55596D1() {
        C10136i iVar = this.f43632y;
        C41536l.m120486f(iVar);
        return iVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: E1 */
    public static final void m55597E1(C15257d dVar, View view) {
        C41536l.m120489i(dVar, "this$0");
        dVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: F1 */
    public static final void m55598F1(C15257d dVar, View view) {
        C41536l.m120489i(dVar, "this$0");
        dVar.mo4577k1();
    }

    /* renamed from: G1 */
    public final void mo42316G1(View.OnClickListener onClickListener) {
        this.f43633z = onClickListener;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        C41536l.m120489i(layoutInflater, "inflater");
        Dialog n1 = mo4579n1();
        if (!(n1 == null || (window = n1.getWindow()) == null)) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        LayerView c = m55596D1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        this.f43632y = null;
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        C10136i D1 = m55596D1();
        super.onViewCreated(view, bundle);
        D1.f28115n.setText(C32343x.m95388F("text.p2p.link.popup.review.link.nickname", new Object[0]));
        D1.f28110i.setText(C32343x.m95388F("text.p2p.link.popup.customize.link.note", new Object[0]));
        String string = requireArguments().getString("HOSTNAME");
        if (string != null) {
            TextView textView = D1.f28113l;
            C41524c0 c0Var = C41524c0.f97701a;
            Locale locale = Locale.getDefault();
            String string2 = getString(C18655e.popup_nickname);
            C41536l.m120488h(string2, "getString(R.string.popup_nickname)");
            String format = String.format(locale, string2, Arrays.copyOf(new Object[]{C40439w.m117103B(C32343x.m95388F("text.p2p.link.popup.link.hostname", new Object[0]), "\n", "", false, 4, (Object) null), string}, 2));
            C41536l.m120488h(format, "format(locale, format, *args)");
            textView.setText(format);
        }
        Button button = D1.f28112k;
        button.setButtonText(C32343x.m95388F("text.p2p.link.popup.goback.btn", new Object[0]));
        button.setOnClickListener(new C16890b(this));
        Button button2 = D1.f28114m;
        button2.setButtonText(C32343x.m95388F("text.p2p.link.popup.confirm.btn", new Object[0]));
        button2.setOnClickListener(this.f43633z);
        D1.f28109h.setOnClickListener(new C16891c(this));
    }

    /* renamed from: q1 */
    public Dialog mo710q1(Bundle bundle) {
        C0214c.C0215a aVar = new C0214c.C0215a(requireContext());
        this.f43632y = C10136i.m37073d(getLayoutInflater());
        aVar.setView((View) m55596D1().mo3946b());
        C0214c create = aVar.create();
        C41536l.m120488h(create, "builder.create()");
        return create;
    }
}
