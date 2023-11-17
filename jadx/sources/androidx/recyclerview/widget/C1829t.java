package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.C1055a;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: androidx.recyclerview.widget.t */
public class C1829t extends C1055a {

    /* renamed from: a */
    final RecyclerView f5490a;

    /* renamed from: b */
    private final C1830a f5491b;

    /* renamed from: androidx.recyclerview.widget.t$a */
    public static class C1830a extends C1055a {

        /* renamed from: a */
        final C1829t f5492a;

        /* renamed from: b */
        private Map f5493b = new WeakHashMap();

        public C1830a(C1829t tVar) {
            this.f5492a = tVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C1055a mo6054c(View view) {
            return (C1055a) this.f5493b.remove(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo6055d(View view) {
            C1055a l = ViewCompat.m3606l(view);
            if (l != null && l != this) {
                this.f5493b.put(view, l);
            }
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            C1055a aVar = (C1055a) this.f5493b.get(view);
            if (aVar != null) {
                return aVar.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            }
            return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view) {
            C1055a aVar = (C1055a) this.f5493b.get(view);
            if (aVar != null) {
                return aVar.getAccessibilityNodeProvider(view);
            }
            return super.getAccessibilityNodeProvider(view);
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            C1055a aVar = (C1055a) this.f5493b.get(view);
            if (aVar != null) {
                aVar.onInitializeAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            }
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (this.f5492a.mo6053d() || this.f5492a.f5490a.getLayoutManager() == null) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                return;
            }
            this.f5492a.f5490a.getLayoutManager().mo5667Z0(view, accessibilityNodeInfoCompat);
            C1055a aVar = (C1055a) this.f5493b.get(view);
            if (aVar != null) {
                aVar.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            } else {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            C1055a aVar = (C1055a) this.f5493b.get(view);
            if (aVar != null) {
                aVar.onPopulateAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C1055a aVar = (C1055a) this.f5493b.get(viewGroup);
            if (aVar != null) {
                return aVar.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (this.f5492a.mo6053d() || this.f5492a.f5490a.getLayoutManager() == null) {
                return super.performAccessibilityAction(view, i, bundle);
            }
            C1055a aVar = (C1055a) this.f5493b.get(view);
            if (aVar != null) {
                if (aVar.performAccessibilityAction(view, i, bundle)) {
                    return true;
                }
            } else if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            return this.f5492a.f5490a.getLayoutManager().mo5708t1(view, i, bundle);
        }

        public void sendAccessibilityEvent(View view, int i) {
            C1055a aVar = (C1055a) this.f5493b.get(view);
            if (aVar != null) {
                aVar.sendAccessibilityEvent(view, i);
            } else {
                super.sendAccessibilityEvent(view, i);
            }
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            C1055a aVar = (C1055a) this.f5493b.get(view);
            if (aVar != null) {
                aVar.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            } else {
                super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            }
        }
    }

    public C1829t(RecyclerView recyclerView) {
        this.f5490a = recyclerView;
        C1055a c = mo6052c();
        if (c == null || !(c instanceof C1830a)) {
            this.f5491b = new C1830a(this);
        } else {
            this.f5491b = (C1830a) c;
        }
    }

    /* renamed from: c */
    public C1055a mo6052c() {
        return this.f5491b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo6053d() {
        return this.f5490a.mo5424x0();
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !mo6053d()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().mo5207V0(accessibilityEvent);
            }
        }
    }

    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        if (!mo6053d() && this.f5490a.getLayoutManager() != null) {
            this.f5490a.getLayoutManager().mo5663X0(accessibilityNodeInfoCompat);
        }
    }

    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        if (mo6053d() || this.f5490a.getLayoutManager() == null) {
            return false;
        }
        return this.f5490a.getLayoutManager().mo5703r1(i, bundle);
    }
}
