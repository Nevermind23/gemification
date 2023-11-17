package com.medallia.digital.mobilesdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.medallia.digital.mobilesdk.C11195x0;
import java.util.Locale;

/* renamed from: com.medallia.digital.mobilesdk.t */
class C11093t extends C10717a2<Long> {

    /* renamed from: h */
    protected static final String f31921h = "com.medallia.digital.mobilesdk.AppRatingLastDeclineTimestampCollectorFilter";

    /* renamed from: i */
    protected static final String f31922i = "com.medallia.digital.mobilesdk.AppRatingLastDeclineTimestampCollector";

    /* renamed from: g */
    private final BroadcastReceiver f31923g = new C11094a();

    /* renamed from: com.medallia.digital.mobilesdk.t$a */
    class C11094a extends BroadcastReceiver {
        C11094a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                try {
                    if (intent.hasExtra(C11093t.f31922i)) {
                        C11093t.this.mo28117a(Long.valueOf(intent.getLongExtra(C11093t.f31922i, 0)));
                        Locale locale = Locale.US;
                        C10735b4.m39109b(String.format(locale, "Collectors > App Rating Last decline timestamp : %d", new Object[]{C11093t.this.mo28863f()}));
                    }
                } catch (Exception e) {
                    C10735b4.m39111c(e.getMessage());
                }
            }
        }
    }

    protected C11093t(C11083s0 s0Var) {
        super(s0Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public CollectorContract mo28118c() {
        return C11195x0.C11196a.f32183R;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo28067l() {
        super.mo28067l();
        if (mo28952h()) {
            C10933k4.m40000a(C10884i4.m39721c().mo28483b()).mo28627a(this.f31923g, new IntentFilter(f31921h));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo28068m() {
        super.mo28068m();
        try {
            C10933k4.m40000a(C10884i4.m39721c().mo28483b()).mo28626a(this.f31923g);
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }
}
