package p341ge.bog.mobilebank.autoliabilityinsurance.presentation.insuranceconditions;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p202p0.C7548i0;
import p451hk.C15526d;
import p493kk.C16456j;
import p632uk.C18175a;
import p632uk.C18176b;

/* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.insuranceconditions.InsuranceConditionsFragment */
public final class InsuranceConditionsFragment extends C13646a {

    /* renamed from: j */
    public static final C13645a f40777j = new C13645a((DefaultConstructorMarker) null);

    /* renamed from: i */
    private C16456j f40778i;

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.insuranceconditions.InsuranceConditionsFragment$a */
    public static final class C13645a {
        private C13645a() {
        }

        public /* synthetic */ C13645a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: j1 */
    private final View.OnClickListener m51102j1(String str) {
        return new C18176b(this, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: k1 */
    public static final void m51103k1(InsuranceConditionsFragment insuranceConditionsFragment, String str, View view) {
        C41536l.m120489i(insuranceConditionsFragment, "this$0");
        C41536l.m120489i(str, "$url");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        insuranceConditionsFragment.startActivity(intent);
    }

    /* renamed from: l1 */
    private final C16456j m51104l1() {
        C16456j jVar = this.f40778i;
        C41536l.m120486f(jVar);
        return jVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: m1 */
    public static final void m51105m1(View view) {
        C41536l.m120488h(view, "it");
        C7548i0.m28680a(view).mo22117L(C15526d.action_insuranceConditionsFragment_to_insuranceInfoFragment);
    }

    /* renamed from: n1 */
    private final void m51106n1() {
        m51104l1().f46511n.setOnClickListener(m51102j1(C32343x.m95388F("rbc.ins.links.conditions.aldagi", new Object[0])));
        m51104l1().f46512o.setOnClickListener(m51102j1(C32343x.m95388F("rbc.ins.links.conditions.gpi", new Object[0])));
        m51104l1().f46513p.setOnClickListener(m51102j1(C32343x.m95388F("rbc.ins.links.conditions.irao", new Object[0])));
        m51104l1().f46514q.setOnClickListener(m51102j1(C32343x.m95388F("rbc.ins.links.conditions.ard", new Object[0])));
        m51104l1().f46506i.setOnClickListener(m51102j1(C32343x.m95388F("rbc.ins.links.info.aldagi", new Object[0])));
        m51104l1().f46507j.setOnClickListener(m51102j1(C32343x.m95388F("rbc.ins.links.info.gpi", new Object[0])));
        m51104l1().f46508k.setOnClickListener(m51102j1(C32343x.m95388F("rbc.ins.links.info.irao", new Object[0])));
        m51104l1().f46509l.setOnClickListener(m51102j1(C32343x.m95388F("rbc.ins.links.info.ard", new Object[0])));
    }

    /* renamed from: o1 */
    private final void m51107o1() {
        m51104l1().f46505h.setText(C32343x.m95388F("rbc.ins.more.title.1", new Object[0]));
        m51104l1().f46502e.setText(C32343x.m95388F("rbc.ins.more.desc.11", new Object[0]));
        TextView textView = m51104l1().f46503f;
        String F = C32343x.m95388F("rbc.ins.more.desc.12", new Object[0]);
        textView.setText("● " + F);
        TextView textView2 = m51104l1().f46504g;
        String F2 = C32343x.m95388F("rbc.ins.more.desc.13", new Object[0]);
        textView2.setText("● " + F2);
        m51104l1().f46506i.setTitle(C32343x.m95388F("rbc.ins.more.desc.5.1", new Object[0]));
        m51104l1().f46507j.setTitle(C32343x.m95388F("rbc.ins.more.desc.5.2", new Object[0]));
        m51104l1().f46508k.setTitle(C32343x.m95388F("rbc.ins.more.desc.5.3", new Object[0]));
        m51104l1().f46509l.setTitle(C32343x.m95388F("rbc.ins.more.desc.5.4", new Object[0]));
        m51104l1().f46515r.setText(C32343x.m95388F("rbc.ins.more.title.5", new Object[0]));
        m51104l1().f46511n.setTitle(C32343x.m95388F("rbc.ins.more.desc.5.1", new Object[0]));
        m51104l1().f46512o.setTitle(C32343x.m95388F("rbc.ins.more.desc.5.2", new Object[0]));
        m51104l1().f46513p.setTitle(C32343x.m95388F("rbc.ins.more.desc.5.3", new Object[0]));
        m51104l1().f46514q.setTitle(C32343x.m95388F("rbc.ins.more.desc.5.4", new Object[0]));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f40778i = C16456j.m58629d(layoutInflater, viewGroup, false);
        LinearLayout c = m51104l1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f40778i = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m51107o1();
        m51106n1();
        m51104l1().f46519v.setOnClickListener(new C18175a());
    }
}
