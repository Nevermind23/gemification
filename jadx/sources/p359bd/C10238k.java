package p359bd;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
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
import p485kc.C16346d;
import p541oc.C17167u;
import p678yc.C18877a;
import p692zc.C18999c;
import p692zc.C19002e;
import ue1.C43075l;

/* renamed from: bd.k */
public final class C10238k extends Fragment {

    /* renamed from: d */
    private final C18877a f28447d;

    /* renamed from: e */
    private final C43075l f28448e;

    /* renamed from: f */
    private boolean f28449f = true;

    /* renamed from: g */
    private String f28450g = "";

    /* renamed from: h */
    private Bitmap f28451h;

    /* renamed from: i */
    private C17167u f28452i;

    public C10238k(C18877a aVar, C43075l lVar) {
        C41536l.m120489i(aVar, "identomatConfig");
        C41536l.m120489i(lVar, "callback");
        this.f28447d = aVar;
        this.f28448e = lVar;
    }

    /* renamed from: k1 */
    private final void m37347k1() {
        C17167u uVar = this.f28452i;
        if (uVar != null) {
            uVar.f48168g.setOnClickListener(new C10236i(this));
            C17167u uVar2 = this.f28452i;
            if (uVar2 != null) {
                uVar2.f48166e.setOnClickListener(new C10237j(this));
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
    public static final void m37348l1(C10238k kVar, View view) {
        C41536l.m120489i(kVar, "this$0");
        kVar.mo26799j1().invoke(Boolean.TRUE);
    }

    /* access modifiers changed from: private */
    /* renamed from: m1 */
    public static final void m37349m1(C10238k kVar, View view) {
        C41536l.m120489i(kVar, "this$0");
        kVar.mo26799j1().invoke(Boolean.FALSE);
    }

    /* renamed from: n1 */
    private final void m37350n1() {
        C19002e.C19003a aVar = C19002e.f53052q;
        C17167u uVar = this.f28452i;
        if (uVar != null) {
            LinearLayout linearLayout = uVar.f48171j;
            C41536l.m120488h(linearLayout, "binding.mainPanel");
            aVar.mo47120f(linearLayout, this.f28447d.mo46861a().mo47092a().mo33033a());
            C17167u uVar2 = this.f28452i;
            if (uVar2 != null) {
                uVar2.f48173l.setTextColor(this.f28447d.mo46861a().mo47105n().mo33033a());
                C17167u uVar3 = this.f28452i;
                if (uVar3 != null) {
                    RelativeLayout relativeLayout = uVar3.f48168g;
                    C41536l.m120488h(relativeLayout, "binding.continueButton");
                    aVar.mo47120f(relativeLayout, this.f28447d.mo46861a().mo47100i().mo33033a());
                    C17167u uVar4 = this.f28452i;
                    if (uVar4 != null) {
                        RelativeLayout relativeLayout2 = uVar4.f48166e;
                        C41536l.m120488h(relativeLayout2, "binding.againButton");
                        aVar.mo47121g(relativeLayout2, this.f28447d.mo46861a().mo47100i().mo33033a(), 1);
                        C17167u uVar5 = this.f28452i;
                        if (uVar5 != null) {
                            RelativeLayout relativeLayout3 = uVar5.f48166e;
                            C41536l.m120488h(relativeLayout3, "binding.againButton");
                            aVar.mo47120f(relativeLayout3, this.f28447d.mo46861a().mo47102k().mo33033a());
                            C17167u uVar6 = this.f28452i;
                            if (uVar6 != null) {
                                uVar6.f48169h.setTextColor(this.f28447d.mo46861a().mo47101j().mo33033a());
                                C17167u uVar7 = this.f28452i;
                                if (uVar7 != null) {
                                    uVar7.f48167f.setTextColor(this.f28447d.mo46861a().mo47103l().mo33033a());
                                    if (this.f28447d.mo46867g().mo47148m() != null) {
                                        C17167u uVar8 = this.f28452i;
                                        if (uVar8 != null) {
                                            LinearLayout linearLayout2 = uVar8.f48171j;
                                            Integer m = this.f28447d.mo46867g().mo47148m();
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

    /* renamed from: o1 */
    private final void m37351o1() {
        C18999c e = this.f28447d.mo46867g().mo47140e();
        C17167u uVar = this.f28452i;
        if (uVar != null) {
            TextView textView = uVar.f48169h;
            C41536l.m120488h(textView, "binding.continueButtonTextView");
            e.mo47079g(textView, 1);
            C18999c e2 = this.f28447d.mo46867g().mo47140e();
            C17167u uVar2 = this.f28452i;
            if (uVar2 != null) {
                TextView textView2 = uVar2.f48167f;
                C41536l.m120488h(textView2, "binding.againButtonTextView");
                e2.mo47079g(textView2, 1);
                C18999c e3 = this.f28447d.mo46867g().mo47140e();
                C17167u uVar3 = this.f28452i;
                if (uVar3 != null) {
                    TextView textView3 = uVar3.f48173l;
                    C41536l.m120488h(textView3, "binding.resultMessageView");
                    e3.mo47079g(textView3, 0);
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
    private final void m37352p1() {
        Integer r = this.f28447d.mo46867g().mo47153r();
        if (r != null) {
            r.intValue();
            C17167u uVar = this.f28452i;
            if (uVar != null) {
                ViewGroup.LayoutParams layoutParams = uVar.f48172k.getLayoutParams();
                Integer r2 = this.f28447d.mo46867g().mo47153r();
                C41536l.m120486f(r2);
                layoutParams.width = r2.intValue();
                C17167u uVar2 = this.f28452i;
                if (uVar2 != null) {
                    ViewGroup.LayoutParams layoutParams2 = uVar2.f48172k.getLayoutParams();
                    Integer r3 = this.f28447d.mo46867g().mo47153r();
                    C41536l.m120486f(r3);
                    layoutParams2.height = r3.intValue();
                } else {
                    C41536l.m120506z("binding");
                    throw null;
                }
            } else {
                C41536l.m120506z("binding");
                throw null;
            }
        }
        if (this.f28449f) {
            C17167u uVar3 = this.f28452i;
            if (uVar3 != null) {
                uVar3.f48172k.setImageResource(C16346d.identomat_success_icon);
                C17167u uVar4 = this.f28452i;
                if (uVar4 != null) {
                    uVar4.f48166e.setVisibility(8);
                    C17167u uVar5 = this.f28452i;
                    if (uVar5 != null) {
                        uVar5.f48168g.setVisibility(0);
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
            C17167u uVar6 = this.f28452i;
            if (uVar6 != null) {
                uVar6.f48166e.setVisibility(0);
                if (this.f28447d.mo46867g().mo47152q() != null) {
                    C17167u uVar7 = this.f28452i;
                    if (uVar7 != null) {
                        ImageView imageView = uVar7.f48172k;
                        Integer q = this.f28447d.mo46867g().mo47152q();
                        C41536l.m120486f(q);
                        imageView.setImageResource(q.intValue());
                    } else {
                        C41536l.m120506z("binding");
                        throw null;
                    }
                } else {
                    C17167u uVar8 = this.f28452i;
                    if (uVar8 != null) {
                        uVar8.f48172k.setImageResource(C16346d.identomat_fail_icon);
                    } else {
                        C41536l.m120506z("binding");
                        throw null;
                    }
                }
                C17167u uVar9 = this.f28452i;
                if (uVar9 != null) {
                    uVar9.f48173l.setText(this.f28447d.mo46864d().mo47124d(getContext(), this.f28450g));
                    C17167u uVar10 = this.f28452i;
                    if (uVar10 != null) {
                        uVar10.f48168g.setVisibility(8);
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
        C17167u uVar11 = this.f28452i;
        if (uVar11 != null) {
            uVar11.f48170i.setImageBitmap(this.f28451h);
        } else {
            C41536l.m120506z("binding");
            throw null;
        }
    }

    /* renamed from: q1 */
    private final void m37353q1() {
        C17167u uVar = this.f28452i;
        if (uVar != null) {
            uVar.f48169h.setText(this.f28447d.mo46864d().mo47124d(getContext(), "continue"));
            C17167u uVar2 = this.f28452i;
            if (uVar2 != null) {
                uVar2.f48167f.setText(this.f28447d.mo46864d().mo47124d(getContext(), "upload_another_file"));
                m37351o1();
                return;
            }
            C41536l.m120506z("binding");
            throw null;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    /* renamed from: j1 */
    public final C43075l mo26799j1() {
        return this.f28448e;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f28449f = arguments.getBoolean("success");
            String string = arguments.getString("message");
            if (string == null) {
                string = "";
            }
            this.f28450g = string;
            this.f28451h = BitmapFactory.decodeFile(arguments.getString("bitmap"));
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        C17167u d = C17167u.m60324d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f28452i = d;
        m37350n1();
        m37352p1();
        m37347k1();
        m37353q1();
        C17167u uVar = this.f28452i;
        if (uVar != null) {
            return uVar.mo3946b();
        }
        C41536l.m120506z("binding");
        throw null;
    }
}
