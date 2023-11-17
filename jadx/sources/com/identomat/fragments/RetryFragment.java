package com.identomat.fragments;

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
import com.identomat.activities.NavigationActivity;
import kotlin.jvm.internal.C41536l;
import p228r0.C8034d;
import p541oc.C17163q;
import p583rc.C17580e;
import p583rc.C17581f;
import p678yc.C18877a;
import p692zc.C18999c;
import p692zc.C19002e;

public final class RetryFragment extends Fragment {

    /* renamed from: d */
    private final C18877a f29910d;

    /* renamed from: e */
    private Integer f29911e;

    /* renamed from: f */
    private Bundle f29912f;

    /* renamed from: g */
    private C17163q f29913g;

    public RetryFragment(C18877a aVar) {
        C41536l.m120489i(aVar, "identomatConfig");
        this.f29910d = aVar;
    }

    /* renamed from: j1 */
    private final void m38190j1() {
        C19002e.C19003a aVar = C19002e.f53052q;
        C1505h activity = getActivity();
        C17163q qVar = this.f29913g;
        if (qVar != null) {
            ImageView imageView = qVar.f48132f;
            C41536l.m120488h(imageView, "binding.backButton");
            C17163q qVar2 = this.f29913g;
            if (qVar2 != null) {
                TextView textView = qVar2.f48133g;
                C41536l.m120488h(textView, "binding.backButtonTitleView");
                C19002e.C19003a.m64212c(aVar, activity, imageView, textView, false, this.f29910d, 8, (Object) null);
                return;
            }
            C41536l.m120506z("binding");
            throw null;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    /* renamed from: k1 */
    private final void m38191k1() {
        C17163q qVar = this.f29913g;
        if (qVar != null) {
            qVar.f48139m.setOnClickListener(new C17580e(this));
            C17163q qVar2 = this.f29913g;
            if (qVar2 != null) {
                qVar2.f48134h.setOnClickListener(new C17581f(this));
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
    public static final void m38192l1(RetryFragment retryFragment, View view) {
        C41536l.m120489i(retryFragment, "this$0");
        Integer num = retryFragment.f29911e;
        if (num != null && num != null) {
            int intValue = num.intValue();
            C8034d.m30522a(retryFragment).mo22123U();
            C8034d.m30522a(retryFragment).mo22119N(intValue, retryFragment.f29912f, NavigationActivity.f29874v.mo27261a());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m1 */
    public static final void m38193m1(RetryFragment retryFragment, View view) {
        C41536l.m120489i(retryFragment, "this$0");
        C8034d.m30522a(retryFragment).mo22123U();
    }

    /* renamed from: n1 */
    private final void m38194n1() {
        C17163q qVar = this.f29913g;
        if (qVar != null) {
            qVar.mo3946b().setBackgroundColor(this.f29910d.mo46861a().mo47093b().mo33033a());
            C19002e.C19003a aVar = C19002e.f53052q;
            C17163q qVar2 = this.f29913g;
            if (qVar2 != null) {
                LinearLayout linearLayout = qVar2.f48136j;
                C41536l.m120488h(linearLayout, "binding.mainPanel");
                aVar.mo47120f(linearLayout, this.f29910d.mo46861a().mo47092a().mo33033a());
                C17163q qVar3 = this.f29913g;
                if (qVar3 != null) {
                    RelativeLayout relativeLayout = qVar3.f48139m;
                    C41536l.m120488h(relativeLayout, "binding.retryButton");
                    aVar.mo47120f(relativeLayout, this.f29910d.mo46861a().mo47100i().mo33033a());
                    C17163q qVar4 = this.f29913g;
                    if (qVar4 != null) {
                        RelativeLayout relativeLayout2 = qVar4.f48134h;
                        C41536l.m120488h(relativeLayout2, "binding.cancelButton");
                        aVar.mo47120f(relativeLayout2, this.f29910d.mo46861a().mo47102k().mo33033a());
                        C17163q qVar5 = this.f29913g;
                        if (qVar5 != null) {
                            RelativeLayout relativeLayout3 = qVar5.f48134h;
                            C41536l.m120488h(relativeLayout3, "binding.cancelButton");
                            aVar.mo47121g(relativeLayout3, this.f29910d.mo46861a().mo47100i().mo33033a(), 1);
                            C17163q qVar6 = this.f29913g;
                            if (qVar6 != null) {
                                qVar6.f48140n.setTextColor(this.f29910d.mo46861a().mo47101j().mo33033a());
                                C17163q qVar7 = this.f29913g;
                                if (qVar7 != null) {
                                    qVar7.f48135i.setTextColor(this.f29910d.mo46861a().mo47103l().mo33033a());
                                    C17163q qVar8 = this.f29913g;
                                    if (qVar8 != null) {
                                        qVar8.f48137k.setTextColor(this.f29910d.mo46861a().mo47105n().mo33033a());
                                        C17163q qVar9 = this.f29913g;
                                        if (qVar9 != null) {
                                            qVar9.f48138l.setTextColor(this.f29910d.mo46861a().mo47100i().mo33033a());
                                            if (this.f29910d.mo46867g().mo47149n() != null) {
                                                C17163q qVar10 = this.f29913g;
                                                if (qVar10 != null) {
                                                    ImageView imageView = qVar10.f48131e;
                                                    Integer n = this.f29910d.mo46867g().mo47149n();
                                                    C41536l.m120486f(n);
                                                    imageView.setImageResource(n.intValue());
                                                } else {
                                                    C41536l.m120506z("binding");
                                                    throw null;
                                                }
                                            }
                                            if (this.f29910d.mo46867g().mo47150o() != null) {
                                                C17163q qVar11 = this.f29913g;
                                                if (qVar11 != null) {
                                                    ViewGroup.LayoutParams layoutParams = qVar11.f48131e.getLayoutParams();
                                                    Integer o = this.f29910d.mo46867g().mo47150o();
                                                    C41536l.m120486f(o);
                                                    layoutParams.height = o.intValue();
                                                    C17163q qVar12 = this.f29913g;
                                                    if (qVar12 != null) {
                                                        ViewGroup.LayoutParams layoutParams2 = qVar12.f48131e.getLayoutParams();
                                                        Integer o2 = this.f29910d.mo46867g().mo47150o();
                                                        C41536l.m120486f(o2);
                                                        layoutParams2.width = o2.intValue();
                                                    } else {
                                                        C41536l.m120506z("binding");
                                                        throw null;
                                                    }
                                                } else {
                                                    C41536l.m120506z("binding");
                                                    throw null;
                                                }
                                            }
                                            if (this.f29910d.mo46867g().mo47148m() != null) {
                                                C17163q qVar13 = this.f29913g;
                                                if (qVar13 != null) {
                                                    LinearLayout linearLayout2 = qVar13.f48136j;
                                                    Integer m = this.f29910d.mo46867g().mo47148m();
                                                    C41536l.m120486f(m);
                                                    linearLayout2.setElevation((float) m.intValue());
                                                } else {
                                                    C41536l.m120506z("binding");
                                                    throw null;
                                                }
                                            }
                                            Integer b = this.f29910d.mo46867g().mo47137b();
                                            if (b != null) {
                                                int intValue = b.intValue();
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
    private final void m38195o1() {
        C18999c e = this.f29910d.mo46867g().mo47140e();
        C17163q qVar = this.f29913g;
        if (qVar != null) {
            TextView textView = qVar.f48137k;
            C41536l.m120488h(textView, "binding.recordBeginTitle");
            e.mo47079g(textView, 0);
            C18999c e2 = this.f29910d.mo46867g().mo47140e();
            C17163q qVar2 = this.f29913g;
            if (qVar2 != null) {
                TextView textView2 = qVar2.f48138l;
                C41536l.m120488h(textView2, "binding.recordInstructions");
                e2.mo47079g(textView2, 1);
                C18999c e3 = this.f29910d.mo46867g().mo47140e();
                C17163q qVar3 = this.f29913g;
                if (qVar3 != null) {
                    TextView textView3 = qVar3.f48140n;
                    C41536l.m120488h(textView3, "binding.retryButtonText");
                    e3.mo47079g(textView3, 1);
                    C18999c e4 = this.f29910d.mo46867g().mo47140e();
                    C17163q qVar4 = this.f29913g;
                    if (qVar4 != null) {
                        TextView textView4 = qVar4.f48135i;
                        C41536l.m120488h(textView4, "binding.cancelButtonText");
                        e4.mo47079g(textView4, 1);
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

    /* renamed from: p1 */
    private final void m38196p1() {
        C17163q qVar = this.f29913g;
        if (qVar != null) {
            qVar.f48137k.setText(this.f29910d.mo46864d().mo47124d(getContext(), "scan_retry_title"));
            C17163q qVar2 = this.f29913g;
            if (qVar2 != null) {
                qVar2.f48138l.setText(this.f29910d.mo46864d().mo47124d(getContext(), "scan_retry_instruction"));
                C17163q qVar3 = this.f29913g;
                if (qVar3 != null) {
                    qVar3.f48140n.setText(this.f29910d.mo46864d().mo47124d(getContext(), "scan_retry_again"));
                    C17163q qVar4 = this.f29913g;
                    if (qVar4 != null) {
                        qVar4.f48135i.setText(this.f29910d.mo46864d().mo47124d(getContext(), "scan_retry_cancel"));
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

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f29911e = Integer.valueOf(arguments.getInt("frame"));
            this.f29912f = arguments.getBundle("bundle");
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        C17163q d = C17163q.m60304d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f29913g = d;
        m38191k1();
        m38195o1();
        m38196p1();
        m38194n1();
        m38190j1();
        C17163q qVar = this.f29913g;
        if (qVar != null) {
            return qVar.mo3946b();
        }
        C41536l.m120506z("binding");
        throw null;
    }
}
