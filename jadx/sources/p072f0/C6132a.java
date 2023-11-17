package p072f0;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.core.util.C1008h;

/* renamed from: f0.a */
public final class C6132a {

    /* renamed from: a */
    private final C6134b f19085a;

    /* renamed from: b */
    private int f19086b = Integer.MAX_VALUE;

    /* renamed from: c */
    private int f19087c = 0;

    /* renamed from: f0.a$a */
    private static class C6133a extends C6134b {

        /* renamed from: a */
        private final EditText f19088a;

        /* renamed from: b */
        private final C6146g f19089b;

        C6133a(EditText editText, boolean z) {
            this.f19088a = editText;
            C6146g gVar = new C6146g(editText, z);
            this.f19089b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(C6135b.getInstance());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public KeyListener mo19693a(KeyListener keyListener) {
            if (keyListener instanceof C6140e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            if (keyListener instanceof NumberKeyListener) {
                return keyListener;
            }
            return new C6140e(keyListener);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo19694b() {
            return this.f19089b.mo19722b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public InputConnection mo19695c(InputConnection inputConnection, EditorInfo editorInfo) {
            if (inputConnection instanceof C6136c) {
                return inputConnection;
            }
            return new C6136c(this.f19088a, inputConnection, editorInfo);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo19696d(boolean z) {
            this.f19089b.mo19724d(z);
        }
    }

    /* renamed from: f0.a$b */
    static class C6134b {
        C6134b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract KeyListener mo19693a(KeyListener keyListener);

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract boolean mo19694b();

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract InputConnection mo19695c(InputConnection inputConnection, EditorInfo editorInfo);

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract void mo19696d(boolean z);
    }

    public C6132a(EditText editText, boolean z) {
        C1008h.m3531h(editText, "editText cannot be null");
        this.f19085a = new C6133a(editText, z);
    }

    /* renamed from: a */
    public KeyListener mo19689a(KeyListener keyListener) {
        return this.f19085a.mo19693a(keyListener);
    }

    /* renamed from: b */
    public boolean mo19690b() {
        return this.f19085a.mo19694b();
    }

    /* renamed from: c */
    public InputConnection mo19691c(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f19085a.mo19695c(inputConnection, editorInfo);
    }

    /* renamed from: d */
    public void mo19692d(boolean z) {
        this.f19085a.mo19696d(z);
    }
}
