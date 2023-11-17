package p341ge.bog.mobilebank.shared.presentation.helper;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.lifecycle.C1619q;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.shared.presentation.helper.KeyboardVisibility */
public interface KeyboardVisibility {

    /* renamed from: ge.bog.mobilebank.shared.presentation.helper.KeyboardVisibility$Base */
    public static final class Base implements KeyboardVisibility {

        /* renamed from: ge.bog.mobilebank.shared.presentation.helper.KeyboardVisibility$Base$a */
        public interface C34650a {

            /* renamed from: ge.bog.mobilebank.shared.presentation.helper.KeyboardVisibility$Base$a$a */
            public static final class C34651a implements C34650a {

                /* renamed from: a */
                private final Activity f83760a;

                /* renamed from: b */
                private final ViewTreeObserver.OnGlobalLayoutListener f83761b;

                public C34651a(Activity activity, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                    C41536l.m120489i(activity, "activity");
                    C41536l.m120489i(onGlobalLayoutListener, "globalLayoutListener");
                    this.f83760a = activity;
                    this.f83761b = onGlobalLayoutListener;
                }

                public void unregister() {
                    ((ViewGroup) this.f83760a.findViewById(16908290)).getRootView().getViewTreeObserver().removeOnGlobalLayoutListener(this.f83761b);
                }
            }

            void unregister();
        }

        /* renamed from: ge.bog.mobilebank.shared.presentation.helper.KeyboardVisibility$Base$b */
        public static final class C34652b implements ViewTreeObserver.OnGlobalLayoutListener {

            /* renamed from: d */
            private boolean f83762d;

            /* renamed from: e */
            final /* synthetic */ Base f83763e;

            /* renamed from: f */
            final /* synthetic */ Activity f83764f;

            /* renamed from: g */
            final /* synthetic */ C34653a f83765g;

            C34652b(Base base, Activity activity, C34653a aVar) {
                this.f83763e = base;
                this.f83764f = activity;
                this.f83765g = aVar;
            }

            public void onGlobalLayout() {
                boolean b = this.f83763e.mo84599b(this.f83764f);
                if (b != this.f83762d) {
                    this.f83762d = b;
                    this.f83765g.mo44062a(b);
                }
            }
        }

        /* renamed from: a */
        public void mo84598a(Activity activity, C1619q qVar, C34653a aVar) {
            C41536l.m120489i(activity, "<this>");
            C41536l.m120489i(qVar, "lifecycleOwner");
            C41536l.m120489i(aVar, "listener");
            qVar.getLifecycle().mo4906a(new KeyboardVisibility$Base$setEventListener$1(mo84600c(activity, aVar), qVar));
        }

        /* renamed from: b */
        public final boolean mo84599b(Activity activity) {
            C41536l.m120489i(activity, "activity");
            Rect rect = new Rect();
            View rootView = ((ViewGroup) activity.findViewById(16908290)).getRootView();
            rootView.getWindowVisibleDisplayFrame(rect);
            int[] iArr = new int[2];
            ((ViewGroup) activity.findViewById(16908290)).getLocationOnScreen(iArr);
            int height = rootView.getRootView().getHeight();
            if (((double) ((height - rect.height()) - iArr[1])) > ((double) height) * 0.15d) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public final C34650a mo84600c(Activity activity, C34653a aVar) {
            C41536l.m120489i(activity, "<this>");
            C41536l.m120489i(aVar, "listener");
            View rootView = ((ViewGroup) activity.findViewById(16908290)).getRootView();
            C34652b bVar = new C34652b(this, activity, aVar);
            rootView.getViewTreeObserver().addOnGlobalLayoutListener(bVar);
            return new C34650a.C34651a(activity, bVar);
        }
    }

    /* renamed from: ge.bog.mobilebank.shared.presentation.helper.KeyboardVisibility$a */
    public interface C34653a {
        /* renamed from: a */
        void mo44062a(boolean z);
    }

    /* renamed from: a */
    void mo84598a(Activity activity, C1619q qVar, C34653a aVar);
}
