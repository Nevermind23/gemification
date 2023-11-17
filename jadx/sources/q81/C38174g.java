package q81;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import androidx.appcompat.app.C0214c;
import he1.C41217g;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.manager.popupmanager.C21546a;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogButton;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10322k;
import p366bk.C10324m;
import ue1.C43064a;

/* renamed from: q81.g */
public final class C38174g extends C38212v {

    /* renamed from: I */
    public static final C38175a f91619I = new C38175a((DefaultConstructorMarker) null);

    /* renamed from: A */
    private BogButton f91620A;

    /* renamed from: B */
    private BogTextView f91621B;

    /* renamed from: C */
    private BogTextView f91622C;

    /* renamed from: D */
    private ImageView f91623D;

    /* renamed from: E */
    private final C41217g f91624E = C41219i.m119470b(new C38179e(this));

    /* renamed from: F */
    private final C41217g f91625F = C41219i.m119470b(new C38177c(this));

    /* renamed from: G */
    private final C41217g f91626G = C41219i.m119470b(new C38176b(this));

    /* renamed from: H */
    private final C41217g f91627H = C41219i.m119470b(new C38178d(this));

    /* renamed from: y */
    public C21546a f91628y;

    /* renamed from: z */
    private DialogInterface.OnDismissListener f91629z;

    /* renamed from: q81.g$a */
    public static final class C38175a {
        private C38175a() {
        }

        public /* synthetic */ C38175a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C38174g mo91716a(String str, String str2, String str3, int i) {
            C41536l.m120489i(str, "title");
            C41536l.m120489i(str2, "desc");
            C41536l.m120489i(str3, "buttonText");
            C38174g gVar = new C38174g();
            Bundle bundle = new Bundle();
            bundle.putString("dialog_title", str);
            bundle.putString("dialog_desc", str2);
            bundle.putString("dialog_button_text", str3);
            bundle.putInt("dialog_image", i);
            gVar.setArguments(bundle);
            return gVar;
        }
    }

    /* renamed from: q81.g$b */
    static final class C38176b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C38174g f91630d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38176b(C38174g gVar) {
            super(0);
            this.f91630d = gVar;
        }

        public final String invoke() {
            Bundle arguments = this.f91630d.getArguments();
            if (arguments != null) {
                return arguments.getString("dialog_button_text");
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: q81.g$c */
    static final class C38177c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C38174g f91631d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38177c(C38174g gVar) {
            super(0);
            this.f91631d = gVar;
        }

        public final String invoke() {
            Bundle arguments = this.f91631d.getArguments();
            if (arguments != null) {
                return arguments.getString("dialog_desc");
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: q81.g$d */
    static final class C38178d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C38174g f91632d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38178d(C38174g gVar) {
            super(0);
            this.f91632d = gVar;
        }

        /* renamed from: b */
        public final Integer invoke() {
            Bundle arguments = this.f91632d.getArguments();
            if (arguments != null) {
                return Integer.valueOf(arguments.getInt("dialog_image"));
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: q81.g$e */
    static final class C38179e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C38174g f91633d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38179e(C38174g gVar) {
            super(0);
            this.f91633d = gVar;
        }

        public final String invoke() {
            Bundle arguments = this.f91633d.getArguments();
            if (arguments != null) {
                return arguments.getString("dialog_title");
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: C1 */
    private final String m112334C1() {
        return (String) this.f91626G.getValue();
    }

    /* renamed from: D1 */
    private final String m112335D1() {
        return (String) this.f91625F.getValue();
    }

    /* renamed from: E1 */
    private final int m112336E1() {
        return ((Number) this.f91627H.getValue()).intValue();
    }

    /* renamed from: F1 */
    private final String m112337F1() {
        return (String) this.f91624E.getValue();
    }

    /* renamed from: G1 */
    public static final C38174g m112338G1(String str, String str2, String str3, int i) {
        return f91619I.mo91716a(str, str2, str3, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: H1 */
    public static final void m112339H1(C38174g gVar, View view) {
        C41536l.m120489i(gVar, "this$0");
        gVar.mo4577k1();
    }

    /* renamed from: I1 */
    public final void mo91715I1(DialogInterface.OnDismissListener onDismissListener) {
        this.f91629z = onDismissListener;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C41536l.m120489i(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.f91629z;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    /* renamed from: q1 */
    public Dialog mo710q1(Bundle bundle) {
        C0214c.C0215a aVar = new C0214c.C0215a(requireContext());
        LayoutInflater layoutInflater = requireActivity().getLayoutInflater();
        C41536l.m120488h(layoutInflater, "requireActivity().layoutInflater");
        BogButton bogButton = null;
        View inflate = layoutInflater.inflate(C10324m.dialog_onboarding_digital_card, (ViewGroup) null);
        View findViewById = inflate.findViewById(C10322k.f28802W7);
        C41536l.m120488h(findViewById, "view.findViewById(R.id.close_btn)");
        this.f91620A = (BogButton) findViewById;
        View findViewById2 = inflate.findViewById(C10322k.iconIV);
        C41536l.m120488h(findViewById2, "view.findViewById(R.id.iconIV)");
        this.f91623D = (ImageView) findViewById2;
        View findViewById3 = inflate.findViewById(C10322k.titleTV);
        C41536l.m120488h(findViewById3, "view.findViewById(R.id.titleTV)");
        this.f91621B = (BogTextView) findViewById3;
        View findViewById4 = inflate.findViewById(C10322k.messageTV);
        C41536l.m120488h(findViewById4, "view.findViewById(R.id.messageTV)");
        this.f91622C = (BogTextView) findViewById4;
        BogButton bogButton2 = this.f91620A;
        if (bogButton2 == null) {
            C41536l.m120506z("closeBtn");
            bogButton2 = null;
        }
        bogButton2.setText(m112334C1());
        BogTextView bogTextView = this.f91621B;
        if (bogTextView == null) {
            C41536l.m120506z("titleTV");
            bogTextView = null;
        }
        bogTextView.setText(m112337F1());
        BogTextView bogTextView2 = this.f91622C;
        if (bogTextView2 == null) {
            C41536l.m120506z("descTV");
            bogTextView2 = null;
        }
        bogTextView2.setText(m112335D1());
        ImageView imageView = this.f91623D;
        if (imageView == null) {
            C41536l.m120506z("mainImageView");
            imageView = null;
        }
        imageView.setImageResource(m112336E1());
        BogButton bogButton3 = this.f91620A;
        if (bogButton3 == null) {
            C41536l.m120506z("closeBtn");
        } else {
            bogButton = bogButton3;
        }
        bogButton.setOnClickListener(new C38173f(this));
        aVar.setView(inflate);
        C0214c create = aVar.create();
        C41536l.m120488h(create, "builder.create()");
        Window window = create.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(17170445);
        }
        return create;
    }
}
