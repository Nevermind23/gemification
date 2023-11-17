package p072f0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.core.util.C1008h;
import androidx.emoji2.text.C1378e;

/* renamed from: f0.f */
public final class C6142f {

    /* renamed from: a */
    private final C6144b f19101a;

    /* renamed from: f0.f$a */
    private static class C6143a extends C6144b {

        /* renamed from: a */
        private final TextView f19102a;

        /* renamed from: b */
        private final C6138d f19103b;

        /* renamed from: c */
        private boolean f19104c = true;

        C6143a(TextView textView) {
            this.f19102a = textView;
            this.f19103b = new C6138d(textView);
        }

        /* renamed from: f */
        private InputFilter[] m24533f(InputFilter[] inputFilterArr) {
            for (C6138d dVar : inputFilterArr) {
                if (dVar == this.f19103b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length + 1)];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, r0);
            inputFilterArr2[r0] = this.f19103b;
            return inputFilterArr2;
        }

        /* renamed from: g */
        private SparseArray m24534g(InputFilter[] inputFilterArr) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof C6138d) {
                    sparseArray.put(i, inputFilter);
                }
            }
            return sparseArray;
        }

        /* renamed from: h */
        private InputFilter[] m24535h(InputFilter[] inputFilterArr) {
            SparseArray g = m24534g(inputFilterArr);
            if (g.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length - g.size())];
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (g.indexOfKey(i2) < 0) {
                    inputFilterArr2[i] = inputFilterArr[i2];
                    i++;
                }
            }
            return inputFilterArr2;
        }

        /* renamed from: j */
        private TransformationMethod m24536j(TransformationMethod transformationMethod) {
            if (transformationMethod instanceof C6148h) {
                return ((C6148h) transformationMethod).mo19726a();
            }
            return transformationMethod;
        }

        /* renamed from: k */
        private void m24537k() {
            this.f19102a.setFilters(mo19714a(this.f19102a.getFilters()));
        }

        /* renamed from: m */
        private TransformationMethod m24538m(TransformationMethod transformationMethod) {
            if (!(transformationMethod instanceof C6148h) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                return new C6148h(transformationMethod);
            }
            return transformationMethod;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public InputFilter[] mo19714a(InputFilter[] inputFilterArr) {
            if (!this.f19104c) {
                return m24535h(inputFilterArr);
            }
            return m24533f(inputFilterArr);
        }

        /* renamed from: b */
        public boolean mo19715b() {
            return this.f19104c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo19716c(boolean z) {
            if (z) {
                mo19720l();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo19717d(boolean z) {
            this.f19104c = z;
            mo19720l();
            m24537k();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public TransformationMethod mo19718e(TransformationMethod transformationMethod) {
            if (this.f19104c) {
                return m24538m(transformationMethod);
            }
            return m24536j(transformationMethod);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo19719i(boolean z) {
            this.f19104c = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo19720l() {
            this.f19102a.setTransformationMethod(mo19718e(this.f19102a.getTransformationMethod()));
        }
    }

    /* renamed from: f0.f$b */
    static class C6144b {
        C6144b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract InputFilter[] mo19714a(InputFilter[] inputFilterArr);

        /* renamed from: b */
        public abstract boolean mo19715b();

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract void mo19716c(boolean z);

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract void mo19717d(boolean z);

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public abstract TransformationMethod mo19718e(TransformationMethod transformationMethod);
    }

    /* renamed from: f0.f$c */
    private static class C6145c extends C6144b {

        /* renamed from: a */
        private final C6143a f19105a;

        C6145c(TextView textView) {
            this.f19105a = new C6143a(textView);
        }

        /* renamed from: f */
        private boolean m24551f() {
            return !C1378e.m4734h();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public InputFilter[] mo19714a(InputFilter[] inputFilterArr) {
            if (m24551f()) {
                return inputFilterArr;
            }
            return this.f19105a.mo19714a(inputFilterArr);
        }

        /* renamed from: b */
        public boolean mo19715b() {
            return this.f19105a.mo19715b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo19716c(boolean z) {
            if (!m24551f()) {
                this.f19105a.mo19716c(z);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo19717d(boolean z) {
            if (m24551f()) {
                this.f19105a.mo19719i(z);
            } else {
                this.f19105a.mo19717d(z);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public TransformationMethod mo19718e(TransformationMethod transformationMethod) {
            if (m24551f()) {
                return transformationMethod;
            }
            return this.f19105a.mo19718e(transformationMethod);
        }
    }

    public C6142f(TextView textView, boolean z) {
        C1008h.m3531h(textView, "textView cannot be null");
        if (!z) {
            this.f19101a = new C6145c(textView);
        } else {
            this.f19101a = new C6143a(textView);
        }
    }

    /* renamed from: a */
    public InputFilter[] mo19709a(InputFilter[] inputFilterArr) {
        return this.f19101a.mo19714a(inputFilterArr);
    }

    /* renamed from: b */
    public boolean mo19710b() {
        return this.f19101a.mo19715b();
    }

    /* renamed from: c */
    public void mo19711c(boolean z) {
        this.f19101a.mo19716c(z);
    }

    /* renamed from: d */
    public void mo19712d(boolean z) {
        this.f19101a.mo19717d(z);
    }

    /* renamed from: e */
    public TransformationMethod mo19713e(TransformationMethod transformationMethod) {
        return this.f19101a.mo19718e(transformationMethod);
    }
}
