package b21;

import android.animation.Animator;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.C0214c;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1483c;
import androidx.fragment.app.C1533o;
import b31.C31117f;
import com.airbnb.lottie.LottieAnimationView;
import g91.C32343x;
import he1.C41217g;
import he1.C41233s;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import ue1.C43064a;
import x11.C39773f;

/* renamed from: b21.b */
public final class C31108b extends C1483c {

    /* renamed from: v */
    public static final C31109a f77312v = new C31109a((DefaultConstructorMarker) null);

    /* renamed from: t */
    private C31117f f77313t;

    /* renamed from: u */
    private final C41217g f77314u = C41219i.m119470b(new C31111c(this));

    /* renamed from: b21.b$a */
    public static final class C31109a {
        private C31109a() {
        }

        public /* synthetic */ C31109a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C31108b mo71319a(boolean z) {
            C31108b bVar = new C31108b();
            bVar.setArguments(C0908e.m3336b(C41233s.m119492a("ARG_IS_RB", Boolean.valueOf(z))));
            return bVar;
        }
    }

    /* renamed from: b21.b$b */
    public static final class C31110b implements Animator.AnimatorListener {

        /* renamed from: d */
        final /* synthetic */ C31108b f77315d;

        C31110b(C31108b bVar) {
            this.f77315d = bVar;
        }

        public void onAnimationCancel(Animator animator) {
            C41536l.m120489i(animator, "animation");
        }

        public void onAnimationEnd(Animator animator) {
            C41536l.m120489i(animator, "animation");
            LottieAnimationView lottieAnimationView = this.f77315d.m92559E1().f77334f;
            lottieAnimationView.setMinFrame(96);
            lottieAnimationView.setRepeatCount(-1);
            lottieAnimationView.mo7439x();
            lottieAnimationView.mo7438w();
        }

        public void onAnimationRepeat(Animator animator) {
            C41536l.m120489i(animator, "animation");
        }

        public void onAnimationStart(Animator animator) {
            C41536l.m120489i(animator, "animation");
        }
    }

    /* renamed from: b21.b$c */
    static final class C31111c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C31108b f77316d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31111c(C31108b bVar) {
            super(0);
            this.f77316d = bVar;
        }

        /* renamed from: b */
        public final Boolean invoke() {
            Bundle arguments = this.f77316d.getArguments();
            boolean z = false;
            if (arguments != null) {
                z = arguments.getBoolean("ARG_IS_RB", false);
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: D1 */
    private final Animator.AnimatorListener m92558D1() {
        return new C31110b(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: E1 */
    public final C31117f m92559E1() {
        C31117f fVar = this.f77313t;
        C41536l.m120486f(fVar);
        return fVar;
    }

    /* renamed from: F1 */
    private final boolean m92560F1() {
        return ((Boolean) this.f77314u.getValue()).booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: G1 */
    public static final void m92561G1(C31108b bVar, View view) {
        C41536l.m120489i(bVar, "this$0");
        bVar.mo4577k1();
    }

    /* renamed from: H1 */
    private final void m92562H1() {
        int i;
        C31117f E1 = m92559E1();
        E1.f77335g.setButtonText(C32343x.m95388F("bithday.popup.button", new Object[0]));
        E1.f77333e.setTitle(C32343x.m95388F("bithday.popup.title", new Object[0]));
        E1.f77333e.setText(C32343x.m95388F("bithday.popup.text", new Object[0]));
        LottieAnimationView lottieAnimationView = E1.f77334f;
        if (m92560F1()) {
            i = C39773f.anim_birthday_rb;
        } else {
            i = C39773f.anim_birthday_solo;
        }
        lottieAnimationView.setAnimation(i);
        E1.f77334f.mo7391i(m92558D1());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        C41536l.m120489i(layoutInflater, "inflater");
        Dialog n1 = mo4579n1();
        if (!(n1 == null || (window = n1.getWindow()) == null)) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        LayerView c = m92559E1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f77313t = null;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C41536l.m120489i(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        C1533o.m5445b(this, "REQUEST_KEY_BIRTHDAY_DIALOG", C0908e.m3336b(C41233s.m119492a("RESULT_KEY_BIRTHDAY_DIALOG_DISMISSED", Boolean.TRUE)));
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m92559E1().f77335g.setOnClickListener(new C31107a(this));
        m92562H1();
    }

    /* renamed from: q1 */
    public Dialog mo710q1(Bundle bundle) {
        C0214c.C0215a aVar = new C0214c.C0215a(requireContext());
        this.f77313t = C31117f.m92587d(LayoutInflater.from(requireContext()));
        aVar.setView((View) m92559E1().mo3946b());
        C0214c create = aVar.create();
        C41536l.m120488h(create, "builder.create()");
        return create;
    }
}
