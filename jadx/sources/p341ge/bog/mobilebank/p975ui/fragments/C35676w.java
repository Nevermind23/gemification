package p341ge.bog.mobilebank.p975ui.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.OrientationEventListener;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.charts.LineChart;
import g81.C32165g;
import p341ge.bog.mobilebank.p975ui.activities.ExchangeActivity;
import p341ge.bog.mobilebank.p975ui.activities.RateChartLandscapeActivity;
import p366bk.C10322k;
import p366bk.C10324m;
import r90.C27950a;

/* renamed from: ge.bog.mobilebank.ui.fragments.w */
public class C35676w extends C35651n1 implements C32165g.C32168c {

    /* renamed from: d */
    private RecyclerView f86246d;

    /* renamed from: e */
    OrientationEventListener f86247e;

    /* renamed from: f */
    C32165g f86248f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f86249g = true;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f86250h = false;

    /* renamed from: i */
    private boolean f86251i = false;

    /* renamed from: j */
    private boolean f86252j;

    /* renamed from: k */
    private C32165g.C32168c f86253k;

    /* renamed from: l */
    Handler f86254l = new Handler();

    /* renamed from: m */
    Runnable f86255m = new C35678b();

    /* renamed from: n */
    private int f86256n = -1;

    /* renamed from: ge.bog.mobilebank.ui.fragments.w$a */
    class C35677a extends OrientationEventListener {
        C35677a(Context context, int i) {
            super(context, i);
        }

        public void onOrientationChanged(int i) {
            if (i != -1 && C35676w.this.f86249g != C35676w.this.m105955q1(i)) {
                C35676w wVar = C35676w.this;
                wVar.f86249g = wVar.m105955q1(i);
                C35676w wVar2 = C35676w.this;
                wVar2.f86254l.removeCallbacks(wVar2.f86255m);
                C35676w wVar3 = C35676w.this;
                wVar3.f86254l.postDelayed(wVar3.f86255m, 500);
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.fragments.w$b */
    class C35678b implements Runnable {
        C35678b() {
        }

        public void run() {
            C32165g gVar = C35676w.this.f86248f;
            if (gVar != null) {
                int t = gVar.mo72683t();
                LineChart s = C35676w.this.f86248f.mo72682s();
                if (C35676w.this.f86249g || t == -1 || s == null || !C35676w.this.m105953o1().mo86124Q2()) {
                    C35676w.this.f86250h = false;
                    return;
                }
                Intent intent = new Intent(C35676w.this.m105953o1(), RateChartLandscapeActivity.class);
                if (t != -1 && t < C35676w.this.m105953o1().mo86120L2().length) {
                    if (C35676w.this.m105953o1().getIntent().getAction() != null) {
                        intent.setAction(C35676w.this.m105953o1().getIntent().getAction());
                    }
                    intent.putExtra("CCY_HISTORY_WRAPPER_KEY", C35676w.this.m105953o1().mo86120L2()[t].getCcy());
                    intent.putExtra("CCY_DESCRIPTION", String.format("%d %s", new Object[]{Integer.valueOf(C35676w.this.m105953o1().mo86120L2()[t].getRateWeight()), C27950a.m86286c(C35676w.this.m105953o1().mo86120L2()[t].getDictionaryKey(), false)}));
                }
                if (!C35676w.this.f86250h) {
                    C35676w.this.startActivity(intent);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o1 */
    public ExchangeActivity m105953o1() {
        return (ExchangeActivity) getActivity();
    }

    /* renamed from: p1 */
    private void m105954p1() {
        this.f86247e = new C35677a(m105953o1(), 3);
    }

    /* access modifiers changed from: private */
    /* renamed from: q1 */
    public boolean m105955q1(int i) {
        return (i >= 300 && i <= 360) || (i >= 0 && i <= 90);
    }

    /* renamed from: r1 */
    private void m105956r1() {
        if (this.f86256n == -1) {
            C32165g gVar = this.f86248f;
            if (gVar == null) {
                this.f86248f = new C32165g(getActivity(), m105953o1().mo86120L2(), m105953o1().mo86119K2(), this);
                this.f86246d.setLayoutManager(new LinearLayoutManager(m105953o1()));
                this.f86246d.setAdapter(this.f86248f);
                m105957u1();
                return;
            }
            gVar.mo72687x(m105953o1().mo86120L2());
            this.f86248f.mo72686w(m105953o1().mo86119K2());
        }
    }

    /* renamed from: u1 */
    private void m105957u1() {
        this.f86248f.mo72680q(m105953o1().mo86121M2());
    }

    /* renamed from: h0 */
    public void mo72690h0(int i) {
        this.f86256n = i;
        C32165g.C32168c cVar = this.f86253k;
        if (cVar != null) {
            cVar.mo72690h0(i);
        }
    }

    /* access modifiers changed from: protected */
    public int layoutId() {
        return C10324m.fragment_currencies;
    }

    public void onPause() {
        this.f86247e.disable();
        super.onPause();
    }

    public void onResume() {
        this.f86247e.enable();
        super.onResume();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f86246d = (RecyclerView) view.findViewById(C10322k.rates_recycler_view);
        m105954p1();
        this.f86252j = true;
        if (this.f86251i) {
            m105956r1();
        }
    }

    /* renamed from: s1 */
    public void mo86771s1() {
        this.f86251i = true;
        if (this.f86252j) {
            m105956r1();
        }
    }

    /* renamed from: t1 */
    public void mo86772t1() {
        C32165g gVar;
        if (this.f86252j && (gVar = this.f86248f) != null) {
            gVar.mo72686w(m105953o1().mo86119K2());
            m105957u1();
        }
    }

    /* renamed from: v1 */
    public void mo86773v1(C32165g.C32168c cVar) {
        this.f86253k = cVar;
    }
}
