package com.identomat.fragments.call;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.C0173b;
import androidx.core.content.C0767a;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import com.identomat.subfragments.views.DocumentView;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;
import org.webrtc.C42076d;
import org.webrtc.C42085h;
import org.webrtc.C42107q;
import org.webrtc.SessionDescription;
import org.webrtc.SurfaceViewRenderer;
import p017b.C2105c;
import p345ad.C9786e;
import p345ad.C9789f;
import p373cd.C10394a;
import p485kc.C16341a;
import p485kc.C16346d;
import p485kc.C16349g;
import p527nc.C16910a;
import p541oc.C17155i;
import p555pc.C17336a;
import p597sc.C17715a0;
import p597sc.C17717b0;
import p597sc.C17719c0;
import p597sc.C17721d0;
import p597sc.C17723e0;
import p597sc.C17725f0;
import p597sc.C17726g;
import p597sc.C17727g0;
import p597sc.C17728h;
import p597sc.C17729h0;
import p597sc.C17730i;
import p597sc.C17731i0;
import p597sc.C17732j;
import p597sc.C17733k;
import p597sc.C17734l;
import p597sc.C17735m;
import p597sc.C17736n;
import p597sc.C17737o;
import p597sc.C17738p;
import p597sc.C17739q;
import p597sc.C17740r;
import p597sc.C17741s;
import p597sc.C17742t;
import p597sc.C17743u;
import p597sc.C17744v;
import p597sc.C17745w;
import p597sc.C17746x;
import p597sc.C17747y;
import p597sc.C17748z;
import p678yc.C18877a;
import p692zc.C18999c;
import p692zc.C19002e;
import ue1.C43064a;
import ue1.C43075l;

public final class FlowFragment extends Fragment {

    /* renamed from: s */
    public static final C10537a f29929s = new C10537a((DefaultConstructorMarker) null);

    /* renamed from: t */
    private static final String[] f29930t = {"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};

    /* renamed from: d */
    private final C9786e f29931d;

    /* renamed from: e */
    private final C18877a f29932e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C17155i f29933f;

    /* renamed from: g */
    private final String f29934g = "flow_page";
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C9789f f29935h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C16910a f29936i;

    /* renamed from: j */
    private final Handler f29937j;

    /* renamed from: k */
    private String f29938k;

    /* renamed from: l */
    private int f29939l;

    /* renamed from: m */
    private int f29940m;

    /* renamed from: n */
    private boolean f29941n;

    /* renamed from: o */
    private boolean f29942o;

    /* renamed from: p */
    private boolean f29943p;

    /* renamed from: q */
    private final C0173b f29944q;

    /* renamed from: r */
    private final C10542e f29945r;

    /* renamed from: com.identomat.fragments.call.FlowFragment$a */
    public static final class C10537a {
        private C10537a() {
        }

        public /* synthetic */ C10537a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.identomat.fragments.call.FlowFragment$b */
    static final class C10538b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ FlowFragment f29946d;

        /* renamed from: com.identomat.fragments.call.FlowFragment$b$a */
        static final class C10539a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ FlowFragment f29947d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10539a(FlowFragment flowFragment) {
                super(1);
                this.f29947d = flowFragment;
            }

            /* renamed from: a */
            public final void mo27272a(boolean z) {
                if (this.f29947d.f29936i == null || !z) {
                    Log.i("identomat_", "Fail");
                    return;
                }
                C9789f O1 = this.f29947d.f29935h;
                if (O1 != null) {
                    C16910a P1 = this.f29947d.f29936i;
                    C41536l.m120486f(P1);
                    O1.mo26273p(P1.mo44067d());
                    return;
                }
                C41536l.m120506z("socket");
                throw null;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo27272a(((Boolean) obj).booleanValue());
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10538b(FlowFragment flowFragment) {
            super(1);
            this.f29946d = flowFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m38318c(FlowFragment flowFragment, int i) {
            C41536l.m120489i(flowFragment, "this$0");
            C17155i N1 = flowFragment.f29933f;
            if (N1 != null) {
                N1.f48059y.setText(String.valueOf(i));
            } else {
                C41536l.m120506z("binding");
                throw null;
            }
        }

        /* renamed from: b */
        public final void mo27271b(JSONObject jSONObject) {
            C41536l.m120489i(jSONObject, "jsonObject");
            String string = jSONObject.getString("id");
            if (string != null) {
                switch (string.hashCode()) {
                    case -2129708880:
                        if (string.equals("startFlow")) {
                            FlowFragment flowFragment = this.f29946d;
                            String string2 = jSONObject.getString("message");
                            C41536l.m120488h(string2, "jsonObject.getString(\"message\")");
                            flowFragment.m38308w2(string2);
                            return;
                        }
                        return;
                    case -1357520532:
                        if (string.equals("closed")) {
                            C10394a.m37798b("identomat_", (String) null, 2, (Object) null);
                            return;
                        }
                        return;
                    case -1291105480:
                        if (string.equals("iceCandidate")) {
                            JSONObject jSONObject2 = jSONObject.getJSONObject("candidate");
                            C16910a P1 = this.f29946d.f29936i;
                            if (P1 != null) {
                                C41536l.m120488h(jSONObject2, "response");
                                P1.mo44064a(jSONObject2);
                                return;
                            }
                            return;
                        }
                        return;
                    case -608496514:
                        if (string.equals("rejected")) {
                            this.f29946d.m38271Y1("rejected");
                            return;
                        }
                        return;
                    case -571321340:
                        if (string.equals("registerResponse")) {
                            if (C41536l.m120484d(jSONObject.getString("response"), "accepted")) {
                                this.f29946d.m38299r2();
                                return;
                            } else {
                                this.f29946d.m38271Y1("Fail to register");
                                return;
                            }
                        } else {
                            return;
                        }
                    case -272190273:
                        if (string.equals("callResponse")) {
                            if (C41536l.m120484d(jSONObject.getString("response"), "accepted")) {
                                this.f29946d.m38268V1();
                                String string3 = jSONObject.getString("sdpAnswer");
                                C16910a P12 = this.f29946d.f29936i;
                                if (P12 != null) {
                                    C41536l.m120488h(string3, "sdp");
                                    P12.mo44072i(string3, new C10539a(this.f29946d));
                                    return;
                                }
                                return;
                            }
                            this.f29946d.m38301s2();
                            return;
                        }
                        return;
                    case 245101491:
                        if (string.equals("waitList")) {
                            new Handler(Looper.getMainLooper()).post(new C10545b(this.f29946d, jSONObject.optInt("message", 0) + 1));
                            return;
                        }
                        return;
                    case 729582324:
                        if (string.equals("stopCommunication")) {
                            this.f29946d.m38271Y1("stopCommunication");
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo27271b((JSONObject) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: com.identomat.fragments.call.FlowFragment$c */
    public static final class C10540c implements C42107q.C42110c {
        C10540c() {
        }
    }

    /* renamed from: com.identomat.fragments.call.FlowFragment$d */
    static final class C10541d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ FlowFragment f29948d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10541d(FlowFragment flowFragment) {
            super(1);
            this.f29948d = flowFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m38322c(FlowFragment flowFragment) {
            C41536l.m120489i(flowFragment, "this$0");
            flowFragment.m38297q2();
        }

        /* renamed from: b */
        public final void mo27273b(SessionDescription sessionDescription) {
            if (sessionDescription != null) {
                Log.i("identomat_", "sendOffer: ");
                C9789f O1 = this.f29948d.f29935h;
                if (O1 != null) {
                    O1.mo26271m(sessionDescription);
                    new Handler(Looper.getMainLooper()).post(new C10546c(this.f29948d));
                    return;
                }
                C41536l.m120506z("socket");
                throw null;
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo27273b((SessionDescription) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: com.identomat.fragments.call.FlowFragment$e */
    public static final class C10542e implements C42085h.C42089d {

        /* renamed from: a */
        final /* synthetic */ FlowFragment f29949a;

        C10542e(FlowFragment flowFragment) {
            this.f29949a = flowFragment;
        }
    }

    /* renamed from: com.identomat.fragments.call.FlowFragment$f */
    static final class C10543f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ FlowFragment f29950d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10543f(FlowFragment flowFragment) {
            super(0);
            this.f29950d = flowFragment;
        }

        public final void invoke() {
            C17155i N1 = this.f29950d.f29933f;
            if (N1 != null) {
                int panelHeight = (int) N1.f48046l.getPanelHeight();
                C17155i N12 = this.f29950d.f29933f;
                if (N12 != null) {
                    N12.f48047m.setVisibility(0);
                    C17155i N13 = this.f29950d.f29933f;
                    if (N13 != null) {
                        N13.f48047m.getLayoutParams().height = panelHeight;
                        C17155i N14 = this.f29950d.f29933f;
                        if (N14 != null) {
                            N14.f48036B.setVisibility(0);
                            C18999c e = this.f29950d.mo27269c2().mo46867g().mo47140e();
                            C17155i N15 = this.f29950d.f29933f;
                            if (N15 != null) {
                                TextView textView = N15.f48036B;
                                C41536l.m120488h(textView, "binding.titleView");
                                e.mo47079g(textView, 0);
                                C17155i N16 = this.f29950d.f29933f;
                                if (N16 != null) {
                                    N16.f48036B.getLayoutParams().height = panelHeight;
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
    }

    public FlowFragment(C9786e eVar, C18877a aVar) {
        Handler handler;
        C41536l.m120489i(eVar, "api");
        C41536l.m120489i(aVar, "identomatConfig");
        this.f29931d = eVar;
        this.f29932e = aVar;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            handler = null;
        } else {
            handler = new Handler(myLooper);
        }
        this.f29937j = handler;
        this.f29938k = "scan";
        C0173b registerForActivityResult = registerForActivityResult(new C2105c(), new C17726g(this));
        C41536l.m120488h(registerForActivityResult, "registerForActivityResult(ActivityResultContracts.RequestPermission()) { isGranted: Boolean ->\n            if (isGranted) {\n                initPermissions()\n            } else {\n                IdentomatManager.finish(activity)\n                Log.i(TAG, \"Permissions not granted by the user.\")\n            }\n        }");
        this.f29944q = registerForActivityResult;
        this.f29945r = new C10542e(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: A2 */
    public static final void m38235A2(FlowFragment flowFragment) {
        C41536l.m120489i(flowFragment, "this$0");
        C17155i iVar = flowFragment.f29933f;
        if (iVar != null) {
            DocumentView documentView = iVar.f48046l;
            C41536l.m120488h(documentView, "binding.documentView");
            DocumentView.m38780f(documentView, 3, false, 2, (Object) null);
            flowFragment.f29939l = 3;
            C17155i iVar2 = flowFragment.f29933f;
            if (iVar2 != null) {
                iVar2.f48046l.setVisibility(0);
                flowFragment.mo27270p2();
                return;
            }
            C41536l.m120506z("binding");
            throw null;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: B2 */
    public static final void m38237B2(FlowFragment flowFragment) {
        C41536l.m120489i(flowFragment, "this$0");
        C9789f fVar = flowFragment.f29935h;
        if (fVar != null) {
            C9789f.m36018o(fVar, "flow", "guide", "passport", (String) null, 8, (Object) null);
        } else {
            C41536l.m120506z("socket");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C2 */
    public static final void m38239C2(FlowFragment flowFragment) {
        C41536l.m120489i(flowFragment, "this$0");
        C17155i iVar = flowFragment.f29933f;
        if (iVar != null) {
            DocumentView documentView = iVar.f48046l;
            C41536l.m120488h(documentView, "binding.documentView");
            DocumentView.m38780f(documentView, 1, false, 2, (Object) null);
            flowFragment.f29939l = 1;
            C17155i iVar2 = flowFragment.f29933f;
            if (iVar2 != null) {
                iVar2.f48046l.setVisibility(0);
                flowFragment.mo27270p2();
                return;
            }
            C41536l.m120506z("binding");
            throw null;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: D2 */
    public static final void m38241D2(FlowFragment flowFragment) {
        C41536l.m120489i(flowFragment, "this$0");
        C9789f fVar = flowFragment.f29935h;
        if (fVar != null) {
            C9789f.m36018o(fVar, "flow", "guide", "card-front", (String) null, 8, (Object) null);
        } else {
            C41536l.m120506z("socket");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E2 */
    public static final void m38243E2(FlowFragment flowFragment) {
        C41536l.m120489i(flowFragment, "this$0");
        C17155i iVar = flowFragment.f29933f;
        if (iVar != null) {
            DocumentView documentView = iVar.f48046l;
            C41536l.m120488h(documentView, "binding.documentView");
            DocumentView.m38780f(documentView, 2, false, 2, (Object) null);
            flowFragment.f29939l = 2;
            C17155i iVar2 = flowFragment.f29933f;
            if (iVar2 != null) {
                iVar2.f48046l.setVisibility(0);
                flowFragment.mo27270p2();
                return;
            }
            C41536l.m120506z("binding");
            throw null;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: F2 */
    public static final void m38245F2(FlowFragment flowFragment) {
        C41536l.m120489i(flowFragment, "this$0");
        C9789f fVar = flowFragment.f29935h;
        if (fVar != null) {
            C9789f.m36018o(fVar, "flow", "guide", "card-front", (String) null, 8, (Object) null);
        } else {
            C41536l.m120506z("socket");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H2 */
    public static final void m38248H2(FlowFragment flowFragment) {
        C41536l.m120489i(flowFragment, "this$0");
        C17155i iVar = flowFragment.f29933f;
        if (iVar != null) {
            DocumentView documentView = iVar.f48046l;
            C41536l.m120488h(documentView, "binding.documentView");
            DocumentView.m38780f(documentView, 4, false, 2, (Object) null);
            flowFragment.f29939l = 4;
            C17155i iVar2 = flowFragment.f29933f;
            if (iVar2 != null) {
                iVar2.f48046l.setVisibility(0);
                flowFragment.mo27270p2();
                return;
            }
            C41536l.m120506z("binding");
            throw null;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: I2 */
    public static final void m38250I2(FlowFragment flowFragment) {
        C41536l.m120489i(flowFragment, "this$0");
        C9789f fVar = flowFragment.f29935h;
        if (fVar != null) {
            C9789f.m36018o(fVar, "flow", "guide", "non-bio-passport", (String) null, 8, (Object) null);
        } else {
            C41536l.m120506z("socket");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J2 */
    public static final void m38252J2(FlowFragment flowFragment) {
        C41536l.m120489i(flowFragment, "this$0");
        C17155i iVar = flowFragment.f29933f;
        if (iVar != null) {
            iVar.f48045k.setVisibility(0);
            flowFragment.f29938k = "hold_document";
            return;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: K2 */
    public static final void m38254K2(FlowFragment flowFragment) {
        C41536l.m120489i(flowFragment, "this$0");
        C9789f fVar = flowFragment.f29935h;
        if (fVar != null) {
            C9789f.m36018o(fVar, "flow", "", "faceDocument", (String) null, 8, (Object) null);
        } else {
            C41536l.m120506z("socket");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: L2 */
    public static final void m38256L2(FlowFragment flowFragment) {
        C41536l.m120489i(flowFragment, "this$0");
        flowFragment.f29941n = true;
        Log.i("identomat_", "startFlow: startProcessingFrames");
        flowFragment.m38258M2();
    }

    /* renamed from: M2 */
    private final void m38258M2() {
        Handler handler = this.f29937j;
        if (handler != null) {
            handler.postDelayed(new C17748z(this), 100);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: O2 */
    public static final void m38261O2(FlowFragment flowFragment) {
        C41536l.m120489i(flowFragment, "this$0");
        if (flowFragment.f29941n) {
            flowFragment.m38274b2();
        }
        flowFragment.m38258M2();
    }

    /* renamed from: U1 */
    private final boolean m38267U1() {
        Integer num;
        String[] strArr = f29930t;
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
    /* renamed from: V1 */
    public final void m38268V1() {
        new Handler(Looper.getMainLooper()).post(new C17747y(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: W1 */
    public static final void m38269W1(FlowFragment flowFragment) {
        C41536l.m120489i(flowFragment, "this$0");
        C17155i iVar = flowFragment.f29933f;
        if (iVar != null) {
            iVar.f48044j.setVisibility(8);
            C17155i iVar2 = flowFragment.f29933f;
            if (iVar2 != null) {
                iVar2.f48040f.setBase(SystemClock.elapsedRealtime());
                C17155i iVar3 = flowFragment.f29933f;
                if (iVar3 != null) {
                    iVar3.f48054t.setVisibility(0);
                    C17155i iVar4 = flowFragment.f29933f;
                    if (iVar4 != null) {
                        iVar4.f48040f.start();
                        C17155i iVar5 = flowFragment.f29933f;
                        if (iVar5 != null) {
                            iVar5.f48043i.setText(C16349g.operator_joined);
                            Handler handler = flowFragment.f29937j;
                            if (handler != null) {
                                handler.postDelayed(new C17715a0(flowFragment), 2000);
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

    /* access modifiers changed from: private */
    /* renamed from: X1 */
    public static final void m38270X1(FlowFragment flowFragment) {
        C41536l.m120489i(flowFragment, "this$0");
        C17155i iVar = flowFragment.f29933f;
        if (iVar != null) {
            iVar.f48043i.setVisibility(8);
        } else {
            C41536l.m120506z("binding");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y1 */
    public final void m38271Y1(String str) {
        Log.i("identomat_", C41536l.m120497q("end: ", str));
        this.f29943p = true;
        new Thread(new C17731i0(this, str)).start();
        new Handler(Looper.getMainLooper()).postDelayed(new C17728h(this), 100);
    }

    /* access modifiers changed from: private */
    /* renamed from: Z1 */
    public static final void m38272Z1(FlowFragment flowFragment, String str) {
        C41536l.m120489i(flowFragment, "this$0");
        C41536l.m120489i(str, "$message");
        try {
            C9789f fVar = flowFragment.f29935h;
            if (fVar != null) {
                fVar.mo26266g(str);
            } else {
                C41536l.m120506z("socket");
                throw null;
            }
        } catch (Exception e) {
            Log.i("identomat_", C41536l.m120497q("error: ", e.getMessage()));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a2 */
    public static final void m38273a2(FlowFragment flowFragment) {
        C41536l.m120489i(flowFragment, "this$0");
        C16341a.f46171a.mo43313a(flowFragment.getActivity());
    }

    /* renamed from: b2 */
    private final void m38274b2() {
        Log.i("identomat_", "getFrame: ");
        C17155i iVar = this.f29933f;
        if (iVar != null) {
            iVar.f48052r.mo97575g(this.f29945r);
            C17155i iVar2 = this.f29933f;
            if (iVar2 != null) {
                iVar2.f48052r.mo97570a(this.f29945r, 1.0f);
            } else {
                C41536l.m120506z("binding");
                throw null;
            }
        } else {
            C41536l.m120506z("binding");
            throw null;
        }
    }

    /* renamed from: d2 */
    private final boolean m38275d2(Context context, String... strArr) {
        int length = strArr.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                return true;
            }
            if (C0767a.m2891a(context, strArr[i]) != 0) {
                z = false;
            }
            if (!z) {
                return false;
            }
            i++;
        }
    }

    /* renamed from: e2 */
    private final void m38276e2() {
        C17155i iVar = this.f29933f;
        if (iVar != null) {
            iVar.f48052r.mo97571b();
            C17155i iVar2 = this.f29933f;
            if (iVar2 != null) {
                iVar2.f48052r.setScalingType(C42107q.C42111d.SCALE_ASPECT_FIT);
                C17155i iVar3 = this.f29933f;
                if (iVar3 != null) {
                    iVar3.f48039e.setOnClickListener(new C17717b0(this));
                    C17155i iVar4 = this.f29933f;
                    if (iVar4 != null) {
                        iVar4.f48055u.setOnClickListener(new C17719c0(this));
                        C17155i iVar5 = this.f29933f;
                        if (iVar5 != null) {
                            iVar5.f48048n.setOnClickListener(new C17721d0(this));
                            C17155i iVar6 = this.f29933f;
                            if (iVar6 != null) {
                                iVar6.f48042h.setOnClickListener(new C17723e0(this));
                                C17155i iVar7 = this.f29933f;
                                if (iVar7 != null) {
                                    iVar7.f48060z.setOnClickListener(new C17725f0(this));
                                    C17155i iVar8 = this.f29933f;
                                    if (iVar8 != null) {
                                        iVar8.f48035A.setOnClickListener(new C17727g0(this));
                                        C17155i iVar9 = this.f29933f;
                                        if (iVar9 != null) {
                                            iVar9.f48053s.setOnClickListener(new C17729h0(this));
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
    /* renamed from: f2 */
    public static final void m38277f2(FlowFragment flowFragment, View view) {
        C41536l.m120489i(flowFragment, "this$0");
        flowFragment.m38271Y1("Hanged");
    }

    /* access modifiers changed from: private */
    /* renamed from: g2 */
    public static final void m38278g2(FlowFragment flowFragment, View view) {
        C41536l.m120489i(flowFragment, "this$0");
        flowFragment.m38271Y1("Operator Busy");
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public static final void m38280h2(FlowFragment flowFragment, View view) {
        C41536l.m120489i(flowFragment, "this$0");
        C17155i iVar = flowFragment.f29933f;
        if (iVar != null) {
            iVar.f48041g.setVisibility(0);
        } else {
            C41536l.m120506z("binding");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public static final void m38282i2(FlowFragment flowFragment, View view) {
        C41536l.m120489i(flowFragment, "this$0");
        C17155i iVar = flowFragment.f29933f;
        if (iVar != null) {
            iVar.f48041g.setVisibility(8);
        } else {
            C41536l.m120506z("binding");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public static final void m38284j2(FlowFragment flowFragment, View view) {
        C41536l.m120489i(flowFragment, "this$0");
        boolean z = !flowFragment.f29942o;
        flowFragment.f29942o = z;
        C17155i iVar = flowFragment.f29933f;
        if (iVar != null) {
            iVar.f48052r.setMirror(z);
        } else {
            C41536l.m120506z("binding");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public static final void m38286k2(FlowFragment flowFragment, View view) {
        C41536l.m120489i(flowFragment, "this$0");
        C16910a aVar = flowFragment.f29936i;
        if (aVar != null) {
            aVar.mo44073j();
        }
        C17155i iVar = flowFragment.f29933f;
        if (iVar != null) {
            iVar.f48052r.setMirror(flowFragment.f29942o);
            flowFragment.f29942o = !flowFragment.f29942o;
            return;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public static final void m38288l2(FlowFragment flowFragment, View view) {
        Boolean bool;
        C41536l.m120489i(flowFragment, "this$0");
        C16910a aVar = flowFragment.f29936i;
        if (aVar == null) {
            bool = null;
        } else {
            bool = Boolean.valueOf(aVar.mo44074l());
        }
        if (C41536l.m120484d(bool, Boolean.TRUE)) {
            C17155i iVar = flowFragment.f29933f;
            if (iVar != null) {
                iVar.f48053s.setImageResource(C16346d.videocall_mic_off_state);
            } else {
                C41536l.m120506z("binding");
                throw null;
            }
        } else {
            C17155i iVar2 = flowFragment.f29933f;
            if (iVar2 != null) {
                iVar2.f48053s.setImageResource(C16346d.mic_on_active);
            } else {
                C41536l.m120506z("binding");
                throw null;
            }
        }
    }

    /* renamed from: m2 */
    private final void m38290m2() {
        if (m38267U1()) {
            m38292n2();
            return;
        }
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        String[] strArr = f29930t;
        if (m38275d2(requireContext, strArr[0])) {
            Context requireContext2 = requireContext();
            C41536l.m120488h(requireContext2, "requireContext()");
            if (!m38275d2(requireContext2, strArr[1]) && getActivity() != null) {
                this.f29944q.mo404a("android.permission.RECORD_AUDIO");
            }
        } else if (getActivity() != null) {
            this.f29944q.mo404a("android.permission.CAMERA");
        }
    }

    /* renamed from: n2 */
    private final void m38292n2() {
        this.f29935h = new C9789f(new C10538b(this));
        new Thread(new C17740r(this)).start();
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public static final void m38294o2(FlowFragment flowFragment) {
        C41536l.m120489i(flowFragment, "this$0");
        C9789f fVar = flowFragment.f29935h;
        if (fVar != null) {
            fVar.mo26265f();
        } else {
            C41536l.m120506z("socket");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public final void m38297q2() {
        C42076d.C42078b bVar;
        C42076d f;
        C17155i iVar = this.f29933f;
        if (iVar != null) {
            SurfaceViewRenderer surfaceViewRenderer = iVar.f48052r;
            C16910a aVar = this.f29936i;
            if (aVar == null || (f = aVar.mo44069f()) == null) {
                bVar = null;
            } else {
                bVar = f.mo97538c();
            }
            surfaceViewRenderer.mo97572c(bVar, new C10540c());
            C17155i iVar2 = this.f29933f;
            if (iVar2 != null) {
                iVar2.f48052r.setScalingType(C42107q.C42111d.SCALE_ASPECT_FIT);
                C17155i iVar3 = this.f29933f;
                if (iVar3 != null) {
                    iVar3.f48052r.setZOrderMediaOverlay(true);
                    C17155i iVar4 = this.f29933f;
                    if (iVar4 != null) {
                        iVar4.f48052r.setEnableHardwareScaler(true);
                        C17155i iVar5 = this.f29933f;
                        if (iVar5 != null) {
                            iVar5.f48052r.setMirror(true);
                            C16910a aVar2 = this.f29936i;
                            if (aVar2 != null) {
                                C17155i iVar6 = this.f29933f;
                                if (iVar6 != null) {
                                    SurfaceViewRenderer surfaceViewRenderer2 = iVar6.f48052r;
                                    C41536l.m120488h(surfaceViewRenderer2, "binding.localRenderer");
                                    aVar2.mo44065b(surfaceViewRenderer2);
                                } else {
                                    C41536l.m120506z("binding");
                                    throw null;
                                }
                            }
                            C17155i iVar7 = this.f29933f;
                            if (iVar7 != null) {
                                iVar7.f48058x.setVisibility(0);
                                C17155i iVar8 = this.f29933f;
                                if (iVar8 != null) {
                                    iVar8.f48043i.setText(C16349g.videocall_ringing);
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
    /* renamed from: r2 */
    public final void m38299r2() {
        Boolean bool;
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        C16910a aVar = new C16910a(requireContext);
        aVar.mo44070g();
        C41238w wVar = C41238w.f97225a;
        this.f29936i = aVar;
        aVar.mo44071h(new C10541d(this));
        C16910a aVar2 = this.f29936i;
        if (aVar2 == null) {
            bool = null;
        } else {
            bool = Boolean.valueOf(aVar2.mo44068e());
        }
        if (C41536l.m120484d(bool, Boolean.TRUE)) {
            C17155i iVar = this.f29933f;
            if (iVar != null) {
                iVar.f48053s.setImageResource(C16346d.mic_on_active);
            } else {
                C41536l.m120506z("binding");
                throw null;
            }
        } else {
            C17155i iVar2 = this.f29933f;
            if (iVar2 != null) {
                iVar2.f48053s.setImageResource(C16346d.mic_on_active);
            } else {
                C41536l.m120506z("binding");
                throw null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s2 */
    public final void m38301s2() {
        new Handler(Looper.getMainLooper()).post(new C17746x(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public static final void m38303t2(FlowFragment flowFragment) {
        C41536l.m120489i(flowFragment, "this$0");
        C17155i iVar = flowFragment.f29933f;
        if (iVar != null) {
            iVar.f48058x.setVisibility(8);
            C17155i iVar2 = flowFragment.f29933f;
            if (iVar2 != null) {
                iVar2.f48037C.setVisibility(8);
                C17155i iVar3 = flowFragment.f29933f;
                if (iVar3 != null) {
                    iVar3.f48056v.setVisibility(0);
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
    /* renamed from: u2 */
    public static final void m38305u2(FlowFragment flowFragment, boolean z) {
        C41536l.m120489i(flowFragment, "this$0");
        if (z) {
            flowFragment.m38290m2();
            return;
        }
        C16341a.f46171a.mo43313a(flowFragment.getActivity());
        Log.i("identomat_", "Permissions not granted by the user.");
    }

    /* renamed from: v2 */
    private final void m38307v2() {
        C19002e.C19003a aVar = C19002e.f53052q;
        C17155i iVar = this.f29933f;
        if (iVar != null) {
            RelativeLayout relativeLayout = iVar.f48050p;
            C41536l.m120488h(relativeLayout, "binding.indicatorView");
            aVar.mo47120f(relativeLayout, this.f29932e.mo46861a().mo47100i().mo33033a());
            C17155i iVar2 = this.f29933f;
            if (iVar2 != null) {
                iVar2.f48046l.setOnMeasureCallBack(new C10543f(this));
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
    /* renamed from: w2 */
    public final void m38308w2(String str) {
        Log.i("identomat_", "startFlow:");
        C1505h activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(new C17730i(this));
        }
        switch (str.hashCode()) {
            case -1945566365:
                if (str.equals("require_face_document")) {
                    C1505h activity2 = getActivity();
                    if (activity2 != null) {
                        activity2.runOnUiThread(new C17733k(this));
                    }
                    new Thread(new C17734l(this)).start();
                    break;
                }
                break;
            case -1473634296:
                if (str.equals("residence_license")) {
                    C1505h activity3 = getActivity();
                    if (activity3 != null) {
                        activity3.runOnUiThread(new C17743u(this));
                    }
                    new Thread(new C17744v(this)).start();
                    break;
                }
                break;
            case -1337008741:
                if (str.equals("non_bio_passport")) {
                    C1505h activity4 = getActivity();
                    if (activity4 != null) {
                        activity4.runOnUiThread(new C17745w(this));
                    }
                    new Thread(new C17732j(this)).start();
                    break;
                }
                break;
            case 3355:
                if (str.equals("id")) {
                    C1505h activity5 = getActivity();
                    if (activity5 != null) {
                        activity5.runOnUiThread(new C17736n(this));
                    }
                    new Thread(new C17737o(this)).start();
                    break;
                }
                break;
            case 943069994:
                if (str.equals("driver_license")) {
                    C1505h activity6 = getActivity();
                    if (activity6 != null) {
                        activity6.runOnUiThread(new C17741s(this));
                    }
                    new Thread(new C17742t(this)).start();
                    break;
                }
                break;
            case 1216777234:
                if (str.equals("passport")) {
                    C1505h activity7 = getActivity();
                    if (activity7 != null) {
                        activity7.runOnUiThread(new C17738p(this));
                    }
                    new Thread(new C17739q(this)).start();
                    break;
                }
                break;
        }
        Handler handler = this.f29937j;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
        }
        Handler handler2 = this.f29937j;
        if (handler2 != null) {
            handler2.postDelayed(new C17735m(this), 2000);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x2 */
    public static final void m38310x2(FlowFragment flowFragment) {
        C41536l.m120489i(flowFragment, "this$0");
        flowFragment.m38307v2();
    }

    /* access modifiers changed from: private */
    /* renamed from: y2 */
    public static final void m38312y2(FlowFragment flowFragment) {
        C41536l.m120489i(flowFragment, "this$0");
        C17155i iVar = flowFragment.f29933f;
        if (iVar != null) {
            DocumentView documentView = iVar.f48046l;
            C41536l.m120488h(documentView, "binding.documentView");
            DocumentView.m38780f(documentView, 0, false, 2, (Object) null);
            flowFragment.f29939l = 0;
            C17155i iVar2 = flowFragment.f29933f;
            if (iVar2 != null) {
                iVar2.f48046l.setVisibility(0);
                flowFragment.mo27270p2();
                return;
            }
            C41536l.m120506z("binding");
            throw null;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: z2 */
    public static final void m38314z2(FlowFragment flowFragment) {
        C41536l.m120489i(flowFragment, "this$0");
        C9789f fVar = flowFragment.f29935h;
        if (fVar != null) {
            C9789f.m36018o(fVar, "flow", "guide", "card-front", (String) null, 8, (Object) null);
        } else {
            C41536l.m120506z("socket");
            throw null;
        }
    }

    /* renamed from: c2 */
    public final C18877a mo27269c2() {
        return this.f29932e;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        C41536l.m120489i(layoutInflater, "inflater");
        C17155i d = C17155i.m60264d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f29933f = d;
        m38276e2();
        m38290m2();
        C1505h activity = getActivity();
        if (!(activity == null || (window = activity.getWindow()) == null)) {
            window.addFlags(128);
        }
        C17155i iVar = this.f29933f;
        if (iVar != null) {
            RelativeLayout c = iVar.mo3946b();
            C41536l.m120488h(c, "binding.root");
            return c;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    public void onDestroy() {
        C17155i iVar = this.f29933f;
        if (iVar != null) {
            iVar.f48052r.mo97575g(this.f29945r);
            C17155i iVar2 = this.f29933f;
            if (iVar2 != null) {
                iVar2.f48052r.mo97574f();
                C16910a aVar = this.f29936i;
                if (aVar != null) {
                    aVar.mo44066c();
                }
                C9789f fVar = this.f29935h;
                if (fVar != null) {
                    if (fVar != null) {
                        fVar.mo26266g("destroy");
                    } else {
                        C41536l.m120506z("socket");
                        throw null;
                    }
                }
                Handler handler = this.f29937j;
                if (handler != null) {
                    handler.removeCallbacksAndMessages((Object) null);
                }
                super.onDestroy();
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
        this.f29931d.mo26255q(requireContext(), this.f29934g);
    }

    /* renamed from: p2 */
    public final void mo27270p2() {
        int i = this.f29939l;
        if (i == 3 || i == 4) {
            C17155i iVar = this.f29933f;
            if (iVar != null) {
                iVar.f48036B.setText(this.f29932e.mo46864d().mo47124d(getContext(), "passport_instructions"));
            } else {
                C41536l.m120506z("binding");
                throw null;
            }
        } else if (i == 6) {
            C17155i iVar2 = this.f29933f;
            if (iVar2 != null) {
                iVar2.f48036B.setText(this.f29932e.mo46864d().mo47124d(getContext(), "scan_inn"));
            } else {
                C41536l.m120506z("binding");
                throw null;
            }
        } else if (this.f29940m == 0) {
            C17155i iVar3 = this.f29933f;
            if (iVar3 != null) {
                iVar3.f48036B.setText(this.f29932e.mo46864d().mo47124d(getContext(), C41536l.m120497q(C17336a.f48645a.mo44744c(this.f29939l), "_front_instructions")));
            } else {
                C41536l.m120506z("binding");
                throw null;
            }
        } else {
            C17155i iVar4 = this.f29933f;
            if (iVar4 != null) {
                iVar4.f48036B.setText(this.f29932e.mo46864d().mo47124d(getContext(), C41536l.m120497q(C17336a.f48645a.mo44744c(this.f29939l), "_rear_instructions")));
            } else {
                C41536l.m120506z("binding");
                throw null;
            }
        }
    }
}
