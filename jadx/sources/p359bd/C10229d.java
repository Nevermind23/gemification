package p359bd;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p541oc.C17158l;
import p678yc.C18877a;
import p692zc.C18999c;
import p692zc.C19002e;
import ue1.C43064a;

/* renamed from: bd.d */
public final class C10229d extends Fragment {

    /* renamed from: d */
    private final C18877a f28432d;

    /* renamed from: e */
    private C17158l f28433e;

    /* renamed from: f */
    private C43064a f28434f = C10230a.f28435d;

    /* renamed from: bd.d$a */
    static final class C10230a extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C10230a f28435d = new C10230a();

        C10230a() {
            super(0);
        }

        public final void invoke() {
        }
    }

    public C10229d(C18877a aVar) {
        C41536l.m120489i(aVar, "identomatConfig");
        this.f28432d = aVar;
    }

    /* renamed from: j1 */
    private final void m37324j1() {
        C17158l lVar = this.f28433e;
        if (lVar != null) {
            lVar.f48080k.setOnClickListener(new C10228c(this));
        } else {
            C41536l.m120506z("binding");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k1 */
    public static final void m37325k1(C10229d dVar, View view) {
        C41536l.m120489i(dVar, "this$0");
        dVar.mo26790i1().invoke();
    }

    /* renamed from: l1 */
    private final void m37326l1() {
        C17158l lVar = this.f28433e;
        if (lVar != null) {
            lVar.mo3946b().setBackgroundColor(this.f28432d.mo46861a().mo47093b().mo33033a());
            C19002e.C19003a aVar = C19002e.f53052q;
            C17158l lVar2 = this.f28433e;
            if (lVar2 != null) {
                LinearLayout linearLayout = lVar2.f48075f;
                C41536l.m120488h(linearLayout, "binding.mainPanel");
                aVar.mo47120f(linearLayout, this.f28432d.mo46861a().mo47092a().mo33033a());
                C17158l lVar3 = this.f28433e;
                if (lVar3 != null) {
                    RelativeLayout relativeLayout = lVar3.f48080k;
                    C41536l.m120488h(relativeLayout, "binding.retryButton");
                    aVar.mo47120f(relativeLayout, this.f28432d.mo46861a().mo47100i().mo33033a());
                    C17158l lVar4 = this.f28433e;
                    if (lVar4 != null) {
                        lVar4.f48078i.setTextColor(this.f28432d.mo46861a().mo47105n().mo33033a());
                        C17158l lVar5 = this.f28433e;
                        if (lVar5 != null) {
                            lVar5.f48079j.setTextColor(this.f28432d.mo46861a().mo47100i().mo33033a());
                            C17158l lVar6 = this.f28433e;
                            if (lVar6 != null) {
                                lVar6.f48076g.setTextColor(this.f28432d.mo46861a().mo47104m().mo33033a());
                                C17158l lVar7 = this.f28433e;
                                if (lVar7 != null) {
                                    lVar7.f48077h.setTextColor(this.f28432d.mo46861a().mo47104m().mo33033a());
                                    C17158l lVar8 = this.f28433e;
                                    if (lVar8 != null) {
                                        lVar8.f48081l.setTextColor(this.f28432d.mo46861a().mo47101j().mo33033a());
                                        if (this.f28432d.mo46867g().mo47143h() != null) {
                                            C17158l lVar9 = this.f28433e;
                                            if (lVar9 != null) {
                                                ImageView imageView = lVar9.f48074e;
                                                Integer h = this.f28432d.mo46867g().mo47143h();
                                                C41536l.m120486f(h);
                                                imageView.setImageResource(h.intValue());
                                            } else {
                                                C41536l.m120506z("binding");
                                                throw null;
                                            }
                                        }
                                        if (this.f28432d.mo46867g().mo47144i() != null) {
                                            C17158l lVar10 = this.f28433e;
                                            if (lVar10 != null) {
                                                ViewGroup.LayoutParams layoutParams = lVar10.f48074e.getLayoutParams();
                                                Integer i = this.f28432d.mo46867g().mo47144i();
                                                C41536l.m120486f(i);
                                                layoutParams.height = i.intValue();
                                                C17158l lVar11 = this.f28433e;
                                                if (lVar11 != null) {
                                                    ViewGroup.LayoutParams layoutParams2 = lVar11.f48074e.getLayoutParams();
                                                    Integer i2 = this.f28432d.mo46867g().mo47144i();
                                                    C41536l.m120486f(i2);
                                                    layoutParams2.width = i2.intValue();
                                                } else {
                                                    C41536l.m120506z("binding");
                                                    throw null;
                                                }
                                            } else {
                                                C41536l.m120506z("binding");
                                                throw null;
                                            }
                                        }
                                        if (this.f28432d.mo46867g().mo47148m() != null) {
                                            C17158l lVar12 = this.f28433e;
                                            if (lVar12 != null) {
                                                LinearLayout linearLayout2 = lVar12.f48075f;
                                                Integer m = this.f28432d.mo46867g().mo47148m();
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

    /* renamed from: m1 */
    private final void m37327m1() {
        C18999c e = this.f28432d.mo46867g().mo47140e();
        C17158l lVar = this.f28433e;
        if (lVar != null) {
            TextView textView = lVar.f48078i;
            C41536l.m120488h(textView, "binding.recordBeginTitle");
            e.mo47079g(textView, 0);
            C18999c e2 = this.f28432d.mo46867g().mo47140e();
            C17158l lVar2 = this.f28433e;
            if (lVar2 != null) {
                TextView textView2 = lVar2.f48079j;
                C41536l.m120488h(textView2, "binding.recordInstructions");
                e2.mo47079g(textView2, 1);
                C18999c e3 = this.f28432d.mo46867g().mo47140e();
                C17158l lVar3 = this.f28433e;
                if (lVar3 != null) {
                    TextView textView3 = lVar3.f48076g;
                    C41536l.m120488h(textView3, "binding.recordBeginSection1");
                    e3.mo47079g(textView3, 2);
                    C18999c e4 = this.f28432d.mo46867g().mo47140e();
                    C17158l lVar4 = this.f28433e;
                    if (lVar4 != null) {
                        TextView textView4 = lVar4.f48077h;
                        C41536l.m120488h(textView4, "binding.recordBeginSection2");
                        e4.mo47079g(textView4, 2);
                        C18999c e5 = this.f28432d.mo46867g().mo47140e();
                        C17158l lVar5 = this.f28433e;
                        if (lVar5 != null) {
                            TextView textView5 = lVar5.f48081l;
                            C41536l.m120488h(textView5, "binding.retryButtonText");
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

    /* renamed from: n1 */
    private final void m37328n1() {
        C17158l lVar = this.f28433e;
        if (lVar != null) {
            lVar.f48078i.setText(this.f28432d.mo46864d().mo47124d(getContext(), "liveness_retry_title"));
            C17158l lVar2 = this.f28433e;
            if (lVar2 != null) {
                lVar2.f48079j.setText(this.f28432d.mo46864d().mo47124d(getContext(), "liveness_retry_instruction"));
                C17158l lVar3 = this.f28433e;
                if (lVar3 != null) {
                    lVar3.f48076g.setText(this.f28432d.mo46864d().mo47124d(getContext(), "liveness_retry_instruction_1"));
                    C17158l lVar4 = this.f28433e;
                    if (lVar4 != null) {
                        lVar4.f48077h.setText(this.f28432d.mo46864d().mo47124d(getContext(), "liveness_retry_instruction_2"));
                        C17158l lVar5 = this.f28433e;
                        if (lVar5 != null) {
                            lVar5.f48081l.setText(this.f28432d.mo46864d().mo47124d(getContext(), "liveness_retry_again"));
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
    public final C43064a mo26790i1() {
        return this.f28434f;
    }

    /* renamed from: o1 */
    public final void mo26791o1(C43064a aVar) {
        C41536l.m120489i(aVar, "<set-?>");
        this.f28434f = aVar;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        C17158l d = C17158l.m60279d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f28433e = d;
        m37324j1();
        m37327m1();
        m37328n1();
        m37326l1();
        C17158l lVar = this.f28433e;
        if (lVar != null) {
            return lVar.mo3946b();
        }
        C41536l.m120506z("binding");
        throw null;
    }
}
