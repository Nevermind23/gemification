package androidx.appcompat.view;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* renamed from: androidx.appcompat.view.i */
public abstract class C0277i implements Window.Callback {

    /* renamed from: d */
    final Window.Callback f1465d;

    /* renamed from: androidx.appcompat.view.i$a */
    static class C0278a {
        /* renamed from: a */
        static boolean m963a(Window.Callback callback, SearchEvent searchEvent) {
            return callback.onSearchRequested(searchEvent);
        }

        /* renamed from: b */
        static ActionMode m964b(Window.Callback callback, ActionMode.Callback callback2, int i) {
            return callback.onWindowStartingActionMode(callback2, i);
        }
    }

    /* renamed from: androidx.appcompat.view.i$b */
    static class C0279b {
        /* renamed from: a */
        static void m965a(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i) {
            callback.onProvideKeyboardShortcuts(list, menu, i);
        }
    }

    /* renamed from: androidx.appcompat.view.i$c */
    static class C0280c {
        /* renamed from: a */
        static void m966a(Window.Callback callback, boolean z) {
            callback.onPointerCaptureChanged(z);
        }
    }

    public C0277i(Window.Callback callback) {
        if (callback != null) {
            this.f1465d = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    /* renamed from: a */
    public final Window.Callback mo788a() {
        return this.f1465d;
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f1465d.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f1465d.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f1465d.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f1465d.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f1465d.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f1465d.dispatchTrackballEvent(motionEvent);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.f1465d.onActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.f1465d.onActionModeStarted(actionMode);
    }

    public void onAttachedToWindow() {
        this.f1465d.onAttachedToWindow();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.f1465d.onCreatePanelMenu(i, menu);
    }

    public View onCreatePanelView(int i) {
        return this.f1465d.onCreatePanelView(i);
    }

    public void onDetachedFromWindow() {
        this.f1465d.onDetachedFromWindow();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f1465d.onMenuItemSelected(i, menuItem);
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return this.f1465d.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        this.f1465d.onPanelClosed(i, menu);
    }

    public void onPointerCaptureChanged(boolean z) {
        C0280c.m966a(this.f1465d, z);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.f1465d.onPreparePanel(i, view, menu);
    }

    public void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        C0279b.m965a(this.f1465d, list, menu, i);
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return C0278a.m963a(this.f1465d, searchEvent);
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f1465d.onWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean z) {
        this.f1465d.onWindowFocusChanged(z);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return C0278a.m964b(this.f1465d, callback, i);
    }

    public boolean onSearchRequested() {
        return this.f1465d.onSearchRequested();
    }
}
