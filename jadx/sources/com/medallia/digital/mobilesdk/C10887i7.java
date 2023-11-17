package com.medallia.digital.mobilesdk;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.WindowManager;
import com.medallia.digital.mobilesdk.Broadcasts;
import com.medallia.digital.mobilesdk.C10864h7;
import com.medallia.digital.mobilesdk.C11164w3;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.medallia.digital.mobilesdk.i7 */
final class C10887i7 implements C11164w3.C11170f, C10864h7.C10869e, C10864h7.C10868d, DialogInterface.OnCancelListener {

    /* renamed from: m */
    private static final long f31254m = 300;

    /* renamed from: n */
    private static final int f31255n = 1;

    /* renamed from: o */
    private static C10887i7 f31256o;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C10864h7 f31257a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C11013n2 f31258b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C10841g7 f31259c;

    /* renamed from: d */
    private Handler f31260d = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f31261e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f31262f;

    /* renamed from: g */
    private boolean f31263g = false;

    /* renamed from: h */
    private final ArrayList<C10891d> f31264h = new ArrayList<>();

    /* renamed from: i */
    private final ArrayList<C10892e> f31265i = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C10984l5 f31266j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C10984l5 f31267k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public MDAppearanceMode f31268l;

    /* renamed from: com.medallia.digital.mobilesdk.i7$a */
    class C10888a extends C11033o4 {
        C10888a() {
        }

        /* renamed from: a */
        public void mo27617a() {
            C10887i7.this.m39746i();
            if (C10887i7.this.f31259c != null && !C10887i7.this.f31259c.mo28378s()) {
                C10887i7 i7Var = C10887i7.this;
                i7Var.m39731a(i7Var.f31259c.mo28370k());
            }
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.i7$b */
    class C10889b implements Handler.Callback {
        C10889b() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            C10887i7.this.m39734a(true);
            C10735b4.m39113e("Thank You Prompt was closed by timeout");
            return false;
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.i7$c */
    class C10890c extends C11033o4 {
        C10890c() {
        }

        /* renamed from: a */
        public void mo27617a() {
            C10887i7.this.m39734a(false);
            C10864h7 unused = C10887i7.this.f31257a = new C10864h7(C10884i4.m39721c().mo28484d(), C10887i7.this.f31258b, C10887i7.this.f31262f, C10887i7.this.f31266j, C10887i7.this.f31267k, C10887i7.this.f31268l);
            C10887i7.this.f31257a.setOnCancelListener(C10887i7.this);
            C10887i7.this.f31257a.mo28421a((C10864h7.C10869e) C10887i7.this);
            C10887i7.this.f31257a.mo28420a((C10864h7.C10868d) C10887i7.this);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(C10887i7.this.f31257a.getWindow().getAttributes());
            layoutParams.width = -1;
            C10887i7.this.f31257a.show();
            C10735b4.m39113e("Thank You Prompt was presented");
            boolean unused2 = C10887i7.this.f31261e = true;
            C10887i7.this.f31257a.getWindow().setAttributes(layoutParams);
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.i7$d */
    interface C10891d {
        void close();
    }

    /* renamed from: com.medallia.digital.mobilesdk.i7$e */
    interface C10892e {
        /* renamed from: a */
        void mo28497a();
    }

    private C10887i7() {
        C11164w3.m40939b().mo29111a((C11164w3.C11170f) this);
    }

    /* renamed from: e */
    protected static C10887i7 m39741e() {
        if (f31256o == null) {
            f31256o = new C10887i7();
        }
        return f31256o;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m39746i() {
        try {
            ((Activity) C10884i4.m39721c().mo28484d().getBaseContext()).runOnUiThread(new C10890c());
            ArrayList<C10892e> arrayList = this.f31265i;
            if (arrayList != null) {
                Iterator<C10892e> it = arrayList.iterator();
                while (it.hasNext()) {
                    C10892e next = it.next();
                    if (next != null) {
                        next.mo28497a();
                    }
                }
            }
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    public void close() {
        this.f31263g = true;
        this.f31260d.removeMessages(1);
        m39734a(true);
    }

    /* renamed from: f */
    public C10864h7 mo28491f() {
        return this.f31257a;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C10735b4.m39113e("Thank You Prompt was closed by tapping outside the view");
        this.f31263g = true;
        this.f31260d.removeMessages(1);
        m39734a(true);
    }

    /* renamed from: c */
    private boolean m39739c() {
        C10864h7 h7Var = this.f31257a;
        if (h7Var == null || !h7Var.isShowing()) {
            return false;
        }
        this.f31257a.dismiss();
        C10735b4.m39113e("Dismiss ThankYouPrompt Dialog");
        this.f31261e = false;
        this.f31257a = null;
        return true;
    }

    /* renamed from: a */
    public void mo28341a() {
    }

    /* renamed from: b */
    public void mo28344b() {
        try {
            C10864h7 h7Var = this.f31257a;
            if (h7Var != null && h7Var.isShowing() && this.f31261e) {
                mo28492g();
                C10735b4.m39113e("Redisplay ThankYouPrompt Dialog");
            }
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo28490d() {
        if (!m39739c()) {
            return false;
        }
        AnalyticsBridge.getInstance().reportCloseEngagementEvent(MDEngagementType.form.toString(), C10774d3.THANK_YOU_PROMPT.toString(), this.f31258b.getFormId());
        C10735b4.m39113e("Thank You Prompt Closed successfully");
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo28492g() {
        C10735b4.m39113e("Thank You Prompt will present = re display");
        m39746i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo28493h() {
        if (this.f31257a != null) {
            m39734a(false);
            C10735b4.m39113e("Dismiss dialog after refresh session");
            this.f31260d.removeMessages(1);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m39731a(long j) {
        Handler handler = new Handler(new C10889b());
        this.f31260d = handler;
        handler.sendEmptyMessageDelayed(1, j * 1000);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28486a(C10891d dVar) {
        this.f31264h.add(dVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo28489b(String str) {
        C11013n2 c = C11138v2.m40821f().mo29070c(str);
        this.f31258b = c;
        mo28488a(c, false, (C10984l5) null, (C10984l5) null, (MDAppearanceMode) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28487a(C10892e eVar) {
        this.f31265i.add(eVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo28488a(C11013n2 n2Var, boolean z, C10984l5 l5Var, C10984l5 l5Var2, MDAppearanceMode mDAppearanceMode) {
        MDAppearanceMode mDAppearanceMode2;
        MDAppearanceMode mDAppearanceMode3;
        if (n2Var != null) {
            String formId = n2Var.getFormId();
            this.f31262f = z;
            this.f31266j = l5Var;
            this.f31258b = n2Var;
            this.f31267k = l5Var2;
            this.f31268l = mDAppearanceMode;
            C10841g7 i = n2Var.mo28819i();
            this.f31259c = i;
            if (i != null && i.mo28377r()) {
                C10735b4.m39113e("Thank You Prompt will presented");
                this.f31260d.postDelayed(new C10888a(), f31254m);
                if (!z) {
                    boolean isDarkModeEnabled = n2Var.isDarkModeEnabled();
                    Broadcasts.C10688d.C10689a aVar = Broadcasts.C10688d.C10689a.formThankYouPrompt;
                    FormTriggerType formType = n2Var.getFormType();
                    FormViewType formViewType = n2Var.getFormViewType();
                    boolean p = this.f31259c.mo28375p();
                    boolean q = this.f31259c.mo28376q();
                    if (isDarkModeEnabled) {
                        mDAppearanceMode3 = C10986l7.m40219c().mo28706b();
                        mDAppearanceMode2 = C10986l7.m40219c().mo28703a();
                    } else {
                        mDAppearanceMode3 = MDAppearanceMode.unknown;
                        mDAppearanceMode2 = MDAppearanceMode.light;
                    }
                    Broadcasts.C10688d.m38943a(aVar, formId, formType, formViewType, p, q, mDAppearanceMode3, mDAppearanceMode2);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m39734a(boolean z) {
        ArrayList<C10891d> arrayList;
        m39739c();
        if (z && (arrayList = this.f31264h) != null) {
            Iterator<C10891d> it = arrayList.iterator();
            while (it.hasNext()) {
                C10891d next = it.next();
                if (next != null) {
                    next.close();
                }
            }
        }
        if (this.f31263g && !this.f31262f) {
            Broadcasts.C10688d.m38941a(Broadcasts.C10688d.C10689a.formClosed, this.f31258b.getFormId(), this.f31258b.getFormType(), this.f31258b.getFormViewType(), -1, C11221y3.m41127d().mo29215b(), this.f31258b.getFormLanguage(), (MDAppearanceMode) null, (MDAppearanceMode) null);
            this.f31263g = false;
        }
    }

    /* renamed from: a */
    public boolean mo28429a(String str) {
        return C11110u2.m40742a(str, this.f31258b.mo28823k(), this.f31258b.mo28801e(), this.f31258b.getFormId(), this.f31258b.getFormType());
    }
}
