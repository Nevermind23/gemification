package com.identomat.fragments.face_document;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
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
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
import p374ce.C10396b;
import p388dd.C12073a;
import p388dd.C12074b;
import p402ed.C12425c;
import p472jd.C15753j;
import p485kc.C16346d;
import p485kc.C16347e;
import p541oc.C17156j;
import p569qc.C17485b;
import p611tc.C17914a;
import p611tc.C17915b;
import p611tc.C17916c;
import p611tc.C17917d;
import p611tc.C17918e;
import p611tc.C17919f;
import p611tc.C17920g;
import p611tc.C17921h;
import p611tc.C17922i;
import p611tc.C17923j;
import p625ud.C18110b;
import p625ud.C18112d;
import p678yc.C18877a;
import p692zc.C18999c;
import p692zc.C19002e;
import p692zc.C19005g;
import ue1.C43064a;
import ue1.C43079p;

public final class FaceDocumentFragment extends Fragment {

    /* renamed from: q */
    public static final C10547a f29956q = new C10547a((DefaultConstructorMarker) null);

    /* renamed from: r */
    private static final String[] f29957r = {"android.permission.CAMERA"};

    /* renamed from: d */
    private final C9786e f29958d;

    /* renamed from: e */
    private final C18877a f29959e;

    /* renamed from: f */
    private final String f29960f = "hold_document_page";

    /* renamed from: g */
    private C17156j f29961g;

    /* renamed from: h */
    private final C41217g f29962h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f29963i;

    /* renamed from: j */
    private int f29964j;

    /* renamed from: k */
    private final int f29965k;

    /* renamed from: l */
    private C40845o1 f29966l;

    /* renamed from: m */
    private C9800j f29967m;

    /* renamed from: n */
    private Context f29968n;

    /* renamed from: o */
    private final Handler f29969o;

    /* renamed from: p */
    private final C18112d f29970p;

    /* renamed from: com.identomat.fragments.face_document.FaceDocumentFragment$a */
    public static final class C10547a {
        private C10547a() {
        }

        public /* synthetic */ C10547a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.identomat.fragments.face_document.FaceDocumentFragment$b */
    static final class C10548b extends C41862l implements C43079p {

        /* renamed from: h */
        int f29971h;

        /* renamed from: i */
        final /* synthetic */ FaceDocumentFragment f29972i;

        /* renamed from: j */
        final /* synthetic */ Bitmap f29973j;

        /* renamed from: k */
        final /* synthetic */ int f29974k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10548b(FaceDocumentFragment faceDocumentFragment, Bitmap bitmap, int i, Continuation continuation) {
            super(2, continuation);
            this.f29972i = faceDocumentFragment;
            this.f29973j = bitmap;
            this.f29974k = i;
        }

        /* renamed from: a */
        public final Continuation mo3708a(Object obj, Continuation continuation) {
            return new C10548b(this.f29972i, this.f29973j, this.f29974k, continuation);
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            Object c = C41793d.m121157c();
            int i = this.f29971h;
            if (i == 0) {
                C41228o.m119483b(obj);
                this.f29971h = 1;
                if (this.f29972i.m38340Q1(this.f29973j, (float) this.f29974k, this) == c) {
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
            return ((C10548b) mo3708a(h0Var, continuation)).mo3709f(C41238w.f97225a);
        }
    }

    /* renamed from: com.identomat.fragments.face_document.FaceDocumentFragment$c */
    static final class C10549c extends C41862l implements C43079p {

        /* renamed from: h */
        int f29975h;

        /* renamed from: i */
        final /* synthetic */ C9800j f29976i;

        /* renamed from: j */
        final /* synthetic */ FaceDocumentFragment f29977j;

        /* renamed from: com.identomat.fragments.face_document.FaceDocumentFragment$c$a */
        static final class C10550a extends C41862l implements C43079p {

            /* renamed from: h */
            int f29978h;

            /* renamed from: i */
            final /* synthetic */ FaceDocumentFragment f29979i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10550a(FaceDocumentFragment faceDocumentFragment, Continuation continuation) {
                super(2, continuation);
                this.f29979i = faceDocumentFragment;
            }

            /* renamed from: a */
            public final Continuation mo3708a(Object obj, Continuation continuation) {
                return new C10550a(this.f29979i, continuation);
            }

            /* renamed from: f */
            public final Object mo3709f(Object obj) {
                Object c = C41793d.m121157c();
                int i = this.f29978h;
                if (i == 0) {
                    C41228o.m119483b(obj);
                    this.f29978h = 1;
                    if (C40850p0.m118424a(1000, this) == c) {
                        return c;
                    }
                } else if (i == 1) {
                    C41228o.m119483b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this.f29979i.f29963i = true;
                return C41238w.f97225a;
            }

            /* renamed from: n */
            public final Object invoke(C40814h0 h0Var, Continuation continuation) {
                return ((C10550a) mo3708a(h0Var, continuation)).mo3709f(C41238w.f97225a);
            }
        }

        /* renamed from: com.identomat.fragments.face_document.FaceDocumentFragment$c$b */
        public /* synthetic */ class C10551b {

            /* renamed from: a */
            public static final /* synthetic */ int[] f29980a;

            static {
                int[] iArr = new int[C9801k.values().length];
                iArr[C9801k.SUCCESS.ordinal()] = 1;
                iArr[C9801k.SESSION_ENDED.ordinal()] = 2;
                f29980a = iArr;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10549c(C9800j jVar, FaceDocumentFragment faceDocumentFragment, Continuation continuation) {
            super(2, continuation);
            this.f29976i = jVar;
            this.f29977j = faceDocumentFragment;
        }

        /* renamed from: a */
        public final Continuation mo3708a(Object obj, Continuation continuation) {
            return new C10549c(this.f29976i, this.f29977j, continuation);
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            Object unused = C41793d.m121157c();
            if (this.f29975h == 0) {
                C41228o.m119483b(obj);
                int i = C10551b.f29980a[this.f29976i.mo26295c().ordinal()];
                if (i == 1) {
                    this.f29977j.m38346W1();
                } else if (i != 2) {
                    C40845o1 unused2 = C40821j.m118316b(C1629r.m5683a(this.f29977j), C40867u0.m118468b(), (C40822j0) null, new C10550a(this.f29977j, (Continuation) null), 2, (Object) null);
                } else {
                    C10394a.m37798b("identomat_", (String) null, 2, (Object) null);
                }
                return C41238w.f97225a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: n */
        public final Object invoke(C40814h0 h0Var, Continuation continuation) {
            return ((C10549c) mo3708a(h0Var, continuation)).mo3709f(C41238w.f97225a);
        }
    }

    /* renamed from: com.identomat.fragments.face_document.FaceDocumentFragment$d */
    static final class C10552d extends C41853d {

        /* renamed from: g */
        Object f29981g;

        /* renamed from: h */
        /* synthetic */ Object f29982h;

        /* renamed from: i */
        final /* synthetic */ FaceDocumentFragment f29983i;

        /* renamed from: j */
        int f29984j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10552d(FaceDocumentFragment faceDocumentFragment, Continuation continuation) {
            super(continuation);
            this.f29983i = faceDocumentFragment;
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            this.f29982h = obj;
            this.f29984j |= Integer.MIN_VALUE;
            return this.f29983i.m38341R1((Bitmap) null, this);
        }
    }

    /* renamed from: com.identomat.fragments.face_document.FaceDocumentFragment$e */
    public static final class C10553e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f29985d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10553e(Fragment fragment) {
            super(0);
            this.f29985d = fragment;
        }

        public final Fragment invoke() {
            return this.f29985d;
        }
    }

    /* renamed from: com.identomat.fragments.face_document.FaceDocumentFragment$f */
    public static final class C10554f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f29986d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10554f(C43064a aVar) {
            super(0);
            this.f29986d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f29986d.invoke();
        }
    }

    /* renamed from: com.identomat.fragments.face_document.FaceDocumentFragment$g */
    public static final class C10555g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f29987d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10555g(C41217g gVar) {
            super(0);
            this.f29987d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f29987d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: com.identomat.fragments.face_document.FaceDocumentFragment$h */
    public static final class C10556h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f29988d;

        /* renamed from: e */
        final /* synthetic */ C41217g f29989e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10556h(C43064a aVar, C41217g gVar) {
            super(0);
            this.f29988d = aVar;
            this.f29989e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f29988d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f29989e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: com.identomat.fragments.face_document.FaceDocumentFragment$i */
    public static final class C10557i implements Comparator {
        public final int compare(Object obj, Object obj2) {
            return C41506d.m120406e(Integer.valueOf(((C10396b) obj).mo27062e()), Integer.valueOf(((C10396b) obj2).mo27062e()));
        }
    }

    /* renamed from: com.identomat.fragments.face_document.FaceDocumentFragment$j */
    static final class C10558j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ FaceDocumentFragment f29990d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10558j(FaceDocumentFragment faceDocumentFragment) {
            super(0);
            this.f29990d = faceDocumentFragment;
        }

        public final C1620q0.C1624b invoke() {
            return new C17485b(this.f29990d.mo27277y1(), (C9793g) null, (C9796h) null, 6, (DefaultConstructorMarker) null);
        }
    }

    public FaceDocumentFragment(C9786e eVar, C18877a aVar) {
        C41536l.m120489i(eVar, "api");
        C41536l.m120489i(aVar, "identomatConfig");
        this.f29958d = eVar;
        this.f29959e = aVar;
        C10558j jVar = new C10558j(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C10554f(new C10553e(this)));
        this.f29962h = C1514j0.m5374c(this, C41520a0.m120436b(C17923j.class), new C10555g(a), new C10556h((C43064a) null, a), jVar);
        this.f29965k = 20;
        this.f29969o = new Handler(Looper.getMainLooper());
        this.f29970p = new C17919f(this);
    }

    /* renamed from: A1 */
    private final C17923j m38324A1() {
        return (C17923j) this.f29962h.getValue();
    }

    /* renamed from: B1 */
    private final void m38325B1() {
        m38362v1();
        Bundle bundle = new Bundle();
        bundle.putInt("frame", C16347e.scanDocumentFragment);
        bundle.putBundle("bundle", getArguments());
        C8034d.m30522a(this).mo22123U();
        C8034d.m30522a(this).mo22119N(C16347e.cameraDenyFragment, bundle, NavigationActivity.f29874v.mo27261a());
    }

    /* renamed from: C1 */
    private final void m38326C1() {
        m38362v1();
        Bundle bundle = new Bundle();
        bundle.putInt("frame", C16347e.holdDocumentFragment);
        bundle.putBundle("bundle", getArguments());
        C8034d.m30522a(this).mo22123U();
        C8034d.m30522a(this).mo22119N(C16347e.retryFragment, bundle, NavigationActivity.f29874v.mo27261a());
    }

    /* renamed from: D1 */
    private final void m38327D1(C9800j jVar) {
        C40845o1 unused = C40821j.m118316b(C1629r.m5683a(this), C40867u0.m118469c(), (C40822j0) null, new C10549c(jVar, this, (Continuation) null), 2, (Object) null);
    }

    /* renamed from: E1 */
    private final void m38328E1() {
        if (m38361u1()) {
            m38344U1();
        } else if (getActivity() != null) {
            C0173b registerForActivityResult = registerForActivityResult(new C2105c(), new C17914a(this));
            C41536l.m120488h(registerForActivityResult, "registerForActivityResult(ActivityResultContracts.RequestPermission())\n                    { isGranted: Boolean ->\n                        if (isGranted) {\n                            startCamera()\n                        } else {\n                            goToCameraDeny()\n                        }\n                    }");
            registerForActivityResult.mo404a(f29957r[0]);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F1 */
    public static final void m38329F1(FaceDocumentFragment faceDocumentFragment, boolean z) {
        C41536l.m120489i(faceDocumentFragment, "this$0");
        if (z) {
            faceDocumentFragment.m38344U1();
        } else {
            faceDocumentFragment.m38325B1();
        }
    }

    /* renamed from: G1 */
    private final void m38330G1() {
        m38333J1(this);
        m38332I1(this);
        m38331H1(this);
    }

    /* renamed from: H1 */
    private static final void m38331H1(FaceDocumentFragment faceDocumentFragment) {
        C19002e.C19003a aVar = C19002e.f53052q;
        C1505h activity = faceDocumentFragment.getActivity();
        C17156j jVar = faceDocumentFragment.f29961g;
        if (jVar != null) {
            ImageView imageView = jVar.f48062e;
            C41536l.m120488h(imageView, "binding.backButton");
            C17156j jVar2 = faceDocumentFragment.f29961g;
            if (jVar2 != null) {
                TextView textView = jVar2.f48063f;
                C41536l.m120488h(textView, "binding.backButtonTitleView");
                C19002e.C19003a.m64212c(aVar, activity, imageView, textView, false, faceDocumentFragment.f29959e, 8, (Object) null);
                return;
            }
            C41536l.m120506z("binding");
            throw null;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    /* renamed from: I1 */
    private static final void m38332I1(FaceDocumentFragment faceDocumentFragment) {
        C17156j jVar = faceDocumentFragment.f29961g;
        if (jVar != null) {
            jVar.mo3946b().setBackgroundColor(faceDocumentFragment.f29959e.mo46861a().mo47093b().mo33033a());
            C19002e.C19003a aVar = C19002e.f53052q;
            C17156j jVar2 = faceDocumentFragment.f29961g;
            if (jVar2 != null) {
                RelativeLayout relativeLayout = jVar2.f48068k;
                C41536l.m120488h(relativeLayout, "binding.indicatorView");
                aVar.mo47120f(relativeLayout, faceDocumentFragment.f29959e.mo46861a().mo47100i().mo33033a());
                return;
            }
            C41536l.m120506z("binding");
            throw null;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    /* renamed from: J1 */
    private static final void m38333J1(FaceDocumentFragment faceDocumentFragment) {
        C18999c e = faceDocumentFragment.f29959e.mo46867g().mo47140e();
        C17156j jVar = faceDocumentFragment.f29961g;
        if (jVar != null) {
            TextView textView = jVar.f48069l;
            C41536l.m120488h(textView, "binding.progressTextView");
            e.mo47079g(textView, 1);
            return;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    /* renamed from: K1 */
    private final void m38334K1() {
        m38362v1();
        C19005g.C19006a c = this.f29959e.mo46865e().mo47127c();
        if (c.mo47132b() != -1) {
            C8034d.m30522a(this).mo22123U();
            C8034d.m30522a(this).mo22119N(c.mo47132b(), c.mo47131a(), NavigationActivity.f29874v.mo27261a());
        }
    }

    /* renamed from: L1 */
    private final void m38335L1() {
        m38324A1().mo45585ew().mo4819k(getViewLifecycleOwner(), new C17915b());
        m38324A1().mo45586fw().mo4819k(getViewLifecycleOwner(), new C17916c(this));
        m38324A1().mo45587gw().mo4819k(getViewLifecycleOwner(), new C17917d(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: M1 */
    public static final void m38336M1(Integer num) {
    }

    /* access modifiers changed from: private */
    /* renamed from: N1 */
    public static final void m38337N1(FaceDocumentFragment faceDocumentFragment, C41224m mVar) {
        C41536l.m120489i(faceDocumentFragment, "this$0");
        faceDocumentFragment.m38342S1((String) mVar.mo95678e(), ((Number) mVar.mo95680f()).intValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: O1 */
    public static final void m38338O1(FaceDocumentFragment faceDocumentFragment, Integer num) {
        C41536l.m120489i(faceDocumentFragment, "this$0");
        C41536l.m120488h(num, "it");
        if (num.intValue() >= faceDocumentFragment.f29965k) {
            faceDocumentFragment.m38326C1();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P1 */
    public static final void m38339P1(FaceDocumentFragment faceDocumentFragment) {
        C41536l.m120489i(faceDocumentFragment, "this$0");
        faceDocumentFragment.f29963i = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: Q1 */
    public final Object m38340Q1(Bitmap bitmap, float f, Continuation continuation) {
        if (getContext() == null) {
            return C41238w.f97225a;
        }
        m38342S1("", 1);
        C12074b bVar = C12074b.f35484a;
        Bitmap f2 = bVar.mo32224f(bitmap, f);
        Context context = this.f29968n;
        if (context != null) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            Object R1 = m38341R1(bVar.mo32223e(bVar.mo32222d(f2, ((float) displayMetrics.heightPixels) / ((float) displayMetrics.widthPixels)), 1000), continuation);
            if (R1 == C41793d.m121157c()) {
                return R1;
            }
            return C41238w.f97225a;
        }
        C41536l.m120506z("fragmentContext");
        throw null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: R1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m38341R1(android.graphics.Bitmap r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.identomat.fragments.face_document.FaceDocumentFragment.C10552d
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.identomat.fragments.face_document.FaceDocumentFragment$d r0 = (com.identomat.fragments.face_document.FaceDocumentFragment.C10552d) r0
            int r1 = r0.f29984j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f29984j = r1
            goto L_0x0018
        L_0x0013:
            com.identomat.fragments.face_document.FaceDocumentFragment$d r0 = new com.identomat.fragments.face_document.FaceDocumentFragment$d
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f29982h
            java.lang.Object r1 = ne1.C41793d.m121157c()
            int r2 = r0.f29984j
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r5 = r0.f29981g
            com.identomat.fragments.face_document.FaceDocumentFragment r5 = (com.identomat.fragments.face_document.FaceDocumentFragment) r5
            he1.C41228o.m119483b(r6)
            goto L_0x005d
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            he1.C41228o.m119483b(r6)
            if (r5 != 0) goto L_0x0046
            java.lang.String r5 = "identomat_"
            java.lang.String r6 = "bitmap is null"
            android.util.Log.i(r5, r6)
            r4.f29963i = r3
            he1.w r5 = he1.C41238w.f97225a
            return r5
        L_0x0046:
            android.content.Context r6 = r4.getContext()
            if (r6 != 0) goto L_0x004d
            goto L_0x0077
        L_0x004d:
            tc.j r2 = r4.m38324A1()
            r0.f29981g = r4
            r0.f29984j = r3
            java.lang.Object r6 = r2.mo45589iw(r6, r5, r0)
            if (r6 != r1) goto L_0x005c
            return r1
        L_0x005c:
            r5 = r4
        L_0x005d:
            ad.j r6 = (p345ad.C9800j) r6
            androidx.lifecycle.j r0 = r5.getLifecycle()
            androidx.lifecycle.j$b r0 = r0.mo4907b()
            androidx.lifecycle.j$b r1 = androidx.lifecycle.C1593j.C1598b.RESUMED
            boolean r0 = r0.mo4914b(r1)
            if (r0 != 0) goto L_0x0074
            r5.f29967m = r6
            he1.w r5 = he1.C41238w.f97225a
            return r5
        L_0x0074:
            r5.m38327D1(r6)
        L_0x0077:
            he1.w r5 = he1.C41238w.f97225a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.identomat.fragments.face_document.FaceDocumentFragment.m38341R1(android.graphics.Bitmap, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: S1 */
    private final void m38342S1(String str, int i) {
        this.f29969o.post(new C17920g(str, this, i));
    }

    /* access modifiers changed from: private */
    /* renamed from: T1 */
    public static final void m38343T1(String str, FaceDocumentFragment faceDocumentFragment, int i) {
        boolean z;
        C41536l.m120489i(str, "$text");
        C41536l.m120489i(faceDocumentFragment, "this$0");
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C17156j jVar = faceDocumentFragment.f29961g;
            if (jVar != null) {
                jVar.f48069l.setVisibility(0);
                C17156j jVar2 = faceDocumentFragment.f29961g;
                if (jVar2 != null) {
                    jVar2.f48069l.setText(faceDocumentFragment.mo27278z1().mo46864d().mo47124d(faceDocumentFragment.getContext(), str));
                } else {
                    C41536l.m120506z("binding");
                    throw null;
                }
            } else {
                C41536l.m120506z("binding");
                throw null;
            }
        }
        if (faceDocumentFragment.f29964j != i) {
            faceDocumentFragment.f29964j = i;
            if (i == 0) {
                C17156j jVar3 = faceDocumentFragment.f29961g;
                if (jVar3 != null) {
                    jVar3.f48067j.clearAnimation();
                    C17156j jVar4 = faceDocumentFragment.f29961g;
                    if (jVar4 != null) {
                        jVar4.f48067j.setImageResource(C16346d.identomat_ic_arrow_down);
                        C17156j jVar5 = faceDocumentFragment.f29961g;
                        if (jVar5 != null) {
                            jVar5.f48069l.setVisibility(8);
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
            } else if (i == 1) {
                C17156j jVar6 = faceDocumentFragment.f29961g;
                if (jVar6 != null) {
                    jVar6.f48067j.clearAnimation();
                    C17156j jVar7 = faceDocumentFragment.f29961g;
                    if (jVar7 != null) {
                        jVar7.f48067j.setImageResource(C16346d.identomat_ic_loading_icon);
                        RotateAnimation rotateAnimation = new RotateAnimation(Utils.FLOAT_EPSILON, 360.0f, 1, 0.5f, 1, 0.5f);
                        rotateAnimation.setRepeatCount(-1);
                        rotateAnimation.setDuration(1000);
                        rotateAnimation.setInterpolator(new LinearInterpolator());
                        C17156j jVar8 = faceDocumentFragment.f29961g;
                        if (jVar8 != null) {
                            jVar8.f48067j.startAnimation(rotateAnimation);
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
            } else if (i == 2) {
                C17156j jVar9 = faceDocumentFragment.f29961g;
                if (jVar9 != null) {
                    jVar9.f48067j.clearAnimation();
                    C17156j jVar10 = faceDocumentFragment.f29961g;
                    if (jVar10 != null) {
                        jVar10.f48067j.setImageResource(C16346d.identomat_success_icon);
                        C17156j jVar11 = faceDocumentFragment.f29961g;
                        if (jVar11 != null) {
                            jVar11.f48069l.setVisibility(8);
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
    }

    /* renamed from: U1 */
    private final void m38344U1() {
        C17156j jVar = this.f29961g;
        if (jVar != null) {
            jVar.f48064g.setLifecycleOwner(this);
            C17156j jVar2 = this.f29961g;
            if (jVar2 != null) {
                jVar2.f48064g.setMode(C15753j.VIDEO);
                C17156j jVar3 = this.f29961g;
                if (jVar3 != null) {
                    jVar3.f48064g.clearFocus();
                    C17156j jVar4 = this.f29961g;
                    if (jVar4 != null) {
                        jVar4.f48064g.setFrameProcessingFormat(35);
                        C17156j jVar5 = this.f29961g;
                        if (jVar5 != null) {
                            jVar5.f48064g.mo29426u();
                            C17156j jVar6 = this.f29961g;
                            if (jVar6 != null) {
                                jVar6.f48064g.setPreviewStreamSize(new C17921h());
                                C17156j jVar7 = this.f29961g;
                                if (jVar7 != null) {
                                    jVar7.f48064g.mo29378q(this.f29970p);
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
    /* renamed from: V1 */
    public static final List m38345V1(List list) {
        Integer num;
        C41536l.m120489i(list, "nativeSizes");
        ArrayList arrayList = new ArrayList();
        if (list.size() > 1) {
            C41349u.m119946y(list, new C10557i());
        }
        Object i0 = C41358y.m120019i0(list);
        C41536l.m120488h(i0, "nativeSizes.last()");
        arrayList.add(i0);
        StringBuilder sb = new StringBuilder();
        C10396b bVar = (C10396b) C41358y.m120019i0(list);
        Integer num2 = null;
        if (bVar == null) {
            num = null;
        } else {
            num = Integer.valueOf(bVar.mo27062e());
        }
        sb.append(num);
        sb.append(' ');
        C10396b bVar2 = (C10396b) C41358y.m120019i0(list);
        if (bVar2 != null) {
            num2 = Integer.valueOf(bVar2.mo27060c());
        }
        sb.append(num2);
        Log.d("identomat_", sb.toString());
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: W1 */
    public final void m38346W1() {
        Log.i("identomat_", "success");
        Context context = getContext();
        if (context != null) {
            C12425c.f37092a.mo33032b(context);
        }
        this.f29969o.postDelayed(new C17922i(this), 2000);
    }

    /* access modifiers changed from: private */
    /* renamed from: X1 */
    public static final void m38347X1(FaceDocumentFragment faceDocumentFragment) {
        C41536l.m120489i(faceDocumentFragment, "this$0");
        faceDocumentFragment.m38334K1();
    }

    /* renamed from: u1 */
    private final boolean m38361u1() {
        Integer num;
        String[] strArr = f29957r;
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

    /* renamed from: v1 */
    private final void m38362v1() {
        Log.i("identomat_", "destroy");
        try {
            this.f29963i = false;
            C17156j jVar = this.f29961g;
            if (jVar != null) {
                jVar.f48064g.mo29426u();
            } else {
                C41536l.m120506z("binding");
                throw null;
            }
        } catch (Exception e) {
            Log.i("identomat_", C41536l.m120497q("onDestroy: ", e.getMessage()));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x1 */
    public static final void m38363x1(FaceDocumentFragment faceDocumentFragment, C18110b bVar) {
        C41536l.m120489i(faceDocumentFragment, "this$0");
        C41536l.m120489i(bVar, "frame");
        if (faceDocumentFragment.f29963i) {
            faceDocumentFragment.f29963i = false;
            C40845o1 o1Var = faceDocumentFragment.f29966l;
            if (o1Var == null || !o1Var.mo95131k()) {
                if (!faceDocumentFragment.m38361u1()) {
                    C8034d.m30522a(faceDocumentFragment).mo22123U();
                }
                int e = bVar.mo45793e();
                bVar.mo45790b();
                try {
                    faceDocumentFragment.f29966l = C40821j.m118316b(C1629r.m5683a(faceDocumentFragment), C40867u0.m118468b(), (C40822j0) null, new C10548b(faceDocumentFragment, C12073a.f35481a.mo32216a(bVar), e, (Continuation) null), 2, (Object) null);
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

    public void onAttach(Context context) {
        C41536l.m120489i(context, "context");
        super.onAttach(context);
        this.f29968n = context;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        C17156j d = C17156j.m60269d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f29961g = d;
        m38330G1();
        m38335L1();
        m38328E1();
        C17156j jVar = this.f29961g;
        if (jVar != null) {
            RelativeLayout c = jVar.mo3946b();
            C41536l.m120488h(c, "binding.root");
            return c;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    public void onDestroy() {
        m38362v1();
        super.onDestroy();
    }

    public void onPause() {
        this.f29963i = false;
        super.onPause();
    }

    public void onResume() {
        boolean z;
        super.onResume();
        this.f29958d.mo26255q(getContext(), this.f29960f);
        m38324A1().mo45588hw();
        C9800j jVar = this.f29967m;
        boolean z2 = true;
        if (jVar == null) {
            z = false;
        } else {
            m38327D1(jVar);
            this.f29967m = null;
            z = true;
        }
        C40845o1 o1Var = this.f29966l;
        if (o1Var != null) {
            if (!o1Var.mo95131k()) {
                z2 = z;
            }
            z = z2;
        }
        if (!z) {
            this.f29969o.postDelayed(new C17918e(this), 2000);
        }
    }

    public void onStop() {
        this.f29963i = false;
        super.onStop();
    }

    /* renamed from: y1 */
    public final C9786e mo27277y1() {
        return this.f29958d;
    }

    /* renamed from: z1 */
    public final C18877a mo27278z1() {
        return this.f29959e;
    }
}
