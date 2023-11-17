package com.medallia.digital.mobilesdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.medallia.digital.mobilesdk.C11195x0;
import java.util.Locale;

/* renamed from: com.medallia.digital.mobilesdk.u3 */
class C11111u3 extends C10717a2<Long> {

    /* renamed from: h */
    protected static final String f31951h = "com.medallia.digital.mobilesdk.LastDeclineTimestampCollectorFilter";

    /* renamed from: i */
    protected static final String f31952i = "com.medallia.digital.mobilesdk.LastDeclineTimestampCollector";

    /* renamed from: g */
    private final BroadcastReceiver f31953g = new C11112a();

    /* renamed from: com.medallia.digital.mobilesdk.u3$a */
    class C11112a extends BroadcastReceiver {
        C11112a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                try {
                    if (intent.hasExtra(C11111u3.f31952i)) {
                        C11111u3.this.mo28117a(Long.valueOf(intent.getLongExtra(C11111u3.f31952i, 0)));
                        Locale locale = Locale.US;
                        C10735b4.m39109b(String.format(locale, "Collectors > Last decline timestamp : %d", new Object[]{C11111u3.this.mo28863f()}));
                    }
                } catch (Exception e) {
                    C10735b4.m39111c(e.getMessage());
                }
            }
        }
    }

    protected C11111u3(C11083s0 s0Var) {
        super(s0Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public CollectorContract mo28118c() {
        return C11195x0.C11196a.f32170E;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo28067l() {
        super.mo28067l();
        if (mo28952h()) {
            C10933k4.m40000a(C10884i4.m39721c().mo28483b()).mo28627a(this.f31953g, new IntentFilter(f31951h));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo28068m() {
        super.mo28068m();
        try {
            C10933k4.m40000a(C10884i4.m39721c().mo28483b()).mo28626a(this.f31953g);
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }
}
