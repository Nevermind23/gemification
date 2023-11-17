package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.github.mikephil.charting.utils.Utils;
import java.lang.ref.WeakReference;
import p184n8.C7344d;
import p184n8.C7348f;

/* renamed from: com.google.android.material.internal.i */
public class C5082i {

    /* renamed from: a */
    private final TextPaint f16245a = new TextPaint(1);

    /* renamed from: b */
    private final C7348f f16246b = new C5083a();

    /* renamed from: c */
    private float f16247c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f16248d = true;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public WeakReference f16249e = new WeakReference((Object) null);

    /* renamed from: f */
    private C7344d f16250f;

    /* renamed from: com.google.android.material.internal.i$a */
    class C5083a extends C7348f {
        C5083a() {
        }

        /* renamed from: a */
        public void mo16009a(int i) {
            boolean unused = C5082i.this.f16248d = true;
            C5084b bVar = (C5084b) C5082i.this.f16249e.get();
            if (bVar != null) {
                bVar.mo15515a();
            }
        }

        /* renamed from: b */
        public void mo16010b(Typeface typeface, boolean z) {
            if (!z) {
                boolean unused = C5082i.this.f16248d = true;
                C5084b bVar = (C5084b) C5082i.this.f16249e.get();
                if (bVar != null) {
                    bVar.mo15515a();
                }
            }
        }
    }

    /* renamed from: com.google.android.material.internal.i$b */
    public interface C5084b {
        /* renamed from: a */
        void mo15515a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public C5082i(C5084b bVar) {
        mo16521g(bVar);
    }

    /* renamed from: c */
    private float m19875c(CharSequence charSequence) {
        return charSequence == null ? Utils.FLOAT_EPSILON : this.f16245a.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: d */
    public C7344d mo16518d() {
        return this.f16250f;
    }

    /* renamed from: e */
    public TextPaint mo16519e() {
        return this.f16245a;
    }

    /* renamed from: f */
    public float mo16520f(String str) {
        if (!this.f16248d) {
            return this.f16247c;
        }
        float c = m19875c(str);
        this.f16247c = c;
        this.f16248d = false;
        return c;
    }

    /* renamed from: g */
    public void mo16521g(C5084b bVar) {
        this.f16249e = new WeakReference(bVar);
    }

    /* renamed from: h */
    public void mo16522h(C7344d dVar, Context context) {
        if (this.f16250f != dVar) {
            this.f16250f = dVar;
            if (dVar != null) {
                dVar.mo21725o(context, this.f16245a, this.f16246b);
                C5084b bVar = (C5084b) this.f16249e.get();
                if (bVar != null) {
                    this.f16245a.drawableState = bVar.getState();
                }
                dVar.mo21724n(context, this.f16245a, this.f16246b);
                this.f16248d = true;
            }
            C5084b bVar2 = (C5084b) this.f16249e.get();
            if (bVar2 != null) {
                bVar2.mo15515a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    /* renamed from: i */
    public void mo16523i(boolean z) {
        this.f16248d = z;
    }

    /* renamed from: j */
    public void mo16524j(Context context) {
        this.f16250f.mo21724n(context, this.f16245a, this.f16246b);
    }
}
