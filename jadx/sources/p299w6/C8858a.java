package p299w6;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.C3846a;
import java.util.LinkedList;
import p182n6.C7285s;

/* renamed from: w6.a */
public abstract class C8858a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C8861c f24828a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Bundle f24829b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public LinkedList f24830c;

    /* renamed from: d */
    private final C8863e f24831d = new C8864f(this);

    /* renamed from: o */
    public static void m32953o(FrameLayout frameLayout) {
        C3846a q = C3846a.m14468q();
        Context context = frameLayout.getContext();
        int i = q.mo11872i(context);
        String d = C7285s.m27931d(context, i);
        String c = C7285s.m27930c(context, i);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(d);
        linearLayout.addView(textView);
        Intent d2 = q.mo11869d(context, i, (String) null);
        if (d2 != null) {
            Button button = new Button(context);
            button.setId(16908313);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(c);
            linearLayout.addView(button);
            button.setOnClickListener(new C8868j(context, d2));
        }
    }

    /* renamed from: t */
    private final void m32958t(int i) {
        while (!this.f24830c.isEmpty() && ((C8871m) this.f24830c.getLast()).mo24293a() >= i) {
            this.f24830c.removeLast();
        }
    }

    /* renamed from: u */
    private final void m32959u(Bundle bundle, C8871m mVar) {
        C8861c cVar = this.f24828a;
        if (cVar != null) {
            mVar.mo24294b(cVar);
            return;
        }
        if (this.f24830c == null) {
            this.f24830c = new LinkedList();
        }
        this.f24830c.add(mVar);
        if (bundle != null) {
            Bundle bundle2 = this.f24829b;
            if (bundle2 == null) {
                this.f24829b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        mo14081a(this.f24831d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo14081a(C8863e eVar);

    /* renamed from: b */
    public C8861c mo24279b() {
        return this.f24828a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo24280c(FrameLayout frameLayout) {
        m32953o(frameLayout);
    }

    /* renamed from: d */
    public void mo24281d(Bundle bundle) {
        m32959u(bundle, new C8866h(this, bundle));
    }

    /* renamed from: e */
    public View mo24282e(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        m32959u(bundle, new C8867i(this, frameLayout, layoutInflater, viewGroup, bundle));
        if (this.f24828a == null) {
            mo24280c(frameLayout);
        }
        return frameLayout;
    }

    /* renamed from: f */
    public void mo24283f() {
        C8861c cVar = this.f24828a;
        if (cVar != null) {
            cVar.onDestroy();
        } else {
            m32958t(1);
        }
    }

    /* renamed from: g */
    public void mo24284g() {
        C8861c cVar = this.f24828a;
        if (cVar != null) {
            cVar.mo14074i();
        } else {
            m32958t(2);
        }
    }

    /* renamed from: h */
    public void mo24285h(Activity activity, Bundle bundle, Bundle bundle2) {
        m32959u(bundle2, new C8865g(this, activity, bundle, bundle2));
    }

    /* renamed from: i */
    public void mo24286i() {
        C8861c cVar = this.f24828a;
        if (cVar != null) {
            cVar.onLowMemory();
        }
    }

    /* renamed from: j */
    public void mo24287j() {
        C8861c cVar = this.f24828a;
        if (cVar != null) {
            cVar.mo14069N();
        } else {
            m32958t(5);
        }
    }

    /* renamed from: k */
    public void mo24288k() {
        m32959u((Bundle) null, new C8870l(this));
    }

    /* renamed from: l */
    public void mo24289l(Bundle bundle) {
        C8861c cVar = this.f24828a;
        if (cVar != null) {
            cVar.mo14080p(bundle);
            return;
        }
        Bundle bundle2 = this.f24829b;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    /* renamed from: m */
    public void mo24290m() {
        m32959u((Bundle) null, new C8869k(this));
    }

    /* renamed from: n */
    public void mo24291n() {
        C8861c cVar = this.f24828a;
        if (cVar != null) {
            cVar.mo14073f();
        } else {
            m32958t(4);
        }
    }
}
