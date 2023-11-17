package com.medallia.digital.mobilesdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.medallia.digital.mobilesdk.C11195x0;
import java.util.Locale;

/* renamed from: com.medallia.digital.mobilesdk.p5 */
class C11055p5 extends C10717a2<String> {

    /* renamed from: g */
    private final BroadcastReceiver f31798g = new C11056a();

    /* renamed from: com.medallia.digital.mobilesdk.p5$a */
    class C11056a extends BroadcastReceiver {
        C11056a() {
        }

        public void onReceive(Context context, Intent intent) {
            try {
                int intExtra = intent.getIntExtra("status", -1);
                C11055p5 p5Var = C11055p5.this;
                p5Var.mo28117a(p5Var.m40552a(intExtra).toString());
                Locale locale = Locale.US;
                C10735b4.m39109b(String.format(locale, "Collectors > Power type : %s", new Object[]{C11055p5.this.mo28863f()}));
            } catch (Exception e) {
                C10735b4.m39111c(e.getMessage());
            }
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.p5$b */
    enum C11057b {
        Unplugged,
        Charging,
        Full,
        Unknown
    }

    protected C11055p5(C11083s0 s0Var) {
        super(s0Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C11057b m40552a(int i) {
        if (i == 2) {
            return C11057b.Charging;
        }
        if (i == 5) {
            return C11057b.Full;
        }
        return (i == 3 || i == 4) ? C11057b.Unplugged : C11057b.Unknown;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public CollectorContract mo28118c() {
        return C11195x0.C11196a.f32166A;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo28067l() {
        super.mo28067l();
        if (mo28952h()) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
            C10884i4.m39721c().mo28483b().registerReceiver(this.f31798g, intentFilter);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo28068m() {
        super.mo28068m();
        try {
            C10884i4.m39721c().mo28483b().unregisterReceiver(this.f31798g);
        } catch (IllegalArgumentException e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public String mo28065j() {
        return (String) mo28863f();
    }
}
