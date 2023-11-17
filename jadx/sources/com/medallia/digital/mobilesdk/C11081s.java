package com.medallia.digital.mobilesdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.medallia.digital.mobilesdk.C11195x0;
import java.util.Locale;

/* renamed from: com.medallia.digital.mobilesdk.s */
class C11081s extends C10717a2<Long> {

    /* renamed from: h */
    protected static final String f31856h = "com.medallia.digital.mobilesdk.AppRatingLastAcceptedTimestampCollectorFilter";

    /* renamed from: i */
    protected static final String f31857i = "com.medallia.digital.mobilesdk.AppRatingLastAcceptedTimestampCollector";

    /* renamed from: g */
    private final BroadcastReceiver f31858g = new C11082a();

    /* renamed from: com.medallia.digital.mobilesdk.s$a */
    class C11082a extends BroadcastReceiver {
        C11082a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                try {
                    if (intent.hasExtra(C11081s.f31857i)) {
                        C11081s.this.mo28117a(Long.valueOf(intent.getLongExtra(C11081s.f31857i, 0)));
                        Locale locale = Locale.US;
                        C10735b4.m39109b(String.format(locale, "Collectors > App Rating Last accepted timestamp : %d", new Object[]{C11081s.this.mo28863f()}));
                    }
                } catch (Exception e) {
                    C10735b4.m39111c(e.getMessage());
                }
            }
        }
    }

    protected C11081s(C11083s0 s0Var) {
        super(s0Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public CollectorContract mo28118c() {
        return C11195x0.C11196a.f32185T;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo28067l() {
        super.mo28067l();
        if (mo28952h()) {
            C10933k4.m40000a(C10884i4.m39721c().mo28483b()).mo28627a(this.f31858g, new IntentFilter(f31856h));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo28068m() {
        super.mo28068m();
        try {
            C10933k4.m40000a(C10884i4.m39721c().mo28483b()).mo28626a(this.f31858g);
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }
}
