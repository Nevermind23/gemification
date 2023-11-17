package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.C1593j;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1631s;
import androidx.lifecycle.C1641v0;
import kotlin.jvm.internal.C41536l;

/* renamed from: androidx.activity.g */
public class C0151g extends Dialog implements C1619q, C0162q {

    /* renamed from: d */
    private C1631s f1035d;

    /* renamed from: e */
    private final OnBackPressedDispatcher f1036e = new OnBackPressedDispatcher(new C0150f(this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0151g(Context context, int i) {
        super(context, i);
        C41536l.m120489i(context, "context");
    }

    /* renamed from: b */
    private final C1631s m405b() {
        C1631s sVar = this.f1035d;
        if (sVar != null) {
            return sVar;
        }
        C1631s sVar2 = new C1631s(this);
        this.f1035d = sVar2;
        return sVar2;
    }

    /* renamed from: c */
    private final void m406c() {
        Window window = getWindow();
        C41536l.m120486f(window);
        C1641v0.m5722a(window.getDecorView(), this);
        Window window2 = getWindow();
        C41536l.m120486f(window2);
        View decorView = window2.getDecorView();
        C41536l.m120488h(decorView, "window!!.decorView");
        C0175s.m459a(decorView, this);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final void m407d(C0151g gVar) {
        C41536l.m120489i(gVar, "this$0");
        super.onBackPressed();
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C41536l.m120489i(view, "view");
        m406c();
        super.addContentView(view, layoutParams);
    }

    public final C1593j getLifecycle() {
        return m405b();
    }

    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.f1036e;
    }

    public void onBackPressed() {
        this.f1036e.mo345g();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            this.f1036e.mo346h(getOnBackInvokedDispatcher());
        }
        m405b().mo4941i(C1593j.C1594a.ON_CREATE);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        m405b().mo4941i(C1593j.C1594a.ON_RESUME);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        m405b().mo4941i(C1593j.C1594a.ON_DESTROY);
        this.f1035d = null;
        super.onStop();
    }

    public void setContentView(int i) {
        m406c();
        super.setContentView(i);
    }

    public void setContentView(View view) {
        C41536l.m120489i(view, "view");
        m406c();
        super.setContentView(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C41536l.m120489i(view, "view");
        m406c();
        super.setContentView(view, layoutParams);
    }
}
