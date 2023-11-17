package com.medallia.digital.mobilesdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.medallia.digital.mobilesdk.C11195x0;
import java.util.Locale;

/* renamed from: com.medallia.digital.mobilesdk.e1 */
public class C10787e1 extends C10717a2<Integer> {

    /* renamed from: h */
    static final String f30890h = "com.medallia.digital.mobilesdk.CSATCollector";

    /* renamed from: i */
    static final String f30891i = "com.medallia.digital.mobilesdk.CSATCollectorFilter";

    /* renamed from: g */
    private final BroadcastReceiver f30892g = new C10788a();

    /* renamed from: com.medallia.digital.mobilesdk.e1$a */
    class C10788a extends BroadcastReceiver {
        C10788a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null && intent.hasExtra(C10787e1.f30890h)) {
                C10787e1.this.mo28117a(Integer.valueOf(intent.getIntExtra(C10787e1.f30890h, -1)));
                C10735b4.m39109b(String.format(Locale.US, "Collectors > CSAT : %S", new Object[]{C10787e1.this.mo28863f()}));
            }
        }
    }

    protected C10787e1(C11083s0 s0Var) {
        super(s0Var);
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo28063a(C11095t0 t0Var) {
        super.mo28063a(t0Var);
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ String mo28256b() {
        return super.mo28256b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public CollectorContract mo28118c() {
        return C11195x0.C11196a.f32182Q;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo28067l() {
        super.mo28067l();
        if (mo28952h()) {
            C10933k4.m40000a(C10884i4.m39721c().mo28483b()).mo28627a(this.f30892g, new IntentFilter(f30891i));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo28068m() {
        super.mo28068m();
        try {
            C10933k4.m40000a(C10884i4.m39721c().mo28483b()).mo28626a(this.f30892g);
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }
}
