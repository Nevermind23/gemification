package p644vj;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.C0214c;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1483c;
import com.airbnb.lottie.LottieAnimationView;
import he1.C41217g;
import he1.C41233s;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.statusbadge.StatusBadgeView;
import p341ge.bog.designsystem.components.toastnotification.ToastNotificationAppearance;
import p341ge.bog.designsystem.components.toastnotification.ToastNotificationArguments;
import p341ge.bog.designsystem.components.toastnotification.ToastNotificationIcon;
import p352ak.C9962l6;
import p615tg.C17964e;
import p642vh.C18368l;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: vj.d */
public final class C18394d extends C1483c {

    /* renamed from: A */
    public static final C18397c f51852A = new C18397c((DefaultConstructorMarker) null);

    /* renamed from: t */
    private C9962l6 f51853t;

    /* renamed from: u */
    private C18395a f51854u;

    /* renamed from: v */
    private C18396b f51855v;

    /* renamed from: w */
    private C18398d f51856w;

    /* renamed from: x */
    private final C41217g f51857x = C41219i.m119470b(new C18399e(this));

    /* renamed from: y */
    private final Handler f51858y = new Handler(Looper.getMainLooper());

    /* renamed from: z */
    private final Runnable f51859z = new C18393c(this);

    /* renamed from: vj.d$a */
    public interface C18395a {
        /* renamed from: a */
        void mo46197a();
    }

    /* renamed from: vj.d$b */
    public interface C18396b {
        /* renamed from: b */
        void mo46198b();
    }

    /* renamed from: vj.d$c */
    public static final class C18397c {
        private C18397c() {
        }

        public /* synthetic */ C18397c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C18394d mo46199a(ToastNotificationArguments toastNotificationArguments) {
            C41536l.m120489i(toastNotificationArguments, "args");
            C18394d dVar = new C18394d();
            dVar.setArguments(C0908e.m3336b(C41233s.m119492a("TOAST_NOTIFICATION_ARGUMENTS_KEY", toastNotificationArguments)));
            return dVar;
        }
    }

    /* renamed from: vj.d$d */
    public interface C18398d {
        void onCreate();
    }

    /* renamed from: vj.d$e */
    static final class C18399e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C18394d f51860d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18399e(C18394d dVar) {
            super(0);
            this.f51860d = dVar;
        }

        /* renamed from: b */
        public final ToastNotificationArguments invoke() {
            Bundle arguments = this.f51860d.getArguments();
            ToastNotificationArguments toastNotificationArguments = arguments != null ? (ToastNotificationArguments) arguments.getParcelable("TOAST_NOTIFICATION_ARGUMENTS_KEY") : null;
            if (toastNotificationArguments != null) {
                return toastNotificationArguments;
            }
            throw new IllegalArgumentException("ToastNotificationArguments == null".toString());
        }
    }

    /* renamed from: E1 */
    private final void m62814E1(ToastNotificationAppearance toastNotificationAppearance) {
        C9962l6 l6Var = this.f51853t;
        if (l6Var == null) {
            C41536l.m120506z("binding");
            l6Var = null;
        }
        StatusBadgeView statusBadgeView = l6Var.f27256i;
        C41536l.m120488h(statusBadgeView, "statusBadge");
        C18368l.m62751F(statusBadgeView, toastNotificationAppearance.mo37023b() instanceof ToastNotificationIcon.Badge, false, 2, (Object) null);
        LottieAnimationView lottieAnimationView = l6Var.f27257j;
        C41536l.m120488h(lottieAnimationView, "toastIllustration");
        C18368l.m62751F(lottieAnimationView, toastNotificationAppearance.mo37023b() instanceof ToastNotificationIcon.Illustration, false, 2, (Object) null);
        ToastNotificationIcon b = toastNotificationAppearance.mo37023b();
        if (b instanceof ToastNotificationIcon.Badge) {
            l6Var.f27256i.setType(((ToastNotificationIcon.Badge) b).mo37077a());
        } else if (b instanceof ToastNotificationIcon.Illustration) {
            LottieAnimationView lottieAnimationView2 = l6Var.f27257j;
            C41536l.m120488h(lottieAnimationView2, "toastIllustration");
            C18368l.m62746A(lottieAnimationView2, ((ToastNotificationIcon.Illustration) b).mo37087a(), (C43075l) null, 2, (Object) null);
        }
        LayerView c = l6Var.mo3946b();
        Color a = toastNotificationAppearance.mo37022a();
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        c.setBackgroundColor(a.mo35260a(requireContext));
        LayerView c2 = l6Var.mo3946b();
        Context requireContext2 = requireContext();
        C41536l.m120488h(requireContext2, "requireContext()");
        c2.setForeground(C17964e.m61889b(requireContext2, toastNotificationAppearance.mo37024d(), 0, 0, 12, (Object) null));
    }

    /* renamed from: F1 */
    private final Dialog m62815F1() {
        C0214c.C0215a aVar = new C0214c.C0215a(requireContext());
        C9962l6 l6Var = this.f51853t;
        if (l6Var == null) {
            C41536l.m120506z("binding");
            l6Var = null;
        }
        aVar.setView((View) l6Var.mo3946b());
        C0214c create = aVar.create();
        C41536l.m120488h(create, "builder.create()");
        Window window = create.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(17170445);
        }
        create.setCanceledOnTouchOutside(m62817H1().mo37060d());
        return create;
    }

    /* access modifiers changed from: private */
    /* renamed from: G1 */
    public static final void m62816G1(C18394d dVar) {
        C41536l.m120489i(dVar, "this$0");
        dVar.mo4578l1();
    }

    /* renamed from: H1 */
    private final ToastNotificationArguments m62817H1() {
        return (ToastNotificationArguments) this.f51857x.getValue();
    }

    /* renamed from: L1 */
    private final void m62818L1(AppCompatTextView appCompatTextView, String str) {
        boolean z;
        appCompatTextView.setText(str);
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        C18368l.m62751F(appCompatTextView, z, false, 2, (Object) null);
    }

    /* renamed from: M1 */
    private final void m62819M1(Button button, String str) {
        C41238w wVar;
        if (str != null) {
            button.setButtonText(str);
            button.setVisibility(0);
            wVar = C41238w.f97225a;
        } else {
            wVar = null;
        }
        if (wVar == null) {
            button.setVisibility(8);
        }
    }

    /* renamed from: N1 */
    private final void m62820N1(Window window) {
        WindowManager.LayoutParams attributes = window.getAttributes();
        Integer h = m62817H1().mo37066h();
        if (h != null) {
            window.setGravity(h.intValue());
        }
        Integer k = m62817H1().mo37070k();
        if (k != null) {
            int intValue = k.intValue();
            if (attributes != null) {
                attributes.y = C18368l.m62762k(intValue);
            }
        }
        Integer j = m62817H1().mo37069j();
        if (j != null) {
            int intValue2 = j.intValue();
            if (attributes != null) {
                attributes.x = C18368l.m62762k(intValue2);
            }
        }
        window.setAttributes(attributes);
        window.clearFlags(2);
        window.setFlags(32, 32);
        window.setFlags(262144, 262144);
    }

    /* renamed from: O1 */
    private final void m62821O1() {
        C9962l6 d = C9962l6.m36538d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f51853t = d;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        AppCompatImageView appCompatImageView = d.f27253f;
        C41536l.m120488h(appCompatImageView, "closeButton");
        C18368l.m62751F(appCompatImageView, m62817H1().mo37062e(), false, 2, (Object) null);
        AppCompatTextView appCompatTextView = d.f27255h;
        C41536l.m120488h(appCompatTextView, "ibanNumber");
        m62818L1(appCompatTextView, m62817H1().mo37068i());
        AppCompatTextView appCompatTextView2 = d.f27254g;
        C41536l.m120488h(appCompatTextView2, "description");
        m62818L1(appCompatTextView2, m62817H1().mo37065g());
        Button button = d.f27252e;
        C41536l.m120488h(button, "applyButton");
        m62819M1(button, m62817H1().mo37059b());
        d.f27252e.setOnClickListener(new C18391a(this));
        d.f27253f.setOnClickListener(new C18392b(this));
        m62814E1(m62817H1().mo37058a());
        Long f = m62817H1().mo37064f();
        if (f != null) {
            this.f51858y.postDelayed(this.f51859z, f.longValue());
        }
        C18398d dVar = this.f51856w;
        if (dVar != null) {
            dVar.onCreate();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P1 */
    public static final void m62822P1(C18394d dVar, View view) {
        C41536l.m120489i(dVar, "this$0");
        dVar.mo4577k1();
        C18395a aVar = dVar.f51854u;
        if (aVar != null) {
            aVar.mo46197a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Q1 */
    public static final void m62823Q1(C18394d dVar, View view) {
        C41536l.m120489i(dVar, "this$0");
        dVar.mo4577k1();
        C18396b bVar = dVar.f51855v;
        if (bVar != null) {
            bVar.mo46198b();
        }
    }

    /* renamed from: I1 */
    public final void mo46194I1(C18395a aVar) {
        this.f51854u = aVar;
    }

    /* renamed from: J1 */
    public final void mo46195J1(C18396b bVar) {
        this.f51855v = bVar;
    }

    /* renamed from: K1 */
    public final void mo46196K1(C18398d dVar) {
        this.f51856w = dVar;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        C41536l.m120489i(layoutInflater, "inflater");
        Dialog n1 = mo4579n1();
        if (!(n1 == null || (window = n1.getWindow()) == null)) {
            m62820N1(window);
        }
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public void onDestroyView() {
        this.f51858y.removeCallbacks(this.f51859z);
        super.onDestroyView();
    }

    /* renamed from: q1 */
    public Dialog mo710q1(Bundle bundle) {
        m62821O1();
        return m62815F1();
    }
}
