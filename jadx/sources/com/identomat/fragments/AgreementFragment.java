package com.identomat.fragments;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1629r;
import com.identomat.activities.NavigationActivity;
import ef1.C40813h;
import ef1.C40814h0;
import ef1.C40822j0;
import ef1.C40845o1;
import ef1.C40867u0;
import ef1.C40883y1;
import he1.C41228o;
import he1.C41238w;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C41536l;
import oe1.C41862l;
import p228r0.C8034d;
import p345ad.C9786e;
import p485kc.C16341a;
import p541oc.C17149c;
import p583rc.C17576a;
import p583rc.C17577b;
import p678yc.C18877a;
import p692zc.C18999c;
import p692zc.C19002e;
import p692zc.C19005g;
import ue1.C43079p;

public final class AgreementFragment extends Fragment {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C9786e f29893d;

    /* renamed from: e */
    private final C18877a f29894e;

    /* renamed from: f */
    private final String f29895f = "agreement_page";

    /* renamed from: g */
    private C17149c f29896g;

    /* renamed from: com.identomat.fragments.AgreementFragment$a */
    static final class C10529a extends C41862l implements C43079p {

        /* renamed from: h */
        int f29897h;

        /* renamed from: i */
        final /* synthetic */ AgreementFragment f29898i;

        /* renamed from: com.identomat.fragments.AgreementFragment$a$a */
        static final class C10530a extends C41862l implements C43079p {

            /* renamed from: h */
            int f29899h;

            /* renamed from: i */
            final /* synthetic */ AgreementFragment f29900i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10530a(AgreementFragment agreementFragment, Continuation continuation) {
                super(2, continuation);
                this.f29900i = agreementFragment;
            }

            /* renamed from: a */
            public final Continuation mo3708a(Object obj, Continuation continuation) {
                return new C10530a(this.f29900i, continuation);
            }

            /* renamed from: f */
            public final Object mo3709f(Object obj) {
                Object unused = C41793d.m121157c();
                if (this.f29899h == 0) {
                    C41228o.m119483b(obj);
                    C16341a.f46171a.mo43313a(this.f29900i.getActivity());
                    return C41238w.f97225a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* renamed from: n */
            public final Object invoke(C40814h0 h0Var, Continuation continuation) {
                return ((C10530a) mo3708a(h0Var, continuation)).mo3709f(C41238w.f97225a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10529a(AgreementFragment agreementFragment, Continuation continuation) {
            super(2, continuation);
            this.f29898i = agreementFragment;
        }

        /* renamed from: a */
        public final Continuation mo3708a(Object obj, Continuation continuation) {
            return new C10529a(this.f29898i, continuation);
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            Object c = C41793d.m121157c();
            int i = this.f29897h;
            if (i == 0) {
                C41228o.m119483b(obj);
                C9786e j1 = this.f29898i.f29893d;
                Context context = this.f29898i.getContext();
                this.f29897h = 1;
                if (j1.mo26251i(context, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C41228o.m119483b(obj);
            } else if (i == 2) {
                C41228o.m119483b(obj);
                return C41238w.f97225a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C40883y1 c2 = C40867u0.m118469c();
            C10530a aVar = new C10530a(this.f29898i, (Continuation) null);
            this.f29897h = 2;
            if (C40813h.m118303e(c2, aVar, this) == c) {
                return c;
            }
            return C41238w.f97225a;
        }

        /* renamed from: n */
        public final Object invoke(C40814h0 h0Var, Continuation continuation) {
            return ((C10529a) mo3708a(h0Var, continuation)).mo3709f(C41238w.f97225a);
        }
    }

    public AgreementFragment(C9786e eVar, C18877a aVar) {
        C41536l.m120489i(eVar, "api");
        C41536l.m120489i(aVar, "identomatConfig");
        this.f29893d = eVar;
        this.f29894e = aVar;
    }

    /* renamed from: k1 */
    private final void m38163k1() {
        C17149c cVar = this.f29896g;
        if (cVar != null) {
            cVar.f47982e.setOnClickListener(new C17576a(this));
            C17149c cVar2 = this.f29896g;
            if (cVar2 != null) {
                cVar2.f47989l.setOnClickListener(new C17577b(this));
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
    /* renamed from: l1 */
    public static final void m38164l1(AgreementFragment agreementFragment, View view) {
        C41536l.m120489i(agreementFragment, "this$0");
        C19005g.C19006a b = agreementFragment.f29894e.mo46865e().mo47126b();
        C8034d.m30522a(agreementFragment).mo22119N(b.mo47132b(), b.mo47131a(), NavigationActivity.f29874v.mo27261a());
    }

    /* access modifiers changed from: private */
    /* renamed from: m1 */
    public static final void m38165m1(AgreementFragment agreementFragment, View view) {
        C41536l.m120489i(agreementFragment, "this$0");
        C40845o1 unused = C40821j.m118316b(C1629r.m5683a(agreementFragment), C40867u0.m118468b(), (C40822j0) null, new C10529a(agreementFragment, (Continuation) null), 2, (Object) null);
    }

    /* renamed from: n1 */
    private final void m38166n1() {
        C17149c cVar = this.f29896g;
        if (cVar != null) {
            cVar.mo3946b().setBackgroundColor(this.f29894e.mo46861a().mo47093b().mo33033a());
            C19002e.C19003a aVar = C19002e.f53052q;
            C17149c cVar2 = this.f29896g;
            if (cVar2 != null) {
                LinearLayout linearLayout = cVar2.f47984g;
                C41536l.m120488h(linearLayout, "binding.agreementPanel");
                aVar.mo47120f(linearLayout, this.f29894e.mo46861a().mo47092a().mo33033a());
                C17149c cVar3 = this.f29896g;
                if (cVar3 != null) {
                    RelativeLayout relativeLayout = cVar3.f47982e;
                    C41536l.m120488h(relativeLayout, "binding.agreeButton");
                    aVar.mo47120f(relativeLayout, this.f29894e.mo46861a().mo47100i().mo33033a());
                    C17149c cVar4 = this.f29896g;
                    if (cVar4 != null) {
                        RelativeLayout relativeLayout2 = cVar4.f47989l;
                        C41536l.m120488h(relativeLayout2, "binding.disagreeButton");
                        aVar.mo47120f(relativeLayout2, this.f29894e.mo46861a().mo47102k().mo33033a());
                        C17149c cVar5 = this.f29896g;
                        if (cVar5 != null) {
                            RelativeLayout relativeLayout3 = cVar5.f47989l;
                            C41536l.m120488h(relativeLayout3, "binding.disagreeButton");
                            aVar.mo47121g(relativeLayout3, this.f29894e.mo46861a().mo47100i().mo33033a(), 1);
                            C17149c cVar6 = this.f29896g;
                            if (cVar6 != null) {
                                cVar6.f47991n.setTextColor(this.f29894e.mo46861a().mo47105n().mo33033a());
                                C17149c cVar7 = this.f29896g;
                                if (cVar7 != null) {
                                    cVar7.f47985h.setTextColor(this.f29894e.mo46861a().mo47104m().mo33033a());
                                    C17149c cVar8 = this.f29896g;
                                    if (cVar8 != null) {
                                        cVar8.f47983f.setTextColor(this.f29894e.mo46861a().mo47101j().mo33033a());
                                        C17149c cVar9 = this.f29896g;
                                        if (cVar9 != null) {
                                            cVar9.f47990m.setTextColor(this.f29894e.mo46861a().mo47103l().mo33033a());
                                            if (this.f29894e.mo46867g().mo47148m() != null) {
                                                C17149c cVar10 = this.f29896g;
                                                if (cVar10 != null) {
                                                    LinearLayout linearLayout2 = cVar10.f47984g;
                                                    Integer m = this.f29894e.mo46867g().mo47148m();
                                                    C41536l.m120486f(m);
                                                    linearLayout2.setElevation((float) m.intValue());
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
            C41536l.m120506z("binding");
            throw null;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    /* renamed from: o1 */
    private final void m38167o1() {
        Integer b = this.f29894e.mo46867g().mo47137b();
        if (b != null) {
            int intValue = b.intValue();
            C19002e.C19003a aVar = C19002e.f53052q;
            Resources resources = getResources();
            C41536l.m120488h(resources, "resources");
            aVar.mo47119e(intValue, resources);
        }
        C19002e.C19003a aVar2 = C19002e.f53052q;
        C1505h activity = getActivity();
        C17149c cVar = this.f29896g;
        if (cVar != null) {
            ImageView imageView = cVar.f47986i;
            C41536l.m120488h(imageView, "binding.backButton");
            C17149c cVar2 = this.f29896g;
            if (cVar2 != null) {
                TextView textView = cVar2.f47987j;
                C41536l.m120488h(textView, "binding.backButtonTitleView");
                aVar2.mo47118b(activity, imageView, textView, true, this.f29894e);
                return;
            }
            C41536l.m120506z("binding");
            throw null;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    /* renamed from: p1 */
    private final void m38168p1() {
        C18999c e = this.f29894e.mo46867g().mo47140e();
        C17149c cVar = this.f29896g;
        if (cVar != null) {
            TextView textView = cVar.f47991n;
            C41536l.m120488h(textView, "binding.titleTextView");
            e.mo47079g(textView, 0);
            C18999c e2 = this.f29894e.mo46867g().mo47140e();
            C17149c cVar2 = this.f29896g;
            if (cVar2 != null) {
                TextView textView2 = cVar2.f47983f;
                C41536l.m120488h(textView2, "binding.agreeTextView");
                e2.mo47079g(textView2, 1);
                C18999c e3 = this.f29894e.mo46867g().mo47140e();
                C17149c cVar3 = this.f29896g;
                if (cVar3 != null) {
                    TextView textView3 = cVar3.f47990m;
                    C41536l.m120488h(textView3, "binding.disagreeTextView");
                    e3.mo47079g(textView3, 1);
                    C18999c e4 = this.f29894e.mo46867g().mo47140e();
                    C17149c cVar4 = this.f29896g;
                    if (cVar4 != null) {
                        TextView textView4 = cVar4.f47985h;
                        C41536l.m120488h(textView4, "binding.agreementText");
                        e4.mo47079g(textView4, 2);
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

    /* renamed from: q1 */
    private final void m38169q1() {
        C17149c cVar = this.f29896g;
        if (cVar != null) {
            cVar.f47985h.setText(this.f29894e.mo46867g().mo47136a());
            C17149c cVar2 = this.f29896g;
            if (cVar2 != null) {
                cVar2.f47991n.setText(this.f29894e.mo46864d().mo47124d(getContext(), "agree_page_title"));
                C17149c cVar3 = this.f29896g;
                if (cVar3 != null) {
                    cVar3.f47983f.setText(this.f29894e.mo46864d().mo47124d(getContext(), "agree"));
                    C17149c cVar4 = this.f29896g;
                    if (cVar4 != null) {
                        cVar4.f47990m.setText(this.f29894e.mo46864d().mo47124d(getContext(), "disagree"));
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

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        C17149c d = C17149c.m60235d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f29896g = d;
        m38166n1();
        m38163k1();
        m38169q1();
        m38168p1();
        m38167o1();
        C17149c cVar = this.f29896g;
        if (cVar != null) {
            RelativeLayout c = cVar.mo3946b();
            C41536l.m120488h(c, "binding.root");
            return c;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    public void onResume() {
        super.onResume();
        this.f29893d.mo26255q(getContext(), this.f29895f);
    }
}
