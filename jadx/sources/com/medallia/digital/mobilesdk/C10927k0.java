package com.medallia.digital.mobilesdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.medallia.digital.mobilesdk.C11195x0;
import java.util.Locale;

/* renamed from: com.medallia.digital.mobilesdk.k0 */
class C10927k0 extends C10717a2<Integer> {

    /* renamed from: g */
    private final BroadcastReceiver f31391g = new C10928a();

    /* renamed from: com.medallia.digital.mobilesdk.k0$a */
    class C10928a extends BroadcastReceiver {
        C10928a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                try {
                    if (intent.hasExtra("level")) {
                        C10927k0.this.mo28117a(Integer.valueOf(intent.getIntExtra("level", 0)));
                        Locale locale = Locale.US;
                        C10735b4.m39109b(String.format(locale, "Collectors > Battery percentage : %d", new Object[]{C10927k0.this.mo28863f()}));
                    }
                } catch (Exception e) {
                    C10735b4.m39111c(e.getMessage());
                }
            }
        }
    }

    protected C10927k0(C11083s0 s0Var) {
        super(s0Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public CollectorContract mo28118c() {
        return C11195x0.C11196a.f32168C;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo28067l() {
        super.mo28067l();
        C10884i4.m39721c().mo28483b().registerReceiver(this.f31391g, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo28068m() {
        super.mo28068m();
        try {
            C10884i4.m39721c().mo28483b().unregisterReceiver(this.f31391g);
        } catch (IllegalArgumentException e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public Integer mo28065j() {
        return (Integer) mo28863f();
    }
}
