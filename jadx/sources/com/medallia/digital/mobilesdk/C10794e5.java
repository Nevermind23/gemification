package com.medallia.digital.mobilesdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.medallia.digital.mobilesdk.C11195x0;
import java.util.Locale;

/* renamed from: com.medallia.digital.mobilesdk.e5 */
public class C10794e5 extends C10717a2<Integer> {

    /* renamed from: h */
    static final String f30911h = "com.medallia.digital.mobilesdk.NPSCollector";

    /* renamed from: i */
    static final String f30912i = "com.medallia.digital.mobilesdk.NPSCollectorFilter";

    /* renamed from: g */
    private final BroadcastReceiver f30913g = new C10795a();

    /* renamed from: com.medallia.digital.mobilesdk.e5$a */
    class C10795a extends BroadcastReceiver {
        C10795a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                try {
                    if (intent.hasExtra(C10794e5.f30911h)) {
                        C10794e5.this.mo28117a(Integer.valueOf(intent.getIntExtra(C10794e5.f30911h, -1)));
                        Locale locale = Locale.US;
                        C10735b4.m39109b(String.format(locale, "Collectors > NPS : %S", new Object[]{C10794e5.this.mo28863f()}));
                    }
                } catch (Exception e) {
                    C10735b4.m39111c(e.getMessage());
                }
            }
        }
    }

    protected C10794e5(C11083s0 s0Var) {
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
        return C11195x0.C11196a.f32181P;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo28067l() {
        super.mo28067l();
        if (mo28952h()) {
            C10933k4.m40000a(C10884i4.m39721c().mo28483b()).mo28627a(this.f30913g, new IntentFilter(f30912i));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo28068m() {
        super.mo28068m();
        try {
            C10933k4.m40000a(C10884i4.m39721c().mo28483b()).mo28626a(this.f30913g);
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }
}
