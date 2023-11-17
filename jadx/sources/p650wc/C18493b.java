package p650wc;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import he1.C41217g;
import he1.C41222k;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p541oc.C17153g;
import p637vc.C18294k;
import p678yc.C18877a;
import p692zc.C18999c;
import p692zc.C19002e;
import ue1.C43064a;

/* renamed from: wc.b */
public final class C18493b extends Fragment {

    /* renamed from: i */
    public static final C18494a f51962i = new C18494a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C18877a f51963d;

    /* renamed from: e */
    private C17153g f51964e;

    /* renamed from: f */
    private ValueAnimator f51965f;

    /* renamed from: g */
    private ValueAnimator f51966g;

    /* renamed from: h */
    private final C41217g f51967h;

    /* renamed from: wc.b$a */
    public static final class C18494a {
        private C18494a() {
        }

        public /* synthetic */ C18494a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: wc.b$b */
    public static final class C18495b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f51968d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18495b(C43064a aVar) {
            super(0);
            this.f51968d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f51968d.invoke();
        }
    }

    /* renamed from: wc.b$c */
    public static final class C18496c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f51969d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18496c(C41217g gVar) {
            super(0);
            this.f51969d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f51969d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: wc.b$d */
    public static final class C18497d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f51970d;

        /* renamed from: e */
        final /* synthetic */ C41217g f51971e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18497d(C43064a aVar, C41217g gVar) {
            super(0);
            this.f51970d = aVar;
            this.f51971e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f51970d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f51971e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: wc.b$e */
    public static final class C18498e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f51972d;

        /* renamed from: e */
        final /* synthetic */ C41217g f51973e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18498e(Fragment fragment, C41217g gVar) {
            super(0);
            this.f51972d = fragment;
            this.f51973e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f51973e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f51972d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    /* renamed from: wc.b$f */
    static final class C18499f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C18493b f51974d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18499f(C18493b bVar) {
            super(0);
            this.f51974d = bVar;
        }

        public final C1638u0 invoke() {
            Fragment requireParentFragment = this.f51974d.requireParentFragment();
            C41536l.m120488h(requireParentFragment, "requireParentFragment()");
            return requireParentFragment;
        }
    }

    public C18493b(C18877a aVar) {
        C41536l.m120489i(aVar, "identomatConfig");
        this.f51963d = aVar;
        C41217g a = C41219i.m119469a(C41222k.NONE, new C18495b(new C18499f(this)));
        this.f51967h = C1514j0.m5374c(this, C41520a0.m120436b(C18294k.class), new C18496c(a), new C18497d((C43064a) null, a), new C18498e(this, a));
    }

    /* renamed from: k1 */
    private final C18294k m62977k1() {
        return (C18294k) this.f51967h.getValue();
    }

    /* renamed from: l1 */
    private final void m62978l1() {
        C17153g gVar = this.f51964e;
        if (gVar != null) {
            gVar.f48023l.setOnClickListener(new C18492a(this));
        } else {
            C41536l.m120506z("binding");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m1 */
    public static final void m62979m1(C18493b bVar, View view) {
        C41536l.m120489i(bVar, "this$0");
        ValueAnimator j1 = bVar.mo46286j1();
        if (j1 != null) {
            j1.end();
        }
        ValueAnimator i1 = bVar.mo46285i1();
        if (i1 != null) {
            i1.end();
        }
        bVar.m62977k1().mo46031ww();
    }

    /* renamed from: n1 */
    private final void m62980n1() {
        C19002e.C19003a aVar = C19002e.f53052q;
        C17153g gVar = this.f51964e;
        if (gVar != null) {
            ImageView imageView = gVar.f48021j;
            C41536l.m120488h(imageView, "binding.ivFaceSmile");
            aVar.mo47122h(imageView, this.f51963d.mo46861a().mo47097f().mo33033a());
            C17153g gVar2 = this.f51964e;
            if (gVar2 != null) {
                ImageView imageView2 = gVar2.f48020i;
                C41536l.m120488h(imageView2, "binding.ivFaceNeutral");
                aVar.mo47122h(imageView2, this.f51963d.mo46861a().mo47097f().mo33033a());
                C17153g gVar3 = this.f51964e;
                if (gVar3 != null) {
                    ImageView imageView3 = gVar3.f48019h;
                    C41536l.m120488h(imageView3, "binding.ivFaceArrow");
                    aVar.mo47122h(imageView3, this.f51963d.mo46861a().mo47094c().mo33033a());
                    C17153g gVar4 = this.f51964e;
                    if (gVar4 != null) {
                        gVar4.f48018g.setBackgroundTintList(ColorStateList.valueOf(this.f51963d.mo46861a().mo47095d().mo33033a()));
                        C17153g gVar5 = this.f51964e;
                        if (gVar5 != null) {
                            gVar5.f48024m.setTextColor(this.f51963d.mo46861a().mo47105n().mo33033a());
                            C17153g gVar6 = this.f51964e;
                            if (gVar6 != null) {
                                gVar6.f48028q.setTextColor(this.f51963d.mo46861a().mo47106o().mo33033a());
                                C17153g gVar7 = this.f51964e;
                                if (gVar7 != null) {
                                    gVar7.f48026o.setTextColor(this.f51963d.mo46861a().mo47104m().mo33033a());
                                    C17153g gVar8 = this.f51964e;
                                    if (gVar8 != null) {
                                        gVar8.f48027p.setTextColor(this.f51963d.mo46861a().mo47104m().mo33033a());
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

    /* renamed from: o1 */
    private final void m62981o1() {
        C17153g gVar = this.f51964e;
        if (gVar != null) {
            gVar.mo3946b().setBackgroundColor(this.f51963d.mo46861a().mo47093b().mo33033a());
            C19002e.C19003a aVar = C19002e.f53052q;
            C17153g gVar2 = this.f51964e;
            if (gVar2 != null) {
                RelativeLayout relativeLayout = gVar2.f48023l;
                C41536l.m120488h(relativeLayout, "binding.startButton");
                aVar.mo47120f(relativeLayout, this.f51963d.mo46861a().mo47100i().mo33033a());
                C17153g gVar3 = this.f51964e;
                if (gVar3 != null) {
                    gVar3.f48022k.setTextColor(this.f51963d.mo46861a().mo47101j().mo33033a());
                    m62982p1(this);
                    m62983q1(this);
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

    /* renamed from: p1 */
    private static final void m62982p1(C18493b bVar) {
        C18999c e = bVar.f51963d.mo46867g().mo47140e();
        C17153g gVar = bVar.f51964e;
        if (gVar != null) {
            TextView textView = gVar.f48024m;
            C41536l.m120488h(textView, "binding.titleTextView");
            e.mo47079g(textView, -1);
            C18999c e2 = bVar.f51963d.mo46867g().mo47140e();
            C17153g gVar2 = bVar.f51964e;
            if (gVar2 != null) {
                TextView textView2 = gVar2.f48028q;
                C41536l.m120488h(textView2, "binding.tvInstructionsTitle");
                e2.mo47079g(textView2, 0);
                C18999c e3 = bVar.f51963d.mo46867g().mo47140e();
                C17153g gVar3 = bVar.f51964e;
                if (gVar3 != null) {
                    TextView textView3 = gVar3.f48026o;
                    C41536l.m120488h(textView3, "binding.tvInstructions1");
                    e3.mo47079g(textView3, 2);
                    C18999c e4 = bVar.f51963d.mo46867g().mo47140e();
                    C17153g gVar4 = bVar.f51964e;
                    if (gVar4 != null) {
                        TextView textView4 = gVar4.f48027p;
                        C41536l.m120488h(textView4, "binding.tvInstructions2");
                        e4.mo47079g(textView4, 2);
                        C18999c e5 = bVar.f51963d.mo46867g().mo47140e();
                        C17153g gVar5 = bVar.f51964e;
                        if (gVar5 != null) {
                            TextView textView5 = gVar5.f48022k;
                            C41536l.m120488h(textView5, "binding.readyTextView");
                            e5.mo47079g(textView5, 1);
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

    /* renamed from: q1 */
    private static final void m62983q1(C18493b bVar) {
        C17153g gVar = bVar.f51964e;
        if (gVar != null) {
            gVar.f48024m.setText(bVar.f51963d.mo46864d().mo47124d(bVar.getContext(), "record_begin_title"));
            C17153g gVar2 = bVar.f51964e;
            if (gVar2 != null) {
                gVar2.f48028q.setText(bVar.f51963d.mo46864d().mo47124d(bVar.getContext(), "cascading_instructions_title"));
                C17153g gVar3 = bVar.f51964e;
                if (gVar3 != null) {
                    gVar3.f48026o.setText(bVar.f51963d.mo46864d().mo47124d(bVar.getContext(), "cascading_instructions_1"));
                    C17153g gVar4 = bVar.f51964e;
                    if (gVar4 != null) {
                        gVar4.f48027p.setText(bVar.f51963d.mo46864d().mo47124d(bVar.getContext(), "cascading_instructions_2"));
                        C17153g gVar5 = bVar.f51964e;
                        if (gVar5 != null) {
                            gVar5.f48022k.setText(bVar.f51963d.mo46864d().mo47124d(bVar.getContext(), "cascading_button"));
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

    /* renamed from: i1 */
    public final ValueAnimator mo46285i1() {
        return this.f51966g;
    }

    /* renamed from: j1 */
    public final ValueAnimator mo46286j1() {
        return this.f51965f;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        C17153g d = C17153g.m60254d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f51964e = d;
        m62981o1();
        m62980n1();
        m62978l1();
        C17153g gVar = this.f51964e;
        if (gVar != null) {
            return gVar.mo3946b();
        }
        C41536l.m120506z("binding");
        throw null;
    }
}
