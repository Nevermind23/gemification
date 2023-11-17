package com.identomat.fragments.call;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.activity.result.C0173b;
import androidx.core.content.C0767a;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;
import org.webrtc.C42076d;
import org.webrtc.C42107q;
import org.webrtc.SessionDescription;
import org.webrtc.SurfaceViewRenderer;
import p017b.C2105c;
import p345ad.C9786e;
import p345ad.C9789f;
import p485kc.C16341a;
import p527nc.C16910a;
import p541oc.C17150d;
import p597sc.C17714a;
import p597sc.C17716b;
import p597sc.C17718c;
import p597sc.C17720d;
import p597sc.C17722e;
import p597sc.C17724f;
import p678yc.C18877a;
import p692zc.C19002e;
import ue1.C43075l;

public final class CallFragment extends Fragment {

    /* renamed from: l */
    public static final C10533a f29916l = new C10533a((DefaultConstructorMarker) null);

    /* renamed from: m */
    private static final String[] f29917m = {"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};

    /* renamed from: d */
    private final C9786e f29918d;

    /* renamed from: e */
    private final C18877a f29919e;

    /* renamed from: f */
    private final String f29920f = "call_page";

    /* renamed from: g */
    private C17150d f29921g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C9789f f29922h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C16910a f29923i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public String f29924j = "null";

    /* renamed from: k */
    private final C0173b f29925k;

    /* renamed from: com.identomat.fragments.call.CallFragment$a */
    public static final class C10533a {
        private C10533a() {
        }

        public /* synthetic */ C10533a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.identomat.fragments.call.CallFragment$b */
    static final class C10534b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CallFragment f29926d;

        /* renamed from: com.identomat.fragments.call.CallFragment$b$a */
        static final class C10535a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ CallFragment f29927d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10535a(CallFragment callFragment) {
                super(1);
                this.f29927d = callFragment;
            }

            /* renamed from: a */
            public final void mo27267a(boolean z) {
                if (this.f29927d.f29923i == null || !z) {
                    Log.i("identomat_", "Fail");
                    return;
                }
                C9789f q1 = this.f29927d.f29922h;
                if (q1 != null) {
                    C16910a r1 = this.f29927d.f29923i;
                    C41536l.m120486f(r1);
                    q1.mo26273p(r1.mo44067d());
                    return;
                }
                C41536l.m120506z("socket");
                throw null;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo27267a(((Boolean) obj).booleanValue());
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10534b(CallFragment callFragment) {
            super(1);
            this.f29926d = callFragment;
        }

        /* renamed from: a */
        public final void mo27266a(JSONObject jSONObject) {
            C41536l.m120489i(jSONObject, "jsonObject");
            String string = jSONObject.getString("id");
            if (string != null) {
                switch (string.hashCode()) {
                    case -1357520532:
                        if (string.equals("closed")) {
                            this.f29926d.m38228z1("closed");
                            return;
                        }
                        return;
                    case -1291105480:
                        if (string.equals("iceCandidate")) {
                            JSONObject jSONObject2 = jSONObject.getJSONObject("candidate");
                            C16910a r1 = this.f29926d.f29923i;
                            if (r1 != null) {
                                C41536l.m120488h(jSONObject2, "response");
                                r1.mo44064a(jSONObject2);
                                return;
                            }
                            return;
                        }
                        return;
                    case -571321340:
                        if (string.equals("registerResponse")) {
                            if (C41536l.m120484d(jSONObject.getString("response"), "accepted")) {
                                this.f29926d.m38208I1();
                                return;
                            } else {
                                this.f29926d.m38228z1("Fail to register");
                                return;
                            }
                        } else {
                            return;
                        }
                    case -272190273:
                        if (string.equals("callResponse") && C41536l.m120484d(jSONObject.getString("response"), "accepted")) {
                            this.f29926d.m38226x1();
                            CallFragment callFragment = this.f29926d;
                            String string2 = jSONObject.getString("sdpAnswer");
                            C41536l.m120488h(string2, "jsonObject.getString(\"sdpAnswer\")");
                            callFragment.f29924j = string2;
                            C16910a r12 = this.f29926d.f29923i;
                            if (r12 != null) {
                                r12.mo44072i(this.f29926d.f29924j, new C10535a(this.f29926d));
                                return;
                            }
                            return;
                        }
                        return;
                    case 729582324:
                        if (string.equals("stopCommunication")) {
                            String string3 = jSONObject.getString("message");
                            CallFragment callFragment2 = this.f29926d;
                            C41536l.m120488h(string3, "response");
                            callFragment2.m38228z1(string3);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo27266a((JSONObject) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: com.identomat.fragments.call.CallFragment$c */
    static final class C10536c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CallFragment f29928d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10536c(CallFragment callFragment) {
            super(1);
            this.f29928d = callFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m38232c(SessionDescription sessionDescription, CallFragment callFragment) {
            C41536l.m120489i(callFragment, "this$0");
            if (sessionDescription != null) {
                Log.i("identomat_", "sendOffer: ");
                C9789f q1 = callFragment.f29922h;
                if (q1 != null) {
                    q1.mo26271m(sessionDescription);
                    callFragment.m38207H1();
                    return;
                }
                C41536l.m120506z("socket");
                throw null;
            }
        }

        /* renamed from: b */
        public final void mo27268b(SessionDescription sessionDescription) {
            new Handler(Looper.getMainLooper()).postDelayed(new C10544a(sessionDescription, this.f29928d), 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo27268b((SessionDescription) obj);
            return C41238w.f97225a;
        }
    }

    public CallFragment(C9786e eVar, C18877a aVar) {
        C41536l.m120489i(eVar, "api");
        C41536l.m120489i(aVar, "identomatConfig");
        this.f29918d = eVar;
        this.f29919e = aVar;
        C0173b registerForActivityResult = registerForActivityResult(new C2105c(), new C17716b(this));
        C41536l.m120488h(registerForActivityResult, "registerForActivityResult(ActivityResultContracts.RequestPermission()) { isGranted: Boolean ->\n            if (isGranted) {\n                initPermissions()\n            } else {\n                IdentomatManager.finish(activity)\n                Log.i(TAG, \"Permissions not granted by the user.\")\n            }\n        }");
        this.f29925k = registerForActivityResult;
    }

    /* access modifiers changed from: private */
    /* renamed from: A1 */
    public static final void m38200A1(CallFragment callFragment) {
        C41536l.m120489i(callFragment, "this$0");
        C16341a.f46171a.mo43313a(callFragment.getActivity());
    }

    /* renamed from: B1 */
    private final boolean m38201B1(Context context, String... strArr) {
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

    /* renamed from: C1 */
    private final void m38202C1() {
        C19002e.C19003a aVar = C19002e.f53052q;
        C17150d dVar = this.f29921g;
        if (dVar != null) {
            ImageView imageView = dVar.f47993e;
            C41536l.m120488h(imageView, "binding.backButton");
            aVar.mo47122h(imageView, this.f29919e.mo46861a().mo47100i().mo33033a());
            C17150d dVar2 = this.f29921g;
            if (dVar2 != null) {
                dVar2.f47993e.setOnClickListener(new C17720d(this));
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
    /* renamed from: D1 */
    public static final void m38203D1(CallFragment callFragment, View view) {
        C41536l.m120489i(callFragment, "this$0");
        C1505h activity = callFragment.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    /* renamed from: E1 */
    private final void m38204E1() {
        if (m38225v1()) {
            m38205F1();
            return;
        }
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        String[] strArr = f29917m;
        if (m38201B1(requireContext, strArr[0])) {
            Context requireContext2 = requireContext();
            C41536l.m120488h(requireContext2, "requireContext()");
            if (!m38201B1(requireContext2, strArr[1]) && getActivity() != null) {
                this.f29925k.mo404a("android.permission.RECORD_AUDIO");
            }
        } else if (getActivity() != null) {
            this.f29925k.mo404a("android.permission.CAMERA");
        }
    }

    /* renamed from: F1 */
    private final void m38205F1() {
        this.f29922h = new C9789f(new C10534b(this));
        new Thread(new C17718c(this)).start();
    }

    /* access modifiers changed from: private */
    /* renamed from: G1 */
    public static final void m38206G1(CallFragment callFragment) {
        C41536l.m120489i(callFragment, "this$0");
        C9789f fVar = callFragment.f29922h;
        if (fVar != null) {
            fVar.mo26265f();
        } else {
            C41536l.m120506z("socket");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H1 */
    public final void m38207H1() {
        C42076d.C42078b bVar;
        C42076d f;
        C17150d dVar = this.f29921g;
        if (dVar != null) {
            SurfaceViewRenderer surfaceViewRenderer = dVar.f47997i;
            C16910a aVar = this.f29923i;
            if (aVar == null || (f = aVar.mo44069f()) == null) {
                bVar = null;
            } else {
                bVar = f.mo97538c();
            }
            surfaceViewRenderer.mo97572c(bVar, (C42107q.C42110c) null);
            C17150d dVar2 = this.f29921g;
            if (dVar2 != null) {
                dVar2.f47997i.setScalingType(C42107q.C42111d.SCALE_ASPECT_FIT);
                C17150d dVar3 = this.f29921g;
                if (dVar3 != null) {
                    dVar3.f47997i.setZOrderMediaOverlay(true);
                    C17150d dVar4 = this.f29921g;
                    if (dVar4 != null) {
                        dVar4.f47997i.setEnableHardwareScaler(true);
                        C17150d dVar5 = this.f29921g;
                        if (dVar5 != null) {
                            dVar5.f47997i.setMirror(true);
                            C16910a aVar2 = this.f29923i;
                            if (aVar2 != null) {
                                C17150d dVar6 = this.f29921g;
                                if (dVar6 != null) {
                                    SurfaceViewRenderer surfaceViewRenderer2 = dVar6.f47997i;
                                    C41536l.m120488h(surfaceViewRenderer2, "binding.localRenderer");
                                    aVar2.mo44065b(surfaceViewRenderer2);
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

    /* access modifiers changed from: private */
    /* renamed from: I1 */
    public final void m38208I1() {
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        C16910a aVar = new C16910a(requireContext);
        aVar.mo44070g();
        C41238w wVar = C41238w.f97225a;
        this.f29923i = aVar;
        aVar.mo44071h(new C10536c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: J1 */
    public static final void m38209J1(CallFragment callFragment, View view) {
        C41536l.m120489i(callFragment, "this$0");
        callFragment.m38228z1("Hanged");
    }

    /* access modifiers changed from: private */
    /* renamed from: K1 */
    public static final void m38210K1(CallFragment callFragment, boolean z) {
        C41536l.m120489i(callFragment, "this$0");
        if (z) {
            callFragment.m38204E1();
            return;
        }
        C16341a.f46171a.mo43313a(callFragment.getActivity());
        Log.i("identomat_", "Permissions not granted by the user.");
    }

    /* renamed from: v1 */
    private final boolean m38225v1() {
        Integer num;
        String[] strArr = f29917m;
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
    /* renamed from: x1 */
    public final void m38226x1() {
        new Handler(Looper.getMainLooper()).post(new C17724f(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: y1 */
    public static final void m38227y1(CallFragment callFragment) {
        C41536l.m120489i(callFragment, "this$0");
        C17150d dVar = callFragment.f29921g;
        if (dVar != null) {
            dVar.f47995g.setVisibility(8);
            C17150d dVar2 = callFragment.f29921g;
            if (dVar2 != null) {
                dVar2.f47998j.setVisibility(8);
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
    /* renamed from: z1 */
    public final void m38228z1(String str) {
        new Handler(Looper.getMainLooper()).postDelayed(new C17722e(this), 200);
        try {
            C9789f fVar = this.f29922h;
            if (fVar != null) {
                fVar.mo26266g(str);
                C16910a aVar = this.f29923i;
                if (aVar != null) {
                    aVar.mo44066c();
                    return;
                }
                return;
            }
            C41536l.m120506z("socket");
            throw null;
        } catch (Exception e) {
            Log.i("identomat_", C41536l.m120497q("error: ", e.getMessage()));
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        C17150d d = C17150d.m60240d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f29921g = d;
        m38202C1();
        m38204E1();
        C17150d dVar = this.f29921g;
        if (dVar != null) {
            dVar.f47996h.setOnClickListener(new C17714a(this));
            C17150d dVar2 = this.f29921g;
            if (dVar2 != null) {
                RelativeLayout c = dVar2.mo3946b();
                C41536l.m120488h(c, "binding.root");
                return c;
            }
            C41536l.m120506z("binding");
            throw null;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    public void onDestroy() {
        C17150d dVar = this.f29921g;
        if (dVar != null) {
            dVar.f47997i.mo97574f();
            super.onDestroy();
            return;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    public void onResume() {
        super.onResume();
        this.f29918d.mo26255q(requireContext(), this.f29920f);
    }
}
