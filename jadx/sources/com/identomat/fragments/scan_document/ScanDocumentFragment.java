package com.identomat.fragments.scan_document;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.C0173b;
import androidx.core.content.C0767a;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1629r;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import com.github.mikephil.charting.utils.Utils;
import com.identomat.activities.NavigationActivity;
import ef1.C40814h0;
import ef1.C40822j0;
import ef1.C40845o1;
import ef1.C40850p0;
import ef1.C40867u0;
import he1.C41217g;
import he1.C41222k;
import he1.C41224m;
import he1.C41228o;
import he1.C41238w;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe1.C41851b;
import oe1.C41853d;
import oe1.C41862l;
import p017b.C2105c;
import p163m0.C7047a;
import p228r0.C8034d;
import p345ad.C9786e;
import p345ad.C9793g;
import p345ad.C9796h;
import p345ad.C9800j;
import p345ad.C9801k;
import p373cd.C10394a;
import p388dd.C12073a;
import p388dd.C12074b;
import p402ed.C12425c;
import p472jd.C15753j;
import p485kc.C16346d;
import p485kc.C16347e;
import p541oc.C17164r;
import p555pc.C17336a;
import p569qc.C17485b;
import p625ud.C18110b;
import p625ud.C18112d;
import p664xc.C18685a;
import p664xc.C18686b;
import p664xc.C18687c;
import p664xc.C18688d;
import p664xc.C18689e;
import p664xc.C18690f;
import p664xc.C18691g;
import p664xc.C18692h;
import p664xc.C18693i;
import p678yc.C18877a;
import p692zc.C18999c;
import p692zc.C19002e;
import p692zc.C19005g;
import ue1.C43064a;
import ue1.C43079p;

public final class ScanDocumentFragment extends Fragment {

    /* renamed from: s */
    public static final C10618a f30162s = new C10618a((DefaultConstructorMarker) null);

    /* renamed from: t */
    private static final String[] f30163t = {"android.permission.CAMERA"};

    /* renamed from: d */
    private final C9786e f30164d;

    /* renamed from: e */
    private final C18877a f30165e;

    /* renamed from: f */
    private final String f30166f = "scan_document_page";
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C17164r f30167g;

    /* renamed from: h */
    private final C41217g f30168h;

    /* renamed from: i */
    private boolean f30169i;

    /* renamed from: j */
    private int f30170j;

    /* renamed from: k */
    private int f30171k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f30172l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f30173m;

    /* renamed from: n */
    private final int f30174n;

    /* renamed from: o */
    private final Handler f30175o;

    /* renamed from: p */
    private C40845o1 f30176p;

    /* renamed from: q */
    private C9800j f30177q;

    /* renamed from: r */
    private final C18112d f30178r;

    /* renamed from: com.identomat.fragments.scan_document.ScanDocumentFragment$a */
    public static final class C10618a {
        private C10618a() {
        }

        public /* synthetic */ C10618a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.identomat.fragments.scan_document.ScanDocumentFragment$b */
    static final class C10619b extends C41862l implements C43079p {

        /* renamed from: h */
        int f30179h;

        /* renamed from: i */
        final /* synthetic */ ScanDocumentFragment f30180i;

        /* renamed from: j */
        final /* synthetic */ Bitmap f30181j;

        /* renamed from: k */
        final /* synthetic */ int f30182k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10619b(ScanDocumentFragment scanDocumentFragment, Bitmap bitmap, int i, Continuation continuation) {
            super(2, continuation);
            this.f30180i = scanDocumentFragment;
            this.f30181j = bitmap;
            this.f30182k = i;
        }

        /* renamed from: a */
        public final Continuation mo3708a(Object obj, Continuation continuation) {
            return new C10619b(this.f30180i, this.f30181j, this.f30182k, continuation);
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            Object c = C41793d.m121157c();
            int i = this.f30179h;
            if (i == 0) {
                C41228o.m119483b(obj);
                this.f30179h = 1;
                if (this.f30180i.m38684U1(this.f30181j, (float) this.f30182k, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C41228o.m119483b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C41238w.f97225a;
        }

        /* renamed from: n */
        public final Object invoke(C40814h0 h0Var, Continuation continuation) {
            return ((C10619b) mo3708a(h0Var, continuation)).mo3709f(C41238w.f97225a);
        }
    }

    /* renamed from: com.identomat.fragments.scan_document.ScanDocumentFragment$c */
    static final class C10620c extends C41862l implements C43079p {

        /* renamed from: h */
        int f30183h;

        /* renamed from: i */
        final /* synthetic */ C9800j f30184i;

        /* renamed from: j */
        final /* synthetic */ ScanDocumentFragment f30185j;

        /* renamed from: com.identomat.fragments.scan_document.ScanDocumentFragment$c$a */
        static final class C10621a extends C41862l implements C43079p {

            /* renamed from: h */
            int f30186h;

            /* renamed from: i */
            final /* synthetic */ ScanDocumentFragment f30187i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10621a(ScanDocumentFragment scanDocumentFragment, Continuation continuation) {
                super(2, continuation);
                this.f30187i = scanDocumentFragment;
            }

            /* renamed from: a */
            public final Continuation mo3708a(Object obj, Continuation continuation) {
                return new C10621a(this.f30187i, continuation);
            }

            /* renamed from: f */
            public final Object mo3709f(Object obj) {
                Object c = C41793d.m121157c();
                int i = this.f30186h;
                if (i == 0) {
                    C41228o.m119483b(obj);
                    this.f30186h = 1;
                    if (C40850p0.m118424a(1000, this) == c) {
                        return c;
                    }
                } else if (i == 1) {
                    C41228o.m119483b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this.f30187i.f30172l = true;
                return C41238w.f97225a;
            }

            /* renamed from: n */
            public final Object invoke(C40814h0 h0Var, Continuation continuation) {
                return ((C10621a) mo3708a(h0Var, continuation)).mo3709f(C41238w.f97225a);
            }
        }

        /* renamed from: com.identomat.fragments.scan_document.ScanDocumentFragment$c$b */
        public /* synthetic */ class C10622b {

            /* renamed from: a */
            public static final /* synthetic */ int[] f30188a;

            static {
                int[] iArr = new int[C9801k.values().length];
                iArr[C9801k.SUCCESS.ordinal()] = 1;
                iArr[C9801k.SESSION_ENDED.ordinal()] = 2;
                f30188a = iArr;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10620c(C9800j jVar, ScanDocumentFragment scanDocumentFragment, Continuation continuation) {
            super(2, continuation);
            this.f30184i = jVar;
            this.f30185j = scanDocumentFragment;
        }

        /* renamed from: a */
        public final Continuation mo3708a(Object obj, Continuation continuation) {
            return new C10620c(this.f30184i, this.f30185j, continuation);
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            Object unused = C41793d.m121157c();
            if (this.f30183h == 0) {
                C41228o.m119483b(obj);
                int i = C10622b.f30188a[this.f30184i.mo26295c().ordinal()];
                if (i == 1) {
                    this.f30185j.m38691b2();
                } else if (i != 2) {
                    C40845o1 unused2 = C40821j.m118316b(C1629r.m5683a(this.f30185j), C40867u0.m118468b(), (C40822j0) null, new C10621a(this.f30185j, (Continuation) null), 2, (Object) null);
                } else {
                    C10394a.m37798b("identomat_", (String) null, 2, (Object) null);
                }
                return C41238w.f97225a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: n */
        public final Object invoke(C40814h0 h0Var, Continuation continuation) {
            return ((C10620c) mo3708a(h0Var, continuation)).mo3709f(C41238w.f97225a);
        }
    }

    /* renamed from: com.identomat.fragments.scan_document.ScanDocumentFragment$d */
    static final class C10623d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ScanDocumentFragment f30189d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10623d(ScanDocumentFragment scanDocumentFragment) {
            super(0);
            this.f30189d = scanDocumentFragment;
        }

        public final void invoke() {
            C17164r p1 = this.f30189d.f30167g;
            if (p1 != null) {
                int panelHeight = (int) p1.f48146i.getPanelHeight();
                C17164r p12 = this.f30189d.f30167g;
                if (p12 != null) {
                    p12.f48147j.getLayoutParams().height = panelHeight;
                    C17164r p13 = this.f30189d.f30167g;
                    if (p13 != null) {
                        p13.f48144g.getLayoutParams().height = panelHeight;
                        C17164r p14 = this.f30189d.f30167g;
                        if (p14 != null) {
                            ViewGroup.LayoutParams layoutParams = p14.f48152o.getLayoutParams();
                            C17164r p15 = this.f30189d.f30167g;
                            if (p15 != null) {
                                layoutParams.height = (int) p15.f48146i.getPanelTop();
                            } else {
                                C41536l.m120506z("binding");
                                throw null;
                            }
                        } else {
                            C41536l.m120506z("binding");
                            throw null;
                        }
                    } else {
                        C41536l.m120506z("binding");
                        throw null;
                    }
                } else {
                    C41536l.m120506z("binding");
                    throw null;
                }
            } else {
                C41536l.m120506z("binding");
                throw null;
            }
        }
    }

    /* renamed from: com.identomat.fragments.scan_document.ScanDocumentFragment$e */
    static final class C10624e extends C41853d {

        /* renamed from: g */
        Object f30190g;

        /* renamed from: h */
        /* synthetic */ Object f30191h;

        /* renamed from: i */
        final /* synthetic */ ScanDocumentFragment f30192i;

        /* renamed from: j */
        int f30193j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10624e(ScanDocumentFragment scanDocumentFragment, Continuation continuation) {
            super(continuation);
            this.f30192i = scanDocumentFragment;
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            this.f30191h = obj;
            this.f30193j |= Integer.MIN_VALUE;
            return this.f30192i.m38686W1((Bitmap) null, this);
        }
    }

    /* renamed from: com.identomat.fragments.scan_document.ScanDocumentFragment$f */
    static final class C10625f extends C41862l implements C43079p {

        /* renamed from: h */
        int f30194h;

        /* renamed from: i */
        final /* synthetic */ String f30195i;

        /* renamed from: j */
        final /* synthetic */ ScanDocumentFragment f30196j;

        /* renamed from: k */
        final /* synthetic */ int f30197k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10625f(String str, ScanDocumentFragment scanDocumentFragment, int i, Continuation continuation) {
            super(2, continuation);
            this.f30195i = str;
            this.f30196j = scanDocumentFragment;
            this.f30197k = i;
        }

        /* renamed from: a */
        public final Continuation mo3708a(Object obj, Continuation continuation) {
            return new C10625f(this.f30195i, this.f30196j, this.f30197k, continuation);
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            boolean z;
            Object unused = C41793d.m121157c();
            if (this.f30194h == 0) {
                C41228o.m119483b(obj);
                if (this.f30195i.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    C17164r p1 = this.f30196j.f30167g;
                    if (p1 != null) {
                        p1.f48150m.setVisibility(0);
                        C17164r p12 = this.f30196j.f30167g;
                        if (p12 != null) {
                            p12.f48150m.setText(this.f30196j.mo27320B1().mo46864d().mo47124d(this.f30196j.getContext(), this.f30195i));
                        } else {
                            C41536l.m120506z("binding");
                            throw null;
                        }
                    } else {
                        C41536l.m120506z("binding");
                        throw null;
                    }
                } else {
                    C17164r p13 = this.f30196j.f30167g;
                    if (p13 != null) {
                        p13.f48150m.setVisibility(8);
                    } else {
                        C41536l.m120506z("binding");
                        throw null;
                    }
                }
                int q1 = this.f30196j.f30173m;
                int i = this.f30197k;
                if (q1 == i) {
                    return C41238w.f97225a;
                }
                this.f30196j.f30173m = i;
                int i2 = this.f30197k;
                if (i2 == 0) {
                    C17164r p14 = this.f30196j.f30167g;
                    if (p14 != null) {
                        p14.f48148k.clearAnimation();
                        C17164r p15 = this.f30196j.f30167g;
                        if (p15 != null) {
                            p15.f48148k.setImageResource(C16346d.identomat_ic_arrow_down);
                            C17164r p16 = this.f30196j.f30167g;
                            if (p16 != null) {
                                p16.f48150m.setVisibility(8);
                            } else {
                                C41536l.m120506z("binding");
                                throw null;
                            }
                        } else {
                            C41536l.m120506z("binding");
                            throw null;
                        }
                    } else {
                        C41536l.m120506z("binding");
                        throw null;
                    }
                } else if (i2 == 1) {
                    C17164r p17 = this.f30196j.f30167g;
                    if (p17 != null) {
                        p17.f48148k.clearAnimation();
                        C17164r p18 = this.f30196j.f30167g;
                        if (p18 != null) {
                            p18.f48148k.setImageResource(C16346d.identomat_ic_loading_icon);
                            RotateAnimation rotateAnimation = new RotateAnimation(Utils.FLOAT_EPSILON, 360.0f, 1, 0.5f, 1, 0.5f);
                            rotateAnimation.setRepeatCount(-1);
                            rotateAnimation.setDuration(1000);
                            rotateAnimation.setInterpolator(new LinearInterpolator());
                            C17164r p19 = this.f30196j.f30167g;
                            if (p19 != null) {
                                p19.f48148k.startAnimation(rotateAnimation);
                            } else {
                                C41536l.m120506z("binding");
                                throw null;
                            }
                        } else {
                            C41536l.m120506z("binding");
                            throw null;
                        }
                    } else {
                        C41536l.m120506z("binding");
                        throw null;
                    }
                } else if (i2 == 2) {
                    C17164r p110 = this.f30196j.f30167g;
                    if (p110 != null) {
                        p110.f48148k.clearAnimation();
                        C17164r p111 = this.f30196j.f30167g;
                        if (p111 != null) {
                            p111.f48148k.setImageResource(C16346d.identomat_success_icon);
                            C17164r p112 = this.f30196j.f30167g;
                            if (p112 != null) {
                                p112.f48150m.setVisibility(8);
                            } else {
                                C41536l.m120506z("binding");
                                throw null;
                            }
                        } else {
                            C41536l.m120506z("binding");
                            throw null;
                        }
                    } else {
                        C41536l.m120506z("binding");
                        throw null;
                    }
                }
                return C41238w.f97225a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: n */
        public final Object invoke(C40814h0 h0Var, Continuation continuation) {
            return ((C10625f) mo3708a(h0Var, continuation)).mo3709f(C41238w.f97225a);
        }
    }

    /* renamed from: com.identomat.fragments.scan_document.ScanDocumentFragment$g */
    public static final class C10626g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f30198d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10626g(Fragment fragment) {
            super(0);
            this.f30198d = fragment;
        }

        public final Fragment invoke() {
            return this.f30198d;
        }
    }

    /* renamed from: com.identomat.fragments.scan_document.ScanDocumentFragment$h */
    public static final class C10627h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f30199d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10627h(C43064a aVar) {
            super(0);
            this.f30199d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f30199d.invoke();
        }
    }

    /* renamed from: com.identomat.fragments.scan_document.ScanDocumentFragment$i */
    public static final class C10628i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f30200d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10628i(C41217g gVar) {
            super(0);
            this.f30200d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f30200d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: com.identomat.fragments.scan_document.ScanDocumentFragment$j */
    public static final class C10629j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f30201d;

        /* renamed from: e */
        final /* synthetic */ C41217g f30202e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10629j(C43064a aVar, C41217g gVar) {
            super(0);
            this.f30201d = aVar;
            this.f30202e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f30201d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f30202e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: com.identomat.fragments.scan_document.ScanDocumentFragment$k */
    static final class C10630k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ScanDocumentFragment f30203d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10630k(ScanDocumentFragment scanDocumentFragment) {
            super(0);
            this.f30203d = scanDocumentFragment;
        }

        public final C1620q0.C1624b invoke() {
            return new C17485b(this.f30203d.mo27319A1(), (C9793g) null, (C9796h) null, 6, (DefaultConstructorMarker) null);
        }
    }

    public ScanDocumentFragment(C9786e eVar, C18877a aVar) {
        C41536l.m120489i(eVar, "api");
        C41536l.m120489i(aVar, "identomatConfig");
        this.f30164d = eVar;
        this.f30165e = aVar;
        C10630k kVar = new C10630k(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C10627h(new C10626g(this)));
        this.f30168h = C1514j0.m5374c(this, C41520a0.m120436b(C18693i.class), new C10628i(a), new C10629j((C43064a) null, a), kVar);
        this.f30174n = 20;
        this.f30175o = new Handler(Looper.getMainLooper());
        this.f30178r = new C18690f(this);
    }

    /* renamed from: C1 */
    private final C18693i m38666C1() {
        return (C18693i) this.f30168h.getValue();
    }

    /* renamed from: D1 */
    private final void m38667D1() {
        m38709y1();
        Bundle bundle = new Bundle();
        bundle.putInt("frame", C16347e.scanDocumentFragment);
        bundle.putBundle("bundle", getArguments());
        C8034d.m30522a(this).mo22123U();
        C8034d.m30522a(this).mo22119N(C16347e.cameraDenyFragment, bundle, NavigationActivity.f29874v.mo27261a());
    }

    /* renamed from: E1 */
    private final void m38668E1() {
        m38709y1();
        Bundle bundle = new Bundle();
        bundle.putInt("frame", C16347e.scanDocumentFragment);
        bundle.putBundle("bundle", getArguments());
        C8034d.m30522a(this).mo22123U();
        C8034d.m30522a(this).mo22119N(C16347e.retryFragment, bundle, NavigationActivity.f29874v.mo27261a());
    }

    /* renamed from: F1 */
    private final void m38669F1(C9800j jVar) {
        C40845o1 unused = C40821j.m118316b(C1629r.m5683a(this), C40867u0.m118469c(), (C40822j0) null, new C10620c(jVar, this, (Continuation) null), 2, (Object) null);
    }

    /* renamed from: G1 */
    private final void m38670G1() {
        boolean z;
        int i;
        Bundle arguments = getArguments();
        int i2 = 0;
        if (arguments == null) {
            z = false;
        } else {
            z = arguments.getBoolean("general");
        }
        this.f30169i = z;
        if (z) {
            i = this.f30165e.mo46866f().mo47134b();
        } else {
            i = this.f30165e.mo46866f().mo47133a();
        }
        this.f30170j = i;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            i2 = arguments2.getInt("doc_side");
        }
        this.f30171k = i2;
    }

    /* renamed from: H1 */
    private final void m38671H1() {
        if (m38708x1()) {
            m38690a2();
        } else if (getActivity() != null) {
            C0173b registerForActivityResult = registerForActivityResult(new C2105c(), new C18689e(this));
            C41536l.m120488h(registerForActivityResult, "registerForActivityResult(ActivityResultContracts.RequestPermission())\n                    { isGranted: Boolean ->\n                        if (isGranted) {\n                            startCamera()\n                        } else {\n                            goToCameraDeny()\n                            Log.i(TAG, \"Permissions not granted by the user.\")\n                        }\n                    }");
            registerForActivityResult.mo404a(f30163t[0]);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: I1 */
    public static final void m38672I1(ScanDocumentFragment scanDocumentFragment, boolean z) {
        C41536l.m120489i(scanDocumentFragment, "this$0");
        if (z) {
            scanDocumentFragment.m38690a2();
            return;
        }
        scanDocumentFragment.m38667D1();
        Log.i("identomat_", "Permissions not granted by the user.");
    }

    /* renamed from: J1 */
    private final void m38673J1() {
        C17164r rVar = this.f30167g;
        if (rVar != null) {
            rVar.f48146i.mo27337e(this.f30170j, this.f30165e.mo46863c().mo47056e());
            C17164r rVar2 = this.f30167g;
            if (rVar2 != null) {
                rVar2.f48146i.setSide(this.f30171k);
                C17164r rVar3 = this.f30167g;
                if (rVar3 != null) {
                    rVar3.f48146i.setOnMeasureCallBack(new C10623d(this));
                    m38674K1(this);
                    m38676M1(this);
                    m38675L1(this);
                    m38677N1(this);
                    Integer b = this.f30165e.mo46867g().mo47137b();
                    if (b != null) {
                        int intValue = b.intValue();
                        C19002e.C19003a aVar = C19002e.f53052q;
                        Resources resources = getResources();
                        C41536l.m120488h(resources, "resources");
                        aVar.mo47119e(intValue, resources);
                        return;
                    }
                    return;
                }
                C41536l.m120506z("binding");
                throw null;
            }
            C41536l.m120506z("binding");
            throw null;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    /* renamed from: K1 */
    private static final void m38674K1(ScanDocumentFragment scanDocumentFragment) {
        C19002e.C19003a aVar = C19002e.f53052q;
        C1505h activity = scanDocumentFragment.getActivity();
        C17164r rVar = scanDocumentFragment.f30167g;
        if (rVar != null) {
            ImageView imageView = rVar.f48142e;
            C41536l.m120488h(imageView, "binding.backButton");
            C17164r rVar2 = scanDocumentFragment.f30167g;
            if (rVar2 != null) {
                TextView textView = rVar2.f48143f;
                C41536l.m120488h(textView, "binding.backButtonTitleView");
                C19002e.C19003a.m64212c(aVar, activity, imageView, textView, false, scanDocumentFragment.f30165e, 8, (Object) null);
                return;
            }
            C41536l.m120506z("binding");
            throw null;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    /* renamed from: L1 */
    private static final void m38675L1(ScanDocumentFragment scanDocumentFragment) {
        C19002e.C19003a aVar = C19002e.f53052q;
        C17164r rVar = scanDocumentFragment.f30167g;
        if (rVar != null) {
            RelativeLayout relativeLayout = rVar.f48149l;
            C41536l.m120488h(relativeLayout, "binding.indicatorView");
            aVar.mo47120f(relativeLayout, scanDocumentFragment.f30165e.mo46861a().mo47100i().mo33033a());
            return;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    /* renamed from: M1 */
    private static final void m38676M1(ScanDocumentFragment scanDocumentFragment) {
        C18999c e = scanDocumentFragment.f30165e.mo46867g().mo47140e();
        C17164r rVar = scanDocumentFragment.f30167g;
        if (rVar != null) {
            TextView textView = rVar.f48152o;
            C41536l.m120488h(textView, "binding.titleView");
            e.mo47079g(textView, 0);
            C18999c e2 = scanDocumentFragment.f30165e.mo46867g().mo47140e();
            C17164r rVar2 = scanDocumentFragment.f30167g;
            if (rVar2 != null) {
                TextView textView2 = rVar2.f48150m;
                C41536l.m120488h(textView2, "binding.progressTextView");
                e2.mo47079g(textView2, 1);
                return;
            }
            C41536l.m120506z("binding");
            throw null;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    /* renamed from: N1 */
    private static final void m38677N1(ScanDocumentFragment scanDocumentFragment) {
        int i = scanDocumentFragment.f30170j;
        if (i == 3 || i == 4) {
            C17164r rVar = scanDocumentFragment.f30167g;
            if (rVar != null) {
                rVar.f48152o.setText(scanDocumentFragment.f30165e.mo46864d().mo47124d(scanDocumentFragment.getContext(), "passport_instructions"));
            } else {
                C41536l.m120506z("binding");
                throw null;
            }
        } else if (i == 6) {
            C17164r rVar2 = scanDocumentFragment.f30167g;
            if (rVar2 != null) {
                rVar2.f48152o.setText(scanDocumentFragment.f30165e.mo46864d().mo47124d(scanDocumentFragment.getContext(), "scan_inn"));
            } else {
                C41536l.m120506z("binding");
                throw null;
            }
        } else if (scanDocumentFragment.f30171k == 0) {
            C17164r rVar3 = scanDocumentFragment.f30167g;
            if (rVar3 != null) {
                rVar3.f48152o.setText(scanDocumentFragment.f30165e.mo46864d().mo47124d(scanDocumentFragment.getContext(), C41536l.m120497q(C17336a.f48645a.mo44744c(scanDocumentFragment.f30170j), "_front_instructions")));
            } else {
                C41536l.m120506z("binding");
                throw null;
            }
        } else {
            C17164r rVar4 = scanDocumentFragment.f30167g;
            if (rVar4 != null) {
                rVar4.f48152o.setText(scanDocumentFragment.f30165e.mo46864d().mo47124d(scanDocumentFragment.getContext(), C41536l.m120497q(C17336a.f48645a.mo44744c(scanDocumentFragment.f30170j), "_rear_instructions")));
            } else {
                C41536l.m120506z("binding");
                throw null;
            }
        }
    }

    /* renamed from: O1 */
    private final void m38678O1() {
        C19005g.C19006a aVar;
        m38709y1();
        if (!this.f30169i) {
            aVar = this.f30165e.mo46865e().mo47128d();
        } else {
            aVar = this.f30165e.mo46865e().mo47129e();
        }
        if (aVar.mo47132b() != -1) {
            C8034d.m30522a(this).mo22123U();
            C8034d.m30522a(this).mo22119N(aVar.mo47132b(), aVar.mo47131a(), NavigationActivity.f29874v.mo27261a());
        }
    }

    /* renamed from: P1 */
    private final void m38679P1() {
        m38666C1().mo46505gw().mo4819k(getViewLifecycleOwner(), new C18685a(this));
        m38666C1().mo46506hw().mo4819k(getViewLifecycleOwner(), new C18686b(this));
        m38666C1().mo46507iw().mo4819k(getViewLifecycleOwner(), new C18687c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: Q1 */
    public static final void m38680Q1(ScanDocumentFragment scanDocumentFragment, Integer num) {
        C41536l.m120489i(scanDocumentFragment, "this$0");
        C41536l.m120488h(num, "it");
        scanDocumentFragment.m38687X1(num.intValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: R1 */
    public static final void m38681R1(ScanDocumentFragment scanDocumentFragment, C41224m mVar) {
        C41536l.m120489i(scanDocumentFragment, "this$0");
        scanDocumentFragment.m38689Z1((String) mVar.mo95678e(), ((Number) mVar.mo95680f()).intValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: S1 */
    public static final void m38682S1(ScanDocumentFragment scanDocumentFragment, Integer num) {
        C41536l.m120489i(scanDocumentFragment, "this$0");
        C41536l.m120488h(num, "it");
        if (num.intValue() >= scanDocumentFragment.f30174n) {
            scanDocumentFragment.m38668E1();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: T1 */
    public static final void m38683T1(ScanDocumentFragment scanDocumentFragment) {
        C41536l.m120489i(scanDocumentFragment, "this$0");
        scanDocumentFragment.f30172l = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: U1 */
    public final Object m38684U1(Bitmap bitmap, float f, Continuation continuation) {
        Integer num;
        Integer num2;
        if (getContext() == null) {
            return C41238w.f97225a;
        }
        C12074b bVar = C12074b.f35484a;
        Bitmap f2 = bVar.mo32224f(bitmap, f);
        StringBuilder sb = new StringBuilder();
        sb.append("original width: ");
        if (f2 == null) {
            num = null;
        } else {
            num = C41851b.m121256c(f2.getWidth());
        }
        sb.append(num);
        sb.append(' ');
        if (f2 == null) {
            num2 = null;
        } else {
            num2 = C41851b.m121256c(f2.getHeight());
        }
        sb.append(num2);
        Log.i("identomat_", sb.toString());
        C17164r rVar = this.f30167g;
        if (rVar != null) {
            Object W1 = m38686W1(bVar.mo32221c(f2, rVar.f48146i.getPanelAspect()), continuation);
            if (W1 == C41793d.m121157c()) {
                return W1;
            }
            return C41238w.f97225a;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    /* renamed from: V1 */
    private final void m38685V1() {
        m38709y1();
        Bundle bundle = new Bundle();
        bundle.putInt("doc_side", 1);
        C8034d.m30522a(this).mo22123U();
        C8034d.m30522a(this).mo22119N(C16347e.scanDocumentFragment, bundle, NavigationActivity.f29874v.mo27261a());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: W1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m38686W1(android.graphics.Bitmap r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.identomat.fragments.scan_document.ScanDocumentFragment.C10624e
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.identomat.fragments.scan_document.ScanDocumentFragment$e r0 = (com.identomat.fragments.scan_document.ScanDocumentFragment.C10624e) r0
            int r1 = r0.f30193j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f30193j = r1
            goto L_0x0018
        L_0x0013:
            com.identomat.fragments.scan_document.ScanDocumentFragment$e r0 = new com.identomat.fragments.scan_document.ScanDocumentFragment$e
            r0.<init>(r7, r9)
        L_0x0018:
            r6 = r0
            java.lang.Object r9 = r6.f30191h
            java.lang.Object r0 = ne1.C41793d.m121157c()
            int r1 = r6.f30193j
            r2 = 1
            if (r1 == 0) goto L_0x0036
            if (r1 != r2) goto L_0x002e
            java.lang.Object r8 = r6.f30190g
            com.identomat.fragments.scan_document.ScanDocumentFragment r8 = (com.identomat.fragments.scan_document.ScanDocumentFragment) r8
            he1.C41228o.m119483b(r9)
            goto L_0x0064
        L_0x002e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0036:
            he1.C41228o.m119483b(r9)
            if (r8 != 0) goto L_0x0047
            java.lang.String r8 = "identomat_"
            java.lang.String r9 = "bitmap is null"
            android.util.Log.i(r8, r9)
            r7.f30172l = r2
            he1.w r8 = he1.C41238w.f97225a
            return r8
        L_0x0047:
            android.content.Context r9 = r7.getContext()
            if (r9 != 0) goto L_0x004e
            goto L_0x007e
        L_0x004e:
            xc.i r1 = r7.m38666C1()
            int r4 = r7.f30170j
            int r5 = r7.f30171k
            r6.f30190g = r7
            r6.f30193j = r2
            r2 = r9
            r3 = r8
            java.lang.Object r9 = r1.mo46509lw(r2, r3, r4, r5, r6)
            if (r9 != r0) goto L_0x0063
            return r0
        L_0x0063:
            r8 = r7
        L_0x0064:
            ad.j r9 = (p345ad.C9800j) r9
            androidx.lifecycle.j r0 = r8.getLifecycle()
            androidx.lifecycle.j$b r0 = r0.mo4907b()
            androidx.lifecycle.j$b r1 = androidx.lifecycle.C1593j.C1598b.RESUMED
            boolean r0 = r0.mo4914b(r1)
            if (r0 != 0) goto L_0x007b
            r8.f30177q = r9
            he1.w r8 = he1.C41238w.f97225a
            return r8
        L_0x007b:
            r8.m38669F1(r9)
        L_0x007e:
            he1.w r8 = he1.C41238w.f97225a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.identomat.fragments.scan_document.ScanDocumentFragment.m38686W1(android.graphics.Bitmap, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: X1 */
    private final void m38687X1(int i) {
        this.f30175o.post(new C18691g(this, i));
    }

    /* access modifiers changed from: private */
    /* renamed from: Y1 */
    public static final void m38688Y1(ScanDocumentFragment scanDocumentFragment, int i) {
        C41536l.m120489i(scanDocumentFragment, "this$0");
        C17164r rVar = scanDocumentFragment.f30167g;
        if (rVar != null) {
            rVar.f48146i.setStrokeColor(i);
        } else {
            C41536l.m120506z("binding");
            throw null;
        }
    }

    /* renamed from: Z1 */
    private final void m38689Z1(String str, int i) {
        C40845o1 unused = C40821j.m118316b(C1629r.m5683a(this), C40867u0.m118469c(), (C40822j0) null, new C10625f(str, this, i, (Continuation) null), 2, (Object) null);
    }

    /* renamed from: a2 */
    private final void m38690a2() {
        m38666C1().mo46506hw().mo4823o(new C41224m("", 1));
        C17164r rVar = this.f30167g;
        if (rVar != null) {
            rVar.f48144g.setLifecycleOwner(this);
            C17164r rVar2 = this.f30167g;
            if (rVar2 != null) {
                rVar2.f48144g.setMode(C15753j.VIDEO);
                C17164r rVar3 = this.f30167g;
                if (rVar3 != null) {
                    rVar3.f48144g.setFrameProcessingFormat(35);
                    C17164r rVar4 = this.f30167g;
                    if (rVar4 != null) {
                        rVar4.f48144g.mo29426u();
                        C17164r rVar5 = this.f30167g;
                        if (rVar5 != null) {
                            rVar5.f48144g.mo29378q(this.f30178r);
                        } else {
                            C41536l.m120506z("binding");
                            throw null;
                        }
                    } else {
                        C41536l.m120506z("binding");
                        throw null;
                    }
                } else {
                    C41536l.m120506z("binding");
                    throw null;
                }
            } else {
                C41536l.m120506z("binding");
                throw null;
            }
        } else {
            C41536l.m120506z("binding");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b2 */
    public final void m38691b2() {
        Context context = getContext();
        if (context != null) {
            C12425c.f37092a.mo33032b(context);
        }
        this.f30175o.postDelayed(new C18692h(this), 500);
    }

    /* access modifiers changed from: private */
    /* renamed from: c2 */
    public static final void m38692c2(ScanDocumentFragment scanDocumentFragment) {
        C41536l.m120489i(scanDocumentFragment, "this$0");
        if (scanDocumentFragment.f30171k != 0 || !C17336a.f48645a.mo44746e(scanDocumentFragment.f30170j)) {
            scanDocumentFragment.m38678O1();
        } else {
            scanDocumentFragment.m38685V1();
        }
    }

    /* renamed from: x1 */
    private final boolean m38708x1() {
        Integer num;
        String[] strArr = f30163t;
        int length = strArr.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                return true;
            }
            String str = strArr[i];
            C1505h activity = getActivity();
            if (activity == null) {
                num = null;
            } else {
                num = Integer.valueOf(C0767a.m2891a(activity, str));
            }
            if (num == null || num.intValue() != 0) {
                z = false;
            }
            if (!z) {
                return false;
            }
            i++;
        }
    }

    /* renamed from: y1 */
    private final void m38709y1() {
        Log.i("identomat_", "destroy");
        try {
            this.f30172l = false;
            C17164r rVar = this.f30167g;
            if (rVar != null) {
                rVar.f48144g.mo29426u();
            } else {
                C41536l.m120506z("binding");
                throw null;
            }
        } catch (Exception e) {
            Log.i("identomat_", C41536l.m120497q("onDestroy: ", e.getMessage()));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z1 */
    public static final void m38710z1(ScanDocumentFragment scanDocumentFragment, C18110b bVar) {
        C41536l.m120489i(scanDocumentFragment, "this$0");
        C41536l.m120489i(bVar, "frame");
        if (scanDocumentFragment.f30172l) {
            scanDocumentFragment.f30172l = false;
            C40845o1 o1Var = scanDocumentFragment.f30176p;
            if (o1Var == null || !o1Var.mo95131k()) {
                if (!scanDocumentFragment.m38708x1()) {
                    C8034d.m30522a(scanDocumentFragment).mo22123U();
                }
                int e = bVar.mo45793e();
                bVar.mo45790b();
                try {
                    scanDocumentFragment.f30176p = C40821j.m118316b(C1629r.m5683a(scanDocumentFragment), C40867u0.m118468b(), (C40822j0) null, new C10619b(scanDocumentFragment, C12073a.f35481a.mo32216a(bVar), e, (Continuation) null), 2, (Object) null);
                } catch (Exception e2) {
                    String message = e2.getMessage();
                    if (message != null) {
                        Log.i("identomat_", message);
                    }
                }
                bVar.mo45797i();
            }
        }
    }

    /* renamed from: A1 */
    public final C9786e mo27319A1() {
        return this.f30164d;
    }

    /* renamed from: B1 */
    public final C18877a mo27320B1() {
        return this.f30165e;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        C17164r d = C17164r.m60309d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f30167g = d;
        m38670G1();
        m38673J1();
        m38679P1();
        m38671H1();
        C17164r rVar = this.f30167g;
        if (rVar != null) {
            RelativeLayout c = rVar.mo3946b();
            C41536l.m120488h(c, "binding.root");
            return c;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    public void onDestroy() {
        m38709y1();
        super.onDestroy();
    }

    public void onPause() {
        this.f30175o.removeCallbacksAndMessages((Object) null);
        this.f30172l = false;
        super.onPause();
    }

    public void onResume() {
        boolean z;
        super.onResume();
        m38666C1().mo46508jw();
        this.f30164d.mo26255q(getContext(), this.f30166f);
        C9800j jVar = this.f30177q;
        boolean z2 = true;
        if (jVar == null) {
            z = false;
        } else {
            m38669F1(jVar);
            this.f30177q = null;
            z = true;
        }
        C40845o1 o1Var = this.f30176p;
        if (o1Var != null) {
            if (!o1Var.mo95131k()) {
                z2 = z;
            }
            z = z2;
        }
        if (!z) {
            this.f30175o.postDelayed(new C18688d(this), 2000);
        }
    }
}
