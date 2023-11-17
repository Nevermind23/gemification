package p359bd;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p541oc.C17160n;
import p678yc.C18877a;
import p692zc.C18999c;
import ue1.C43064a;

/* renamed from: bd.f */
public final class C10232f extends Fragment {

    /* renamed from: d */
    private final C18877a f28437d;

    /* renamed from: e */
    private C17160n f28438e;

    /* renamed from: f */
    private C43064a f28439f = C10233a.f28440d;

    /* renamed from: bd.f$a */
    static final class C10233a extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C10233a f28440d = new C10233a();

        C10233a() {
            super(0);
        }

        public final void invoke() {
        }
    }

    public C10232f(C18877a aVar) {
        C41536l.m120489i(aVar, "identomatConfig");
        this.f28437d = aVar;
    }

    /* renamed from: j1 */
    private final void m37332j1() {
        C17160n nVar = this.f28438e;
        if (nVar != null) {
            nVar.f48103e.setOnClickListener(new C10231e(this));
        } else {
            C41536l.m120506z("binding");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k1 */
    public static final void m37333k1(C10232f fVar, View view) {
        C41536l.m120489i(fVar, "this$0");
        fVar.mo26793i1().invoke();
    }

    /* renamed from: l1 */
    private final void m37334l1() {
        C17160n nVar = this.f28438e;
        if (nVar != null) {
            Drawable background = nVar.f48103e.getBackground();
            C41536l.m120488h(background, "binding.agreeButton.background");
            if (background instanceof GradientDrawable) {
                ((GradientDrawable) background).setColor(this.f28437d.mo46861a().mo47100i().mo33033a());
                return;
            }
            return;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    /* renamed from: m1 */
    private final void m37335m1() {
        C18999c e = this.f28437d.mo46867g().mo47140e();
        C17160n nVar = this.f28438e;
        if (nVar != null) {
            TextView textView = nVar.f48110l;
            C41536l.m120488h(textView, "binding.recordBeginTitle");
            e.mo47079g(textView, 0);
            C18999c e2 = this.f28437d.mo46867g().mo47140e();
            C17160n nVar2 = this.f28438e;
            if (nVar2 != null) {
                TextView textView2 = nVar2.f48111m;
                C41536l.m120488h(textView2, "binding.recordInstructions");
                e2.mo47079g(textView2, 2);
                C18999c e3 = this.f28437d.mo46867g().mo47140e();
                C17160n nVar3 = this.f28438e;
                if (nVar3 != null) {
                    TextView textView3 = nVar3.f48107i;
                    C41536l.m120488h(textView3, "binding.recordBeginSection1");
                    e3.mo47079g(textView3, 2);
                    C18999c e4 = this.f28437d.mo46867g().mo47140e();
                    C17160n nVar4 = this.f28438e;
                    if (nVar4 != null) {
                        TextView textView4 = nVar4.f48108j;
                        C41536l.m120488h(textView4, "binding.recordBeginSection2");
                        e4.mo47079g(textView4, 2);
                        C18999c e5 = this.f28437d.mo46867g().mo47140e();
                        C17160n nVar5 = this.f28438e;
                        if (nVar5 != null) {
                            TextView textView5 = nVar5.f48109k;
                            C41536l.m120488h(textView5, "binding.recordBeginSection3");
                            e5.mo47079g(textView5, 2);
                            C18999c e6 = this.f28437d.mo46867g().mo47140e();
                            C17160n nVar6 = this.f28438e;
                            if (nVar6 != null) {
                                TextView textView6 = nVar6.f48106h;
                                C41536l.m120488h(textView6, "binding.readyButton");
                                e6.mo47079g(textView6, 1);
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

    /* renamed from: n1 */
    private final void m37336n1() {
        Integer f = this.f28437d.mo46867g().mo47141f();
        if (f != null) {
            int intValue = f.intValue();
            C17160n nVar = this.f28438e;
            if (nVar != null) {
                nVar.f48104f.setImageResource(intValue);
                C17160n nVar2 = this.f28438e;
                if (nVar2 != null) {
                    nVar2.f48105g.setImageResource(intValue);
                } else {
                    C41536l.m120506z("binding");
                    throw null;
                }
            } else {
                C41536l.m120506z("binding");
                throw null;
            }
        }
        Integer j = this.f28437d.mo46867g().mo47145j();
        if (j != null) {
            int intValue2 = j.intValue();
            C17160n nVar3 = this.f28438e;
            if (nVar3 != null) {
                nVar3.f48112n.setImageResource(intValue2);
            } else {
                C41536l.m120506z("binding");
                throw null;
            }
        }
    }

    /* renamed from: o1 */
    private final void m37337o1() {
        C17160n nVar = this.f28438e;
        if (nVar != null) {
            nVar.f48110l.setText(this.f28437d.mo46864d().mo47124d(getContext(), "record_begin_title"));
            C17160n nVar2 = this.f28438e;
            if (nVar2 != null) {
                nVar2.f48111m.setText(this.f28437d.mo46864d().mo47124d(getContext(), "record_instructions"));
                C17160n nVar3 = this.f28438e;
                if (nVar3 != null) {
                    nVar3.f48107i.setText(this.f28437d.mo46864d().mo47124d(getContext(), "record_begin_section_1"));
                    C17160n nVar4 = this.f28438e;
                    if (nVar4 != null) {
                        nVar4.f48108j.setText(this.f28437d.mo46864d().mo47124d(getContext(), "record_begin_section_2"));
                        C17160n nVar5 = this.f28438e;
                        if (nVar5 != null) {
                            nVar5.f48109k.setText(this.f28437d.mo46864d().mo47124d(getContext(), "record_begin_section_3"));
                            C17160n nVar6 = this.f28438e;
                            if (nVar6 != null) {
                                nVar6.f48106h.setText(this.f28437d.mo46864d().mo47124d(getContext(), "im_ready"));
                                m37335m1();
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

    /* renamed from: i1 */
    public final C43064a mo26793i1() {
        return this.f28439f;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        C17160n d = C17160n.m60289d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f28438e = d;
        m37332j1();
        m37337o1();
        m37336n1();
        m37334l1();
        C17160n nVar = this.f28438e;
        if (nVar != null) {
            return nVar.mo3946b();
        }
        C41536l.m120506z("binding");
        throw null;
    }

    /* renamed from: p1 */
    public final void mo26794p1(C43064a aVar) {
        C41536l.m120489i(aVar, "<set-?>");
        this.f28439f = aVar;
    }
}
