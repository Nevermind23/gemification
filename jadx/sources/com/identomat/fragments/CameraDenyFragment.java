package com.identomat.fragments;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.C0767a;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import com.identomat.activities.NavigationActivity;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p202p0.C7556l;
import p228r0.C8034d;
import p345ad.C9786e;
import p485kc.C16341a;
import p541oc.C17151e;
import p583rc.C17578c;
import p583rc.C17579d;
import p678yc.C18877a;
import p692zc.C18999c;
import p692zc.C19002e;
import ue1.C43064a;

public final class CameraDenyFragment extends Fragment {

    /* renamed from: j */
    public static final C10531a f29901j = new C10531a((DefaultConstructorMarker) null);

    /* renamed from: k */
    private static final String[] f29902k = {"android.permission.CAMERA"};

    /* renamed from: d */
    private final C9786e f29903d;

    /* renamed from: e */
    private final C18877a f29904e;

    /* renamed from: f */
    private Integer f29905f;

    /* renamed from: g */
    private Bundle f29906g;

    /* renamed from: h */
    private C17151e f29907h;

    /* renamed from: i */
    private boolean f29908i;

    /* renamed from: com.identomat.fragments.CameraDenyFragment$a */
    public static final class C10531a {
        private C10531a() {
        }

        public /* synthetic */ C10531a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.identomat.fragments.CameraDenyFragment$b */
    static final class C10532b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CameraDenyFragment f29909d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10532b(CameraDenyFragment cameraDenyFragment) {
            super(0);
            this.f29909d = cameraDenyFragment;
        }

        public final void invoke() {
            C16341a.f46171a.mo43313a(this.f29909d.getActivity());
        }
    }

    public CameraDenyFragment(C9786e eVar, C18877a aVar) {
        C41536l.m120489i(eVar, "api");
        C41536l.m120489i(aVar, "identomatConfig");
        this.f29903d = eVar;
        this.f29904e = aVar;
    }

    /* renamed from: j1 */
    private final boolean m38178j1() {
        Integer num;
        String[] strArr = f29902k;
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

    /* renamed from: k1 */
    private final void m38179k1() {
        C8034d.m30522a(this).mo22123U();
        C7556l a = C8034d.m30522a(this);
        Integer num = this.f29905f;
        C41536l.m120486f(num);
        a.mo22119N(num.intValue(), this.f29906g, NavigationActivity.f29874v.mo27261a());
    }

    /* renamed from: l1 */
    private final void m38180l1() {
        C19002e.C19003a aVar = C19002e.f53052q;
        C1505h activity = getActivity();
        C17151e eVar = this.f29907h;
        if (eVar != null) {
            ImageView imageView = eVar.f48001f;
            C41536l.m120488h(imageView, "binding.backButton");
            C17151e eVar2 = this.f29907h;
            if (eVar2 != null) {
                TextView textView = eVar2.f48002g;
                C41536l.m120488h(textView, "binding.backButtonTitleView");
                C19002e.C19003a.m64212c(aVar, activity, imageView, textView, false, this.f29904e, 8, (Object) null);
                return;
            }
            C41536l.m120506z("binding");
            throw null;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    /* renamed from: m1 */
    private final void m38181m1() {
        C17151e eVar = this.f29907h;
        if (eVar != null) {
            eVar.f48008m.setOnClickListener(new C17578c(this));
            C17151e eVar2 = this.f29907h;
            if (eVar2 != null) {
                eVar2.f48003h.setOnClickListener(new C17579d(this));
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
    /* renamed from: n1 */
    public static final void m38182n1(CameraDenyFragment cameraDenyFragment, View view) {
        C41536l.m120489i(cameraDenyFragment, "this$0");
        if (cameraDenyFragment.m38178j1()) {
            cameraDenyFragment.m38179k1();
        } else {
            cameraDenyFragment.m38187s1();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o1 */
    public static final void m38183o1(CameraDenyFragment cameraDenyFragment, View view) {
        C41536l.m120489i(cameraDenyFragment, "this$0");
        cameraDenyFragment.f29903d.mo26250h(cameraDenyFragment.getContext(), new C10532b(cameraDenyFragment));
    }

    /* renamed from: p1 */
    private final void m38184p1() {
        C17151e eVar = this.f29907h;
        if (eVar != null) {
            eVar.mo3946b().setBackgroundColor(this.f29904e.mo46861a().mo47093b().mo33033a());
            C19002e.C19003a aVar = C19002e.f53052q;
            C17151e eVar2 = this.f29907h;
            if (eVar2 != null) {
                LinearLayout linearLayout = eVar2.f48005j;
                C41536l.m120488h(linearLayout, "binding.mainPanel");
                aVar.mo47120f(linearLayout, this.f29904e.mo46861a().mo47092a().mo33033a());
                C17151e eVar3 = this.f29907h;
                if (eVar3 != null) {
                    RelativeLayout relativeLayout = eVar3.f48008m;
                    C41536l.m120488h(relativeLayout, "binding.retryButton");
                    aVar.mo47120f(relativeLayout, this.f29904e.mo46861a().mo47100i().mo33033a());
                    C17151e eVar4 = this.f29907h;
                    if (eVar4 != null) {
                        RelativeLayout relativeLayout2 = eVar4.f48003h;
                        C41536l.m120488h(relativeLayout2, "binding.cancelButton");
                        aVar.mo47120f(relativeLayout2, this.f29904e.mo46861a().mo47102k().mo33033a());
                        C17151e eVar5 = this.f29907h;
                        if (eVar5 != null) {
                            RelativeLayout relativeLayout3 = eVar5.f48003h;
                            C41536l.m120488h(relativeLayout3, "binding.cancelButton");
                            aVar.mo47121g(relativeLayout3, this.f29904e.mo46861a().mo47100i().mo33033a(), 1);
                            C17151e eVar6 = this.f29907h;
                            if (eVar6 != null) {
                                eVar6.f48009n.setTextColor(this.f29904e.mo46861a().mo47101j().mo33033a());
                                C17151e eVar7 = this.f29907h;
                                if (eVar7 != null) {
                                    eVar7.f48004i.setTextColor(this.f29904e.mo46861a().mo47103l().mo33033a());
                                    C17151e eVar8 = this.f29907h;
                                    if (eVar8 != null) {
                                        eVar8.f48006k.setTextColor(this.f29904e.mo46861a().mo47105n().mo33033a());
                                        C17151e eVar9 = this.f29907h;
                                        if (eVar9 != null) {
                                            eVar9.f48007l.setTextColor(this.f29904e.mo46861a().mo47100i().mo33033a());
                                            if (this.f29904e.mo46867g().mo47138c() != null) {
                                                C17151e eVar10 = this.f29907h;
                                                if (eVar10 != null) {
                                                    ImageView imageView = eVar10.f48000e;
                                                    Integer c = this.f29904e.mo46867g().mo47138c();
                                                    C41536l.m120486f(c);
                                                    imageView.setImageResource(c.intValue());
                                                } else {
                                                    C41536l.m120506z("binding");
                                                    throw null;
                                                }
                                            }
                                            if (this.f29904e.mo46867g().mo47139d() != null) {
                                                C17151e eVar11 = this.f29907h;
                                                if (eVar11 != null) {
                                                    ViewGroup.LayoutParams layoutParams = eVar11.f48000e.getLayoutParams();
                                                    Integer d = this.f29904e.mo46867g().mo47139d();
                                                    C41536l.m120486f(d);
                                                    layoutParams.height = d.intValue();
                                                    C17151e eVar12 = this.f29907h;
                                                    if (eVar12 != null) {
                                                        ViewGroup.LayoutParams layoutParams2 = eVar12.f48000e.getLayoutParams();
                                                        Integer d2 = this.f29904e.mo46867g().mo47139d();
                                                        C41536l.m120486f(d2);
                                                        layoutParams2.width = d2.intValue();
                                                    } else {
                                                        C41536l.m120506z("binding");
                                                        throw null;
                                                    }
                                                } else {
                                                    C41536l.m120506z("binding");
                                                    throw null;
                                                }
                                            }
                                            if (this.f29904e.mo46867g().mo47148m() != null) {
                                                C17151e eVar13 = this.f29907h;
                                                if (eVar13 != null) {
                                                    LinearLayout linearLayout2 = eVar13.f48005j;
                                                    Integer m = this.f29904e.mo46867g().mo47148m();
                                                    C41536l.m120486f(m);
                                                    linearLayout2.setElevation((float) m.intValue());
                                                } else {
                                                    C41536l.m120506z("binding");
                                                    throw null;
                                                }
                                            }
                                            Integer b = this.f29904e.mo46867g().mo47137b();
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

    /* renamed from: q1 */
    private final void m38185q1() {
        C18999c e = this.f29904e.mo46867g().mo47140e();
        C17151e eVar = this.f29907h;
        if (eVar != null) {
            TextView textView = eVar.f48006k;
            C41536l.m120488h(textView, "binding.recordBeginTitle");
            e.mo47079g(textView, 1);
            C18999c e2 = this.f29904e.mo46867g().mo47140e();
            C17151e eVar2 = this.f29907h;
            if (eVar2 != null) {
                TextView textView2 = eVar2.f48009n;
                C41536l.m120488h(textView2, "binding.retryButtonText");
                e2.mo47079g(textView2, 1);
                C18999c e3 = this.f29904e.mo46867g().mo47140e();
                C17151e eVar3 = this.f29907h;
                if (eVar3 != null) {
                    TextView textView3 = eVar3.f48004i;
                    C41536l.m120488h(textView3, "binding.cancelButtonText");
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

    /* renamed from: r1 */
    private final void m38186r1() {
        C17151e eVar = this.f29907h;
        if (eVar != null) {
            eVar.f48006k.setText(this.f29904e.mo46864d().mo47124d(getContext(), "camera_deny_title"));
            C17151e eVar2 = this.f29907h;
            if (eVar2 != null) {
                eVar2.f48009n.setText(this.f29904e.mo46864d().mo47124d(getContext(), "camera_deny_settings"));
                C17151e eVar3 = this.f29907h;
                if (eVar3 != null) {
                    eVar3.f48004i.setText(this.f29904e.mo46864d().mo47124d(getContext(), "camera_deny_cancel"));
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

    /* renamed from: s1 */
    private final void m38187s1() {
        Context context = getContext();
        if (context != null) {
            this.f29908i = true;
            Intent intent = new Intent();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setData(Uri.parse(C41536l.m120497q("package:", context.getPackageName())));
            intent.addFlags(268435456);
            intent.addFlags(1073741824);
            intent.addFlags(8388608);
            context.startActivity(intent);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f29905f = Integer.valueOf(arguments.getInt("frame"));
            this.f29906g = arguments.getBundle("bundle");
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        C17151e d = C17151e.m60245d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f29907h = d;
        m38181m1();
        m38185q1();
        m38186r1();
        m38184p1();
        m38180l1();
        C17151e eVar = this.f29907h;
        if (eVar != null) {
            RelativeLayout c = eVar.mo3946b();
            C41536l.m120488h(c, "binding.root");
            return c;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    public void onResume() {
        if (this.f29908i) {
            m38179k1();
        }
        this.f29908i = false;
        super.onResume();
    }
}
