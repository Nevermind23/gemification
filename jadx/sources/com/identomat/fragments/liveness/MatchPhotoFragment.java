package com.identomat.fragments.liveness;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
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
import com.otaliastudios.cameraview.C11280b;
import com.otaliastudios.cameraview.CameraView;
import com.salesforce.marketingcloud.C11398b;
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
import java.io.File;
import java.util.Comparator;
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
import p374ce.C10396b;
import p388dd.C12073a;
import p388dd.C12074b;
import p458id.C15599a;
import p472jd.C15753j;
import p485kc.C16341a;
import p485kc.C16346d;
import p485kc.C16347e;
import p541oc.C17161o;
import p569qc.C17485b;
import p624uc.C18074a0;
import p624uc.C18076b0;
import p624uc.C18093s;
import p624uc.C18101t;
import p624uc.C18102u;
import p624uc.C18103v;
import p624uc.C18104w;
import p624uc.C18105x;
import p624uc.C18106y;
import p624uc.C18107z;
import p625ud.C18110b;
import p625ud.C18112d;
import p678yc.C18877a;
import p692zc.C18999c;
import p692zc.C19002e;
import ue1.C43064a;
import ue1.C43079p;

public final class MatchPhotoFragment extends Fragment {

    /* renamed from: t */
    public static final C10581a f30056t = new C10581a((DefaultConstructorMarker) null);

    /* renamed from: u */
    private static final String[] f30057u = {"android.permission.CAMERA"};

    /* renamed from: d */
    private final C9786e f30058d;

    /* renamed from: e */
    private final C18877a f30059e;

    /* renamed from: f */
    private final String f30060f = "match_photo_page";

    /* renamed from: g */
    private C17161o f30061g;

    /* renamed from: h */
    private final C41217g f30062h;

    /* renamed from: i */
    private boolean f30063i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f30064j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f30065k;

    /* renamed from: l */
    private int f30066l;

    /* renamed from: m */
    private int f30067m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public File f30068n;

    /* renamed from: o */
    private final Handler f30069o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C40845o1 f30070p;

    /* renamed from: q */
    private C9800j f30071q;

    /* renamed from: r */
    private final C18112d f30072r;

    /* renamed from: s */
    private final C10582b f30073s;

    /* renamed from: com.identomat.fragments.liveness.MatchPhotoFragment$a */
    public static final class C10581a {
        private C10581a() {
        }

        public /* synthetic */ C10581a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.identomat.fragments.liveness.MatchPhotoFragment$b */
    public static final class C10582b extends C15599a {

        /* renamed from: a */
        final /* synthetic */ MatchPhotoFragment f30074a;

        /* renamed from: com.identomat.fragments.liveness.MatchPhotoFragment$b$a */
        static final class C10583a extends C41862l implements C43079p {

            /* renamed from: h */
            Object f30075h;

            /* renamed from: i */
            int f30076i;

            /* renamed from: j */
            final /* synthetic */ MatchPhotoFragment f30077j;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10583a(MatchPhotoFragment matchPhotoFragment, Continuation continuation) {
                super(2, continuation);
                this.f30077j = matchPhotoFragment;
            }

            /* renamed from: a */
            public final Continuation mo3708a(Object obj, Continuation continuation) {
                return new C10583a(this.f30077j, continuation);
            }

            /* renamed from: f */
            public final Object mo3709f(Object obj) {
                MatchPhotoFragment matchPhotoFragment;
                Object c = C41793d.m121157c();
                int i = this.f30076i;
                if (i == 0) {
                    C41228o.m119483b(obj);
                    File r1 = this.f30077j.f30068n;
                    if (r1 != null) {
                        MatchPhotoFragment matchPhotoFragment2 = this.f30077j;
                        if (matchPhotoFragment2.f30065k) {
                            matchPhotoFragment2.f30065k = false;
                            try {
                                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                                mediaMetadataRetriever.setDataSource(matchPhotoFragment2.getContext(), Uri.fromFile(matchPhotoFragment2.f30068n));
                                Log.i("identomat_", C41536l.m120497q("video duration: ", mediaMetadataRetriever.extractMetadata(9)));
                                Log.i("identomat_", C41536l.m120497q("video size: ", C41851b.m121257d(r1.length() / ((long) C11398b.f33141t))));
                                mediaMetadataRetriever.release();
                            } catch (Exception unused) {
                            }
                            this.f30075h = matchPhotoFragment2;
                            this.f30076i = 1;
                            if (matchPhotoFragment2.m38517a2(r1, this) == c) {
                                return c;
                            }
                            matchPhotoFragment = matchPhotoFragment2;
                        } else {
                            r1.delete();
                        }
                    }
                    return C41238w.f97225a;
                } else if (i == 1) {
                    matchPhotoFragment = (MatchPhotoFragment) this.f30075h;
                    C41228o.m119483b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                matchPhotoFragment.f30068n = null;
                return C41238w.f97225a;
            }

            /* renamed from: n */
            public final Object invoke(C40814h0 h0Var, Continuation continuation) {
                return ((C10583a) mo3708a(h0Var, continuation)).mo3709f(C41238w.f97225a);
            }
        }

        C10582b(MatchPhotoFragment matchPhotoFragment) {
            this.f30074a = matchPhotoFragment;
        }

        /* renamed from: j */
        public void mo27286j() {
            Log.i("identomat_", "onVideoRecordingEnd");
        }

        /* renamed from: k */
        public void mo27287k() {
            Log.i("identomat_", "onVideoRecordingStart");
        }

        /* renamed from: l */
        public void mo27288l(C11280b bVar) {
            C41536l.m120489i(bVar, "result");
            MatchPhotoFragment matchPhotoFragment = this.f30074a;
            matchPhotoFragment.f30070p = C40821j.m118316b(C1629r.m5683a(matchPhotoFragment), C40867u0.m118468b(), (C40822j0) null, new C10583a(this.f30074a, (Continuation) null), 2, (Object) null);
        }
    }

    /* renamed from: com.identomat.fragments.liveness.MatchPhotoFragment$c */
    static final class C10584c extends C41862l implements C43079p {

        /* renamed from: h */
        int f30078h;

        /* renamed from: i */
        final /* synthetic */ MatchPhotoFragment f30079i;

        /* renamed from: j */
        final /* synthetic */ Bitmap f30080j;

        /* renamed from: k */
        final /* synthetic */ int f30081k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10584c(MatchPhotoFragment matchPhotoFragment, Bitmap bitmap, int i, Continuation continuation) {
            super(2, continuation);
            this.f30079i = matchPhotoFragment;
            this.f30080j = bitmap;
            this.f30081k = i;
        }

        /* renamed from: a */
        public final Continuation mo3708a(Object obj, Continuation continuation) {
            return new C10584c(this.f30079i, this.f30080j, this.f30081k, continuation);
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            Object c = C41793d.m121157c();
            int i = this.f30078h;
            if (i == 0) {
                C41228o.m119483b(obj);
                this.f30078h = 1;
                if (this.f30079i.m38515Y1(this.f30080j, (float) this.f30081k, this) == c) {
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
            return ((C10584c) mo3708a(h0Var, continuation)).mo3709f(C41238w.f97225a);
        }
    }

    /* renamed from: com.identomat.fragments.liveness.MatchPhotoFragment$d */
    static final class C10585d extends C41862l implements C43079p {

        /* renamed from: h */
        int f30082h;

        /* renamed from: i */
        final /* synthetic */ C9800j f30083i;

        /* renamed from: j */
        final /* synthetic */ MatchPhotoFragment f30084j;

        /* renamed from: com.identomat.fragments.liveness.MatchPhotoFragment$d$a */
        static final class C10586a extends C41862l implements C43079p {

            /* renamed from: h */
            int f30085h;

            /* renamed from: i */
            final /* synthetic */ MatchPhotoFragment f30086i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10586a(MatchPhotoFragment matchPhotoFragment, Continuation continuation) {
                super(2, continuation);
                this.f30086i = matchPhotoFragment;
            }

            /* renamed from: a */
            public final Continuation mo3708a(Object obj, Continuation continuation) {
                return new C10586a(this.f30086i, continuation);
            }

            /* renamed from: f */
            public final Object mo3709f(Object obj) {
                Object c = C41793d.m121157c();
                int i = this.f30085h;
                if (i == 0) {
                    C41228o.m119483b(obj);
                    this.f30085h = 1;
                    if (C40850p0.m118424a(1000, this) == c) {
                        return c;
                    }
                } else if (i == 1) {
                    C41228o.m119483b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this.f30086i.f30064j = true;
                return C41238w.f97225a;
            }

            /* renamed from: n */
            public final Object invoke(C40814h0 h0Var, Continuation continuation) {
                return ((C10586a) mo3708a(h0Var, continuation)).mo3709f(C41238w.f97225a);
            }
        }

        /* renamed from: com.identomat.fragments.liveness.MatchPhotoFragment$d$b */
        public /* synthetic */ class C10587b {

            /* renamed from: a */
            public static final /* synthetic */ int[] f30087a;

            static {
                int[] iArr = new int[C9801k.values().length];
                iArr[C9801k.SUCCESS.ordinal()] = 1;
                iArr[C9801k.SESSION_ENDED.ordinal()] = 2;
                f30087a = iArr;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10585d(C9800j jVar, MatchPhotoFragment matchPhotoFragment, Continuation continuation) {
            super(2, continuation);
            this.f30083i = jVar;
            this.f30084j = matchPhotoFragment;
        }

        /* renamed from: a */
        public final Continuation mo3708a(Object obj, Continuation continuation) {
            return new C10585d(this.f30083i, this.f30084j, continuation);
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            Object unused = C41793d.m121157c();
            if (this.f30082h == 0) {
                C41228o.m119483b(obj);
                int i = C10587b.f30087a[this.f30083i.mo26295c().ordinal()];
                if (i == 1) {
                    this.f30084j.m38525h2();
                } else if (i != 2) {
                    C40845o1 unused2 = C40821j.m118316b(C1629r.m5683a(this.f30084j), C40867u0.m118468b(), (C40822j0) null, new C10586a(this.f30084j, (Continuation) null), 2, (Object) null);
                } else {
                    C16341a.f46171a.mo43313a(this.f30084j.getActivity());
                }
                return C41238w.f97225a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: n */
        public final Object invoke(C40814h0 h0Var, Continuation continuation) {
            return ((C10585d) mo3708a(h0Var, continuation)).mo3709f(C41238w.f97225a);
        }
    }

    /* renamed from: com.identomat.fragments.liveness.MatchPhotoFragment$e */
    static final class C10588e extends C41862l implements C43079p {

        /* renamed from: h */
        int f30088h;

        /* renamed from: i */
        final /* synthetic */ C9800j f30089i;

        /* renamed from: j */
        final /* synthetic */ MatchPhotoFragment f30090j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10588e(C9800j jVar, MatchPhotoFragment matchPhotoFragment, Continuation continuation) {
            super(2, continuation);
            this.f30089i = jVar;
            this.f30090j = matchPhotoFragment;
        }

        /* renamed from: a */
        public final Continuation mo3708a(Object obj, Continuation continuation) {
            return new C10588e(this.f30089i, this.f30090j, continuation);
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            Object unused = C41793d.m121157c();
            if (this.f30088h == 0) {
                C41228o.m119483b(obj);
                if (this.f30089i.mo26295c() != C9801k.SUCCESS) {
                    this.f30090j.m38527i2();
                } else if (C41536l.m120484d(this.f30089i.mo26294b(), "true")) {
                    C16341a.f46171a.mo43313a(this.f30090j.getActivity());
                } else {
                    this.f30090j.m38527i2();
                }
                return C41238w.f97225a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: n */
        public final Object invoke(C40814h0 h0Var, Continuation continuation) {
            return ((C10588e) mo3708a(h0Var, continuation)).mo3709f(C41238w.f97225a);
        }
    }

    /* renamed from: com.identomat.fragments.liveness.MatchPhotoFragment$f */
    static final class C10589f extends C41853d {

        /* renamed from: g */
        Object f30091g;

        /* renamed from: h */
        /* synthetic */ Object f30092h;

        /* renamed from: i */
        final /* synthetic */ MatchPhotoFragment f30093i;

        /* renamed from: j */
        int f30094j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10589f(MatchPhotoFragment matchPhotoFragment, Continuation continuation) {
            super(continuation);
            this.f30093i = matchPhotoFragment;
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            this.f30092h = obj;
            this.f30094j |= Integer.MIN_VALUE;
            return this.f30093i.m38516Z1((Bitmap) null, this);
        }
    }

    /* renamed from: com.identomat.fragments.liveness.MatchPhotoFragment$g */
    static final class C10590g extends C41853d {

        /* renamed from: g */
        Object f30095g;

        /* renamed from: h */
        /* synthetic */ Object f30096h;

        /* renamed from: i */
        final /* synthetic */ MatchPhotoFragment f30097i;

        /* renamed from: j */
        int f30098j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10590g(MatchPhotoFragment matchPhotoFragment, Continuation continuation) {
            super(continuation);
            this.f30097i = matchPhotoFragment;
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            this.f30096h = obj;
            this.f30098j |= Integer.MIN_VALUE;
            return this.f30097i.m38517a2((File) null, this);
        }
    }

    /* renamed from: com.identomat.fragments.liveness.MatchPhotoFragment$h */
    public static final class C10591h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f30099d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10591h(Fragment fragment) {
            super(0);
            this.f30099d = fragment;
        }

        public final Fragment invoke() {
            return this.f30099d;
        }
    }

    /* renamed from: com.identomat.fragments.liveness.MatchPhotoFragment$i */
    public static final class C10592i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f30100d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10592i(C43064a aVar) {
            super(0);
            this.f30100d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f30100d.invoke();
        }
    }

    /* renamed from: com.identomat.fragments.liveness.MatchPhotoFragment$j */
    public static final class C10593j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f30101d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10593j(C41217g gVar) {
            super(0);
            this.f30101d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f30101d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: com.identomat.fragments.liveness.MatchPhotoFragment$k */
    public static final class C10594k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f30102d;

        /* renamed from: e */
        final /* synthetic */ C41217g f30103e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10594k(C43064a aVar, C41217g gVar) {
            super(0);
            this.f30102d = aVar;
            this.f30103e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f30102d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f30103e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: com.identomat.fragments.liveness.MatchPhotoFragment$l */
    public static final class C10595l implements Comparator {
        public final int compare(Object obj, Object obj2) {
            return C41506d.m120406e(Integer.valueOf(((C10396b) obj).mo27062e()), Integer.valueOf(((C10396b) obj2).mo27062e()));
        }
    }

    /* renamed from: com.identomat.fragments.liveness.MatchPhotoFragment$m */
    static final class C10596m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ MatchPhotoFragment f30104d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10596m(MatchPhotoFragment matchPhotoFragment) {
            super(0);
            this.f30104d = matchPhotoFragment;
        }

        public final C1620q0.C1624b invoke() {
            return new C17485b(this.f30104d.mo27296E1(), (C9793g) null, (C9796h) null, 6, (DefaultConstructorMarker) null);
        }
    }

    public MatchPhotoFragment(C9786e eVar, C18877a aVar) {
        C41536l.m120489i(eVar, "api");
        C41536l.m120489i(aVar, "identomatConfig");
        this.f30058d = eVar;
        this.f30059e = aVar;
        C10596m mVar = new C10596m(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C10592i(new C10591h(this)));
        this.f30062h = C1514j0.m5374c(this, C41520a0.m120436b(C18093s.class), new C10593j(a), new C10594k((C43064a) null, a), mVar);
        this.f30069o = new Handler(Looper.getMainLooper());
        this.f30072r = new C18107z(this);
        this.f30073s = new C10582b(this);
    }

    /* renamed from: C1 */
    private final boolean m38495C1() {
        Integer num;
        String[] strArr = f30057u;
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

    /* access modifiers changed from: private */
    /* renamed from: D1 */
    public static final void m38496D1(MatchPhotoFragment matchPhotoFragment, C18110b bVar) {
        C41536l.m120489i(matchPhotoFragment, "this$0");
        C41536l.m120489i(bVar, "frame");
        if (matchPhotoFragment.f30064j) {
            matchPhotoFragment.f30064j = false;
            int e = bVar.mo45793e();
            bVar.mo45790b();
            try {
                matchPhotoFragment.f30070p = C40821j.m118316b(C1629r.m5683a(matchPhotoFragment), C40867u0.m118468b(), (C40822j0) null, new C10584c(matchPhotoFragment, C12073a.f35481a.mo32216a(bVar), e, (Continuation) null), 2, (Object) null);
            } catch (Exception e2) {
                String message = e2.getMessage();
                if (message != null) {
                    Log.i("identomat_", message);
                }
            }
            bVar.mo45797i();
        }
    }

    /* renamed from: G1 */
    private final C18093s m38497G1() {
        return (C18093s) this.f30062h.getValue();
    }

    /* renamed from: H1 */
    private final void m38498H1() {
        Bundle bundle = new Bundle();
        bundle.putInt("frame", C16347e.matchPhotoFragment);
        bundle.putBundle("bundle", getArguments());
        C8034d.m30522a(this).mo22123U();
        C8034d.m30522a(this).mo22119N(C16347e.cameraDenyFragment, bundle, NavigationActivity.f29874v.mo27261a());
    }

    /* renamed from: I1 */
    private final void m38499I1(C9800j jVar) {
        C40845o1 unused = C40821j.m118316b(C1629r.m5683a(this), C40867u0.m118469c(), (C40822j0) null, new C10585d(jVar, this, (Continuation) null), 2, (Object) null);
    }

    /* renamed from: J1 */
    private final void m38500J1(C9800j jVar) {
        C40845o1 unused = C40821j.m118316b(C1629r.m5683a(this), C40867u0.m118469c(), (C40822j0) null, new C10588e(jVar, this, (Continuation) null), 2, (Object) null);
    }

    /* renamed from: K1 */
    private final void m38501K1() {
        C17161o oVar = this.f30061g;
        if (oVar != null) {
            oVar.f48126q.setVisibility(4);
            C17161o oVar2 = this.f30061g;
            if (oVar2 != null) {
                oVar2.f48118i.setVisibility(4);
                C17161o oVar3 = this.f30061g;
                if (oVar3 != null) {
                    oVar3.f48117h.setVisibility(4);
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

    /* renamed from: L1 */
    private final void m38502L1() {
        View view = (View) C16341a.f46171a.mo43318f().invoke();
        if (view != null) {
            try {
                C17161o oVar = this.f30061g;
                if (oVar != null) {
                    oVar.f48121l.removeAllViews();
                    ViewParent parent = view.getParent();
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(view);
                        C17161o oVar2 = this.f30061g;
                        if (oVar2 != null) {
                            oVar2.f48121l.addView(view);
                            view.setVisibility(0);
                            return;
                        }
                        C41536l.m120506z("binding");
                        throw null;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                }
                C41536l.m120506z("binding");
                throw null;
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            C17161o oVar3 = this.f30061g;
            if (oVar3 != null) {
                oVar3.f48124o.mo27360e(this.f30059e);
            } else {
                C41536l.m120506z("binding");
                throw null;
            }
        }
    }

    /* renamed from: M1 */
    private final void m38503M1() {
        if (m38495C1()) {
            m38522f2();
        } else if (getActivity() != null) {
            C0173b registerForActivityResult = registerForActivityResult(new C2105c(), new C18102u(this));
            C41536l.m120488h(registerForActivityResult, "registerForActivityResult(ActivityResultContracts.RequestPermission())\n                    { isGranted: Boolean ->\n                        if (isGranted) {\n                            startCamera()\n                        } else {\n                            goToCameraDeny()\n                        }\n                    }");
            registerForActivityResult.mo404a(f30057u[0]);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: N1 */
    public static final void m38504N1(MatchPhotoFragment matchPhotoFragment, boolean z) {
        C41536l.m120489i(matchPhotoFragment, "this$0");
        if (z) {
            matchPhotoFragment.m38522f2();
        } else {
            matchPhotoFragment.m38498H1();
        }
    }

    /* renamed from: O1 */
    private final void m38505O1() {
        if (getContext() != null) {
            float f = (float) ((requireContext().getResources().getDisplayMetrics().widthPixels / 6) * 5);
            C17161o oVar = this.f30061g;
            if (oVar != null) {
                float aspect = f * oVar.f48117h.getAspect();
                C17161o oVar2 = this.f30061g;
                if (oVar2 != null) {
                    oVar2.f48118i.getLayoutParams().height = (int) aspect;
                } else {
                    C41536l.m120506z("binding");
                    throw null;
                }
            } else {
                C41536l.m120506z("binding");
                throw null;
            }
        }
        m38509S1(this);
        m38508R1(this);
        m38507Q1(this);
        m38506P1(this);
        m38503M1();
        m38502L1();
    }

    /* renamed from: P1 */
    private static final void m38506P1(MatchPhotoFragment matchPhotoFragment) {
        C19002e.C19003a aVar = C19002e.f53052q;
        C1505h activity = matchPhotoFragment.getActivity();
        C17161o oVar = matchPhotoFragment.f30061g;
        if (oVar != null) {
            ImageView imageView = oVar.f48114e;
            C41536l.m120488h(imageView, "binding.backButton");
            C17161o oVar2 = matchPhotoFragment.f30061g;
            if (oVar2 != null) {
                TextView textView = oVar2.f48115f;
                C41536l.m120488h(textView, "binding.backButtonTitleView");
                C19002e.C19003a.m64212c(aVar, activity, imageView, textView, false, matchPhotoFragment.f30059e, 8, (Object) null);
                return;
            }
            C41536l.m120506z("binding");
            throw null;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    /* renamed from: Q1 */
    private static final void m38507Q1(MatchPhotoFragment matchPhotoFragment) {
        C17161o oVar = matchPhotoFragment.f30061g;
        if (oVar != null) {
            oVar.mo3946b().setBackgroundColor(matchPhotoFragment.f30059e.mo46861a().mo47093b().mo33033a());
            C19002e.C19003a aVar = C19002e.f53052q;
            C17161o oVar2 = matchPhotoFragment.f30061g;
            if (oVar2 != null) {
                RelativeLayout relativeLayout = oVar2.f48120k;
                C41536l.m120488h(relativeLayout, "binding.indicatorView");
                aVar.mo47120f(relativeLayout, matchPhotoFragment.f30059e.mo46861a().mo47100i().mo33033a());
                C17161o oVar3 = matchPhotoFragment.f30061g;
                if (oVar3 != null) {
                    oVar3.f48122m.setTextColor(matchPhotoFragment.f30059e.mo46861a().mo47099h().mo33033a());
                    Integer b = matchPhotoFragment.f30059e.mo46867g().mo47137b();
                    if (b != null) {
                        int intValue = b.intValue();
                        Resources resources = matchPhotoFragment.getResources();
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

    /* renamed from: R1 */
    private static final void m38508R1(MatchPhotoFragment matchPhotoFragment) {
        C18999c e = matchPhotoFragment.f30059e.mo46867g().mo47140e();
        C17161o oVar = matchPhotoFragment.f30061g;
        if (oVar != null) {
            TextView textView = oVar.f48126q;
            C41536l.m120488h(textView, "binding.titleView");
            e.mo47079g(textView, 0);
            C18999c e2 = matchPhotoFragment.f30059e.mo46867g().mo47140e();
            C17161o oVar2 = matchPhotoFragment.f30061g;
            if (oVar2 != null) {
                TextView textView2 = oVar2.f48125p;
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

    /* renamed from: S1 */
    private static final void m38509S1(MatchPhotoFragment matchPhotoFragment) {
        C17161o oVar = matchPhotoFragment.f30061g;
        if (oVar != null) {
            oVar.f48126q.setText(matchPhotoFragment.f30059e.mo46864d().mo47124d(matchPhotoFragment.getContext(), "face_instructions"));
            C17161o oVar2 = matchPhotoFragment.f30061g;
            if (oVar2 != null) {
                oVar2.f48122m.setText(matchPhotoFragment.f30059e.mo46864d().mo47124d(matchPhotoFragment.getContext(), "uploading"));
            } else {
                C41536l.m120506z("binding");
                throw null;
            }
        } else {
            C41536l.m120506z("binding");
            throw null;
        }
    }

    /* renamed from: T1 */
    private final void m38510T1() {
        m38497G1().mo45772fw().mo4819k(getViewLifecycleOwner(), new C18103v(this));
        m38497G1().mo45774hw().mo4819k(getViewLifecycleOwner(), new C18104w(this));
        m38497G1().mo45776jw().mo4819k(getViewLifecycleOwner(), new C18105x(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: U1 */
    public static final void m38511U1(MatchPhotoFragment matchPhotoFragment, C41224m mVar) {
        C41536l.m120489i(matchPhotoFragment, "this$0");
        matchPhotoFragment.m38518b2((String) mVar.mo95678e(), ((Number) mVar.mo95680f()).intValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: V1 */
    public static final void m38512V1(MatchPhotoFragment matchPhotoFragment, Integer num) {
        C41536l.m120489i(matchPhotoFragment, "this$0");
        String str = null;
        if (num != null && num.intValue() == 100) {
            C17161o oVar = matchPhotoFragment.f30061g;
            if (oVar != null) {
                oVar.f48122m.setText(matchPhotoFragment.mo27297F1().mo46864d().mo47124d(matchPhotoFragment.getContext(), "verifying"));
            } else {
                C41536l.m120506z("binding");
                throw null;
            }
        } else {
            C17161o oVar2 = matchPhotoFragment.f30061g;
            if (oVar2 != null) {
                TextView textView = oVar2.f48122m;
                StringBuilder sb = new StringBuilder();
                String d = matchPhotoFragment.mo27297F1().mo46864d().mo47124d(matchPhotoFragment.getContext(), "uploading");
                if (d != null) {
                    str = C40439w.m117103B(d, "...", "", false, 4, (Object) null);
                }
                sb.append(str);
                sb.append(": ");
                sb.append(num);
                sb.append('%');
                textView.setText(sb.toString());
                return;
            }
            C41536l.m120506z("binding");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: W1 */
    public static final void m38513W1(MatchPhotoFragment matchPhotoFragment, Boolean bool) {
        C41536l.m120489i(matchPhotoFragment, "this$0");
        C41536l.m120488h(bool, "it");
        if (bool.booleanValue()) {
            C17161o oVar = matchPhotoFragment.f30061g;
            if (oVar != null) {
                oVar.f48116g.setVisibility(8);
                C17161o oVar2 = matchPhotoFragment.f30061g;
                if (oVar2 != null) {
                    oVar2.f48123n.setVisibility(0);
                    matchPhotoFragment.m38501K1();
                    return;
                }
                C41536l.m120506z("binding");
                throw null;
            }
            C41536l.m120506z("binding");
            throw null;
        }
        C17161o oVar3 = matchPhotoFragment.f30061g;
        if (oVar3 != null) {
            oVar3.f48123n.setVisibility(8);
        } else {
            C41536l.m120506z("binding");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: X1 */
    public static final void m38514X1(MatchPhotoFragment matchPhotoFragment) {
        C41536l.m120489i(matchPhotoFragment, "this$0");
        matchPhotoFragment.m38521e2();
    }

    /* access modifiers changed from: private */
    /* renamed from: Y1 */
    public final Object m38515Y1(Bitmap bitmap, float f, Continuation continuation) {
        this.f30064j = false;
        if (getContext() == null) {
            return C41238w.f97225a;
        }
        m38518b2("", 1);
        C12074b bVar = C12074b.f35484a;
        Bitmap f2 = bVar.mo32224f(bitmap, f);
        DisplayMetrics displayMetrics = requireContext().getResources().getDisplayMetrics();
        Object Z1 = m38516Z1(bVar.mo32223e(bVar.mo32222d(f2, ((float) displayMetrics.heightPixels) / ((float) displayMetrics.widthPixels)), 500), continuation);
        if (Z1 == C41793d.m121157c()) {
            return Z1;
        }
        return C41238w.f97225a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: Z1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m38516Z1(android.graphics.Bitmap r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.identomat.fragments.liveness.MatchPhotoFragment.C10589f
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.identomat.fragments.liveness.MatchPhotoFragment$f r0 = (com.identomat.fragments.liveness.MatchPhotoFragment.C10589f) r0
            int r1 = r0.f30094j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f30094j = r1
            goto L_0x0018
        L_0x0013:
            com.identomat.fragments.liveness.MatchPhotoFragment$f r0 = new com.identomat.fragments.liveness.MatchPhotoFragment$f
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f30092h
            java.lang.Object r1 = ne1.C41793d.m121157c()
            int r2 = r0.f30094j
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r5 = r0.f30091g
            com.identomat.fragments.liveness.MatchPhotoFragment r5 = (com.identomat.fragments.liveness.MatchPhotoFragment) r5
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
            r4.f30064j = r3
            java.lang.String r5 = "identomat_"
            java.lang.String r6 = "bitmap is null"
            android.util.Log.i(r5, r6)
            he1.w r5 = he1.C41238w.f97225a
            return r5
        L_0x0046:
            android.content.Context r6 = r4.getContext()
            if (r6 != 0) goto L_0x004d
            goto L_0x0075
        L_0x004d:
            uc.s r2 = r4.m38497G1()
            r0.f30091g = r4
            r0.f30094j = r3
            java.lang.Object r6 = r2.mo45778lw(r6, r5, r0)
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
            if (r0 != 0) goto L_0x0072
            he1.w r5 = he1.C41238w.f97225a
            return r5
        L_0x0072:
            r5.m38499I1(r6)
        L_0x0075:
            he1.w r5 = he1.C41238w.f97225a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.identomat.fragments.liveness.MatchPhotoFragment.m38516Z1(android.graphics.Bitmap, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m38517a2(java.io.File r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.identomat.fragments.liveness.MatchPhotoFragment.C10590g
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.identomat.fragments.liveness.MatchPhotoFragment$g r0 = (com.identomat.fragments.liveness.MatchPhotoFragment.C10590g) r0
            int r1 = r0.f30098j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f30098j = r1
            goto L_0x0018
        L_0x0013:
            com.identomat.fragments.liveness.MatchPhotoFragment$g r0 = new com.identomat.fragments.liveness.MatchPhotoFragment$g
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f30096h
            java.lang.Object r1 = ne1.C41793d.m121157c()
            int r2 = r0.f30098j
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r5 = r0.f30095g
            com.identomat.fragments.liveness.MatchPhotoFragment r5 = (com.identomat.fragments.liveness.MatchPhotoFragment) r5
            he1.C41228o.m119483b(r6)
            goto L_0x0050
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            he1.C41228o.m119483b(r6)
            android.content.Context r6 = r4.getContext()
            if (r6 != 0) goto L_0x003f
            goto L_0x0068
        L_0x003f:
            uc.s r2 = r4.m38497G1()
            r0.f30095g = r4
            r0.f30098j = r3
            r3 = 0
            java.lang.Object r6 = r2.mo45779mw(r6, r5, r3, r0)
            if (r6 != r1) goto L_0x004f
            return r1
        L_0x004f:
            r5 = r4
        L_0x0050:
            ad.j r6 = (p345ad.C9800j) r6
            androidx.lifecycle.j r0 = r5.getLifecycle()
            androidx.lifecycle.j$b r0 = r0.mo4907b()
            androidx.lifecycle.j$b r1 = androidx.lifecycle.C1593j.C1598b.RESUMED
            boolean r0 = r0.mo4914b(r1)
            if (r0 == 0) goto L_0x0066
            r5.m38500J1(r6)
            goto L_0x0068
        L_0x0066:
            r5.f30071q = r6
        L_0x0068:
            he1.w r5 = he1.C41238w.f97225a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.identomat.fragments.liveness.MatchPhotoFragment.m38517a2(java.io.File, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: b2 */
    private final void m38518b2(String str, int i) {
        if (this.f30063i) {
            this.f30069o.post(new C18106y(str, this, i));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c2 */
    public static final void m38519c2(String str, MatchPhotoFragment matchPhotoFragment, int i) {
        boolean z;
        C41536l.m120489i(str, "$text");
        C41536l.m120489i(matchPhotoFragment, "this$0");
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C17161o oVar = matchPhotoFragment.f30061g;
            if (oVar != null) {
                oVar.f48125p.setVisibility(0);
                C17161o oVar2 = matchPhotoFragment.f30061g;
                if (oVar2 != null) {
                    oVar2.f48125p.setText(matchPhotoFragment.mo27297F1().mo46864d().mo47124d(matchPhotoFragment.getContext(), str));
                } else {
                    C41536l.m120506z("binding");
                    throw null;
                }
            } else {
                C41536l.m120506z("binding");
                throw null;
            }
        }
        if (matchPhotoFragment.f30066l != i) {
            matchPhotoFragment.f30066l = i;
            if (i == 0) {
                C17161o oVar3 = matchPhotoFragment.f30061g;
                if (oVar3 != null) {
                    oVar3.f48119j.clearAnimation();
                    C17161o oVar4 = matchPhotoFragment.f30061g;
                    if (oVar4 != null) {
                        oVar4.f48119j.setImageResource(C16346d.identomat_ic_arrow_down);
                        C17161o oVar5 = matchPhotoFragment.f30061g;
                        if (oVar5 != null) {
                            oVar5.f48125p.setVisibility(8);
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
                C17161o oVar6 = matchPhotoFragment.f30061g;
                if (oVar6 != null) {
                    oVar6.f48119j.clearAnimation();
                    C17161o oVar7 = matchPhotoFragment.f30061g;
                    if (oVar7 != null) {
                        oVar7.f48119j.setImageResource(C16346d.identomat_ic_loading_icon);
                        RotateAnimation rotateAnimation = new RotateAnimation(Utils.FLOAT_EPSILON, 360.0f, 1, 0.5f, 1, 0.5f);
                        rotateAnimation.setRepeatCount(-1);
                        rotateAnimation.setDuration(1000);
                        rotateAnimation.setInterpolator(new LinearInterpolator());
                        C17161o oVar8 = matchPhotoFragment.f30061g;
                        if (oVar8 != null) {
                            oVar8.f48119j.startAnimation(rotateAnimation);
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
                C17161o oVar9 = matchPhotoFragment.f30061g;
                if (oVar9 != null) {
                    oVar9.f48119j.clearAnimation();
                    C17161o oVar10 = matchPhotoFragment.f30061g;
                    if (oVar10 != null) {
                        oVar10.f48119j.setImageResource(C16346d.identomat_success_icon);
                        C17161o oVar11 = matchPhotoFragment.f30061g;
                        if (oVar11 != null) {
                            oVar11.f48125p.setVisibility(8);
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

    /* renamed from: d2 */
    private final void m38520d2() {
        C17161o oVar = this.f30061g;
        if (oVar != null) {
            oVar.f48126q.setVisibility(0);
            C17161o oVar2 = this.f30061g;
            if (oVar2 != null) {
                oVar2.f48118i.setVisibility(0);
                C17161o oVar3 = this.f30061g;
                if (oVar3 != null) {
                    oVar3.f48117h.setVisibility(0);
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

    /* renamed from: e2 */
    private final void m38521e2() {
        this.f30064j = true;
        this.f30063i = true;
        C17161o oVar = this.f30061g;
        if (oVar != null) {
            oVar.f48116g.mo29378q(this.f30072r);
        } else {
            C41536l.m120506z("binding");
            throw null;
        }
    }

    /* renamed from: f2 */
    private final void m38522f2() {
        C17161o oVar = this.f30061g;
        if (oVar != null) {
            oVar.f48116g.setLifecycleOwner(this);
            C17161o oVar2 = this.f30061g;
            if (oVar2 != null) {
                oVar2.f48116g.setMode(C15753j.VIDEO);
                C17161o oVar3 = this.f30061g;
                if (oVar3 != null) {
                    oVar3.f48116g.setFrameProcessingFormat(35);
                    C17161o oVar4 = this.f30061g;
                    if (oVar4 != null) {
                        oVar4.f48116g.setVideoSize(new C18076b0());
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

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: ce.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: ce.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: ce.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: ce.b} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List m38523g2(java.util.List r8) {
        /*
            java.lang.String r0 = "nativeSizes"
            kotlin.jvm.internal.C41536l.m120489i(r8, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r8.size()
            r2 = 1
            if (r1 <= r2) goto L_0x0019
            com.identomat.fragments.liveness.MatchPhotoFragment$l r1 = new com.identomat.fragments.liveness.MatchPhotoFragment$l
            r1.<init>()
            ie1.C41349u.m119946y(r8, r1)
        L_0x0019:
            java.util.Iterator r1 = r8.iterator()
        L_0x001d:
            boolean r3 = r1.hasNext()
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L_0x003a
            java.lang.Object r3 = r1.next()
            r6 = r3
            ce.b r6 = (p374ce.C10396b) r6
            int r6 = r6.mo27062e()
            r7 = 480(0x1e0, float:6.73E-43)
            if (r6 != r7) goto L_0x0036
            r6 = r2
            goto L_0x0037
        L_0x0036:
            r6 = r4
        L_0x0037:
            if (r6 == 0) goto L_0x001d
            goto L_0x003b
        L_0x003a:
            r3 = r5
        L_0x003b:
            ce.b r3 = (p374ce.C10396b) r3
            if (r3 == 0) goto L_0x0043
            r0.add(r3)
            goto L_0x006a
        L_0x0043:
            java.util.Iterator r8 = r8.iterator()
        L_0x0047:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0062
            java.lang.Object r1 = r8.next()
            r3 = r1
            ce.b r3 = (p374ce.C10396b) r3
            int r3 = r3.mo27062e()
            r6 = 350(0x15e, float:4.9E-43)
            if (r3 <= r6) goto L_0x005e
            r3 = r2
            goto L_0x005f
        L_0x005e:
            r3 = r4
        L_0x005f:
            if (r3 == 0) goto L_0x0047
            r5 = r1
        L_0x0062:
            r3 = r5
            ce.b r3 = (p374ce.C10396b) r3
            if (r3 == 0) goto L_0x006a
            r0.add(r3)
        L_0x006a:
            java.lang.String r8 = java.lang.String.valueOf(r3)
            java.lang.String r1 = "identomat_"
            android.util.Log.d(r1, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.identomat.fragments.liveness.MatchPhotoFragment.m38523g2(java.util.List):java.util.List");
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public final void m38525h2() {
        File file;
        this.f30065k = true;
        C17161o oVar = this.f30061g;
        if (oVar != null) {
            oVar.f48116g.mo29319H(this.f30073s);
            C17161o oVar2 = this.f30061g;
            if (oVar2 != null) {
                oVar2.f48116g.mo29377p(this.f30073s);
                Context context = getContext();
                if (context == null) {
                    file = null;
                } else {
                    file = context.getCacheDir();
                }
                File file2 = new File(file, "match.mp4");
                this.f30068n = file2;
                file2.createNewFile();
                File file3 = this.f30068n;
                if (file3 != null) {
                    C17161o oVar3 = this.f30061g;
                    if (oVar3 != null) {
                        CameraView cameraView = oVar3.f48116g;
                        C41536l.m120486f(file3);
                        cameraView.mo29324N(file3, 3000);
                        return;
                    }
                    C41536l.m120506z("binding");
                    throw null;
                }
                return;
            }
            C41536l.m120506z("binding");
            throw null;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public final void m38527i2() {
        this.f30069o.post(new C18074a0(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public static final void m38529j2(MatchPhotoFragment matchPhotoFragment) {
        C41536l.m120489i(matchPhotoFragment, "this$0");
        C17161o oVar = matchPhotoFragment.f30061g;
        if (oVar != null) {
            oVar.f48116g.setVisibility(0);
            matchPhotoFragment.m38520d2();
            matchPhotoFragment.f30064j = true;
            return;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    /* renamed from: E1 */
    public final C9786e mo27296E1() {
        return this.f30058d;
    }

    /* renamed from: F1 */
    public final C18877a mo27297F1() {
        return this.f30059e;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        C17161o d = C17161o.m60294d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f30061g = d;
        m38505O1();
        m38510T1();
        C17161o oVar = this.f30061g;
        if (oVar != null) {
            RelativeLayout c = oVar.mo3946b();
            C41536l.m120488h(c, "binding.root");
            return c;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    public void onDestroy() {
        C17161o oVar = this.f30061g;
        if (oVar != null) {
            oVar.f48116g.mo29320I(this.f30072r);
            C17161o oVar2 = this.f30061g;
            if (oVar2 != null) {
                oVar2.f48116g.mo29319H(this.f30073s);
                this.f30069o.removeCallbacksAndMessages((Object) null);
                super.onDestroy();
                return;
            }
            C41536l.m120506z("binding");
            throw null;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    public void onPause() {
        C17161o oVar = this.f30061g;
        if (oVar != null) {
            oVar.f48116g.mo29320I(this.f30072r);
            C17161o oVar2 = this.f30061g;
            if (oVar2 != null) {
                oVar2.f48116g.mo29319H(this.f30073s);
                this.f30069o.removeCallbacksAndMessages((Object) null);
                m38518b2("", 0);
                this.f30064j = false;
                this.f30063i = false;
                this.f30065k = false;
                this.f30067m = 0;
                super.onPause();
                return;
            }
            C41536l.m120506z("binding");
            throw null;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    public void onResume() {
        super.onResume();
        this.f30058d.mo26255q(getContext(), this.f30060f);
        m38497G1().mo45777kw();
        C40845o1 o1Var = this.f30070p;
        if (o1Var == null || !o1Var.mo95131k()) {
            C9800j jVar = this.f30071q;
            if (jVar == null) {
                this.f30069o.removeCallbacksAndMessages((Object) null);
                this.f30069o.postDelayed(new C18101t(this), 3000);
                return;
            }
            m38500J1(jVar);
            this.f30071q = null;
        }
    }
}
