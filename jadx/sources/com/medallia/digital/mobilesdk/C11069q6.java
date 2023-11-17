package com.medallia.digital.mobilesdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.medallia.digital.mobilesdk.C11195x0;
import java.util.Locale;

/* renamed from: com.medallia.digital.mobilesdk.q6 */
class C11069q6 extends C10717a2<Integer> {

    /* renamed from: g */
    private final BroadcastReceiver f31826g = new C11070a();

    /* renamed from: com.medallia.digital.mobilesdk.q6$a */
    class C11070a extends BroadcastReceiver {
        C11070a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                try {
                    if (intent.hasExtra("com.medallia.digital.mobilesdk.SESSION_NUMBER_VALUE")) {
                        C11069q6.this.mo28117a(Integer.valueOf(intent.getIntExtra("com.medallia.digital.mobilesdk.SESSION_NUMBER_VALUE", 0)));
                        Locale locale = Locale.US;
                        C10735b4.m39109b(String.format(locale, "New session created, number : %d", new Object[]{C11069q6.this.mo28863f()}));
                    }
                } catch (Exception e) {
                    C10735b4.m39111c(e.getMessage());
                }
            }
        }
    }

    protected C11069q6(C11083s0 s0Var) {
        super(s0Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public CollectorContract mo28118c() {
        return C11195x0.C11196a.f32216x;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo28067l() {
        super.mo28067l();
        C10933k4.m40000a(C10884i4.m39721c().mo28483b()).mo28627a(this.f31826g, new IntentFilter("com.medallia.digital.mobilesdk.SESSION_STARTED"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo28068m() {
        super.mo28068m();
        try {
            C10933k4.m40000a(C10884i4.m39721c().mo28483b()).mo28626a(this.f31826g);
        } catch (IllegalArgumentException e) {
            C10735b4.m39111c(e.getMessage());
        }
    }
}
