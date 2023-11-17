package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import androidx.collection.SimpleArrayMap;
import com.salesforce.marketingcloud.C11398b;

public final class WindowInsetsControllerCompat {

    /* renamed from: a */
    private final C1054e f3709a;

    /* renamed from: androidx.core.view.WindowInsetsControllerCompat$a */
    private static class C1050a extends C1054e {

        /* renamed from: a */
        protected final Window f3710a;

        /* renamed from: b */
        private final View f3711b;

        C1050a(Window window, View view) {
            this.f3710a = window;
            this.f3711b = view;
        }

        /* renamed from: h */
        private void m3919h(int i) {
            if (i == 1) {
                mo3548j(4);
            } else if (i == 2) {
                mo3548j(2);
            } else if (i == 8) {
                ((InputMethodManager) this.f3710a.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f3710a.getDecorView().getWindowToken(), 0);
            }
        }

        /* renamed from: l */
        private void m3921l(int i) {
            if (i == 1) {
                mo3550m(4);
                mo3551n(C11398b.f33141t);
            } else if (i == 2) {
                mo3550m(2);
            } else if (i == 8) {
                View view = this.f3711b;
                if (view.isInEditMode() || view.onCheckIsTextEditor()) {
                    view.requestFocus();
                } else {
                    view = this.f3710a.getCurrentFocus();
                }
                if (view == null) {
                    view = this.f3710a.findViewById(16908290);
                }
                if (view != null && view.hasWindowFocus()) {
                    view.post(new C1215o4(view));
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3545a(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    m3919h(i2);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo3546e(int i) {
            if (i == 0) {
                mo3550m(6144);
            } else if (i == 1) {
                mo3550m(C11398b.f33143v);
                mo3548j(C11398b.f33142u);
            } else if (i == 2) {
                mo3550m(C11398b.f33142u);
                mo3548j(C11398b.f33143v);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo3547f(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    m3921l(i2);
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: j */
        public void mo3548j(int i) {
            View decorView = this.f3710a.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        /* access modifiers changed from: protected */
        /* renamed from: k */
        public void mo3549k(int i) {
            this.f3710a.addFlags(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public void mo3550m(int i) {
            View decorView = this.f3710a.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public void mo3551n(int i) {
            this.f3710a.clearFlags(i);
        }
    }

    /* renamed from: androidx.core.view.WindowInsetsControllerCompat$b */
    private static class C1051b extends C1050a {
        C1051b(Window window, View view) {
            super(window, view);
        }

        /* renamed from: b */
        public boolean mo3552b() {
            return (this.f3710a.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        /* renamed from: d */
        public void mo3553d(boolean z) {
            if (z) {
                mo3551n(67108864);
                mo3549k(Integer.MIN_VALUE);
                mo3548j(8192);
                return;
            }
            mo3550m(8192);
        }
    }

    /* renamed from: androidx.core.view.WindowInsetsControllerCompat$c */
    private static class C1052c extends C1051b {
        C1052c(Window window, View view) {
            super(window, view);
        }

        /* renamed from: c */
        public void mo3554c(boolean z) {
            if (z) {
                mo3551n(134217728);
                mo3549k(Integer.MIN_VALUE);
                mo3548j(16);
                return;
            }
            mo3550m(16);
        }
    }

    /* renamed from: androidx.core.view.WindowInsetsControllerCompat$e */
    private static class C1054e {
        C1054e() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo3545a(int i);

        /* renamed from: b */
        public abstract boolean mo3552b();

        /* renamed from: c */
        public void mo3554c(boolean z) {
        }

        /* renamed from: d */
        public abstract void mo3553d(boolean z);

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public abstract void mo3546e(int i);

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public abstract void mo3547f(int i);
    }

    public WindowInsetsControllerCompat(Window window, View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f3709a = new C1053d(window, this);
        } else if (i >= 26) {
            this.f3709a = new C1052c(window, view);
        } else {
            this.f3709a = new C1051b(window, view);
        }
    }

    /* renamed from: a */
    public void mo3539a(int i) {
        this.f3709a.mo3545a(i);
    }

    /* renamed from: b */
    public boolean mo3540b() {
        return this.f3709a.mo3552b();
    }

    /* renamed from: c */
    public void mo3541c(boolean z) {
        this.f3709a.mo3554c(z);
    }

    /* renamed from: d */
    public void mo3542d(boolean z) {
        this.f3709a.mo3553d(z);
    }

    /* renamed from: e */
    public void mo3543e(int i) {
        this.f3709a.mo3546e(i);
    }

    /* renamed from: f */
    public void mo3544f(int i) {
        this.f3709a.mo3547f(i);
    }

    /* renamed from: androidx.core.view.WindowInsetsControllerCompat$d */
    private static class C1053d extends C1054e {

        /* renamed from: a */
        final WindowInsetsControllerCompat f3712a;

        /* renamed from: b */
        final WindowInsetsController f3713b;

        /* renamed from: c */
        private final SimpleArrayMap f3714c;

        /* renamed from: d */
        protected Window f3715d;

        C1053d(Window window, WindowInsetsControllerCompat windowInsetsControllerCompat) {
            this(window.getInsetsController(), windowInsetsControllerCompat);
            this.f3715d = window;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3545a(int i) {
            this.f3713b.hide(i);
        }

        /* renamed from: b */
        public boolean mo3552b() {
            return (C1221p4.m4305a(this.f3713b) & 8) != 0;
        }

        /* renamed from: c */
        public void mo3554c(boolean z) {
            if (z) {
                if (this.f3715d != null) {
                    mo3555g(16);
                }
                this.f3713b.setSystemBarsAppearance(16, 16);
                return;
            }
            if (this.f3715d != null) {
                mo3556h(16);
            }
            this.f3713b.setSystemBarsAppearance(0, 16);
        }

        /* renamed from: d */
        public void mo3553d(boolean z) {
            if (z) {
                if (this.f3715d != null) {
                    mo3555g(8192);
                }
                this.f3713b.setSystemBarsAppearance(8, 8);
                return;
            }
            if (this.f3715d != null) {
                mo3556h(8192);
            }
            this.f3713b.setSystemBarsAppearance(0, 8);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo3546e(int i) {
            this.f3713b.setSystemBarsBehavior(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo3547f(int i) {
            Window window = this.f3715d;
            if (!(window == null || (i & 8) == 0 || Build.VERSION.SDK_INT >= 33)) {
                ((InputMethodManager) window.getContext().getSystemService("input_method")).isActive();
            }
            this.f3713b.show(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public void mo3555g(int i) {
            View decorView = this.f3715d.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public void mo3556h(int i) {
            View decorView = this.f3715d.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        C1053d(WindowInsetsController windowInsetsController, WindowInsetsControllerCompat windowInsetsControllerCompat) {
            this.f3714c = new SimpleArrayMap();
            this.f3713b = windowInsetsController;
            this.f3712a = windowInsetsControllerCompat;
        }
    }
}
