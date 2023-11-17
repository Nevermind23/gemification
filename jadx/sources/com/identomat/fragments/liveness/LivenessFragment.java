package com.identomat.fragments.liveness;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.C0173b;
import androidx.core.content.C0767a;
import androidx.fragment.app.C1493e0;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1629r;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import com.github.mikephil.charting.utils.Utils;
import com.identomat.activities.NavigationActivity;
import com.otaliastudios.cameraview.C11280b;
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
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
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
import p359bd.C10226a;
import p359bd.C10227b;
import p359bd.C10235h;
import p373cd.C10394a;
import p374ce.C10396b;
import p388dd.C12073a;
import p458id.C15599a;
import p472jd.C15753j;
import p485kc.C16341a;
import p485kc.C16344b;
import p485kc.C16346d;
import p485kc.C16347e;
import p541oc.C17159m;
import p569qc.C17485b;
import p624uc.C18075b;
import p624uc.C18077c;
import p624uc.C18078d;
import p624uc.C18079e;
import p624uc.C18080f;
import p624uc.C18081g;
import p624uc.C18082h;
import p624uc.C18083i;
import p624uc.C18084j;
import p624uc.C18085k;
import p624uc.C18086l;
import p624uc.C18087m;
import p624uc.C18088n;
import p624uc.C18089o;
import p624uc.C18090p;
import p624uc.C18091q;
import p624uc.C18092r;
import p624uc.C18093s;
import p625ud.C18110b;
import p625ud.C18112d;
import p678yc.C18877a;
import p692zc.C18999c;
import p692zc.C19002e;
import ue1.C43064a;
import ue1.C43079p;

public final class LivenessFragment extends Fragment {

    /* renamed from: A */
    private static final String[] f29991A = {"android.permission.CAMERA"};

    /* renamed from: z */
    public static final C10559a f29992z = new C10559a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C9786e f29993d;

    /* renamed from: e */
    private final C18877a f29994e;

    /* renamed from: f */
    private final String f29995f = "liveness_page";

    /* renamed from: g */
    private C17159m f29996g;

    /* renamed from: h */
    private final C41217g f29997h;

    /* renamed from: i */
    private boolean f29998i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f29999j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f30000k;

    /* renamed from: l */
    private int f30001l;

    /* renamed from: m */
    private int f30002m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public File f30003n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f30004o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public int f30005p;

    /* renamed from: q */
    private final int f30006q;

    /* renamed from: r */
    private final Handler f30007r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C40845o1 f30008s;

    /* renamed from: t */
    private Fragment f30009t;

    /* renamed from: u */
    private Fragment f30010u;

    /* renamed from: v */
    private C9800j f30011v;

    /* renamed from: w */
    private boolean f30012w;

    /* renamed from: x */
    private final C18112d f30013x;

    /* renamed from: y */
    private final C10560b f30014y;

    /* renamed from: com.identomat.fragments.liveness.LivenessFragment$a */
    public static final class C10559a {
        private C10559a() {
        }

        public /* synthetic */ C10559a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.identomat.fragments.liveness.LivenessFragment$b */
    public static final class C10560b extends C15599a {

        /* renamed from: a */
        final /* synthetic */ LivenessFragment f30015a;

        /* renamed from: com.identomat.fragments.liveness.LivenessFragment$b$a */
        static final class C10561a extends C41862l implements C43079p {

            /* renamed from: h */
            Object f30016h;

            /* renamed from: i */
            int f30017i;

            /* renamed from: j */
            final /* synthetic */ LivenessFragment f30018j;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10561a(LivenessFragment livenessFragment, Continuation continuation) {
                super(2, continuation);
                this.f30018j = livenessFragment;
            }

            /* renamed from: a */
            public final Continuation mo3708a(Object obj, Continuation continuation) {
                return new C10561a(this.f30018j, continuation);
            }

            /* renamed from: f */
            public final Object mo3709f(Object obj) {
                LivenessFragment livenessFragment;
                Object c = C41793d.m121157c();
                int i = this.f30017i;
                if (i == 0) {
                    C41228o.m119483b(obj);
                    File B1 = this.f30018j.f30003n;
                    if (B1 != null) {
                        LivenessFragment livenessFragment2 = this.f30018j;
                        if (livenessFragment2.f30000k) {
                            livenessFragment2.f30000k = false;
                            try {
                                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                                mediaMetadataRetriever.setDataSource(livenessFragment2.getContext(), Uri.fromFile(livenessFragment2.f30003n));
                                Log.i("identomat_", C41536l.m120497q("video duration: ", mediaMetadataRetriever.extractMetadata(9)));
                                Log.i("identomat_", C41536l.m120497q("video size: ", C41851b.m121257d(B1.length() / ((long) C11398b.f33141t))));
                                mediaMetadataRetriever.release();
                            } catch (Exception e) {
                                Log.e("catch", String.valueOf(e.getMessage()));
                            }
                            this.f30016h = livenessFragment2;
                            this.f30017i = 1;
                            if (livenessFragment2.m38377A2(B1, this) == c) {
                                return c;
                            }
                            livenessFragment = livenessFragment2;
                        } else {
                            B1.delete();
                        }
                    }
                    return C41238w.f97225a;
                } else if (i == 1) {
                    livenessFragment = (LivenessFragment) this.f30016h;
                    C41228o.m119483b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                livenessFragment.f30003n = null;
                return C41238w.f97225a;
            }

            /* renamed from: n */
            public final Object invoke(C40814h0 h0Var, Continuation continuation) {
                return ((C10561a) mo3708a(h0Var, continuation)).mo3709f(C41238w.f97225a);
            }
        }

        C10560b(LivenessFragment livenessFragment) {
            this.f30015a = livenessFragment;
        }

        /* renamed from: j */
        public void mo27286j() {
            Log.i("identomat_", "onVideoRecordingEnd");
            this.f30015a.m38463y2();
        }

        /* renamed from: k */
        public void mo27287k() {
            Log.i("identomat_", "onVideoRecordingStart");
            this.f30015a.m38407R2();
        }

        /* renamed from: l */
        public void mo27288l(C11280b bVar) {
            C41536l.m120489i(bVar, "result");
            LivenessFragment livenessFragment = this.f30015a;
            livenessFragment.f30008s = C40821j.m118316b(C1629r.m5683a(livenessFragment), C40867u0.m118468b(), (C40822j0) null, new C10561a(this.f30015a, (Continuation) null), 2, (Object) null);
        }
    }

    /* renamed from: com.identomat.fragments.liveness.LivenessFragment$c */
    static final class C10562c extends C41862l implements C43079p {

        /* renamed from: h */
        int f30019h;

        /* renamed from: i */
        final /* synthetic */ LivenessFragment f30020i;

        /* renamed from: j */
        final /* synthetic */ Bitmap f30021j;

        /* renamed from: k */
        final /* synthetic */ int f30022k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10562c(LivenessFragment livenessFragment, Bitmap bitmap, int i, Continuation continuation) {
            super(2, continuation);
            this.f30020i = livenessFragment;
            this.f30021j = bitmap;
            this.f30022k = i;
        }

        /* renamed from: a */
        public final Continuation mo3708a(Object obj, Continuation continuation) {
            return new C10562c(this.f30020i, this.f30021j, this.f30022k, continuation);
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            Object c = C41793d.m121157c();
            int i = this.f30019h;
            if (i == 0) {
                C41228o.m119483b(obj);
                this.f30019h = 1;
                if (this.f30020i.m38459w2(this.f30021j, (float) this.f30022k, this) == c) {
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
            return ((C10562c) mo3708a(h0Var, continuation)).mo3709f(C41238w.f97225a);
        }
    }

    /* renamed from: com.identomat.fragments.liveness.LivenessFragment$d */
    static final class C10563d extends C41862l implements C43079p {

        /* renamed from: h */
        int f30023h;

        /* renamed from: i */
        final /* synthetic */ C9800j f30024i;

        /* renamed from: j */
        final /* synthetic */ LivenessFragment f30025j;

        /* renamed from: com.identomat.fragments.liveness.LivenessFragment$d$a */
        static final class C10564a extends C41862l implements C43079p {

            /* renamed from: h */
            int f30026h;

            /* renamed from: i */
            final /* synthetic */ LivenessFragment f30027i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10564a(LivenessFragment livenessFragment, Continuation continuation) {
                super(2, continuation);
                this.f30027i = livenessFragment;
            }

            /* renamed from: a */
            public final Continuation mo3708a(Object obj, Continuation continuation) {
                return new C10564a(this.f30027i, continuation);
            }

            /* renamed from: f */
            public final Object mo3709f(Object obj) {
                Object c = C41793d.m121157c();
                int i = this.f30026h;
                if (i == 0) {
                    C41228o.m119483b(obj);
                    this.f30026h = 1;
                    if (C40850p0.m118424a(1000, this) == c) {
                        return c;
                    }
                } else if (i == 1) {
                    C41228o.m119483b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this.f30027i.f29999j = true;
                return C41238w.f97225a;
            }

            /* renamed from: n */
            public final Object invoke(C40814h0 h0Var, Continuation continuation) {
                return ((C10564a) mo3708a(h0Var, continuation)).mo3709f(C41238w.f97225a);
            }
        }

        /* renamed from: com.identomat.fragments.liveness.LivenessFragment$d$b */
        public /* synthetic */ class C10565b {

            /* renamed from: a */
            public static final /* synthetic */ int[] f30028a;

            static {
                int[] iArr = new int[C9801k.values().length];
                iArr[C9801k.SUCCESS.ordinal()] = 1;
                iArr[C9801k.SESSION_ENDED.ordinal()] = 2;
                f30028a = iArr;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10563d(C9800j jVar, LivenessFragment livenessFragment, Continuation continuation) {
            super(2, continuation);
            this.f30024i = jVar;
            this.f30025j = livenessFragment;
        }

        /* renamed from: a */
        public final Continuation mo3708a(Object obj, Continuation continuation) {
            return new C10563d(this.f30024i, this.f30025j, continuation);
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            Object unused = C41793d.m121157c();
            if (this.f30023h == 0) {
                C41228o.m119483b(obj);
                int i = C10565b.f30028a[this.f30024i.mo26295c().ordinal()];
                if (i == 1) {
                    this.f30025j.m38417W2();
                } else if (i != 2) {
                    C40845o1 unused2 = C40821j.m118316b(C1629r.m5683a(this.f30025j), C40867u0.m118468b(), (C40822j0) null, new C10564a(this.f30025j, (Continuation) null), 2, (Object) null);
                } else {
                    C10394a.m37798b("identomat_", (String) null, 2, (Object) null);
                }
                return C41238w.f97225a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: n */
        public final Object invoke(C40814h0 h0Var, Continuation continuation) {
            return ((C10563d) mo3708a(h0Var, continuation)).mo3709f(C41238w.f97225a);
        }
    }

    /* renamed from: com.identomat.fragments.liveness.LivenessFragment$e */
    static final class C10566e extends C41862l implements C43079p {

        /* renamed from: h */
        int f30029h;

        /* renamed from: i */
        final /* synthetic */ C9800j f30030i;

        /* renamed from: j */
        final /* synthetic */ LivenessFragment f30031j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10566e(C9800j jVar, LivenessFragment livenessFragment, Continuation continuation) {
            super(2, continuation);
            this.f30030i = jVar;
            this.f30031j = livenessFragment;
        }

        /* renamed from: a */
        public final Continuation mo3708a(Object obj, Continuation continuation) {
            return new C10566e(this.f30030i, this.f30031j, continuation);
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            Object unused = C41793d.m121157c();
            if (this.f30029h == 0) {
                C41228o.m119483b(obj);
                if (this.f30030i.mo26295c() != C9801k.SUCCESS) {
                    this.f30031j.m38419Y2();
                } else if (C41536l.m120484d(this.f30030i.mo26294b(), "true")) {
                    this.f30031j.m38418X2();
                } else {
                    this.f30031j.m38419Y2();
                }
                return C41238w.f97225a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: n */
        public final Object invoke(C40814h0 h0Var, Continuation continuation) {
            return ((C10566e) mo3708a(h0Var, continuation)).mo3709f(C41238w.f97225a);
        }
    }

    /* renamed from: com.identomat.fragments.liveness.LivenessFragment$f */
    static final class C10567f extends C41862l implements C43079p {

        /* renamed from: h */
        int f30032h;

        /* renamed from: i */
        final /* synthetic */ LivenessFragment f30033i;

        /* renamed from: j */
        final /* synthetic */ Context f30034j;

        /* renamed from: com.identomat.fragments.liveness.LivenessFragment$f$a */
        public /* synthetic */ class C10568a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f30035a;

            static {
                int[] iArr = new int[C9801k.values().length];
                iArr[C9801k.SUCCESS.ordinal()] = 1;
                iArr[C9801k.NO_CONNECTION.ordinal()] = 2;
                f30035a = iArr;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10567f(LivenessFragment livenessFragment, Context context, Continuation continuation) {
            super(2, continuation);
            this.f30033i = livenessFragment;
            this.f30034j = context;
        }

        /* renamed from: a */
        public final Continuation mo3708a(Object obj, Continuation continuation) {
            return new C10567f(this.f30033i, this.f30034j, continuation);
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            Object c = C41793d.m121157c();
            int i = this.f30032h;
            if (i == 0) {
                C41228o.m119483b(obj);
                C18093s C1 = this.f30033i.m38420Z1();
                Context context = this.f30034j;
                C41536l.m120488h(context, "context");
                this.f30032h = 1;
                obj = C1.mo45775iw(context, this);
                if (obj == c) {
                    return c;
                }
            } else if (i == 1) {
                C41228o.m119483b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C41224m mVar = (C41224m) obj;
            int i2 = C10568a.f30035a[((C9800j) mVar.mo95678e()).mo26295c().ordinal()];
            if (i2 == 1) {
                C41224m mVar2 = (C41224m) mVar.mo95680f();
                if (mVar2 != null) {
                    LivenessFragment livenessFragment = this.f30033i;
                    livenessFragment.f30004o = ((Number) mVar2.mo95678e()).intValue();
                    livenessFragment.f30005p = ((Number) mVar2.mo95680f()).intValue();
                    livenessFragment.m38383D2();
                }
            } else if (i2 != 2) {
                C10394a.m37798b("identomat_", (String) null, 2, (Object) null);
            } else {
                this.f30033i.m38390H2();
            }
            return C41238w.f97225a;
        }

        /* renamed from: n */
        public final Object invoke(C40814h0 h0Var, Continuation continuation) {
            return ((C10567f) mo3708a(h0Var, continuation)).mo3709f(C41238w.f97225a);
        }
    }

    /* renamed from: com.identomat.fragments.liveness.LivenessFragment$g */
    static final class C10569g extends C41853d {

        /* renamed from: g */
        /* synthetic */ Object f30036g;

        /* renamed from: h */
        final /* synthetic */ LivenessFragment f30037h;

        /* renamed from: i */
        int f30038i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10569g(LivenessFragment livenessFragment, Continuation continuation) {
            super(continuation);
            this.f30037h = livenessFragment;
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            this.f30036g = obj;
            this.f30038i |= Integer.MIN_VALUE;
            return this.f30037h.m38459w2((Bitmap) null, Utils.FLOAT_EPSILON, this);
        }
    }

    /* renamed from: com.identomat.fragments.liveness.LivenessFragment$h */
    static final class C10570h extends C41853d {

        /* renamed from: g */
        Object f30039g;

        /* renamed from: h */
        /* synthetic */ Object f30040h;

        /* renamed from: i */
        final /* synthetic */ LivenessFragment f30041i;

        /* renamed from: j */
        int f30042j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10570h(LivenessFragment livenessFragment, Continuation continuation) {
            super(continuation);
            this.f30041i = livenessFragment;
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            this.f30040h = obj;
            this.f30042j |= Integer.MIN_VALUE;
            return this.f30041i.m38465z2((Bitmap) null, this);
        }
    }

    /* renamed from: com.identomat.fragments.liveness.LivenessFragment$i */
    static final class C10571i extends C41853d {

        /* renamed from: g */
        Object f30043g;

        /* renamed from: h */
        /* synthetic */ Object f30044h;

        /* renamed from: i */
        final /* synthetic */ LivenessFragment f30045i;

        /* renamed from: j */
        int f30046j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10571i(LivenessFragment livenessFragment, Continuation continuation) {
            super(continuation);
            this.f30045i = livenessFragment;
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            this.f30044h = obj;
            this.f30046j |= Integer.MIN_VALUE;
            return this.f30045i.m38377A2((File) null, this);
        }
    }

    /* renamed from: com.identomat.fragments.liveness.LivenessFragment$j */
    static final class C10572j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ LivenessFragment f30047d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10572j(LivenessFragment livenessFragment) {
            super(0);
            this.f30047d = livenessFragment;
        }

        public final void invoke() {
            this.f30047d.mo27283L2();
        }
    }

    /* renamed from: com.identomat.fragments.liveness.LivenessFragment$k */
    static final class C10573k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ LivenessFragment f30048d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10573k(LivenessFragment livenessFragment) {
            super(0);
            this.f30048d = livenessFragment;
        }

        public final void invoke() {
            this.f30048d.mo27283L2();
        }
    }

    /* renamed from: com.identomat.fragments.liveness.LivenessFragment$l */
    static final class C10574l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ LivenessFragment f30049d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10574l(LivenessFragment livenessFragment) {
            super(0);
            this.f30049d = livenessFragment;
        }

        public final void invoke() {
            this.f30049d.m38461x2();
            this.f30049d.m38427f2();
        }
    }

    /* renamed from: com.identomat.fragments.liveness.LivenessFragment$m */
    public static final class C10575m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f30050d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10575m(Fragment fragment) {
            super(0);
            this.f30050d = fragment;
        }

        public final Fragment invoke() {
            return this.f30050d;
        }
    }

    /* renamed from: com.identomat.fragments.liveness.LivenessFragment$n */
    public static final class C10576n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f30051d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10576n(C43064a aVar) {
            super(0);
            this.f30051d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f30051d.invoke();
        }
    }

    /* renamed from: com.identomat.fragments.liveness.LivenessFragment$o */
    public static final class C10577o extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f30052d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10577o(C41217g gVar) {
            super(0);
            this.f30052d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f30052d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: com.identomat.fragments.liveness.LivenessFragment$p */
    public static final class C10578p extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f30053d;

        /* renamed from: e */
        final /* synthetic */ C41217g f30054e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10578p(C43064a aVar, C41217g gVar) {
            super(0);
            this.f30053d = aVar;
            this.f30054e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f30053d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f30054e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: com.identomat.fragments.liveness.LivenessFragment$q */
    public static final class C10579q implements Comparator {
        public final int compare(Object obj, Object obj2) {
            return C41506d.m120406e(Integer.valueOf(((C10396b) obj).mo27062e()), Integer.valueOf(((C10396b) obj2).mo27062e()));
        }
    }

    /* renamed from: com.identomat.fragments.liveness.LivenessFragment$r */
    static final class C10580r extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ LivenessFragment f30055d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10580r(LivenessFragment livenessFragment) {
            super(0);
            this.f30055d = livenessFragment;
        }

        public final C1620q0.C1624b invoke() {
            return new C17485b(this.f30055d.mo27284X1(), (C9793g) null, (C9796h) null, 6, (DefaultConstructorMarker) null);
        }
    }

    public LivenessFragment(C9786e eVar, C18877a aVar) {
        C41536l.m120489i(eVar, "api");
        C41536l.m120489i(aVar, "identomatConfig");
        this.f29993d = eVar;
        this.f29994e = aVar;
        C10580r rVar = new C10580r(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C10576n(new C10575m(this)));
        this.f29997h = C1514j0.m5374c(this, C41520a0.m120436b(C18093s.class), new C10577o(a), new C10578p((C43064a) null, a), rVar);
        this.f30006q = 20;
        this.f30007r = new Handler(Looper.getMainLooper());
        this.f30013x = new C18086l(this);
        this.f30014y = new C10560b(this);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: A2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m38377A2(java.io.File r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.identomat.fragments.liveness.LivenessFragment.C10571i
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.identomat.fragments.liveness.LivenessFragment$i r0 = (com.identomat.fragments.liveness.LivenessFragment.C10571i) r0
            int r1 = r0.f30046j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f30046j = r1
            goto L_0x0018
        L_0x0013:
            com.identomat.fragments.liveness.LivenessFragment$i r0 = new com.identomat.fragments.liveness.LivenessFragment$i
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f30044h
            java.lang.Object r1 = ne1.C41793d.m121157c()
            int r2 = r0.f30046j
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r5 = r0.f30043g
            com.identomat.fragments.liveness.LivenessFragment r5 = (com.identomat.fragments.liveness.LivenessFragment) r5
            he1.C41228o.m119483b(r6)
            goto L_0x004f
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            he1.C41228o.m119483b(r6)
            android.content.Context r6 = r4.getContext()
            if (r6 != 0) goto L_0x003f
            goto L_0x0067
        L_0x003f:
            uc.s r2 = r4.m38420Z1()
            r0.f30043g = r4
            r0.f30046j = r3
            java.lang.Object r6 = r2.mo45779mw(r6, r5, r3, r0)
            if (r6 != r1) goto L_0x004e
            return r1
        L_0x004e:
            r5 = r4
        L_0x004f:
            ad.j r6 = (p345ad.C9800j) r6
            androidx.lifecycle.j r0 = r5.getLifecycle()
            androidx.lifecycle.j$b r0 = r0.mo4907b()
            androidx.lifecycle.j$b r1 = androidx.lifecycle.C1593j.C1598b.RESUMED
            boolean r0 = r0.mo4914b(r1)
            if (r0 == 0) goto L_0x0065
            r5.m38425d2(r6)
            goto L_0x0067
        L_0x0065:
            r5.f30011v = r6
        L_0x0067:
            he1.w r5 = he1.C41238w.f97225a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.identomat.fragments.liveness.LivenessFragment.m38377A2(java.io.File, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: B2 */
    private final void m38379B2(String str, int i) {
        if (this.f29998i) {
            this.f30007r.post(new C18091q(str, this, i));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C2 */
    public static final void m38381C2(String str, LivenessFragment livenessFragment, int i) {
        boolean z;
        C41536l.m120489i(str, "$text");
        C41536l.m120489i(livenessFragment, "this$0");
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C17159m mVar = livenessFragment.f29996g;
            if (mVar != null) {
                mVar.f48099u.setVisibility(0);
                C17159m mVar2 = livenessFragment.f29996g;
                if (mVar2 != null) {
                    mVar2.f48099u.setText(livenessFragment.mo27285Y1().mo46864d().mo47124d(livenessFragment.getContext(), str));
                } else {
                    C41536l.m120506z("binding");
                    throw null;
                }
            } else {
                C41536l.m120506z("binding");
                throw null;
            }
        }
        if (livenessFragment.f30001l != i) {
            livenessFragment.f30001l = i;
            if (i == 0) {
                C17159m mVar3 = livenessFragment.f29996g;
                if (mVar3 != null) {
                    mVar3.f48088j.clearAnimation();
                    C17159m mVar4 = livenessFragment.f29996g;
                    if (mVar4 != null) {
                        mVar4.f48088j.setImageResource(C16346d.identomat_ic_arrow_down);
                        C17159m mVar5 = livenessFragment.f29996g;
                        if (mVar5 != null) {
                            mVar5.f48099u.setVisibility(8);
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
                C17159m mVar6 = livenessFragment.f29996g;
                if (mVar6 != null) {
                    mVar6.f48088j.clearAnimation();
                    C17159m mVar7 = livenessFragment.f29996g;
                    if (mVar7 != null) {
                        mVar7.f48088j.setImageResource(C16346d.identomat_ic_loading_icon);
                        RotateAnimation rotateAnimation = new RotateAnimation(Utils.FLOAT_EPSILON, 360.0f, 1, 0.5f, 1, 0.5f);
                        rotateAnimation.setRepeatCount(-1);
                        rotateAnimation.setDuration(1000);
                        rotateAnimation.setInterpolator(new LinearInterpolator());
                        C17159m mVar8 = livenessFragment.f29996g;
                        if (mVar8 != null) {
                            mVar8.f48088j.startAnimation(rotateAnimation);
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
                C17159m mVar9 = livenessFragment.f29996g;
                if (mVar9 != null) {
                    mVar9.f48088j.clearAnimation();
                    C17159m mVar10 = livenessFragment.f29996g;
                    if (mVar10 != null) {
                        mVar10.f48088j.setImageResource(C16346d.identomat_success_icon);
                        C17159m mVar11 = livenessFragment.f29996g;
                        if (mVar11 != null) {
                            mVar11.f48099u.setVisibility(8);
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

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: bd.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: bd.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: bd.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: bd.f} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: D2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m38383D2() {
        /*
            r4 = this;
            yc.a r0 = r4.f29994e
            zc.i r0 = r0.mo46867g()
            boolean r0 = r0.mo47151p()
            if (r0 == 0) goto L_0x0017
            android.os.Handler r0 = r4.f30007r
            uc.a r1 = new uc.a
            r1.<init>(r4)
            r0.post(r1)
            return
        L_0x0017:
            androidx.fragment.app.Fragment r0 = r4.f30010u
            if (r0 == 0) goto L_0x001c
            return
        L_0x001c:
            boolean r0 = r4.f30012w
            if (r0 == 0) goto L_0x0030
            bd.d r0 = new bd.d
            yc.a r1 = r4.f29994e
            r0.<init>(r1)
            com.identomat.fragments.liveness.LivenessFragment$j r1 = new com.identomat.fragments.liveness.LivenessFragment$j
            r1.<init>(r4)
            r0.mo26791o1(r1)
            goto L_0x003f
        L_0x0030:
            bd.f r0 = new bd.f
            yc.a r1 = r4.f29994e
            r0.<init>(r1)
            com.identomat.fragments.liveness.LivenessFragment$k r1 = new com.identomat.fragments.liveness.LivenessFragment$k
            r1.<init>(r4)
            r0.mo26794p1(r1)
        L_0x003f:
            r4.f30010u = r0
            androidx.fragment.app.FragmentManager r1 = r4.getParentFragmentManager()     // Catch:{ Exception -> 0x0081 }
            androidx.fragment.app.e0 r1 = r1.mo4428p()     // Catch:{ Exception -> 0x0081 }
            java.lang.String r2 = "parentFragmentManager.beginTransaction()"
            kotlin.jvm.internal.C41536l.m120488h(r1, r2)     // Catch:{ Exception -> 0x0081 }
            int r2 = p485kc.C16344b.identomat_slide_in_left     // Catch:{ Exception -> 0x0081 }
            int r3 = p485kc.C16344b.identomat_slide_out_right     // Catch:{ Exception -> 0x0081 }
            r1.mo4641t(r2, r3)     // Catch:{ Exception -> 0x0081 }
            oc.m r2 = r4.f29996g     // Catch:{ Exception -> 0x0081 }
            if (r2 == 0) goto L_0x007a
            androidx.fragment.app.FragmentContainerView r2 = r2.f48094p     // Catch:{ Exception -> 0x0081 }
            java.lang.String r3 = "binding.livenessInstructionsContainer"
            kotlin.jvm.internal.C41536l.m120488h(r2, r3)     // Catch:{ Exception -> 0x0081 }
            int r2 = r2.getChildCount()     // Catch:{ Exception -> 0x0081 }
            if (r2 != 0) goto L_0x0068
            r2 = 1
            goto L_0x0069
        L_0x0068:
            r2 = 0
        L_0x0069:
            if (r2 == 0) goto L_0x0071
            int r2 = p485kc.C16347e.liveness_info_container     // Catch:{ Exception -> 0x0081 }
            r1.mo4631b(r2, r0)     // Catch:{ Exception -> 0x0081 }
            goto L_0x0076
        L_0x0071:
            int r2 = p485kc.C16347e.liveness_info_container     // Catch:{ Exception -> 0x0081 }
            r1.mo4639r(r2, r0)     // Catch:{ Exception -> 0x0081 }
        L_0x0076:
            r1.mo4515i()     // Catch:{ Exception -> 0x0081 }
            return
        L_0x007a:
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.C41536l.m120506z(r0)     // Catch:{ Exception -> 0x0081 }
            r0 = 0
            throw r0     // Catch:{ Exception -> 0x0081 }
        L_0x0081:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.identomat.fragments.liveness.LivenessFragment.m38383D2():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: E2 */
    public static final void m38385E2(LivenessFragment livenessFragment) {
        C41536l.m120489i(livenessFragment, "this$0");
        livenessFragment.mo27283L2();
    }

    /* renamed from: F2 */
    private final void m38387F2() {
        C17159m mVar = this.f29996g;
        if (mVar != null) {
            mVar.f48100v.setVisibility(0);
            C17159m mVar2 = this.f29996g;
            if (mVar2 != null) {
                mVar2.f48087i.setVisibility(0);
                C17159m mVar3 = this.f29996g;
                if (mVar3 != null) {
                    mVar3.f48086h.setVisibility(0);
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
    /* renamed from: H2 */
    public final void m38390H2() {
        boolean z;
        C10235h hVar = new C10235h(this.f29994e, new C10574l(this));
        C1493e0 p = getParentFragmentManager().mo4428p();
        C41536l.m120488h(p, "parentFragmentManager.beginTransaction()");
        p.mo4641t(C16344b.identomat_slide_in_left, C16344b.identomat_slide_out_right);
        C17159m mVar = this.f29996g;
        if (mVar != null) {
            FragmentContainerView fragmentContainerView = mVar.f48094p;
            C41536l.m120488h(fragmentContainerView, "binding.livenessInstructionsContainer");
            if (fragmentContainerView.getChildCount() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                p.mo4631b(C16347e.liveness_info_container, hVar);
            } else {
                p.mo4639r(C16347e.liveness_info_container, hVar);
            }
            p.mo4515i();
            this.f30010u = hVar;
            return;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    /* renamed from: I2 */
    private final void m38392I2() {
        FragmentManager fragmentManager;
        C1493e0 e0Var;
        C41238w wVar;
        boolean z = false;
        if (this.f29994e.mo46867g().mo47147l() == 2) {
            C17159m mVar = this.f29996g;
            if (mVar != null) {
                mVar.f48092n.setVisibility(0);
                C17159m mVar2 = this.f29996g;
                if (mVar2 != null) {
                    mVar2.f48093o.setText(this.f29994e.mo46864d().mo47124d(getContext(), "smile"));
                    Integer k = this.f29994e.mo46867g().mo47146k();
                    if (k == null) {
                        wVar = null;
                    } else {
                        int intValue = k.intValue();
                        C17159m mVar3 = this.f29996g;
                        if (mVar3 != null) {
                            mVar3.f48092n.setImageResource(intValue);
                            wVar = C41238w.f97225a;
                        } else {
                            C41536l.m120506z("binding");
                            throw null;
                        }
                    }
                    if (wVar == null) {
                        C17159m mVar4 = this.f29996g;
                        if (mVar4 != null) {
                            mVar4.f48092n.setImageResource(C16346d.identomat_smile_2);
                        } else {
                            C41536l.m120506z("binding");
                            throw null;
                        }
                    }
                    C17159m mVar5 = this.f29996g;
                    if (mVar5 != null) {
                        mVar5.f48092n.animate().scaleX(0.7f).scaleY(0.7f).setDuration(200).withEndAction(new C18082h(this));
                        C17159m mVar6 = this.f29996g;
                        if (mVar6 != null) {
                            mVar6.f48093o.animate().scaleX(0.7f).scaleY(0.7f).setDuration(200).withEndAction(new C18083i(this));
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
            C10227b bVar = new C10227b(true, this.f29994e);
            C1505h activity = getActivity();
            if (activity == null) {
                fragmentManager = null;
            } else {
                fragmentManager = activity.getSupportFragmentManager();
            }
            if (fragmentManager == null) {
                e0Var = null;
            } else {
                e0Var = fragmentManager.mo4428p();
            }
            if (e0Var != null) {
                e0Var.mo4641t(C16344b.identomat_appear, C16344b.identomat_disappear);
            }
            C17159m mVar7 = this.f29996g;
            if (mVar7 != null) {
                FragmentContainerView fragmentContainerView = mVar7.f48094p;
                C41536l.m120488h(fragmentContainerView, "binding.livenessInstructionsContainer");
                if (fragmentContainerView.getChildCount() == 0) {
                    z = true;
                }
                if (z) {
                    if (e0Var != null) {
                        e0Var.mo4631b(C16347e.liveness_instructions_container, bVar);
                    }
                } else if (e0Var != null) {
                    e0Var.mo4639r(C16347e.liveness_instructions_container, bVar);
                }
                this.f30009t = bVar;
                if (e0Var != null) {
                    e0Var.mo4515i();
                    return;
                }
                return;
            }
            C41536l.m120506z("binding");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J2 */
    public static final void m38394J2(LivenessFragment livenessFragment) {
        C41536l.m120489i(livenessFragment, "this$0");
        C17159m mVar = livenessFragment.f29996g;
        if (mVar != null) {
            mVar.f48092n.animate().scaleX(1.0f).scaleY(1.0f).setDuration(300);
        } else {
            C41536l.m120506z("binding");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: K2 */
    public static final void m38396K2(LivenessFragment livenessFragment) {
        C41536l.m120489i(livenessFragment, "this$0");
        C17159m mVar = livenessFragment.f29996g;
        if (mVar != null) {
            mVar.f48093o.animate().scaleX(1.0f).scaleY(1.0f).setDuration(200);
        } else {
            C41536l.m120506z("binding");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: M2 */
    public static final void m38399M2(LivenessFragment livenessFragment) {
        C41536l.m120489i(livenessFragment, "this$0");
        livenessFragment.f29999j = true;
    }

    /* renamed from: O2 */
    private final void m38402O2() {
        C17159m mVar = this.f29996g;
        if (mVar != null) {
            mVar.f48085g.setLifecycleOwner(this);
            C17159m mVar2 = this.f29996g;
            if (mVar2 != null) {
                mVar2.f48085g.setMode(C15753j.VIDEO);
                C17159m mVar3 = this.f29996g;
                if (mVar3 != null) {
                    mVar3.f48085g.setFrameProcessingFormat(35);
                    C17159m mVar4 = this.f29996g;
                    if (mVar4 != null) {
                        mVar4.f48085g.setVideoSize(new C18077c());
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
    /* renamed from: P2 */
    public static final List m38404P2(List list) {
        Integer num;
        Object obj;
        Integer num2;
        Object obj2;
        boolean z;
        boolean z2;
        C41536l.m120489i(list, "nativeSizes");
        ArrayList arrayList = new ArrayList();
        if (list.size() > 1) {
            C41349u.m119946y(list, new C10579q());
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C10396b bVar = (C10396b) it.next();
        }
        Iterator it2 = list.iterator();
        while (true) {
            num = null;
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (((C10396b) obj).mo27062e() == 480) {
                z2 = true;
                continue;
            } else {
                z2 = false;
                continue;
            }
            if (z2) {
                break;
            }
        }
        C10396b bVar2 = (C10396b) obj;
        if (bVar2 != null) {
            arrayList.add(bVar2);
        } else {
            Iterator it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it3.next();
                if (((C10396b) obj2).mo27062e() > 350) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            bVar2 = (C10396b) obj2;
            if (bVar2 != null) {
                arrayList.add(bVar2);
            }
        }
        StringBuilder sb = new StringBuilder();
        if (bVar2 == null) {
            num2 = null;
        } else {
            num2 = Integer.valueOf(bVar2.mo27062e());
        }
        sb.append(num2);
        sb.append(' ');
        if (bVar2 != null) {
            num = Integer.valueOf(bVar2.mo27060c());
        }
        sb.append(num);
        Log.d("identomat_", sb.toString());
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: R2 */
    public final void m38407R2() {
        m38413U2();
        m38444o2();
        this.f30007r.postDelayed(new C18075b(this), (long) this.f30004o);
    }

    /* access modifiers changed from: private */
    /* renamed from: S2 */
    public static final void m38409S2(LivenessFragment livenessFragment) {
        C41536l.m120489i(livenessFragment, "this$0");
        livenessFragment.m38392I2();
        livenessFragment.f30007r.postDelayed(new C18078d(livenessFragment), (long) livenessFragment.f30005p);
    }

    /* access modifiers changed from: private */
    /* renamed from: T2 */
    public static final void m38411T2(LivenessFragment livenessFragment) {
        C41536l.m120489i(livenessFragment, "this$0");
        livenessFragment.m38444o2();
    }

    /* renamed from: U2 */
    private final void m38413U2() {
        this.f30007r.postDelayed(new C18081g(this), 30);
    }

    /* renamed from: V1 */
    private final boolean m38414V1() {
        Integer num;
        String[] strArr = f29991A;
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
    /* renamed from: V2 */
    public static final void m38415V2(LivenessFragment livenessFragment) {
        C41536l.m120489i(livenessFragment, "this$0");
        C17159m mVar = livenessFragment.f29996g;
        if (mVar != null) {
            mVar.f48101w.setProgress(livenessFragment.f30002m);
            int i = livenessFragment.f30002m + 1;
            livenessFragment.f30002m = i;
            if (i >= 500 || !livenessFragment.f30000k) {
                C17159m mVar2 = livenessFragment.f29996g;
                if (mVar2 != null) {
                    ProgressBar progressBar = mVar2.f48101w;
                    if (mVar2 != null) {
                        progressBar.setProgress(progressBar.getMax());
                        livenessFragment.f30002m = 0;
                        return;
                    }
                    C41536l.m120506z("binding");
                    throw null;
                }
                C41536l.m120506z("binding");
                throw null;
            }
            livenessFragment.m38413U2();
            return;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: W1 */
    public static final void m38416W1(LivenessFragment livenessFragment, C18110b bVar) {
        C41536l.m120489i(livenessFragment, "this$0");
        C41536l.m120489i(bVar, "frame");
        if (livenessFragment.f29999j) {
            livenessFragment.f29999j = false;
            C40845o1 o1Var = livenessFragment.f30008s;
            if (o1Var == null || !o1Var.mo95131k()) {
                int e = bVar.mo45793e();
                bVar.mo45790b();
                try {
                    livenessFragment.f30008s = C40821j.m118316b(C1629r.m5683a(livenessFragment), C40867u0.m118468b(), (C40822j0) null, new C10562c(livenessFragment, C12073a.f35481a.mo32216a(bVar), e, (Continuation) null), 2, (Object) null);
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

    /* access modifiers changed from: private */
    /* renamed from: W2 */
    public final void m38417W2() {
        File file;
        this.f30000k = true;
        C17159m mVar = this.f29996g;
        if (mVar != null) {
            mVar.f48085g.mo29319H(this.f30014y);
            C17159m mVar2 = this.f29996g;
            if (mVar2 != null) {
                mVar2.f48085g.mo29377p(this.f30014y);
                Context context = getContext();
                if (context == null) {
                    file = null;
                } else {
                    file = context.getCacheDir();
                }
                File file2 = new File(file, "liveness.mp4");
                this.f30003n = file2;
                file2.createNewFile();
                File file3 = this.f30003n;
                if (file3 != null) {
                    C17159m mVar3 = this.f29996g;
                    if (mVar3 != null) {
                        mVar3.f48085g.mo29324N(file3, 15000);
                    } else {
                        C41536l.m120506z("binding");
                        throw null;
                    }
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
    /* renamed from: X2 */
    public final void m38418X2() {
        C16341a.f46171a.mo43313a(getActivity());
    }

    /* access modifiers changed from: private */
    /* renamed from: Y2 */
    public final void m38419Y2() {
        this.f30007r.post(new C18084j(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: Z1 */
    public final C18093s m38420Z1() {
        return (C18093s) this.f29997h.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: Z2 */
    public static final void m38421Z2(LivenessFragment livenessFragment) {
        C41536l.m120489i(livenessFragment, "this$0");
        C17159m mVar = livenessFragment.f29996g;
        if (mVar != null) {
            mVar.f48101w.setProgress(0);
            C17159m mVar2 = livenessFragment.f29996g;
            if (mVar2 != null) {
                mVar2.f48085g.setVisibility(0);
                livenessFragment.f30007r.removeCallbacksAndMessages((Object) null);
                livenessFragment.m38427f2();
                return;
            }
            C41536l.m120506z("binding");
            throw null;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    /* renamed from: a2 */
    private final void m38422a2() {
        Bundle bundle = new Bundle();
        bundle.putInt("frame", C16347e.livenessFragment);
        bundle.putBundle("bundle", getArguments());
        C8034d.m30522a(this).mo22123U();
        C8034d.m30522a(this).mo22119N(C16347e.cameraDenyFragment, bundle, NavigationActivity.f29874v.mo27261a());
    }

    /* renamed from: b2 */
    private final void m38423b2() {
        m38420Z1().mo45777kw();
        m38383D2();
    }

    /* renamed from: c2 */
    private final void m38424c2(C9800j jVar) {
        C40845o1 unused = C40821j.m118316b(C1629r.m5683a(this), C40867u0.m118469c(), (C40822j0) null, new C10563d(jVar, this, (Continuation) null), 2, (Object) null);
    }

    /* renamed from: d2 */
    private final void m38425d2(C9800j jVar) {
        C40845o1 unused = C40821j.m118316b(C1629r.m5683a(this), C40867u0.m118469c(), (C40822j0) null, new C10566e(jVar, this, (Continuation) null), 2, (Object) null);
    }

    /* renamed from: e2 */
    private final void m38426e2() {
        C17159m mVar = this.f29996g;
        if (mVar != null) {
            mVar.f48100v.setVisibility(4);
            C17159m mVar2 = this.f29996g;
            if (mVar2 != null) {
                mVar2.f48087i.setVisibility(4);
                C17159m mVar3 = this.f29996g;
                if (mVar3 != null) {
                    mVar3.f48086h.setVisibility(4);
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
    /* renamed from: f2 */
    public final void m38427f2() {
        Context context = getContext();
        if (context != null) {
            C40845o1 unused = C40821j.m118316b(C1629r.m5683a(this), C40867u0.m118468b(), (C40822j0) null, new C10567f(this, context, (Continuation) null), 2, (Object) null);
        }
    }

    /* renamed from: g2 */
    private final void m38428g2() {
        View view = (View) C16341a.f46171a.mo43318f().invoke();
        if (view != null) {
            try {
                C17159m mVar = this.f29996g;
                if (mVar != null) {
                    mVar.f48095q.removeAllViews();
                    ViewParent parent = view.getParent();
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(view);
                        C17159m mVar2 = this.f29996g;
                        if (mVar2 != null) {
                            mVar2.f48095q.addView(view);
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
            C17159m mVar3 = this.f29996g;
            if (mVar3 != null) {
                mVar3.f48098t.mo27360e(this.f29994e);
            } else {
                C41536l.m120506z("binding");
                throw null;
            }
        }
    }

    /* renamed from: h2 */
    private final void m38430h2() {
        if (m38414V1()) {
            try {
                m38402O2();
            } catch (Exception e) {
                Log.e("identomat_", String.valueOf(e.getMessage()));
            }
        } else if (getActivity() != null) {
            C0173b registerForActivityResult = registerForActivityResult(new C2105c(), new C18085k(this));
            C41536l.m120488h(registerForActivityResult, "registerForActivityResult(ActivityResultContracts.RequestPermission())\n                    { isGranted: Boolean ->\n                        if (isGranted) {\n                            startCamera()\n                        } else {\n                            goToCameraDeny()\n                        }\n                    }");
            registerForActivityResult.mo404a(f29991A[0]);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public static final void m38432i2(LivenessFragment livenessFragment, boolean z) {
        C41536l.m120489i(livenessFragment, "this$0");
        if (z) {
            livenessFragment.m38402O2();
        } else {
            livenessFragment.m38422a2();
        }
    }

    /* renamed from: j2 */
    private final void m38434j2() {
        Context context = getContext();
        if (context != null) {
            int i = (context.getResources().getDisplayMetrics().widthPixels / 6) * 5;
            float f = (float) i;
            C17159m mVar = this.f29996g;
            if (mVar != null) {
                float aspect = f * mVar.f48086h.getAspect();
                C17159m mVar2 = this.f29996g;
                if (mVar2 != null) {
                    mVar2.f48087i.getLayoutParams().height = (int) aspect;
                    C17159m mVar3 = this.f29996g;
                    if (mVar3 != null) {
                        mVar3.f48092n.getLayoutParams().width = (i / 3) * 2;
                        C17159m mVar4 = this.f29996g;
                        if (mVar4 != null) {
                            ViewGroup.LayoutParams layoutParams = mVar4.f48092n.getLayoutParams();
                            C17159m mVar5 = this.f29996g;
                            if (mVar5 != null) {
                                layoutParams.height = mVar5.f48092n.getLayoutParams().width / 2;
                                C17159m mVar6 = this.f29996g;
                                if (mVar6 != null) {
                                    mVar6.f48092n.setTranslationY(aspect / ((float) 4));
                                    C17159m mVar7 = this.f29996g;
                                    if (mVar7 != null) {
                                        mVar7.f48093o.setTranslationY((aspect / ((float) 2)) + ((float) 70));
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
        m38442n2(this);
        m38440m2(this);
        m38438l2(this);
        m38436k2(this);
        m38428g2();
    }

    /* renamed from: k2 */
    private static final void m38436k2(LivenessFragment livenessFragment) {
        C19002e.C19003a aVar = C19002e.f53052q;
        C1505h activity = livenessFragment.getActivity();
        C17159m mVar = livenessFragment.f29996g;
        if (mVar != null) {
            ImageView imageView = mVar.f48083e;
            C41536l.m120488h(imageView, "binding.backButton");
            C17159m mVar2 = livenessFragment.f29996g;
            if (mVar2 != null) {
                TextView textView = mVar2.f48084f;
                C41536l.m120488h(textView, "binding.backButtonTitleView");
                C19002e.C19003a.m64212c(aVar, activity, imageView, textView, false, livenessFragment.f29994e, 8, (Object) null);
                return;
            }
            C41536l.m120506z("binding");
            throw null;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    /* renamed from: l2 */
    private static final void m38438l2(LivenessFragment livenessFragment) {
        C17159m mVar = livenessFragment.f29996g;
        if (mVar != null) {
            mVar.mo3946b().setBackgroundColor(livenessFragment.f29994e.mo46861a().mo47093b().mo33033a());
            C19002e.C19003a aVar = C19002e.f53052q;
            C17159m mVar2 = livenessFragment.f29996g;
            if (mVar2 != null) {
                RelativeLayout relativeLayout = mVar2.f48089k;
                C41536l.m120488h(relativeLayout, "binding.indicatorView");
                aVar.mo47120f(relativeLayout, livenessFragment.f29994e.mo46861a().mo47099h().mo33033a());
                C17159m mVar3 = livenessFragment.f29996g;
                if (mVar3 != null) {
                    mVar3.f48096r.setTextColor(livenessFragment.f29994e.mo46861a().mo47099h().mo33033a());
                    Integer b = livenessFragment.f29994e.mo46867g().mo47137b();
                    if (b != null) {
                        int intValue = b.intValue();
                        Resources resources = livenessFragment.getResources();
                        C41536l.m120488h(resources, "resources");
                        aVar.mo47119e(intValue, resources);
                    }
                    C17159m mVar4 = livenessFragment.f29996g;
                    if (mVar4 != null) {
                        TextView textView = mVar4.f48093o;
                        C41536l.m120488h(textView, "binding.livenessInstructions2TextView");
                        aVar.mo47120f(textView, livenessFragment.f29994e.mo46861a().mo47099h().mo33033a());
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
        C41536l.m120506z("binding");
        throw null;
    }

    /* renamed from: m2 */
    private static final void m38440m2(LivenessFragment livenessFragment) {
        C18999c e = livenessFragment.f29994e.mo46867g().mo47140e();
        C17159m mVar = livenessFragment.f29996g;
        if (mVar != null) {
            TextView textView = mVar.f48100v;
            C41536l.m120488h(textView, "binding.titleView");
            e.mo47079g(textView, 0);
            C18999c e2 = livenessFragment.f29994e.mo46867g().mo47140e();
            C17159m mVar2 = livenessFragment.f29996g;
            if (mVar2 != null) {
                TextView textView2 = mVar2.f48099u;
                C41536l.m120488h(textView2, "binding.progressTextView");
                e2.mo47079g(textView2, 1);
                C18999c e3 = livenessFragment.f29994e.mo46867g().mo47140e();
                C17159m mVar3 = livenessFragment.f29996g;
                if (mVar3 != null) {
                    TextView textView3 = mVar3.f48093o;
                    C41536l.m120488h(textView3, "binding.livenessInstructions2TextView");
                    e3.mo47079g(textView3, 1);
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

    /* renamed from: n2 */
    private static final void m38442n2(LivenessFragment livenessFragment) {
        C17159m mVar = livenessFragment.f29996g;
        if (mVar != null) {
            mVar.f48100v.setText(livenessFragment.f29994e.mo46864d().mo47124d(livenessFragment.getContext(), "face_instructions"));
            C17159m mVar2 = livenessFragment.f29996g;
            if (mVar2 != null) {
                mVar2.f48096r.setText(livenessFragment.f29994e.mo46864d().mo47124d(livenessFragment.getContext(), "uploading"));
            } else {
                C41536l.m120506z("binding");
                throw null;
            }
        } else {
            C41536l.m120506z("binding");
            throw null;
        }
    }

    /* renamed from: o2 */
    private final void m38444o2() {
        FragmentManager fragmentManager;
        C1493e0 e0Var;
        C41238w wVar;
        boolean z = false;
        if (this.f29994e.mo46867g().mo47147l() == 2) {
            C17159m mVar = this.f29996g;
            if (mVar != null) {
                mVar.f48091m.setVisibility(0);
                C17159m mVar2 = this.f29996g;
                if (mVar2 != null) {
                    mVar2.f48093o.setText(this.f29994e.mo46864d().mo47124d(getContext(), "neutral_expression"));
                    Integer g = this.f29994e.mo46867g().mo47142g();
                    if (g == null) {
                        wVar = null;
                    } else {
                        int intValue = g.intValue();
                        C17159m mVar3 = this.f29996g;
                        if (mVar3 != null) {
                            mVar3.f48092n.setImageResource(intValue);
                            wVar = C41238w.f97225a;
                        } else {
                            C41536l.m120506z("binding");
                            throw null;
                        }
                    }
                    if (wVar == null) {
                        C17159m mVar4 = this.f29996g;
                        if (mVar4 != null) {
                            mVar4.f48092n.setImageResource(C16346d.identomat_neutral_2);
                        } else {
                            C41536l.m120506z("binding");
                            throw null;
                        }
                    }
                    C17159m mVar5 = this.f29996g;
                    if (mVar5 != null) {
                        mVar5.f48092n.animate().scaleX(0.7f).scaleY(0.7f).setDuration(200).withEndAction(new C18079e(this));
                        C17159m mVar6 = this.f29996g;
                        if (mVar6 != null) {
                            mVar6.f48093o.animate().scaleX(0.7f).scaleY(0.7f).setDuration(200).withEndAction(new C18080f(this));
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
            C10227b bVar = new C10227b(false, this.f29994e);
            C1505h activity = getActivity();
            if (activity == null) {
                fragmentManager = null;
            } else {
                fragmentManager = activity.getSupportFragmentManager();
            }
            if (fragmentManager == null) {
                e0Var = null;
            } else {
                e0Var = fragmentManager.mo4428p();
            }
            if (e0Var != null) {
                e0Var.mo4641t(C16344b.identomat_appear, C16344b.identomat_disappear);
            }
            C17159m mVar7 = this.f29996g;
            if (mVar7 != null) {
                FragmentContainerView fragmentContainerView = mVar7.f48094p;
                C41536l.m120488h(fragmentContainerView, "binding.livenessInstructionsContainer");
                if (fragmentContainerView.getChildCount() == 0) {
                    z = true;
                }
                if (z) {
                    if (e0Var != null) {
                        e0Var.mo4631b(C16347e.liveness_instructions_container, bVar);
                    }
                } else if (e0Var != null) {
                    e0Var.mo4639r(C16347e.liveness_instructions_container, bVar);
                }
                this.f30009t = bVar;
                if (e0Var != null) {
                    e0Var.mo4515i();
                    return;
                }
                return;
            }
            C41536l.m120506z("binding");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public static final void m38446p2(LivenessFragment livenessFragment) {
        C41536l.m120489i(livenessFragment, "this$0");
        C17159m mVar = livenessFragment.f29996g;
        if (mVar != null) {
            mVar.f48092n.animate().scaleX(1.0f).scaleY(1.0f).setDuration(300);
        } else {
            C41536l.m120506z("binding");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public static final void m38448q2(LivenessFragment livenessFragment) {
        C41536l.m120489i(livenessFragment, "this$0");
        C17159m mVar = livenessFragment.f29996g;
        if (mVar != null) {
            mVar.f48093o.animate().scaleX(1.0f).scaleY(1.0f).setDuration(200);
        } else {
            C41536l.m120506z("binding");
            throw null;
        }
    }

    /* renamed from: r2 */
    private final void m38450r2() {
        m38420Z1().mo45772fw().mo4819k(getViewLifecycleOwner(), new C18087m(this));
        m38420Z1().mo45773gw().mo4819k(getViewLifecycleOwner(), new C18088n(this));
        m38420Z1().mo45774hw().mo4819k(getViewLifecycleOwner(), new C18089o(this));
        m38420Z1().mo45776jw().mo4819k(getViewLifecycleOwner(), new C18090p(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: s2 */
    public static final void m38452s2(LivenessFragment livenessFragment, C41224m mVar) {
        C41536l.m120489i(livenessFragment, "this$0");
        livenessFragment.m38379B2((String) mVar.mo95678e(), ((Number) mVar.mo95680f()).intValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public static final void m38454t2(LivenessFragment livenessFragment, Integer num) {
        C41536l.m120489i(livenessFragment, "this$0");
        C41536l.m120488h(num, "it");
        if (num.intValue() >= livenessFragment.f30006q) {
            livenessFragment.m38423b2();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u2 */
    public static final void m38456u2(LivenessFragment livenessFragment, Integer num) {
        C41536l.m120489i(livenessFragment, "this$0");
        String str = null;
        if (num != null && num.intValue() == 100) {
            C17159m mVar = livenessFragment.f29996g;
            if (mVar != null) {
                mVar.f48096r.setText(livenessFragment.mo27285Y1().mo46864d().mo47124d(livenessFragment.getContext(), "verifying"));
            } else {
                C41536l.m120506z("binding");
                throw null;
            }
        } else {
            C17159m mVar2 = livenessFragment.f29996g;
            if (mVar2 != null) {
                TextView textView = mVar2.f48096r;
                StringBuilder sb = new StringBuilder();
                String d = livenessFragment.mo27285Y1().mo46864d().mo47124d(livenessFragment.getContext(), "uploading");
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
    /* renamed from: v2 */
    public static final void m38458v2(LivenessFragment livenessFragment, Boolean bool) {
        C41536l.m120489i(livenessFragment, "this$0");
        C41536l.m120488h(bool, "it");
        if (bool.booleanValue()) {
            C17159m mVar = livenessFragment.f29996g;
            if (mVar != null) {
                mVar.f48085g.setVisibility(8);
                C17159m mVar2 = livenessFragment.f29996g;
                if (mVar2 != null) {
                    mVar2.f48097s.setVisibility(0);
                    livenessFragment.m38426e2();
                    return;
                }
                C41536l.m120506z("binding");
                throw null;
            }
            C41536l.m120506z("binding");
            throw null;
        }
        C17159m mVar3 = livenessFragment.f29996g;
        if (mVar3 != null) {
            mVar3.f48097s.setVisibility(8);
        } else {
            C41536l.m120506z("binding");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: w2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m38459w2(android.graphics.Bitmap r5, float r6, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.identomat.fragments.liveness.LivenessFragment.C10569g
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.identomat.fragments.liveness.LivenessFragment$g r0 = (com.identomat.fragments.liveness.LivenessFragment.C10569g) r0
            int r1 = r0.f30038i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f30038i = r1
            goto L_0x0018
        L_0x0013:
            com.identomat.fragments.liveness.LivenessFragment$g r0 = new com.identomat.fragments.liveness.LivenessFragment$g
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f30036g
            java.lang.Object r1 = ne1.C41793d.m121157c()
            int r2 = r0.f30038i
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            he1.C41228o.m119483b(r7)     // Catch:{ Exception -> 0x006c }
            goto L_0x0069
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            he1.C41228o.m119483b(r7)
            android.content.Context r7 = r4.getContext()     // Catch:{ Exception -> 0x006c }
            if (r7 != 0) goto L_0x003d
            he1.w r5 = he1.C41238w.f97225a     // Catch:{ Exception -> 0x006c }
            return r5
        L_0x003d:
            dd.b r7 = p388dd.C12074b.f35484a     // Catch:{ Exception -> 0x006c }
            android.graphics.Bitmap r5 = r7.mo32224f(r5, r6)     // Catch:{ Exception -> 0x006c }
            android.content.Context r6 = r4.requireContext()     // Catch:{ Exception -> 0x006c }
            android.content.res.Resources r6 = r6.getResources()     // Catch:{ Exception -> 0x006c }
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()     // Catch:{ Exception -> 0x006c }
            int r2 = r6.heightPixels     // Catch:{ Exception -> 0x006c }
            float r2 = (float) r2     // Catch:{ Exception -> 0x006c }
            int r6 = r6.widthPixels     // Catch:{ Exception -> 0x006c }
            float r6 = (float) r6     // Catch:{ Exception -> 0x006c }
            float r2 = r2 / r6
            android.graphics.Bitmap r5 = r7.mo32222d(r5, r2)     // Catch:{ Exception -> 0x006c }
            r6 = 400(0x190, float:5.6E-43)
            android.graphics.Bitmap r5 = r7.mo32223e(r5, r6)     // Catch:{ Exception -> 0x006c }
            r0.f30038i = r3     // Catch:{ Exception -> 0x006c }
            java.lang.Object r5 = r4.m38465z2(r5, r0)     // Catch:{ Exception -> 0x006c }
            if (r5 != r1) goto L_0x0069
            return r1
        L_0x0069:
            he1.w r5 = he1.C41238w.f97225a
            return r5
        L_0x006c:
            he1.w r5 = he1.C41238w.f97225a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.identomat.fragments.liveness.LivenessFragment.m38459w2(android.graphics.Bitmap, float, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* renamed from: x2 */
    public final void m38461x2() {
        if (this.f30010u != null) {
            C1493e0 p = getParentFragmentManager().mo4428p();
            C41536l.m120488h(p, "parentFragmentManager.beginTransaction()");
            p.mo4641t(C16344b.identomat_appear, C16344b.identomat_disappear);
            p.mo4639r(C16347e.liveness_info_container, new C10226a());
            p.mo4515i();
            this.f30010u = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y2 */
    public final void m38463y2() {
        FragmentManager fragmentManager;
        C1493e0 e0Var;
        if (this.f29994e.mo46867g().mo47147l() == 2) {
            C17159m mVar = this.f29996g;
            if (mVar != null) {
                mVar.f48091m.setVisibility(8);
            } else {
                C41536l.m120506z("binding");
                throw null;
            }
        } else {
            Fragment fragment = this.f30009t;
            if (fragment != null) {
                C1505h activity = getActivity();
                if (activity == null) {
                    fragmentManager = null;
                } else {
                    fragmentManager = activity.getSupportFragmentManager();
                }
                if (fragmentManager == null) {
                    e0Var = null;
                } else {
                    e0Var = fragmentManager.mo4428p();
                }
                if (e0Var != null) {
                    e0Var.mo4641t(C16344b.identomat_appear, C16344b.identomat_disappear);
                }
                if (e0Var != null) {
                    e0Var.mo4522q(fragment);
                }
                if (e0Var != null) {
                    e0Var.mo4515i();
                }
                this.f30009t = null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: z2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m38465z2(android.graphics.Bitmap r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.identomat.fragments.liveness.LivenessFragment.C10570h
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.identomat.fragments.liveness.LivenessFragment$h r0 = (com.identomat.fragments.liveness.LivenessFragment.C10570h) r0
            int r1 = r0.f30042j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f30042j = r1
            goto L_0x0018
        L_0x0013:
            com.identomat.fragments.liveness.LivenessFragment$h r0 = new com.identomat.fragments.liveness.LivenessFragment$h
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f30040h
            java.lang.Object r1 = ne1.C41793d.m121157c()
            int r2 = r0.f30042j
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r5 = r0.f30039g
            com.identomat.fragments.liveness.LivenessFragment r5 = (com.identomat.fragments.liveness.LivenessFragment) r5
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
            r4.f29999j = r3
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
            uc.s r2 = r4.m38420Z1()
            r0.f30039g = r4
            r0.f30042j = r3
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
            r5.m38424c2(r6)
        L_0x0075:
            he1.w r5 = he1.C41238w.f97225a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.identomat.fragments.liveness.LivenessFragment.m38465z2(android.graphics.Bitmap, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: L2 */
    public final void mo27283L2() {
        this.f30012w = true;
        m38387F2();
        this.f29998i = true;
        m38461x2();
        C17159m mVar = this.f29996g;
        if (mVar != null) {
            mVar.f48085g.mo29378q(this.f30013x);
            this.f30007r.postDelayed(new C18092r(this), 3000);
            return;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    /* renamed from: X1 */
    public final C9786e mo27284X1() {
        return this.f29993d;
    }

    /* renamed from: Y1 */
    public final C18877a mo27285Y1() {
        return this.f29994e;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f30012w = bundle.getBoolean("ready", false);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        C17159m d = C17159m.m60284d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f29996g = d;
        m38434j2();
        m38450r2();
        m38430h2();
        C17159m mVar = this.f29996g;
        if (mVar != null) {
            RelativeLayout c = mVar.mo3946b();
            C41536l.m120488h(c, "binding.root");
            return c;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    public void onDestroy() {
        Log.e("identomat_", "onDestroy");
        C17159m mVar = this.f29996g;
        if (mVar != null) {
            if (mVar != null) {
                mVar.f48085g.mo29320I(this.f30013x);
                C17159m mVar2 = this.f29996g;
                if (mVar2 != null) {
                    mVar2.f48085g.mo29319H(this.f30014y);
                    this.f30007r.removeCallbacksAndMessages((Object) null);
                } else {
                    C41536l.m120506z("binding");
                    throw null;
                }
            } else {
                C41536l.m120506z("binding");
                throw null;
            }
        }
        super.onDestroy();
    }

    public void onPause() {
        Log.e("identomat_", "onPause");
        C17159m mVar = this.f29996g;
        if (mVar != null) {
            mVar.f48085g.mo29320I(this.f30013x);
            C17159m mVar2 = this.f29996g;
            if (mVar2 != null) {
                mVar2.f48085g.mo29319H(this.f30014y);
                this.f30007r.removeCallbacksAndMessages((Object) null);
                m38463y2();
                this.f29999j = false;
                this.f29998i = false;
                this.f30000k = false;
                this.f30002m = 0;
                C17159m mVar3 = this.f29996g;
                if (mVar3 != null) {
                    mVar3.f48101w.setProgress(0);
                    super.onPause();
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

    public void onResume() {
        super.onResume();
        Log.e("identomat_", "onResume");
        this.f29993d.mo26255q(getContext(), this.f29995f);
        m38420Z1().mo45777kw();
        C40845o1 o1Var = this.f30008s;
        if (o1Var == null || !o1Var.mo95131k()) {
            C9800j jVar = this.f30011v;
            if (jVar == null) {
                m38426e2();
                m38461x2();
                if (m38414V1()) {
                    m38427f2();
                    return;
                }
                return;
            }
            m38425d2(jVar);
            this.f30011v = null;
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        C41536l.m120489i(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("ready", this.f30012w);
    }
}
