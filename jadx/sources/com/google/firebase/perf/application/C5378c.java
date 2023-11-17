package com.google.firebase.perf.application;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.perf.metrics.Trace;
import java.util.WeakHashMap;
import p134ja.C6763a;
import p147ka.C6849g;
import p199oa.C7506k;
import p212pa.C7777a;
import p212pa.C7784g;
import p212pa.C7788j;

/* renamed from: com.google.firebase.perf.application.c */
public class C5378c extends FragmentManager.C1454k {

    /* renamed from: f */
    private static final C6763a f17169f = C6763a.m26371e();

    /* renamed from: a */
    private final WeakHashMap f17170a = new WeakHashMap();

    /* renamed from: b */
    private final C7777a f17171b;

    /* renamed from: c */
    private final C7506k f17172c;

    /* renamed from: d */
    private final C5374a f17173d;

    /* renamed from: e */
    private final C5379d f17174e;

    public C5378c(C7777a aVar, C7506k kVar, C5374a aVar2, C5379d dVar) {
        this.f17171b = aVar;
        this.f17172c = kVar;
        this.f17173d = aVar2;
        this.f17174e = dVar;
    }

    /* renamed from: f */
    public void mo4473f(FragmentManager fragmentManager, Fragment fragment) {
        super.mo4473f(fragmentManager, fragment);
        C6763a aVar = f17169f;
        aVar.mo20805b("FragmentMonitor %s.onFragmentPaused ", fragment.getClass().getSimpleName());
        if (!this.f17170a.containsKey(fragment)) {
            aVar.mo20813k("FragmentMonitor: missed a fragment trace from %s", fragment.getClass().getSimpleName());
            return;
        }
        Trace trace = (Trace) this.f17170a.get(fragment);
        this.f17170a.remove(fragment);
        C7784g f = this.f17174e.mo17700f(fragment);
        if (!f.mo22547d()) {
            aVar.mo20813k("onFragmentPaused: recorder failed to trace %s", fragment.getClass().getSimpleName());
            return;
        }
        C7788j.m29498a(trace, (C6849g.C6850a) f.mo22546c());
        trace.stop();
    }

    /* renamed from: i */
    public void mo4476i(FragmentManager fragmentManager, Fragment fragment) {
        String str;
        super.mo4476i(fragmentManager, fragment);
        f17169f.mo20805b("FragmentMonitor %s.onFragmentResumed", fragment.getClass().getSimpleName());
        Trace trace = new Trace(mo17696o(fragment), this.f17172c, this.f17171b, this.f17173d);
        trace.start();
        if (fragment.getParentFragment() == null) {
            str = "No parent";
        } else {
            str = fragment.getParentFragment().getClass().getSimpleName();
        }
        trace.putAttribute("Parent_fragment", str);
        if (fragment.getActivity() != null) {
            trace.putAttribute("Hosting_activity", fragment.getActivity().getClass().getSimpleName());
        }
        this.f17170a.put(fragment, trace);
        this.f17174e.mo17698d(fragment);
    }

    /* renamed from: o */
    public String mo17696o(Fragment fragment) {
        return "_st_" + fragment.getClass().getSimpleName();
    }
}
