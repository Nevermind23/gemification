package androidx.appcompat.app;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0151g;
import androidx.appcompat.view.C0264b;
import androidx.core.view.C1272y;
import p030c.C2210a;

/* renamed from: androidx.appcompat.app.u */
public class C0253u extends C0151g implements C0227e {

    /* renamed from: f */
    private C0238h f1373f;

    /* renamed from: g */
    private final C1272y.C1273a f1374g = new C0252t(this);

    public C0253u(Context context, int i) {
        super(context, m844f(context, i));
        C0238h e = mo704e();
        e.mo454R(m844f(context, i));
        e.mo431A((Bundle) null);
    }

    /* renamed from: f */
    private static int m844f(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C2210a.f6468x, typedValue, true);
        return typedValue.resourceId;
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo704e().mo467e(view, layoutParams);
    }

    public void dismiss() {
        super.dismiss();
        mo704e().mo432B();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C1272y.m4417e(this.f1374g, getWindow().getDecorView(), this, keyEvent);
    }

    /* renamed from: e */
    public C0238h mo704e() {
        if (this.f1373f == null) {
            this.f1373f = C0238h.m795k(this, this);
        }
        return this.f1373f;
    }

    public View findViewById(int i) {
        return mo704e().mo477l(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo706g(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* renamed from: h */
    public boolean mo707h(int i) {
        return mo704e().mo442J(i);
    }

    public void invalidateOptionsMenu() {
        mo704e().mo491w();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        mo704e().mo489v();
        super.onCreate(bundle);
        mo704e().mo431A(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        mo704e().mo439G();
    }

    public void onSupportActionModeFinished(C0264b bVar) {
    }

    public void onSupportActionModeStarted(C0264b bVar) {
    }

    public C0264b onWindowStartingSupportActionMode(C0264b.C0265a aVar) {
        return null;
    }

    public void setContentView(int i) {
        mo704e().mo445L(i);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        mo704e().mo455S(charSequence);
    }

    public void setContentView(View view) {
        mo704e().mo446M(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo704e().mo448N(view, layoutParams);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        mo704e().mo455S(getContext().getString(i));
    }
}
