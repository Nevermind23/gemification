package p420fh;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.C1483c;
import com.github.mikephil.charting.utils.Utils;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p434gh.C15278a;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: fh.d */
public final class C12902d {

    /* renamed from: b */
    public static final C12903a f38098b = new C12903a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static WeakReference f38099c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static boolean f38100d = true;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C12892b f38101a;

    /* renamed from: fh.d$a */
    public static final class C12903a {

        /* renamed from: fh.d$a$a */
        public static final class C12904a implements Runnable {

            /* renamed from: d */
            final /* synthetic */ C12892b f38102d;

            C12904a(C12892b bVar) {
                this.f38102d = bVar;
            }

            public void run() {
                try {
                    C12892b bVar = this.f38102d;
                    if (bVar != null) {
                        ViewParent parent = bVar.getParent();
                        C41536l.m120487g(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                        ((ViewGroup) parent).removeView(bVar);
                    }
                } catch (Exception e) {
                    Log.e(C12904a.class.getSimpleName(), Log.getStackTraceString(e));
                }
            }
        }

        private C12903a() {
        }

        public /* synthetic */ C12903a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: e */
        public static /* synthetic */ C12902d m48771e(C12903a aVar, Activity activity, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = true;
            }
            return aVar.mo33657c(activity, z);
        }

        /* renamed from: f */
        public static /* synthetic */ C12902d m48772f(C12903a aVar, C1483c cVar, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = true;
            }
            return aVar.mo33658d(cVar, z);
        }

        /* renamed from: g */
        private final Runnable m48773g(C12892b bVar) {
            return new C12904a(bVar);
        }

        /* renamed from: a */
        public final void mo33655a(Activity activity) {
            C12892b bVar;
            C41536l.m120489i(activity, "activity");
            try {
                View decorView = activity.getWindow().getDecorView();
                C41536l.m120487g(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
                ViewGroup viewGroup = (ViewGroup) decorView;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    IBinder iBinder = null;
                    if (viewGroup.getChildAt(i) instanceof C12892b) {
                        View childAt = viewGroup.getChildAt(i);
                        C41536l.m120487g(childAt, "null cannot be cast to non-null type ge.bog.designsystem.components.bannerfeedback.BannerFeedbackView");
                        bVar = (C12892b) childAt;
                    } else {
                        bVar = null;
                    }
                    if (bVar != null) {
                        iBinder = bVar.getWindowToken();
                    }
                    if (iBinder != null) {
                        ViewCompat.m3592e(bVar).mo3469b(Utils.FLOAT_EPSILON).mo3479n(m48773g(bVar));
                    }
                }
            } catch (Exception e) {
                Log.e(C12902d.class.getClass().getSimpleName(), Log.getStackTraceString(e));
            }
        }

        /* renamed from: b */
        public final void mo33656b(C1483c cVar) {
            View view;
            ViewGroup viewGroup;
            C12892b bVar;
            IBinder iBinder;
            Window window;
            C41536l.m120489i(cVar, "dialogFragment");
            try {
                Dialog n1 = cVar.mo4579n1();
                if (n1 == null || (window = n1.getWindow()) == null) {
                    view = null;
                } else {
                    view = window.getDecorView();
                }
                if (view instanceof ViewGroup) {
                    viewGroup = (ViewGroup) view;
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    int childCount = viewGroup.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        if (viewGroup.getChildAt(i) instanceof C12892b) {
                            View childAt = viewGroup.getChildAt(i);
                            C41536l.m120487g(childAt, "null cannot be cast to non-null type ge.bog.designsystem.components.bannerfeedback.BannerFeedbackView");
                            bVar = (C12892b) childAt;
                        } else {
                            bVar = null;
                        }
                        if (bVar != null) {
                            iBinder = bVar.getWindowToken();
                        } else {
                            iBinder = null;
                        }
                        if (iBinder != null) {
                            ViewCompat.m3592e(bVar).mo3469b(Utils.FLOAT_EPSILON).mo3479n(m48773g(bVar));
                        }
                    }
                }
            } catch (Exception e) {
                Log.e(C12902d.class.getClass().getSimpleName(), Log.getStackTraceString(e));
            }
        }

        /* renamed from: c */
        public final C12902d mo33657c(Activity activity, boolean z) {
            C41536l.m120489i(activity, "activity");
            C12902d.f38100d = z;
            C12902d dVar = new C12902d();
            if (z) {
                mo33655a(activity);
            }
            C12902d.f38099c = new WeakReference(activity);
            dVar.f38101a = new C12892b(activity, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            return dVar;
        }

        /* renamed from: d */
        public final C12902d mo33658d(C1483c cVar, boolean z) {
            C41536l.m120489i(cVar, "dialogFragment");
            C12902d.f38100d = z;
            C12902d dVar = new C12902d();
            if (z) {
                mo33656b(cVar);
            }
            Context requireContext = cVar.requireContext();
            C41536l.m120488h(requireContext, "dialogFragment.requireContext()");
            dVar.f38101a = new C12892b(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            return dVar;
        }
    }

    /* renamed from: fh.d$b */
    public static abstract class C12905b {

        /* renamed from: fh.d$b$a */
        public static final class C12906a extends C12905b {

            /* renamed from: a */
            public static final C12906a f38103a = new C12906a();

            private C12906a() {
                super((DefaultConstructorMarker) null);
            }

            /* renamed from: a */
            public long mo33660a() {
                return 5000;
            }
        }

        /* renamed from: fh.d$b$b */
        public static final class C12907b extends C12905b {

            /* renamed from: a */
            public static final C12907b f38104a = new C12907b();

            private C12907b() {
                super((DefaultConstructorMarker) null);
            }

            /* renamed from: a */
            public long mo33660a() {
                return 1000;
            }
        }

        /* renamed from: fh.d$b$c */
        public static final class C12908c extends C12905b {

            /* renamed from: a */
            public static final C12908c f38105a = new C12908c();

            private C12908c() {
                super((DefaultConstructorMarker) null);
            }

            /* renamed from: a */
            public long mo33660a() {
                return 3000;
            }
        }

        /* renamed from: fh.d$b$d */
        public static final class C12909d extends C12905b {

            /* renamed from: a */
            public static final C12909d f38106a = new C12909d();

            private C12909d() {
                super((DefaultConstructorMarker) null);
            }

            /* renamed from: a */
            public long mo33660a() {
                return 8000;
            }
        }

        private C12905b() {
        }

        public /* synthetic */ C12905b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public abstract long mo33660a();
    }

    /* renamed from: e */
    private final LinearLayout m48758e(ViewGroup viewGroup) {
        Activity activity;
        LayoutInflater layoutInflater;
        WeakReference weakReference = f38099c;
        View view = null;
        if (!(weakReference == null || (activity = (Activity) weakReference.get()) == null || (layoutInflater = activity.getLayoutInflater()) == null)) {
            view = layoutInflater.inflate(C17783h.layout_feedbackmanager_container, (ViewGroup) null);
        }
        viewGroup.addView(view);
        View findViewById = viewGroup.findViewById(C17782g.f49791s3);
        C41536l.m120488h(findViewById, "decorView.findViewById(R.id.feedback_container)");
        return (LinearLayout) findViewById;
    }

    /* renamed from: f */
    public static final C12902d m48759f(Activity activity, boolean z) {
        return f38098b.mo33657c(activity, z);
    }

    /* renamed from: g */
    private final void m48760g(String str, C15278a aVar, C12905b bVar, ViewGroup viewGroup) {
        ViewParent viewParent;
        C12892b bVar2 = this.f38101a;
        if (bVar2 != null) {
            viewParent = bVar2.getParent();
        } else {
            viewParent = null;
        }
        if (viewParent == null) {
            C12892b bVar3 = this.f38101a;
            if (bVar3 != null) {
                if (bVar == null) {
                    if (aVar == C15278a.NEGATIVE) {
                        bVar = C12905b.C12906a.f38103a;
                    } else {
                        bVar = C12905b.C12908c.f38105a;
                    }
                }
                bVar3.mo33629h(str, aVar, bVar.mo33660a());
            }
            m48762i(viewGroup).addView(this.f38101a);
        }
    }

    /* renamed from: h */
    private final ViewGroup m48761h() {
        Activity activity;
        WeakReference weakReference = f38099c;
        if (weakReference == null || (activity = (Activity) weakReference.get()) == null) {
            return null;
        }
        View decorView = activity.getWindow().getDecorView();
        C41536l.m120487g(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) decorView;
    }

    /* renamed from: i */
    private final ViewGroup m48762i(ViewGroup viewGroup) {
        if (f38100d) {
            return viewGroup;
        }
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(C17782g.f49791s3);
        if (viewGroup2 == null) {
            return m48758e(viewGroup);
        }
        return viewGroup2;
    }

    /* renamed from: l */
    public static /* synthetic */ void m48763l(C12902d dVar, C1483c cVar, String str, C15278a aVar, C12905b bVar, int i, Object obj) {
        if ((i & 8) != 0) {
            bVar = null;
        }
        dVar.mo33651j(cVar, str, aVar, bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final void m48764m(C12902d dVar, String str, C15278a aVar, C12905b bVar) {
        C41536l.m120489i(dVar, "this$0");
        C41536l.m120489i(str, "$message");
        C41536l.m120489i(aVar, "$feedbackType");
        ViewGroup h = dVar.m48761h();
        if (h != null) {
            dVar.m48760g(str, aVar, bVar, h);
        }
    }

    /* renamed from: o */
    public static /* synthetic */ void m48765o(C12902d dVar, String str, C12905b bVar, int i, Object obj) {
        if ((i & 2) != 0) {
            bVar = null;
        }
        dVar.mo33653n(str, bVar);
    }

    /* renamed from: q */
    public static /* synthetic */ void m48766q(C12902d dVar, String str, C12905b bVar, int i, Object obj) {
        if ((i & 2) != 0) {
            bVar = null;
        }
        dVar.mo33654p(str, bVar);
    }

    /* renamed from: j */
    public final void mo33651j(C1483c cVar, String str, C15278a aVar, C12905b bVar) {
        KeyEvent.Callback callback;
        Window window;
        C41536l.m120489i(cVar, "dialogFragment");
        C41536l.m120489i(str, "message");
        C41536l.m120489i(aVar, "feedbackType");
        Dialog n1 = cVar.mo4579n1();
        ViewGroup viewGroup = null;
        if (n1 == null || (window = n1.getWindow()) == null) {
            callback = null;
        } else {
            callback = window.getDecorView();
        }
        if (callback instanceof ViewGroup) {
            viewGroup = (ViewGroup) callback;
        }
        if (viewGroup != null) {
            m48760g(str, aVar, bVar, viewGroup);
        }
    }

    /* renamed from: k */
    public final void mo33652k(String str, C15278a aVar, C12905b bVar) {
        Activity activity;
        C41536l.m120489i(str, "message");
        C41536l.m120489i(aVar, "feedbackType");
        WeakReference weakReference = f38099c;
        if (weakReference != null && (activity = (Activity) weakReference.get()) != null) {
            activity.runOnUiThread(new C12901c(this, str, aVar, bVar));
        }
    }

    /* renamed from: n */
    public final void mo33653n(String str, C12905b bVar) {
        C41536l.m120489i(str, "message");
        mo33652k(str, C15278a.INFO, bVar);
    }

    /* renamed from: p */
    public final void mo33654p(String str, C12905b bVar) {
        C41536l.m120489i(str, "message");
        mo33652k(str, C15278a.NEGATIVE, bVar);
    }
}
