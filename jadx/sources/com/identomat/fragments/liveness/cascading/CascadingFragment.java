package com.identomat.fragments.liveness.cascading;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.result.C0173b;
import androidx.core.content.C0767a;
import androidx.fragment.app.C1493e0;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1629r;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.LiveData;
import com.github.mikephil.charting.utils.Utils;
import com.identomat.activities.NavigationActivity;
import com.otaliastudios.cameraview.C11280b;
import com.salesforce.marketingcloud.C11398b;
import ef1.C40793d0;
import ef1.C40813h;
import ef1.C40814h0;
import ef1.C40822j0;
import ef1.C40845o1;
import ef1.C40850p0;
import ef1.C40867u0;
import he1.C41217g;
import he1.C41222k;
import he1.C41228o;
import he1.C41238w;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.C41558c;
import kotlinx.coroutines.flow.C41571n;
import kotlinx.coroutines.flow.C41578r;
import me1.C41752f;
import oe1.C41851b;
import oe1.C41862l;
import p017b.C2105c;
import p163m0.C7047a;
import p228r0.C8034d;
import p345ad.C9786e;
import p345ad.C9793g;
import p345ad.C9796h;
import p374ce.C10396b;
import p388dd.C12073a;
import p388dd.C12074b;
import p458id.C15599a;
import p472jd.C15753j;
import p485kc.C16341a;
import p485kc.C16346d;
import p485kc.C16347e;
import p541oc.C17148b;
import p569qc.C17485b;
import p625ud.C18110b;
import p625ud.C18112d;
import p637vc.C18284a;
import p637vc.C18285b;
import p637vc.C18286c;
import p637vc.C18287d;
import p637vc.C18288e;
import p637vc.C18289f;
import p637vc.C18290g;
import p637vc.C18291h;
import p637vc.C18292i;
import p637vc.C18293j;
import p637vc.C18294k;
import p650wc.C18493b;
import p678yc.C18877a;
import p692zc.C18999c;
import p692zc.C19002e;
import ue1.C43064a;
import ue1.C43079p;

public final class CascadingFragment extends Fragment {

    /* renamed from: A */
    private static final String[] f30105A = {"android.permission.CAMERA"};

    /* renamed from: z */
    public static final C10597a f30106z = new C10597a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C9786e f30107d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C9793g f30108e;

    /* renamed from: f */
    private final C18877a f30109f;

    /* renamed from: g */
    private final String f30110g = "cascading_page";

    /* renamed from: h */
    private final C41217g f30111h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C17148b f30112i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f30113j;

    /* renamed from: k */
    private long f30114k;

    /* renamed from: l */
    private long f30115l;

    /* renamed from: m */
    private C40845o1 f30116m;

    /* renamed from: n */
    private C40845o1 f30117n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public File f30118o;

    /* renamed from: p */
    private int f30119p;

    /* renamed from: q */
    private boolean f30120q;

    /* renamed from: r */
    private ValueAnimator f30121r;

    /* renamed from: s */
    private boolean f30122s;

    /* renamed from: t */
    private boolean f30123t;

    /* renamed from: u */
    private boolean f30124u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public C40845o1 f30125v;

    /* renamed from: w */
    private int f30126w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public final C18112d f30127x;

    /* renamed from: y */
    private final C10598b f30128y;

    /* renamed from: com.identomat.fragments.liveness.cascading.CascadingFragment$a */
    public static final class C10597a {
        private C10597a() {
        }

        public /* synthetic */ C10597a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.identomat.fragments.liveness.cascading.CascadingFragment$b */
    public static final class C10598b extends C15599a {

        /* renamed from: a */
        final /* synthetic */ CascadingFragment f30129a;

        /* renamed from: com.identomat.fragments.liveness.cascading.CascadingFragment$b$a */
        static final class C10599a extends C41862l implements C43079p {

            /* renamed from: h */
            int f30130h;

            /* renamed from: i */
            final /* synthetic */ CascadingFragment f30131i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10599a(CascadingFragment cascadingFragment, Continuation continuation) {
                super(2, continuation);
                this.f30131i = cascadingFragment;
            }

            /* renamed from: a */
            public final Continuation mo3708a(Object obj, Continuation continuation) {
                return new C10599a(this.f30131i, continuation);
            }

            /* renamed from: f */
            public final Object mo3709f(Object obj) {
                Object unused = C41793d.m121157c();
                if (this.f30130h == 0) {
                    C41228o.m119483b(obj);
                    File v1 = this.f30131i.f30118o;
                    if (v1 != null) {
                        CascadingFragment cascadingFragment = this.f30131i;
                        try {
                            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                            mediaMetadataRetriever.setDataSource(cascadingFragment.getContext(), Uri.fromFile(cascadingFragment.f30118o));
                            Log.i("identomat_", C41536l.m120497q("video duration: ", mediaMetadataRetriever.extractMetadata(9)));
                            Log.i("identomat_", C41536l.m120497q("video size: ", C41851b.m121257d(v1.length() / ((long) C11398b.f33141t))));
                            mediaMetadataRetriever.release();
                            cascadingFragment.m38607l2();
                        } catch (Exception e) {
                            Log.e("identomat_", String.valueOf(e.getMessage()));
                        }
                    }
                    return C41238w.f97225a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* renamed from: n */
            public final Object invoke(C40814h0 h0Var, Continuation continuation) {
                return ((C10599a) mo3708a(h0Var, continuation)).mo3709f(C41238w.f97225a);
            }
        }

        C10598b(CascadingFragment cascadingFragment) {
            this.f30129a = cascadingFragment;
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
            C40845o1 unused = C40821j.m118316b(C1629r.m5683a(this.f30129a), C40867u0.m118468b(), (C40822j0) null, new C10599a(this.f30129a, (Continuation) null), 2, (Object) null);
        }
    }

    /* renamed from: com.identomat.fragments.liveness.cascading.CascadingFragment$c */
    static final class C10600c extends C41862l implements C43079p {

        /* renamed from: h */
        int f30132h;

        /* renamed from: i */
        final /* synthetic */ CascadingFragment f30133i;

        /* renamed from: com.identomat.fragments.liveness.cascading.CascadingFragment$c$a */
        static final class C10601a extends C41862l implements C43079p {

            /* renamed from: h */
            int f30134h;

            /* renamed from: i */
            final /* synthetic */ CascadingFragment f30135i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10601a(CascadingFragment cascadingFragment, Continuation continuation) {
                super(2, continuation);
                this.f30135i = cascadingFragment;
            }

            /* renamed from: a */
            public final Continuation mo3708a(Object obj, Continuation continuation) {
                return new C10601a(this.f30135i, continuation);
            }

            /* renamed from: f */
            public final Object mo3709f(Object obj) {
                Object unused = C41793d.m121157c();
                if (this.f30134h == 0) {
                    C41228o.m119483b(obj);
                    this.f30135i.m38577M1().mo46015gw();
                    return C41238w.f97225a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* renamed from: n */
            public final Object invoke(C40814h0 h0Var, Continuation continuation) {
                return ((C10601a) mo3708a(h0Var, continuation)).mo3709f(C41238w.f97225a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10600c(CascadingFragment cascadingFragment, Continuation continuation) {
            super(2, continuation);
            this.f30133i = cascadingFragment;
        }

        /* renamed from: a */
        public final Continuation mo3708a(Object obj, Continuation continuation) {
            return new C10600c(this.f30133i, continuation);
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            Object c = C41793d.m121157c();
            int i = this.f30132h;
            if (i == 0) {
                C41228o.m119483b(obj);
                C40793d0 b = C40867u0.m118468b();
                C10601a aVar = new C10601a(this.f30133i, (Continuation) null);
                this.f30132h = 1;
                if (C40813h.m118303e(b, aVar, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C41228o.m119483b(obj);
            } else if (i == 2) {
                C41228o.m119483b(obj);
                C16341a.f46171a.mo43313a(this.f30133i.getActivity());
                return C41238w.f97225a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f30132h = 2;
            if (C40850p0.m118424a(300, this) == c) {
                return c;
            }
            C16341a.f46171a.mo43313a(this.f30133i.getActivity());
            return C41238w.f97225a;
        }

        /* renamed from: n */
        public final Object invoke(C40814h0 h0Var, Continuation continuation) {
            return ((C10600c) mo3708a(h0Var, continuation)).mo3709f(C41238w.f97225a);
        }
    }

    /* renamed from: com.identomat.fragments.liveness.cascading.CascadingFragment$d */
    static final class C10602d extends C41862l implements C43079p {

        /* renamed from: h */
        int f30136h;

        /* renamed from: i */
        final /* synthetic */ CascadingFragment f30137i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10602d(CascadingFragment cascadingFragment, Continuation continuation) {
            super(2, continuation);
            this.f30137i = cascadingFragment;
        }

        /* renamed from: a */
        public final Continuation mo3708a(Object obj, Continuation continuation) {
            return new C10602d(this.f30137i, continuation);
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            Object c = C41793d.m121157c();
            int i = this.f30136h;
            if (i == 0) {
                C41228o.m119483b(obj);
                C40845o1 u1 = this.f30137i.f30125v;
                if (u1 != null) {
                    this.f30136h = 1;
                    if (u1.mo95217v(this) == c) {
                        return c;
                    }
                }
            } else if (i == 1) {
                C41228o.m119483b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f30137i.f30125v = null;
            C17148b r1 = this.f30137i.f30112i;
            if (r1 != null) {
                r1.f47971i.mo29320I(this.f30137i.f30127x);
                C17148b r12 = this.f30137i.f30112i;
                if (r12 != null) {
                    r12.f47971i.mo29321K();
                    return C41238w.f97225a;
                }
                C41536l.m120506z("binding");
                throw null;
            }
            C41536l.m120506z("binding");
            throw null;
        }

        /* renamed from: n */
        public final Object invoke(C40814h0 h0Var, Continuation continuation) {
            return ((C10602d) mo3708a(h0Var, continuation)).mo3709f(C41238w.f97225a);
        }
    }

    /* renamed from: com.identomat.fragments.liveness.cascading.CascadingFragment$e */
    static final class C10603e extends C41862l implements C43079p {

        /* renamed from: h */
        int f30138h;

        /* renamed from: i */
        final /* synthetic */ CascadingFragment f30139i;

        /* renamed from: com.identomat.fragments.liveness.cascading.CascadingFragment$e$a */
        static final class C10604a extends C41862l implements C43079p {

            /* renamed from: h */
            int f30140h;

            /* renamed from: i */
            final /* synthetic */ CascadingFragment f30141i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10604a(CascadingFragment cascadingFragment, Continuation continuation) {
                super(2, continuation);
                this.f30141i = cascadingFragment;
            }

            /* renamed from: a */
            public final Continuation mo3708a(Object obj, Continuation continuation) {
                return new C10604a(this.f30141i, continuation);
            }

            /* renamed from: f */
            public final Object mo3709f(Object obj) {
                Object unused = C41793d.m121157c();
                if (this.f30140h == 0) {
                    C41228o.m119483b(obj);
                    this.f30141i.m38609m2();
                    return C41238w.f97225a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* renamed from: n */
            public final Object invoke(C41238w wVar, Continuation continuation) {
                return ((C10604a) mo3708a(wVar, continuation)).mo3709f(C41238w.f97225a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10603e(CascadingFragment cascadingFragment, Continuation continuation) {
            super(2, continuation);
            this.f30139i = cascadingFragment;
        }

        /* renamed from: a */
        public final Continuation mo3708a(Object obj, Continuation continuation) {
            return new C10603e(this.f30139i, continuation);
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            Object c = C41793d.m121157c();
            int i = this.f30138h;
            if (i == 0) {
                C41228o.m119483b(obj);
                C41571n nw = this.f30139i.m38577M1().mo46022nw();
                C10604a aVar = new C10604a(this.f30139i, (Continuation) null);
                this.f30138h = 1;
                if (C41558c.m120519f(nw, aVar, this) == c) {
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
            return ((C10603e) mo3708a(h0Var, continuation)).mo3709f(C41238w.f97225a);
        }
    }

    /* renamed from: com.identomat.fragments.liveness.cascading.CascadingFragment$f */
    static final class C10605f extends C41862l implements C43079p {

        /* renamed from: h */
        int f30142h;

        /* renamed from: i */
        final /* synthetic */ CascadingFragment f30143i;

        /* renamed from: com.identomat.fragments.liveness.cascading.CascadingFragment$f$a */
        static final class C10606a extends C41862l implements C43079p {

            /* renamed from: h */
            int f30144h;

            /* renamed from: i */
            /* synthetic */ boolean f30145i;

            /* renamed from: j */
            final /* synthetic */ CascadingFragment f30146j;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10606a(CascadingFragment cascadingFragment, Continuation continuation) {
                super(2, continuation);
                this.f30146j = cascadingFragment;
            }

            /* renamed from: a */
            public final Continuation mo3708a(Object obj, Continuation continuation) {
                C10606a aVar = new C10606a(this.f30146j, continuation);
                aVar.f30145i = ((Boolean) obj).booleanValue();
                return aVar;
            }

            /* renamed from: f */
            public final Object mo3709f(Object obj) {
                Object unused = C41793d.m121157c();
                if (this.f30144h == 0) {
                    C41228o.m119483b(obj);
                    if (this.f30145i) {
                        C17148b r1 = this.f30146j.f30112i;
                        if (r1 != null) {
                            r1.f47972j.setVisibility(0);
                        } else {
                            C41536l.m120506z("binding");
                            throw null;
                        }
                    } else {
                        C17148b r12 = this.f30146j.f30112i;
                        if (r12 != null) {
                            r12.f47972j.setVisibility(8);
                        } else {
                            C41536l.m120506z("binding");
                            throw null;
                        }
                    }
                    return C41238w.f97225a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return mo27313n(((Boolean) obj).booleanValue(), (Continuation) obj2);
            }

            /* renamed from: n */
            public final Object mo27313n(boolean z, Continuation continuation) {
                return ((C10606a) mo3708a(Boolean.valueOf(z), continuation)).mo3709f(C41238w.f97225a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10605f(CascadingFragment cascadingFragment, Continuation continuation) {
            super(2, continuation);
            this.f30143i = cascadingFragment;
        }

        /* renamed from: a */
        public final Continuation mo3708a(Object obj, Continuation continuation) {
            return new C10605f(this.f30143i, continuation);
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            Object c = C41793d.m121157c();
            int i = this.f30142h;
            if (i == 0) {
                C41228o.m119483b(obj);
                C41578r ow = this.f30143i.m38577M1().mo46023ow();
                C10606a aVar = new C10606a(this.f30143i, (Continuation) null);
                this.f30142h = 1;
                if (C41558c.m120519f(ow, aVar, this) == c) {
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
            return ((C10605f) mo3708a(h0Var, continuation)).mo3709f(C41238w.f97225a);
        }
    }

    /* renamed from: com.identomat.fragments.liveness.cascading.CascadingFragment$g */
    static final class C10607g extends C41862l implements C43079p {

        /* renamed from: h */
        int f30147h;

        /* renamed from: i */
        final /* synthetic */ CascadingFragment f30148i;

        /* renamed from: j */
        final /* synthetic */ File f30149j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10607g(CascadingFragment cascadingFragment, File file, Continuation continuation) {
            super(2, continuation);
            this.f30148i = cascadingFragment;
            this.f30149j = file;
        }

        /* renamed from: a */
        public final Continuation mo3708a(Object obj, Continuation continuation) {
            return new C10607g(this.f30148i, this.f30149j, continuation);
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            Object unused = C41793d.m121157c();
            if (this.f30147h == 0) {
                C41228o.m119483b(obj);
                this.f30148i.m38577M1().mo46028tw(this.f30149j);
                return C41238w.f97225a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: n */
        public final Object invoke(C40814h0 h0Var, Continuation continuation) {
            return ((C10607g) mo3708a(h0Var, continuation)).mo3709f(C41238w.f97225a);
        }
    }

    /* renamed from: com.identomat.fragments.liveness.cascading.CascadingFragment$h */
    public static final class C10608h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f30150d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10608h(Fragment fragment) {
            super(0);
            this.f30150d = fragment;
        }

        public final Fragment invoke() {
            return this.f30150d;
        }
    }

    /* renamed from: com.identomat.fragments.liveness.cascading.CascadingFragment$i */
    public static final class C10609i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f30151d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10609i(C43064a aVar) {
            super(0);
            this.f30151d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f30151d.invoke();
        }
    }

    /* renamed from: com.identomat.fragments.liveness.cascading.CascadingFragment$j */
    public static final class C10610j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f30152d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10610j(C41217g gVar) {
            super(0);
            this.f30152d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f30152d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: com.identomat.fragments.liveness.cascading.CascadingFragment$k */
    public static final class C10611k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f30153d;

        /* renamed from: e */
        final /* synthetic */ C41217g f30154e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10611k(C43064a aVar, C41217g gVar) {
            super(0);
            this.f30153d = aVar;
            this.f30154e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f30153d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f30154e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: com.identomat.fragments.liveness.cascading.CascadingFragment$l */
    static final class C10612l extends C41862l implements C43079p {

        /* renamed from: h */
        int f30155h;

        /* renamed from: i */
        final /* synthetic */ CascadingFragment f30156i;

        /* renamed from: com.identomat.fragments.liveness.cascading.CascadingFragment$l$a */
        static final class C10613a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ CascadingFragment f30157d;

            /* renamed from: com.identomat.fragments.liveness.cascading.CascadingFragment$l$a$a */
            static final class C10614a extends C41862l implements C43079p {

                /* renamed from: h */
                int f30158h;

                /* renamed from: i */
                final /* synthetic */ CascadingFragment f30159i;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C10614a(CascadingFragment cascadingFragment, Continuation continuation) {
                    super(2, continuation);
                    this.f30159i = cascadingFragment;
                }

                /* renamed from: a */
                public final Continuation mo3708a(Object obj, Continuation continuation) {
                    return new C10614a(this.f30159i, continuation);
                }

                /* renamed from: f */
                public final Object mo3709f(Object obj) {
                    Object unused = C41793d.m121157c();
                    if (this.f30158h == 0) {
                        C41228o.m119483b(obj);
                        this.f30159i.m38577M1().mo46017iw().mo4823o(C41851b.m121256c(0));
                        this.f30159i.m38577M1().mo46017iw().mo4826r(C41851b.m121256c(-1));
                        this.f30159i.f30113j = true;
                        this.f30159i.m38605k2();
                        this.f30159i.m38594d2();
                        return C41238w.f97225a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                /* renamed from: n */
                public final Object invoke(C40814h0 h0Var, Continuation continuation) {
                    return ((C10614a) mo3708a(h0Var, continuation)).mo3709f(C41238w.f97225a);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10613a(CascadingFragment cascadingFragment) {
                super(0);
                this.f30157d = cascadingFragment;
            }

            public final void invoke() {
                C40845o1 unused = C40821j.m118316b(C1629r.m5683a(this.f30157d), (C41752f) null, (C40822j0) null, new C10614a(this.f30157d, (Continuation) null), 3, (Object) null);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10612l(CascadingFragment cascadingFragment, Continuation continuation) {
            super(2, continuation);
            this.f30156i = cascadingFragment;
        }

        /* renamed from: a */
        public final Continuation mo3708a(Object obj, Continuation continuation) {
            return new C10612l(this.f30156i, continuation);
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            Object c = C41793d.m121157c();
            int i = this.f30155h;
            if (i == 0) {
                C41228o.m119483b(obj);
                this.f30155h = 1;
                if (C40850p0.m118424a(3000, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C41228o.m119483b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f30156i.m38577M1().mo46014fw(new C10613a(this.f30156i));
            return C41238w.f97225a;
        }

        /* renamed from: n */
        public final Object invoke(C40814h0 h0Var, Continuation continuation) {
            return ((C10612l) mo3708a(h0Var, continuation)).mo3709f(C41238w.f97225a);
        }
    }

    /* renamed from: com.identomat.fragments.liveness.cascading.CascadingFragment$m */
    public static final class C10615m implements Comparator {
        public final int compare(Object obj, Object obj2) {
            return C41506d.m120406e(Integer.valueOf(((C10396b) obj).mo27062e()), Integer.valueOf(((C10396b) obj2).mo27062e()));
        }
    }

    /* renamed from: com.identomat.fragments.liveness.cascading.CascadingFragment$n */
    static final class C10616n extends C41862l implements C43079p {

        /* renamed from: h */
        int f30160h;

        C10616n(Continuation continuation) {
            super(2, continuation);
        }

        /* renamed from: a */
        public final Continuation mo3708a(Object obj, Continuation continuation) {
            return new C10616n(continuation);
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            Object c = C41793d.m121157c();
            int i = this.f30160h;
            if (i == 0) {
                C41228o.m119483b(obj);
                this.f30160h = 1;
                if (C40850p0.m118424a(1000, this) == c) {
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
            return ((C10616n) mo3708a(h0Var, continuation)).mo3709f(C41238w.f97225a);
        }
    }

    /* renamed from: com.identomat.fragments.liveness.cascading.CascadingFragment$o */
    static final class C10617o extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CascadingFragment f30161d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10617o(CascadingFragment cascadingFragment) {
            super(0);
            this.f30161d = cascadingFragment;
        }

        public final C1620q0.C1624b invoke() {
            return new C17485b(this.f30161d.mo27304J1(), this.f30161d.f30108e, (C9796h) null, 4, (DefaultConstructorMarker) null);
        }
    }

    public CascadingFragment(C9786e eVar, C9793g gVar, C18877a aVar) {
        C41536l.m120489i(eVar, "api");
        C41536l.m120489i(gVar, "cascadingSocket");
        C41536l.m120489i(aVar, "identomatConfig");
        this.f30107d = eVar;
        this.f30108e = gVar;
        this.f30109f = aVar;
        C10617o oVar = new C10617o(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C10609i(new C10608h(this)));
        this.f30111h = C1514j0.m5374c(this, C41520a0.m120436b(C18294k.class), new C10610j(a), new C10611k((C43064a) null, a), oVar);
        this.f30126w = 300000;
        this.f30127x = new C18291h(this);
        this.f30128y = new C10598b(this);
    }

    /* renamed from: E1 */
    private final boolean m38571E1() {
        Integer num;
        String[] strArr = f30105A;
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

    /* renamed from: F1 */
    private final void m38572F1() {
        C18493b bVar = new C18493b(this.f30109f);
        C1493e0 p = getChildFragmentManager().mo4428p();
        C41536l.m120488h(p, "childFragmentManager.beginTransaction()");
        p.mo4631b(C16347e.cascading_start_fragment, bVar);
        p.mo4515i();
    }

    /* renamed from: G1 */
    private final void m38573G1() {
        Log.i("identomat_", "done: ");
        m38577M1().mo46029uw(true);
        C40845o1 unused = C40821j.m118316b(C1629r.m5683a(this), (C41752f) null, (C40822j0) null, new C10600c(this, (Continuation) null), 3, (Object) null);
    }

    /* renamed from: H1 */
    private final void m38574H1() {
        C40845o1 unused = C40821j.m118316b(C1629r.m5683a(this), (C41752f) null, (C40822j0) null, new C10602d(this, (Continuation) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: I1 */
    public static final void m38575I1(CascadingFragment cascadingFragment, C18110b bVar) {
        C41536l.m120489i(cascadingFragment, "this$0");
        C41536l.m120489i(bVar, "frame");
        if ((!cascadingFragment.f30122s || !cascadingFragment.f30124u) && cascadingFragment.f30113j) {
            cascadingFragment.f30113j = false;
            if (!cascadingFragment.m38571E1()) {
                C8034d.m30522a(cascadingFragment).mo22123U();
            }
            int e = bVar.mo45793e();
            bVar.mo45790b();
            try {
                cascadingFragment.f30115l = System.currentTimeMillis();
                Bitmap a = C12073a.f35481a.mo32216a(bVar);
                if (!cascadingFragment.f30124u) {
                    cascadingFragment.m38596f2(a, (float) e);
                }
            } catch (Exception e2) {
                String message = e2.getMessage();
                if (message != null) {
                    Log.i("identomat_", message);
                }
            }
            bVar.mo45797i();
        }
    }

    /* renamed from: L1 */
    private final ObjectAnimator m38576L1(View view) {
        Keyframe ofFloat = Keyframe.ofFloat(Utils.FLOAT_EPSILON, 1.0f);
        C41536l.m120488h(ofFloat, "ofFloat(0f, 1f)");
        Keyframe ofFloat2 = Keyframe.ofFloat(0.25f, 1.25f);
        C41536l.m120488h(ofFloat2, "ofFloat(0.25f, 1.25f)");
        Keyframe ofFloat3 = Keyframe.ofFloat(0.4f, 1.0f);
        C41536l.m120488h(ofFloat3, "ofFloat(0.40f, 1f)");
        Keyframe ofFloat4 = Keyframe.ofFloat(0.6f, 1.25f);
        C41536l.m120488h(ofFloat4, "ofFloat(0.60f, 1.25f)");
        Keyframe ofFloat5 = Keyframe.ofFloat(1.0f, 1.0f);
        C41536l.m120488h(ofFloat5, "ofFloat(1.0f, 1f)");
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofKeyframe("scaleX", new Keyframe[]{ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5}), PropertyValuesHolder.ofKeyframe("scaleY", new Keyframe[]{ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5})});
        C41536l.m120488h(ofPropertyValuesHolder, "ofPropertyValuesHolder(labelToAnimate, scaleX, scaleY)");
        ofPropertyValuesHolder.setDuration(3000);
        ofPropertyValuesHolder.setRepeatCount(-1);
        return ofPropertyValuesHolder;
    }

    /* access modifiers changed from: private */
    /* renamed from: M1 */
    public final C18294k m38577M1() {
        return (C18294k) this.f30111h.getValue();
    }

    /* renamed from: N1 */
    private final void m38578N1() {
        Bundle bundle = new Bundle();
        bundle.putInt("frame", C16347e.cascadingFragment);
        bundle.putBundle("bundle", getArguments());
        C8034d.m30522a(this).mo22123U();
        C8034d.m30522a(this).mo22119N(C16347e.cameraDenyFragment, bundle, NavigationActivity.f29874v.mo27261a());
    }

    /* renamed from: O1 */
    private final void m38579O1() {
        if (m38571E1()) {
            m38611n2();
        } else if (getActivity() != null) {
            C0173b registerForActivityResult = registerForActivityResult(new C2105c(), new C18284a(this));
            C41536l.m120488h(registerForActivityResult, "registerForActivityResult(ActivityResultContracts.RequestPermission())\n                    { isGranted: Boolean ->\n                        if (isGranted) {\n                            startCamera()\n                        } else {\n                            goToCameraDeny()\n                            Log.i(TAG, \"Permissions not granted by the user.\")\n                        }\n                    }");
            registerForActivityResult.mo404a(f30105A[0]);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P1 */
    public static final void m38580P1(CascadingFragment cascadingFragment, boolean z) {
        C41536l.m120489i(cascadingFragment, "this$0");
        if (z) {
            cascadingFragment.m38611n2();
            return;
        }
        cascadingFragment.m38578N1();
        Log.i("identomat_", "Permissions not granted by the user.");
    }

    /* renamed from: Q1 */
    private final void m38581Q1() {
        m38586V1(this);
        m38584T1(this);
        m38583S1(this);
        m38582R1(this);
        m38585U1(this);
    }

    /* renamed from: R1 */
    private static final void m38582R1(CascadingFragment cascadingFragment) {
        C19002e.C19003a aVar = C19002e.f53052q;
        C1505h activity = cascadingFragment.getActivity();
        C17148b bVar = cascadingFragment.f30112i;
        if (bVar != null) {
            ImageView imageView = bVar.f47968f;
            C41536l.m120488h(imageView, "binding.backButton");
            C17148b bVar2 = cascadingFragment.f30112i;
            if (bVar2 != null) {
                TextView textView = bVar2.f47969g;
                C41536l.m120488h(textView, "binding.backButtonTitleView");
                C19002e.C19003a.m64212c(aVar, activity, imageView, textView, false, cascadingFragment.f30109f, 8, (Object) null);
                return;
            }
            C41536l.m120506z("binding");
            throw null;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    /* renamed from: S1 */
    private static final void m38583S1(CascadingFragment cascadingFragment) {
        C17148b bVar = cascadingFragment.f30112i;
        if (bVar != null) {
            bVar.mo3946b().setBackgroundColor(cascadingFragment.f30109f.mo46861a().mo47093b().mo33033a());
            C17148b bVar2 = cascadingFragment.f30112i;
            if (bVar2 != null) {
                bVar2.f47976n.setTextColor(cascadingFragment.f30109f.mo46861a().mo47099h().mo33033a());
                Integer b = cascadingFragment.f30109f.mo46867g().mo47137b();
                if (b != null) {
                    int intValue = b.intValue();
                    C19002e.C19003a aVar = C19002e.f53052q;
                    Resources resources = cascadingFragment.getResources();
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

    /* renamed from: T1 */
    private static final void m38584T1(CascadingFragment cascadingFragment) {
        C18999c e = cascadingFragment.f30109f.mo46867g().mo47140e();
        C17148b bVar = cascadingFragment.f30112i;
        if (bVar != null) {
            TextView textView = bVar.f47979q;
            C41536l.m120488h(textView, "binding.messageTitle");
            e.mo47079g(textView, 0);
            C18999c e2 = cascadingFragment.f30109f.mo46867g().mo47140e();
            C17148b bVar2 = cascadingFragment.f30112i;
            if (bVar2 != null) {
                TextView textView2 = bVar2.f47980r;
                C41536l.m120488h(textView2, "binding.messageView");
                e2.mo47079g(textView2, 2);
                return;
            }
            C41536l.m120506z("binding");
            throw null;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    /* renamed from: U1 */
    private static final void m38585U1(CascadingFragment cascadingFragment) {
        View view = (View) C16341a.f46171a.mo43318f().invoke();
        if (view != null) {
            try {
                C17148b bVar = cascadingFragment.f30112i;
                if (bVar != null) {
                    bVar.f47975m.removeAllViews();
                    ViewParent parent = view.getParent();
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(view);
                        C17148b bVar2 = cascadingFragment.f30112i;
                        if (bVar2 != null) {
                            bVar2.f47975m.addView(view);
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
            C17148b bVar3 = cascadingFragment.f30112i;
            if (bVar3 != null) {
                bVar3.f47978p.mo27360e(cascadingFragment.f30109f);
            } else {
                C41536l.m120506z("binding");
                throw null;
            }
        }
    }

    /* renamed from: V1 */
    private static final void m38586V1(CascadingFragment cascadingFragment) {
        cascadingFragment.m38577M1().mo46019kw().mo4823o(cascadingFragment.f30109f.mo46864d().mo47124d(cascadingFragment.getContext(), "cascading_start"));
        if (!C41536l.m120484d(cascadingFragment.f30109f.mo46864d().mo47124d(cascadingFragment.getContext(), "cascading_start_title"), "cascading_start_title")) {
            C17148b bVar = cascadingFragment.f30112i;
            if (bVar != null) {
                bVar.f47979q.setText(cascadingFragment.f30109f.mo46864d().mo47124d(cascadingFragment.getContext(), "cascading_start_title"));
            } else {
                C41536l.m120506z("binding");
                throw null;
            }
        } else {
            C17148b bVar2 = cascadingFragment.f30112i;
            if (bVar2 != null) {
                bVar2.f47979q.setVisibility(8);
            } else {
                C41536l.m120506z("binding");
                throw null;
            }
        }
        C17148b bVar3 = cascadingFragment.f30112i;
        if (bVar3 != null) {
            bVar3.f47976n.setText(cascadingFragment.f30109f.mo46864d().mo47124d(cascadingFragment.getContext(), "uploading"));
        } else {
            C41536l.m120506z("binding");
            throw null;
        }
    }

    /* renamed from: W1 */
    private final void m38587W1() {
        m38577M1().mo46018jw().mo4819k(getViewLifecycleOwner(), new C18285b());
        m38577M1().mo46019kw().mo4819k(getViewLifecycleOwner(), new C18286c(this));
        m38577M1().mo46021mw().mo4819k(getViewLifecycleOwner(), new C18287d(this));
        m38577M1().mo46017iw().mo4819k(getViewLifecycleOwner(), new C18288e());
        m38577M1().mo46024pw().mo4819k(getViewLifecycleOwner(), new C18289f(this));
        m38577M1().mo46016hw().mo4819k(getViewLifecycleOwner(), new C18290g(this));
        C40845o1 unused = C40821j.m118316b(C1629r.m5683a(this), (C41752f) null, (C40822j0) null, new C10603e(this, (Continuation) null), 3, (Object) null);
        C40845o1 unused2 = C40821j.m118316b(C1629r.m5683a(this), (C41752f) null, (C40822j0) null, new C10605f(this, (Continuation) null), 3, (Object) null);
        this.f30119p = 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: X1 */
    public static final void m38588X1(Integer num) {
    }

    /* access modifiers changed from: private */
    /* renamed from: Y1 */
    public static final void m38589Y1(CascadingFragment cascadingFragment, String str) {
        C41536l.m120489i(cascadingFragment, "this$0");
        C17148b bVar = cascadingFragment.f30112i;
        if (bVar != null) {
            bVar.f47980r.setText(str);
        } else {
            C41536l.m120506z("binding");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Z1 */
    public static final void m38590Z1(CascadingFragment cascadingFragment, Integer num) {
        boolean z;
        C41536l.m120489i(cascadingFragment, "this$0");
        boolean z2 = false;
        if ((num != null && num.intValue() == 0) || (num != null && num.intValue() == 1)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if ((num != null && num.intValue() == 2) || (num != null && num.intValue() == 3)) {
                z2 = true;
            }
            if (z2) {
                C40845o1 o1Var = cascadingFragment.f30117n;
                if (o1Var != null) {
                    C40845o1.C40846a.m118414a(o1Var, (CancellationException) null, 1, (Object) null);
                }
                cascadingFragment.m38577M1().mo46017iw().mo4823o(-1);
                if (!cascadingFragment.f30120q) {
                    cascadingFragment.m38577M1().mo46018jw().mo4823o(Integer.valueOf(C16346d.identomat_cascading_neutral));
                    cascadingFragment.m38577M1().mo46019kw().mo4826r(cascadingFragment.mo27305K1().mo46864d().mo47124d(cascadingFragment.getContext(), "cascading_neutral_face"));
                    cascadingFragment.m38577M1().mo46017iw().mo4823o(-1);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a2 */
    public static final void m38591a2(Integer num) {
        C41536l.m120488h(num, "it");
        num.intValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: b2 */
    public static final void m38592b2(CascadingFragment cascadingFragment, Boolean bool) {
        C41536l.m120489i(cascadingFragment, "this$0");
        C41536l.m120488h(bool, "it");
        if (bool.booleanValue()) {
            C17148b bVar = cascadingFragment.f30112i;
            if (bVar != null) {
                bVar.f47967e.setVisibility(8);
                C17148b bVar2 = cascadingFragment.f30112i;
                if (bVar2 != null) {
                    bVar2.f47977o.setVisibility(0);
                } else {
                    C41536l.m120506z("binding");
                    throw null;
                }
            } else {
                C41536l.m120506z("binding");
                throw null;
            }
        } else {
            C17148b bVar3 = cascadingFragment.f30112i;
            if (bVar3 != null) {
                bVar3.f47967e.setVisibility(0);
                C17148b bVar4 = cascadingFragment.f30112i;
                if (bVar4 != null) {
                    bVar4.f47977o.setVisibility(8);
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

    /* access modifiers changed from: private */
    /* renamed from: c2 */
    public static final void m38593c2(CascadingFragment cascadingFragment, Boolean bool) {
        C41536l.m120489i(cascadingFragment, "this$0");
        C41536l.m120488h(bool, "it");
        if (bool.booleanValue()) {
            cascadingFragment.f30124u = true;
            ValueAnimator valueAnimator = cascadingFragment.f30121r;
            if (valueAnimator != null) {
                valueAnimator.end();
            }
            C40845o1 o1Var = cascadingFragment.f30117n;
            if (o1Var != null) {
                C40845o1.C40846a.m118414a(o1Var, (CancellationException) null, 1, (Object) null);
            }
            cascadingFragment.m38577M1().mo46017iw().mo4823o(-1);
            cascadingFragment.m38574H1();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d2 */
    public final void m38594d2() {
        Log.i("identomat_", "observeResponse: ");
        LiveData lw = m38577M1().mo46020lw();
        if (lw != null) {
            lw.mo4819k(getViewLifecycleOwner(), new C18292i(this));
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: e2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m38595e2(com.identomat.fragments.liveness.cascading.CascadingFragment r7, org.json.JSONObject r8) {
        /*
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.C41536l.m120489i(r7, r0)
            long r0 = java.lang.System.currentTimeMillis()
            r7.f30114k = r0
            r0 = 1
            if (r8 != 0) goto L_0x0010
            goto L_0x018d
        L_0x0010:
            java.lang.String r1 = "smileLevel"
            boolean r2 = r8.has(r1)
            if (r2 == 0) goto L_0x0054
            vc.k r2 = r7.m38577M1()
            androidx.lifecycle.x r2 = r2.mo46021mw()
            r3 = 5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0053
            vc.k r2 = r7.m38577M1()
            androidx.lifecycle.x r2 = r2.mo46021mw()
            r3 = 4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x003f
            goto L_0x0053
        L_0x003f:
            int r1 = r8.getInt(r1)     // Catch:{ Exception -> 0x0054 }
            vc.k r2 = r7.m38577M1()     // Catch:{ Exception -> 0x0054 }
            androidx.lifecycle.x r2 = r2.mo46021mw()     // Catch:{ Exception -> 0x0054 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x0054 }
            r2.mo4823o(r1)     // Catch:{ Exception -> 0x0054 }
            goto L_0x0054
        L_0x0053:
            return
        L_0x0054:
            java.lang.String r1 = "instruction"
            boolean r2 = r8.has(r1)
            if (r2 == 0) goto L_0x0175
            java.lang.String r1 = r8.getString(r1)
            if (r1 == 0) goto L_0x0175
            int r2 = r1.hashCode()
            r3 = 0
            r4 = -1
            r5 = 0
            switch(r2) {
                case -946821465: goto L_0x015d;
                case -592376106: goto L_0x014e;
                case -375759197: goto L_0x0112;
                case -320529218: goto L_0x00e2;
                case 3089282: goto L_0x00d3;
                case 2040588802: goto L_0x006e;
                default: goto L_0x006c;
            }
        L_0x006c:
            goto L_0x0175
        L_0x006e:
            java.lang.String r2 = "smile-face"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0078
            goto L_0x0175
        L_0x0078:
            int r1 = r7.f30119p
            int r1 = r1 + r4
            r7.f30119p = r1
            vc.k r1 = r7.m38577M1()
            androidx.lifecycle.x r1 = r1.mo46018jw()
            int r2 = p485kc.C16346d.identomat_cascading_smile
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.mo4823o(r2)
            vc.k r1 = r7.m38577M1()
            androidx.lifecycle.x r1 = r1.mo46019kw()
            yc.a r2 = r7.mo27305K1()
            zc.f r2 = r2.mo46864d()
            android.content.Context r3 = r7.getContext()
            java.lang.String r6 = "cascading_smile"
            java.lang.String r2 = r2.mo47124d(r3, r6)
            r1.mo4826r(r2)
            ef1.o1 r1 = r7.f30117n
            if (r1 != 0) goto L_0x00b0
            goto L_0x00b3
        L_0x00b0:
            ef1.C40845o1.C40846a.m118414a(r1, r5, r0, r5)
        L_0x00b3:
            vc.k r1 = r7.m38577M1()
            androidx.lifecycle.x r1 = r1.mo46017iw()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r1.mo4823o(r2)
            vc.k r1 = r7.m38577M1()
            androidx.lifecycle.x r1 = r1.mo46021mw()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r1.mo4823o(r2)
            goto L_0x0175
        L_0x00d3:
            java.lang.String r2 = "done"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00dd
            goto L_0x0175
        L_0x00dd:
            r7.m38573G1()
            goto L_0x0175
        L_0x00e2:
            java.lang.String r2 = "face-result-rejected"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00ec
            goto L_0x0175
        L_0x00ec:
            android.animation.ValueAnimator r1 = r7.f30121r
            if (r1 != 0) goto L_0x00f1
            goto L_0x00f4
        L_0x00f1:
            r1.end()
        L_0x00f4:
            r7.m38597g2()
            ef1.o1 r1 = r7.f30117n
            if (r1 != 0) goto L_0x00fc
            goto L_0x00ff
        L_0x00fc:
            ef1.C40845o1.C40846a.m118414a(r1, r5, r0, r5)
        L_0x00ff:
            vc.k r1 = r7.m38577M1()
            androidx.lifecycle.x r1 = r1.mo46017iw()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r1.mo4823o(r2)
            r7.m38573G1()
            goto L_0x0176
        L_0x0112:
            java.lang.String r2 = "neutral-face"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x011b
            goto L_0x0175
        L_0x011b:
            vc.k r1 = r7.m38577M1()
            androidx.lifecycle.x r1 = r1.mo46018jw()
            int r2 = p485kc.C16346d.identomat_cascading_neutral
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.mo4823o(r2)
            oc.b r1 = r7.f30112i
            if (r1 == 0) goto L_0x0148
            android.widget.TextView r1 = r1.f47980r
            yc.a r2 = r7.mo27305K1()
            zc.f r2 = r2.mo46864d()
            android.content.Context r3 = r7.getContext()
            java.lang.String r4 = "cascading_neutral_face"
            java.lang.String r2 = r2.mo47124d(r3, r4)
            r1.setText(r2)
            goto L_0x0175
        L_0x0148:
            java.lang.String r7 = "binding"
            kotlin.jvm.internal.C41536l.m120506z(r7)
            throw r5
        L_0x014e:
            java.lang.String r2 = "face-start-recording"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0157
            goto L_0x0175
        L_0x0157:
            r7.f30123t = r3
            r7.m38615p2()
            goto L_0x0175
        L_0x015d:
            java.lang.String r2 = "face-finish-recording"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0166
            goto L_0x0175
        L_0x0166:
            r7.f30122s = r0
            vc.k r1 = r7.m38577M1()
            androidx.lifecycle.x r1 = r1.mo46024pw()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1.mo4823o(r2)
        L_0x0175:
            r3 = r0
        L_0x0176:
            java.lang.String r1 = "result"
            boolean r2 = r8.has(r1)
            if (r2 == 0) goto L_0x018c
            java.lang.Object r8 = r8.get(r1)
            java.lang.String r1 = "failed"
            boolean r8 = kotlin.jvm.internal.C41536l.m120484d(r8, r1)
            if (r8 == 0) goto L_0x018c
            r7.f30123t = r0
        L_0x018c:
            r0 = r3
        L_0x018d:
            java.lang.String r8 = "identomat_"
            if (r0 != 0) goto L_0x019d
            java.lang.String r1 = "processResult: false"
            android.util.Log.i(r8, r1)
            vc.k r1 = r7.m38577M1()
            r1.mo46015gw()
        L_0x019d:
            java.lang.String r1 = "observeResponse: "
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            java.lang.String r1 = kotlin.jvm.internal.C41536l.m120497q(r1, r2)
            android.util.Log.i(r8, r1)
            r7.f30113j = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.identomat.fragments.liveness.cascading.CascadingFragment.m38595e2(com.identomat.fragments.liveness.cascading.CascadingFragment, org.json.JSONObject):void");
    }

    /* renamed from: f2 */
    private final void m38596f2(Bitmap bitmap, float f) {
        Integer num;
        if (getContext() != null) {
            C12074b bVar = C12074b.f35484a;
            Bitmap c = bVar.mo32221c(bVar.mo32223e(bVar.mo32224f(bitmap, f), 192), 1.0f);
            m38603j2(c);
            Log.i("identomat_", C41536l.m120497q("process: time: ", Long.valueOf(System.currentTimeMillis() - this.f30115l)));
            StringBuilder sb = new StringBuilder();
            sb.append("sendImage: bitmap: ");
            Integer num2 = null;
            if (c == null) {
                num = null;
            } else {
                num = Integer.valueOf(c.getWidth());
            }
            sb.append(num);
            sb.append(' ');
            if (c != null) {
                num2 = Integer.valueOf(c.getHeight());
            }
            sb.append(num2);
            Log.i("identomat_", sb.toString());
        }
    }

    /* renamed from: g2 */
    private final void m38597g2() {
        C17148b bVar = this.f30112i;
        if (bVar != null) {
            bVar.f47971i.mo29426u();
            C17148b bVar2 = this.f30112i;
            if (bVar2 != null) {
                bVar2.f47971i.mo29425t();
            } else {
                C41536l.m120506z("binding");
                throw null;
            }
        } else {
            C41536l.m120506z("binding");
            throw null;
        }
    }

    /* renamed from: h2 */
    private final void m38599h2(TextView textView, int i) {
        ObjectAnimator L1 = m38576L1(textView);
        this.f30121r = L1;
        if (L1 != null) {
            L1.start();
        }
    }

    /* renamed from: i2 */
    static /* synthetic */ void m38601i2(CascadingFragment cascadingFragment, TextView textView, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        cascadingFragment.m38599h2(textView, i);
    }

    /* renamed from: j2 */
    private final void m38603j2(Bitmap bitmap) {
        Log.i("identomat_", "sendImage: ");
        if (bitmap == null) {
            Log.i("identomat_", "bitmap is null");
            this.f30113j = true;
        } else if (getContext() != null) {
            try {
                m38577M1().mo46026rw(bitmap);
            } catch (Exception e) {
                Log.i("identomat_", e.toString());
                this.f30113j = true;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public final void m38605k2() {
        Log.i("identomat_", "sendSessionId: ");
        m38577M1().mo46027sw(C9786e.f26584a.mo26262a());
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public final void m38607l2() {
        Log.i("identomat_", "sendVideo: sending video");
        m38597g2();
        File file = this.f30118o;
        if (file != null) {
            C40845o1 unused = C40821j.m118316b(C1629r.m5683a(this), C40867u0.m118468b(), (C40822j0) null, new C10607g(this, file, (Continuation) null), 2, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public final void m38609m2() {
        this.f30116m = C40821j.m118316b(C1629r.m5683a(this), (C41752f) null, (C40822j0) null, new C10612l(this, (Continuation) null), 3, (Object) null);
    }

    /* renamed from: n2 */
    private final void m38611n2() {
        C17148b bVar = this.f30112i;
        if (bVar != null) {
            bVar.f47971i.setLifecycleOwner(this);
            C17148b bVar2 = this.f30112i;
            if (bVar2 != null) {
                bVar2.f47971i.setMode(C15753j.VIDEO);
                C17148b bVar3 = this.f30112i;
                if (bVar3 != null) {
                    bVar3.f47971i.setFrameProcessingFormat(35);
                    C17148b bVar4 = this.f30112i;
                    if (bVar4 != null) {
                        bVar4.f47971i.setVideoBitRate(this.f30126w);
                        C17148b bVar5 = this.f30112i;
                        if (bVar5 != null) {
                            bVar5.f47971i.setPreviewFrameRate(15.0f);
                            C17148b bVar6 = this.f30112i;
                            if (bVar6 != null) {
                                bVar6.f47971i.setPreviewFrameRateExact(true);
                                C17148b bVar7 = this.f30112i;
                                if (bVar7 != null) {
                                    bVar7.f47971i.setPreviewStreamSize(new C18293j());
                                    C17148b bVar8 = this.f30112i;
                                    if (bVar8 != null) {
                                        bVar8.f47971i.mo29426u();
                                        C17148b bVar9 = this.f30112i;
                                        if (bVar9 != null) {
                                            bVar9.f47971i.mo29378q(this.f30127x);
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
    /* renamed from: o2 */
    public static final List m38613o2(List list) {
        Integer num;
        Object obj;
        Integer num2;
        Object obj2;
        boolean z;
        boolean z2;
        C41536l.m120489i(list, "nativeSizes");
        ArrayList arrayList = new ArrayList();
        if (list.size() > 1) {
            C41349u.m119946y(list, new C10615m());
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

    /* renamed from: p2 */
    private final void m38615p2() {
        File file;
        Log.i("identomat_", "startRecording: ");
        if (!this.f30123t) {
            this.f30120q = true;
            C17148b bVar = this.f30112i;
            if (bVar != null) {
                bVar.f47971i.mo29425t();
                C17148b bVar2 = this.f30112i;
                if (bVar2 != null) {
                    bVar2.f47971i.mo29426u();
                    C17148b bVar3 = this.f30112i;
                    if (bVar3 != null) {
                        bVar3.f47971i.mo29321K();
                        C17148b bVar4 = this.f30112i;
                        if (bVar4 != null) {
                            bVar4.f47971i.mo29377p(this.f30128y);
                            C17148b bVar5 = this.f30112i;
                            if (bVar5 != null) {
                                bVar5.f47971i.mo29378q(this.f30127x);
                                Context context = getContext();
                                if (context == null) {
                                    file = null;
                                } else {
                                    file = context.getCacheDir();
                                }
                                File file2 = new File(file, "liveness.mp4");
                                this.f30118o = file2;
                                file2.delete();
                                File file3 = this.f30118o;
                                if (file3 != null) {
                                    file3.createNewFile();
                                }
                                File file4 = this.f30118o;
                                if (file4 != null) {
                                    C17148b bVar6 = this.f30112i;
                                    if (bVar6 != null) {
                                        bVar6.f47971i.mo29326R(file4, 30000);
                                    } else {
                                        C41536l.m120506z("binding");
                                        throw null;
                                    }
                                }
                                this.f30125v = C40821j.m118316b(C1629r.m5683a(this), C40867u0.m118468b(), (C40822j0) null, new C10616n((Continuation) null), 2, (Object) null);
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
            C41536l.m120506z("binding");
            throw null;
        }
    }

    /* renamed from: J1 */
    public final C9786e mo27304J1() {
        return this.f30107d;
    }

    /* renamed from: K1 */
    public final C18877a mo27305K1() {
        return this.f30109f;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        C17148b d = C17148b.m60230d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f30112i = d;
        m38572F1();
        m38579O1();
        m38581Q1();
        m38587W1();
        C17148b bVar = this.f30112i;
        if (bVar != null) {
            return bVar.mo3946b();
        }
        C41536l.m120506z("binding");
        throw null;
    }

    public void onPause() {
        super.onPause();
        this.f30107d.mo26255q(getContext(), this.f30110g);
        C40845o1 o1Var = this.f30116m;
        if (o1Var != null) {
            C40845o1.C40846a.m118414a(o1Var, (CancellationException) null, 1, (Object) null);
        }
        this.f30118o = null;
        if (C41536l.m120484d(m38577M1().mo46024pw().mo4814f(), Boolean.FALSE)) {
            m38577M1().mo46015gw();
        }
    }

    public void onResume() {
        super.onResume();
        C17148b bVar = this.f30112i;
        if (bVar != null) {
            bVar.f47980r.setText(this.f30109f.mo46864d().mo47124d(getContext(), "cascading_start"));
            C17148b bVar2 = this.f30112i;
            if (bVar2 != null) {
                TextView textView = bVar2.f47980r;
                C41536l.m120488h(textView, "binding.messageView");
                m38601i2(this, textView, 0, 2, (Object) null);
                this.f30120q = false;
                m38577M1().mo46025qw();
                return;
            }
            C41536l.m120506z("binding");
            throw null;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    public void onStop() {
        super.onStop();
    }
}
