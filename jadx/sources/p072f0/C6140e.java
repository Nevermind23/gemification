package p072f0;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.text.C1378e;

/* renamed from: f0.e */
final class C6140e implements KeyListener {

    /* renamed from: a */
    private final KeyListener f19099a;

    /* renamed from: b */
    private final C6141a f19100b;

    /* renamed from: f0.e$a */
    public static class C6141a {
        /* renamed from: a */
        public boolean mo19708a(Editable editable, int i, KeyEvent keyEvent) {
            return C1378e.m4732f(editable, i, keyEvent);
        }
    }

    C6140e(KeyListener keyListener) {
        this(keyListener, new C6141a());
    }

    public void clearMetaKeyState(View view, Editable editable, int i) {
        this.f19099a.clearMetaKeyState(view, editable, i);
    }

    public int getInputType() {
        return this.f19099a.getInputType();
    }

    public boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        if (this.f19100b.mo19708a(editable, i, keyEvent) || this.f19099a.onKeyDown(view, editable, i, keyEvent)) {
            return true;
        }
        return false;
    }

    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f19099a.onKeyOther(view, editable, keyEvent);
    }

    public boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f19099a.onKeyUp(view, editable, i, keyEvent);
    }

    C6140e(KeyListener keyListener, C6141a aVar) {
        this.f19099a = keyListener;
        this.f19100b = aVar;
    }
}
